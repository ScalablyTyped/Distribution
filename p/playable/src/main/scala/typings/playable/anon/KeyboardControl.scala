package typings.playable.anon

import typings.playable.keyboardControlTypesMod.IKeyboardControl
import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import typings.playable.rootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardControl extends StObject {
  
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
  implicit class KeyboardControlMutableBuilder[Self <: KeyboardControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardControl(value: IKeyboardControl): Self = StObject.set(x, "keyboardControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
