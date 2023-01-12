package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowdeletions extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonAllowdeletions
  
  var responses: `200403404422`
}
object RequestBodyContentApplicationjsonAllowdeletions {
  
  inline def apply(
    parameters: PathBranch,
    requestBody: ContentApplicationjsonAllowdeletions,
    responses: `200403404422`
  ): RequestBodyContentApplicationjsonAllowdeletions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowdeletions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAllowdeletions] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowdeletions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
