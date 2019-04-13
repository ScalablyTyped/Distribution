package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// outbound overview
trait OutboundOverview extends js.Object {
  var BounceRate: scala.Double
  var Bounced: scala.Double
  var Opens: scala.Double
  var SMTPApiErrors: scala.Double
  var Sent: scala.Double
  var SpamComplaints: scala.Double
  var SpamComplaintsRate: scala.Double
  var TotalClicks: scala.Double
  var TotalTrackedLinksSent: scala.Double
  var Tracked: scala.Double
  var UniqueLinksClicked: scala.Double
  var UniqueOpens: scala.Double
  var WithClientRecorded: scala.Double
  var WithLinkTracking: scala.Double
  var WithOpenTracking: scala.Double
  var WithPlatformRecorded: scala.Double
  var WithReadTimeRecorded: scala.Double
}

object OutboundOverview {
  @scala.inline
  def apply(
    BounceRate: scala.Double,
    Bounced: scala.Double,
    Opens: scala.Double,
    SMTPApiErrors: scala.Double,
    Sent: scala.Double,
    SpamComplaints: scala.Double,
    SpamComplaintsRate: scala.Double,
    TotalClicks: scala.Double,
    TotalTrackedLinksSent: scala.Double,
    Tracked: scala.Double,
    UniqueLinksClicked: scala.Double,
    UniqueOpens: scala.Double,
    WithClientRecorded: scala.Double,
    WithLinkTracking: scala.Double,
    WithOpenTracking: scala.Double,
    WithPlatformRecorded: scala.Double,
    WithReadTimeRecorded: scala.Double
  ): OutboundOverview = {
    val __obj = js.Dynamic.literal(BounceRate = BounceRate, Bounced = Bounced, Opens = Opens, SMTPApiErrors = SMTPApiErrors, Sent = Sent, SpamComplaints = SpamComplaints, SpamComplaintsRate = SpamComplaintsRate, TotalClicks = TotalClicks, TotalTrackedLinksSent = TotalTrackedLinksSent, Tracked = Tracked, UniqueLinksClicked = UniqueLinksClicked, UniqueOpens = UniqueOpens, WithClientRecorded = WithClientRecorded, WithLinkTracking = WithLinkTracking, WithOpenTracking = WithOpenTracking, WithPlatformRecorded = WithPlatformRecorded, WithReadTimeRecorded = WithReadTimeRecorded)
  
    __obj.asInstanceOf[OutboundOverview]
  }
}

