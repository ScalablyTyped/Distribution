package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBillableWINDOWS extends StObject {
  
  var parameters: PathRepoWorkflowid
  
  var responses: `200ContentApplicationjsonBillableWINDOWS`
}
object Responses200ContentApplicationjsonBillableWINDOWS {
  
  inline def apply(parameters: PathRepoWorkflowid, responses: `200ContentApplicationjsonBillableWINDOWS`): Responses200ContentApplicationjsonBillableWINDOWS = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBillableWINDOWS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBillableWINDOWS] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoWorkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBillableWINDOWS`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
