package typings.mobx

import typings.mobx.libTypesObservablesetMod.ISetDidChange
import typings.mobx.libTypesObservablesetMod.ObservableSet
import typings.mobx.mobxStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteObject[T] extends ISetDidChange[T] {
  var `object`: ObservableSet[T]
  var oldValue: T
  var `type`: delete
}

object Anon_DeleteObject {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): Anon_DeleteObject[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteObject[T]]
  }
}

