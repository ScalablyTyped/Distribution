package typings
package mobxLib.libTypesObservablevalueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueDidChange[T] extends IValueWillChange[T] {
  var oldValue: js.UndefOr[T]
}

object IValueDidChange {
  @scala.inline
  def apply[T](newValue: T, `object`: js.Any, `type`: mobxLib.mobxLibStrings.update, oldValue: T = null): IValueDidChange[T] = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueDidChange[T]]
  }
}

