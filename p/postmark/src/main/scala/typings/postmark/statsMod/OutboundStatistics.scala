package typings.postmark.statsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundStatistics extends js.Object {
  var BounceRate: Double = js.native
  var Bounced: Double = js.native
  var Opens: Double = js.native
  var SMTPApiErrors: Double = js.native
  var Sent: Double = js.native
  var SpamComplaints: Double = js.native
  var SpamComplaintsRate: Double = js.native
  var TotalClicks: Double = js.native
  var TotalTrackedLinksSent: Double = js.native
  var Tracked: Double = js.native
  var UniqueLinksClicked: Double = js.native
  var UniqueOpens: Double = js.native
  var WithClientRecorded: Double = js.native
  var WithLinkTracking: Double = js.native
  var WithOpenTracking: Double = js.native
  var WithPlatformRecorded: Double = js.native
  var WithReadTimeRecorded: Double = js.native
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
  @scala.inline
  implicit class OutboundStatisticsOps[Self <: OutboundStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBounceRate(value: Double): Self = this.set("BounceRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounced(value: Double): Self = this.set("Bounced", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpens(value: Double): Self = this.set("Opens", value.asInstanceOf[js.Any])
    @scala.inline
    def setSMTPApiErrors(value: Double): Self = this.set("SMTPApiErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setSent(value: Double): Self = this.set("Sent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpamComplaints(value: Double): Self = this.set("SpamComplaints", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpamComplaintsRate(value: Double): Self = this.set("SpamComplaintsRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalClicks(value: Double): Self = this.set("TotalClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalTrackedLinksSent(value: Double): Self = this.set("TotalTrackedLinksSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracked(value: Double): Self = this.set("Tracked", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueLinksClicked(value: Double): Self = this.set("UniqueLinksClicked", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueOpens(value: Double): Self = this.set("UniqueOpens", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithClientRecorded(value: Double): Self = this.set("WithClientRecorded", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithLinkTracking(value: Double): Self = this.set("WithLinkTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithOpenTracking(value: Double): Self = this.set("WithOpenTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithPlatformRecorded(value: Double): Self = this.set("WithPlatformRecorded", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithReadTimeRecorded(value: Double): Self = this.set("WithReadTimeRecorded", value.asInstanceOf[js.Any])
  }
  
}

