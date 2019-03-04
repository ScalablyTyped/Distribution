package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateOnCallFrameReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[nodeLib.inspectorMod.RuntimeNs.ExceptionDetails] = js.undefined
  /**
    * Object wrapper for the evaluation result.
    */
  var result: nodeLib.inspectorMod.RuntimeNs.RemoteObject
}

object EvaluateOnCallFrameReturnType {
  @scala.inline
  def apply(
    result: nodeLib.inspectorMod.RuntimeNs.RemoteObject,
    exceptionDetails: nodeLib.inspectorMod.RuntimeNs.ExceptionDetails = null
  ): EvaluateOnCallFrameReturnType = {
    val __obj = js.Dynamic.literal(result = result)
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails)
    __obj.asInstanceOf[EvaluateOnCallFrameReturnType]
  }
}

