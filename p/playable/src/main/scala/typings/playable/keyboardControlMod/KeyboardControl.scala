package typings.playable.keyboardControlMod

import typings.playable.keyboardControlTypesMod.IKeyboardControl
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardControl extends IKeyboardControl {
  
  var _attachDefaultControls: js.Any = js.native
  
  var _destroyInterceptor: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initInterceptor: js.Any = js.native
  
  var _isEnabled: js.Any = js.native
  
  var _keyboardInterceptor: js.Any = js.native
}
object KeyboardControl {
  
  @scala.inline
  def apply(
    _attachDefaultControls: js.Any,
    _destroyInterceptor: js.Any,
    _engine: js.Any,
    _eventEmitter: js.Any,
    _initInterceptor: js.Any,
    _isEnabled: js.Any,
    _keyboardInterceptor: js.Any,
    addKeyControl: (Double, EventListener) => Unit,
    destroy: () => Unit
  ): KeyboardControl = {
    val __obj = js.Dynamic.literal(_attachDefaultControls = _attachDefaultControls.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _isEnabled = _isEnabled.asInstanceOf[js.Any], _keyboardInterceptor = _keyboardInterceptor.asInstanceOf[js.Any], addKeyControl = js.Any.fromFunction2(addKeyControl), destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[KeyboardControl]
  }
  
  @scala.inline
  implicit class KeyboardControlOps[Self <: KeyboardControl] (val x: Self) extends AnyVal {
    
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
    def set_attachDefaultControls(value: js.Any): Self = this.set("_attachDefaultControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_destroyInterceptor(value: js.Any): Self = this.set("_destroyInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initInterceptor(value: js.Any): Self = this.set("_initInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isEnabled(value: js.Any): Self = this.set("_isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_keyboardInterceptor(value: js.Any): Self = this.set("_keyboardInterceptor", value.asInstanceOf[js.Any])
  }
}
