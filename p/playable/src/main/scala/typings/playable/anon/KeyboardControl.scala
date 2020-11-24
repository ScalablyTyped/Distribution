package typings.playable.anon

import typings.playable.keyboardControlTypesMod.IKeyboardControl
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.rootContainerTypesMod.IRootContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardControl extends js.Object {
  
  var engine: IPlaybackEngine = js.native
  
  var keyboardControl: IKeyboardControl = js.native
  
  var rootContainer: IRootContainer = js.native
}
object KeyboardControl {
  
  @scala.inline
  def apply(engine: IPlaybackEngine, keyboardControl: IKeyboardControl, rootContainer: IRootContainer): KeyboardControl = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], keyboardControl = keyboardControl.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
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
    def setEngine(value: IPlaybackEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardControl(value: IKeyboardControl): Self = this.set("keyboardControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = this.set("rootContainer", value.asInstanceOf[js.Any])
  }
}
