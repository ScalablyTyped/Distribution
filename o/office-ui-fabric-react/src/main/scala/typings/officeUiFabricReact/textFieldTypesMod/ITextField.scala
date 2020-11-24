package typings.officeUiFabricReact.textFieldTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextField extends js.Object {
  
  /** Blurs the input */
  def blur(): Unit = js.native
  
  /** Sets focus to the input. */
  def focus(): Unit = js.native
  
  /** Select the value of the text field. */
  def select(): Unit = js.native
  
  /** Gets the selection end of the text field. Returns -1 if there is no selection. */
  var selectionEnd: Double | Null = js.native
  
  /** Gets the selection start of the text field. Returns -1 if there is no selection. */
  var selectionStart: Double | Null = js.native
  
  /** Sets the selection end of the text field to a specified value. */
  def setSelectionEnd(value: Double): Unit = js.native
  
  /**
    * Sets the start and end positions of a selection in a text field.
    * Call with start and end set to the same value to set the cursor position.
    * @param start - Index of the start of the selection.
    * @param end - Index of the end of the selection.
    */
  def setSelectionRange(start: Double, end: Double): Unit = js.native
  
  /** Sets the selection start of the text field to a specified value. */
  def setSelectionStart(value: Double): Unit = js.native
  
  /** Gets the current value of the input. */
  var value: js.UndefOr[String] = js.native
}
object ITextField {
  
  @scala.inline
  def apply(
    blur: () => Unit,
    focus: () => Unit,
    select: () => Unit,
    setSelectionEnd: Double => Unit,
    setSelectionRange: (Double, Double) => Unit,
    setSelectionStart: Double => Unit
  ): ITextField = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), select = js.Any.fromFunction0(select), setSelectionEnd = js.Any.fromFunction1(setSelectionEnd), setSelectionRange = js.Any.fromFunction2(setSelectionRange), setSelectionStart = js.Any.fromFunction1(setSelectionStart))
    __obj.asInstanceOf[ITextField]
  }
  
  @scala.inline
  implicit class ITextFieldOps[Self <: ITextField] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSelectionEnd(value: Double => Unit): Self = this.set("setSelectionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectionRange(value: (Double, Double) => Unit): Self = this.set("setSelectionRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSelectionStart(value: Double => Unit): Self = this.set("setSelectionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionEnd(value: Double): Self = this.set("selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionEndNull: Self = this.set("selectionEnd", null)
    
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStartNull: Self = this.set("selectionStart", null)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
