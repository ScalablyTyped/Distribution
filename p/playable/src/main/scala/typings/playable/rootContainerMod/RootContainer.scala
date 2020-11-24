package typings.playable.rootContainerMod

import typings.playable.rootContainerTypesMod.IRootContainer
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootContainer extends IRootContainer {
  
  var _bindCallbacks: js.Any = js.native
  
  var _bindEvents: js.Any = js.native
  
  var _broadcastFocusEnter: js.Any = js.native
  
  var _broadcastFocusLeave: js.Any = js.native
  
  var _broadcastMouseEnter: js.Any = js.native
  
  var _broadcastMouseLeave: js.Any = js.native
  
  var _broadcastMouseMove: js.Any = js.native
  
  var _disableFocusInterceptors: js.Any = js.native
  
  var _disengageFocusSource: js.Any = js.native
  
  var _disengageFocusWithin: js.Any = js.native
  
  var _elementQueries: js.Any = js.native
  
  var _enableFocusInterceptors: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _onResized: js.Any = js.native
  
  var _resizeObserver: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  /**
    * Method for attaching player node to your container
    *
    * @example
    * document.addEventListener('DOMContentLoaded', function() {
    *   const config = { src: 'http://my-url/video.mp4' }
    *   const player = Playable.create(config);
    *
    *   player.attachToElement(document.getElementById('content'));
    * });
    */
  def attachToElement(element: Element): Unit = js.native
  
  var isHidden: Boolean = js.native
  
  var view: typings.playable.rootContainerViewMod.default = js.native
}
object RootContainer {
  
  @scala.inline
  def apply(
    _bindCallbacks: js.Any,
    _bindEvents: js.Any,
    _broadcastFocusEnter: js.Any,
    _broadcastFocusLeave: js.Any,
    _broadcastMouseEnter: js.Any,
    _broadcastMouseLeave: js.Any,
    _broadcastMouseMove: js.Any,
    _disableFocusInterceptors: js.Any,
    _disengageFocusSource: js.Any,
    _disengageFocusWithin: js.Any,
    _elementQueries: js.Any,
    _enableFocusInterceptors: js.Any,
    _eventEmitter: js.Any,
    _initUI: js.Any,
    _onResized: js.Any,
    _resizeObserver: js.Any,
    _unbindEvents: js.Any,
    appendComponentElement: HTMLElement => Unit,
    attachToElement: Element => Unit,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    getHeight: () => Double,
    getWidth: () => Double,
    hide: () => Unit,
    isHidden: Boolean,
    setFillAllSpace: Boolean => Unit,
    setHeight: Double => Unit,
    setRtl: Boolean => Unit,
    setWidth: Double => Unit,
    show: () => Unit,
    view: typings.playable.rootContainerViewMod.default
  ): RootContainer = {
    val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _broadcastFocusEnter = _broadcastFocusEnter.asInstanceOf[js.Any], _broadcastFocusLeave = _broadcastFocusLeave.asInstanceOf[js.Any], _broadcastMouseEnter = _broadcastMouseEnter.asInstanceOf[js.Any], _broadcastMouseLeave = _broadcastMouseLeave.asInstanceOf[js.Any], _broadcastMouseMove = _broadcastMouseMove.asInstanceOf[js.Any], _disableFocusInterceptors = _disableFocusInterceptors.asInstanceOf[js.Any], _disengageFocusSource = _disengageFocusSource.asInstanceOf[js.Any], _disengageFocusWithin = _disengageFocusWithin.asInstanceOf[js.Any], _elementQueries = _elementQueries.asInstanceOf[js.Any], _enableFocusInterceptors = _enableFocusInterceptors.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _onResized = _onResized.asInstanceOf[js.Any], _resizeObserver = _resizeObserver.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], appendComponentElement = js.Any.fromFunction1(appendComponentElement), attachToElement = js.Any.fromFunction1(attachToElement), destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setFillAllSpace = js.Any.fromFunction1(setFillAllSpace), setHeight = js.Any.fromFunction1(setHeight), setRtl = js.Any.fromFunction1(setRtl), setWidth = js.Any.fromFunction1(setWidth), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootContainer]
  }
  
  @scala.inline
  implicit class RootContainerOps[Self <: RootContainer] (val x: Self) extends AnyVal {
    
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
    def set_broadcastFocusEnter(value: js.Any): Self = this.set("_broadcastFocusEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_broadcastFocusLeave(value: js.Any): Self = this.set("_broadcastFocusLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_broadcastMouseEnter(value: js.Any): Self = this.set("_broadcastMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_broadcastMouseLeave(value: js.Any): Self = this.set("_broadcastMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_broadcastMouseMove(value: js.Any): Self = this.set("_broadcastMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_disableFocusInterceptors(value: js.Any): Self = this.set("_disableFocusInterceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_disengageFocusSource(value: js.Any): Self = this.set("_disengageFocusSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_disengageFocusWithin(value: js.Any): Self = this.set("_disengageFocusWithin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_elementQueries(value: js.Any): Self = this.set("_elementQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_enableFocusInterceptors(value: js.Any): Self = this.set("_enableFocusInterceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onResized(value: js.Any): Self = this.set("_onResized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_resizeObserver(value: js.Any): Self = this.set("_resizeObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachToElement(value: Element => Unit): Self = this.set("attachToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.rootContainerViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
