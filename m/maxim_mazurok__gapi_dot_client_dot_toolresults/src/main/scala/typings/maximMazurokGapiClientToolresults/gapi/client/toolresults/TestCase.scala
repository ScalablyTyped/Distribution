package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCase extends StObject {
  
  /** The elapsed run time of the test case. Required. */
  var elapsedTime: js.UndefOr[Duration] = js.native
  
  /** The end time of the test case. */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /** Why the test case was skipped. Present only for skipped test case */
  var skippedMessage: js.UndefOr[String] = js.native
  
  /**
    * The stack trace details if the test case failed or encountered an error. The maximum size of the stack traces is 100KiB, beyond which the stack track will be truncated. Zero if the
    * test case passed.
    */
  var stackTraces: js.UndefOr[js.Array[StackTrace]] = js.native
  
  /** The start time of the test case. */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  /** The status of the test case. Required. */
  var status: js.UndefOr[String] = js.native
  
  /** A unique identifier within a Step for this Test Case. */
  var testCaseId: js.UndefOr[String] = js.native
  
  /** Test case reference, e.g. name, class name and test suite name. Required. */
  var testCaseReference: js.UndefOr[TestCaseReference] = js.native
  
  /** References to opaque files of any format output by the tool execution. @OutputOnly */
  var toolOutputs: js.UndefOr[js.Array[ToolOutputReference]] = js.native
}
object TestCase {
  
  @scala.inline
  def apply(): TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCase]
  }
  
  @scala.inline
  implicit class TestCaseMutableBuilder[Self <: TestCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsedTime(value: Duration): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setSkippedMessage(value: String): Self = StObject.set(x, "skippedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedMessageUndefined: Self = StObject.set(x, "skippedMessage", js.undefined)
    
    @scala.inline
    def setStackTraces(value: js.Array[StackTrace]): Self = StObject.set(x, "stackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTracesUndefined: Self = StObject.set(x, "stackTraces", js.undefined)
    
    @scala.inline
    def setStackTracesVarargs(value: StackTrace*): Self = StObject.set(x, "stackTraces", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
    
    @scala.inline
    def setTestCaseReference(value: TestCaseReference): Self = StObject.set(x, "testCaseReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseReferenceUndefined: Self = StObject.set(x, "testCaseReference", js.undefined)
    
    @scala.inline
    def setToolOutputs(value: js.Array[ToolOutputReference]): Self = StObject.set(x, "toolOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolOutputsUndefined: Self = StObject.set(x, "toolOutputs", js.undefined)
    
    @scala.inline
    def setToolOutputsVarargs(value: ToolOutputReference*): Self = StObject.set(x, "toolOutputs", js.Array(value :_*))
  }
}
