package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecipientType extends StObject
/**
  * Specifies the type of recipient of a message or appointment.
  *
  * @remarks
  * [Api set: Mailbox 1.1]
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * **Important**: A `recipientType` property value isn't returned by the 
  * {@link https://learn.microsoft.com/javascript/api/outlook/office.from?view=outlook-js-1.7#outlook-office-from-getasync-member(1) | Office.context.mailbox.item.from.getAsync} 
  * and {@link https://learn.microsoft.com/javascript/api/outlook/office.organizer?view=outlook-js-1.7#outlook-office-organizer-getasync-member(1) | Office.context.mailbox.item.organizer.getAsync} methods.
  * The email sender or appointment organizer is always a user whose email address is on the Exchange server.
  */
@JSGlobal("Office.MailboxEnums.RecipientType")
@js.native
object RecipientType extends StObject {
  
  /**
    * Specifies the recipient is a distribution list containing a list of email addresses.
    */
  @js.native
  sealed trait DistributionList
    extends StObject
       with RecipientType
  
  /**
    * Specifies the recipient is an SMTP email address that isn't on the Exchange server.
    */
  @js.native
  sealed trait ExternalUser
    extends StObject
       with RecipientType
  
  /**
    * Specifies the recipient isn't one of the other recipient types. It also refers to a recipient that isn't resolved against the Exchange address book,
    * and is therefore treated as an external SMTP address.
    */
  @js.native
  sealed trait Other
    extends StObject
       with RecipientType
  
  /**
    * Specifies the recipient is an SMTP email address on the Exchange server.
    */
  @js.native
  sealed trait User
    extends StObject
       with RecipientType
}
