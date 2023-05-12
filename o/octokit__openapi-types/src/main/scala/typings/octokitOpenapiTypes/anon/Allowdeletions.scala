package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowdeletions extends StObject {
  
  /** @description Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent deletion of the protected branch. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation. */
  var allow_deletions: js.UndefOr[Boolean] = js.undefined
  
  /** @description Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation." */
  var allow_force_pushes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * @description Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to `false` to prevent fork syncing. Default: `false`.
    * @default false
    */
  var allow_fork_syncing: js.UndefOr[Boolean] = js.undefined
  
  /** @description If set to `true`, the `restrictions` branch protection settings which limits who can push will also block pushes which create new branches, unless the push is initiated by a user, team, or app which has the ability to push. Set to `true` to restrict new branch creation. Default: `false`. */
  var block_creations: js.UndefOr[Boolean] = js.undefined
  
  /** @description Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable. */
  var enforce_admins: Boolean | Null
  
  /**
    * @description Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. Default: `false`.
    * @default false
    */
  var lock_branch: js.UndefOr[Boolean] = js.undefined
  
  /** @description Requires all conversations on code to be resolved before a pull request can be merged into a branch that matches this rule. Set to `false` to disable. Default: `false`. */
  var required_conversation_resolution: js.UndefOr[Boolean] = js.undefined
  
  /** @description Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more information, see "[Requiring a linear commit history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)" in the GitHub Help documentation. */
  var required_linear_history: js.UndefOr[Boolean] = js.undefined
  
  /** @description Require at least one approving review on a pull request, before merging. Set to `null` to disable. */
  var required_pull_request_reviews: Bypasspullrequestallowances | Null
  
  /** @description Require status checks to pass before merging. Set to `null` to disable. */
  var required_status_checks: Checks | Null
  
  /** @description Restrict who can push to the protected branch. User, app, and team `restrictions` are only available for organization-owned repositories. Set to `null` to disable. */
  var restrictions: Teams | Null
}
object Allowdeletions {
  
  inline def apply(): Allowdeletions = {
    val __obj = js.Dynamic.literal(enforce_admins = null, required_pull_request_reviews = null, required_status_checks = null, restrictions = null)
    __obj.asInstanceOf[Allowdeletions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Allowdeletions] (val x: Self) extends AnyVal {
    
    inline def setAllow_deletions(value: Boolean): Self = StObject.set(x, "allow_deletions", value.asInstanceOf[js.Any])
    
    inline def setAllow_deletionsUndefined: Self = StObject.set(x, "allow_deletions", js.undefined)
    
    inline def setAllow_force_pushes(value: Boolean): Self = StObject.set(x, "allow_force_pushes", value.asInstanceOf[js.Any])
    
    inline def setAllow_force_pushesNull: Self = StObject.set(x, "allow_force_pushes", null)
    
    inline def setAllow_force_pushesUndefined: Self = StObject.set(x, "allow_force_pushes", js.undefined)
    
    inline def setAllow_fork_syncing(value: Boolean): Self = StObject.set(x, "allow_fork_syncing", value.asInstanceOf[js.Any])
    
    inline def setAllow_fork_syncingUndefined: Self = StObject.set(x, "allow_fork_syncing", js.undefined)
    
    inline def setBlock_creations(value: Boolean): Self = StObject.set(x, "block_creations", value.asInstanceOf[js.Any])
    
    inline def setBlock_creationsUndefined: Self = StObject.set(x, "block_creations", js.undefined)
    
    inline def setEnforce_admins(value: Boolean): Self = StObject.set(x, "enforce_admins", value.asInstanceOf[js.Any])
    
    inline def setEnforce_adminsNull: Self = StObject.set(x, "enforce_admins", null)
    
    inline def setLock_branch(value: Boolean): Self = StObject.set(x, "lock_branch", value.asInstanceOf[js.Any])
    
    inline def setLock_branchUndefined: Self = StObject.set(x, "lock_branch", js.undefined)
    
    inline def setRequired_conversation_resolution(value: Boolean): Self = StObject.set(x, "required_conversation_resolution", value.asInstanceOf[js.Any])
    
    inline def setRequired_conversation_resolutionUndefined: Self = StObject.set(x, "required_conversation_resolution", js.undefined)
    
    inline def setRequired_linear_history(value: Boolean): Self = StObject.set(x, "required_linear_history", value.asInstanceOf[js.Any])
    
    inline def setRequired_linear_historyUndefined: Self = StObject.set(x, "required_linear_history", js.undefined)
    
    inline def setRequired_pull_request_reviews(value: Bypasspullrequestallowances): Self = StObject.set(x, "required_pull_request_reviews", value.asInstanceOf[js.Any])
    
    inline def setRequired_pull_request_reviewsNull: Self = StObject.set(x, "required_pull_request_reviews", null)
    
    inline def setRequired_status_checks(value: Checks): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksNull: Self = StObject.set(x, "required_status_checks", null)
    
    inline def setRestrictions(value: Teams): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsNull: Self = StObject.set(x, "restrictions", null)
  }
}
