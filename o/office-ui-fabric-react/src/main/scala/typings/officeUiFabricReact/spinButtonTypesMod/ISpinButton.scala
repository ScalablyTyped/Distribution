package typings.officeUiFabricReact.spinButtonTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButton extends js.Object {
  /**
    * Current value of the control.
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * Sets focus to the control.
    */
  def focus(): Unit
}

object ISpinButton {
  @scala.inline
  def apply(focus: () => Unit, value: String = null): ISpinButton = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButton]
  }
}

