package typings.naja

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHandleEvent[T /* <: Event */] extends js.Object {
  def handleEvent(event: T): js.Promise[Unit] | Unit
}

object Anon_EventHandleEvent {
  @scala.inline
  def apply[T /* <: Event */](handleEvent: T => js.Promise[Unit] | Unit): Anon_EventHandleEvent[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[Anon_EventHandleEvent[T]]
  }
}

