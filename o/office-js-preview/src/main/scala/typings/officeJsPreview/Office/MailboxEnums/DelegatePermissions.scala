package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DelegatePermissions extends StObject
/**
  * This bitmask represents a delegate's permissions on a shared folder, or a user's permissions on a shared mailbox.
  *
  * @remarks
  * [Api set: Mailbox 1.8]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.DelegatePermissions")
@js.native
object DelegatePermissions extends StObject {
  
  /**
    * Delegate or user has permission to delete any items.
    */
  @js.native
  sealed trait DeleteAll
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate or user has permission to delete only the items they created.
    */
  @js.native
  sealed trait DeleteOwn
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate or user has permission to edit any items.
    */
  @js.native
  sealed trait EditAll
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate or user has permission to edit only they items they created.
    */
  @js.native
  sealed trait EditOwn
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate or user has permission to read items.
    */
  @js.native
  sealed trait Read
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate or user has permission to create and write items.
    */
  @js.native
  sealed trait Write
    extends StObject
       with DelegatePermissions
}
