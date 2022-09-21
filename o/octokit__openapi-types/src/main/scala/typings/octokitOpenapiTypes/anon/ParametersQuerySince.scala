package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySince extends StObject {
  
  var parameters: QuerySince
  
  var responses: `200304403`
}
object ParametersQuerySince {
  
  inline def apply(parameters: QuerySince, responses: `200304403`): ParametersQuerySince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySince]
  }
  
  extension [Self <: ParametersQuerySince](x: Self) {
    
    inline def setParameters(value: QuerySince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
