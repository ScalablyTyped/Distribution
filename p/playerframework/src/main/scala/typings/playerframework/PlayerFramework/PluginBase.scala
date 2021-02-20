package typings.playerframework.PlayerFramework

import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginBase extends StObject {
  
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
  implicit class PluginBaseMutableBuilder[Self <: PluginBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentMediaSource(value: MediaSource): Self = StObject.set(x, "currentMediaSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMediaPlayer(value: MediaPlayer): Self = StObject.set(x, "mediaPlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnload(value: () => Unit): Self = StObject.set(x, "unload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: MediaSource => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
