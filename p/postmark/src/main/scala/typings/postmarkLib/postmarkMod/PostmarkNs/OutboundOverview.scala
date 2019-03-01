package typings
package postmarkLib.postmarkMod.PostmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BounceRate")(BounceRate)
    __obj.updateDynamic("Bounced")(Bounced)
    __obj.updateDynamic("Opens")(Opens)
    __obj.updateDynamic("SMTPApiErrors")(SMTPApiErrors)
    __obj.updateDynamic("Sent")(Sent)
    __obj.updateDynamic("SpamComplaints")(SpamComplaints)
    __obj.updateDynamic("SpamComplaintsRate")(SpamComplaintsRate)
    __obj.updateDynamic("TotalClicks")(TotalClicks)
    __obj.updateDynamic("TotalTrackedLinksSent")(TotalTrackedLinksSent)
    __obj.updateDynamic("Tracked")(Tracked)
    __obj.updateDynamic("UniqueLinksClicked")(UniqueLinksClicked)
    __obj.updateDynamic("UniqueOpens")(UniqueOpens)
    __obj.updateDynamic("WithClientRecorded")(WithClientRecorded)
    __obj.updateDynamic("WithLinkTracking")(WithLinkTracking)
    __obj.updateDynamic("WithOpenTracking")(WithOpenTracking)
    __obj.updateDynamic("WithPlatformRecorded")(WithPlatformRecorded)
    __obj.updateDynamic("WithReadTimeRecorded")(WithReadTimeRecorded)
    __obj.asInstanceOf[OutboundOverview]
  }
}

