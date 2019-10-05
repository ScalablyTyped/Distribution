package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwaitPromiseReturnType extends js.Object {
  /**
    * Exception details if stack strace is available.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Promise result. Will contain rejected value if promise was rejected.
    */
  var result: RemoteObject
}

object AwaitPromiseReturnType {
  @scala.inline
  def apply(result: RemoteObject, exceptionDetails: ExceptionDetails = null): AwaitPromiseReturnType = {
    val __obj = js.Dynamic.literal(result = result)
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails)
    __obj.asInstanceOf[AwaitPromiseReturnType]
  }
}

