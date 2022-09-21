package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFeatured extends StObject {
  
  var parameters: QueryFeatured
  
  var responses: `200Content52`
}
object ParametersQueryFeatured {
  
  inline def apply(parameters: QueryFeatured, responses: `200Content52`): ParametersQueryFeatured = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFeatured]
  }
  
  extension [Self <: ParametersQueryFeatured](x: Self) {
    
    inline def setParameters(value: QueryFeatured): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content52`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
