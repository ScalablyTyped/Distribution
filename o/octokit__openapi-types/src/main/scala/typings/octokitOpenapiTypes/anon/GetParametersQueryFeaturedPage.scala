package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryFeaturedPage extends StObject {
  
  var get: ParametersQueryFeaturedPage
}
object GetParametersQueryFeaturedPage {
  
  inline def apply(get: ParametersQueryFeaturedPage): GetParametersQueryFeaturedPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryFeaturedPage]
  }
  
  extension [Self <: GetParametersQueryFeaturedPage](x: Self) {
    
    inline def setGet(value: ParametersQueryFeaturedPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
