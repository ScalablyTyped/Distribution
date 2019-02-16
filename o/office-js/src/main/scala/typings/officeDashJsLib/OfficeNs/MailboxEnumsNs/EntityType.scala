package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EntityType extends js.Object

/**
  * Specifies an entity's type.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
  */
@JSGlobal("Office.MailboxEnums.EntityType")
@js.native
object EntityType extends js.Object {
  /**
    * Specifies that the entity is a postal address.
    */
  @js.native
  sealed trait Address
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType
  
  /**
    * Specifies that the entity is a contact.
    */
  @js.native
  sealed trait Contact
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType
  
  /**
    * Specifies that the entity is an SMTP email address.
    */
  @js.native
  sealed trait EmailAddress
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType
  
  /**
    * Specifies that the entity is a meeting suggestion.
    */
  @js.native
  sealed trait MeetingSuggestion
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType
  
  /**
    * Specifies that the entity is a US phone number.
    */
  @js.native
  sealed trait PhoneNumber
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType
  
  /**
    * Specifies that the entity is a task suggestion.
    */
  @js.native
  sealed trait TaskSuggestion
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType
  
  /**
    * Specifies that the entity is an Internet URL.
    */
  @js.native
  sealed trait Url
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType
  
  /* "address" */ val Address: Address with java.lang.String = js.native
  /* "contact" */ val Contact: Contact with java.lang.String = js.native
  /* "emailAddress" */ val EmailAddress: EmailAddress with java.lang.String = js.native
  /* "meetingSuggestion" */ val MeetingSuggestion: MeetingSuggestion with java.lang.String = js.native
  /* "phoneNumber" */ val PhoneNumber: PhoneNumber with java.lang.String = js.native
  /* "taskSuggestion" */ val TaskSuggestion: TaskSuggestion with java.lang.String = js.native
  /* "url" */ val Url: Url with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.EntityType with java.lang.String] = js.native
}

