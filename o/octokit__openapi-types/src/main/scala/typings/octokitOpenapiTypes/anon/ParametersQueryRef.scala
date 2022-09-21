package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryRef extends StObject {
  
  var parameters: QueryRef
  
  var responses: `200Content149`
}
object ParametersQueryRef {
  
  inline def apply(parameters: QueryRef, responses: `200Content149`): ParametersQueryRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryRef]
  }
  
  extension [Self <: ParametersQueryRef](x: Self) {
    
    inline def setParameters(value: QueryRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content149`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
