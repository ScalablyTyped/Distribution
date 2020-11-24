package typings.playable

import typings.playable.adaptersTypesMod.IPlaybackAdapter
import typings.playable.anon.AvailablePlaybackAdapters
import typings.playable.engineStateMod.EngineState
import typings.playable.playbackEngineTypesMod.CrossOriginValue
import typings.playable.playbackEngineTypesMod.IVideoOutput
import typings.playable.playbackEngineTypesMod.PlayableMediaSource
import typings.playable.playbackEngineTypesMod.PreloadType
import typings.std.TimeRanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/output/native/html5video-output", JSImport.Namespace)
@js.native
object html5videoOutputMod extends js.Object {
  
  @js.native
  trait NativeOutput extends IVideoOutput {
    
    var _adapterStrategy: js.Any = js.native
    
    var _availablePlaybackAdapters: js.Any = js.native
    
    var _createVideoTag: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _getViewDimensions: js.Any = js.native
    
    var _nativeEventsBroadcaster: js.Any = js.native
    
    var _pauseRequested: js.Any = js.native
    
    var _playPromise: js.Any = js.native
    
    var _stateEngine: js.Any = js.native
    
    var _video: js.Any = js.native
    
    def attachedAdapter: IPlaybackAdapter = js.native
    
    @JSName("autoplay")
    def autoplay_MNativeOutput: Boolean = js.native
    
    @JSName("buffered")
    def buffered_MNativeOutput: TimeRanges = js.native
    
    @JSName("crossOrigin")
    def crossOrigin_MNativeOutput: CrossOriginValue = js.native
    
    @JSName("currentState")
    def currentState_MNativeOutput: EngineState = js.native
    
    @JSName("currentTime")
    def currentTime_MNativeOutput: Double = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("duration")
    def duration_MNativeOutput: Double = js.native
    
    @JSName("isAutoPlayActive")
    def isAutoPlayActive_MNativeOutput: Boolean = js.native
    
    @JSName("isAutoplay")
    def isAutoplay_MNativeOutput: Boolean = js.native
    
    @JSName("isDynamicContentEnded")
    def isDynamicContentEnded_MNativeOutput: Boolean = js.native
    
    @JSName("isDynamicContent")
    def isDynamicContent_MNativeOutput: Boolean = js.native
    
    @JSName("isEnded")
    def isEnded_MNativeOutput: Boolean = js.native
    
    @JSName("isInline")
    def isInline_MNativeOutput: Boolean = js.native
    
    @JSName("isLoop")
    def isLoop_MNativeOutput: Boolean = js.native
    
    @JSName("isMetadataLoaded")
    def isMetadataLoaded_MNativeOutput: Boolean = js.native
    
    @JSName("isMuted")
    def isMuted_MNativeOutput: Boolean = js.native
    
    @JSName("isPaused")
    def isPaused_MNativeOutput: Boolean = js.native
    
    @JSName("isPreloadActive")
    def isPreloadActive_MNativeOutput: Boolean = js.native
    
    @JSName("isSeekAvailable")
    def isSeekAvailable_MNativeOutput: Boolean = js.native
    
    @JSName("isSyncWithLive")
    def isSyncWithLive_MNativeOutput: Boolean = js.native
    
    @JSName("playbackRate")
    def playbackRate_MNativeOutput: Double = js.native
    
    @JSName("preload")
    def preload_MNativeOutput: PreloadType = js.native
    
    def setPreload(): Unit = js.native
    
    @JSName("src")
    def src_MNativeOutput: PlayableMediaSource = js.native
    
    @JSName("videoHeight")
    def videoHeight_MNativeOutput: Double = js.native
    
    @JSName("videoWidth")
    def videoWidth_MNativeOutput: Double = js.native
    
    @JSName("volume")
    def volume_MNativeOutput: Double = js.native
  }
  
  @js.native
  class default protected () extends NativeOutput {
    def this(hasEventEmitterConfigAvailablePlaybackAdapters: AvailablePlaybackAdapters) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
