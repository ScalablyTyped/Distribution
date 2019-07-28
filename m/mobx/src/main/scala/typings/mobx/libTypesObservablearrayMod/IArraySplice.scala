package typings.mobx.libTypesObservablearrayMod

import typings.mobx.mobxStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArraySplice[T] extends js.Object {
  var added: js.Array[T]
  var addedCount: Double
  var index: Double
  var `object`: IObservableArray[T]
  var removed: js.Array[T]
  var removedCount: Double
  var `type`: splice
}

object IArraySplice {
  @scala.inline
  def apply[T](
    added: js.Array[T],
    addedCount: Double,
    index: Double,
    `object`: IObservableArray[T],
    removed: js.Array[T],
    removedCount: Double,
    `type`: splice
  ): IArraySplice[T] = {
    val __obj = js.Dynamic.literal(added = added, addedCount = addedCount, index = index, removed = removed, removedCount = removedCount)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IArraySplice[T]]
  }
}

