package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRestrictions extends js.Object {
  var apps: js.UndefOr[js.Array[String]] = js.undefined
  var teams: js.Array[String]
  var users: js.Array[String]
}

object ReposUpdateBranchProtectionParamsRestrictions {
  @scala.inline
  def apply(teams: js.Array[String], users: js.Array[String], apps: js.Array[String] = null): ReposUpdateBranchProtectionParamsRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (apps != null) __obj.updateDynamic("apps")(apps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRestrictions]
  }
}

