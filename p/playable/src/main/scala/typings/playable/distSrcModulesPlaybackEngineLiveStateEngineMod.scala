package typings.playable

import typings.playable.distSrcConstantsLiveStateMod.LiveState
import typings.playable.distSrcModulesPlaybackEngineTypesMod.ILiveStateEngineDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineLiveStateEngineMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/live-state-engine", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LiveStateEngine {
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
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/playback-engine/live-state-engine", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LiveStateEngine extends StObject {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _isSeekedByUIWhilePlaying: Any = js.native
    
    /* private */ var _onDynamicContentEnded: Any = js.native
    
    /* private */ var _processSeekByUI: Any = js.native
    
    /* private */ var _processStateChange: Any = js.native
    
    /* private */ var _setState: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def state: LiveState = js.native
  }
}
