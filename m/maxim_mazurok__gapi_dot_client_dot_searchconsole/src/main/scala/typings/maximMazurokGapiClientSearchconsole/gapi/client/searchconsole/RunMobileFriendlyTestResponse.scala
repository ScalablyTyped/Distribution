package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunMobileFriendlyTestResponse extends StObject {
  
  /** Test verdict, whether the page is mobile friendly or not. */
  var mobileFriendliness: js.UndefOr[String] = js.undefined
  
  /** List of mobile-usability issues. */
  var mobileFriendlyIssues: js.UndefOr[js.Array[MobileFriendlyIssue]] = js.undefined
  
  /** Information about embedded resources issues. */
  var resourceIssues: js.UndefOr[js.Array[ResourceIssue]] = js.undefined
  
  /** Screenshot of the requested URL. */
  var screenshot: js.UndefOr[Image] = js.undefined
  
  /** Final state of the test, can be either complete or an error. */
  var testStatus: js.UndefOr[TestStatus] = js.undefined
}
object RunMobileFriendlyTestResponse {
  
  @scala.inline
  def apply(): RunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunMobileFriendlyTestResponse]
  }
  
  @scala.inline
  implicit class RunMobileFriendlyTestResponseMutableBuilder[Self <: RunMobileFriendlyTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobileFriendliness(value: String): Self = StObject.set(x, "mobileFriendliness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileFriendlinessUndefined: Self = StObject.set(x, "mobileFriendliness", js.undefined)
    
    @scala.inline
    def setMobileFriendlyIssues(value: js.Array[MobileFriendlyIssue]): Self = StObject.set(x, "mobileFriendlyIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileFriendlyIssuesUndefined: Self = StObject.set(x, "mobileFriendlyIssues", js.undefined)
    
    @scala.inline
    def setMobileFriendlyIssuesVarargs(value: MobileFriendlyIssue*): Self = StObject.set(x, "mobileFriendlyIssues", js.Array(value :_*))
    
    @scala.inline
    def setResourceIssues(value: js.Array[ResourceIssue]): Self = StObject.set(x, "resourceIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIssuesUndefined: Self = StObject.set(x, "resourceIssues", js.undefined)
    
    @scala.inline
    def setResourceIssuesVarargs(value: ResourceIssue*): Self = StObject.set(x, "resourceIssues", js.Array(value :_*))
    
    @scala.inline
    def setScreenshot(value: Image): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
    
    @scala.inline
    def setTestStatus(value: TestStatus): Self = StObject.set(x, "testStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStatusUndefined: Self = StObject.set(x, "testStatus", js.undefined)
  }
}
