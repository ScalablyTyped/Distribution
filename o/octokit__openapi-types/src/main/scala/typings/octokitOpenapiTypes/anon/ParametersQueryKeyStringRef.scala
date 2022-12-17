package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryKeyStringRef extends StObject {
  
  var parameters: QueryKeyStringRef
  
  var responses: `200473`
}
object ParametersQueryKeyStringRef {
  
  inline def apply(parameters: QueryKeyStringRef, responses: `200473`): ParametersQueryKeyStringRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryKeyStringRef]
  }
  
  extension [Self <: ParametersQueryKeyStringRef](x: Self) {
    
    inline def setParameters(value: QueryKeyStringRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200473`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
