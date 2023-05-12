package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blockcreations extends StObject {
  
  var allow_deletions: js.UndefOr[EnabledBoolean] = js.undefined
  
  var allow_force_pushes: js.UndefOr[EnabledBoolean] = js.undefined
  
  /** @description Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to `false` to prevent fork syncing. */
  var allow_fork_syncing: js.UndefOr[`438`] = js.undefined
  
  var block_creations: js.UndefOr[EnabledBoolean] = js.undefined
  
  var enforce_admins: js.UndefOr[EnabledUrl] = js.undefined
  
  /** @description Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. */
  var lock_branch: js.UndefOr[`438`] = js.undefined
  
  var required_conversation_resolution: js.UndefOr[`438`] = js.undefined
  
  var required_linear_history: js.UndefOr[EnabledBoolean] = js.undefined
  
  var required_pull_request_reviews: js.UndefOr[Requirecodeownerreviews] = js.undefined
  
  var required_signatures: js.UndefOr[EnabledUrl] = js.undefined
  
  var required_status_checks: js.UndefOr[Strict] = js.undefined
  
  var restrictions: js.UndefOr[Appsurl] = js.undefined
  
  /** Format: uri */
  var url: String
}
object Blockcreations {
  
  inline def apply(url: String): Blockcreations = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blockcreations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blockcreations] (val x: Self) extends AnyVal {
    
    inline def setAllow_deletions(value: EnabledBoolean): Self = StObject.set(x, "allow_deletions", value.asInstanceOf[js.Any])
    
    inline def setAllow_deletionsUndefined: Self = StObject.set(x, "allow_deletions", js.undefined)
    
    inline def setAllow_force_pushes(value: EnabledBoolean): Self = StObject.set(x, "allow_force_pushes", value.asInstanceOf[js.Any])
    
    inline def setAllow_force_pushesUndefined: Self = StObject.set(x, "allow_force_pushes", js.undefined)
    
    inline def setAllow_fork_syncing(value: `438`): Self = StObject.set(x, "allow_fork_syncing", value.asInstanceOf[js.Any])
    
    inline def setAllow_fork_syncingUndefined: Self = StObject.set(x, "allow_fork_syncing", js.undefined)
    
    inline def setBlock_creations(value: EnabledBoolean): Self = StObject.set(x, "block_creations", value.asInstanceOf[js.Any])
    
    inline def setBlock_creationsUndefined: Self = StObject.set(x, "block_creations", js.undefined)
    
    inline def setEnforce_admins(value: EnabledUrl): Self = StObject.set(x, "enforce_admins", value.asInstanceOf[js.Any])
    
    inline def setEnforce_adminsUndefined: Self = StObject.set(x, "enforce_admins", js.undefined)
    
    inline def setLock_branch(value: `438`): Self = StObject.set(x, "lock_branch", value.asInstanceOf[js.Any])
    
    inline def setLock_branchUndefined: Self = StObject.set(x, "lock_branch", js.undefined)
    
    inline def setRequired_conversation_resolution(value: `438`): Self = StObject.set(x, "required_conversation_resolution", value.asInstanceOf[js.Any])
    
    inline def setRequired_conversation_resolutionUndefined: Self = StObject.set(x, "required_conversation_resolution", js.undefined)
    
    inline def setRequired_linear_history(value: EnabledBoolean): Self = StObject.set(x, "required_linear_history", value.asInstanceOf[js.Any])
    
    inline def setRequired_linear_historyUndefined: Self = StObject.set(x, "required_linear_history", js.undefined)
    
    inline def setRequired_pull_request_reviews(value: Requirecodeownerreviews): Self = StObject.set(x, "required_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequired_pull_request_reviewsUndefined: Self = StObject.set(x, "required_pull_request_reviews", js.undefined)
    
    inline def setRequired_signatures(value: EnabledUrl): Self = StObject.set(x, "required_signatures", value.asInstanceOf[js.Any])
    
    inline def setRequired_signaturesUndefined: Self = StObject.set(x, "required_signatures", js.undefined)
    
    inline def setRequired_status_checks(value: Strict): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksUndefined: Self = StObject.set(x, "required_status_checks", js.undefined)
    
    inline def setRestrictions(value: Appsurl): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
