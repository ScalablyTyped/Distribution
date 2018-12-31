package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

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
  * <table><tr><td>
  * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
  * </td><td>Compose or read</td></tr></table>
  */
@JSGlobal("Office.MailboxEnums.RecipientType")
@js.native
object RecipientType extends js.Object {
  /**
    * Specifies that the recipient is a distribution list containing a list of email addresses.
    */
  @js.native
  sealed trait DistributionList
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecipientType
  
  /**
    * Specifies that the recipient is an SMTP email address that is not on the Exchange server.
    */
  @js.native
  sealed trait ExternalUser
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecipientType
  
  /**
    * Specifies that the recipient is not one of the other recipient types.
    */
  @js.native
  sealed trait Other
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecipientType
  
  /**
    * Specifies that the recipient is an SMTP email address that is on the Exchange server.
    */
  @js.native
  sealed trait User
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.RecipientType
  
  /* "distributionList" */ val DistributionList: DistributionList with java.lang.String = js.native
  /* "externalUser" */ val ExternalUser: ExternalUser with java.lang.String = js.native
  /* "other" */ val Other: Other with java.lang.String = js.native
  /* "user" */ val User: User with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.RecipientType with java.lang.String] = js.native
}

