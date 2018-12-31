package typings
package officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DelegatePermissions extends js.Object

/**
  * This bit mask represents a delegate's permissions on a shared folder.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * <table><tr><td>
  * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
  * </td><td>Compose or read</td></tr></table>
  * 
  * @beta
  */
@JSGlobal("Office.MailboxEnums.DelegatePermissions")
@js.native
object DelegatePermissions extends js.Object {
  /**
    * Delegate has permission to delete any items.
    */
  @js.native
  sealed trait DeleteAll
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions
  
  /**
    * Delegate has permission to delete only the items they created.
    */
  @js.native
  sealed trait DeleteOwn
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions
  
  /**
    * Delegate has permission to edit any items.
    */
  @js.native
  sealed trait EditAll
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions
  
  /**
    * Delegate has permission to edit only they items they created.
    */
  @js.native
  sealed trait EditOwn
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions
  
  /**
    * Delegate has permission to read items.
    */
  @js.native
  sealed trait Read
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions
  
  /**
    * Delegate has permission to create and write items.
    */
  @js.native
  sealed trait Write
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions
  
  /* 8 */ val DeleteAll: DeleteAll with scala.Double = js.native
  /* 4 */ val DeleteOwn: DeleteOwn with scala.Double = js.native
  /* 32 */ val EditAll: EditAll with scala.Double = js.native
  /* 16 */ val EditOwn: EditOwn with scala.Double = js.native
  /* 1 */ val Read: Read with scala.Double = js.native
  /* 2 */ val Write: Write with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.DelegatePermissions with scala.Double
  ] = js.native
}

