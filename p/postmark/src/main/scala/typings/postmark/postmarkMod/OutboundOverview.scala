package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// outbound overview
trait OutboundOverview extends js.Object {
  var BounceRate: Double
  var Bounced: Double
  var Opens: Double
  var SMTPApiErrors: Double
  var Sent: Double
  var SpamComplaints: Double
  var SpamComplaintsRate: Double
  var TotalClicks: Double
  var TotalTrackedLinksSent: Double
  var Tracked: Double
  var UniqueLinksClicked: Double
  var UniqueOpens: Double
  var WithClientRecorded: Double
  var WithLinkTracking: Double
  var WithOpenTracking: Double
  var WithPlatformRecorded: Double
  var WithReadTimeRecorded: Double
}

object OutboundOverview {
  @scala.inline
  def apply(
    BounceRate: Double,
    Bounced: Double,
    Opens: Double,
    SMTPApiErrors: Double,
    Sent: Double,
    SpamComplaints: Double,
    SpamComplaintsRate: Double,
    TotalClicks: Double,
    TotalTrackedLinksSent: Double,
    Tracked: Double,
    UniqueLinksClicked: Double,
    UniqueOpens: Double,
    WithClientRecorded: Double,
    WithLinkTracking: Double,
    WithOpenTracking: Double,
    WithPlatformRecorded: Double,
    WithReadTimeRecorded: Double
  ): OutboundOverview = {
    val __obj = js.Dynamic.literal(BounceRate = BounceRate, Bounced = Bounced, Opens = Opens, SMTPApiErrors = SMTPApiErrors, Sent = Sent, SpamComplaints = SpamComplaints, SpamComplaintsRate = SpamComplaintsRate, TotalClicks = TotalClicks, TotalTrackedLinksSent = TotalTrackedLinksSent, Tracked = Tracked, UniqueLinksClicked = UniqueLinksClicked, UniqueOpens = UniqueOpens, WithClientRecorded = WithClientRecorded, WithLinkTracking = WithLinkTracking, WithOpenTracking = WithOpenTracking, WithPlatformRecorded = WithPlatformRecorded, WithReadTimeRecorded = WithReadTimeRecorded)
  
    __obj.asInstanceOf[OutboundOverview]
  }
}

