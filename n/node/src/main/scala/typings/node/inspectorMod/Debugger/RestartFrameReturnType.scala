package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import typings.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestartFrameReturnType extends js.Object {
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
    * New stack trace.
    */
  var callFrames: js.Array[CallFrame]
}

object RestartFrameReturnType {
  @scala.inline
  def apply(
    callFrames: js.Array[CallFrame],
    asyncStackTrace: StackTrace = null,
    asyncStackTraceId: StackTraceId = null
  ): RestartFrameReturnType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames)
    if (asyncStackTrace != null) __obj.updateDynamic("asyncStackTrace")(asyncStackTrace)
    if (asyncStackTraceId != null) __obj.updateDynamic("asyncStackTraceId")(asyncStackTraceId)
    __obj.asInstanceOf[RestartFrameReturnType]
  }
}

