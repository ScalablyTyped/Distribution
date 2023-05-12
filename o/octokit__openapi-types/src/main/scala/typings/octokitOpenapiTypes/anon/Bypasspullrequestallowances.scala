package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bypasspullrequestallowances extends StObject {
  
  /** @description Allow specific users, teams, or apps to bypass pull request requirements. */
  var bypass_pull_request_allowances: js.UndefOr[Apps] = js.undefined
  
  /** @description Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit. */
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined
  
  /** @description Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories. */
  var dismissal_restrictions: js.UndefOr[Apps] = js.undefined
  
  /** @description Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed. */
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`
    * @default false
    */
  var require_last_push_approval: js.UndefOr[Boolean] = js.undefined
  
  /** @description Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers. */
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}
object Bypasspullrequestallowances {
  
  inline def apply(): Bypasspullrequestallowances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bypasspullrequestallowances]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bypasspullrequestallowances] (val x: Self) extends AnyVal {
    
    inline def setBypass_pull_request_allowances(value: Apps): Self = StObject.set(x, "bypass_pull_request_allowances", value.asInstanceOf[js.Any])
    
    inline def setBypass_pull_request_allowancesUndefined: Self = StObject.set(x, "bypass_pull_request_allowances", js.undefined)
    
    inline def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    inline def setDismiss_stale_reviewsUndefined: Self = StObject.set(x, "dismiss_stale_reviews", js.undefined)
    
    inline def setDismissal_restrictions(value: Apps): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    inline def setDismissal_restrictionsUndefined: Self = StObject.set(x, "dismissal_restrictions", js.undefined)
    
    inline def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequire_code_owner_reviewsUndefined: Self = StObject.set(x, "require_code_owner_reviews", js.undefined)
    
    inline def setRequire_last_push_approval(value: Boolean): Self = StObject.set(x, "require_last_push_approval", value.asInstanceOf[js.Any])
    
    inline def setRequire_last_push_approvalUndefined: Self = StObject.set(x, "require_last_push_approval", js.undefined)
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
  }
}
