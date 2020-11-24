package typings.playerframework.PlayerFramework

import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginBase extends js.Object {
  
  var currentMediaSource: MediaSource = js.native
  
  var isActive: Boolean = js.native
  
  var isEnabled: Boolean = js.native
  
  var isLoaded: Boolean = js.native
  
  def load(): Unit = js.native
  
  var mediaPlayer: MediaPlayer = js.native
  
  def unload(): Unit = js.native
  
  def update(mediaSource: MediaSource): Unit = js.native
}
object PluginBase {
  
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    unload: () => Unit,
    update: MediaSource => Unit
  ): PluginBase = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PluginBase]
  }
  
  @scala.inline
  implicit class PluginBaseOps[Self <: PluginBase] (val x: Self) extends AnyVal {
    
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
    def setCurrentMediaSource(value: MediaSource): Self = this.set("currentMediaSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: () => Unit): Self = this.set("load", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMediaPlayer(value: MediaPlayer): Self = this.set("mediaPlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnload(value: () => Unit): Self = this.set("unload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: MediaSource => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
