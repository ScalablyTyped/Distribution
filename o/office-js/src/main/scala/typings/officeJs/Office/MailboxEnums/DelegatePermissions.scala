package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DelegatePermissions extends js.Object

/**
  * This bit mask represents a delegate's permissions on a shared folder.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DelegatePermissions with Double] = js.native
  /* 8 */ @js.native
  object DeleteAll extends TopLevel[DeleteAll with Double]
  
  /* 4 */ @js.native
  object DeleteOwn extends TopLevel[DeleteOwn with Double]
  
  /* 32 */ @js.native
  object EditAll extends TopLevel[EditAll with Double]
  
  /* 16 */ @js.native
  object EditOwn extends TopLevel[EditOwn with Double]
  
  /* 1 */ @js.native
  object Read extends TopLevel[Read with Double]
  
  /* 2 */ @js.native
  object Write extends TopLevel[Write with Double]
  
}

