package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionThrownEventDataType extends js.Object {
  var exceptionDetails: ExceptionDetails
  /**
    * Timestamp of the exception.
    */
  var timestamp: Timestamp
}

object ExceptionThrownEventDataType {
  @scala.inline
  def apply(exceptionDetails: ExceptionDetails, timestamp: Timestamp): ExceptionThrownEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exceptionDetails")(exceptionDetails)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[ExceptionThrownEventDataType]
  }
}

