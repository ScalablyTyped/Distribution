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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SassError]
  }
}

