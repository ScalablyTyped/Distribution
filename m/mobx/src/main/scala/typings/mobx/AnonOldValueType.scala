package typings.mobx

import typings.mobx.mobxStrings.delete
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldValueType[T] extends ISetWillChange[T] {
  var `object`: ObservableSet[T]
  var oldValue: T
  var `type`: delete
}

object AnonOldValueType {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): AnonOldValueType[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldValueType[T]]
  }
}

