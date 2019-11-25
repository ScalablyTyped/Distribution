package typings.postmark.postmarkMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.TemplatedMessage")
@js.native
class TemplatedMessage protected ()
  extends typings.postmark.distClientModelsMod.TemplatedMessage {
  def this(
    from: String,
    templateIdOrAlias: String,
    templateModel: js.Object,
    to: js.UndefOr[String],
    cc: js.UndefOr[String],
    bcc: js.UndefOr[String],
    replyTo: js.UndefOr[String],
    tag: js.UndefOr[String],
    trackOpens: js.UndefOr[Boolean],
    trackLinks: js.UndefOr[typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions],
    headers: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Header]],
    attachments: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment]]
  ) = this()
  def this(
    from: String,
    templateIdOrAlias: Double,
    templateModel: js.Object,
    to: js.UndefOr[String],
    cc: js.UndefOr[String],
    bcc: js.UndefOr[String],
    replyTo: js.UndefOr[String],
    tag: js.UndefOr[String],
    trackOpens: js.UndefOr[Boolean],
    trackLinks: js.UndefOr[typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions],
    headers: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Header]],
    attachments: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment]]
  ) = this()
}

