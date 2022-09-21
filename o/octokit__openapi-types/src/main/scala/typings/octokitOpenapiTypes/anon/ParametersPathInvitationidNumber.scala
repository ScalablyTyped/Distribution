package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidNumber extends StObject {
  
  var parameters: PathInvitationidNumber
  
  var responses: `404Content55409Content55`
}
object ParametersPathInvitationidNumber {
  
  inline def apply(parameters: PathInvitationidNumber, responses: `404Content55409Content55`): ParametersPathInvitationidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidNumber]
  }
  
  extension [Self <: ParametersPathInvitationidNumber](x: Self) {
    
    inline def setParameters(value: PathInvitationidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content55409Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
