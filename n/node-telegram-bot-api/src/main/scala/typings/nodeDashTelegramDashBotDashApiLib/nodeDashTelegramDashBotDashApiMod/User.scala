package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var first_name: java.lang.String
  var id: scala.Double
  var is_bot: scala.Boolean
  var language_code: js.UndefOr[java.lang.String] = js.undefined
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    first_name: java.lang.String,
    id: scala.Double,
    is_bot: scala.Boolean,
    language_code: java.lang.String = null,
    last_name: java.lang.String = null,
    username: java.lang.String = null
  ): User = {
    val __obj = js.Dynamic.literal(first_name = first_name, id = id, is_bot = is_bot)
    if (language_code != null) __obj.updateDynamic("language_code")(language_code)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[User]
  }
}

