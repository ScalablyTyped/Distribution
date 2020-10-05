package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import typings.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestartFrameReturnType extends js.Object {
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.native
  /**
    * Async stack trace, if any.
    * @experimental
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.native
  /**
    * New stack trace.
    */
  var callFrames: js.Array[CallFrame] = js.native
}

object RestartFrameReturnType {
  @scala.inline
  def apply(callFrames: js.Array[CallFrame]): RestartFrameReturnType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameReturnType]
  }
  @scala.inline
  implicit class RestartFrameReturnTypeOps[Self <: RestartFrameReturnType] (val x: Self) extends AnyVal {
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
    def setCallFramesVarargs(value: CallFrame*): Self = this.set("callFrames", js.Array(value :_*))
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = this.set("callFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncStackTrace(value: StackTrace): Self = this.set("asyncStackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncStackTrace: Self = this.set("asyncStackTrace", js.undefined)
    @scala.inline
    def setAsyncStackTraceId(value: StackTraceId): Self = this.set("asyncStackTraceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncStackTraceId: Self = this.set("asyncStackTraceId", js.undefined)
  }
  
}

