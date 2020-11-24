package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.TextMap
import typings.playable.logoTypesMod.ILogoControl
import typings.playable.logoTypesMod.ILogoViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/logo/logo", JSImport.Namespace)
@js.native
object logoMod extends js.Object {
  
  @js.native
  trait Logo extends ILogoControl {
    
    var _bindCallbacks: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _destroyInterceptor: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initInterceptor: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _interceptor: js.Any = js.native
    
    var _logoSrc: js.Any = js.native
    
    var _setProperDisplayState: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _theme: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    var _triggerCallback: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.logoViewMod.default = js.native
  }
  
  @js.native
  class default protected () extends Logo {
    def this(hasEventEmitterTextMapTooltipServiceTheme: TextMap) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var View: Instantiable1[/* config */ ILogoViewConfig, typings.playable.logoViewMod.default] = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
