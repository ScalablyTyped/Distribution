package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content517422 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonUselfs
  
  var responses: `200Content517422`
}
object Responses200Content517422 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonUselfs, responses: `200Content517422`): Responses200Content517422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content517422]
  }
  
  extension [Self <: Responses200Content517422](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUselfs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content517422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
