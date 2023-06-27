package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonVariablesArray extends StObject {
  
  var parameters: PathOrgStringQuery
  
  var responses: `200ContentApplicationjsonVariablesArray`
}
object Responses200ContentApplicationjsonVariablesArray {
  
  inline def apply(parameters: PathOrgStringQuery, responses: `200ContentApplicationjsonVariablesArray`): Responses200ContentApplicationjsonVariablesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonVariablesArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
