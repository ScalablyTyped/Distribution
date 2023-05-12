package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content177422 extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: js.UndefOr[ContentApplicationjsonBypasspullrequestallowances] = js.undefined
  
  var responses: `200Content177422`
}
object Responses200Content177422 {
  
  inline def apply(parameters: PathBranch, responses: `200Content177422`): Responses200Content177422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content177422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content177422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypasspullrequestallowances): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content177422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
