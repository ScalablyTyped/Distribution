package typings.playable

import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeEventsBroadcasterMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/native-events-broadcaster", JSImport.Default)
  @js.native
  class default protected () extends NativeEventsBroadcaster {
    def this(eventEmitter: IEventEmitter, output: HTMLVideoElement) = this()
  }
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/native-events-broadcaster", "NATIVE_VIDEO_TO_BROADCAST")
  @js.native
  val NATIVE_VIDEO_TO_BROADCAST: js.Array[String] = js.native
  
  @js.native
  trait NativeEventsBroadcaster extends StObject {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _checkVolumeChanges: js.Any = js.native
    
    var _currentMute: js.Any = js.native
    
    var _currentVolume: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _processEventFromVideo: js.Any = js.native
    
    var _shouldCheckVolume: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _video: js.Any = js.native
    
    def checkVolumeChangeAfterLoadStart(): Unit = js.native
    
    def destroy(): Unit = js.native
  }
  object NativeEventsBroadcaster {
    
    @scala.inline
    def apply(
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _checkVolumeChanges: js.Any,
      _currentMute: js.Any,
      _currentVolume: js.Any,
      _eventEmitter: js.Any,
      _processEventFromVideo: js.Any,
      _shouldCheckVolume: js.Any,
      _unbindEvents: js.Any,
      _video: js.Any,
      checkVolumeChangeAfterLoadStart: () => Unit,
      destroy: () => Unit
    ): NativeEventsBroadcaster = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _checkVolumeChanges = _checkVolumeChanges.asInstanceOf[js.Any], _currentMute = _currentMute.asInstanceOf[js.Any], _currentVolume = _currentVolume.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _processEventFromVideo = _processEventFromVideo.asInstanceOf[js.Any], _shouldCheckVolume = _shouldCheckVolume.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _video = _video.asInstanceOf[js.Any], checkVolumeChangeAfterLoadStart = js.Any.fromFunction0(checkVolumeChangeAfterLoadStart), destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[NativeEventsBroadcaster]
    }
    
    @scala.inline
    implicit class NativeEventsBroadcasterMutableBuilder[Self <: NativeEventsBroadcaster] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckVolumeChangeAfterLoadStart(value: () => Unit): Self = StObject.set(x, "checkVolumeChangeAfterLoadStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_checkVolumeChanges(value: js.Any): Self = StObject.set(x, "_checkVolumeChanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_currentMute(value: js.Any): Self = StObject.set(x, "_currentMute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_currentVolume(value: js.Any): Self = StObject.set(x, "_currentVolume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_processEventFromVideo(value: js.Any): Self = StObject.set(x, "_processEventFromVideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_shouldCheckVolume(value: js.Any): Self = StObject.set(x, "_shouldCheckVolume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_video(value: js.Any): Self = StObject.set(x, "_video", value.asInstanceOf[js.Any])
    }
  }
}
