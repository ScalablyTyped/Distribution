package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestExecutionStep extends js.Object {
  
  /**
    * Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to
    * assist debugging. - In response: present if set by create or update - In create/update request: optional
    */
  var testIssues: js.UndefOr[js.Array[TestIssue]] = js.native
  
  /**
    * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are
    * fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never
    * (use publishXunitXmlFiles custom method instead)
    */
  var testSuiteOverviews: js.UndefOr[js.Array[TestSuiteOverview]] = js.native
  
  /** The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional */
  var testTiming: js.UndefOr[TestTiming] = js.native
  
  /** Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional */
  var toolExecution: js.UndefOr[ToolExecution] = js.native
}
object TestExecutionStep {
  
  @scala.inline
  def apply(): TestExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestExecutionStep]
  }
  
  @scala.inline
  implicit class TestExecutionStepOps[Self <: TestExecutionStep] (val x: Self) extends AnyVal {
    
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
    def setTestIssuesVarargs(value: TestIssue*): Self = this.set("testIssues", js.Array(value :_*))
    
    @scala.inline
    def setTestIssues(value: js.Array[TestIssue]): Self = this.set("testIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestIssues: Self = this.set("testIssues", js.undefined)
    
    @scala.inline
    def setTestSuiteOverviewsVarargs(value: TestSuiteOverview*): Self = this.set("testSuiteOverviews", js.Array(value :_*))
    
    @scala.inline
    def setTestSuiteOverviews(value: js.Array[TestSuiteOverview]): Self = this.set("testSuiteOverviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSuiteOverviews: Self = this.set("testSuiteOverviews", js.undefined)
    
    @scala.inline
    def setTestTiming(value: TestTiming): Self = this.set("testTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTiming: Self = this.set("testTiming", js.undefined)
    
    @scala.inline
    def setToolExecution(value: ToolExecution): Self = this.set("toolExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolExecution: Self = this.set("toolExecution", js.undefined)
  }
}
