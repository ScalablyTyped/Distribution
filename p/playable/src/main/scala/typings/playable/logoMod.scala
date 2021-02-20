package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.TextMap
import typings.playable.logoTypesMod.ILogoControl
import typings.playable.logoTypesMod.ILogoViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/logo/logo", JSImport.Default)
  @js.native
  class default protected () extends Logo {
    def this(hasEventEmitterTextMapTooltipServiceTheme: TextMap) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.View")
    @js.native
    class View protected ()
      extends typings.playable.logoViewMod.default {
      def this(config: ILogoViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.View")
    @js.native
    def View: Instantiable1[/* config */ ILogoViewConfig, typings.playable.logoViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ ILogoViewConfig, typings.playable.logoViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
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
}
