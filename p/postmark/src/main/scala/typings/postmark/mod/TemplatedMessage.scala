package typings.postmark.mod

import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "TemplatedMessage")
@js.native
class TemplatedMessage protected ()
  extends typings.postmark.modelsMod.TemplatedMessage {
  def this(
    from: String,
    templateIdOrAlias: Double | String,
    templateModel: js.Object,
    to: js.UndefOr[String],
    cc: js.UndefOr[String],
    bcc: js.UndefOr[String],
    replyTo: js.UndefOr[String],
    tag: js.UndefOr[String],
    trackOpens: js.UndefOr[Boolean],
    trackLinks: js.UndefOr[LinkTrackingOptions],
    headers: js.UndefOr[js.Array[typings.postmark.messageSupportingTypesMod.Header]],
    attachments: js.UndefOr[js.Array[typings.postmark.messageSupportingTypesMod.Attachment]]
  ) = this()
}

