package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies an attachment's type.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.AttachmentType with String] = js.native
  
  /* "cloud" */ val Cloud: typings.officeJsPreview.Office.MailboxEnums.AttachmentType.Cloud with String = js.native
  
  /* "file" */ val File: typings.officeJsPreview.Office.MailboxEnums.AttachmentType.File with String = js.native
  
  /* "item" */ val Item: typings.officeJsPreview.Office.MailboxEnums.AttachmentType.Item with String = js.native
}
