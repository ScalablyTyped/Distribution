package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonStrict404Content41 extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: js.UndefOr[ContentApplicationjsonContexts] = js.undefined
  
  var responses: `200ContentApplicationjsonStrict404Content41`
}
object Responses200ContentApplicationjsonStrict404Content41 {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonStrict404Content41`): Responses200ContentApplicationjsonStrict404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonStrict404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonStrict404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContexts): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonStrict404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
