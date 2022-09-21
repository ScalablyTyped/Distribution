package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonNameNodeid extends StObject {
  
  var parameters: PathEnvironmentnameOwner
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `200ContentApplicationjsonNameNodeid`
}
object Responses200ContentApplicationjsonNameNodeid {
  
  inline def apply(
    parameters: PathEnvironmentnameOwner,
    requestBody: ContentApplicationjsonNameString,
    responses: `200ContentApplicationjsonNameNodeid`
  ): Responses200ContentApplicationjsonNameNodeid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonNameNodeid]
  }
  
  extension [Self <: Responses200ContentApplicationjsonNameNodeid](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNameNodeid`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
