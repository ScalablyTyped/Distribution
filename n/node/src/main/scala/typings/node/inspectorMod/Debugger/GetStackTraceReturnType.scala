package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStackTraceReturnType extends js.Object {
  var stackTrace: StackTrace = js.native
}

object GetStackTraceReturnType {
  @scala.inline
  def apply(stackTrace: StackTrace): GetStackTraceReturnType = {
    val __obj = js.Dynamic.literal(stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceReturnType]
  }
  @scala.inline
  implicit class GetStackTraceReturnTypeOps[Self <: GetStackTraceReturnType] (val x: Self) extends AnyVal {
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
    def setStackTrace(value: StackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
  }
  
}

