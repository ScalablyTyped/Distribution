package typings.playable.loadingCoverMod

import typings.playable.loadingCoverTypesMod.ILoadingCover
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingCover extends ILoadingCover {
  
  var _bindEvents: js.Any = js.native
  
  var _bottomBlock: js.Any = js.native
  
  var _checkForWaitingState: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var isHidden: Boolean = js.native
  
  var view: typings.playable.loadingCoverViewMod.default = js.native
}
object LoadingCover {
  
  @scala.inline
  def apply(
    _bindEvents: js.Any,
    _bottomBlock: js.Any,
    _checkForWaitingState: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _initUI: js.Any,
    _unbindEvents: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isHidden: Boolean,
    setLoadingCover: String => Unit,
    show: () => Unit,
    view: typings.playable.loadingCoverViewMod.default
  ): LoadingCover = {
    val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _bottomBlock = _bottomBlock.asInstanceOf[js.Any], _checkForWaitingState = _checkForWaitingState.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setLoadingCover = js.Any.fromFunction1(setLoadingCover), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingCover]
  }
  
  @scala.inline
  implicit class LoadingCoverOps[Self <: LoadingCover] (val x: Self) extends AnyVal {
    
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
    def set_bindEvents(value: js.Any): Self = this.set("_bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_bottomBlock(value: js.Any): Self = this.set("_bottomBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_checkForWaitingState(value: js.Any): Self = this.set("_checkForWaitingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.loadingCoverViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
