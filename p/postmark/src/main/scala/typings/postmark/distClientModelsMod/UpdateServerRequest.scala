package typings.postmark.distClientModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "UpdateServerRequest")
@js.native
class UpdateServerRequest protected ()
  extends typings.postmark.distClientModelsServerServerMod.UpdateServerRequest {
  def this(
    Name: js.UndefOr[String],
    Color: js.UndefOr[String],
    SmtpApiActivated: js.UndefOr[Boolean],
    RawEmailEnabled: js.UndefOr[Boolean],
    InboundHookUrl: js.UndefOr[String],
    BounceHookUrl: js.UndefOr[String],
    OpenHookUrl: js.UndefOr[String],
    DeliveryHookUrl: js.UndefOr[String],
    ClickHookUrl: js.UndefOr[String],
    PostFirstOpenOnly: js.UndefOr[Boolean],
    InboundSpamThreshold: js.UndefOr[Double],
    TrackOpens: js.UndefOr[Boolean],
    TrackLinks: js.UndefOr[typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions],
    IncludeBounceContentInHook: js.UndefOr[Boolean],
    EnableSmtpApiErrorHooks: js.UndefOr[Boolean]
  ) = this()
}

