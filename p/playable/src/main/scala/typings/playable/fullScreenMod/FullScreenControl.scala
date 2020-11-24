package typings.playable.fullScreenMod

import typings.playable.fullScreenTypesMod.IFullScreenControl
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullScreenControl extends IFullScreenControl {
  
  var _bindCallbacks: js.Any = js.native
  
  var _bindEvents: js.Any = js.native
  
  var _destroyInterceptor: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _fullScreenManager: js.Any = js.native
  
  var _initInterceptor: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _interceptor: js.Any = js.native
  
  var _textMap: js.Any = js.native
  
  var _theme: js.Any = js.native
  
  var _toggleFullScreen: js.Any = js.native
  
  var _tooltipService: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var isHidden: Boolean = js.native
  
  var view: typings.playable.fullScreenViewMod.default = js.native
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
  implicit class FullScreenControlOps[Self <: FullScreenControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_bindCallbacks(value: js.Any): Self = this.set("_bindCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_bindEvents(value: js.Any): Self = this.set("_bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_destroyInterceptor(value: js.Any): Self = this.set("_destroyInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fullScreenManager(value: js.Any): Self = this.set("_fullScreenManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initInterceptor(value: js.Any): Self = this.set("_initInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_interceptor(value: js.Any): Self = this.set("_interceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textMap(value: js.Any): Self = this.set("_textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_theme(value: js.Any): Self = this.set("_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_toggleFullScreen(value: js.Any): Self = this.set("_toggleFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tooltipService(value: js.Any): Self = this.set("_tooltipService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.fullScreenViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
