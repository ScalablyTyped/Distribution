package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationid extends StObject {
  
  var parameters: PathInvitationid
  
  var responses: `404Content6422Content8`
}
object ParametersPathInvitationid {
  
  inline def apply(parameters: PathInvitationid, responses: `404Content6422Content8`): ParametersPathInvitationid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationid]
  }
  
  extension [Self <: ParametersPathInvitationid](x: Self) {
    
    inline def setParameters(value: PathInvitationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
