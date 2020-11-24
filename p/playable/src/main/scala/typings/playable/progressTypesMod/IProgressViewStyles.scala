package typings.playable.progressTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressViewStyles extends js.Object {
  
  var background: String = js.native
  
  var buffered: String = js.native
  
  var hidden: String = js.native
  
  var hitbox: String = js.native
  
  var inLive: String = js.native
  
  var isDragging: String = js.native
  
  var liveSync: String = js.native
  
  var played: String = js.native
  
  var progressBar: String = js.native
  
  var progressBarsWrapper: String = js.native
  
  var seekBlock: String = js.native
  
  var seekTo: String = js.native
  
  var syncButton: String = js.native
  
  var timeIndicators: String = js.native
}
object IProgressViewStyles {
  
  @scala.inline
  def apply(
    background: String,
    buffered: String,
    hidden: String,
    hitbox: String,
    inLive: String,
    isDragging: String,
    liveSync: String,
    played: String,
    progressBar: String,
    progressBarsWrapper: String,
    seekBlock: String,
    seekTo: String,
    syncButton: String,
    timeIndicators: String
  ): IProgressViewStyles = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitbox = hitbox.asInstanceOf[js.Any], inLive = inLive.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], liveSync = liveSync.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], progressBarsWrapper = progressBarsWrapper.asInstanceOf[js.Any], seekBlock = seekBlock.asInstanceOf[js.Any], seekTo = seekTo.asInstanceOf[js.Any], syncButton = syncButton.asInstanceOf[js.Any], timeIndicators = timeIndicators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressViewStyles]
  }
  
  @scala.inline
  implicit class IProgressViewStylesOps[Self <: IProgressViewStyles] (val x: Self) extends AnyVal {
    
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
    def setBuffered(value: String): Self = this.set("buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitbox(value: String): Self = this.set("hitbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInLive(value: String): Self = this.set("inLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: String): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSync(value: String): Self = this.set("liveSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayed(value: String): Self = this.set("played", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBar(value: String): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBarsWrapper(value: String): Self = this.set("progressBarsWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekBlock(value: String): Self = this.set("seekBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekTo(value: String): Self = this.set("seekTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncButton(value: String): Self = this.set("syncButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIndicators(value: String): Self = this.set("timeIndicators", value.asInstanceOf[js.Any])
  }
}
