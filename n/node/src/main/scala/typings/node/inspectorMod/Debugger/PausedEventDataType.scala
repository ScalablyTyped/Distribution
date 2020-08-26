package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import typings.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PausedEventDataType extends js.Object {
  /**
    * Just scheduled async call will have this stack trace as parent stack during async execution. This field is available only after <code>Debugger.stepInto</code> call with <code>breakOnAsynCall</code> flag.
    * @experimental
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.native
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
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame] = js.native
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[js.Object] = js.native
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Pause reason.
    */
  var reason: String = js.native
}

object PausedEventDataType {
  @scala.inline
  def apply(callFrames: js.Array[CallFrame], reason: String): PausedEventDataType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PausedEventDataType]
  }
  @scala.inline
  implicit class PausedEventDataTypeOps[Self <: PausedEventDataType] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncCallStackTraceId(value: StackTraceId): Self = this.set("asyncCallStackTraceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncCallStackTraceId: Self = this.set("asyncCallStackTraceId", js.undefined)
    @scala.inline
    def setAsyncStackTrace(value: StackTrace): Self = this.set("asyncStackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncStackTrace: Self = this.set("asyncStackTrace", js.undefined)
    @scala.inline
    def setAsyncStackTraceId(value: StackTraceId): Self = this.set("asyncStackTraceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncStackTraceId: Self = this.set("asyncStackTraceId", js.undefined)
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHitBreakpointsVarargs(value: String*): Self = this.set("hitBreakpoints", js.Array(value :_*))
    @scala.inline
    def setHitBreakpoints(value: js.Array[String]): Self = this.set("hitBreakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitBreakpoints: Self = this.set("hitBreakpoints", js.undefined)
  }
  
}

