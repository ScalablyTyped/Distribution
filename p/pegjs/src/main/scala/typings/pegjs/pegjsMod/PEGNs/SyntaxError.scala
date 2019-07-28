package typings.pegjs.pegjsMod.PEGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxError extends js.Object {
  var column: Double
  var expected: js.Array[_]
  var found: js.Any
  var line: Double
  var location: typings.pegjs.pegjsMod.PEGNs.LocationRange
  var message: String
  var name: String
  var offset: Double
}

object SyntaxError {
  @scala.inline
  def apply(
    column: Double,
    expected: js.Array[_],
    found: js.Any,
    line: Double,
    location: typings.pegjs.pegjsMod.PEGNs.LocationRange,
    message: String,
    name: String,
    offset: Double
  ): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column, expected = expected, found = found, line = line, location = location, message = message, name = name, offset = offset)
  
    __obj.asInstanceOf[SyntaxError]
  }
}

