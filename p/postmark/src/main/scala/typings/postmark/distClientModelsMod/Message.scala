package typings.postmark.distClientModelsMod

import typings.postmark.distClientModelsClientSupportingTypesMod.Hash
import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "Message")
@js.native
class Message protected ()
  extends typings.postmark.distClientModelsMessageMessageMod.Message {
  def this(
    From: String,
    Subject: String,
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    To: js.UndefOr[String],
    Cc: js.UndefOr[String],
    Bcc: js.UndefOr[String],
    ReplyTo: js.UndefOr[String],
    Tag: js.UndefOr[String],
    TrackOpens: js.UndefOr[Boolean],
    TrackLinks: js.UndefOr[LinkTrackingOptions],
    Headers: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Header]],
    Attachments: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment]],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}

