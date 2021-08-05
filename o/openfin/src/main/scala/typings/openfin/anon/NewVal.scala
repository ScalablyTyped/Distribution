package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewVal extends StObject {
  
  var newVal: js.UndefOr[Double] = js.undefined
  
  var oldVal: js.UndefOr[Double] = js.undefined
}
object NewVal {
  
  inline def apply(): NewVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewVal]
  }
  
  extension [Self <: NewVal](x: Self) {
    
    inline def setNewVal(value: Double): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    inline def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    inline def setOldVal(value: Double): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    inline def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
