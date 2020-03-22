package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponse extends js.Object {
  var allow_deletions: ReposGetBranchProtectionResponseAllowDeletions
  var allow_force_pushes: ReposGetBranchProtectionResponseAllowForcePushes
  var enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins
  var required_linear_history: ReposGetBranchProtectionResponseRequiredLinearHistory
  var required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews
  var required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks
  var restrictions: ReposGetBranchProtectionResponseRestrictions
  var url: String
}

object ReposGetBranchProtectionResponse {
  @scala.inline
  def apply(
    allow_deletions: ReposGetBranchProtectionResponseAllowDeletions,
    allow_force_pushes: ReposGetBranchProtectionResponseAllowForcePushes,
    enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins,
    required_linear_history: ReposGetBranchProtectionResponseRequiredLinearHistory,
    required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposGetBranchProtectionResponseRestrictions,
    url: String
  ): ReposGetBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponse]
  }
}

