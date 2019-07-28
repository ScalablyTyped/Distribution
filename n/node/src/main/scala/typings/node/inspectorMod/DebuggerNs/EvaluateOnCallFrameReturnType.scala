package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.ExceptionDetails
import typings.node.inspectorMod.RuntimeNs.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateOnCallFrameReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Object wrapper for the evaluation result.
    */
  var result: RemoteObject
}

object EvaluateOnCallFrameReturnType {
  @scala.inline
  def apply(result: RemoteObject, exceptionDetails: ExceptionDetails = null): EvaluateOnCallFrameReturnType = {
    val __obj = js.Dynamic.literal(result = result)
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails)
    __obj.asInstanceOf[EvaluateOnCallFrameReturnType]
  }
}

