package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBodytext422Content414 extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200ContentApplicationjsonBodytext422Content414`
}
object Responses200ContentApplicationjsonBodytext422Content414 {
  
  inline def apply(
    parameters: PathCommentidOwnerRepo,
    requestBody: ContentApplicationjsonBody,
    responses: `200ContentApplicationjsonBodytext422Content414`
  ): Responses200ContentApplicationjsonBodytext422Content414 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBodytext422Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBodytext422Content414] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodytext422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
