package typings.mobx.observablevalueMod

import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueWillChange[T] extends js.Object {
  var newValue: T
  var `object`: js.Any
  var `type`: update
}

object IValueWillChange {
  @scala.inline
  def apply[T](newValue: T, `object`: js.Any, `type`: update): IValueWillChange[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueWillChange[T]]
  }
}

