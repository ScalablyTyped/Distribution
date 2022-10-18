package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentsTotalcount extends StObject {
  
  var environments: js.UndefOr[js.Array[Protectionrules]] = js.undefined
  
  /**
    * @description The number of environments in this repository
    * @example 5
    */
  var total_count: js.UndefOr[Double] = js.undefined
}
object EnvironmentsTotalcount {
  
  inline def apply(): EnvironmentsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentsTotalcount]
  }
  
  extension [Self <: EnvironmentsTotalcount](x: Self) {
    
    inline def setEnvironments(value: js.Array[Protectionrules]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: Protectionrules*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
