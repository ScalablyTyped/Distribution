package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBillableWINDOWS extends StObject {
  
  var parameters: PathWorkflowid
  
  var responses: `200ContentApplicationjsonBillableWINDOWS`
}
object Responses200ContentApplicationjsonBillableWINDOWS {
  
  inline def apply(parameters: PathWorkflowid, responses: `200ContentApplicationjsonBillableWINDOWS`): Responses200ContentApplicationjsonBillableWINDOWS = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBillableWINDOWS]
  }
  
  extension [Self <: Responses200ContentApplicationjsonBillableWINDOWS](x: Self) {
    
    inline def setParameters(value: PathWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBillableWINDOWS`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
