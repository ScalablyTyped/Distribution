package typings.playable.interactionIndicatorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInteractionIndicatorViewStyles extends js.Object {
  
  var animatedIcon: String = js.native
  
  var hidden: String = js.native
  
  var icon: String = js.native
  
  var iconContainer: String = js.native
  
  var pauseIcon: String = js.native
  
  var playIcon: String = js.native
  
  var seconds: String = js.native
}
object IInteractionIndicatorViewStyles {
  
  @scala.inline
  def apply(
    animatedIcon: String,
    hidden: String,
    icon: String,
    iconContainer: String,
    pauseIcon: String,
    playIcon: String,
    seconds: String
  ): IInteractionIndicatorViewStyles = {
    val __obj = js.Dynamic.literal(animatedIcon = animatedIcon.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconContainer = iconContainer.asInstanceOf[js.Any], pauseIcon = pauseIcon.asInstanceOf[js.Any], playIcon = playIcon.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractionIndicatorViewStyles]
  }
  
  @scala.inline
  implicit class IInteractionIndicatorViewStylesOps[Self <: IInteractionIndicatorViewStyles] (val x: Self) extends AnyVal {
    
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
    def setAnimatedIcon(value: String): Self = this.set("animatedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconContainer(value: String): Self = this.set("iconContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseIcon(value: String): Self = this.set("pauseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayIcon(value: String): Self = this.set("playIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: String): Self = this.set("seconds", value.asInstanceOf[js.Any])
  }
}
