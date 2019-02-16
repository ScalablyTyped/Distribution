package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a contact stored on the server. Read mode only.
  *
  * The list of contacts associated with an email message or appointment is returned in the contacts property of the {@link Office.Entities} object 
  * that is returned by the getEntities or getEntitiesByType method of the active item.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
  * </table>
  */
trait Contact extends js.Object {
  /**
    * An array of strings containing the mailing and street addresses associated with the contact. Nullable.
    */
  var addresses: js.Array[java.lang.String]
  /**
    * A string containing the name of the business associated with the contact. Nullable.
    */
  var businessName: java.lang.String
  /**
    * An array of strings containing the SMTP email addresses associated with the contact. Nullable.
    */
  var emailAddresses: js.Array[java.lang.String]
  /**
    * A string containing the name of the person associated with the contact. Nullable.
    */
  var personName: java.lang.String
  /**
    * An array containing a PhoneNumber object for each phone number associated with the contact. Nullable.
    */
  var phoneNumbers: js.Array[PhoneNumber]
  /**
    * An array of strings containing the Internet URLs associated with the contact. Nullable.
    */
  var urls: js.Array[java.lang.String]
}

