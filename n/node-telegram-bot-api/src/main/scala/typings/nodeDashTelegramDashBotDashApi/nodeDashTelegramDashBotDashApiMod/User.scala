package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var first_name: String
  var id: Double
  var is_bot: Boolean
  var language_code: js.UndefOr[String] = js.undefined
  var last_name: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    first_name: String,
    id: Double,
    is_bot: Boolean,
    language_code: String = null,
    last_name: String = null,
    username: String = null
  ): User = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_bot = is_bot.asInstanceOf[js.Any])
    if (language_code != null) __obj.updateDynamic("language_code")(language_code.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

