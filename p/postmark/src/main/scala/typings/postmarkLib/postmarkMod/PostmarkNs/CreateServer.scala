package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServer extends js.Object {
  var BounceHookUrl: js.UndefOr[java.lang.String] = js.undefined
  var Color: js.UndefOr[java.lang.String] = js.undefined
  var DeliveryHookUrl: js.UndefOr[java.lang.String] = js.undefined
  var InboundDomain: js.UndefOr[java.lang.String] = js.undefined
  var InboundHookUrl: js.UndefOr[java.lang.String] = js.undefined
  var InboundSpamThreshold: js.UndefOr[scala.Double] = js.undefined
  var IncludeBounceContentInHook: js.UndefOr[scala.Boolean] = js.undefined
  var Name: java.lang.String
  var OpenHookUrl: js.UndefOr[java.lang.String] = js.undefined
  var PostFirstOpenOnly: js.UndefOr[scala.Boolean] = js.undefined
  var RawEmailEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var SmtpApiActivated: js.UndefOr[scala.Boolean] = js.undefined
  var TrackLinks: js.UndefOr[java.lang.String] = js.undefined
  var TrackOpens: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateServer {
  @scala.inline
  def apply(
    Name: java.lang.String,
    BounceHookUrl: java.lang.String = null,
    Color: java.lang.String = null,
    DeliveryHookUrl: java.lang.String = null,
    InboundDomain: java.lang.String = null,
    InboundHookUrl: java.lang.String = null,
    InboundSpamThreshold: scala.Int | scala.Double = null,
    IncludeBounceContentInHook: js.UndefOr[scala.Boolean] = js.undefined,
    OpenHookUrl: java.lang.String = null,
    PostFirstOpenOnly: js.UndefOr[scala.Boolean] = js.undefined,
    RawEmailEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SmtpApiActivated: js.UndefOr[scala.Boolean] = js.undefined,
    TrackLinks: java.lang.String = null,
    TrackOpens: js.UndefOr[scala.Boolean] = js.undefined
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

