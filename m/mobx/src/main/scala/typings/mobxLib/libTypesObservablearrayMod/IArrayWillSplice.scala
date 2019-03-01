package typings
package mobxLib.libTypesObservablearrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayWillSplice[T] extends js.Object {
  var added: js.Array[T]
  var index: scala.Double
  var `object`: IObservableArray[T]
  var removedCount: scala.Double
  var `type`: mobxLib.mobxLibStrings.splice
}

object IArrayWillSplice {
  @scala.inline
  def apply[T](
    added: js.Array[T],
    index: scala.Double,
    `object`: IObservableArray[T],
    removedCount: scala.Double,
    `type`: mobxLib.mobxLibStrings.splice
  ): IArrayWillSplice[T] = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("added")(added)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("removedCount")(removedCount)
    __obj.asInstanceOf[IArrayWillSplice[T]]
  }
}

