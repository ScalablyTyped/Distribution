package typings
package officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

/**
         * Specifies an attachment's type.
         *
         * [Api set: Mailbox 1.0]
         *
         * @remarks
         * <table><tr><td>
         * {@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}
         * </td><td>Compose or read</td></tr></table>
         */
@JSGlobal("Office.MailboxEnums.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  /**
               * The attachment is stored in a cloud location, such as OneDrive. The id property of the attachment contains a URL to the file.
               */
  @js.native
  sealed trait Cloud
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.AttachmentType
  
  /**
               * The attachment is a file
               */
  @js.native
  sealed trait File
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.AttachmentType
  
  /**
               * The attachment is an Exchange item
               */
  @js.native
  sealed trait Item
    extends officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.AttachmentType
  
  /* "cloud" */ val Cloud: Cloud with java.lang.String = js.native
  /* "file" */ val File: File with java.lang.String = js.native
  /* "item" */ val Item: Item with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.AttachmentType with java.lang.String
  ] = js.native
}

