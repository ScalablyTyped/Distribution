package typings
package officeDashUiDashFabricDashReactLib.libComponentsComboBoxComboBoxDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBox extends js.Object {
  /**
       * If there is a menu open this will dismiss the menu
       */
  def dismissMenu(): scala.Unit = js.native
  /**
       * Sets focus to the input in the comboBox
       * @param {boolean} shouldOpenOnFocus determines if we should open the ComboBox menu when the input gets focus
       * @param {boolean} useFocusAsync determines if we should focus the input asynchronously
       * @returns True if focus could be set, false if no operation was taken.
       */
  def focus(): scala.Boolean = js.native
  /**
       * Sets focus to the input in the comboBox
       * @param {boolean} shouldOpenOnFocus determines if we should open the ComboBox menu when the input gets focus
       * @param {boolean} useFocusAsync determines if we should focus the input asynchronously
       * @returns True if focus could be set, false if no operation was taken.
       */
  def focus(shouldOpenOnFocus: scala.Boolean): scala.Boolean = js.native
  /**
       * Sets focus to the input in the comboBox
       * @param {boolean} shouldOpenOnFocus determines if we should open the ComboBox menu when the input gets focus
       * @param {boolean} useFocusAsync determines if we should focus the input asynchronously
       * @returns True if focus could be set, false if no operation was taken.
       */
  def focus(shouldOpenOnFocus: scala.Boolean, useFocusAsync: scala.Boolean): scala.Boolean = js.native
}

