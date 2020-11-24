package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRulesetResponse extends js.Object {
  
  /** Syntactic and semantic `Source` issues of varying severity. Issues of `ERROR` severity will prevent tests from executing. */
  var issues: js.UndefOr[js.Array[Issue]] = js.native
  
  /** The set of test results given the test cases in the `TestSuite`. The results will appear in the same order as the test cases appear in the `TestSuite`. */
  var testResults: js.UndefOr[js.Array[TestResult]] = js.native
}
object TestRulesetResponse {
  
  @scala.inline
  def apply(): TestRulesetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRulesetResponse]
  }
  
  @scala.inline
  implicit class TestRulesetResponseOps[Self <: TestRulesetResponse] (val x: Self) extends AnyVal {
    
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
    def setIssuesVarargs(value: Issue*): Self = this.set("issues", js.Array(value :_*))
    
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssues: Self = this.set("issues", js.undefined)
    
    @scala.inline
    def setTestResultsVarargs(value: TestResult*): Self = this.set("testResults", js.Array(value :_*))
    
    @scala.inline
    def setTestResults(value: js.Array[TestResult]): Self = this.set("testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestResults: Self = this.set("testResults", js.undefined)
  }
}
