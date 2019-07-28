package typings.pegjs.pegjsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PegjsError extends Error {
  var expected: js.UndefOr[js.Array[ExpectedItem]] = js.undefined
  var found: js.UndefOr[js.Any] = js.undefined
  var location: LocationRange
  @JSName("stack")
  var stack_PegjsError: js.UndefOr[js.Any] = js.undefined
}

object PegjsError {
  @scala.inline
  def apply(
    location: LocationRange,
    message: String,
    name: String,
    expected: js.Array[ExpectedItem] = null,
    found: js.Any = null,
    stack: js.Any = null
  ): PegjsError = {
    val __obj = js.Dynamic.literal(location = location, message = message, name = name)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (found != null) __obj.updateDynamic("found")(found)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[PegjsError]
  }
}

