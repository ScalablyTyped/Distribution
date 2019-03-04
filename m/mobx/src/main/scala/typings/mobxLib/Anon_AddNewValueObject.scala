package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNewValueObject[T]
  extends mobxLib.libTypesObservablesetMod.ISetWillChange[T] {
  var newValue: T
  var `object`: mobxLib.libTypesObservablesetMod.ObservableSet[T]
  var `type`: mobxLib.mobxLibStrings.add
}

object Anon_AddNewValueObject {
  @scala.inline
  def apply[T](
    newValue: T,
    `object`: mobxLib.libTypesObservablesetMod.ObservableSet[T],
    `type`: mobxLib.mobxLibStrings.add
  ): Anon_AddNewValueObject[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AddNewValueObject[T]]
  }
}

