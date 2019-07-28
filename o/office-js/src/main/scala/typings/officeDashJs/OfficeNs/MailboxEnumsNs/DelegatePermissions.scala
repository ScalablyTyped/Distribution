package typings.officeDashJs.OfficeNs.MailboxEnumsNs

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
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
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
  sealed trait DeleteAll extends DelegatePermissions
  
  /**
    * Delegate has permission to delete only the items they created.
    */
  @js.native
  sealed trait DeleteOwn extends DelegatePermissions
  
  /**
    * Delegate has permission to edit any items.
    */
  @js.native
  sealed trait EditAll extends DelegatePermissions
  
  /**
    * Delegate has permission to edit only they items they created.
    */
  @js.native
  sealed trait EditOwn extends DelegatePermissions
  
  /**
    * Delegate has permission to read items.
    */
  @js.native
  sealed trait Read extends DelegatePermissions
  
  /**
    * Delegate has permission to create and write items.
    */
  @js.native
  sealed trait Write extends DelegatePermissions
  
  /* 8 */ val DeleteAll: typings.officeDashJs.OfficeNs.MailboxEnumsNs.DelegatePermissions.DeleteAll with Double = js.native
  /* 4 */ val DeleteOwn: typings.officeDashJs.OfficeNs.MailboxEnumsNs.DelegatePermissions.DeleteOwn with Double = js.native
  /* 32 */ val EditAll: typings.officeDashJs.OfficeNs.MailboxEnumsNs.DelegatePermissions.EditAll with Double = js.native
  /* 16 */ val EditOwn: typings.officeDashJs.OfficeNs.MailboxEnumsNs.DelegatePermissions.EditOwn with Double = js.native
  /* 1 */ val Read: typings.officeDashJs.OfficeNs.MailboxEnumsNs.DelegatePermissions.Read with Double = js.native
  /* 2 */ val Write: typings.officeDashJs.OfficeNs.MailboxEnumsNs.DelegatePermissions.Write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DelegatePermissions with Double] = js.native
}

