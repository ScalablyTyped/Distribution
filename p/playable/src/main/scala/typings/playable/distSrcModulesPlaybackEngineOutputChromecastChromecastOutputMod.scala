package typings.playable

import typings.playable.anon.Length
import typings.playable.distSrcConstantsEngineStateMod.EngineState
import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesPlaybackEngineTypesMod.CrossOriginValue
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IVideoOutput
import typings.playable.distSrcModulesPlaybackEngineTypesMod.PreloadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputChromecastChromecastOutputMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/chromecast/chromecast-output", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ChromecastOutput {
    def this(eventEmitter: IEventEmitter) = this()
  }
  
  @js.native
  trait ChromecastOutput
    extends StObject
       with IVideoOutput {
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _initRemote: Any = js.native
    
    /* private */ var _isAutoplay: Any = js.native
    
    /* private */ var _player: Any = js.native
    
    /* private */ var _playerController: Any = js.native
    
    /* private */ var _src: Any = js.native
    
    /* private */ var _stateEngine: Any = js.native
    
    @JSName("autoplay")
    def autoplay_MChromecastOutput: Boolean = js.native
    
    @JSName("buffered")
    def buffered_MChromecastOutput: Length = js.native
    
    @JSName("crossOrigin")
    def crossOrigin_MChromecastOutput: CrossOriginValue = js.native
    
    @JSName("currentState")
    def currentState_MChromecastOutput: EngineState = js.native
    
    @JSName("currentTime")
    def currentTime_MChromecastOutput: Double = js.native
    
    @JSName("duration")
    def duration_MChromecastOutput: Double = js.native
    
    @JSName("isAutoPlayActive")
    def isAutoPlayActive_MChromecastOutput: Boolean = js.native
    
    @JSName("isAutoplay")
    def isAutoplay_MChromecastOutput: Boolean = js.native
    
    @JSName("isDynamicContentEnded")
    def isDynamicContentEnded_MChromecastOutput: Boolean = js.native
    
    @JSName("isDynamicContent")
    def isDynamicContent_MChromecastOutput: Boolean = js.native
    
    @JSName("isEnded")
    def isEnded_MChromecastOutput: Boolean = js.native
    
    @JSName("isInline")
    def isInline_MChromecastOutput: Boolean = js.native
    
    @JSName("isLoop")
    def isLoop_MChromecastOutput: Boolean = js.native
    
    @JSName("isMetadataLoaded")
    def isMetadataLoaded_MChromecastOutput: Boolean = js.native
    
    @JSName("isMuted")
    def isMuted_MChromecastOutput: Boolean = js.native
    
    @JSName("isPaused")
    def isPaused_MChromecastOutput: Boolean = js.native
    
    @JSName("isPreloadActive")
    def isPreloadActive_MChromecastOutput: Boolean = js.native
    
    @JSName("isSeekAvailable")
    def isSeekAvailable_MChromecastOutput: Boolean = js.native
    
    @JSName("isSyncWithLive")
    def isSyncWithLive_MChromecastOutput: Boolean = js.native
    
    @JSName("playbackRate")
    def playbackRate_MChromecastOutput: Double = js.native
    
    @JSName("preload")
    def preload_MChromecastOutput: PreloadType = js.native
    
    def setInline(): Unit = js.native
    
    def setLoop(): Unit = js.native
    
    def setPlaybackRate(): Unit = js.native
    
    def setPreload(): Unit = js.native
    
    @JSName("src")
    def src_MChromecastOutput: String = js.native
    
    var `type`: String = js.native
    
    @JSName("videoHeight")
    def videoHeight_MChromecastOutput: Double = js.native
    
    @JSName("videoWidth")
    def videoWidth_MChromecastOutput: Double = js.native
    
    @JSName("volume")
    def volume_MChromecastOutput: Double = js.native
  }
}
