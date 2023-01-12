package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content41403 extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonContextsArray
  
  var responses: `200Content41403`
}
object Responses200Content41403 {
  
  inline def apply(
    parameters: PathBranch,
    requestBody: ContentApplicationjsonContextsArray,
    responses: `200Content41403`
  ): Responses200Content41403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content41403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content41403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContextsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content41403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
