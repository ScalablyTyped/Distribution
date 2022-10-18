package typings.playable.anon

import typings.playable.distSrcModulesKeyboardControlTypesMod.IKeyboardControl
import typings.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typings.playable.distSrcModulesRootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardControl extends StObject {
  
  var engine: IPlaybackEngine
  
  var keyboardControl: IKeyboardControl
  
  var rootContainer: IRootContainer
}
object KeyboardControl {
  
  inline def apply(engine: IPlaybackEngine, keyboardControl: IKeyboardControl, rootContainer: IRootContainer): KeyboardControl = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], keyboardControl = keyboardControl.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardControl]
  }
  
  extension [Self <: KeyboardControl](x: Self) {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setKeyboardControl(value: IKeyboardControl): Self = StObject.set(x, "keyboardControl", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
