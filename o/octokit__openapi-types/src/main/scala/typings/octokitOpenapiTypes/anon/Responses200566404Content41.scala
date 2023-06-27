package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200566404Content41 extends StObject {
  
  var parameters: PathCommentidGistid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200566404Content41`
}
object Responses200566404Content41 {
  
  inline def apply(
    parameters: PathCommentidGistid,
    requestBody: ContentApplicationjsonBody,
    responses: `200566404Content41`
  ): Responses200566404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200566404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200566404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200566404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
