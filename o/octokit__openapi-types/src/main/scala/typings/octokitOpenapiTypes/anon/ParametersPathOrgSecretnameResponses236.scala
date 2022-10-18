package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameResponses236 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var responses: `236`
}
object ParametersPathOrgSecretnameResponses236 {
  
  inline def apply(parameters: PathOrgSecretname, responses: `236`): ParametersPathOrgSecretnameResponses236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameResponses236]
  }
  
  extension [Self <: ParametersPathOrgSecretnameResponses236](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
