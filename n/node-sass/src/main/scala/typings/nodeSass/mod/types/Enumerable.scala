package typings.nodeSass.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enumerable extends js.Object {
  def getLength(): Double
  def getValue(index: Double): Value
  def setValue(index: Double, value: Value): Unit
}

object Enumerable {
  @scala.inline
  def apply(getLength: () => Double, getValue: Double => Value, setValue: (Double, Value) => Unit): Enumerable = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getValue = js.Any.fromFunction1(getValue), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[Enumerable]
  }
}

