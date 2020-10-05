package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PauseOnAsyncCallParameterType extends js.Object {
  /**
    * Debugger will pause when async call with given stack trace is started.
    */
  var parentStackTraceId: StackTraceId = js.native
}

object PauseOnAsyncCallParameterType {
  @scala.inline
  def apply(parentStackTraceId: StackTraceId): PauseOnAsyncCallParameterType = {
    val __obj = js.Dynamic.literal(parentStackTraceId = parentStackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseOnAsyncCallParameterType]
  }
  @scala.inline
  implicit class PauseOnAsyncCallParameterTypeOps[Self <: PauseOnAsyncCallParameterType] (val x: Self) extends AnyVal {
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
    def setParentStackTraceId(value: StackTraceId): Self = this.set("parentStackTraceId", value.asInstanceOf[js.Any])
  }
  
}

