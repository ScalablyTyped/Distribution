package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.FullScreenManager
import typings.playable.fullScreenTypesMod.IFullScreenControl
import typings.playable.fullScreenTypesMod.IFullScreenViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FullScreenControl {
    def this(hasEventEmitterFullScreenManagerTextMapTooltipServiceTheme: FullScreenManager) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _fullScreenManager: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _interceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: Any = js.native
    
    /* private */ /* CompleteClass */
    var _toggleFullScreen: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tooltipService: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.fullScreenViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IFullScreenViewConfig, typings.playable.fullScreenViewMod.default] = js.native
    inline def View_=(x: Instantiable1[/* config */ IFullScreenViewConfig, typings.playable.fullScreenViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait FullScreenControl
    extends StObject
       with IFullScreenControl {
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _destroyInterceptor: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _fullScreenManager: Any
    
    /* private */ var _initInterceptor: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _interceptor: Any
    
    /* private */ var _textMap: Any
    
    /* private */ var _theme: Any
    
    /* private */ var _toggleFullScreen: Any
    
    /* private */ var _tooltipService: Any
    
    /* private */ var _unbindEvents: Any
    
    var isHidden: Boolean
    
    var view: typings.playable.fullScreenViewMod.default
  }
  object FullScreenControl {
    
    inline def apply(
      _bindCallbacks: Any,
      _bindEvents: Any,
      _destroyInterceptor: Any,
      _eventEmitter: Any,
      _fullScreenManager: Any,
      _initInterceptor: Any,
      _initUI: Any,
      _interceptor: Any,
      _textMap: Any,
      _theme: Any,
      _toggleFullScreen: Any,
      _tooltipService: Any,
      _unbindEvents: Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      show: () => Unit,
      view: typings.playable.fullScreenViewMod.default
    ): FullScreenControl = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _fullScreenManager = _fullScreenManager.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _toggleFullScreen = _toggleFullScreen.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullScreenControl]
    }
    
    extension [Self <: FullScreenControl](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.fullScreenViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_fullScreenManager(value: Any): Self = StObject.set(x, "_fullScreenManager", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_interceptor(value: Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_toggleFullScreen(value: Any): Self = StObject.set(x, "_toggleFullScreen", value.asInstanceOf[js.Any])
      
      inline def set_tooltipService(value: Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
