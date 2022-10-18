package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonLabelsTotalcount extends StObject {
  
  var parameters: PathEnterpriseRunnerid
  
  var responses: `200ContentApplicationjsonLabelsTotalcount`
}
object Responses200ContentApplicationjsonLabelsTotalcount {
  
  inline def apply(parameters: PathEnterpriseRunnerid, responses: `200ContentApplicationjsonLabelsTotalcount`): Responses200ContentApplicationjsonLabelsTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonLabelsTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonLabelsTotalcount](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLabelsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
