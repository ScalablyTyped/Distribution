package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterprise extends StObject {
  
  var parameters: PathEnterprise
  
  var responses: `503`
}
object ParametersPathEnterprise {
  
  inline def apply(parameters: PathEnterprise, responses: `503`): ParametersPathEnterprise = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnterprise] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
