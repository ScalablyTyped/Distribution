package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunMobileFriendlyTestResponse extends js.Object {
  
  /** Test verdict, whether the page is mobile friendly or not. */
  var mobileFriendliness: js.UndefOr[String] = js.native
  
  /** List of mobile-usability issues. */
  var mobileFriendlyIssues: js.UndefOr[js.Array[MobileFriendlyIssue]] = js.native
  
  /** Information about embedded resources issues. */
  var resourceIssues: js.UndefOr[js.Array[ResourceIssue]] = js.native
  
  /** Screenshot of the requested URL. */
  var screenshot: js.UndefOr[Image] = js.native
  
  /** Final state of the test, can be either complete or an error. */
  var testStatus: js.UndefOr[TestStatus] = js.native
}
object RunMobileFriendlyTestResponse {
  
  @scala.inline
  def apply(): RunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunMobileFriendlyTestResponse]
  }
  
  @scala.inline
  implicit class RunMobileFriendlyTestResponseOps[Self <: RunMobileFriendlyTestResponse] (val x: Self) extends AnyVal {
    
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
    def setMobileFriendliness(value: String): Self = this.set("mobileFriendliness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileFriendliness: Self = this.set("mobileFriendliness", js.undefined)
    
    @scala.inline
    def setMobileFriendlyIssuesVarargs(value: MobileFriendlyIssue*): Self = this.set("mobileFriendlyIssues", js.Array(value :_*))
    
    @scala.inline
    def setMobileFriendlyIssues(value: js.Array[MobileFriendlyIssue]): Self = this.set("mobileFriendlyIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileFriendlyIssues: Self = this.set("mobileFriendlyIssues", js.undefined)
    
    @scala.inline
    def setResourceIssuesVarargs(value: ResourceIssue*): Self = this.set("resourceIssues", js.Array(value :_*))
    
    @scala.inline
    def setResourceIssues(value: js.Array[ResourceIssue]): Self = this.set("resourceIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIssues: Self = this.set("resourceIssues", js.undefined)
    
    @scala.inline
    def setScreenshot(value: Image): Self = this.set("screenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshot: Self = this.set("screenshot", js.undefined)
    
    @scala.inline
    def setTestStatus(value: TestStatus): Self = this.set("testStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestStatus: Self = this.set("testStatus", js.undefined)
  }
}
