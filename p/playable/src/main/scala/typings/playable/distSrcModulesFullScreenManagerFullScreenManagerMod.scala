package typings.playable

import typings.playable.anon.Config
import typings.playable.distSrcModulesFullScreenManagerTypesMod.IFullScreenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesFullScreenManagerFullScreenManagerMod {
  
  @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FullScreenManager {
    def this(hasEventEmitterEngineRootContainerConfig: Config) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disableEnterFullScreenOnPlay(): Unit = js.native
    
    /* CompleteClass */
    override def disableExitFullScreenOnEnd(): Unit = js.native
    
    /* CompleteClass */
    override def disableExitFullScreenOnPause(): Unit = js.native
    
    /* CompleteClass */
    override def disablePauseVideoOnFullScreenExit(): Unit = js.native
    
    /* CompleteClass */
    override def enableEnterFullScreenOnPlay(): Unit = js.native
    
    /* CompleteClass */
    override def enableExitFullScreenOnEnd(): Unit = js.native
    
    /* CompleteClass */
    override def enableExitFullScreenOnPause(): Unit = js.native
    
    /* CompleteClass */
    override def enablePauseVideoOnFullScreenExit(): Unit = js.native
    
    /* CompleteClass */
    override def enterFullScreen(): Unit = js.native
    
    /* CompleteClass */
    override def exitFullScreen(): Unit = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isInFullScreen: Boolean = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/full-screen-manager/full-screen-manager", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FullScreenManager
    extends StObject
       with IFullScreenManager {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _element: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _enterFullScreenOnPlay: Any = js.native
    
    /* private */ var _enterOnPlayRequested: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _exitFullScreenOnEnd: Any = js.native
    
    /* private */ var _exitFullScreenOnPause: Any = js.native
    
    /* private */ var _exitOnEnd: Any = js.native
    
    /* private */ var _exitOnPauseRequested: Any = js.native
    
    /* private */ var _helper: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ var _pauseVideoOnFullScreenExit: Any = js.native
    
    /* private */ var _processNextStateFromEngine: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
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
