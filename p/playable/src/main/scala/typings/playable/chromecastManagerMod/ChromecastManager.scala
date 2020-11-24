package typings.playable.chromecastManagerMod

import typings.playable.chromecastManagerTypesMod.IChromecastManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromecastManager extends IChromecastManager {
  
  var _bindToContextEvents: js.Any = js.native
  
  var _context: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initCastContext: js.Any = js.native
  
  var _insertCastCallback: js.Any = js.native
  
  var _onCastStateChange: js.Any = js.native
  
  var _onSessionStateChange: js.Any = js.native
}
object ChromecastManager {
  
  @scala.inline
  def apply(
    _bindToContextEvents: js.Any,
    _context: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _initCastContext: js.Any,
    _insertCastCallback: js.Any,
    _onCastStateChange: js.Any,
    _onSessionStateChange: js.Any,
    destroy: () => Unit,
    isCasting: Boolean,
    isEnabled: Boolean
  ): ChromecastManager = {
    val __obj = js.Dynamic.literal(_bindToContextEvents = _bindToContextEvents.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initCastContext = _initCastContext.asInstanceOf[js.Any], _insertCastCallback = _insertCastCallback.asInstanceOf[js.Any], _onCastStateChange = _onCastStateChange.asInstanceOf[js.Any], _onSessionStateChange = _onSessionStateChange.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isCasting = isCasting.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromecastManager]
  }
  
  @scala.inline
  implicit class ChromecastManagerOps[Self <: ChromecastManager] (val x: Self) extends AnyVal {
    
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
    def set_bindToContextEvents(value: js.Any): Self = this.set("_bindToContextEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_context(value: js.Any): Self = this.set("_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initCastContext(value: js.Any): Self = this.set("_initCastContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_insertCastCallback(value: js.Any): Self = this.set("_insertCastCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onCastStateChange(value: js.Any): Self = this.set("_onCastStateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onSessionStateChange(value: js.Any): Self = this.set("_onSessionStateChange", value.asInstanceOf[js.Any])
  }
}
