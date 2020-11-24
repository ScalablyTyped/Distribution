package typings.playable.playMod

import typings.playable.playTypesMod.IPlayControl
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayControl extends IPlayControl {
  
  var _bindCallbacks: js.Any = js.native
  
  var _bindEvents: js.Any = js.native
  
  var _destroyInterceptor: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initInterceptor: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _interceptor: js.Any = js.native
  
  var _pauseVideo: js.Any = js.native
  
  var _playVideo: js.Any = js.native
  
  var _textMap: js.Any = js.native
  
  var _theme: js.Any = js.native
  
  var _togglePlayback: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var _updatePlayingState: js.Any = js.native
  
  var view: typings.playable.playViewMod.default = js.native
}
object PlayControl {
  
  @scala.inline
  def apply(
    _bindCallbacks: js.Any,
    _bindEvents: js.Any,
    _destroyInterceptor: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _initInterceptor: js.Any,
    _initUI: js.Any,
    _interceptor: js.Any,
    _pauseVideo: js.Any,
    _playVideo: js.Any,
    _textMap: js.Any,
    _theme: js.Any,
    _togglePlayback: js.Any,
    _unbindEvents: js.Any,
    _updatePlayingState: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    view: typings.playable.playViewMod.default
  ): PlayControl = {
    val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _pauseVideo = _pauseVideo.asInstanceOf[js.Any], _playVideo = _playVideo.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _togglePlayback = _togglePlayback.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updatePlayingState = _updatePlayingState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayControl]
  }
  
  @scala.inline
  implicit class PlayControlOps[Self <: PlayControl] (val x: Self) extends AnyVal {
    
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
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initInterceptor(value: js.Any): Self = this.set("_initInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_interceptor(value: js.Any): Self = this.set("_interceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pauseVideo(value: js.Any): Self = this.set("_pauseVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_playVideo(value: js.Any): Self = this.set("_playVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textMap(value: js.Any): Self = this.set("_textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_theme(value: js.Any): Self = this.set("_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_togglePlayback(value: js.Any): Self = this.set("_togglePlayback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updatePlayingState(value: js.Any): Self = this.set("_updatePlayingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typings.playable.playViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
