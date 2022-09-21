package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageStatus extends StObject {
  
  var parameters: QueryPerpageStatus
  
  var responses: `200ContentApplicationjsonCheckrunsTotalcount`
}
object ParametersQueryPerpageStatus {
  
  inline def apply(parameters: QueryPerpageStatus, responses: `200ContentApplicationjsonCheckrunsTotalcount`): ParametersQueryPerpageStatus = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageStatus]
  }
  
  extension [Self <: ParametersQueryPerpageStatus](x: Self) {
    
    inline def setParameters(value: QueryPerpageStatus): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckrunsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
