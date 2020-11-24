package typings.playcanvas.anon

import typings.playcanvas.pc.ElementInput
import typings.playcanvas.pc.GamePads
import typings.playcanvas.pc.Keyboard
import typings.playcanvas.pc.Mouse
import typings.playcanvas.pc.TouchDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetPrefix extends js.Object {
  
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
  implicit class AssetPrefixOps[Self <: AssetPrefix] (val x: Self) extends AnyVal {
    
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
    def setAssetPrefix(value: String): Self = this.set("assetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetPrefix: Self = this.set("assetPrefix", js.undefined)
    
    @scala.inline
    def setElementInput(value: ElementInput): Self = this.set("elementInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementInput: Self = this.set("elementInput", js.undefined)
    
    @scala.inline
    def setGamepads(value: GamePads): Self = this.set("gamepads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamepads: Self = this.set("gamepads", js.undefined)
    
    @scala.inline
    def setGraphicsDeviceOptions(value: js.Any): Self = this.set("graphicsDeviceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphicsDeviceOptions: Self = this.set("graphicsDeviceOptions", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Keyboard): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setMouse(value: Mouse): Self = this.set("mouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
    
    @scala.inline
    def setScriptPrefix(value: String): Self = this.set("scriptPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPrefix: Self = this.set("scriptPrefix", js.undefined)
    
    @scala.inline
    def setScriptsOrderVarargs(value: String*): Self = this.set("scriptsOrder", js.Array(value :_*))
    
    @scala.inline
    def setScriptsOrder(value: js.Array[String]): Self = this.set("scriptsOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptsOrder: Self = this.set("scriptsOrder", js.undefined)
    
    @scala.inline
    def setTouch(value: TouchDevice): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
  }
}
