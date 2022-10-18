package typings.postmark

import org.scalablytyped.runtime.StringDictionary
import typings.postmark.anon.Clicks
import typings.postmark.anon.Date
import typings.postmark.anon.Desktop
import typings.postmark.anon.Dictkey
import typings.postmark.anon.Mobile
import typings.postmark.anon.Opens
import typings.postmark.anon.Sent
import typings.postmark.anon.SpamComplaint
import typings.postmark.anon.Tracked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsStatsStatsMod {
  
  type BounceCounts = StringDictionary[Any]
  
  trait BrowserUsageCounts
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var Days: js.Array[Dictkey]
  }
  object BrowserUsageCounts {
    
    inline def apply(Days: js.Array[Dictkey]): BrowserUsageCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserUsageCounts]
    }
    
    extension [Self <: BrowserUsageCounts](x: Self) {
      
      inline def setDays(value: js.Array[Dictkey]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Dictkey*): Self = StObject.set(x, "Days", js.Array(value*))
    }
  }
  
  trait ClickCounts extends StObject {
    
    var Clicks: Double
    
    var Days: js.Array[Clicks]
    
    var Unique: Double
  }
  object ClickCounts {
    
    inline def apply(Clicks: Double, Days: js.Array[Clicks], Unique: Double): ClickCounts = {
      val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickCounts]
    }
    
    extension [Self <: ClickCounts](x: Self) {
      
      inline def setClicks(value: Double): Self = StObject.set(x, "Clicks", value.asInstanceOf[js.Any])
      
      inline def setDays(value: js.Array[Clicks]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Clicks*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setUnique(value: Double): Self = StObject.set(x, "Unique", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClickLocationCounts extends StObject {
    
    var Days: js.Array[Date]
    
    var HTML: Double
    
    var Text: Double
  }
  object ClickLocationCounts {
    
    inline def apply(Days: js.Array[Date], HTML: Double, Text: Double): ClickLocationCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickLocationCounts]
    }
    
    extension [Self <: ClickLocationCounts](x: Self) {
      
      inline def setDays(value: js.Array[Date]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Date*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setHTML(value: Double): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
      
      inline def setText(value: Double): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClickPlatformUsageCounts extends StObject {
    
    var Days: js.Array[Desktop]
    
    var Desktop: Double
    
    var Mobile: Double
    
    var Unknown: Double
  }
  object ClickPlatformUsageCounts {
    
    inline def apply(Days: js.Array[Desktop], Desktop: Double, Mobile: Double, Unknown: Double): ClickPlatformUsageCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickPlatformUsageCounts]
    }
    
    extension [Self <: ClickPlatformUsageCounts](x: Self) {
      
      inline def setDays(value: js.Array[Desktop]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Desktop*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setDesktop(value: Double): Self = StObject.set(x, "Desktop", value.asInstanceOf[js.Any])
      
      inline def setMobile(value: Double): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
      
      inline def setUnknown(value: Double): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailClientUsageCounts
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var Days: js.Array[Dictkey]
  }
  object EmailClientUsageCounts {
    
    inline def apply(Days: js.Array[Dictkey]): EmailClientUsageCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailClientUsageCounts]
    }
    
    extension [Self <: EmailClientUsageCounts](x: Self) {
      
      inline def setDays(value: js.Array[Dictkey]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Dictkey*): Self = StObject.set(x, "Days", js.Array(value*))
    }
  }
  
  trait EmailPlaformUsageCounts extends StObject {
    
    var Days: js.Array[Mobile]
    
    var Desktop: js.UndefOr[Double] = js.undefined
    
    var Mobile: js.UndefOr[Double] = js.undefined
    
    var Unknown: js.UndefOr[Double] = js.undefined
    
    var WebMail: js.UndefOr[Double] = js.undefined
  }
  object EmailPlaformUsageCounts {
    
    inline def apply(Days: js.Array[Mobile]): EmailPlaformUsageCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailPlaformUsageCounts]
    }
    
    extension [Self <: EmailPlaformUsageCounts](x: Self) {
      
      inline def setDays(value: js.Array[Mobile]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Mobile*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setDesktop(value: Double): Self = StObject.set(x, "Desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "Desktop", js.undefined)
      
      inline def setMobile(value: Double): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "Mobile", js.undefined)
      
      inline def setUnknown(value: Double): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "Unknown", js.undefined)
      
      inline def setWebMail(value: Double): Self = StObject.set(x, "WebMail", value.asInstanceOf[js.Any])
      
      inline def setWebMailUndefined: Self = StObject.set(x, "WebMail", js.undefined)
    }
  }
  
  trait EmailReadTimesCounts
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var Days: js.Array[Dictkey]
  }
  object EmailReadTimesCounts {
    
    inline def apply(Days: js.Array[Dictkey]): EmailReadTimesCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailReadTimesCounts]
    }
    
    extension [Self <: EmailReadTimesCounts](x: Self) {
      
      inline def setDays(value: js.Array[Dictkey]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Dictkey*): Self = StObject.set(x, "Days", js.Array(value*))
    }
  }
  
  trait OpenCounts extends StObject {
    
    var Days: js.Array[Opens]
    
    var Opens: Double
    
    var Unique: Double
  }
  object OpenCounts {
    
    inline def apply(Days: js.Array[Opens], Opens: Double, Unique: Double): OpenCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenCounts]
    }
    
    extension [Self <: OpenCounts](x: Self) {
      
      inline def setDays(value: js.Array[Opens]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Opens*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setOpens(value: Double): Self = StObject.set(x, "Opens", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Double): Self = StObject.set(x, "Unique", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutboundStatistics extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: OutboundStatistics](x: Self) {
      
      inline def setBounceRate(value: Double): Self = StObject.set(x, "BounceRate", value.asInstanceOf[js.Any])
      
      inline def setBounced(value: Double): Self = StObject.set(x, "Bounced", value.asInstanceOf[js.Any])
      
      inline def setOpens(value: Double): Self = StObject.set(x, "Opens", value.asInstanceOf[js.Any])
      
      inline def setSMTPApiErrors(value: Double): Self = StObject.set(x, "SMTPApiErrors", value.asInstanceOf[js.Any])
      
      inline def setSent(value: Double): Self = StObject.set(x, "Sent", value.asInstanceOf[js.Any])
      
      inline def setSpamComplaints(value: Double): Self = StObject.set(x, "SpamComplaints", value.asInstanceOf[js.Any])
      
      inline def setSpamComplaintsRate(value: Double): Self = StObject.set(x, "SpamComplaintsRate", value.asInstanceOf[js.Any])
      
      inline def setTotalClicks(value: Double): Self = StObject.set(x, "TotalClicks", value.asInstanceOf[js.Any])
      
      inline def setTotalTrackedLinksSent(value: Double): Self = StObject.set(x, "TotalTrackedLinksSent", value.asInstanceOf[js.Any])
      
      inline def setTracked(value: Double): Self = StObject.set(x, "Tracked", value.asInstanceOf[js.Any])
      
      inline def setUniqueLinksClicked(value: Double): Self = StObject.set(x, "UniqueLinksClicked", value.asInstanceOf[js.Any])
      
      inline def setUniqueOpens(value: Double): Self = StObject.set(x, "UniqueOpens", value.asInstanceOf[js.Any])
      
      inline def setWithClientRecorded(value: Double): Self = StObject.set(x, "WithClientRecorded", value.asInstanceOf[js.Any])
      
      inline def setWithLinkTracking(value: Double): Self = StObject.set(x, "WithLinkTracking", value.asInstanceOf[js.Any])
      
      inline def setWithOpenTracking(value: Double): Self = StObject.set(x, "WithOpenTracking", value.asInstanceOf[js.Any])
      
      inline def setWithPlatformRecorded(value: Double): Self = StObject.set(x, "WithPlatformRecorded", value.asInstanceOf[js.Any])
      
      inline def setWithReadTimeRecorded(value: Double): Self = StObject.set(x, "WithReadTimeRecorded", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentCounts extends StObject {
    
    var Days: js.Array[Sent]
    
    var Sent: Double
  }
  object SentCounts {
    
    inline def apply(Days: js.Array[Sent], Sent: Double): SentCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentCounts]
    }
    
    extension [Self <: SentCounts](x: Self) {
      
      inline def setDays(value: js.Array[Sent]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Sent*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setSent(value: Double): Self = StObject.set(x, "Sent", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpamCounts extends StObject {
    
    var Days: js.Array[SpamComplaint]
    
    var SpamComplaint: Double
  }
  object SpamCounts {
    
    inline def apply(Days: js.Array[SpamComplaint], SpamComplaint: Double): SpamCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpamCounts]
    }
    
    extension [Self <: SpamCounts](x: Self) {
      
      inline def setDays(value: js.Array[SpamComplaint]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: SpamComplaint*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setSpamComplaint(value: Double): Self = StObject.set(x, "SpamComplaint", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackedEmailCounts extends StObject {
    
    var Days: js.Array[Tracked]
    
    var Tracked: Double
  }
  object TrackedEmailCounts {
    
    inline def apply(Days: js.Array[Tracked], Tracked: Double): TrackedEmailCounts = {
      val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackedEmailCounts]
    }
    
    extension [Self <: TrackedEmailCounts](x: Self) {
      
      inline def setDays(value: js.Array[Tracked]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      inline def setDaysVarargs(value: Tracked*): Self = StObject.set(x, "Days", js.Array(value*))
      
      inline def setTracked(value: Double): Self = StObject.set(x, "Tracked", value.asInstanceOf[js.Any])
    }
  }
}
