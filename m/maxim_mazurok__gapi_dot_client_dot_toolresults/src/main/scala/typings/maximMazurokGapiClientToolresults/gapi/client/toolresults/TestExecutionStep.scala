package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestExecutionStep extends StObject {
  
  /**
    * Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to
    * assist debugging. - In response: present if set by create or update - In create/update request: optional
    */
  var testIssues: js.UndefOr[js.Array[TestIssue]] = js.undefined
  
  /**
    * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are
    * fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never
    * (use publishXunitXmlFiles custom method instead)
    */
  var testSuiteOverviews: js.UndefOr[js.Array[TestSuiteOverview]] = js.undefined
  
  /** The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional */
  var testTiming: js.UndefOr[TestTiming] = js.undefined
  
  /** Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional */
  var toolExecution: js.UndefOr[ToolExecution] = js.undefined
}
object TestExecutionStep {
  
  inline def apply(): TestExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestExecutionStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestExecutionStep] (val x: Self) extends AnyVal {
    
    inline def setTestIssues(value: js.Array[TestIssue]): Self = StObject.set(x, "testIssues", value.asInstanceOf[js.Any])
    
    inline def setTestIssuesUndefined: Self = StObject.set(x, "testIssues", js.undefined)
    
    inline def setTestIssuesVarargs(value: TestIssue*): Self = StObject.set(x, "testIssues", js.Array(value*))
    
    inline def setTestSuiteOverviews(value: js.Array[TestSuiteOverview]): Self = StObject.set(x, "testSuiteOverviews", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteOverviewsUndefined: Self = StObject.set(x, "testSuiteOverviews", js.undefined)
    
    inline def setTestSuiteOverviewsVarargs(value: TestSuiteOverview*): Self = StObject.set(x, "testSuiteOverviews", js.Array(value*))
    
    inline def setTestTiming(value: TestTiming): Self = StObject.set(x, "testTiming", value.asInstanceOf[js.Any])
    
    inline def setTestTimingUndefined: Self = StObject.set(x, "testTiming", js.undefined)
    
    inline def setToolExecution(value: ToolExecution): Self = StObject.set(x, "toolExecution", value.asInstanceOf[js.Any])
    
    inline def setToolExecutionUndefined: Self = StObject.set(x, "toolExecution", js.undefined)
  }
}
