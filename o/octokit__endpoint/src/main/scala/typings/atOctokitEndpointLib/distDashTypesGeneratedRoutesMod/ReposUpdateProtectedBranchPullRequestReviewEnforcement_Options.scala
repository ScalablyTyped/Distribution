package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateProtectedBranchPullRequestReviewEnforcement_Options extends js.Object {
  var branch: java.lang.String
  var dismiss_stale_reviews: js.UndefOr[scala.Boolean] = js.undefined
  var dismissal_restrictions: js.UndefOr[js.Object] = js.undefined
  var `dismissal_restrictions.teams`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `dismissal_restrictions.users`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var require_code_owner_reviews: js.UndefOr[scala.Boolean] = js.undefined
  var required_approving_review_count: js.UndefOr[scala.Double] = js.undefined
}

object ReposUpdateProtectedBranchPullRequestReviewEnforcement_Options {
  @scala.inline
  def apply(
    branch: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    dismiss_stale_reviews: js.UndefOr[scala.Boolean] = js.undefined,
    dismissal_restrictions: js.Object = null,
    `dismissal_restrictions.teams`: js.Array[java.lang.String] = null,
    `dismissal_restrictions.users`: js.Array[java.lang.String] = null,
    require_code_owner_reviews: js.UndefOr[scala.Boolean] = js.undefined,
    required_approving_review_count: scala.Int | scala.Double = null
  ): ReposUpdateProtectedBranchPullRequestReviewEnforcement_Options = {
    val __obj = js.Dynamic.literal(branch = branch, owner = owner, repo = repo)
    if (!js.isUndefined(dismiss_stale_reviews)) __obj.updateDynamic("dismiss_stale_reviews")(dismiss_stale_reviews)
    if (dismissal_restrictions != null) __obj.updateDynamic("dismissal_restrictions")(dismissal_restrictions)
    if (`dismissal_restrictions.teams` != null) __obj.updateDynamic("dismissal_restrictions.teams")(`dismissal_restrictions.teams`)
    if (`dismissal_restrictions.users` != null) __obj.updateDynamic("dismissal_restrictions.users")(`dismissal_restrictions.users`)
    if (!js.isUndefined(require_code_owner_reviews)) __obj.updateDynamic("require_code_owner_reviews")(require_code_owner_reviews)
    if (required_approving_review_count != null) __obj.updateDynamic("required_approving_review_count")(required_approving_review_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcement_Options]
  }
}

