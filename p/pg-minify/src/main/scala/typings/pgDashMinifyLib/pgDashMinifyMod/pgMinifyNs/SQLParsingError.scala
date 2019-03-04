package typings
package pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLParsingError
  extends stdLib.Error {
  var code: parsingErrorCode
  var error: java.lang.String
  var position: IErrorPosition
  @JSName("stack")
  var stack_SQLParsingError: java.lang.String
}

object SQLParsingError {
  @scala.inline
  def apply(
    code: parsingErrorCode,
    error: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    position: IErrorPosition,
    stack: java.lang.String
  ): SQLParsingError = {
    val __obj = js.Dynamic.literal(code = code, error = error, message = message, name = name, position = position, stack = stack)
  
    __obj.asInstanceOf[SQLParsingError]
  }
}

