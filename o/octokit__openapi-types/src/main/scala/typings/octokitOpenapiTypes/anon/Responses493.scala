package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses493 extends StObject {
  
  var parameters: PathJobidOwner
  
  var requestBody: Content152
  
  var responses: `493`
}
object Responses493 {
  
  inline def apply(parameters: PathJobidOwner, requestBody: Content152, responses: `493`): Responses493 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses493]
  }
  
  extension [Self <: Responses493](x: Self) {
    
    inline def setParameters(value: PathJobidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content152): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `493`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
