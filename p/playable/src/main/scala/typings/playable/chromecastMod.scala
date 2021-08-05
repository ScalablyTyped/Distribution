package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.BottomBlock
import typings.playable.controlsChromecastTypesMod.IChromecastButton
import typings.playable.controlsChromecastTypesMod.IChromecastViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromecastMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ChromecastButton {
    def this(hasEventEmitterTextMapTooltipServiceThemeChromecastManagerBottomBlock: BottomBlock) = this()
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _bottomBlock: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _callback: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _chromecastManager: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _connectToPanel: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _interceptor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _tooltipService: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _triggerCallback: js.Any = js.native
    
    /* private */ /* CompleteClass */
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
    override def setChromecastButtonCallback(callback: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.chromecastViewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IChromecastViewConfig, typings.playable.chromecastViewMod.default] = js.native
    inline def View_=(x: Instantiable1[/* config */ IChromecastViewConfig, typings.playable.chromecastViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait ChromecastButton
    extends StObject
       with IChromecastButton {
    
    /* private */ var _bindCallbacks: js.Any
    
    /* private */ var _bindEvents: js.Any
    
    /* private */ var _bottomBlock: js.Any
    
    /* private */ var _callback: js.Any
    
    /* private */ var _chromecastManager: js.Any
    
    /* private */ var _connectToPanel: js.Any
    
    /* private */ var _destroyInterceptor: js.Any
    
    /* private */ var _eventEmitter: js.Any
    
    /* private */ var _initInterceptor: js.Any
    
    /* private */ var _initUI: js.Any
    
    /* private */ var _interceptor: js.Any
    
    /* private */ var _textMap: js.Any
    
    /* private */ var _theme: js.Any
    
    /* private */ var _tooltipService: js.Any
    
    /* private */ var _triggerCallback: js.Any
    
    /* private */ var _unbindEvents: js.Any
    
    var isHidden: Boolean
    
    var view: typings.playable.chromecastViewMod.default
  }
  object ChromecastButton {
    
    inline def apply(
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _bottomBlock: js.Any,
      _callback: js.Any,
      _chromecastManager: js.Any,
      _connectToPanel: js.Any,
      _destroyInterceptor: js.Any,
      _eventEmitter: js.Any,
      _initInterceptor: js.Any,
      _initUI: js.Any,
      _interceptor: js.Any,
      _textMap: js.Any,
      _theme: js.Any,
      _tooltipService: js.Any,
      _triggerCallback: js.Any,
      _unbindEvents: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setChromecastButtonCallback: js.Function => Unit,
      show: () => Unit,
      view: typings.playable.chromecastViewMod.default
    ): ChromecastButton = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _bottomBlock = _bottomBlock.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _chromecastManager = _chromecastManager.asInstanceOf[js.Any], _connectToPanel = _connectToPanel.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _triggerCallback = _triggerCallback.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setChromecastButtonCallback = js.Any.fromFunction1(setChromecastButtonCallback), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromecastButton]
    }
    
    extension [Self <: ChromecastButton](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.chromecastViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_bottomBlock(value: js.Any): Self = StObject.set(x, "_bottomBlock", value.asInstanceOf[js.Any])
      
      inline def set_callback(value: js.Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      inline def set_chromecastManager(value: js.Any): Self = StObject.set(x, "_chromecastManager", value.asInstanceOf[js.Any])
      
      inline def set_connectToPanel(value: js.Any): Self = StObject.set(x, "_connectToPanel", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_interceptor(value: js.Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: js.Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_tooltipService(value: js.Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      inline def set_triggerCallback(value: js.Any): Self = StObject.set(x, "_triggerCallback", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
