package typings.playable

import typings.playable.anon.AvailablePlaybackAdapters
import typings.playable.distSrcConstantsEngineStateMod.EngineState
import typings.playable.distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod.IPlaybackAdapter
import typings.playable.distSrcModulesPlaybackEngineTypesMod.CrossOriginValue
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IVideoOutput
import typings.playable.distSrcModulesPlaybackEngineTypesMod.PlayableMediaSource
import typings.playable.distSrcModulesPlaybackEngineTypesMod.PreloadType
import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputNativeHtml5videoOutputMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/html5video-output", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NativeOutput {
    def this(hasEventEmitterConfigAvailablePlaybackAdapters: AvailablePlaybackAdapters) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/playback-engine/output/native/html5video-output", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/playback-engine/output/native/html5video-output", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/playback-engine/output/native/html5video-output", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NativeOutput
    extends StObject
       with IVideoOutput {
    
    /* private */ var _adapterStrategy: Any = js.native
    
    /* private */ var _availablePlaybackAdapters: Any = js.native
    
    /* private */ var _createVideoTag: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _getViewDimensions: Any = js.native
    
    /* private */ var _nativeEventsBroadcaster: Any = js.native
    
    /* private */ var _pauseRequested: Any = js.native
    
    /* private */ var _playPromise: Any = js.native
    
    /* private */ var _stateEngine: Any = js.native
    
    /* private */ var _video: Any = js.native
    
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
}
