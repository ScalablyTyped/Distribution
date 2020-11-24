package typings.playable.debugPanelMod

import typings.playable.anon.CurrentBitrate
import typings.playable.playbackEngineTypesMod.IEngineDebugInfo
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugPanel extends js.Object {
  
  var _bindCallbacks: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _interval: js.Any = js.native
  
  var _keyControlCallback: js.Any = js.native
  
  def clearUpdateInterval(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getDebugInfo(): IEngineDebugInfo | CurrentBitrate = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  var isHidden: Boolean = js.native
  
  def setUpdateInterval(): Unit = js.native
  
  def show(): Unit = js.native
  
  def updateInfo(): Unit = js.native
  
  var view: typings.playable.debugPanelViewMod.default = js.native
}
object DebugPanel {
  
  @scala.inline
  def apply(
    _bindCallbacks: js.Any,
    _engine: js.Any,
    _initUI: js.Any,
    _interval: js.Any,
    _keyControlCallback: js.Any,
    clearUpdateInterval: () => Unit,
    destroy: () => Unit,
    getDebugInfo: () => IEngineDebugInfo | CurrentBitrate,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isHidden: Boolean,
    setUpdateInterval: () => Unit,
    show: () => Unit,
    updateInfo: () => Unit,
    view: typings.playable.debugPanelViewMod.default
  ): DebugPanel = {
    val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interval = _interval.asInstanceOf[js.Any], _keyControlCallback = _keyControlCallback.asInstanceOf[js.Any], clearUpdateInterval = js.Any.fromFunction0(clearUpdateInterval), destroy = js.Any.fromFunction0(destroy), getDebugInfo = js.Any.fromFunction0(getDebugInfo), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setUpdateInterval = js.Any.fromFunction0(setUpdateInterval), show = js.Any.fromFunction0(show), updateInfo = js.Any.fromFunction0(updateInfo), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugPanel]
  }
  
  @scala.inline
  implicit class DebugPanelOps[Self <: DebugPanel] (val x: Self) extends AnyVal {
    
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
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_interval(value: js.Any): Self = this.set("_interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_keyControlCallback(value: js.Any): Self = this.set("_keyControlCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUpdateInterval(value: () => Unit): Self = this.set("clearUpdateInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDebugInfo(value: () => IEngineDebugInfo | CurrentBitrate): Self = this.set("getDebugInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUpdateInterval(value: () => Unit): Self = this.set("setUpdateInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateInfo(value: () => Unit): Self = this.set("updateInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setView(value: typings.playable.debugPanelViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
