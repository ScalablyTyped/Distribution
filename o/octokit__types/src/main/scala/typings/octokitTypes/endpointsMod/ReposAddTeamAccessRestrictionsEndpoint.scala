package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposAddTeamAccessRestrictionsEndpoint extends StObject {
  
  var branch: String
  
  var owner: String
  
  var repo: String
  
  /**
    * teams parameter
    */
  var teams: js.Array[String]
}
object ReposAddTeamAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(branch: String, owner: String, repo: String, teams: js.Array[String]): ReposAddTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddTeamAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ReposAddTeamAccessRestrictionsEndpointMutableBuilder[Self <: ReposAddTeamAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
  }
}
