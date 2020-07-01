package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdatePullRequestReviewProtectionEndpoint extends js.Object {
  var branch: String
  /**
    * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
    */
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify which users and teams can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories.
    */
  var dismissal_restrictions: js.UndefOr[ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions] = js.undefined
  var owner: String
  var repo: String
  /**
    * Blocks merging pull requests until [code owners](https://help.github.com/articles/about-code-owners/) have reviewed.
    */
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6.
    */
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}

object ReposUpdatePullRequestReviewProtectionEndpoint {
  @scala.inline
  def apply(
    branch: String,
    owner: String,
    repo: String,
    dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined,
    dismissal_restrictions: ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions = null,
    require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined,
    required_approving_review_count: js.UndefOr[Double] = js.undefined
  ): ReposUpdatePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(dismiss_stale_reviews)) __obj.updateDynamic("dismiss_stale_reviews")(dismiss_stale_reviews.get.asInstanceOf[js.Any])
    if (dismissal_restrictions != null) __obj.updateDynamic("dismissal_restrictions")(dismissal_restrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(require_code_owner_reviews)) __obj.updateDynamic("require_code_owner_reviews")(require_code_owner_reviews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required_approving_review_count)) __obj.updateDynamic("required_approving_review_count")(required_approving_review_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdatePullRequestReviewProtectionEndpoint]
  }
}

