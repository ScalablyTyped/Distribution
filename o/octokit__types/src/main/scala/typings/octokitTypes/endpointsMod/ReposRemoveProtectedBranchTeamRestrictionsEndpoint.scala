package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveProtectedBranchTeamRestrictionsEndpoint extends js.Object {
  var branch: String
  var owner: String
  var repo: String
  /**
    * teams parameter
    */
  var teams: js.Array[String]
}

object ReposRemoveProtectedBranchTeamRestrictionsEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String, teams: js.Array[String]): ReposRemoveProtectedBranchTeamRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRemoveProtectedBranchTeamRestrictionsEndpoint]
  }
}

