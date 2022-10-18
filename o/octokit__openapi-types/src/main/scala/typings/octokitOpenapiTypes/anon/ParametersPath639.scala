package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath639 extends StObject {
  
  var parameters: Path639
  
  var responses: `616`
}
object ParametersPath639 {
  
  inline def apply(parameters: Path639, responses: `616`): ParametersPath639 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath639]
  }
  
  extension [Self <: ParametersPath639](x: Self) {
    
    inline def setParameters(value: Path639): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `616`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
