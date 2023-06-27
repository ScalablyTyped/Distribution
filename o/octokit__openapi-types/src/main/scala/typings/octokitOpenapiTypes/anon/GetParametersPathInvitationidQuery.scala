package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathInvitationidQuery extends StObject {
  
  /**
    * List organization invitation teams
    * @description List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  var get: ParametersPathInvitationidQuery
}
object GetParametersPathInvitationidQuery {
  
  inline def apply(get: ParametersPathInvitationidQuery): GetParametersPathInvitationidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathInvitationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathInvitationidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathInvitationidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
