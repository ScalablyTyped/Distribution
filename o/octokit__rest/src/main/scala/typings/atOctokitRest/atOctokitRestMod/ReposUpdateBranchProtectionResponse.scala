package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponse extends js.Object {
  var enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins
  var required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews
  var required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks
  var restrictions: ReposUpdateBranchProtectionResponseRestrictions
  var url: String
}

object ReposUpdateBranchProtectionResponse {
  @scala.inline
  def apply(
    enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins,
    required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposUpdateBranchProtectionResponseRestrictions,
    url: String
  ): ReposUpdateBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(enforce_admins = enforce_admins.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponse]
  }
}

