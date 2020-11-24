package typings.playable.interactionIndicatorMod

import typings.playable.interactionIndicatorTypesMod.IInteractionIndicator
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionIndicator extends IInteractionIndicator {
  
  var _bindEvents: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _showPlaybackChangeIndicator: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var view: typings.playable.interactionIndicatorViewMod.default = js.native
}
object InteractionIndicator {
  
  @scala.inline
  def apply(
    _bindEvents: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _initUI: js.Any,
    _showPlaybackChangeIndicator: js.Any,
    _unbindEvents: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    hideIcons: () => Unit,
    show: () => Unit,
    showDecreaseVolume: () => Unit,
    showForward: () => Unit,
    showIncreaseVolume: () => Unit,
    showMute: () => Unit,
    showPause: () => Unit,
    showPlay: () => Unit,
    showRewind: () => Unit,
    view: typings.playable.interactionIndicatorViewMod.default
  ): InteractionIndicator = {
    val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _showPlaybackChangeIndicator = _showPlaybackChangeIndicator.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideIcons = js.Any.fromFunction0(hideIcons), show = js.Any.fromFunction0(show), showDecreaseVolume = js.Any.fromFunction0(showDecreaseVolume), showForward = js.Any.fromFunction0(showForward), showIncreaseVolume = js.Any.fromFunction0(showIncreaseVolume), showMute = js.Any.fromFunction0(showMute), showPause = js.Any.fromFunction0(showPause), showPlay = js.Any.fromFunction0(showPlay), showRewind = js.Any.fromFunction0(showRewind), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIndicator]
  }
  
  @scala.inline
  implicit class InteractionIndicatorOps[Self <: InteractionIndicator] (val x: Self) extends AnyVal {
    
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
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_showPlaybackChangeIndicator(value: js.Any): Self = this.set("_showPlaybackChangeIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.interactionIndicatorViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
