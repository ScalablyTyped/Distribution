package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Evaluation result.
    */
  var result: RemoteObject
}

object EvaluateReturnType {
  @scala.inline
  def apply(result: RemoteObject, exceptionDetails: ExceptionDetails = null): EvaluateReturnType = {
    val __obj = js.Dynamic.literal(result = result)
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails)
    __obj.asInstanceOf[EvaluateReturnType]
  }
}

