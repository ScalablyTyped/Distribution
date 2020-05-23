package typings.officeJsPreview.global.Office.MailboxEnums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the version of the REST API that corresponds to a REST-formatted item ID.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.RestVersion")
@js.native
object RestVersion extends js.Object {
  /* "beta" */ val Beta: typings.officeJsPreview.Office.MailboxEnums.RestVersion.Beta with String = js.native
  /* "v1.0" */ val v1_0: typings.officeJsPreview.Office.MailboxEnums.RestVersion.v1_0 with String = js.native
  /* "v2.0" */ val v2_0: typings.officeJsPreview.Office.MailboxEnums.RestVersion.v2_0 with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Office.MailboxEnums.RestVersion with String] = js.native
}

