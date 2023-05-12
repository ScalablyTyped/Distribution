package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonRecord404Content36 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonKeyid
  
  var responses: `201ContentApplicationjsonRecord404Content36`
}
object Responses201ContentApplicationjsonRecord404Content36 {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonKeyid,
    responses: `201ContentApplicationjsonRecord404Content36`
  ): Responses201ContentApplicationjsonRecord404Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonRecord404Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonRecord404Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRecord404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
