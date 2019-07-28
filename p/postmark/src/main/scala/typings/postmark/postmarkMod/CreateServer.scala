package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServer extends js.Object {
  var BounceHookUrl: js.UndefOr[String] = js.undefined
  var Color: js.UndefOr[String] = js.undefined
  var DeliveryHookUrl: js.UndefOr[String] = js.undefined
  var InboundDomain: js.UndefOr[String] = js.undefined
  var InboundHookUrl: js.UndefOr[String] = js.undefined
  var InboundSpamThreshold: js.UndefOr[Double] = js.undefined
  var IncludeBounceContentInHook: js.UndefOr[Boolean] = js.undefined
  var Name: String
  var OpenHookUrl: js.UndefOr[String] = js.undefined
  var PostFirstOpenOnly: js.UndefOr[Boolean] = js.undefined
  var RawEmailEnabled: js.UndefOr[Boolean] = js.undefined
  var SmtpApiActivated: js.UndefOr[Boolean] = js.undefined
  var TrackLinks: js.UndefOr[String] = js.undefined
  var TrackOpens: js.UndefOr[Boolean] = js.undefined
}

object CreateServer {
  @scala.inline
  def apply(
    Name: String,
    BounceHookUrl: String = null,
    Color: String = null,
    DeliveryHookUrl: String = null,
    InboundDomain: String = null,
    InboundHookUrl: String = null,
    InboundSpamThreshold: Int | Double = null,
    IncludeBounceContentInHook: js.UndefOr[Boolean] = js.undefined,
    OpenHookUrl: String = null,
    PostFirstOpenOnly: js.UndefOr[Boolean] = js.undefined,
    RawEmailEnabled: js.UndefOr[Boolean] = js.undefined,
    SmtpApiActivated: js.UndefOr[Boolean] = js.undefined,
    TrackLinks: String = null,
    TrackOpens: js.UndefOr[Boolean] = js.undefined
  ): CreateServer = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (BounceHookUrl != null) __obj.updateDynamic("BounceHookUrl")(BounceHookUrl)
    if (Color != null) __obj.updateDynamic("Color")(Color)
    if (DeliveryHookUrl != null) __obj.updateDynamic("DeliveryHookUrl")(DeliveryHookUrl)
    if (InboundDomain != null) __obj.updateDynamic("InboundDomain")(InboundDomain)
    if (InboundHookUrl != null) __obj.updateDynamic("InboundHookUrl")(InboundHookUrl)
    if (InboundSpamThreshold != null) __obj.updateDynamic("InboundSpamThreshold")(InboundSpamThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeBounceContentInHook)) __obj.updateDynamic("IncludeBounceContentInHook")(IncludeBounceContentInHook)
    if (OpenHookUrl != null) __obj.updateDynamic("OpenHookUrl")(OpenHookUrl)
    if (!js.isUndefined(PostFirstOpenOnly)) __obj.updateDynamic("PostFirstOpenOnly")(PostFirstOpenOnly)
    if (!js.isUndefined(RawEmailEnabled)) __obj.updateDynamic("RawEmailEnabled")(RawEmailEnabled)
    if (!js.isUndefined(SmtpApiActivated)) __obj.updateDynamic("SmtpApiActivated")(SmtpApiActivated)
    if (TrackLinks != null) __obj.updateDynamic("TrackLinks")(TrackLinks)
    if (!js.isUndefined(TrackOpens)) __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[CreateServer]
  }
}

