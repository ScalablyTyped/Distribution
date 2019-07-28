package typings.mobx.libTypesObservablearrayMod

import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayChange[T] extends js.Object {
  var index: Double
  var newValue: T
  var `object`: IObservableArray[T]
  var oldValue: T
  var `type`: update
}

object IArrayChange {
  @scala.inline
  def apply[T](index: Double, newValue: T, `object`: IObservableArray[T], oldValue: T, `type`: update): IArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index, newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IArrayChange[T]]
  }
}

