package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCredentialid extends StObject {
  
  var parameters: PathCredentialid
  
  var responses: `6`
}
object ParametersPathCredentialid {
  
  inline def apply(parameters: PathCredentialid, responses: `6`): ParametersPathCredentialid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCredentialid]
  }
  
  extension [Self <: ParametersPathCredentialid](x: Self) {
    
    inline def setParameters(value: PathCredentialid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
