package typings.postmark.mod

import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "TemplatedMessage")
@js.native
open class TemplatedMessage protected ()
  extends typings.postmark.distClientModelsMod.TemplatedMessage {
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
    headers: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Header]],
    attachments: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment]]
  ) = this()
}
