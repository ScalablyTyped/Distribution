package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonTotalcountWorkflows extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200ContentApplicationjsonTotalcountWorkflows`
}
object Responses200ContentApplicationjsonTotalcountWorkflows {
  
  inline def apply(parameters: PathOwnerString, responses: `200ContentApplicationjsonTotalcountWorkflows`): Responses200ContentApplicationjsonTotalcountWorkflows = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonTotalcountWorkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonTotalcountWorkflows] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTotalcountWorkflows`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
