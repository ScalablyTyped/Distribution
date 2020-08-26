package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T] extends js.Object {
  var instantiator: js.Any = js.native
  var items: js.Any = js.native
  def clear(): Unit = js.native
  def free(item: T): Unit = js.native
  def freeAll(items: ArrayLike[T]): Unit = js.native
  def obtain(): T = js.native
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
  @scala.inline
  implicit class PoolOps[Self <: Pool[_], T] (val x: Self with Pool[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setFree(value: T => Unit): Self = this.set("free", js.Any.fromFunction1(value))
    @scala.inline
    def setFreeAll(value: ArrayLike[T] => Unit): Self = this.set("freeAll", js.Any.fromFunction1(value))
    @scala.inline
    def setInstantiator(value: js.Any): Self = this.set("instantiator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setObtain(value: () => T): Self = this.set("obtain", js.Any.fromFunction0(value))
  }
  
}

