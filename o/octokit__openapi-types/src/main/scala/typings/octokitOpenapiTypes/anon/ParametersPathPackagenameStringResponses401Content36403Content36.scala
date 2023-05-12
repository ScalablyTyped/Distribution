package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenameStringResponses401Content36403Content36 extends StObject {
  
  var parameters: PathPackagenameString
  
  var responses: `401Content36403Content36`
}
object ParametersPathPackagenameStringResponses401Content36403Content36 {
  
  inline def apply(parameters: PathPackagenameString, responses: `401Content36403Content36`): ParametersPathPackagenameStringResponses401Content36403Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenameStringResponses401Content36403Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenameStringResponses401Content36403Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content36403Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
