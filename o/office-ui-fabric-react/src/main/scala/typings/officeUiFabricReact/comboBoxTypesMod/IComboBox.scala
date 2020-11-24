package typings.officeUiFabricReact.comboBoxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComboBox extends js.Object {
  
  /**
    * If there is a menu open this will dismiss the menu
    */
  def dismissMenu(): Unit = js.native
  
  /**
    * Sets focus to the input in the comboBox
    * @param shouldOpenOnFocus - Determines if we should open the ComboBox menu when the input gets focus
    * @param useFocusAsync - Determines if we should focus the input asynchronously
    * @returns True if focus could be set, false if no operation was taken.
    */
  def focus(): Boolean = js.native
  def focus(shouldOpenOnFocus: js.UndefOr[scala.Nothing], useFocusAsync: Boolean): Boolean = js.native
  def focus(shouldOpenOnFocus: Boolean): Boolean = js.native
  def focus(shouldOpenOnFocus: Boolean, useFocusAsync: Boolean): Boolean = js.native
  
  /**
    * All selected options
    */
  val selectedOptions: js.Array[IComboBoxOption] = js.native
}
