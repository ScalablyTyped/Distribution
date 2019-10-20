package typings.naja

import typings.naja.najaMod.SnippetUpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  def handleEvent(event: SnippetUpdateEvent): js.Promise[Unit] | Unit
}

object Anon_Event {
  @scala.inline
  def apply(handleEvent: SnippetUpdateEvent => js.Promise[Unit] | Unit): Anon_Event = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[Anon_Event]
  }
}

