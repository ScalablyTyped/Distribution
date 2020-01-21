package typings.officeUiFabricReact.dropdownTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdown extends js.Object {
  /**
    * All selected options
    */
  val selectedOptions: js.Array[IDropdownOption] = js.native
  def focus(): Unit = js.native
  def focus(shouldOpenOnFocus: Boolean): Unit = js.native
}

