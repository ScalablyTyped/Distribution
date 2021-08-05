package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.maintainer
import typings.octokitTypes.octokitTypesStrings.member
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsListMembersLegacyEndpoint extends StObject {
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /**
    * Filters members returned by their role in the team. Can be one of:
    * \* `member` - normal members of the team.
    * \* `maintainer` - team maintainers.
    * \* `all` - all members of the team.
    */
  var role: js.UndefOr[member | maintainer | all] = js.undefined
  
  var team_id: Double
}
object TeamsListMembersLegacyEndpoint {
  
  inline def apply(team_id: Double): TeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListMembersLegacyEndpoint]
  }
  
  extension [Self <: TeamsListMembersLegacyEndpoint](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRole(value: member | maintainer | all): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
