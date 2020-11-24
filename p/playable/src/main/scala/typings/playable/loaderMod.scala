package typings.playable

import org.scalablytyped.runtime.Instantiable0
import typings.playable.anon.ConfigEngine
import typings.playable.loaderTypesMod.ILoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/loader/loader", JSImport.Namespace)
@js.native
object loaderMod extends js.Object {
  
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
  
  @js.native
  class default protected () extends Loader {
    def this(hasConfigEventEmitterEngineRootContainer: ConfigEngine) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var View: Instantiable0[typings.playable.loaderViewMod.default] = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
