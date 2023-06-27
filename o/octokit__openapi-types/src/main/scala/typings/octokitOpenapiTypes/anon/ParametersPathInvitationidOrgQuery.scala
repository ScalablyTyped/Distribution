package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOrgQuery extends StObject {
  
  var parameters: PathInvitationidOrgQuery
  
  var responses: `200Content603`
}
object ParametersPathInvitationidOrgQuery {
  
  inline def apply(parameters: PathInvitationidOrgQuery, responses: `200Content603`): ParametersPathInvitationidOrgQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInvitationidOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInvitationidOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content603`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
