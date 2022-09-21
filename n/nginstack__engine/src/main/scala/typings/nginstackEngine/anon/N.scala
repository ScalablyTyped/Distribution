package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait N extends StObject {
  
  var N: js.UndefOr[Double] = js.undefined
  
  var p: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
}
object N {
  
  inline def apply(): N = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[N]
  }
  
  extension [Self <: N](x: Self) {
    
    inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
