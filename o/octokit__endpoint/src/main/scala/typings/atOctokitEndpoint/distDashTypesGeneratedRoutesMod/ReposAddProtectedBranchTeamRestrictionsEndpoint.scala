package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchTeamRestrictionsEndpoint extends js.Object {
  var branch: String
  var owner: String
  var repo: String
  var teams: js.Array[String]
}

object ReposAddProtectedBranchTeamRestrictionsEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String, teams: js.Array[String]): ReposAddProtectedBranchTeamRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo, teams = teams)
  
    __obj.asInstanceOf[ReposAddProtectedBranchTeamRestrictionsEndpoint]
  }
}

