package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidQueryPage extends StObject {
  
  var parameters: PathInvitationidQueryPage
  
  var responses: `200Content91`
}
object ParametersPathInvitationidQueryPage {
  
  inline def apply(parameters: PathInvitationidQueryPage, responses: `200Content91`): ParametersPathInvitationidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidQueryPage]
  }
  
  extension [Self <: ParametersPathInvitationidQueryPage](x: Self) {
    
    inline def setParameters(value: PathInvitationidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content91`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
