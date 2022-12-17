package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameResponses404Content48 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var responses: `404Content48`
}
object ParametersPathOrgSecretnameResponses404Content48 {
  
  inline def apply(parameters: PathOrgSecretname, responses: `404Content48`): ParametersPathOrgSecretnameResponses404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameResponses404Content48]
  }
  
  extension [Self <: ParametersPathOrgSecretnameResponses404Content48](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
