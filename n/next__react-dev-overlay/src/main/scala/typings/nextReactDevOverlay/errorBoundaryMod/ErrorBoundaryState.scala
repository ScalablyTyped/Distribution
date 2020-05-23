package typings.nextReactDevOverlay.errorBoundaryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBoundaryState extends js.Object {
  var error: Error | Null
}

object ErrorBoundaryState {
  @scala.inline
  def apply(error: Error = null): ErrorBoundaryState = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBoundaryState]
  }
}

