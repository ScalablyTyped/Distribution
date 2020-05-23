package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Apps
import typings.octokitTypes.anon.Contextsurl
import typings.octokitTypes.anon.Dismissalrestrictions
import typings.octokitTypes.anon.EnabledBoolean
import typings.octokitTypes.anon.EnabledUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchProtectionResponseData extends js.Object {
  var allow_deletions: EnabledBoolean
  var allow_force_pushes: EnabledBoolean
  var enforce_admins: EnabledUrl
  var required_linear_history: EnabledBoolean
  var required_pull_request_reviews: Dismissalrestrictions
  var required_status_checks: Contextsurl
  var restrictions: Apps
  var url: String
}

object ReposGetBranchProtectionResponseData {
  @scala.inline
  def apply(
    allow_deletions: EnabledBoolean,
    allow_force_pushes: EnabledBoolean,
    enforce_admins: EnabledUrl,
    required_linear_history: EnabledBoolean,
    required_pull_request_reviews: Dismissalrestrictions,
    required_status_checks: Contextsurl,
    restrictions: Apps,
    url: String
  ): ReposGetBranchProtectionResponseData = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchProtectionResponseData]
  }
}

