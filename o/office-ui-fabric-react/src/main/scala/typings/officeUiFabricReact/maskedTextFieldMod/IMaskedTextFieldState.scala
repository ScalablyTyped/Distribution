package typings.officeUiFabricReact.maskedTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaskedTextFieldState extends js.Object {
  
  /**
    * The mask string formatted with the input value.
    * This is what is displayed inside the TextField
    * @example
    *  `Phone Number: 12_ - 4___`
    */
  var displayValue: String = js.native
  
  /** The index into the rendered value of the first unfilled format character */
  var maskCursorPosition: js.UndefOr[Double] = js.native
}
object IMaskedTextFieldState {
  
  @scala.inline
  def apply(displayValue: String): IMaskedTextFieldState = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaskedTextFieldState]
  }
  
  @scala.inline
  implicit class IMaskedTextFieldStateOps[Self <: IMaskedTextFieldState] (val x: Self) extends AnyVal {
    
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
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskCursorPosition(value: Double): Self = this.set("maskCursorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskCursorPosition: Self = this.set("maskCursorPosition", js.undefined)
  }
}
