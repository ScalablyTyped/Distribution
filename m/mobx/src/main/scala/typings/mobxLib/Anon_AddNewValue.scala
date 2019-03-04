package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNewValue[T]
  extends mobxLib.libTypesObservablesetMod.ISetDidChange[T] {
  var newValue: T
  var `object`: mobxLib.libTypesObservablesetMod.ObservableSet[T]
  var `type`: mobxLib.mobxLibStrings.add
}

object Anon_AddNewValue {
  @scala.inline
  def apply[T](
    newValue: T,
    `object`: mobxLib.libTypesObservablesetMod.ObservableSet[T],
    `type`: mobxLib.mobxLibStrings.add
  ): Anon_AddNewValue[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AddNewValue[T]]
  }
}

