package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.ConfigEngine
import typings.playable.loaderTypesMod.ILoader
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("playable/dist/src/modules/ui/loader/loader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Loader {
    def this(hasConfigEventEmitterEngineRootContainer: ConfigEngine) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isDelayedShowScheduled: Boolean = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def stopDelayedShow(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", "default.View")
    @js.native
    def View: Instantiable0[typings.playable.loaderViewMod.default] = js.native
    inline def View_=(x: Instantiable0[typings.playable.loaderViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/ui/loader/loader", "DELAYED_SHOW_TIMEOUT")
  @js.native
  val DELAYED_SHOW_TIMEOUT: /* 100 */ Double = js.native
  
  @js.native
  trait Loader
    extends StObject
       with ILoader {
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _checkForWaitingState: Any = js.native
    
    /* private */ var _delayedShowTimeout: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _hideContent: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _showContent: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    @JSName("isDelayedShowScheduled")
    def isDelayedShowScheduled_MLoader: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    def startDelayedShow(): Unit = js.native
    
    var view: typings.playable.loaderViewMod.default = js.native
  }
}
