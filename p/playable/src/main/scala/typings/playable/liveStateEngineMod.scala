package typings.playable

import typings.playable.liveStateMod.LiveState
import typings.playable.playbackEngineTypesMod.ILiveStateEngineDependencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/playback-engine/live-state-engine", JSImport.Namespace)
@js.native
object liveStateEngineMod extends js.Object {
  
  @js.native
  trait LiveStateEngine extends js.Object {
    
    var _bindEvents: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _isSeekedByUIWhilePlaying: js.Any = js.native
    
    var _onDynamicContentEnded: js.Any = js.native
    
    var _processSeekByUI: js.Any = js.native
    
    var _processStateChange: js.Any = js.native
    
    var _setState: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def state: LiveState = js.native
  }
  
  @js.native
  class default protected () extends LiveStateEngine {
    def this(hasEventEmitterEngine: ILiveStateEngineDependencies) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
