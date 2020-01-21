package typings.mobx.observablearrayMod

import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayWillChange[T] extends js.Object {
  var index: Double
  var newValue: T
  var `object`: IObservableArray[T]
  var `type`: update
}

object IArrayWillChange {
  @scala.inline
  def apply[T](index: Double, newValue: T, `object`: IObservableArray[T], `type`: update): IArrayWillChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayWillChange[T]]
  }
}

