package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonMeta extends StObject {
  
  var parameters: PathEnterpriseString
  
  var requestBody: ContentApplicationjsonDisplayName
  
  var responses: `201ContentApplicationjsonMeta`
}
object Responses201ContentApplicationjsonMeta {
  
  inline def apply(
    parameters: PathEnterpriseString,
    requestBody: ContentApplicationjsonDisplayName,
    responses: `201ContentApplicationjsonMeta`
  ): Responses201ContentApplicationjsonMeta = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonMeta]
  }
  
  extension [Self <: Responses201ContentApplicationjsonMeta](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDisplayName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonMeta`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
