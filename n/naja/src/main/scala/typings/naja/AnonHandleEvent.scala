package typings.naja

import typings.naja.mod.SnippetUpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleEvent extends js.Object {
  def handleEvent(event: SnippetUpdateEvent): js.Promise[Unit] | Unit
}

object AnonHandleEvent {
  @scala.inline
  def apply(handleEvent: SnippetUpdateEvent => js.Promise[Unit] | Unit): AnonHandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[AnonHandleEvent]
  }
}

