package typings.mobx

import typings.mobx.libTypesObservablesetMod.ISetDidChange
import typings.mobx.libTypesObservablesetMod.ObservableSet
import typings.mobx.mobxStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNewValue[T] extends ISetDidChange[T] {
  var newValue: T
  var `object`: ObservableSet[T]
  var `type`: add
}

object Anon_AddNewValue {
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): Anon_AddNewValue[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddNewValue[T]]
  }
}

