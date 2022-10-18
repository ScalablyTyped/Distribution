package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292QueryClientipRef extends StObject {
  
  var parameters: Path292QueryClientipRef
  
  var responses: `200ContentApplicationjsonBillableownerDefaults`
}
object ParametersPath292QueryClientipRef {
  
  inline def apply(parameters: Path292QueryClientipRef, responses: `200ContentApplicationjsonBillableownerDefaults`): ParametersPath292QueryClientipRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292QueryClientipRef]
  }
  
  extension [Self <: ParametersPath292QueryClientipRef](x: Self) {
    
    inline def setParameters(value: Path292QueryClientipRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBillableownerDefaults`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
