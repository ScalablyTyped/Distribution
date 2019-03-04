package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestartFrameReturnType extends js.Object {
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.StackTrace] = js.undefined
  /**
    * Async stack trace, if any.
    * @experimental
    */
  var asyncStackTraceId: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.StackTraceId] = js.undefined
  /**
    * New stack trace.
    */
  var callFrames: js.Array[CallFrame]
}

object RestartFrameReturnType {
  @scala.inline
  def apply(
    callFrames: js.Array[CallFrame],
    asyncStackTrace: nodeLib.inspectorMod.RuntimeNs.StackTrace = null,
    asyncStackTraceId: nodeLib.inspectorMod.RuntimeNs.StackTraceId = null
  ): RestartFrameReturnType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames)
    if (asyncStackTrace != null) __obj.updateDynamic("asyncStackTrace")(asyncStackTrace)
    if (asyncStackTraceId != null) __obj.updateDynamic("asyncStackTraceId")(asyncStackTraceId)
    __obj.asInstanceOf[RestartFrameReturnType]
  }
}

