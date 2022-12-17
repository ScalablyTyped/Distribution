package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath376 extends StObject {
  
  var parameters: Path376
  
  var responses: `304403404409`
}
object ParametersPath376 {
  
  inline def apply(parameters: Path376, responses: `304403404409`): ParametersPath376 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath376]
  }
  
  extension [Self <: ParametersPath376](x: Self) {
    
    inline def setParameters(value: Path376): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
