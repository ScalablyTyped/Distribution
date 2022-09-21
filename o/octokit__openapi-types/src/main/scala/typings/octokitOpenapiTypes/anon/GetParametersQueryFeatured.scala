package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryFeatured extends StObject {
  
  var get: ParametersQueryFeatured
}
object GetParametersQueryFeatured {
  
  inline def apply(get: ParametersQueryFeatured): GetParametersQueryFeatured = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryFeatured]
  }
  
  extension [Self <: GetParametersQueryFeatured](x: Self) {
    
    inline def setGet(value: ParametersQueryFeatured): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
