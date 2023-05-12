package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOrgQuery473 extends StObject {
  
  var parameters: PathInvitationidOrgQuery473
  
  var responses: `200Content516`
}
object ParametersPathInvitationidOrgQuery473 {
  
  inline def apply(parameters: PathInvitationidOrgQuery473, responses: `200Content516`): ParametersPathInvitationidOrgQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOrgQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInvitationidOrgQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInvitationidOrgQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content516`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
