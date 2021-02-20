package typings.playcanvas.anon

import typings.playcanvas.pc.ElementInput
import typings.playcanvas.pc.GamePads
import typings.playcanvas.pc.Keyboard
import typings.playcanvas.pc.Mouse
import typings.playcanvas.pc.TouchDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPrefix extends StObject {
  
  var assetPrefix: js.UndefOr[String] = js.native
  
  var elementInput: js.UndefOr[ElementInput] = js.native
  
  var gamepads: js.UndefOr[GamePads] = js.native
  
  var graphicsDeviceOptions: js.UndefOr[js.Any] = js.native
  
  var keyboard: js.UndefOr[Keyboard] = js.native
  
  var mouse: js.UndefOr[Mouse] = js.native
  
  var scriptPrefix: js.UndefOr[String] = js.native
  
  var scriptsOrder: js.UndefOr[js.Array[String]] = js.native
  
  var touch: js.UndefOr[TouchDevice] = js.native
}
object AssetPrefix {
  
  @scala.inline
  def apply(): AssetPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPrefix]
  }
  
  @scala.inline
  implicit class AssetPrefixMutableBuilder[Self <: AssetPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    @scala.inline
    def setElementInput(value: ElementInput): Self = StObject.set(x, "elementInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementInputUndefined: Self = StObject.set(x, "elementInput", js.undefined)
    
    @scala.inline
    def setGamepads(value: GamePads): Self = StObject.set(x, "gamepads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepadsUndefined: Self = StObject.set(x, "gamepads", js.undefined)
    
    @scala.inline
    def setGraphicsDeviceOptions(value: js.Any): Self = StObject.set(x, "graphicsDeviceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsDeviceOptionsUndefined: Self = StObject.set(x, "graphicsDeviceOptions", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Keyboard): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMouse(value: Mouse): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    @scala.inline
    def setScriptPrefix(value: String): Self = StObject.set(x, "scriptPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPrefixUndefined: Self = StObject.set(x, "scriptPrefix", js.undefined)
    
    @scala.inline
    def setScriptsOrder(value: js.Array[String]): Self = StObject.set(x, "scriptsOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsOrderUndefined: Self = StObject.set(x, "scriptsOrder", js.undefined)
    
    @scala.inline
    def setScriptsOrderVarargs(value: String*): Self = StObject.set(x, "scriptsOrder", js.Array(value :_*))
    
    @scala.inline
    def setTouch(value: TouchDevice): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
