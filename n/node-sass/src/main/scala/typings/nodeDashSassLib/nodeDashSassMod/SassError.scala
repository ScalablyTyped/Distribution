package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassError
  extends nodeLib.Error {
  var column: scala.Double
  var file: java.lang.String
  var line: scala.Double
  var message: java.lang.String
  var status: scala.Double
}

object SassError {
  @scala.inline
  def apply(
    column: scala.Double,
    file: java.lang.String,
    line: scala.Double,
    message: java.lang.String,
    status: scala.Double,
    stack: java.lang.String = null
  ): SassError = {
    val __obj = js.Dynamic.literal(column = column, file = file, line = line, message = message, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SassError]
  }
}

