package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryLogin extends StObject {
  
  var parameters: QueryLogin
  
  var responses: `200Content75`
}
object ParametersQueryLogin {
  
  inline def apply(parameters: QueryLogin, responses: `200Content75`): ParametersQueryLogin = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryLogin]
  }
  
  extension [Self <: ParametersQueryLogin](x: Self) {
    
    inline def setParameters(value: QueryLogin): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content75`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
