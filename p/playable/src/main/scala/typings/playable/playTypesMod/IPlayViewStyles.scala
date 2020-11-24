package typings.playable.playTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayViewStyles extends js.Object {
  
  var hidden: String = js.native
  
  var icon: String = js.native
  
  var paused: String = js.native
  
  var playControl: String = js.native
  
  var playbackToggle: String = js.native
}
object IPlayViewStyles {
  
  @scala.inline
  def apply(hidden: String, icon: String, paused: String, playControl: String, playbackToggle: String): IPlayViewStyles = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playControl = playControl.asInstanceOf[js.Any], playbackToggle = playbackToggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayViewStyles]
  }
  
  @scala.inline
  implicit class IPlayViewStylesOps[Self <: IPlayViewStyles] (val x: Self) extends AnyVal {
    
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
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: String): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayControl(value: String): Self = this.set("playControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackToggle(value: String): Self = this.set("playbackToggle", value.asInstanceOf[js.Any])
  }
}
