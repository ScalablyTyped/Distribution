package typings.naja.anon

import typings.naja.mod.SnippetUpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleEvent extends js.Object {
  def handleEvent(event: SnippetUpdateEvent): js.Promise[Unit] | Unit
}

object HandleEvent {
  @scala.inline
  def apply(handleEvent: SnippetUpdateEvent => js.Promise[Unit] | Unit): HandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[HandleEvent]
  }
}

