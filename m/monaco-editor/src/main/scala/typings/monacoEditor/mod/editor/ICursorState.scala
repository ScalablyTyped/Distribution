package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICursorState extends js.Object {
  
  var inSelectionMode: Boolean = js.native
  
  var position: IPosition = js.native
  
  var selectionStart: IPosition = js.native
}
object ICursorState {
  
  @scala.inline
  def apply(inSelectionMode: Boolean, position: IPosition, selectionStart: IPosition): ICursorState = {
    val __obj = js.Dynamic.literal(inSelectionMode = inSelectionMode.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorState]
  }
  
  @scala.inline
  implicit class ICursorStateOps[Self <: ICursorState] (val x: Self) extends AnyVal {
    
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
    def setInSelectionMode(value: Boolean): Self = this.set("inSelectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: IPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStart(value: IPosition): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
  }
}
