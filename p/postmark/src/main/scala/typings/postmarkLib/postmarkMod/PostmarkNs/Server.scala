package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// server
trait Server extends Sender {
  var ApiTokens: js.Array[java.lang.String]
  var ID: scala.Double
  var Name: java.lang.String
  var ServerLink: java.lang.String
}

object Server {
  @scala.inline
  def apply(
    ApiTokens: js.Array[java.lang.String],
    BounceHookUrl: scala.Boolean,
    Color: java.lang.String,
    DeliveryHookUrl: java.lang.String,
    ID: scala.Double,
    InboundDomain: java.lang.String,
    InboundHookUrl: java.lang.String,
    InboundSpamThreshold: scala.Double,
    IncludeBounceContentInHook: scala.Boolean,
    Name: java.lang.String,
    OpenHookUrl: scala.Boolean,
    PostFirstOpenOnly: scala.Boolean,
    RawEmailEnabled: scala.Boolean,
    ServerLink: java.lang.String,
    SmtpApiActivated: scala.Boolean,
    TrackLinks: java.lang.String,
    TrackOpens: scala.Boolean
  ): Server = {
    val __obj = js.Dynamic.literal(ApiTokens = ApiTokens, BounceHookUrl = BounceHookUrl, Color = Color, DeliveryHookUrl = DeliveryHookUrl, ID = ID, InboundDomain = InboundDomain, InboundHookUrl = InboundHookUrl, InboundSpamThreshold = InboundSpamThreshold, IncludeBounceContentInHook = IncludeBounceContentInHook, Name = Name, OpenHookUrl = OpenHookUrl, PostFirstOpenOnly = PostFirstOpenOnly, RawEmailEnabled = RawEmailEnabled, ServerLink = ServerLink, SmtpApiActivated = SmtpApiActivated, TrackLinks = TrackLinks, TrackOpens = TrackOpens)
  
    __obj.asInstanceOf[Server]
  }
}

