package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOrgQuery407 extends StObject {
  
  var parameters: PathInvitationidOrgQuery407
  
  var responses: `200Content447`
}
object ParametersPathInvitationidOrgQuery407 {
  
  inline def apply(parameters: PathInvitationidOrgQuery407, responses: `200Content447`): ParametersPathInvitationidOrgQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOrgQuery407]
  }
  
  extension [Self <: ParametersPathInvitationidOrgQuery407](x: Self) {
    
    inline def setParameters(value: PathInvitationidOrgQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content447`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
