package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sender extends js.Object {
  var BounceHookUrl: scala.Boolean
  var Color: java.lang.String
  var DeliveryHookUrl: java.lang.String
  var InboundDomain: java.lang.String
  var InboundHookUrl: java.lang.String
  var InboundSpamThreshold: scala.Double
  var IncludeBounceContentInHook: scala.Boolean
  var OpenHookUrl: scala.Boolean
  var PostFirstOpenOnly: scala.Boolean
  var RawEmailEnabled: scala.Boolean
  var SmtpApiActivated: scala.Boolean
  var TrackLinks: java.lang.String
  var TrackOpens: scala.Boolean
}

object Sender {
  @scala.inline
  def apply(
    BounceHookUrl: scala.Boolean,
    Color: java.lang.String,
    DeliveryHookUrl: java.lang.String,
    InboundDomain: java.lang.String,
    InboundHookUrl: java.lang.String,
    InboundSpamThreshold: scala.Double,
    IncludeBounceContentInHook: scala.Boolean,
    OpenHookUrl: scala.Boolean,
    PostFirstOpenOnly: scala.Boolean,
    RawEmailEnabled: scala.Boolean,
    SmtpApiActivated: scala.Boolean,
    TrackLinks: java.lang.String,
    TrackOpens: scala.Boolean
  ): Sender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BounceHookUrl")(BounceHookUrl)
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("DeliveryHookUrl")(DeliveryHookUrl)
    __obj.updateDynamic("InboundDomain")(InboundDomain)
    __obj.updateDynamic("InboundHookUrl")(InboundHookUrl)
    __obj.updateDynamic("InboundSpamThreshold")(InboundSpamThreshold)
    __obj.updateDynamic("IncludeBounceContentInHook")(IncludeBounceContentInHook)
    __obj.updateDynamic("OpenHookUrl")(OpenHookUrl)
    __obj.updateDynamic("PostFirstOpenOnly")(PostFirstOpenOnly)
    __obj.updateDynamic("RawEmailEnabled")(RawEmailEnabled)
    __obj.updateDynamic("SmtpApiActivated")(SmtpApiActivated)
    __obj.updateDynamic("TrackLinks")(TrackLinks)
    __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[Sender]
  }
}

