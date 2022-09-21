package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScryptOptions extends StObject {
  
  var N: js.UndefOr[Double] = js.undefined
  
  var blockSize: js.UndefOr[Double] = js.undefined
  
  var cost: js.UndefOr[Double] = js.undefined
  
  var maxmem: js.UndefOr[Double] = js.undefined
  
  var p: js.UndefOr[Double] = js.undefined
  
  var parallelization: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
}
object ScryptOptions {
  
  inline def apply(): ScryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScryptOptions]
  }
  
  extension [Self <: ScryptOptions](x: Self) {
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setMaxmem(value: Double): Self = StObject.set(x, "maxmem", value.asInstanceOf[js.Any])
    
    inline def setMaxmemUndefined: Self = StObject.set(x, "maxmem", js.undefined)
    
    inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
    
    inline def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
