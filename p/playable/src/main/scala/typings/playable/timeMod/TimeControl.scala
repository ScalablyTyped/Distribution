package typings.playable.timeMod

import typings.playable.timeTypesMod.ITimeControl
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeControl extends ITimeControl {
  
  var _bindCallbacks: js.Any = js.native
  
  var _bindEvents: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _processLiveStateChange: js.Any = js.native
  
  var _setCurrentTime: js.Any = js.native
  
  var _setDurationTime: js.Any = js.native
  
  var _startIntervalUpdates: js.Any = js.native
  
  var _stopIntervalUpdates: js.Any = js.native
  
  var _theme: js.Any = js.native
  
  var _toggleIntervalUpdates: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var _updateControlInterval: js.Any = js.native
  
  var _updateCurrentTime: js.Any = js.native
  
  var _updateDurationTime: js.Any = js.native
  
  var _updateTimeFromPreview: js.Any = js.native
  
  var isHidden: Boolean = js.native
  
  var view: typings.playable.timeViewMod.default = js.native
}
object TimeControl {
  
  @scala.inline
  def apply(
    _bindCallbacks: js.Any,
    _bindEvents: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _initUI: js.Any,
    _processLiveStateChange: js.Any,
    _setCurrentTime: js.Any,
    _setDurationTime: js.Any,
    _startIntervalUpdates: js.Any,
    _stopIntervalUpdates: js.Any,
    _theme: js.Any,
    _toggleIntervalUpdates: js.Any,
    _unbindEvents: js.Any,
    _updateControlInterval: js.Any,
    _updateCurrentTime: js.Any,
    _updateDurationTime: js.Any,
    _updateTimeFromPreview: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isHidden: Boolean,
    reset: () => Unit,
    show: () => Unit,
    view: typings.playable.timeViewMod.default
  ): TimeControl = {
    val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _processLiveStateChange = _processLiveStateChange.asInstanceOf[js.Any], _setCurrentTime = _setCurrentTime.asInstanceOf[js.Any], _setDurationTime = _setDurationTime.asInstanceOf[js.Any], _startIntervalUpdates = _startIntervalUpdates.asInstanceOf[js.Any], _stopIntervalUpdates = _stopIntervalUpdates.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _toggleIntervalUpdates = _toggleIntervalUpdates.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updateControlInterval = _updateControlInterval.asInstanceOf[js.Any], _updateCurrentTime = _updateCurrentTime.asInstanceOf[js.Any], _updateDurationTime = _updateDurationTime.asInstanceOf[js.Any], _updateTimeFromPreview = _updateTimeFromPreview.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeControl]
  }
  
  @scala.inline
  implicit class TimeControlOps[Self <: TimeControl] (val x: Self) extends AnyVal {
    
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
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_processLiveStateChange(value: js.Any): Self = this.set("_processLiveStateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setCurrentTime(value: js.Any): Self = this.set("_setCurrentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setDurationTime(value: js.Any): Self = this.set("_setDurationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startIntervalUpdates(value: js.Any): Self = this.set("_startIntervalUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stopIntervalUpdates(value: js.Any): Self = this.set("_stopIntervalUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_theme(value: js.Any): Self = this.set("_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_toggleIntervalUpdates(value: js.Any): Self = this.set("_toggleIntervalUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateControlInterval(value: js.Any): Self = this.set("_updateControlInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateCurrentTime(value: js.Any): Self = this.set("_updateCurrentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateDurationTime(value: js.Any): Self = this.set("_updateDurationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateTimeFromPreview(value: js.Any): Self = this.set("_updateTimeFromPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.timeViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
