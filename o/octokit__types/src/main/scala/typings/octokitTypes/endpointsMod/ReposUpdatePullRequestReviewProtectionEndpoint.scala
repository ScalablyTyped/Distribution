package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdatePullRequestReviewProtectionEndpoint extends StObject {
  
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
    * Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed.
    */
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6.
    */
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}
object ReposUpdatePullRequestReviewProtectionEndpoint {
  
  inline def apply(branch: String, owner: String, repo: String): ReposUpdatePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdatePullRequestReviewProtectionEndpoint]
  }
  
  extension [Self <: ReposUpdatePullRequestReviewProtectionEndpoint](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    inline def setDismiss_stale_reviewsUndefined: Self = StObject.set(x, "dismiss_stale_reviews", js.undefined)
    
    inline def setDismissal_restrictions(value: ReposUpdatePullRequestReviewProtectionParamsDismissalRestrictions): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    inline def setDismissal_restrictionsUndefined: Self = StObject.set(x, "dismissal_restrictions", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequire_code_owner_reviewsUndefined: Self = StObject.set(x, "require_code_owner_reviews", js.undefined)
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
  }
}
