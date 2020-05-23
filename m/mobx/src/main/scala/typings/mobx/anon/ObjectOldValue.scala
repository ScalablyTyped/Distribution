package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablesetMod.ISetDidChange
import typings.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOldValue[T] extends ISetDidChange[T] {
  var `object`: ObservableSet[T]
  var oldValue: T
  var `type`: delete
}

object ObjectOldValue {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): ObjectOldValue[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOldValue[T]]
  }
}

