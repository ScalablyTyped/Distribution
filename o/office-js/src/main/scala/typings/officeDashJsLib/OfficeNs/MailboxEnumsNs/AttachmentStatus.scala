package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

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
         * <table><tr><td>
         * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
         * </td><td>Compose or read</td></tr></table>
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
  sealed trait Added
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentStatus
  
  /**
               * An attachment was removed from the item.
               */
  @js.native
  sealed trait Removed
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentStatus
  
  /* "added" */ val Added: Added with java.lang.String = js.native
  /* "removed" */ val Removed: Removed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentStatus with java.lang.String] = js.native
}

