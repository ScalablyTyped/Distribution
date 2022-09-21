package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a phone number identified in an item. Read mode only.
  *
  * An array of `PhoneNumber` objects containing the phone numbers found in an email message is returned in the `phoneNumbers` property of the
  * `Entities` object that is returned when you call the `getEntities` method on the selected item.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
trait PhoneNumber extends StObject {
  
  /**
    * Gets the text that was identified in an item as a phone number.
    */
  var originalPhoneString: String
  
  /**
    * Gets a string containing a phone number. This string contains only the digits of the telephone number and excludes characters
    * like parentheses and hyphens, if they exist in the original item.
    */
  var phoneString: String
  
  /**
    * Gets a string that identifies the type of phone number: Home, Work, Mobile, Unspecified.
    */
  var `type`: String
}
object PhoneNumber {
  
  inline def apply(originalPhoneString: String, phoneString: String, `type`: String): PhoneNumber = {
    val __obj = js.Dynamic.literal(originalPhoneString = originalPhoneString.asInstanceOf[js.Any], phoneString = phoneString.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumber]
  }
  
  extension [Self <: PhoneNumber](x: Self) {
    
    inline def setOriginalPhoneString(value: String): Self = StObject.set(x, "originalPhoneString", value.asInstanceOf[js.Any])
    
    inline def setPhoneString(value: String): Self = StObject.set(x, "phoneString", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
