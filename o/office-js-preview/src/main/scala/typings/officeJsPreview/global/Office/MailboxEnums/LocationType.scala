package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies an appointment location's type.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.LocationType")
@js.native
object LocationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.LocationType with String] = js.native
  
  /* "custom" */ val Custom: typings.officeJsPreview.Office.MailboxEnums.LocationType.Custom with String = js.native
  
  /* "room" */ val Room: typings.officeJsPreview.Office.MailboxEnums.LocationType.Room with String = js.native
}
