package typings
package mobxLib.libTypesObservablearrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayChange[T] extends js.Object {
  var index: scala.Double
  var newValue: T
  var `object`: IObservableArray[T]
  var oldValue: T
  var `type`: mobxLib.mobxLibStrings.update
}

object IArrayChange {
  @scala.inline
  def apply[T](
    index: scala.Double,
    newValue: T,
    `object`: IObservableArray[T],
    oldValue: T,
    `type`: mobxLib.mobxLibStrings.update
  ): IArrayChange[T] = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayChange[T]]
  }
}

