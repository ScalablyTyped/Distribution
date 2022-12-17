package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `411` extends StObject {
  
  var runners: js.UndefOr[js.Array[Os]] = js.undefined
  
  var total_count: js.UndefOr[Double] = js.undefined
}
object `411` {
  
  inline def apply(): `411` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`411`]
  }
  
  extension [Self <: `411`](x: Self) {
    
    inline def setRunners(value: js.Array[Os]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
    
    inline def setRunnersVarargs(value: Os*): Self = StObject.set(x, "runners", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
