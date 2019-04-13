package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponse extends js.Object {
  var enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins
  var required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews
  var required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks
  var restrictions: ReposGetBranchProtectionResponseRestrictions
  var url: java.lang.String
}

object ReposGetBranchProtectionResponse {
  @scala.inline
  def apply(
    enforce_admins: ReposGetBranchProtectionResponseEnforceAdmins,
    required_pull_request_reviews: ReposGetBranchProtectionResponseRequiredPullRequestReviews,
    required_status_checks: ReposGetBranchProtectionResponseRequiredStatusChecks,
    restrictions: ReposGetBranchProtectionResponseRestrictions,
    url: java.lang.String
  ): ReposGetBranchProtectionResponse = {
    val __obj = js.Dynamic.literal(enforce_admins = enforce_admins, required_pull_request_reviews = required_pull_request_reviews, required_status_checks = required_status_checks, restrictions = restrictions, url = url)
  
    __obj.asInstanceOf[ReposGetBranchProtectionResponse]
  }
}

