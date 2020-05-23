package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool[T] extends js.Object {
  var instantiator: js.Any
  var items: js.Any
  def clear(): Unit
  def free(item: T): Unit
  def freeAll(items: ArrayLike[T]): Unit
  def obtain(): T
}

object Pool {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    free: T => Unit,
    freeAll: ArrayLike[T] => Unit,
    instantiator: js.Any,
    items: js.Any,
    obtain: () => T
  ): Pool[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), free = js.Any.fromFunction1(free), freeAll = js.Any.fromFunction1(freeAll), instantiator = instantiator.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obtain = js.Any.fromFunction0(obtain))
    __obj.asInstanceOf[Pool[T]]
  }
}

