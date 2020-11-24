package typings.playable.volumeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVolumeViewStyles extends js.Object {
  
  var background: String = js.native
  
  var hidden: String = js.native
  
  var hitbox: String = js.native
  
  var icon: String = js.native
  
  var isDragging: String = js.native
  
  var muteIcon: String = js.native
  
  var muteToggle: String = js.native
  
  var muted: String = js.native
  
  var progressBar: String = js.native
  
  var volume: String = js.native
  
  var volume0: String = js.native
  
  var volume0Icon: String = js.native
  
  var volume100: String = js.native
  
  var volume100Icon: String = js.native
  
  var volume50: String = js.native
  
  var volume50Icon: String = js.native
  
  var volumeControl: String = js.native
  
  var volumeInputBlock: String = js.native
}
object IVolumeViewStyles {
  
  @scala.inline
  def apply(
    background: String,
    hidden: String,
    hitbox: String,
    icon: String,
    isDragging: String,
    muteIcon: String,
    muteToggle: String,
    muted: String,
    progressBar: String,
    volume: String,
    volume0: String,
    volume0Icon: String,
    volume100: String,
    volume100Icon: String,
    volume50: String,
    volume50Icon: String,
    volumeControl: String,
    volumeInputBlock: String
  ): IVolumeViewStyles = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitbox = hitbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], muteIcon = muteIcon.asInstanceOf[js.Any], muteToggle = muteToggle.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], volume0 = volume0.asInstanceOf[js.Any], volume0Icon = volume0Icon.asInstanceOf[js.Any], volume100 = volume100.asInstanceOf[js.Any], volume100Icon = volume100Icon.asInstanceOf[js.Any], volume50 = volume50.asInstanceOf[js.Any], volume50Icon = volume50Icon.asInstanceOf[js.Any], volumeControl = volumeControl.asInstanceOf[js.Any], volumeInputBlock = volumeInputBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVolumeViewStyles]
  }
  
  @scala.inline
  implicit class IVolumeViewStylesOps[Self <: IVolumeViewStyles] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitbox(value: String): Self = this.set("hitbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: String): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteIcon(value: String): Self = this.set("muteIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteToggle(value: String): Self = this.set("muteToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuted(value: String): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBar(value: String): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: String): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume0(value: String): Self = this.set("volume0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume0Icon(value: String): Self = this.set("volume0Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume100(value: String): Self = this.set("volume100", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume100Icon(value: String): Self = this.set("volume100Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume50(value: String): Self = this.set("volume50", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume50Icon(value: String): Self = this.set("volume50Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeControl(value: String): Self = this.set("volumeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeInputBlock(value: String): Self = this.set("volumeInputBlock", value.asInstanceOf[js.Any])
  }
}
