package typings.playcanvas.anon

import typings.playcanvas.mod.GamePads
import typings.playcanvas.mod.Keyboard
import typings.playcanvas.mod.Mouse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gamepads extends StObject {
  
  var gamepads: js.UndefOr[GamePads] = js.undefined
  
  var keyboard: js.UndefOr[Keyboard] = js.undefined
  
  var mouse: js.UndefOr[Mouse] = js.undefined
}
object Gamepads {
  
  inline def apply(): Gamepads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gamepads]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gamepads] (val x: Self) extends AnyVal {
    
    inline def setGamepads(value: GamePads): Self = StObject.set(x, "gamepads", value.asInstanceOf[js.Any])
    
    inline def setGamepadsUndefined: Self = StObject.set(x, "gamepads", js.undefined)
    
    inline def setKeyboard(value: Keyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setMouse(value: Mouse): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
  }
}
