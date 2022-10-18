package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent99 extends StObject {
  
  var parameters: PathCheckrunid
  
  var requestBody: Content99
  
  var responses: `200ContentApplicationjsonConclusion`
}
object RequestBodyContent99 {
  
  inline def apply(
    parameters: PathCheckrunid,
    requestBody: Content99,
    responses: `200ContentApplicationjsonConclusion`
  ): RequestBodyContent99 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent99]
  }
  
  extension [Self <: RequestBodyContent99](x: Self) {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content99): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonConclusion`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
