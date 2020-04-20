package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorResult[T] extends js.Object {
  var done: scala.Boolean
  var value: T
}

object IteratorResult {
  @scala.inline
  def apply[T](done: scala.Boolean, value: T): IteratorResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T]]
  }
}

