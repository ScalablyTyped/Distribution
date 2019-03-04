package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArraySplice[T] extends js.Object {
  var addedCount: scala.Double
  var index: scala.Double
  var `object`: IObservableArray[T]
  var removed: js.Array[T]
  var `type`: java.lang.String
}

object IArraySplice {
  @scala.inline
  def apply[T](
    addedCount: scala.Double,
    index: scala.Double,
    `object`: IObservableArray[T],
    removed: js.Array[T],
    `type`: java.lang.String
  ): IArraySplice[T] = {
    val __obj = js.Dynamic.literal(addedCount = addedCount, index = index, removed = removed)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IArraySplice[T]]
  }
}

