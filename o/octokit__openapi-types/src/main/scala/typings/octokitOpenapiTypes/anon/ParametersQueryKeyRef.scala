package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryKeyRef extends StObject {
  
  var parameters: QueryKeyRef
  
  var responses: `200141`
}
object ParametersQueryKeyRef {
  
  inline def apply(parameters: QueryKeyRef, responses: `200141`): ParametersQueryKeyRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryKeyRef]
  }
  
  extension [Self <: ParametersQueryKeyRef](x: Self) {
    
    inline def setParameters(value: QueryKeyRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200141`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
