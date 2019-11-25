package typings.pegjs.pegjsMod.PEG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxError extends js.Object {
  var column: Double
  var expected: js.Array[_]
  var found: js.Any
  var line: Double
  var location: typings.pegjs.pegjsMod.PEG.LocationRange
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
    location: typings.pegjs.pegjsMod.PEG.LocationRange,
    message: String,
    name: String,
    offset: Double
  ): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyntaxError]
  }
}

