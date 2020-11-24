package typings.postmark.serverMod

import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/server/Server", "CreateServerRequest")
@js.native
class CreateServerRequest protected () extends UpdateServerRequest {
  def this(
    Name: String,
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
    TrackLinks: js.UndefOr[LinkTrackingOptions],
    IncludeBounceContentInHook: js.UndefOr[Boolean],
    EnableSmtpApiErrorHooks: js.UndefOr[Boolean]
  ) = this()
}
