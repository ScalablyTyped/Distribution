package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DelegatePermissions extends StObject
/**
  * This bit mask represents a delegate's permissions on a shared folder.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.DelegatePermissions")
@js.native
object DelegatePermissions extends StObject {
  
  /**
    * Delegate has permission to delete any items.
    */
  @js.native
  sealed trait DeleteAll
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate has permission to delete only the items they created.
    */
  @js.native
  sealed trait DeleteOwn
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate has permission to edit any items.
    */
  @js.native
  sealed trait EditAll
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate has permission to edit only they items they created.
    */
  @js.native
  sealed trait EditOwn
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate has permission to read items.
    */
  @js.native
  sealed trait Read
    extends StObject
       with DelegatePermissions
  
  /**
    * Delegate has permission to create and write items.
    */
  @js.native
  sealed trait Write
    extends StObject
       with DelegatePermissions
}
