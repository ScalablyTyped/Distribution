package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemTransportControlsPlugin extends PluginBase {
  
  var isNextTrackEnabled: Boolean = js.native
  
  var isPreviousTrackEnabled: Boolean = js.native
  
  var nextTrackExists: Boolean = js.native
  
  var previousTrackExists: Boolean = js.native
}
object SystemTransportControlsPlugin {
  
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    isNextTrackEnabled: Boolean,
    isPreviousTrackEnabled: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    nextTrackExists: Boolean,
    previousTrackExists: Boolean,
    unload: () => Unit,
    update: MediaSource => Unit
  ): SystemTransportControlsPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isNextTrackEnabled = isNextTrackEnabled.asInstanceOf[js.Any], isPreviousTrackEnabled = isPreviousTrackEnabled.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], nextTrackExists = nextTrackExists.asInstanceOf[js.Any], previousTrackExists = previousTrackExists.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SystemTransportControlsPlugin]
  }
  
  @scala.inline
  implicit class SystemTransportControlsPluginOps[Self <: SystemTransportControlsPlugin] (val x: Self) extends AnyVal {
    
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
    def setIsNextTrackEnabled(value: Boolean): Self = this.set("isNextTrackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreviousTrackEnabled(value: Boolean): Self = this.set("isPreviousTrackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTrackExists(value: Boolean): Self = this.set("nextTrackExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTrackExists(value: Boolean): Self = this.set("previousTrackExists", value.asInstanceOf[js.Any])
  }
}
