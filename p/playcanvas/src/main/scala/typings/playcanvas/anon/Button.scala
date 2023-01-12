package typings.playcanvas.anon

import typings.playcanvas.playcanvasStrings.gamepad
import typings.playcanvas.playcanvasStrings.keyboard
import typings.playcanvas.playcanvasStrings.mouse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  var button: js.UndefOr[Double] = js.undefined
  
  var keys: js.UndefOr[js.Array[Double]] = js.undefined
  
  var pad: js.UndefOr[Double] = js.undefined
  
  var `type`: keyboard | mouse | gamepad
}
object Button {
  
  inline def apply(`type`: keyboard | mouse | gamepad): Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setKeys(value: js.Array[Double]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Double*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setType(value: keyboard | mouse | gamepad): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
