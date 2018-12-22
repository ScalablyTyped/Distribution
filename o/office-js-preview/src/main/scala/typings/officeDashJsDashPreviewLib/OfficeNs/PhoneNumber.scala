package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a phone number identified in an item. Read mode only.
     *
     * An array of PhoneNumber objects containing the phone numbers found in an email message is returned in the phoneNumbers property of the 
     * Entities object that is returned when you call the getEntities method on the selected item.
     *
     * [Api set: Mailbox 1.0]
     *
     * @remarks
     * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
     *
     * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr></table>
     */

trait PhoneNumber extends js.Object {
  /**
           * Gets the text that was identified in an item as a phone number.
           */
  var originalPhoneString: java.lang.String
  /**
           * Gets a string containing a phone number. This string contains only the digits of the telephone number and excludes characters like parentheses and hyphens, if they exist in the original item.
           */
  var phoneString: java.lang.String
  /**
           * Gets a string that identifies the type of phone number: Home, Work, Mobile, Unspecified.
           */
  var `type`: java.lang.String
}

