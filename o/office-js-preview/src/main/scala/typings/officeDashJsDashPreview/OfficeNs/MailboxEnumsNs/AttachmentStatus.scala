package typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentStatus extends js.Object

/**
  * Specifies whether an attachment was added to or removed from an item.
  * 
  * [Api set: Mailbox Preview]
  * 
  * @remarks
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
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
  
  /* "added" */ val Added: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.AttachmentStatus.Added with String = js.native
  /* "removed" */ val Removed: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.AttachmentStatus.Removed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttachmentStatus with String] = js.native
}

