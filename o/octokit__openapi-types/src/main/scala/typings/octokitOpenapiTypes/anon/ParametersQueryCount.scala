package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCount extends StObject {
  
  var parameters: QueryCount
  
  var responses: `200Content349`
}
object ParametersQueryCount {
  
  inline def apply(parameters: QueryCount, responses: `200Content349`): ParametersQueryCount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCount]
  }
  
  extension [Self <: ParametersQueryCount](x: Self) {
    
    inline def setParameters(value: QueryCount): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
