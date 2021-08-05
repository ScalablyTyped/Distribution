package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValOldVal extends StObject {
  
  var newVal: js.UndefOr[Boolean] = js.undefined
  
  var oldVal: js.UndefOr[Boolean] = js.undefined
}
object NewValOldVal {
  
  inline def apply(): NewValOldVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewValOldVal]
  }
  
  extension [Self <: NewValOldVal](x: Self) {
    
    inline def setNewVal(value: Boolean): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    inline def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    inline def setOldVal(value: Boolean): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    inline def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
