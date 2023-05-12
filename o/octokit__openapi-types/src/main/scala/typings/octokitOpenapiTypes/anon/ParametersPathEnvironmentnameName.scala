package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameName extends StObject {
  
  var parameters: PathEnvironmentnameName
  
  var responses: `200Content164`
}
object ParametersPathEnvironmentnameName {
  
  inline def apply(parameters: PathEnvironmentnameName, responses: `200Content164`): ParametersPathEnvironmentnameName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content164`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
