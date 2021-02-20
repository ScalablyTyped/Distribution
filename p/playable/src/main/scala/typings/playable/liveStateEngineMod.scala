package typings.playable

import typings.playable.liveStateMod.LiveState
import typings.playable.playbackEngineTypesMod.ILiveStateEngineDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveStateEngineMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/live-state-engine", JSImport.Default)
  @js.native
  class default protected () extends LiveStateEngine {
    def this(hasEventEmitterEngine: ILiveStateEngineDependencies) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/playback-engine/live-state-engine", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/playback-engine/live-state-engine", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/playback-engine/live-state-engine", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LiveStateEngine extends StObject {
    
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
}
