package typings.nodeDashSass.nodeDashSassMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassError extends Error {
  var column: Double
  var file: String
  var line: Double
  var status: Double
}

object SassError {
  @scala.inline
  def apply(
    column: Double,
    file: String,
    line: Double,
    message: String,
    name: String,
    status: Double,
    stack: String = null
  ): SassError = {
    val __obj = js.Dynamic.literal(column = column, file = file, line = line, message = message, name = name, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SassError]
  }
}

