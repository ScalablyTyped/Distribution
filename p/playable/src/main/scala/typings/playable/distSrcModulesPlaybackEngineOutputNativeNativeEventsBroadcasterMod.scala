package typings.playable

import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputNativeNativeEventsBroadcasterMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/native-events-broadcaster", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NativeEventsBroadcaster {
    def this(eventEmitter: IEventEmitter, output: HTMLVideoElement) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _checkVolumeChanges: Any = js.native
    
    /* private */ /* CompleteClass */
    var _currentMute: Any = js.native
    
    /* private */ /* CompleteClass */
    var _currentVolume: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _processEventFromVideo: Any = js.native
    
    /* private */ /* CompleteClass */
    var _shouldCheckVolume: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _video: Any = js.native
    
    /* CompleteClass */
    override def checkVolumeChangeAfterLoadStart(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/native-events-broadcaster", "NATIVE_VIDEO_TO_BROADCAST")
  @js.native
  val NATIVE_VIDEO_TO_BROADCAST: js.Array[String] = js.native
  
  trait NativeEventsBroadcaster extends StObject {
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _checkVolumeChanges: Any
    
    /* private */ var _currentMute: Any
    
    /* private */ var _currentVolume: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _processEventFromVideo: Any
    
    /* private */ var _shouldCheckVolume: Any
    
    /* private */ var _unbindEvents: Any
    
    /* private */ var _video: Any
    
    def checkVolumeChangeAfterLoadStart(): Unit
    
    def destroy(): Unit
  }
  object NativeEventsBroadcaster {
    
    inline def apply(
      _bindCallbacks: Any,
      _bindEvents: Any,
      _checkVolumeChanges: Any,
      _currentMute: Any,
      _currentVolume: Any,
      _eventEmitter: Any,
      _processEventFromVideo: Any,
      _shouldCheckVolume: Any,
      _unbindEvents: Any,
      _video: Any,
      checkVolumeChangeAfterLoadStart: () => Unit,
      destroy: () => Unit
    ): NativeEventsBroadcaster = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _checkVolumeChanges = _checkVolumeChanges.asInstanceOf[js.Any], _currentMute = _currentMute.asInstanceOf[js.Any], _currentVolume = _currentVolume.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _processEventFromVideo = _processEventFromVideo.asInstanceOf[js.Any], _shouldCheckVolume = _shouldCheckVolume.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _video = _video.asInstanceOf[js.Any], checkVolumeChangeAfterLoadStart = js.Any.fromFunction0(checkVolumeChangeAfterLoadStart), destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[NativeEventsBroadcaster]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeEventsBroadcaster] (val x: Self) extends AnyVal {
      
      inline def setCheckVolumeChangeAfterLoadStart(value: () => Unit): Self = StObject.set(x, "checkVolumeChangeAfterLoadStart", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_checkVolumeChanges(value: Any): Self = StObject.set(x, "_checkVolumeChanges", value.asInstanceOf[js.Any])
      
      inline def set_currentMute(value: Any): Self = StObject.set(x, "_currentMute", value.asInstanceOf[js.Any])
      
      inline def set_currentVolume(value: Any): Self = StObject.set(x, "_currentVolume", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_processEventFromVideo(value: Any): Self = StObject.set(x, "_processEventFromVideo", value.asInstanceOf[js.Any])
      
      inline def set_shouldCheckVolume(value: Any): Self = StObject.set(x, "_shouldCheckVolume", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      inline def set_video(value: Any): Self = StObject.set(x, "_video", value.asInstanceOf[js.Any])
    }
  }
}
