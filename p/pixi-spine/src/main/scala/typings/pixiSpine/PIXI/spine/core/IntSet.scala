package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntSet extends js.Object {
  var array: js.Array[Double] = js.native
  def add(value: Double): Boolean = js.native
  def clear(): Unit = js.native
  def contains(value: Double): Boolean = js.native
  def remove(value: Double): Unit = js.native
}

object IntSet {
  @scala.inline
  def apply(
    add: Double => Boolean,
    array: js.Array[Double],
    clear: () => Unit,
    contains: Double => Boolean,
    remove: Double => Unit
  ): IntSet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = array.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[IntSet]
  }
  @scala.inline
  implicit class IntSetOps[Self <: IntSet] (val x: Self) extends AnyVal {
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
    def setAdd(value: Double => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setArrayVarargs(value: Double*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[Double]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setContains(value: Double => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

