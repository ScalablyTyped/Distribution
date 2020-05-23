package typings.ow.hasItemsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionLike[T] extends js.Object {
  def has(item: T): Boolean
}

object CollectionLike {
  @scala.inline
  def apply[T](has: T => Boolean): CollectionLike[T] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[CollectionLike[T]]
  }
}

