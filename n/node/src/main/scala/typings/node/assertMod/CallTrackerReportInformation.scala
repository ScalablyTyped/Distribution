package typings.node.assertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallTrackerReportInformation extends js.Object {
  
  /** The actual number of times the function was called. */
  var actual: Double = js.native
  
  /** The number of times the function was expected to be called. */
  var expected: Double = js.native
  
  var message: String = js.native
  
  /** The name of the function that is wrapped. */
  var operator: String = js.native
  
  /** A stack trace of the function. */
  var stack: js.Object = js.native
}
object CallTrackerReportInformation {
  
  @scala.inline
  def apply(actual: Double, expected: Double, message: String, operator: String, stack: js.Object): CallTrackerReportInformation = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallTrackerReportInformation]
  }
  
  @scala.inline
  implicit class CallTrackerReportInformationOps[Self <: CallTrackerReportInformation] (val x: Self) extends AnyVal {
    
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
    def setActual(value: Double): Self = this.set("actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: Double): Self = this.set("expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: js.Object): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
}
