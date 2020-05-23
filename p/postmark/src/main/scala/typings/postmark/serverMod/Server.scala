package typings.postmark.serverMod

import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var ApiTokens: js.Array[String]
  var BounceHookUrl: js.UndefOr[String] = js.undefined
  var ClickHookUrl: js.UndefOr[String] = js.undefined
  var Color: String
  var DeliveryHookUrl: js.UndefOr[String] = js.undefined
  var EnableSmtpApiErrorHooks: Boolean
  var ID: Double
  var InboundAddress: String
  var InboundDomain: js.UndefOr[String] = js.undefined
  var InboundHash: String
  var InboundHookUrl: js.UndefOr[String] = js.undefined
  var InboundSpamThreshold: Double
  var IncludeBounceContentInHook: Boolean
  var Name: String
  var OpenHookUrl: js.UndefOr[String] = js.undefined
  var PostFirstOpenOnly: Boolean
  var RawEmailEnabled: Boolean
  var ServerLink: String
  var SmtpApiActivated: Boolean
  var TrackLinks: LinkTrackingOptions
  var TrackOpens: js.UndefOr[Boolean] = js.undefined
}

object Server {
  @scala.inline
  def apply(
    ApiTokens: js.Array[String],
    Color: String,
    EnableSmtpApiErrorHooks: Boolean,
    ID: Double,
    InboundAddress: String,
    InboundHash: String,
    InboundSpamThreshold: Double,
    IncludeBounceContentInHook: Boolean,
    Name: String,
    PostFirstOpenOnly: Boolean,
    RawEmailEnabled: Boolean,
    ServerLink: String,
    SmtpApiActivated: Boolean,
    TrackLinks: LinkTrackingOptions,
    BounceHookUrl: String = null,
    ClickHookUrl: String = null,
    DeliveryHookUrl: String = null,
    InboundDomain: String = null,
    InboundHookUrl: String = null,
    OpenHookUrl: String = null,
    TrackOpens: js.UndefOr[Boolean] = js.undefined
  ): Server = {
    val __obj = js.Dynamic.literal(ApiTokens = ApiTokens.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], EnableSmtpApiErrorHooks = EnableSmtpApiErrorHooks.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InboundAddress = InboundAddress.asInstanceOf[js.Any], InboundHash = InboundHash.asInstanceOf[js.Any], InboundSpamThreshold = InboundSpamThreshold.asInstanceOf[js.Any], IncludeBounceContentInHook = IncludeBounceContentInHook.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PostFirstOpenOnly = PostFirstOpenOnly.asInstanceOf[js.Any], RawEmailEnabled = RawEmailEnabled.asInstanceOf[js.Any], ServerLink = ServerLink.asInstanceOf[js.Any], SmtpApiActivated = SmtpApiActivated.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any])
    if (BounceHookUrl != null) __obj.updateDynamic("BounceHookUrl")(BounceHookUrl.asInstanceOf[js.Any])
    if (ClickHookUrl != null) __obj.updateDynamic("ClickHookUrl")(ClickHookUrl.asInstanceOf[js.Any])
    if (DeliveryHookUrl != null) __obj.updateDynamic("DeliveryHookUrl")(DeliveryHookUrl.asInstanceOf[js.Any])
    if (InboundDomain != null) __obj.updateDynamic("InboundDomain")(InboundDomain.asInstanceOf[js.Any])
    if (InboundHookUrl != null) __obj.updateDynamic("InboundHookUrl")(InboundHookUrl.asInstanceOf[js.Any])
    if (OpenHookUrl != null) __obj.updateDynamic("OpenHookUrl")(OpenHookUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(TrackOpens)) __obj.updateDynamic("TrackOpens")(TrackOpens.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

