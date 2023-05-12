package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonTotalcountNumberVariablesArray extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200ContentApplicationjsonTotalcountNumberVariablesArray`
}
object Responses200ContentApplicationjsonTotalcountNumberVariablesArray {
  
  inline def apply(parameters: PathOwnerString, responses: `200ContentApplicationjsonTotalcountNumberVariablesArray`): Responses200ContentApplicationjsonTotalcountNumberVariablesArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonTotalcountNumberVariablesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonTotalcountNumberVariablesArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountNumberVariablesArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
