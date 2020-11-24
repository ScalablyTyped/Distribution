package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compose type.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  *
  * @beta
  */
@JSGlobal("Office.MailboxEnums.ComposeType")
@js.native
object ComposeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.ComposeType with String] = js.native
  
  /* "forward" */ val Forward: typings.officeJsPreview.Office.MailboxEnums.ComposeType.Forward with String = js.native
  
  /* "newMail" */ val NewMail: typings.officeJsPreview.Office.MailboxEnums.ComposeType.NewMail with String = js.native
  
  /* "reply" */ val Reply: typings.officeJsPreview.Office.MailboxEnums.ComposeType.Reply with String = js.native
}
