package typings.mobx.observablevalueMod

import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueDidChange[T] extends IValueWillChange[T] {
  var oldValue: js.UndefOr[T] = js.undefined
}

object IValueDidChange {
  @scala.inline
  def apply[T](newValue: T, `object`: js.Any, `type`: update, oldValue: T = null): IValueDidChange[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueDidChange[T]]
  }
}

