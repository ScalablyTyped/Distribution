package typings.playable

import typings.playable.anon.Length
import typings.playable.engineStateMod.EngineState
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.CrossOriginValue
import typings.playable.playbackEngineTypesMod.IVideoOutput
import typings.playable.playbackEngineTypesMod.PreloadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/output/chromecast/chromecast-output", JSImport.Namespace)
@js.native
object chromecastOutputMod extends js.Object {
  
  @js.native
  trait ChromecastOutput extends IVideoOutput {
    
    var _eventEmitter: js.Any = js.native
    
    var _initRemote: js.Any = js.native
    
    var _isAutoplay: js.Any = js.native
    
    var _player: js.Any = js.native
    
    var _playerController: js.Any = js.native
    
    var _src: js.Any = js.native
    
    var _stateEngine: js.Any = js.native
    
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
  
  @js.native
  class default protected () extends ChromecastOutput {
    def this(eventEmitter: IEventEmitter) = this()
  }
}
