package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRequiredworkflowsArray extends StObject {
  
  var parameters: PathOrgStringQuery473
  
  var responses: `200ContentApplicationjsonRequiredworkflowsArray`
}
object Responses200ContentApplicationjsonRequiredworkflowsArray {
  
  inline def apply(parameters: PathOrgStringQuery473, responses: `200ContentApplicationjsonRequiredworkflowsArray`): Responses200ContentApplicationjsonRequiredworkflowsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRequiredworkflowsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRequiredworkflowsArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRequiredworkflowsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
