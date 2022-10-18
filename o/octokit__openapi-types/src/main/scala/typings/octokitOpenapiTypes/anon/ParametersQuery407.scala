package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery407 extends StObject {
  
  var parameters: Query407
  
  var responses: `200408`
}
object ParametersQuery407 {
  
  inline def apply(parameters: Query407, responses: `200408`): ParametersQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery407]
  }
  
  extension [Self <: ParametersQuery407](x: Self) {
    
    inline def setParameters(value: Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200408`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
