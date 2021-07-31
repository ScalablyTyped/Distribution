package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint extends StObject {
  
  /**
    * The IdP groups you want to connect to a GitHub team. When updating, the new `groups` object will replace the original one. You must include any existing groups that you don't want to remove.
    */
  var groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups]
  
  @JSName("org")
  var org_ : String
  
  var team_slug: String
}
object TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint {
  
  @scala.inline
  def apply(
    groups: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups],
    org_ : String,
    team_slug: String
  ): TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpointMutableBuilder[Self <: TeamsCreateOrUpdateIdPGroupConnectionsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
