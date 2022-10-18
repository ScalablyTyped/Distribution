package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFeaturedPage extends StObject {
  
  var parameters: QueryFeaturedPage
  
  var responses: `200Content284`
}
object ParametersQueryFeaturedPage {
  
  inline def apply(parameters: QueryFeaturedPage, responses: `200Content284`): ParametersQueryFeaturedPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFeaturedPage]
  }
  
  extension [Self <: ParametersQueryFeaturedPage](x: Self) {
    
    inline def setParameters(value: QueryFeaturedPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content284`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
