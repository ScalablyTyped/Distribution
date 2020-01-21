package typings.mobx.observablearrayMod

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
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArraySplice[T]]
  }
}

