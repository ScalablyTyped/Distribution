package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowforksyncing extends StObject {
  
  var allow_deletions: js.UndefOr[`516`] = js.undefined
  
  var allow_force_pushes: js.UndefOr[`516`] = js.undefined
  
  /** @description Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to `false` to prevent fork syncing. */
  var allow_fork_syncing: js.UndefOr[`516`] = js.undefined
  
  var block_creations: js.UndefOr[`516`] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var enforce_admins: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['protected-branch-admin-enforced'] */ js.Any
  ] = js.undefined
  
  /** @description Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. */
  var lock_branch: js.UndefOr[`516`] = js.undefined
  
  /** @example "branch/with/protection" */
  var name: js.UndefOr[String] = js.undefined
  
  /** @example "https://api.github.com/repos/owner-79e94e2d36b3fd06a32bb213/AAA_Public_Repo/branches/branch/with/protection/protection" */
  var protection_url: js.UndefOr[String] = js.undefined
  
  var required_conversation_resolution: js.UndefOr[`516`] = js.undefined
  
  var required_linear_history: js.UndefOr[`516`] = js.undefined
  
  var required_pull_request_reviews: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['protected-branch-pull-request-review'] */ js.Any
  ] = js.undefined
  
  var required_signatures: js.UndefOr[EnabledUrl] = js.undefined
  
  var required_status_checks: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['protected-branch-required-status-check'] */ js.Any
  ] = js.undefined
  
  var restrictions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['branch-restriction-policy'] */ js.Any
  ] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Allowforksyncing {
  
  inline def apply(): Allowforksyncing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowforksyncing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Allowforksyncing] (val x: Self) extends AnyVal {
    
    inline def setAllow_deletions(value: `516`): Self = StObject.set(x, "allow_deletions", value.asInstanceOf[js.Any])
    
    inline def setAllow_deletionsUndefined: Self = StObject.set(x, "allow_deletions", js.undefined)
    
    inline def setAllow_force_pushes(value: `516`): Self = StObject.set(x, "allow_force_pushes", value.asInstanceOf[js.Any])
    
    inline def setAllow_force_pushesUndefined: Self = StObject.set(x, "allow_force_pushes", js.undefined)
    
    inline def setAllow_fork_syncing(value: `516`): Self = StObject.set(x, "allow_fork_syncing", value.asInstanceOf[js.Any])
    
    inline def setAllow_fork_syncingUndefined: Self = StObject.set(x, "allow_fork_syncing", js.undefined)
    
    inline def setBlock_creations(value: `516`): Self = StObject.set(x, "block_creations", value.asInstanceOf[js.Any])
    
    inline def setBlock_creationsUndefined: Self = StObject.set(x, "block_creations", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEnforce_admins(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['protected-branch-admin-enforced'] */ js.Any
    ): Self = StObject.set(x, "enforce_admins", value.asInstanceOf[js.Any])
    
    inline def setEnforce_adminsUndefined: Self = StObject.set(x, "enforce_admins", js.undefined)
    
    inline def setLock_branch(value: `516`): Self = StObject.set(x, "lock_branch", value.asInstanceOf[js.Any])
    
    inline def setLock_branchUndefined: Self = StObject.set(x, "lock_branch", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
    
    inline def setProtection_urlUndefined: Self = StObject.set(x, "protection_url", js.undefined)
    
    inline def setRequired_conversation_resolution(value: `516`): Self = StObject.set(x, "required_conversation_resolution", value.asInstanceOf[js.Any])
    
    inline def setRequired_conversation_resolutionUndefined: Self = StObject.set(x, "required_conversation_resolution", js.undefined)
    
    inline def setRequired_linear_history(value: `516`): Self = StObject.set(x, "required_linear_history", value.asInstanceOf[js.Any])
    
    inline def setRequired_linear_historyUndefined: Self = StObject.set(x, "required_linear_history", js.undefined)
    
    inline def setRequired_pull_request_reviews(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['protected-branch-pull-request-review'] */ js.Any
    ): Self = StObject.set(x, "required_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequired_pull_request_reviewsUndefined: Self = StObject.set(x, "required_pull_request_reviews", js.undefined)
    
    inline def setRequired_signatures(value: EnabledUrl): Self = StObject.set(x, "required_signatures", value.asInstanceOf[js.Any])
    
    inline def setRequired_signaturesUndefined: Self = StObject.set(x, "required_signatures", js.undefined)
    
    inline def setRequired_status_checks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['protected-branch-required-status-check'] */ js.Any
    ): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksUndefined: Self = StObject.set(x, "required_status_checks", js.undefined)
    
    inline def setRestrictions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['branch-restriction-policy'] */ js.Any
    ): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
