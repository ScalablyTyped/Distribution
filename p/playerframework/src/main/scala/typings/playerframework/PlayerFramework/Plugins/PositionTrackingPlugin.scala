package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionTrackingPlugin extends PluginBase {
  
  var evaluateOnForwardOnly: Boolean = js.native
  
  var position: Double = js.native
  
  var positionPercentage: Double = js.native
}
object PositionTrackingPlugin {
  
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    evaluateOnForwardOnly: Boolean,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    position: Double,
    positionPercentage: Double,
    unload: () => Unit,
    update: MediaSource => Unit
  ): PositionTrackingPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], evaluateOnForwardOnly = evaluateOnForwardOnly.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionPercentage = positionPercentage.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PositionTrackingPlugin]
  }
  
  @scala.inline
  implicit class PositionTrackingPluginOps[Self <: PositionTrackingPlugin] (val x: Self) extends AnyVal {
    
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
    def setEvaluateOnForwardOnly(value: Boolean): Self = this.set("evaluateOnForwardOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionPercentage(value: Double): Self = this.set("positionPercentage", value.asInstanceOf[js.Any])
  }
}
