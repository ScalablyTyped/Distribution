package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content213 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200Content213`
}
object Responses200Content213 {
  
  inline def apply(
    parameters: PathCommentidOwner,
    requestBody: ContentApplicationjsonBody,
    responses: `200Content213`
  ): Responses200Content213 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content213]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content213] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content213`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
