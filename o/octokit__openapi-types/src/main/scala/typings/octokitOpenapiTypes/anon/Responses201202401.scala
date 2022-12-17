package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201202401 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: Content299
  
  var responses: `201202401`
}
object Responses201202401 {
  
  inline def apply(parameters: PathPullnumberRepo, requestBody: Content299, responses: `201202401`): Responses201202401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201202401]
  }
  
  extension [Self <: Responses201202401](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content299): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
