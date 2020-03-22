package typings.naja

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T /* <: Event_ */] extends js.Object {
  def handleEvent(event: T): js.Promise[Unit] | Unit
}

object Anon0 {
  @scala.inline
  def apply[T /* <: Event_ */](handleEvent: T => js.Promise[Unit] | Unit): Anon0[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[Anon0[T]]
  }
}

