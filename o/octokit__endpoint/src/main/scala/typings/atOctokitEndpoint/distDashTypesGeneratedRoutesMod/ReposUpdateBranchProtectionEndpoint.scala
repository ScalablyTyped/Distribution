package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionEndpoint extends js.Object {
  var branch: String
  var enforce_admins: Boolean | Null
  var owner: String
  var repo: String
  var required_pull_request_reviews: js.Object | Null
  var `required_pull_request_reviews.dismiss_stale_reviews`: js.UndefOr[Boolean] = js.undefined
  var `required_pull_request_reviews.dismissal_restrictions`: js.UndefOr[js.Object] = js.undefined
  var `required_pull_request_reviews.dismissal_restrictions.teams`: js.UndefOr[js.Array[String]] = js.undefined
  var `required_pull_request_reviews.dismissal_restrictions.users`: js.UndefOr[js.Array[String]] = js.undefined
  var `required_pull_request_reviews.require_code_owner_reviews`: js.UndefOr[Boolean] = js.undefined
  var `required_pull_request_reviews.required_approving_review_count`: js.UndefOr[Double] = js.undefined
  var required_status_checks: js.Object | Null
  var `required_status_checks.contexts`: js.Array[String]
  var `required_status_checks.strict`: Boolean
  var restrictions: js.Object | Null
  var `restrictions.teams`: js.UndefOr[js.Array[String]] = js.undefined
  var `restrictions.users`: js.UndefOr[js.Array[String]] = js.undefined
}

object ReposUpdateBranchProtectionEndpoint {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    `required_status_checks.contexts`: js.Array[String],
    `required_status_checks.strict`: Boolean,
    enforce_admins: js.UndefOr[Boolean] = js.undefined,
    required_pull_request_reviews: js.Object = null,
    `required_pull_request_reviews.dismiss_stale_reviews`: js.UndefOr[Boolean] = js.undefined,
    `required_pull_request_reviews.dismissal_restrictions`: js.Object = null,
    `required_pull_request_reviews.dismissal_restrictions.teams`: js.Array[String] = null,
    `required_pull_request_reviews.dismissal_restrictions.users`: js.Array[String] = null,
    `required_pull_request_reviews.require_code_owner_reviews`: js.UndefOr[Boolean] = js.undefined,
    `required_pull_request_reviews.required_approving_review_count`: Int | Double = null,
    required_status_checks: js.Object = null,
    restrictions: js.Object = null,
    `restrictions.teams`: js.Array[String] = null,
    `restrictions.users`: js.Array[String] = null
  ): ReposUpdateBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    __obj.updateDynamic("required_status_checks.contexts")(`required_status_checks.contexts`)
    __obj.updateDynamic("required_status_checks.strict")(`required_status_checks.strict`)
    if (!js.isUndefined(enforce_admins)) __obj.updateDynamic("enforce_admins")(enforce_admins)
    if (required_pull_request_reviews != null) __obj.updateDynamic("required_pull_request_reviews")(required_pull_request_reviews)
    if (!js.isUndefined(`required_pull_request_reviews.dismiss_stale_reviews`)) __obj.updateDynamic("required_pull_request_reviews.dismiss_stale_reviews")(`required_pull_request_reviews.dismiss_stale_reviews`)
    if (`required_pull_request_reviews.dismissal_restrictions` != null) __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions")(`required_pull_request_reviews.dismissal_restrictions`)
    if (`required_pull_request_reviews.dismissal_restrictions.teams` != null) __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions.teams")(`required_pull_request_reviews.dismissal_restrictions.teams`)
    if (`required_pull_request_reviews.dismissal_restrictions.users` != null) __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions.users")(`required_pull_request_reviews.dismissal_restrictions.users`)
    if (!js.isUndefined(`required_pull_request_reviews.require_code_owner_reviews`)) __obj.updateDynamic("required_pull_request_reviews.require_code_owner_reviews")(`required_pull_request_reviews.require_code_owner_reviews`)
    if (`required_pull_request_reviews.required_approving_review_count` != null) __obj.updateDynamic("required_pull_request_reviews.required_approving_review_count")(`required_pull_request_reviews.required_approving_review_count`.asInstanceOf[js.Any])
    if (required_status_checks != null) __obj.updateDynamic("required_status_checks")(required_status_checks)
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions)
    if (`restrictions.teams` != null) __obj.updateDynamic("restrictions.teams")(`restrictions.teams`)
    if (`restrictions.users` != null) __obj.updateDynamic("restrictions.users")(`restrictions.users`)
    __obj.asInstanceOf[ReposUpdateBranchProtectionEndpoint]
  }
}

