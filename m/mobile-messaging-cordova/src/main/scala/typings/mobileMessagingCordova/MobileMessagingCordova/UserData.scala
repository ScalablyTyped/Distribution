package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  var birthday: js.UndefOr[Date] = js.undefined
  var customAttributes: js.UndefOr[Record[String, String]] = js.undefined
  var emails: js.UndefOr[js.Array[String]] = js.undefined
  var externalUserId: String
  var firstName: js.UndefOr[String] = js.undefined
  var gender: js.UndefOr[Gender] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var middleName: js.UndefOr[String] = js.undefined
  var phones: js.UndefOr[js.Array[String]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object UserData {
  @scala.inline
  def apply(
    externalUserId: String,
    birthday: Date = null,
    customAttributes: Record[String, String] = null,
    emails: js.Array[String] = null,
    firstName: String = null,
    gender: Gender = null,
    lastName: String = null,
    middleName: String = null,
    phones: js.Array[String] = null,
    tags: js.Array[String] = null
  ): UserData = {
    val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
    if (birthday != null) __obj.updateDynamic("birthday")(birthday.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    if (phones != null) __obj.updateDynamic("phones")(phones.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
}

