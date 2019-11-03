package typings.postmark.distClientModelsServerServerMod

import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions
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
    val __obj = js.Dynamic.literal(ApiTokens = ApiTokens, Color = Color, EnableSmtpApiErrorHooks = EnableSmtpApiErrorHooks, ID = ID, InboundAddress = InboundAddress, InboundHash = InboundHash, InboundSpamThreshold = InboundSpamThreshold, IncludeBounceContentInHook = IncludeBounceContentInHook, Name = Name, PostFirstOpenOnly = PostFirstOpenOnly, RawEmailEnabled = RawEmailEnabled, ServerLink = ServerLink, SmtpApiActivated = SmtpApiActivated, TrackLinks = TrackLinks)
    if (BounceHookUrl != null) __obj.updateDynamic("BounceHookUrl")(BounceHookUrl)
    if (ClickHookUrl != null) __obj.updateDynamic("ClickHookUrl")(ClickHookUrl)
    if (DeliveryHookUrl != null) __obj.updateDynamic("DeliveryHookUrl")(DeliveryHookUrl)
    if (InboundDomain != null) __obj.updateDynamic("InboundDomain")(InboundDomain)
    if (InboundHookUrl != null) __obj.updateDynamic("InboundHookUrl")(InboundHookUrl)
    if (OpenHookUrl != null) __obj.updateDynamic("OpenHookUrl")(OpenHookUrl)
    if (!js.isUndefined(TrackOpens)) __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[Server]
  }
}

