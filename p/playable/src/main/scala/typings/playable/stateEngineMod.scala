package typings.playable

import typings.chromecastCafSender.cast.framework.RemotePlayerController
import typings.playable.engineStateMod.EngineState
import typings.playable.eventEmitterTypesMod.IEventEmitter
import typings.playable.playbackEngineTypesMod.IVideoOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateEngineMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/chromecast/state-engine", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with StateEngine {
    def this(eventEmitter: IEventEmitter, output: IVideoOutput, controller: RemotePlayerController) = this()
  }
  
  @js.native
  trait StateEngine extends StObject {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _checkVolumeChanges: js.Any = js.native
    
    var _currentMute: js.Any = js.native
    
    var _currentState: js.Any = js.native
    
    var _currentVolume: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _isMetadataLoaded: js.Any = js.native
    
    var _output: js.Any = js.native
    
    var _processEventFromVideo: js.Any = js.native
    
    var _remotePlayerController: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def isMetadataLoaded: Boolean = js.native
    
    def setState(state: EngineState): Unit = js.native
    
    def state: EngineState = js.native
  }
}
