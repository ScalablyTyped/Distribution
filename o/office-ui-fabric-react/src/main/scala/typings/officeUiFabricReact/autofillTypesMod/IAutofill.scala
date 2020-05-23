package typings.officeUiFabricReact.autofillTypesMod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutofill extends js.Object {
  /**
    * The current index of the cursor in the input area. Returns -1 if the input element
    * is not ready.
    */
  var cursorLocation: Double | Null
  /**
    * The current input element.
    */
  var inputElement: HTMLInputElement | Null
  /**
    * A boolean for whether or not there is a value selected in the input area.
    */
  var isValueSelected: Boolean
  /**
    * the current index of where the selection ends. Returns -1 if the input element
    * is not ready.
    */
  var selectionEnd: Double | Null
  /**
    * The current index of where the selection starts. Returns -1 if the input element
    * is not ready.
    */
  var selectionStart: Double | Null
  /**
    * The current text value that the user has entered.
    */
  var value: String
  /**
    * Clear all text in the input. Sets value to '';
    */
  def clear(): Unit
  /**
    * Focus the input element.
    */
  def focus(): Unit
}

object IAutofill {
  @scala.inline
  def apply(
    clear: () => Unit,
    focus: () => Unit,
    isValueSelected: Boolean,
    value: String,
    cursorLocation: Double = null.asInstanceOf[Double],
    inputElement: HTMLInputElement = null,
    selectionEnd: Double = null.asInstanceOf[Double],
    selectionStart: Double = null.asInstanceOf[Double]
  ): IAutofill = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), focus = js.Any.fromFunction0(focus), isValueSelected = isValueSelected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], cursorLocation = cursorLocation.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutofill]
  }
}

