package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// server
trait Server extends Sender {
  var ApiTokens: js.Array[String]
  var ID: Double
  var Name: String
  var ServerLink: String
}

object Server {
  @scala.inline
  def apply(
    ApiTokens: js.Array[String],
    BounceHookUrl: Boolean,
    Color: String,
    DeliveryHookUrl: String,
    ID: Double,
    InboundDomain: String,
    InboundHookUrl: String,
    InboundSpamThreshold: Double,
    IncludeBounceContentInHook: Boolean,
    Name: String,
    OpenHookUrl: Boolean,
    PostFirstOpenOnly: Boolean,
    RawEmailEnabled: Boolean,
    ServerLink: String,
    SmtpApiActivated: Boolean,
    TrackLinks: String,
    TrackOpens: Boolean
  ): Server = {
    val __obj = js.Dynamic.literal(ApiTokens = ApiTokens, BounceHookUrl = BounceHookUrl, Color = Color, DeliveryHookUrl = DeliveryHookUrl, ID = ID, InboundDomain = InboundDomain, InboundHookUrl = InboundHookUrl, InboundSpamThreshold = InboundSpamThreshold, IncludeBounceContentInHook = IncludeBounceContentInHook, Name = Name, OpenHookUrl = OpenHookUrl, PostFirstOpenOnly = PostFirstOpenOnly, RawEmailEnabled = RawEmailEnabled, ServerLink = ServerLink, SmtpApiActivated = SmtpApiActivated, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[Server]
  }
}

