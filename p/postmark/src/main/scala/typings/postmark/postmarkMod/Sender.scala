package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sender extends js.Object {
  var BounceHookUrl: Boolean
  var Color: String
  var DeliveryHookUrl: String
  var InboundDomain: String
  var InboundHookUrl: String
  var InboundSpamThreshold: Double
  var IncludeBounceContentInHook: Boolean
  var OpenHookUrl: Boolean
  var PostFirstOpenOnly: Boolean
  var RawEmailEnabled: Boolean
  var SmtpApiActivated: Boolean
  var TrackLinks: String
  var TrackOpens: Boolean
}

object Sender {
  @scala.inline
  def apply(
    BounceHookUrl: Boolean,
    Color: String,
    DeliveryHookUrl: String,
    InboundDomain: String,
    InboundHookUrl: String,
    InboundSpamThreshold: Double,
    IncludeBounceContentInHook: Boolean,
    OpenHookUrl: Boolean,
    PostFirstOpenOnly: Boolean,
    RawEmailEnabled: Boolean,
    SmtpApiActivated: Boolean,
    TrackLinks: String,
    TrackOpens: Boolean
  ): Sender = {
    val __obj = js.Dynamic.literal(BounceHookUrl = BounceHookUrl, Color = Color, DeliveryHookUrl = DeliveryHookUrl, InboundDomain = InboundDomain, InboundHookUrl = InboundHookUrl, InboundSpamThreshold = InboundSpamThreshold, IncludeBounceContentInHook = IncludeBounceContentInHook, OpenHookUrl = OpenHookUrl, PostFirstOpenOnly = PostFirstOpenOnly, RawEmailEnabled = RawEmailEnabled, SmtpApiActivated = SmtpApiActivated, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[Sender]
  }
}

