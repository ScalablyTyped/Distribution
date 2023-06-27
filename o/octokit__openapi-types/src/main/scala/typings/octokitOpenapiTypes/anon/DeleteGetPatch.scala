package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGetPatch extends StObject {
  
  /**
    * Delete an organization
    * @description Deletes an organization and all its repositories.
    *
    * The organization login will be unavailable for 90 days after deletion.
    *
    * Please review the Terms of Service regarding account deletion before using this endpoint:
    *
    * https://docs.github.com/site-policy/github-terms/github-terms-of-service
    */
  var delete: Responses202403404
  
  /**
    * Get an organization
    * @description To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see 'Response with GitHub plan information' below."
    */
  var get: Responses200Content59
  
  /**
    * Update an organization
    * @description **Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).
    *
    * Enables an authenticated organization owner with the `admin:org` scope or the `repo` scope to update the organization's profile and member privileges.
    */
  var patch: Responses409
}
object DeleteGetPatch {
  
  inline def apply(delete: Responses202403404, get: Responses200Content59, patch: Responses409): DeleteGetPatch = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGetPatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGetPatch] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses202403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content59): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses409): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
