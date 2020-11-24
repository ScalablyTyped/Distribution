package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayWidgetPosition extends js.Object {
  
  /**
    * The position preference for the overlay widget.
    */
  var preference: OverlayWidgetPositionPreference | Null = js.native
}
object IOverlayWidgetPosition {
  
  @scala.inline
  def apply(): IOverlayWidgetPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayWidgetPosition]
  }
  
  @scala.inline
  implicit class IOverlayWidgetPositionOps[Self <: IOverlayWidgetPosition] (val x: Self) extends AnyVal {
    
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
    def setPreference(value: OverlayWidgetPositionPreference): Self = this.set("preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceNull: Self = this.set("preference", null)
  }
}
