package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses247 extends StObject {
  
  /**
    * Remove a repository collaborator
    * @description Removes a collaborator from a repository.
    *
    * To use this endpoint, the authenticated user must either be an administrator of the repository or target themselves for removal.
    *
    * This endpoint also:
    * - Cancels any outstanding invitations
    * - Unasigns the user from any issues
    * - Removes access to organization projects if the user is not an organization member and is not a collaborator on any other organization repositories.
    * - Unstars the repository
    * - Updates access permissions to packages
    *
    * Removing a user as a collaborator has the following effects on forks:
    *  - If the user had access to a fork through their membership to this repository, the user will also be removed from the fork.
    *  - If the user had their own fork of the repository, the fork will be deleted.
    *  - If the user still has read access to the repository, open pull requests by this user from a fork will be denied.
    *
    * **Note**: A user can still have access to the repository through organization permissions like base repository permissions.
    *
    * Although the API responds immediately, the additional permission updates might take some extra time to complete in the background.
    *
    * For more information on fork permissions, see "[About permissions and visibility of forks](https://docs.github.com/pull-requests/collaborating-with-pull-requests/working-with-forks/about-permissions-and-visibility-of-forks)".
    */
  var delete: Responses247
  
  /**
    * Check if a user is a repository collaborator
    * @description For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  var get: ParametersPathRepoUsername
  
  /**
    * Add a repository collaborator
    * @description This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    *
    * Adding an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)."
    *
    * For more information on permission levels, see "[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)". There are restrictions on which permissions can be granted to organization members when an organization base role is in place. In this case, the permission being given must be equal to or higher than the org base permission. Otherwise, the request will fail with:
    *
    * ```
    * Cannot assign {member} permission of {role name}
    * ```
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://docs.github.com/rest/reference/repos#invitations).
    *
    * **Updating an existing collaborator's permission level**
    *
    * The endpoint can also be used to change the permissions of an existing collaborator without first removing and re-adding the collaborator. To change the permissions, use the same endpoint and pass a different `permission` parameter. The response will be a `204`, with no other indication that the permission level changed.
    *
    * **Rate limits**
    *
    * You are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  var put: Responses201Content246
}
object DeleteResponses247 {
  
  inline def apply(delete: Responses247, get: ParametersPathRepoUsername, put: Responses201Content246): DeleteResponses247 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses247]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses247] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses247): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRepoUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses201Content246): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
