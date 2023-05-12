package typings.officeJsPreview.Office.MailboxEnums

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
  * {@link https://learn.microsoft.com/javascript/api/outlook/office.from?view=outlook-js-preview#outlook-office-from-getasync-member(1) | Office.context.mailbox.item.from.getAsync} 
  * and {@link https://learn.microsoft.com/javascript/api/outlook/office.organizer?view=outlook-js-preview#outlook-office-organizer-getasync-member(1) | Office.context.mailbox.item.organizer.getAsync} methods.
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
    * Specifies the recipient is an SMTP email address that isn't on the Exchange server. It also refers to a recipient added from a personal Outlook address book.
    * 
    * **Important**: In Outlook on Windows (starting with Version 2210 (Build 15813.20002)), on Mac, and on the web, Global Address Book (GAL) recipients saved to a personal address book return
    * the `ExternalUser` value, even if their SMTP email address appears on the Exchange server. Recipients return a `User` value only if they're directly
    * added or resolved against the GAL.
    */
  @js.native
  sealed trait ExternalUser
    extends StObject
       with RecipientType
  
  /**
    * Specifies the recipient isn't one of the other recipient types. It also refers to a recipient that isn't resolved against the Exchange address book,
    * and is therefore treated as an external SMTP address.
    *
    * **Important**: In Outlook on Android and on iOS, Global Address Book (GAL) recipients saved to a personal address book return
    * the `Other` value, even if their SMTP email address appears on the Exchange server. Recipients return a `User` value only if they're directly
    * added or resolved against the GAL.
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
