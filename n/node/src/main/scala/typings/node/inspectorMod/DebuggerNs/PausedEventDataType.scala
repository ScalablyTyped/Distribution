package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.StackTrace
import typings.node.inspectorMod.RuntimeNs.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PausedEventDataType extends js.Object {
  /**
    * Just scheduled async call will have this stack trace as parent stack during async execution. This field is available only after <code>Debugger.stepInto</code> call with <code>breakOnAsynCall</code> flag.
    * @experimental
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.undefined
  /**
    * Async stack trace, if any.
    * @experimental
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  /**
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame]
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Pause reason.
    */
  var reason: java.lang.String
}

object PausedEventDataType {
  @scala.inline
  def apply(
    callFrames: js.Array[CallFrame],
    reason: java.lang.String,
    asyncCallStackTraceId: StackTraceId = null,
    asyncStackTrace: StackTrace = null,
    asyncStackTraceId: StackTraceId = null,
    data: js.Object = null,
    hitBreakpoints: js.Array[java.lang.String] = null
  ): PausedEventDataType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames, reason = reason)
    if (asyncCallStackTraceId != null) __obj.updateDynamic("asyncCallStackTraceId")(asyncCallStackTraceId)
    if (asyncStackTrace != null) __obj.updateDynamic("asyncStackTrace")(asyncStackTrace)
    if (asyncStackTraceId != null) __obj.updateDynamic("asyncStackTraceId")(asyncStackTraceId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (hitBreakpoints != null) __obj.updateDynamic("hitBreakpoints")(hitBreakpoints)
    __obj.asInstanceOf[PausedEventDataType]
  }
}

