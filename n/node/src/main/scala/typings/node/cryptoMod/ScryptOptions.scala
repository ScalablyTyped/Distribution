package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScryptOptions extends StObject {
  
  var N: js.UndefOr[Double] = js.undefined
  
  var maxmem: js.UndefOr[Double] = js.undefined
  
  var p: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
}
object ScryptOptions {
  
  inline def apply(): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScryptOptions]
  }
  
  extension [Self <: ScryptOptions](x: Self) {
    
    inline def setMaxmem(value: Double): Self = StObject.set(x, "maxmem", value.asInstanceOf[js.Any])
    
    inline def setMaxmemUndefined: Self = StObject.set(x, "maxmem", js.undefined)
    
    inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
