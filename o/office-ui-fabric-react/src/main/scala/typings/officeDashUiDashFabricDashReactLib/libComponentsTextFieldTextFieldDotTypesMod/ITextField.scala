package typings
package officeDashUiDashFabricDashReactLib.libComponentsTextFieldTextFieldDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITextField extends js.Object {
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  var selectionEnd: scala.Double | scala.Null
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  var selectionStart: scala.Double | scala.Null
  /** Gets the current value of the input. */
  var value: js.UndefOr[java.lang.String]
  /** Blurs the input */
  def blur(): scala.Unit
  /** Sets focus to the input. */
  def focus(): scala.Unit
  /** Select the value of the text field. */
  def select(): scala.Unit
  /** Sets the selection end of the text field to a specified value. */
  def setSelectionEnd(value: scala.Double): scala.Unit
  /**
       * Sets the start and end positions of a selection in a text field.
       * @param start - Index of the start of the selection.
       * @param end - Index of the end of the selection.
       */
  def setSelectionRange(start: scala.Double, end: scala.Double): scala.Unit
  /** Sets the selection start of the text field to a specified value. */
  def setSelectionStart(value: scala.Double): scala.Unit
}

