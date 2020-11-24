package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the type of response to a meeting invitation.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ResponseType")
@js.native
object ResponseType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.ResponseType with String] = js.native
  
  /* "accepted" */ val Accepted: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Accepted with String = js.native
  
  /* "declined" */ val Declined: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Declined with String = js.native
  
  /* "none" */ val None: typings.officeJsPreview.Office.MailboxEnums.ResponseType.None with String = js.native
  
  /* "organizer" */ val Organizer: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Organizer with String = js.native
  
  /* "tentative" */ val Tentative: typings.officeJsPreview.Office.MailboxEnums.ResponseType.Tentative with String = js.native
}
