package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200484404Content36 extends StObject {
  
  var parameters: PathCommentidGistid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200484404Content36`
}
object Responses200484404Content36 {
  
  inline def apply(
    parameters: PathCommentidGistid,
    requestBody: ContentApplicationjsonBody,
    responses: `200484404Content36`
  ): Responses200484404Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200484404Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200484404Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200484404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
