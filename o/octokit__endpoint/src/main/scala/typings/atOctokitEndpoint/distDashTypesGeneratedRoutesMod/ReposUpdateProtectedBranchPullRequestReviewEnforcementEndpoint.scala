package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint extends js.Object {
  var branch: String
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined
  var dismissal_restrictions: js.UndefOr[js.Object] = js.undefined
  var `dismissal_restrictions.teams`: js.UndefOr[js.Array[String]] = js.undefined
  var `dismissal_restrictions.users`: js.UndefOr[js.Array[String]] = js.undefined
  var owner: String
  var repo: String
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}

object ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined,
    dismissal_restrictions: js.Object = null,
    `dismissal_restrictions.teams`: js.Array[String] = null,
    `dismissal_restrictions.users`: js.Array[String] = null,
    require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined,
    required_approving_review_count: Int | Double = null
  ): ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (!js.isUndefined(dismiss_stale_reviews)) __obj.updateDynamic("dismiss_stale_reviews")(dismiss_stale_reviews)
    if (dismissal_restrictions != null) __obj.updateDynamic("dismissal_restrictions")(dismissal_restrictions)
    if (`dismissal_restrictions.teams` != null) __obj.updateDynamic("dismissal_restrictions.teams")(`dismissal_restrictions.teams`)
    if (`dismissal_restrictions.users` != null) __obj.updateDynamic("dismissal_restrictions.users")(`dismissal_restrictions.users`)
    if (!js.isUndefined(require_code_owner_reviews)) __obj.updateDynamic("require_code_owner_reviews")(require_code_owner_reviews)
    if (required_approving_review_count != null) __obj.updateDynamic("required_approving_review_count")(required_approving_review_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint]
  }
}

