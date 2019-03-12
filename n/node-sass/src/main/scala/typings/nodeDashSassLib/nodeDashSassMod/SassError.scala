package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassError
  extends stdLib.Error {
  var column: scala.Double
  var file: java.lang.String
  var line: scala.Double
  var status: scala.Double
}

object SassError {
  @scala.inline
  def apply(
    column: scala.Double,
    file: java.lang.String,
    line: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    status: scala.Double,
    stack: java.lang.String = null
  ): SassError = {
    val __obj = js.Dynamic.literal(column = column, file = file, line = line, message = message, name = name, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SassError]
  }
}

