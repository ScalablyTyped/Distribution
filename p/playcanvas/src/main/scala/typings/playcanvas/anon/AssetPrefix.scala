package typings.playcanvas.anon

import typings.playcanvas.pc.ElementInput
import typings.playcanvas.pc.GamePads
import typings.playcanvas.pc.Keyboard
import typings.playcanvas.pc.Mouse
import typings.playcanvas.pc.TouchDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPrefix extends StObject {
  
  var assetPrefix: js.UndefOr[String] = js.undefined
  
  var elementInput: js.UndefOr[ElementInput] = js.undefined
  
  var gamepads: js.UndefOr[GamePads] = js.undefined
  
  var graphicsDeviceOptions: js.UndefOr[js.Any] = js.undefined
  
  var keyboard: js.UndefOr[Keyboard] = js.undefined
  
  var mouse: js.UndefOr[Mouse] = js.undefined
  
  var scriptPrefix: js.UndefOr[String] = js.undefined
  
  var scriptsOrder: js.UndefOr[js.Array[String]] = js.undefined
  
  var touch: js.UndefOr[TouchDevice] = js.undefined
}
object AssetPrefix {
  
  inline def apply(): AssetPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPrefix]
  }
  
  extension [Self <: AssetPrefix](x: Self) {
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    inline def setElementInput(value: ElementInput): Self = StObject.set(x, "elementInput", value.asInstanceOf[js.Any])
    
    inline def setElementInputUndefined: Self = StObject.set(x, "elementInput", js.undefined)
    
    inline def setGamepads(value: GamePads): Self = StObject.set(x, "gamepads", value.asInstanceOf[js.Any])
    
    inline def setGamepadsUndefined: Self = StObject.set(x, "gamepads", js.undefined)
    
    inline def setGraphicsDeviceOptions(value: js.Any): Self = StObject.set(x, "graphicsDeviceOptions", value.asInstanceOf[js.Any])
    
    inline def setGraphicsDeviceOptionsUndefined: Self = StObject.set(x, "graphicsDeviceOptions", js.undefined)
    
    inline def setKeyboard(value: Keyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setMouse(value: Mouse): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setScriptPrefix(value: String): Self = StObject.set(x, "scriptPrefix", value.asInstanceOf[js.Any])
    
    inline def setScriptPrefixUndefined: Self = StObject.set(x, "scriptPrefix", js.undefined)
    
    inline def setScriptsOrder(value: js.Array[String]): Self = StObject.set(x, "scriptsOrder", value.asInstanceOf[js.Any])
    
    inline def setScriptsOrderUndefined: Self = StObject.set(x, "scriptsOrder", js.undefined)
    
    inline def setScriptsOrderVarargs(value: String*): Self = StObject.set(x, "scriptsOrder", js.Array(value :_*))
    
    inline def setTouch(value: TouchDevice): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
