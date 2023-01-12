package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPackagenameQueryToken extends StObject {
  
  var parameters: PathOrgPackagenameQueryToken
  
  var responses: `401Content48403Content48`
}
object ParametersPathOrgPackagenameQueryToken {
  
  inline def apply(parameters: PathOrgPackagenameQueryToken, responses: `401Content48403Content48`): ParametersPathOrgPackagenameQueryToken = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPackagenameQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgPackagenameQueryToken] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgPackagenameQueryToken): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content48403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
