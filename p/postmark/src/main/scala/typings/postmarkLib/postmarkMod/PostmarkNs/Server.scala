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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApiTokens")(ApiTokens)
    __obj.updateDynamic("BounceHookUrl")(BounceHookUrl)
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("DeliveryHookUrl")(DeliveryHookUrl)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("InboundDomain")(InboundDomain)
    __obj.updateDynamic("InboundHookUrl")(InboundHookUrl)
    __obj.updateDynamic("InboundSpamThreshold")(InboundSpamThreshold)
    __obj.updateDynamic("IncludeBounceContentInHook")(IncludeBounceContentInHook)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("OpenHookUrl")(OpenHookUrl)
    __obj.updateDynamic("PostFirstOpenOnly")(PostFirstOpenOnly)
    __obj.updateDynamic("RawEmailEnabled")(RawEmailEnabled)
    __obj.updateDynamic("ServerLink")(ServerLink)
    __obj.updateDynamic("SmtpApiActivated")(SmtpApiActivated)
    __obj.updateDynamic("TrackLinks")(TrackLinks)
    __obj.updateDynamic("TrackOpens")(TrackOpens)
    __obj.asInstanceOf[Server]
  }
}

