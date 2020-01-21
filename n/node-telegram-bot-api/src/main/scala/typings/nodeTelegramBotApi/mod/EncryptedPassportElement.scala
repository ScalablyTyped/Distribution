package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedPassportElement extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[js.Array[PassportFile]] = js.undefined
  var front_side: js.UndefOr[PassportFile] = js.undefined
  var hash: String
  var phone_number: js.UndefOr[String] = js.undefined
  var reverse_side: js.UndefOr[PassportFile] = js.undefined
  var selfie: js.UndefOr[PassportFile] = js.undefined
  var translation: js.UndefOr[js.Array[PassportFile]] = js.undefined
  var `type`: String
}

object EncryptedPassportElement {
  @scala.inline
  def apply(
    hash: String,
    `type`: String,
    data: String = null,
    email: String = null,
    files: js.Array[PassportFile] = null,
    front_side: PassportFile = null,
    phone_number: String = null,
    reverse_side: PassportFile = null,
    selfie: PassportFile = null,
    translation: js.Array[PassportFile] = null
  ): EncryptedPassportElement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (front_side != null) __obj.updateDynamic("front_side")(front_side.asInstanceOf[js.Any])
    if (phone_number != null) __obj.updateDynamic("phone_number")(phone_number.asInstanceOf[js.Any])
    if (reverse_side != null) __obj.updateDynamic("reverse_side")(reverse_side.asInstanceOf[js.Any])
    if (selfie != null) __obj.updateDynamic("selfie")(selfie.asInstanceOf[js.Any])
    if (translation != null) __obj.updateDynamic("translation")(translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedPassportElement]
  }
}

