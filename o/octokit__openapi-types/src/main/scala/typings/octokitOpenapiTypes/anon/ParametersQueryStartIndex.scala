package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryStartIndex extends StObject {
  
  var parameters: QueryStartIndex
  
  var responses: `200Content352`
}
object ParametersQueryStartIndex {
  
  inline def apply(parameters: QueryStartIndex, responses: `200Content352`): ParametersQueryStartIndex = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryStartIndex]
  }
  
  extension [Self <: ParametersQueryStartIndex](x: Self) {
    
    inline def setParameters(value: QueryStartIndex): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content352`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
