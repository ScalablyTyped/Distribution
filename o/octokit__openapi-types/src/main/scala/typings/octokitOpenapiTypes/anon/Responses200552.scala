package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200552 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: Content274
  
  var responses: `200552`
}
object Responses200552 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, requestBody: Content274, responses: `200552`): Responses200552 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200552]
  }
  
  extension [Self <: Responses200552](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content274): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200552`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
