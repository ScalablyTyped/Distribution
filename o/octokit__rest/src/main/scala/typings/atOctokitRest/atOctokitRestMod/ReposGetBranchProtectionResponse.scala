package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponse extends js.Object {
  var enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins
  var required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews
  var required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks
  var restrictions: ReposGetBranchProtectionResponseRestrictions
  var url: String
}

object ReposGetBranchProtectionResponse {
  @scala.inline
  def apply(
    enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins,
    required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposGetBranchProtectionResponseRestrictions,
    url: String
  ): ReposGetBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(enforce_admins = enforce_admins.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponse]
  }
}

