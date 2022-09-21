package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonColumnurl304Unknown extends StObject {
  
  var parameters: PathCardidNumber
  
  var requestBody: ContentApplicationjsonArchived
  
  var responses: `200ContentApplicationjsonColumnurl304Unknown`
}
object Responses200ContentApplicationjsonColumnurl304Unknown {
  
  inline def apply(
    parameters: PathCardidNumber,
    requestBody: ContentApplicationjsonArchived,
    responses: `200ContentApplicationjsonColumnurl304Unknown`
  ): Responses200ContentApplicationjsonColumnurl304Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonColumnurl304Unknown]
  }
  
  extension [Self <: Responses200ContentApplicationjsonColumnurl304Unknown](x: Self) {
    
    inline def setParameters(value: PathCardidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonArchived): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonColumnurl304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
