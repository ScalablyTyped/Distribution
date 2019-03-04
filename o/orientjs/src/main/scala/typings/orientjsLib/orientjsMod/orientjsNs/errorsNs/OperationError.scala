package typings
package orientjsLib.orientjsMod.orientjsNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationError extends BaseError {
  var date: js.Any
  var message: java.lang.String
}

object OperationError {
  @scala.inline
  def apply(
    date: js.Any,
    init: js.Function1[java.lang.String, scala.Unit],
    message: java.lang.String,
    name: java.lang.String
  ): OperationError = {
    val __obj = js.Dynamic.literal(date = date, init = init, message = message, name = name)
  
    __obj.asInstanceOf[OperationError]
  }
}

