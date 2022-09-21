package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpInspectionResult extends StObject {
  
  /** Index status of the AMP URL. */
  var ampIndexStatusVerdict: js.UndefOr[String] = js.undefined
  
  /** URL of the AMP that was inspected. If the submitted URL is a desktop page that refers to an AMP version, the AMP version will be inspected. */
  var ampUrl: js.UndefOr[String] = js.undefined
  
  /** Whether or not the page blocks indexing through a noindex rule. */
  var indexingState: js.UndefOr[String] = js.undefined
  
  /** A list of zero or more AMP issues found for the inspected URL. */
  var issues: js.UndefOr[js.Array[AmpIssue]] = js.undefined
  
  /** Last time this AMP version was crawled by Google. Absent if the URL was never crawled successfully. */
  var lastCrawlTime: js.UndefOr[String] = js.undefined
  
  /** Whether or not Google could fetch the AMP. */
  var pageFetchState: js.UndefOr[String] = js.undefined
  
  /** Whether or not the page is blocked to Google by a robots.txt rule. */
  var robotsTxtState: js.UndefOr[String] = js.undefined
  
  /** The status of the most severe error on the page. If a page has both warnings and errors, the page status is error. Error status means the page cannot be shown in Search results. */
  var verdict: js.UndefOr[String] = js.undefined
}
object AmpInspectionResult {
  
  inline def apply(): AmpInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpInspectionResult]
  }
  
  extension [Self <: AmpInspectionResult](x: Self) {
    
    inline def setAmpIndexStatusVerdict(value: String): Self = StObject.set(x, "ampIndexStatusVerdict", value.asInstanceOf[js.Any])
    
    inline def setAmpIndexStatusVerdictUndefined: Self = StObject.set(x, "ampIndexStatusVerdict", js.undefined)
    
    inline def setAmpUrl(value: String): Self = StObject.set(x, "ampUrl", value.asInstanceOf[js.Any])
    
    inline def setAmpUrlUndefined: Self = StObject.set(x, "ampUrl", js.undefined)
    
    inline def setIndexingState(value: String): Self = StObject.set(x, "indexingState", value.asInstanceOf[js.Any])
    
    inline def setIndexingStateUndefined: Self = StObject.set(x, "indexingState", js.undefined)
    
    inline def setIssues(value: js.Array[AmpIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: AmpIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setLastCrawlTime(value: String): Self = StObject.set(x, "lastCrawlTime", value.asInstanceOf[js.Any])
    
    inline def setLastCrawlTimeUndefined: Self = StObject.set(x, "lastCrawlTime", js.undefined)
    
    inline def setPageFetchState(value: String): Self = StObject.set(x, "pageFetchState", value.asInstanceOf[js.Any])
    
    inline def setPageFetchStateUndefined: Self = StObject.set(x, "pageFetchState", js.undefined)
    
    inline def setRobotsTxtState(value: String): Self = StObject.set(x, "robotsTxtState", value.asInstanceOf[js.Any])
    
    inline def setRobotsTxtStateUndefined: Self = StObject.set(x, "robotsTxtState", js.undefined)
    
    inline def setVerdict(value: String): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
