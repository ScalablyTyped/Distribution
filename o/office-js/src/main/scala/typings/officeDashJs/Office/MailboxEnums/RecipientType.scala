package typings.officeDashJs.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecipientType extends js.Object

/**
  * Specifies the type of recipient for an appointment.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RecipientType with String] = js.native
  /* "distributionList" */ @js.native
  object DistributionList extends TopLevel[DistributionList with String]
  
  /* "externalUser" */ @js.native
  object ExternalUser extends TopLevel[ExternalUser with String]
  
  /* "other" */ @js.native
  object Other extends TopLevel[Other with String]
  
  /* "user" */ @js.native
  object User extends TopLevel[User with String]
  
}

