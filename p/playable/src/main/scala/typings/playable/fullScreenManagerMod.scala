package typings.playable

import typings.playable.anon.Config
import typings.playable.fullScreenManagerTypesMod.IFullScreenManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", JSImport.Namespace)
@js.native
object fullScreenManagerMod extends js.Object {
  
  @js.native
  trait FullScreenManager extends IFullScreenManager {
    
    var _bindEvents: js.Any = js.native
    
    var _element: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _enterFullScreenOnPlay: js.Any = js.native
    
    var _enterOnPlayRequested: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _exitFullScreenOnEnd: js.Any = js.native
    
    var _exitFullScreenOnPause: js.Any = js.native
    
    var _exitOnEnd: js.Any = js.native
    
    var _exitOnPauseRequested: js.Any = js.native
    
    var _helper: js.Any = js.native
    
    var _isEnabled: js.Any = js.native
    
    var _onChange: js.Any = js.native
    
    var _pauseVideoOnFullScreenExit: js.Any = js.native
    
    var _processNextStateFromEngine: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    @JSName("isEnabled")
    def isEnabled_MFullScreenManager: Boolean = js.native
    
    /**
      * Return true if player is in full screen
      * @example
      * console.log(player.isInFullScreen); // false
      */
    @JSName("isInFullScreen")
    def isInFullScreen_MFullScreenManager: Boolean = js.native
  }
  
  @js.native
  class default protected () extends FullScreenManager {
    def this(hasEventEmitterEngineRootContainerConfig: Config) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
