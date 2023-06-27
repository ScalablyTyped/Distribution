package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAuthorCommitter extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonParents
  
  var responses: `201ContentApplicationjsonAuthorCommitter`
}
object Responses201ContentApplicationjsonAuthorCommitter {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonParents,
    responses: `201ContentApplicationjsonAuthorCommitter`
  ): Responses201ContentApplicationjsonAuthorCommitter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAuthorCommitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonAuthorCommitter] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonParents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAuthorCommitter`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
