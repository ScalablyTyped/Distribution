package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteObject[T]
  extends mobxLib.libTypesObservablesetMod.ISetDidChange[T] {
  var `object`: mobxLib.libTypesObservablesetMod.ObservableSet[T]
  var oldValue: T
  var `type`: mobxLib.mobxLibStrings.delete
}

object Anon_DeleteObject {
  @scala.inline
  def apply[T](
    `object`: mobxLib.libTypesObservablesetMod.ObservableSet[T],
    oldValue: T,
    `type`: mobxLib.mobxLibStrings.delete
  ): Anon_DeleteObject[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DeleteObject[T]]
  }
}

