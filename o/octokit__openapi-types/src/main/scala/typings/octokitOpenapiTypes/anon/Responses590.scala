package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses590 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonEncryptedvalue
  
  var responses: `590`
}
object Responses590 {
  
  inline def apply(parameters: PathOrgSecretname, requestBody: ContentApplicationjsonEncryptedvalue, responses: `590`): Responses590 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses590]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses590] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
