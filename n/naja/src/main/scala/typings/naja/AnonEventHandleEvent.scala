package typings.naja

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventHandleEvent[T /* <: Event_ */] extends js.Object {
  def handleEvent(event: T): js.Promise[Unit] | Unit
}

object AnonEventHandleEvent {
  @scala.inline
  def apply[T /* <: Event_ */](handleEvent: T => js.Promise[Unit] | Unit): AnonEventHandleEvent[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[AnonEventHandleEvent[T]]
  }
}

