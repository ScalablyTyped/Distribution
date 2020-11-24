package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the source of the selected data in an item (see `Office.mailbox.item.getSelectedDataAsync` for details).
  *
  * [Api set: Mailbox 1.2]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@JSGlobal("Office.MailboxEnums.SourceProperty")
@js.native
object SourceProperty extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.SourceProperty with String] = js.native
  
  /* "body" */ val Body: typings.officeJsPreview.Office.MailboxEnums.SourceProperty.Body with String = js.native
  
  /* "subject" */ val Subject: typings.officeJsPreview.Office.MailboxEnums.SourceProperty.Subject with String = js.native
}
