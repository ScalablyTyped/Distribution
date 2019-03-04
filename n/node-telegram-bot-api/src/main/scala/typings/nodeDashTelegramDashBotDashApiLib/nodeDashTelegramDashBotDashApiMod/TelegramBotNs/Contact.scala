package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var first_name: java.lang.String
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  var phone_number: java.lang.String
  var user_id: js.UndefOr[scala.Double] = js.undefined
}

object Contact {
  @scala.inline
  def apply(
    first_name: java.lang.String,
    phone_number: java.lang.String,
    last_name: java.lang.String = null,
    user_id: scala.Int | scala.Double = null
  ): Contact = {
    val __obj = js.Dynamic.literal(first_name = first_name, phone_number = phone_number)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

