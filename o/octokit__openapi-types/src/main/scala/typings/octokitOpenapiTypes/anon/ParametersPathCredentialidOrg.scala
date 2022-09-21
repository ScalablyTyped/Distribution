package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCredentialidOrg extends StObject {
  
  var parameters: PathCredentialidOrg
  
  var responses: `404Content55`
}
object ParametersPathCredentialidOrg {
  
  inline def apply(parameters: PathCredentialidOrg, responses: `404Content55`): ParametersPathCredentialidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCredentialidOrg]
  }
  
  extension [Self <: ParametersPathCredentialidOrg](x: Self) {
    
    inline def setParameters(value: PathCredentialidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
