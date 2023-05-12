package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonExcludeownerprojects extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjsonExcludeattachments
  
  var responses: `201ContentApplicationjsonExcludeownerprojects`
}
object Responses201ContentApplicationjsonExcludeownerprojects {
  
  inline def apply(
    parameters: `496`,
    requestBody: ContentApplicationjsonExcludeattachments,
    responses: `201ContentApplicationjsonExcludeownerprojects`
  ): Responses201ContentApplicationjsonExcludeownerprojects = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonExcludeownerprojects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonExcludeownerprojects] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExcludeattachments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonExcludeownerprojects`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
