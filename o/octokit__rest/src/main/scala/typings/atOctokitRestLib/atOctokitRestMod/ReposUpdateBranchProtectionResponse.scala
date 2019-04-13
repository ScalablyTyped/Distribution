package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionResponse extends js.Object {
  var enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins
  var required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews
  var required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks
  var restrictions: ReposUpdateBranchProtectionResponseRestrictions
  var url: java.lang.String
}

object ReposUpdateBranchProtectionResponse {
  @scala.inline
  def apply(
    enforce_admins: ReposUpdateBranchProtectionResponseEnforceAdmins,
    required_pull_request_reviews: ReposUpdateBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposUpdateBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposUpdateBranchProtectionResponseRestrictions,
    url: java.lang.String
  ): ReposUpdateBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(enforce_admins = enforce_admins, required_pull_request_reviews = required_pull_request_reviews, required_status_checks = required_status_checks, restrictions = restrictions, url = url)
  
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponse]
  }
}

