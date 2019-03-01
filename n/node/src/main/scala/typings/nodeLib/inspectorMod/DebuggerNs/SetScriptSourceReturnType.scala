package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScriptSourceReturnType extends js.Object {
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
    * New stack trace in case editing has happened while VM was stopped.
    */
  var callFrames: js.UndefOr[js.Array[CallFrame]] = js.undefined
  /**
    * Exception details if any.
    */
  var exceptionDetails: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.ExceptionDetails] = js.undefined
  /**
    * Whether current call stack  was modified after applying the changes.
    */
  var stackChanged: js.UndefOr[scala.Boolean] = js.undefined
}

object SetScriptSourceReturnType {
  @scala.inline
  def apply(
    asyncStackTrace: nodeLib.inspectorMod.RuntimeNs.StackTrace = null,
    asyncStackTraceId: nodeLib.inspectorMod.RuntimeNs.StackTraceId = null,
    callFrames: js.Array[CallFrame] = null,
    exceptionDetails: nodeLib.inspectorMod.RuntimeNs.ExceptionDetails = null,
    stackChanged: js.UndefOr[scala.Boolean] = js.undefined
  ): SetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal()
    if (asyncStackTrace != null) __obj.updateDynamic("asyncStackTrace")(asyncStackTrace)
    if (asyncStackTraceId != null) __obj.updateDynamic("asyncStackTraceId")(asyncStackTraceId)
    if (callFrames != null) __obj.updateDynamic("callFrames")(callFrames)
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails)
    if (!js.isUndefined(stackChanged)) __obj.updateDynamic("stackChanged")(stackChanged)
    __obj.asInstanceOf[SetScriptSourceReturnType]
  }
}

