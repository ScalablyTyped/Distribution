package typings.naja.anon

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T /* <: Event */] extends js.Object {
  def handleEvent(event: T): js.Promise[Unit] | Unit
}

object `0` {
  @scala.inline
  def apply[T](handleEvent: T => js.Promise[Unit] | Unit): `0`[T] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[`0`[T]]
  }
}

