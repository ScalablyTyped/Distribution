package typings.oja.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  def next(): js.Promise[_]
}

object Next {
  @scala.inline
  def apply(next: () => js.Promise[_]): Next = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Next]
  }
}

