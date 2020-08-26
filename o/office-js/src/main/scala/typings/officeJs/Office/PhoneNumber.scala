package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a phone number identified in an item. Read mode only.
  *
  * An array of `PhoneNumber` objects containing the phone numbers found in an email message is returned in the `phoneNumbers` property of the
  * `Entities` object that is returned when you call the `getEntities` method on the selected item.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait PhoneNumber extends js.Object {
  /**
    * Gets the text that was identified in an item as a phone number.
    */
  var originalPhoneString: String = js.native
  /**
    * Gets a string containing a phone number. This string contains only the digits of the telephone number and excludes characters
    * like parentheses and hyphens, if they exist in the original item.
    */
  var phoneString: String = js.native
  /**
    * Gets a string that identifies the type of phone number: Home, Work, Mobile, Unspecified.
    */
  var `type`: String = js.native
}

object PhoneNumber {
  @scala.inline
  def apply(originalPhoneString: String, phoneString: String, `type`: String): PhoneNumber = {
    val __obj = js.Dynamic.literal(originalPhoneString = originalPhoneString.asInstanceOf[js.Any], phoneString = phoneString.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  @scala.inline
  implicit class PhoneNumberOps[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginalPhoneString(value: String): Self = this.set("originalPhoneString", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneString(value: String): Self = this.set("phoneString", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

