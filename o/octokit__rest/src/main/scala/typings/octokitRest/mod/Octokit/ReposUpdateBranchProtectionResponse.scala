package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponse extends js.Object {
  var allow_deletions: ReposUpdateBranchProtectionResponseAllowDeletions
  var allow_force_pushes: ReposUpdateBranchProtectionResponseAllowForcePushes
  var enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins
  var required_linear_history: ReposUpdateBranchProtectionResponseRequiredLinearHistory
  var required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews
  var required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks
  var restrictions: ReposUpdateBranchProtectionResponseRestrictions
  var url: String
}

object ReposUpdateBranchProtectionResponse {
  @scala.inline
  def apply(
    allow_deletions: ReposUpdateBranchProtectionResponseAllowDeletions,
    allow_force_pushes: ReposUpdateBranchProtectionResponseAllowForcePushes,
    enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins,
    required_linear_history: ReposUpdateBranchProtectionResponseRequiredLinearHistory,
    required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposUpdateBranchProtectionResponseRestrictions,
    url: String
  ): ReposUpdateBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponse]
  }
}

