package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPer extends StObject {
  
  var parameters: QueryPer
  
  var responses: `200Content337`
}
object ParametersQueryPer {
  
  inline def apply(parameters: QueryPer, responses: `200Content337`): ParametersQueryPer = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPer]
  }
  
  extension [Self <: ParametersQueryPer](x: Self) {
    
    inline def setParameters(value: QueryPer): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content337`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
