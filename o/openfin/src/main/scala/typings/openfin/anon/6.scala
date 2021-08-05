package typings.openfin.anon

import typings.openfin.windowOptionMod.CustomRequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var newVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
  
  var oldVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setNewVal(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    inline def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    inline def setNewValVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "newVal", js.Array(value :_*))
    
    inline def setOldVal(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    inline def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
    
    inline def setOldValVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "oldVal", js.Array(value :_*))
  }
}
