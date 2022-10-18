package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content4404 extends StObject {
  
  var parameters: Path619
  
  var requestBody: ContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids
  
  var responses: `201Content4404`
}
object Responses201Content4404 {
  
  inline def apply(
    parameters: Path619,
    requestBody: ContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids,
    responses: `201Content4404`
  ): Responses201Content4404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content4404]
  }
  
  extension [Self <: Responses201Content4404](x: Self) {
    
    inline def setParameters(value: Path619): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncryptedvalueKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
