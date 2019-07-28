package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceProtectedBranchTeamRestrictionsParams extends js.Object {
  var branch: String
  var owner: String
  var repo: String
  var teams: js.Array[String]
}

object ReposReplaceProtectedBranchTeamRestrictionsParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String, teams: js.Array[String]): ReposReplaceProtectedBranchTeamRestrictionsParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo, teams = teams)
  
    __obj.asInstanceOf[ReposReplaceProtectedBranchTeamRestrictionsParams]
  }
}

