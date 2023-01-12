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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `411`] (val x: Self) extends AnyVal {
    
    inline def setRunners(value: js.Array[Os]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
    
    inline def setRunnersVarargs(value: Os*): Self = StObject.set(x, "runners", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
