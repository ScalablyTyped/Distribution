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
  class default protected ()
    extends StObject
       with FullScreenControl {
    def this(hasEventEmitterFullScreenManagerTextMapTooltipServiceTheme: FullScreenManager) = this()
    
    /* CompleteClass */
    var _bindCallbacks: js.Any = js.native
    
    /* CompleteClass */
    var _bindEvents: js.Any = js.native
    
    /* CompleteClass */
    var _destroyInterceptor: js.Any = js.native
    
    /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* CompleteClass */
    var _fullScreenManager: js.Any = js.native
    
    /* CompleteClass */
    var _initInterceptor: js.Any = js.native
    
    /* CompleteClass */
    var _initUI: js.Any = js.native
    
    /* CompleteClass */
    var _interceptor: js.Any = js.native
    
    /* CompleteClass */
    var _textMap: js.Any = js.native
    
    /* CompleteClass */
    var _theme: js.Any = js.native
    
    /* CompleteClass */
    var _toggleFullScreen: js.Any = js.native
    
    /* CompleteClass */
    var _tooltipService: js.Any = js.native
    
    /* CompleteClass */
    var _unbindEvents: js.Any = js.native
    
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
    @scala.inline
    def View_=(x: Instantiable1[/* config */ IFullScreenViewConfig, typings.playable.fullScreenViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait FullScreenControl
    extends StObject
       with IFullScreenControl {
    
    var _bindCallbacks: js.Any
    
    var _bindEvents: js.Any
    
    var _destroyInterceptor: js.Any
    
    var _eventEmitter: js.Any
    
    var _fullScreenManager: js.Any
    
    var _initInterceptor: js.Any
    
    var _initUI: js.Any
    
    var _interceptor: js.Any
    
    var _textMap: js.Any
    
    var _theme: js.Any
    
    var _toggleFullScreen: js.Any
    
    var _tooltipService: js.Any
    
    var _unbindEvents: js.Any
    
    var isHidden: Boolean
    
    var view: typings.playable.fullScreenViewMod.default
  }
  object FullScreenControl {
    
    @scala.inline
    def apply(
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _destroyInterceptor: js.Any,
      _eventEmitter: js.Any,
      _fullScreenManager: js.Any,
      _initInterceptor: js.Any,
      _initUI: js.Any,
      _interceptor: js.Any,
      _textMap: js.Any,
      _theme: js.Any,
      _toggleFullScreen: js.Any,
      _tooltipService: js.Any,
      _unbindEvents: js.Any,
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
    
    @scala.inline
    implicit class FullScreenControlMutableBuilder[Self <: FullScreenControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: typings.playable.fullScreenViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_fullScreenManager(value: js.Any): Self = StObject.set(x, "_fullScreenManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_interceptor(value: js.Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_textMap(value: js.Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_toggleFullScreen(value: js.Any): Self = StObject.set(x, "_toggleFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tooltipService(value: js.Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
