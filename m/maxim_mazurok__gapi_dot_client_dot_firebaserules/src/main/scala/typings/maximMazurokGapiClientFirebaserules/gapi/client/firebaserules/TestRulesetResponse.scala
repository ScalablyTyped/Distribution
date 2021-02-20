package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRulesetResponse extends StObject {
  
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
  implicit class TestRulesetResponseMutableBuilder[Self <: TestRulesetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setTestResults(value: js.Array[TestResult]): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsUndefined: Self = StObject.set(x, "testResults", js.undefined)
    
    @scala.inline
    def setTestResultsVarargs(value: TestResult*): Self = StObject.set(x, "testResults", js.Array(value :_*))
  }
}
