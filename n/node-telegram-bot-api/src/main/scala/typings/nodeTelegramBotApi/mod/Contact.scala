package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var first_name: String
  var last_name: js.UndefOr[String] = js.undefined
  var phone_number: String
  var user_id: js.UndefOr[Double] = js.undefined
  var vcard: js.UndefOr[String] = js.undefined
}

object Contact {
  @scala.inline
  def apply(
    first_name: String,
    phone_number: String,
    last_name: String = null,
    user_id: Int | Double = null,
    vcard: String = null
  ): Contact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (vcard != null) __obj.updateDynamic("vcard")(vcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

