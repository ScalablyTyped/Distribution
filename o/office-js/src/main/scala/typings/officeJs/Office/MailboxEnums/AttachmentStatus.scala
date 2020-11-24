package typings.officeJs.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentStatus extends js.Object
/**
  * Specifies whether an attachment was added to or removed from an item.
  * 
  * [Api set: Mailbox 1.8]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentStatus")
@js.native
object AttachmentStatus extends js.Object {
  
  /**
    * An attachment was added to the item.
    */
  @js.native
  sealed trait Added extends AttachmentStatus
  
  /**
    * An attachment was removed from the item.
    */
  @js.native
  sealed trait Removed extends AttachmentStatus
}
