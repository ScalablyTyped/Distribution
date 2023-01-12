package typings.playerframework.PlayerFramework

import typings.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginBase extends StObject {
  
  var currentMediaSource: MediaSource
  
  var isActive: Boolean
  
  var isEnabled: Boolean
  
  var isLoaded: Boolean
  
  def load(): Unit
  
  var mediaPlayer: MediaPlayer
  
  def unload(): Unit
  
  def update(mediaSource: MediaSource): Unit
}
object PluginBase {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PluginBase] (val x: Self) extends AnyVal {
    
    inline def setCurrentMediaSource(value: MediaSource): Self = StObject.set(x, "currentMediaSource", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setMediaPlayer(value: MediaPlayer): Self = StObject.set(x, "mediaPlayer", value.asInstanceOf[js.Any])
    
    inline def setUnload(value: () => Unit): Self = StObject.set(x, "unload", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: MediaSource => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
