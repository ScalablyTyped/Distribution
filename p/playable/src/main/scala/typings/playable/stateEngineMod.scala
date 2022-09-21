package typings.playable

import typings.playable.engineStateMod.EngineState
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IVideoOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateEngineMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/chromecast/state-engine", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StateEngine {
    def this(eventEmitter: IEventEmitter, output: IVideoOutput, controller: RemotePlayerController) = this()
  }
  
  type RemotePlayerController = typings.chromecastCafSender.cast.framework.RemotePlayerController
  
  @js.native
  trait StateEngine extends StObject {
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _checkVolumeChanges: Any = js.native
    
    /* private */ var _currentMute: Any = js.native
    
    /* private */ var _currentState: Any = js.native
    
    /* private */ var _currentVolume: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _isMetadataLoaded: Any = js.native
    
    /* private */ var _output: Any = js.native
    
    /* private */ var _processEventFromVideo: Any = js.native
    
    /* private */ var _remotePlayerController: Any = js.native
    
    def destroy(): Unit = js.native
    
    def isMetadataLoaded: Boolean = js.native
    
    def setState(state: EngineState): Unit = js.native
    
    def state: EngineState = js.native
  }
}
