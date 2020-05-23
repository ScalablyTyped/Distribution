package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntSet extends js.Object {
  var array: js.Array[Double]
  def add(value: Double): Boolean
  def clear(): Unit
  def contains(value: Double): Boolean
  def remove(value: Double): Unit
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
}

