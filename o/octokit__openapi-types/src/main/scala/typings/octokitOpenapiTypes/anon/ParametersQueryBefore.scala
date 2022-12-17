package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryBefore extends StObject {
  
  var parameters: QueryBefore
  
  var responses: `404503`
}
object ParametersQueryBefore {
  
  inline def apply(parameters: QueryBefore, responses: `404503`): ParametersQueryBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryBefore]
  }
  
  extension [Self <: ParametersQueryBefore](x: Self) {
    
    inline def setParameters(value: QueryBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
