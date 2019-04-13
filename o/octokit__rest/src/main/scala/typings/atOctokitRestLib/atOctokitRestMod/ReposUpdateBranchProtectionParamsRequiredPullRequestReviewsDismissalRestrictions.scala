package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions extends js.Object {
  var teams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var users: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions {
  @scala.inline
  def apply(teams: js.Array[java.lang.String] = null, users: js.Array[java.lang.String] = null): ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal()
    if (teams != null) __obj.updateDynamic("teams")(teams)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions]
  }
}

