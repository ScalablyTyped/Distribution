package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAfterBefore extends StObject {
  
  var parameters: QueryAfterBefore
  
  var responses: `200Content431`
}
object ParametersQueryAfterBefore {
  
  inline def apply(parameters: QueryAfterBefore, responses: `200Content431`): ParametersQueryAfterBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAfterBefore]
  }
  
  extension [Self <: ParametersQueryAfterBefore](x: Self) {
    
    inline def setParameters(value: QueryAfterBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content431`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
