package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdatePullRequestReviewProtectionEndpoint extends js.Object {
  var branch: String = js.native
  /**
    * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
    */
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.native
  /**
    * Specify which users and teams can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories.
    */
  var dismissal_restrictions: js.UndefOr[ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed.
    */
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6.
    */
  var required_approving_review_count: js.UndefOr[Double] = js.native
}

object ReposUpdatePullRequestReviewProtectionEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposUpdatePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdatePullRequestReviewProtectionEndpoint]
  }
  @scala.inline
  implicit class ReposUpdatePullRequestReviewProtectionEndpointOps[Self <: ReposUpdatePullRequestReviewProtectionEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDismiss_stale_reviews(value: Boolean): Self = this.set("dismiss_stale_reviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismiss_stale_reviews: Self = this.set("dismiss_stale_reviews", js.undefined)
    @scala.inline
    def setDismissal_restrictions(value: ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions): Self = this.set("dismissal_restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissal_restrictions: Self = this.set("dismissal_restrictions", js.undefined)
    @scala.inline
    def setRequire_code_owner_reviews(value: Boolean): Self = this.set("require_code_owner_reviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_code_owner_reviews: Self = this.set("require_code_owner_reviews", js.undefined)
    @scala.inline
    def setRequired_approving_review_count(value: Double): Self = this.set("required_approving_review_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired_approving_review_count: Self = this.set("required_approving_review_count", js.undefined)
  }
  
}

