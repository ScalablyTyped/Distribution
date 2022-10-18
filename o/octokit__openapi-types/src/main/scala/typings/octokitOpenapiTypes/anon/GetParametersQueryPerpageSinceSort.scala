package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageSinceSort extends StObject {
  
  /** By default, Issue Comments are ordered by ascending ID. */
  var get: ParametersQueryPerpageSinceSort
}
object GetParametersQueryPerpageSinceSort {
  
  inline def apply(get: ParametersQueryPerpageSinceSort): GetParametersQueryPerpageSinceSort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageSinceSort]
  }
  
  extension [Self <: GetParametersQueryPerpageSinceSort](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageSinceSort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
