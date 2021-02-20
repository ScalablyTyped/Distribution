package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.ConfigEngine
import typings.playable.loaderTypesMod.ILoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("playable/dist/src/modules/ui/loader/loader", JSImport.Default)
  @js.native
  class default protected () extends Loader {
    def this(hasConfigEventEmitterEngineRootContainer: ConfigEngine) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", "default.View")
    @js.native
    def View: Instantiable0[typings.playable.loaderViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable0[typings.playable.loaderViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loader/loader", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/ui/loader/loader", "DELAYED_SHOW_TIMEOUT")
  @js.native
  val DELAYED_SHOW_TIMEOUT: /* 100 */ Double = js.native
  
  @js.native
  trait Loader extends ILoader {
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _checkForWaitingState: js.Any = js.native
    
    var _delayedShowTimeout: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _hideContent: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _showContent: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    @JSName("isDelayedShowScheduled")
    def isDelayedShowScheduled_MLoader: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    def startDelayedShow(): Unit = js.native
    
    var view: typings.playable.loaderViewMod.default = js.native
  }
}
