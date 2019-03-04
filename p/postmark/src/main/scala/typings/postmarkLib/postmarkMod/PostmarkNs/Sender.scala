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
    val __obj = js.Dynamic.literal(BounceHookUrl = BounceHookUrl, Color = Color, DeliveryHookUrl = DeliveryHookUrl, InboundDomain = InboundDomain, InboundHookUrl = InboundHookUrl, InboundSpamThreshold = InboundSpamThreshold, IncludeBounceContentInHook = IncludeBounceContentInHook, OpenHookUrl = OpenHookUrl, PostFirstOpenOnly = PostFirstOpenOnly, RawEmailEnabled = RawEmailEnabled, SmtpApiActivated = SmtpApiActivated, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[Sender]
  }
}

