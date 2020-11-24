package typings.playable.fullScreenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFullScreenViewStyles extends js.Object {
  
  var enterIcon: String = js.native
  
  var exitIcon: String = js.native
  
  var fullScreenControl: String = js.native
  
  var fullScreenToggle: String = js.native
  
  var hidden: String = js.native
  
  var icon: String = js.native
  
  var inFullScreen: String = js.native
}
object IFullScreenViewStyles {
  
  @scala.inline
  def apply(
    enterIcon: String,
    exitIcon: String,
    fullScreenControl: String,
    fullScreenToggle: String,
    hidden: String,
    icon: String,
    inFullScreen: String
  ): IFullScreenViewStyles = {
    val __obj = js.Dynamic.literal(enterIcon = enterIcon.asInstanceOf[js.Any], exitIcon = exitIcon.asInstanceOf[js.Any], fullScreenControl = fullScreenControl.asInstanceOf[js.Any], fullScreenToggle = fullScreenToggle.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], inFullScreen = inFullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFullScreenViewStyles]
  }
  
  @scala.inline
  implicit class IFullScreenViewStylesOps[Self <: IFullScreenViewStyles] (val x: Self) extends AnyVal {
    
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
    def setEnterIcon(value: String): Self = this.set("enterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitIcon(value: String): Self = this.set("exitIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenControl(value: String): Self = this.set("fullScreenControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenToggle(value: String): Self = this.set("fullScreenToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInFullScreen(value: String): Self = this.set("inFullScreen", value.asInstanceOf[js.Any])
  }
}
