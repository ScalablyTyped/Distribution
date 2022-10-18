package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath642Query355 extends StObject {
  
  var parameters: Path642Query355
  
  var responses: `200Content356`
}
object ParametersPath642Query355 {
  
  inline def apply(parameters: Path642Query355, responses: `200Content356`): ParametersPath642Query355 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath642Query355]
  }
  
  extension [Self <: ParametersPath642Query355](x: Self) {
    
    inline def setParameters(value: Path642Query355): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content356`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
