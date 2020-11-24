package typings.playable.overlayMod

import typings.playable.overlayTypesMod.IOverlay
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay extends IOverlay {
  
  var _bindEvents: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _hideContent: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _loader: js.Any = js.native
  
  var _mainUIBlock: js.Any = js.native
  
  var _playVideo: js.Any = js.native
  
  var _showContent: js.Any = js.native
  
  var _theme: js.Any = js.native
  
  var _tryHideContent: js.Any = js.native
  
  var _tryShowContent: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var _updatePlayingState: js.Any = js.native
  
  var isHidden: Boolean = js.native
  
  /**
    * The `.turnOffOverlayTransparency()` method returns player's overlay to default settings.
    * It becomes black again.
    *
    * @example
    * player.turnOffOverlayTransparency();
    *
    */
  def turnOffOverlayTransparency(): Unit = js.native
  
  /**
    * After initialisation player has by default an overlay that is black;
    *
    * The `.turnOnOverlayTransparency()` method makes this overlay transparent.
    * @example
    * player.turnOnOverlayTransparency();
    *
    */
  def turnOnOverlayTransparency(): Unit = js.native
  
  var view: typings.playable.overlayViewMod.default = js.native
}
object Overlay {
  
  @scala.inline
  def apply(
    _bindEvents: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _hideContent: js.Any,
    _initUI: js.Any,
    _loader: js.Any,
    _mainUIBlock: js.Any,
    _playVideo: js.Any,
    _showContent: js.Any,
    _theme: js.Any,
    _tryHideContent: js.Any,
    _tryShowContent: js.Any,
    _unbindEvents: js.Any,
    _updatePlayingState: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isHidden: Boolean,
    setPoster: String => Unit,
    show: () => Unit,
    turnOffOverlayTransparency: () => Unit,
    turnOnOverlayTransparency: () => Unit,
    view: typings.playable.overlayViewMod.default
  ): Overlay = {
    val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _hideContent = _hideContent.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _loader = _loader.asInstanceOf[js.Any], _mainUIBlock = _mainUIBlock.asInstanceOf[js.Any], _playVideo = _playVideo.asInstanceOf[js.Any], _showContent = _showContent.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _tryHideContent = _tryHideContent.asInstanceOf[js.Any], _tryShowContent = _tryShowContent.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updatePlayingState = _updatePlayingState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setPoster = js.Any.fromFunction1(setPoster), show = js.Any.fromFunction0(show), turnOffOverlayTransparency = js.Any.fromFunction0(turnOffOverlayTransparency), turnOnOverlayTransparency = js.Any.fromFunction0(turnOnOverlayTransparency), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
    
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
    def set_hideContent(value: js.Any): Self = this.set("_hideContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_loader(value: js.Any): Self = this.set("_loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_mainUIBlock(value: js.Any): Self = this.set("_mainUIBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_playVideo(value: js.Any): Self = this.set("_playVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_showContent(value: js.Any): Self = this.set("_showContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_theme(value: js.Any): Self = this.set("_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tryHideContent(value: js.Any): Self = this.set("_tryHideContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tryShowContent(value: js.Any): Self = this.set("_tryShowContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updatePlayingState(value: js.Any): Self = this.set("_updatePlayingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurnOffOverlayTransparency(value: () => Unit): Self = this.set("turnOffOverlayTransparency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTurnOnOverlayTransparency(value: () => Unit): Self = this.set("turnOnOverlayTransparency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setView(value: typings.playable.overlayViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
