package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismissalrestrictions extends StObject {
  
  /** @description Allow specific users, teams, or apps to bypass pull request requirements. */
  var bypass_pull_request_allowances: js.UndefOr[AppsTeams] = js.undefined
  
  /** @example true */
  var dismiss_stale_reviews: Boolean
  
  var dismissal_restrictions: js.UndefOr[Teamsurl] = js.undefined
  
  /** @example true */
  var require_code_owner_reviews: Boolean
  
  /**
    * @description Whether the most recent push must be approved by someone other than the person who pushed it.
    * @default false
    * @example true
    */
  var require_last_push_approval: js.UndefOr[Boolean] = js.undefined
  
  /** @example 2 */
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/branches/master/protection/dismissal_restrictions
    */
  var url: js.UndefOr[String] = js.undefined
}
object Dismissalrestrictions {
  
  inline def apply(dismiss_stale_reviews: Boolean, require_code_owner_reviews: Boolean): Dismissalrestrictions = {
    val __obj = js.Dynamic.literal(dismiss_stale_reviews = dismiss_stale_reviews.asInstanceOf[js.Any], require_code_owner_reviews = require_code_owner_reviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dismissalrestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dismissalrestrictions] (val x: Self) extends AnyVal {
    
    inline def setBypass_pull_request_allowances(value: AppsTeams): Self = StObject.set(x, "bypass_pull_request_allowances", value.asInstanceOf[js.Any])
    
    inline def setBypass_pull_request_allowancesUndefined: Self = StObject.set(x, "bypass_pull_request_allowances", js.undefined)
    
    inline def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    inline def setDismissal_restrictions(value: Teamsurl): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    inline def setDismissal_restrictionsUndefined: Self = StObject.set(x, "dismissal_restrictions", js.undefined)
    
    inline def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequire_last_push_approval(value: Boolean): Self = StObject.set(x, "require_last_push_approval", value.asInstanceOf[js.Any])
    
    inline def setRequire_last_push_approvalUndefined: Self = StObject.set(x, "require_last_push_approval", js.undefined)
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
