package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathTeamidQueryPerpageRole extends StObject {
  
  /**
    * List team members (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List team members`](https://docs.github.com/rest/reference/teams#list-team-members) endpoint.
    *
    * Team members will include the members of child teams.
    */
  var get: ParametersPathTeamidQueryPerpageRole
}
object GetParametersPathTeamidQueryPerpageRole {
  
  inline def apply(get: ParametersPathTeamidQueryPerpageRole): GetParametersPathTeamidQueryPerpageRole = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathTeamidQueryPerpageRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathTeamidQueryPerpageRole] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathTeamidQueryPerpageRole): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
