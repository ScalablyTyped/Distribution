package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidQuery extends StObject {
  
  var parameters: PathInvitationidQuery
  
  var responses: `200Content99`
}
object ParametersPathInvitationidQuery {
  
  inline def apply(parameters: PathInvitationidQuery, responses: `200Content99`): ParametersPathInvitationidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInvitationidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInvitationidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
