package typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePicker[T] extends js.Object {
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.undefined
  /** Sets focus to the focus zone. */
  def focus(): Unit
  /** Set focus to the input */
  def focusInput(): Unit
}

object IBasePicker {
  @scala.inline
  def apply[T](focus: () => Unit, focusInput: () => Unit, items: js.Array[T] = null): IBasePicker[T] = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), focusInput = js.Any.fromFunction0(focusInput))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePicker[T]]
  }
}

