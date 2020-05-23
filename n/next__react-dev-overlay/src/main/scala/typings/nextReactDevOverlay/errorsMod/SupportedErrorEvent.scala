package typings.nextReactDevOverlay.errorsMod

import typings.nextReactDevOverlay.busMod.UnhandledError
import typings.nextReactDevOverlay.busMod.UnhandledRejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedErrorEvent extends js.Object {
  var event: UnhandledError | UnhandledRejection
  var id: Double
}

object SupportedErrorEvent {
  @scala.inline
  def apply(event: UnhandledError | UnhandledRejection, id: Double): SupportedErrorEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedErrorEvent]
  }
}

