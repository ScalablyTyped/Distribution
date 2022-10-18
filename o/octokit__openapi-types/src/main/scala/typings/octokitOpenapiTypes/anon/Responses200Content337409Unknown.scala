package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content337409Unknown extends StObject {
  
  var parameters: `395`
  
  var requestBody: Content338
  
  var responses: `200Content337409Unknown`
}
object Responses200Content337409Unknown {
  
  inline def apply(parameters: `395`, requestBody: Content338, responses: `200Content337409Unknown`): Responses200Content337409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content337409Unknown]
  }
  
  extension [Self <: Responses200Content337409Unknown](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content338): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content337409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
