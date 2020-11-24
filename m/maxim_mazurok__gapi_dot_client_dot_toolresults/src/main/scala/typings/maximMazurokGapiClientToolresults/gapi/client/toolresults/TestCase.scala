package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCase extends js.Object {
  
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
  implicit class TestCaseOps[Self <: TestCase] (val x: Self) extends AnyVal {
    
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
    def setElapsedTime(value: Duration): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTime: Self = this.set("elapsedTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setSkippedMessage(value: String): Self = this.set("skippedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippedMessage: Self = this.set("skippedMessage", js.undefined)
    
    @scala.inline
    def setStackTracesVarargs(value: StackTrace*): Self = this.set("stackTraces", js.Array(value :_*))
    
    @scala.inline
    def setStackTraces(value: js.Array[StackTrace]): Self = this.set("stackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTraces: Self = this.set("stackTraces", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTestCaseId(value: String): Self = this.set("testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseId: Self = this.set("testCaseId", js.undefined)
    
    @scala.inline
    def setTestCaseReference(value: TestCaseReference): Self = this.set("testCaseReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseReference: Self = this.set("testCaseReference", js.undefined)
    
    @scala.inline
    def setToolOutputsVarargs(value: ToolOutputReference*): Self = this.set("toolOutputs", js.Array(value :_*))
    
    @scala.inline
    def setToolOutputs(value: js.Array[ToolOutputReference]): Self = this.set("toolOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolOutputs: Self = this.set("toolOutputs", js.undefined)
  }
}
