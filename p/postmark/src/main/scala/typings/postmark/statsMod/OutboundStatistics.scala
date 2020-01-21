package typings.postmark.statsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundStatistics extends js.Object {
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

object OutboundStatistics {
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
  ): OutboundStatistics = {
    val __obj = js.Dynamic.literal(BounceRate = BounceRate.asInstanceOf[js.Any], Bounced = Bounced.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], SMTPApiErrors = SMTPApiErrors.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], SpamComplaints = SpamComplaints.asInstanceOf[js.Any], SpamComplaintsRate = SpamComplaintsRate.asInstanceOf[js.Any], TotalClicks = TotalClicks.asInstanceOf[js.Any], TotalTrackedLinksSent = TotalTrackedLinksSent.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any], UniqueLinksClicked = UniqueLinksClicked.asInstanceOf[js.Any], UniqueOpens = UniqueOpens.asInstanceOf[js.Any], WithClientRecorded = WithClientRecorded.asInstanceOf[js.Any], WithLinkTracking = WithLinkTracking.asInstanceOf[js.Any], WithOpenTracking = WithOpenTracking.asInstanceOf[js.Any], WithPlatformRecorded = WithPlatformRecorded.asInstanceOf[js.Any], WithReadTimeRecorded = WithReadTimeRecorded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutboundStatistics]
  }
}

