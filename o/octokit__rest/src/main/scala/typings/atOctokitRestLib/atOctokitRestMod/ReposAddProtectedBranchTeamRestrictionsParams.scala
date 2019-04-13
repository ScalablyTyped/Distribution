package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddProtectedBranchTeamRestrictionsParams extends js.Object {
  var branch: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
  var teams: js.Array[java.lang.String]
}

object ReposAddProtectedBranchTeamRestrictionsParams {
  @scala.inline
  def apply(
    branch: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    teams: js.Array[java.lang.String]
  ): ReposAddProtectedBranchTeamRestrictionsParams = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo, teams = teams)
  
    __obj.asInstanceOf[ReposAddProtectedBranchTeamRestrictionsParams]
  }
}

