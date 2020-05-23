package typings.nextReactDevOverlay.busMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildError extends BusEvent {
  var message: String
  var `type`: /* "build-error" */ String
}

object BuildError {
  @scala.inline
  def apply(message: String, `type`: /* "build-error" */ String): BuildError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildError]
  }
}

