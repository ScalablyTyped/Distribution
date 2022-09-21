package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath388 extends StObject {
  
  var parameters: Path388
  
  var responses: `304403404409`
}
object ParametersPath388 {
  
  inline def apply(parameters: Path388, responses: `304403404409`): ParametersPath388 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath388]
  }
  
  extension [Self <: ParametersPath388](x: Self) {
    
    inline def setParameters(value: Path388): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
