package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryKeyPage extends StObject {
  
  var parameters: QueryKeyPage
  
  var responses: `200Content406`
}
object ParametersQueryKeyPage {
  
  inline def apply(parameters: QueryKeyPage, responses: `200Content406`): ParametersQueryKeyPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryKeyPage]
  }
  
  extension [Self <: ParametersQueryKeyPage](x: Self) {
    
    inline def setParameters(value: QueryKeyPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content406`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
