package typings.officeUiFabricReact.dropdownTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDropdown extends js.Object {
  
  def focus(): Unit = js.native
  def focus(shouldOpenOnFocus: Boolean): Unit = js.native
  
  /**
    * All selected options
    */
  val selectedOptions: js.Array[IDropdownOption] = js.native
}
