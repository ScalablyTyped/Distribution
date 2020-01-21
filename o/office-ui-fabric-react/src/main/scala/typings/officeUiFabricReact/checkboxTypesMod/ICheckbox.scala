package typings.officeUiFabricReact.checkboxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckbox extends js.Object {
  /** Gets the current checked state. */
  var checked: Boolean
  /** Gets the current indeterminate state. */
  var indeterminate: Boolean
  /** Sets focus to the checkbox. */
  def focus(): Unit
}

object ICheckbox {
  @scala.inline
  def apply(checked: Boolean, focus: () => Unit, indeterminate: Boolean): ICheckbox = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), indeterminate = indeterminate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICheckbox]
  }
}

