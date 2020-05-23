package typings.nextReactDevOverlay.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorsProps extends js.Object {
  var errors: js.Array[SupportedErrorEvent]
}

object ErrorsProps {
  @scala.inline
  def apply(errors: js.Array[SupportedErrorEvent]): ErrorsProps = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsProps]
  }
}

