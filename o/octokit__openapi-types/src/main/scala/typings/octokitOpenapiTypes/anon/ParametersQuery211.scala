package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery211 extends StObject {
  
  var parameters: Query211
  
  var responses: `304401403422`
}
object ParametersQuery211 {
  
  inline def apply(parameters: Query211, responses: `304401403422`): ParametersQuery211 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery211]
  }
  
  extension [Self <: ParametersQuery211](x: Self) {
    
    inline def setParameters(value: Query211): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
