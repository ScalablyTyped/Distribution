package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.TextMap
import typings.playable.logoTypesMod.ILogoControl
import typings.playable.logoTypesMod.ILogoViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/logo/logo", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Logo {
    def this(hasEventEmitterTextMapTooltipServiceTheme: TextMap) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.View")
    @js.native
    open class View protected ()
      extends typings.playable.logoViewMod.default {
      def this(config: ILogoViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.View")
    @js.native
    def View: Instantiable1[/* config */ ILogoViewConfig, typings.playable.logoViewMod.default] = js.native
    inline def View_=(x: Instantiable1[/* config */ ILogoViewConfig, typings.playable.logoViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/logo/logo", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Logo
    extends StObject
       with ILogoControl {
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _destroyInterceptor: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _initInterceptor: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _interceptor: Any = js.native
    
    /* private */ var _logoSrc: Any = js.native
    
    /* private */ var _setProperDisplayState: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _theme: Any = js.native
    
    /* private */ var _tooltipService: Any = js.native
    
    /* private */ var _triggerCallback: Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typings.playable.logoViewMod.default = js.native
  }
}
