package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses323 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalueKeyid
  
  var responses: `323`
}
object Responses323 {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonEncryptedvalueKeyid,
    responses: `323`
  ): Responses323 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses323]
  }
  
  extension [Self <: Responses323](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `323`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
