package typings.oja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  def next(): js.Promise[_]
}

object AnonNext {
  @scala.inline
  def apply(next: () => js.Promise[_]): AnonNext = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[AnonNext]
  }
}

