package typings.mobx.anon

import typings.mobx.mobxStrings.add
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueObjectType[T] extends ISetWillChange[T] {
  var newValue: T
  var `object`: ObservableSet[T]
  var `type`: add
}

object NewValueObjectType {
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): NewValueObjectType[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueObjectType[T]]
  }
}

