package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses400403404 extends StObject {
  
  var parameters: PathScimuseridString
  
  var requestBody: ContentApplicationjsonOperationsSchemas
  
  var responses: `400403404`
}
object Responses400403404 {
  
  inline def apply(
    parameters: PathScimuseridString,
    requestBody: ContentApplicationjsonOperationsSchemas,
    responses: `400403404`
  ): Responses400403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses400403404]
  }
  
  extension [Self <: Responses400403404](x: Self) {
    
    inline def setParameters(value: PathScimuseridString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOperationsSchemas): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
