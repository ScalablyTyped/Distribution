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
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (found != null) __obj.updateDynamic("found")(found.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PegjsError]
  }
}

