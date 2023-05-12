package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.everyone
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.non_admins
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adminenforced extends StObject {
  
  var admin_enforced: Boolean
  
  /** @enum {string} */
  var allow_deletions_enforcement_level: off | non_admins | everyone
  
  /** @enum {string} */
  var allow_force_pushes_enforcement_level: off | non_admins | everyone
  
  var authorized_actor_names: js.Array[String]
  
  var authorized_actors_only: Boolean
  
  var authorized_dismissal_actors_only: Boolean
  
  var create_protected: js.UndefOr[Boolean] = js.undefined
  
  /** Format: date-time */
  var created_at: String
  
  var dismiss_stale_reviews_on_push: Boolean
  
  var id: Double
  
  var ignore_approvals_from_contributors: Boolean
  
  /** @enum {string} */
  var linear_history_requirement_enforcement_level: off | non_admins | everyone
  
  /** @enum {string} */
  var merge_queue_enforcement_level: off | non_admins | everyone
  
  var name: String
  
  /** @enum {string} */
  var pull_request_reviews_enforcement_level: off | non_admins | everyone
  
  var repository_id: Double
  
  var require_code_owner_review: Boolean
  
  var required_approving_review_count: Double
  
  /** @enum {string} */
  var required_conversation_resolution_level: off | non_admins | everyone
  
  /** @enum {string} */
  var required_deployments_enforcement_level: off | non_admins | everyone
  
  var required_status_checks: js.Array[String]
  
  /** @enum {string} */
  var required_status_checks_enforcement_level: off | non_admins | everyone
  
  /** @enum {string} */
  var signature_requirement_enforcement_level: off | non_admins | everyone
  
  var strict_required_status_checks_policy: Boolean
  
  /** Format: date-time */
  var updated_at: String
}
object Adminenforced {
  
  inline def apply(
    admin_enforced: Boolean,
    allow_deletions_enforcement_level: off | non_admins | everyone,
    allow_force_pushes_enforcement_level: off | non_admins | everyone,
    authorized_actor_names: js.Array[String],
    authorized_actors_only: Boolean,
    authorized_dismissal_actors_only: Boolean,
    created_at: String,
    dismiss_stale_reviews_on_push: Boolean,
    id: Double,
    ignore_approvals_from_contributors: Boolean,
    linear_history_requirement_enforcement_level: off | non_admins | everyone,
    merge_queue_enforcement_level: off | non_admins | everyone,
    name: String,
    pull_request_reviews_enforcement_level: off | non_admins | everyone,
    repository_id: Double,
    require_code_owner_review: Boolean,
    required_approving_review_count: Double,
    required_conversation_resolution_level: off | non_admins | everyone,
    required_deployments_enforcement_level: off | non_admins | everyone,
    required_status_checks: js.Array[String],
    required_status_checks_enforcement_level: off | non_admins | everyone,
    signature_requirement_enforcement_level: off | non_admins | everyone,
    strict_required_status_checks_policy: Boolean,
    updated_at: String
  ): Adminenforced = {
    val __obj = js.Dynamic.literal(admin_enforced = admin_enforced.asInstanceOf[js.Any], allow_deletions_enforcement_level = allow_deletions_enforcement_level.asInstanceOf[js.Any], allow_force_pushes_enforcement_level = allow_force_pushes_enforcement_level.asInstanceOf[js.Any], authorized_actor_names = authorized_actor_names.asInstanceOf[js.Any], authorized_actors_only = authorized_actors_only.asInstanceOf[js.Any], authorized_dismissal_actors_only = authorized_dismissal_actors_only.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], dismiss_stale_reviews_on_push = dismiss_stale_reviews_on_push.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ignore_approvals_from_contributors = ignore_approvals_from_contributors.asInstanceOf[js.Any], linear_history_requirement_enforcement_level = linear_history_requirement_enforcement_level.asInstanceOf[js.Any], merge_queue_enforcement_level = merge_queue_enforcement_level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pull_request_reviews_enforcement_level = pull_request_reviews_enforcement_level.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any], require_code_owner_review = require_code_owner_review.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any], required_conversation_resolution_level = required_conversation_resolution_level.asInstanceOf[js.Any], required_deployments_enforcement_level = required_deployments_enforcement_level.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], required_status_checks_enforcement_level = required_status_checks_enforcement_level.asInstanceOf[js.Any], signature_requirement_enforcement_level = signature_requirement_enforcement_level.asInstanceOf[js.Any], strict_required_status_checks_policy = strict_required_status_checks_policy.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adminenforced]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Adminenforced] (val x: Self) extends AnyVal {
    
    inline def setAdmin_enforced(value: Boolean): Self = StObject.set(x, "admin_enforced", value.asInstanceOf[js.Any])
    
    inline def setAllow_deletions_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "allow_deletions_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setAllow_force_pushes_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "allow_force_pushes_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_actor_names(value: js.Array[String]): Self = StObject.set(x, "authorized_actor_names", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_actor_namesVarargs(value: String*): Self = StObject.set(x, "authorized_actor_names", js.Array(value*))
    
    inline def setAuthorized_actors_only(value: Boolean): Self = StObject.set(x, "authorized_actors_only", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_dismissal_actors_only(value: Boolean): Self = StObject.set(x, "authorized_dismissal_actors_only", value.asInstanceOf[js.Any])
    
    inline def setCreate_protected(value: Boolean): Self = StObject.set(x, "create_protected", value.asInstanceOf[js.Any])
    
    inline def setCreate_protectedUndefined: Self = StObject.set(x, "create_protected", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDismiss_stale_reviews_on_push(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews_on_push", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIgnore_approvals_from_contributors(value: Boolean): Self = StObject.set(x, "ignore_approvals_from_contributors", value.asInstanceOf[js.Any])
    
    inline def setLinear_history_requirement_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "linear_history_requirement_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setMerge_queue_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "merge_queue_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPull_request_reviews_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "pull_request_reviews_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRequire_code_owner_review(value: Boolean): Self = StObject.set(x, "require_code_owner_review", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_conversation_resolution_level(value: off | non_admins | everyone): Self = StObject.set(x, "required_conversation_resolution_level", value.asInstanceOf[js.Any])
    
    inline def setRequired_deployments_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "required_deployments_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checks(value: js.Array[String]): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksVarargs(value: String*): Self = StObject.set(x, "required_status_checks", js.Array(value*))
    
    inline def setRequired_status_checks_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "required_status_checks_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setSignature_requirement_enforcement_level(value: off | non_admins | everyone): Self = StObject.set(x, "signature_requirement_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setStrict_required_status_checks_policy(value: Boolean): Self = StObject.set(x, "strict_required_status_checks_policy", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
