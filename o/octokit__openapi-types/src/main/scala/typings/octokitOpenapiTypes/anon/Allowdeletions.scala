package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowdeletions extends StObject {
  
  var allow_deletions: js.UndefOr[`0`] = js.undefined
  
  var allow_force_pushes: js.UndefOr[`0`] = js.undefined
  
  var block_creations: js.UndefOr[`0`] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var enforce_admins: js.UndefOr[EnabledUrl] = js.undefined
  
  /** @example "branch/with/protection" */
  var name: js.UndefOr[String] = js.undefined
  
  /** @example "https://api.github.com/repos/owner-79e94e2d36b3fd06a32bb213/AAA_Public_Repo/branches/branch/with/protection/protection" */
  var protection_url: js.UndefOr[String] = js.undefined
  
  var required_conversation_resolution: js.UndefOr[`0`] = js.undefined
  
  var required_linear_history: js.UndefOr[`0`] = js.undefined
  
  var required_pull_request_reviews: js.UndefOr[Dismissalrestrictions] = js.undefined
  
  var required_signatures: js.UndefOr[EnabledUrl] = js.undefined
  
  var required_status_checks: js.UndefOr[Checks] = js.undefined
  
  var restrictions: js.UndefOr[Appsurl] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Allowdeletions {
  
  inline def apply(): Allowdeletions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowdeletions]
  }
  
  extension [Self <: Allowdeletions](x: Self) {
    
    inline def setAllow_deletions(value: `0`): Self = StObject.set(x, "allow_deletions", value.asInstanceOf[js.Any])
    
    inline def setAllow_deletionsUndefined: Self = StObject.set(x, "allow_deletions", js.undefined)
    
    inline def setAllow_force_pushes(value: `0`): Self = StObject.set(x, "allow_force_pushes", value.asInstanceOf[js.Any])
    
    inline def setAllow_force_pushesUndefined: Self = StObject.set(x, "allow_force_pushes", js.undefined)
    
    inline def setBlock_creations(value: `0`): Self = StObject.set(x, "block_creations", value.asInstanceOf[js.Any])
    
    inline def setBlock_creationsUndefined: Self = StObject.set(x, "block_creations", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEnforce_admins(value: EnabledUrl): Self = StObject.set(x, "enforce_admins", value.asInstanceOf[js.Any])
    
    inline def setEnforce_adminsUndefined: Self = StObject.set(x, "enforce_admins", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
    
    inline def setProtection_urlUndefined: Self = StObject.set(x, "protection_url", js.undefined)
    
    inline def setRequired_conversation_resolution(value: `0`): Self = StObject.set(x, "required_conversation_resolution", value.asInstanceOf[js.Any])
    
    inline def setRequired_conversation_resolutionUndefined: Self = StObject.set(x, "required_conversation_resolution", js.undefined)
    
    inline def setRequired_linear_history(value: `0`): Self = StObject.set(x, "required_linear_history", value.asInstanceOf[js.Any])
    
    inline def setRequired_linear_historyUndefined: Self = StObject.set(x, "required_linear_history", js.undefined)
    
    inline def setRequired_pull_request_reviews(value: Dismissalrestrictions): Self = StObject.set(x, "required_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequired_pull_request_reviewsUndefined: Self = StObject.set(x, "required_pull_request_reviews", js.undefined)
    
    inline def setRequired_signatures(value: EnabledUrl): Self = StObject.set(x, "required_signatures", value.asInstanceOf[js.Any])
    
    inline def setRequired_signaturesUndefined: Self = StObject.set(x, "required_signatures", js.undefined)
    
    inline def setRequired_status_checks(value: Checks): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksUndefined: Self = StObject.set(x, "required_status_checks", js.undefined)
    
    inline def setRestrictions(value: Appsurl): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
