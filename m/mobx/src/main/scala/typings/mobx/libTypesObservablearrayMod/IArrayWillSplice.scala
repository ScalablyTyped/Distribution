package typings.mobx.libTypesObservablearrayMod

import typings.mobx.mobxStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayWillSplice[T] extends js.Object {
  var added: js.Array[T]
  var index: Double
  var `object`: IObservableArray[T]
  var removedCount: Double
  var `type`: splice
}

object IArrayWillSplice {
  @scala.inline
  def apply[T](
    added: js.Array[T],
    index: Double,
    `object`: IObservableArray[T],
    removedCount: Double,
    `type`: splice
  ): IArrayWillSplice[T] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayWillSplice[T]]
  }
}

