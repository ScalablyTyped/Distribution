package typings.officeUiFabricReact.spinButtonTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButton extends js.Object {
  /**
    * The value of the SpinButton. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * Sets focus to the spin button.
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

