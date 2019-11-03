package typings.postmark.distClientModelsServerServerMod

import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/server/Server", "UpdateServerRequest")
@js.native
class UpdateServerRequest protected () extends js.Object {
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
    TrackLinks: js.UndefOr[LinkTrackingOptions],
    IncludeBounceContentInHook: js.UndefOr[Boolean],
    EnableSmtpApiErrorHooks: js.UndefOr[Boolean]
  ) = this()
  var BounceHookUrl: js.UndefOr[String] = js.native
  var ClickHookUrl: js.UndefOr[String] = js.native
  var Color: js.UndefOr[String] = js.native
  var DeliveryHookUrl: js.UndefOr[String] = js.native
  var EnableSmtpApiErrorHooks: js.UndefOr[Boolean] = js.native
  var InboundHookUrl: js.UndefOr[String] = js.native
  var InboundSpamThreshold: js.UndefOr[Double] = js.native
  var IncludeBounceContentInHook: js.UndefOr[Boolean] = js.native
  var Name: js.UndefOr[String] = js.native
  var OpenHookUrl: js.UndefOr[String] = js.native
  var PostFirstOpenOnly: js.UndefOr[Boolean] = js.native
  var RawEmailEnabled: js.UndefOr[Boolean] = js.native
  var SmtpApiActivated: js.UndefOr[Boolean] = js.native
  var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
  var TrackOpens: js.UndefOr[Boolean] = js.native
}

