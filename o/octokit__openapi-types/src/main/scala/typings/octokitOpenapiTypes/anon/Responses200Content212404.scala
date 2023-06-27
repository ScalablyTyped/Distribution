package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content212404 extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: js.UndefOr[ContentApplicationjsonContexts] = js.undefined
  
  var responses: `200Content212404`
}
object Responses200Content212404 {
  
  inline def apply(parameters: PathBranch, responses: `200Content212404`): Responses200Content212404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content212404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content212404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContexts): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content212404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
