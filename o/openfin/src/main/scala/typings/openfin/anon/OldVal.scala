package typings.openfin.anon

import typings.openfin.shapesMod.Hotkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldVal extends StObject {
  
  var newVal: js.UndefOr[js.Array[Hotkey]] = js.undefined
  
  var oldVal: js.UndefOr[js.Array[Hotkey]] = js.undefined
}
object OldVal {
  
  inline def apply(): OldVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldVal]
  }
  
  extension [Self <: OldVal](x: Self) {
    
    inline def setNewVal(value: js.Array[Hotkey]): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    inline def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    inline def setNewValVarargs(value: Hotkey*): Self = StObject.set(x, "newVal", js.Array(value*))
    
    inline def setOldVal(value: js.Array[Hotkey]): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    inline def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
    
    inline def setOldValVarargs(value: Hotkey*): Self = StObject.set(x, "oldVal", js.Array(value*))
  }
}
