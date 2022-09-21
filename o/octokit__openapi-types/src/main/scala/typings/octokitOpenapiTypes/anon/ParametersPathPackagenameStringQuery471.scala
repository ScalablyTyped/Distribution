package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameStringQuery471 extends StObject {
  
  var parameters: PathPackagenameStringQuery471
  
  var responses: `200Content472`
}
object ParametersPathPackagenameStringQuery471 {
  
  inline def apply(parameters: PathPackagenameStringQuery471, responses: `200Content472`): ParametersPathPackagenameStringQuery471 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameStringQuery471]
  }
  
  extension [Self <: ParametersPathPackagenameStringQuery471](x: Self) {
    
    inline def setParameters(value: PathPackagenameStringQuery471): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content472`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
