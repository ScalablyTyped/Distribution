package typings.playable

import typings.playable.anon.Config
import typings.playable.fullScreenManagerTypesMod.IFullScreenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenManagerMod {
  
  @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", JSImport.Default)
  @js.native
  class default protected () extends FullScreenManager {
    def this(hasEventEmitterEngineRootContainerConfig: Config) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
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
}
