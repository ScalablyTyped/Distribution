package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAuthorPage extends StObject {
  
  var parameters: QueryAuthorPage
  
  var responses: `409500`
}
object ParametersQueryAuthorPage {
  
  inline def apply(parameters: QueryAuthorPage, responses: `409500`): ParametersQueryAuthorPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAuthorPage]
  }
  
  extension [Self <: ParametersQueryAuthorPage](x: Self) {
    
    inline def setParameters(value: QueryAuthorPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
