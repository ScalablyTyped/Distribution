package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryHead extends StObject {
  
  var parameters: QueryHead
  
  var responses: `304422`
}
object ParametersQueryHead {
  
  inline def apply(parameters: QueryHead, responses: `304422`): ParametersQueryHead = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryHead]
  }
  
  extension [Self <: ParametersQueryHead](x: Self) {
    
    inline def setParameters(value: QueryHead): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
