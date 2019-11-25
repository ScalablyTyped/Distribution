package typings.mobservable.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArraySplice[T] extends js.Object {
  var addedCount: Double
  var index: Double
  var `object`: IObservableArray[T]
  var removed: js.Array[T]
  var `type`: String
}

object IArraySplice {
  @scala.inline
  def apply[T](
    addedCount: Double,
    index: Double,
    `object`: IObservableArray[T],
    removed: js.Array[T],
    `type`: String
  ): IArraySplice[T] = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArraySplice[T]]
  }
}

