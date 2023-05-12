package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathTeamidQueryPage extends StObject {
  
  /**
    * List pending team invitations (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List pending team invitations`](https://docs.github.com/rest/reference/teams#list-pending-team-invitations) endpoint.
    *
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  var get: ParametersPathTeamidQueryPage
}
object GetParametersPathTeamidQueryPage {
  
  inline def apply(get: ParametersPathTeamidQueryPage): GetParametersPathTeamidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathTeamidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathTeamidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathTeamidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
