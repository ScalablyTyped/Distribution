package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var newVal: js.UndefOr[String] = js.undefined
  
  var oldVal: js.UndefOr[String] = js.undefined
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setNewVal(value: String): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    inline def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    inline def setOldVal(value: String): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    inline def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
