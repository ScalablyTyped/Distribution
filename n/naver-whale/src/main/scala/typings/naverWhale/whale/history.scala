package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// History
////////////////////
/**
  * Use the chrome.history API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
  * Availability: Since Chrome 5.
  * Permissions:  "history"
  */
object history {
  
  @js.native
  trait HistoryItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String = js.native
    
    /** Optional. When this page was last loaded, represented in milliseconds since the epoch. */
    var lastVisitTime: js.UndefOr[Double] = js.native
    
    /** Optional. The title of the page when it was last loaded. */
    var title: js.UndefOr[String] = js.native
    
    /** Optional. The number of times the user has navigated to this page by typing in the address. */
    var typedCount: js.UndefOr[Double] = js.native
    
    /** Optional. The URL navigated to by a user. */
    var url: js.UndefOr[String] = js.native
    
    /** Optional. The number of times the user has navigated to this page. */
    var visitCount: js.UndefOr[Double] = js.native
  }
  object HistoryItem {
    
    @scala.inline
    def apply(id: String): HistoryItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryItem]
    }
    
    @scala.inline
    implicit class HistoryItemMutableBuilder[Self <: HistoryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastVisitTime(value: Double): Self = StObject.set(x, "lastVisitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastVisitTimeUndefined: Self = StObject.set(x, "lastVisitTime", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTypedCount(value: Double): Self = StObject.set(x, "typedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypedCountUndefined: Self = StObject.set(x, "typedCount", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVisitCount(value: Double): Self = StObject.set(x, "visitCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitCountUndefined: Self = StObject.set(x, "visitCount", js.undefined)
    }
  }
  
  @js.native
  trait HistoryQuery extends StObject {
    
    /** Optional. Limit results to those visited before this date, represented in milliseconds since the epoch. */
    var endTime: js.UndefOr[Double] = js.native
    
    /** Optional. The maximum number of results to retrieve. Defaults to 100. */
    var maxResults: js.UndefOr[Double] = js.native
    
    /** Optional. Limit results to those visited after this date, represented in milliseconds since the epoch. */
    var startTime: js.UndefOr[Double] = js.native
    
    /** A free-text query to the history service. Leave empty to retrieve all pages. */
    var text: String = js.native
  }
  object HistoryQuery {
    
    @scala.inline
    def apply(text: String): HistoryQuery = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryQuery]
    }
    
    @scala.inline
    implicit class HistoryQueryMutableBuilder[Self <: HistoryQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type HistoryVisitRemovedEvent = Event[js.Function1[/* removed */ typings.chrome.chrome.history.RemovedResult, Unit]]
  
  type HistoryVisitedEvent = Event[js.Function1[/* result */ typings.chrome.chrome.history.HistoryItem, Unit]]
  
  @js.native
  trait Range extends StObject {
    
    /** Items added to history before this date, represented in milliseconds since the epoch. */
    var endTime: Double = js.native
    
    /** Items added to history after this date, represented in milliseconds since the epoch. */
    var startTime: Double = js.native
  }
  object Range {
    
    @scala.inline
    def apply(endTime: Double, startTime: Double): Range = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemovedResult extends StObject {
    
    /** True if all history was removed. If true, then urls will be empty. */
    var allHistory: Boolean = js.native
    
    /** Optional. */
    var urls: js.UndefOr[js.Array[String]] = js.native
  }
  object RemovedResult {
    
    @scala.inline
    def apply(allHistory: Boolean): RemovedResult = {
      val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovedResult]
    }
    
    @scala.inline
    implicit class RemovedResultMutableBuilder[Self <: RemovedResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllHistory(value: Boolean): Self = StObject.set(x, "allHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    /** The URL for the operation. It must be in the format as returned from a call to history.search. */
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VisitItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String = js.native
    
    /** The visit ID of the referrer. */
    var referringVisitId: String = js.native
    
    /** The transition type for this visit from its referrer. */
    var transition: String = js.native
    
    /** The unique identifier for this visit. */
    var visitId: String = js.native
    
    /** Optional. When this visit occurred, represented in milliseconds since the epoch. */
    var visitTime: js.UndefOr[Double] = js.native
  }
  object VisitItem {
    
    @scala.inline
    def apply(id: String, referringVisitId: String, transition: String, visitId: String): VisitItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referringVisitId = referringVisitId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visitId = visitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitItem]
    }
    
    @scala.inline
    implicit class VisitItemMutableBuilder[Self <: VisitItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferringVisitId(value: String): Self = StObject.set(x, "referringVisitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitId(value: String): Self = StObject.set(x, "visitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTime(value: Double): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
    }
  }
}
