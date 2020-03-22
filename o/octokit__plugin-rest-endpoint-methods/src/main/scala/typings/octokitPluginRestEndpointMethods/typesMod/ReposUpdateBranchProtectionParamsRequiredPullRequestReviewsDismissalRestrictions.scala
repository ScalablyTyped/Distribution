package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions extends js.Object {
  /**
    * The list of team `slug`s with dismissal access
    */
  var teams: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of user `login`s with dismissal access
    */
  var users: js.UndefOr[js.Array[String]] = js.undefined
}

object ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions {
  @scala.inline
  def apply(teams: js.Array[String] = null, users: js.Array[String] = null): ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal()
    if (teams != null) __obj.updateDynamic("teams")(teams.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions]
  }
}

