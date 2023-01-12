package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requirecodeownerreviews extends StObject {
  
  var bypass_pull_request_allowances: js.UndefOr[AppsTeamsUsers] = js.undefined
  
  var dismiss_stale_reviews: js.UndefOr[Boolean] = js.undefined
  
  var dismissal_restrictions: js.UndefOr[TeamsTeamsurl] = js.undefined
  
  var require_code_owner_reviews: js.UndefOr[Boolean] = js.undefined
  
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
  
  /** Format: uri */
  var url: String
}
object Requirecodeownerreviews {
  
  inline def apply(url: String): Requirecodeownerreviews = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requirecodeownerreviews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Requirecodeownerreviews] (val x: Self) extends AnyVal {
    
    inline def setBypass_pull_request_allowances(value: AppsTeamsUsers): Self = StObject.set(x, "bypass_pull_request_allowances", value.asInstanceOf[js.Any])
    
    inline def setBypass_pull_request_allowancesUndefined: Self = StObject.set(x, "bypass_pull_request_allowances", js.undefined)
    
    inline def setDismiss_stale_reviews(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews", value.asInstanceOf[js.Any])
    
    inline def setDismiss_stale_reviewsUndefined: Self = StObject.set(x, "dismiss_stale_reviews", js.undefined)
    
    inline def setDismissal_restrictions(value: TeamsTeamsurl): Self = StObject.set(x, "dismissal_restrictions", value.asInstanceOf[js.Any])
    
    inline def setDismissal_restrictionsUndefined: Self = StObject.set(x, "dismissal_restrictions", js.undefined)
    
    inline def setRequire_code_owner_reviews(value: Boolean): Self = StObject.set(x, "require_code_owner_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequire_code_owner_reviewsUndefined: Self = StObject.set(x, "require_code_owner_reviews", js.undefined)
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
