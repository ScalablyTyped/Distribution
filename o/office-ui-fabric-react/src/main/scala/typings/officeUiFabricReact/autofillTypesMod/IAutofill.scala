package typings.officeUiFabricReact.autofillTypesMod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutofill extends js.Object {
  /**
    * The current index of the cursor in the input area. Returns -1 if the input element
    * is not ready.
    */
  var cursorLocation: Double | Null = js.native
  /**
    * The current input element.
    */
  var inputElement: HTMLInputElement | Null = js.native
  /**
    * A boolean for whether or not there is a value selected in the input area.
    */
  var isValueSelected: Boolean = js.native
  /**
    * the current index of where the selection ends. Returns -1 if the input element
    * is not ready.
    */
  var selectionEnd: Double | Null = js.native
  /**
    * The current index of where the selection starts. Returns -1 if the input element
    * is not ready.
    */
  var selectionStart: Double | Null = js.native
  /**
    * The current text value that the user has entered.
    */
  var value: String = js.native
  /**
    * Clear all text in the input. Sets value to '';
    */
  def clear(): Unit = js.native
  /**
    * Focus the input element.
    */
  def focus(): Unit = js.native
}

object IAutofill {
  @scala.inline
  def apply(clear: () => Unit, focus: () => Unit, isValueSelected: Boolean, value: String): IAutofill = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), focus = js.Any.fromFunction0(focus), isValueSelected = isValueSelected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutofill]
  }
  @scala.inline
  implicit class IAutofillOps[Self <: IAutofill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setIsValueSelected(value: Boolean): Self = this.set("isValueSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorLocation(value: Double): Self = this.set("cursorLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorLocationNull: Self = this.set("cursorLocation", null)
    @scala.inline
    def setInputElement(value: HTMLInputElement): Self = this.set("inputElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputElementNull: Self = this.set("inputElement", null)
    @scala.inline
    def setSelectionEnd(value: Double): Self = this.set("selectionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionEndNull: Self = this.set("selectionEnd", null)
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionStartNull: Self = this.set("selectionStart", null)
  }
  
}

