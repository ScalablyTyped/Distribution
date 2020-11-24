package typings.officeJs.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecipientType extends js.Object
/**
  * Specifies the type of recipient for an appointment.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RecipientType")
@js.native
object RecipientType extends js.Object {
  
  /**
    * Specifies that the recipient is a distribution list containing a list of email addresses.
    */
  @js.native
  sealed trait DistributionList extends RecipientType
  
  /**
    * Specifies that the recipient is an SMTP email address that is not on the Exchange server.
    */
  @js.native
  sealed trait ExternalUser extends RecipientType
  
  /**
    * Specifies that the recipient is not one of the other recipient types.
    */
  @js.native
  sealed trait Other extends RecipientType
  
  /**
    * Specifies that the recipient is an SMTP email address that is on the Exchange server.
    */
  @js.native
  sealed trait User extends RecipientType
}
