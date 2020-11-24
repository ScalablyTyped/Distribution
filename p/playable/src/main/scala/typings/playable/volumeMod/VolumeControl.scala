package typings.playable.volumeMod

import typings.playable.volumeTypesMod.IVolumeControl
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeControl extends IVolumeControl {
  
  var _bindCallbacks: js.Any = js.native
  
  var _bindEvents: js.Any = js.native
  
  var _broadcastDragEnd: js.Any = js.native
  
  var _broadcastDragStart: js.Any = js.native
  
  var _buttonInterceptor: js.Any = js.native
  
  var _changeVolumeLevel: js.Any = js.native
  
  var _destroyInterceptor: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _getVolumeLevelFromInput: js.Any = js.native
  
  var _getVolumeLevelFromWheel: js.Any = js.native
  
  var _initInterceptor: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _inputInterceptor: js.Any = js.native
  
  var _setMuteState: js.Any = js.native
  
  var _setVolumeLevel: js.Any = js.native
  
  var _textMap: js.Any = js.native
  
  var _theme: js.Any = js.native
  
  var _toggleMuteState: js.Any = js.native
  
  var _tooltipService: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var _updateSoundState: js.Any = js.native
  
  var isHidden: Boolean = js.native
  
  var view: typings.playable.volumeViewMod.default = js.native
}
object VolumeControl {
  
  @scala.inline
  def apply(
    _bindCallbacks: js.Any,
    _bindEvents: js.Any,
    _broadcastDragEnd: js.Any,
    _broadcastDragStart: js.Any,
    _buttonInterceptor: js.Any,
    _changeVolumeLevel: js.Any,
    _destroyInterceptor: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _getVolumeLevelFromInput: js.Any,
    _getVolumeLevelFromWheel: js.Any,
    _initInterceptor: js.Any,
    _initUI: js.Any,
    _inputInterceptor: js.Any,
    _setMuteState: js.Any,
    _setVolumeLevel: js.Any,
    _textMap: js.Any,
    _theme: js.Any,
    _toggleMuteState: js.Any,
    _tooltipService: js.Any,
    _unbindEvents: js.Any,
    _updateSoundState: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isHidden: Boolean,
    show: () => Unit,
    view: typings.playable.volumeViewMod.default
  ): VolumeControl = {
    val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _broadcastDragEnd = _broadcastDragEnd.asInstanceOf[js.Any], _broadcastDragStart = _broadcastDragStart.asInstanceOf[js.Any], _buttonInterceptor = _buttonInterceptor.asInstanceOf[js.Any], _changeVolumeLevel = _changeVolumeLevel.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _getVolumeLevelFromInput = _getVolumeLevelFromInput.asInstanceOf[js.Any], _getVolumeLevelFromWheel = _getVolumeLevelFromWheel.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _inputInterceptor = _inputInterceptor.asInstanceOf[js.Any], _setMuteState = _setMuteState.asInstanceOf[js.Any], _setVolumeLevel = _setVolumeLevel.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _toggleMuteState = _toggleMuteState.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updateSoundState = _updateSoundState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeControl]
  }
  
  @scala.inline
  implicit class VolumeControlOps[Self <: VolumeControl] (val x: Self) extends AnyVal {
    
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
    def set_broadcastDragEnd(value: js.Any): Self = this.set("_broadcastDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_broadcastDragStart(value: js.Any): Self = this.set("_broadcastDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_buttonInterceptor(value: js.Any): Self = this.set("_buttonInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_changeVolumeLevel(value: js.Any): Self = this.set("_changeVolumeLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_destroyInterceptor(value: js.Any): Self = this.set("_destroyInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getVolumeLevelFromInput(value: js.Any): Self = this.set("_getVolumeLevelFromInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getVolumeLevelFromWheel(value: js.Any): Self = this.set("_getVolumeLevelFromWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initInterceptor(value: js.Any): Self = this.set("_initInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inputInterceptor(value: js.Any): Self = this.set("_inputInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setMuteState(value: js.Any): Self = this.set("_setMuteState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setVolumeLevel(value: js.Any): Self = this.set("_setVolumeLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textMap(value: js.Any): Self = this.set("_textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_theme(value: js.Any): Self = this.set("_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_toggleMuteState(value: js.Any): Self = this.set("_toggleMuteState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tooltipService(value: js.Any): Self = this.set("_tooltipService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateSoundState(value: js.Any): Self = this.set("_updateSoundState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.volumeViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
