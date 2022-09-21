package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSecurityManagerTeam extends StObject {
  
  /**
    * Adds a team as a security manager for an organization. For more information, see "[Managing security for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) for an organization."
    *
    * To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `write:org` scope.
    *
    * GitHub Apps must have the `administration` organization read-write permission to use this endpoint.
    */
  def addSecurityManagerTeam(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/security-managers/teams/{team_slug}']['response'] */ js.Any
  ]
  def addSecurityManagerTeam(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/security-managers/teams/{team_slug}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/security-managers/teams/{team_slug}']['response'] */ js.Any
  ]
  /**
    * Adds a team as a security manager for an organization. For more information, see "[Managing security for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) for an organization."
    *
    * To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `write:org` scope.
    *
    * GitHub Apps must have the `administration` organization read-write permission to use this endpoint.
    */
  @JSName("addSecurityManagerTeam")
  var addSecurityManagerTeam_Original: `367`
  
  def blockUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/blocks/{username}']['response'] */ js.Any
  ]
  def blockUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/blocks/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/blocks/{username}']['response'] */ js.Any
  ]
  @JSName("blockUser")
  var blockUser_Original: `368`
  
  /**
    * Cancel an organization invitation. In order to cancel an organization invitation, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications).
    */
  def cancelInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/invitations/{invitation_id}']['response'] */ js.Any
  ]
  def cancelInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/invitations/{invitation_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/invitations/{invitation_id}']['response'] */ js.Any
  ]
  /**
    * Cancel an organization invitation. In order to cancel an organization invitation, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications).
    */
  @JSName("cancelInvitation")
  var cancelInvitation_Original: `369`
  
  def checkBlockedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/blocks/{username}']['response'] */ js.Any
  ]
  def checkBlockedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/blocks/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/blocks/{username}']['response'] */ js.Any
  ]
  @JSName("checkBlockedUser")
  var checkBlockedUser_Original: `370`
  
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  def checkMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members/{username}']['response'] */ js.Any
  ]
  def checkMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members/{username}']['response'] */ js.Any
  ]
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  @JSName("checkMembershipForUser")
  var checkMembershipForUser_Original: `371`
  
  def checkPublicMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/public_members/{username}']['response'] */ js.Any
  ]
  def checkPublicMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/public_members/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/public_members/{username}']['response'] */ js.Any
  ]
  @JSName("checkPublicMembershipForUser")
  var checkPublicMembershipForUser_Original: `372`
  
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)". Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)."
    */
  def convertMemberToOutsideCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/outside_collaborators/{username}']['response'] */ js.Any
  ]
  def convertMemberToOutsideCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/outside_collaborators/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/outside_collaborators/{username}']['response'] */ js.Any
  ]
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)". Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/enterprise-cloud@latest/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)."
    */
  @JSName("convertMemberToOutsideCollaborator")
  var convertMemberToOutsideCollaborator_Original: `373`
  
  /**
    * **Note**: This operation is in beta and is subject to change.
    *
    * Creates a custom repository role that can be used by all repositories owned by the organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information on custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  def createCustomRole(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/custom_roles']['response'] */ js.Any
  ]
  def createCustomRole(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/custom_roles']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/custom_roles']['response'] */ js.Any
  ]
  /**
    * **Note**: This operation is in beta and is subject to change.
    *
    * Creates a custom repository role that can be used by all repositories owned by the organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information on custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  @JSName("createCustomRole")
  var createCustomRole_Original: `374`
  
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  def createInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/invitations']['response'] */ js.Any
  ]
  def createInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/invitations']['response'] */ js.Any
  ]
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.
    */
  @JSName("createInvitation")
  var createInvitation_Original: `375`
  
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  def createWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks']['response'] */ js.Any
  ]
  def createWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks']['response'] */ js.Any
  ]
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  @JSName("createWebhook")
  var createWebhook_Original: `376`
  
  /**
    * **Note**: This operation is in beta and is subject to change.
    *
    * Deletes a custom role from an organization. Once the custom role has been deleted, any
    * user, team, or invitation with the deleted custom role will be reassigned the inherited role.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information about custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  def deleteCustomRole(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/custom_roles/{role_id}']['response'] */ js.Any
  ]
  def deleteCustomRole(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/custom_roles/{role_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/custom_roles/{role_id}']['response'] */ js.Any
  ]
  /**
    * **Note**: This operation is in beta and is subject to change.
    *
    * Deletes a custom role from an organization. Once the custom role has been deleted, any
    * user, team, or invitation with the deleted custom role will be reassigned the inherited role.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information about custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  @JSName("deleteCustomRole")
  var deleteCustomRole_Original: `377`
  
  def deleteWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/hooks/{hook_id}']['response'] */ js.Any
  ]
  def deleteWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/hooks/{hook_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/hooks/{hook_id}']['response'] */ js.Any
  ]
  @JSName("deleteWebhook")
  var deleteWebhook_Original: `378`
  
  /**
    * Enables or disables the specified security feature for all repositories in an organization.
    *
    * To use this endpoint, you must be an organization owner or be member of a team with the security manager role.
    * A token with the 'write:org' scope is also required.
    *
    * GitHub Apps must have the `organization_administration:write` permission to use this endpoint.
    *
    * For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  def enableOrDisableSecurityProductOnAllOrgRepos(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/{security_product}/{enablement}']['response'] */ js.Any
  ]
  def enableOrDisableSecurityProductOnAllOrgRepos(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/{security_product}/{enablement}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/{security_product}/{enablement}']['response'] */ js.Any
  ]
  /**
    * Enables or disables the specified security feature for all repositories in an organization.
    *
    * To use this endpoint, you must be an organization owner or be member of a team with the security manager role.
    * A token with the 'write:org' scope is also required.
    *
    * GitHub Apps must have the `organization_administration:write` permission to use this endpoint.
    *
    * For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  @JSName("enableOrDisableSecurityProductOnAllOrgRepos")
  var enableOrDisableSecurityProductOnAllOrgRepos_Original: `379`
  
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see 'Response with GitHub plan information' below."
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}']['response'] */ js.Any
  ]
  
  def getMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs/{org}']['response'] */ js.Any
  ]
  def getMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs/{org}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs/{org}']['response'] */ js.Any
  ]
  @JSName("getMembershipForAuthenticatedUser")
  var getMembershipForAuthenticatedUser_Original: `381`
  
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member. The `state` parameter in the response can be used to identify the user's membership status.
    */
  def getMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/memberships/{username}']['response'] */ js.Any
  ]
  def getMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/memberships/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/memberships/{username}']['response'] */ js.Any
  ]
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member. The `state` parameter in the response can be used to identify the user's membership status.
    */
  @JSName("getMembershipForUser")
  var getMembershipForUser_Original: `382`
  
  /**
    * Returns a webhook configured in an organization. To get only the webhook `config` properties, see "[Get a webhook configuration for an organization](/rest/reference/orgs#get-a-webhook-configuration-for-an-organization)."
    */
  def getWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}']['response'] */ js.Any
  ]
  def getWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}']['response'] */ js.Any
  ]
  
  /**
    * Returns the webhook configuration for an organization. To get more information about the webhook, including the `active` state and `events`, use "[Get an organization webhook ](/rest/reference/orgs#get-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:read` permission.
    */
  def getWebhookConfigForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  def getWebhookConfigForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/config']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  /**
    * Returns the webhook configuration for an organization. To get more information about the webhook, including the `active` state and `events`, use "[Get an organization webhook ](/rest/reference/orgs#get-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:read` permission.
    */
  @JSName("getWebhookConfigForOrg")
  var getWebhookConfigForOrg_Original: `384`
  
  /**
    * Returns a delivery for a webhook configured in an organization.
    */
  def getWebhookDelivery(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}']['response'] */ js.Any
  ]
  def getWebhookDelivery(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}']['response'] */ js.Any
  ]
  /**
    * Returns a delivery for a webhook configured in an organization.
    */
  @JSName("getWebhookDelivery")
  var getWebhookDelivery_Original: `385`
  
  /**
    * Returns a webhook configured in an organization. To get only the webhook `config` properties, see "[Get a webhook configuration for an organization](/rest/reference/orgs#get-a-webhook-configuration-for-an-organization)."
    */
  @JSName("getWebhook")
  var getWebhook_Original: `383`
  
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see 'Response with GitHub plan information' below."
    */
  @JSName("get")
  var get_Original: `380`
  
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of organizations.
    */
  def list(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /organizations']['response'] */ js.Any
  ]
  def list(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /organizations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /organizations']['response'] */ js.Any
  ]
  
  /**
    * Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.
    */
  def listAppInstallations(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/installations']['response'] */ js.Any
  ]
  def listAppInstallations(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/installations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/installations']['response'] */ js.Any
  ]
  /**
    * Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.
    */
  @JSName("listAppInstallations")
  var listAppInstallations_Original: `387`
  
  /**
    * List the users blocked by an organization.
    */
  def listBlockedUsers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/blocks']['response'] */ js.Any
  ]
  def listBlockedUsers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/blocks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/blocks']['response'] */ js.Any
  ]
  /**
    * List the users blocked by an organization.
    */
  @JSName("listBlockedUsers")
  var listBlockedUsers_Original: `388`
  
  /**
    * List the custom repository roles available in this organization. In order to see custom
    * repository roles in an organization, the authenticated user must be an organization owner.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization or of an repository of the organizaiton and must use an access token with `admin:org repo` scope.
    * GitHub Apps must have the `organization_custom_roles:read` organization permission to use this endpoint.
    *
    * For more information on custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)".
    */
  def listCustomRoles(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /organizations/{organization_id}/custom_roles']['response'] */ js.Any
  ]
  def listCustomRoles(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /organizations/{organization_id}/custom_roles']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /organizations/{organization_id}/custom_roles']['response'] */ js.Any
  ]
  /**
    * List the custom repository roles available in this organization. In order to see custom
    * repository roles in an organization, the authenticated user must be an organization owner.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization or of an repository of the organizaiton and must use an access token with `admin:org repo` scope.
    * GitHub Apps must have the `organization_custom_roles:read` organization permission to use this endpoint.
    *
    * For more information on custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)".
    */
  @JSName("listCustomRoles")
  var listCustomRoles_Original: `389`
  
  /**
    * The return hash contains `failed_at` and `failed_reason` fields which represent the time at which the invitation failed and the reason for the failure.
    */
  def listFailedInvitations(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/failed_invitations']['response'] */ js.Any
  ]
  def listFailedInvitations(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/failed_invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/failed_invitations']['response'] */ js.Any
  ]
  /**
    * The return hash contains `failed_at` and `failed_reason` fields which represent the time at which the invitation failed and the reason for the failure.
    */
  @JSName("listFailedInvitations")
  var listFailedInvitations_Original: `390`
  
  /**
    * **Note**: This operation is in beta and subject to change.
    *
    * Lists the fine-grained permissions available for an organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization or of an repository of the organizaiton and must use an access token with `admin:org repo` scope.
    * GitHub Apps must have the `organization_custom_roles:read` organization permission to use this endpoint.
    */
  def listFineGrainedPermissions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/fine_grained_permissions']['response'] */ js.Any
  ]
  def listFineGrainedPermissions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/fine_grained_permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/fine_grained_permissions']['response'] */ js.Any
  ]
  /**
    * **Note**: This operation is in beta and subject to change.
    *
    * Lists the fine-grained permissions available for an organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization or of an repository of the organizaiton and must use an access token with `admin:org repo` scope.
    * GitHub Apps must have the `organization_custom_roles:read` organization permission to use this endpoint.
    */
  @JSName("listFineGrainedPermissions")
  var listFineGrainedPermissions_Original: `391`
  
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/orgs']['response'] */ js.Any
  ]
  def listForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/orgs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/orgs']['response'] */ js.Any
  ]
  /**
    * List organizations for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: `392`
  
  /**
    * List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user) API instead.
    */
  def listForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/orgs']['response'] */ js.Any
  ]
  def listForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/orgs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/orgs']['response'] */ js.Any
  ]
  /**
    * List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user) API instead.
    */
  @JSName("listForUser")
  var listForUser_Original: `393`
  
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  def listInvitationTeams(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/invitations/{invitation_id}/teams']['response'] */ js.Any
  ]
  def listInvitationTeams(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/invitations/{invitation_id}/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/invitations/{invitation_id}/teams']['response'] */ js.Any
  ]
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  @JSName("listInvitationTeams")
  var listInvitationTeams_Original: `394`
  
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  def listMembers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members']['response'] */ js.Any
  ]
  def listMembers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members']['response'] */ js.Any
  ]
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  @JSName("listMembers")
  var listMembers_Original: `395`
  
  def listMembershipsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs']['response'] */ js.Any
  ]
  def listMembershipsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs']['response'] */ js.Any
  ]
  @JSName("listMembershipsForAuthenticatedUser")
  var listMembershipsForAuthenticatedUser_Original: `396`
  
  /**
    * List all users who are outside collaborators of an organization.
    */
  def listOutsideCollaborators(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/outside_collaborators']['response'] */ js.Any
  ]
  def listOutsideCollaborators(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/outside_collaborators']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/outside_collaborators']['response'] */ js.Any
  ]
  /**
    * List all users who are outside collaborators of an organization.
    */
  @JSName("listOutsideCollaborators")
  var listOutsideCollaborators_Original: `397`
  
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  def listPendingInvitations(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/invitations']['response'] */ js.Any
  ]
  def listPendingInvitations(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/invitations']['response'] */ js.Any
  ]
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  @JSName("listPendingInvitations")
  var listPendingInvitations_Original: `398`
  
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  def listPublicMembers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/public_members']['response'] */ js.Any
  ]
  def listPublicMembers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/public_members']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/public_members']['response'] */ js.Any
  ]
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  @JSName("listPublicMembers")
  var listPublicMembers_Original: `399`
  
  /**
    * Lists teams that are security managers for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `read:org` scope.
    *
    * GitHub Apps must have the `administration` organization read permission to use this endpoint.
    */
  def listSecurityManagerTeams(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/security-managers']['response'] */ js.Any
  ]
  def listSecurityManagerTeams(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/security-managers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/security-managers']['response'] */ js.Any
  ]
  /**
    * Lists teams that are security managers for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `read:org` scope.
    *
    * GitHub Apps must have the `administration` organization read permission to use this endpoint.
    */
  @JSName("listSecurityManagerTeams")
  var listSecurityManagerTeams_Original: `400`
  
  /**
    * Returns a list of webhook deliveries for a webhook configured in an organization.
    */
  def listWebhookDeliveries(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/deliveries']['response'] */ js.Any
  ]
  def listWebhookDeliveries(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/deliveries']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks/{hook_id}/deliveries']['response'] */ js.Any
  ]
  /**
    * Returns a list of webhook deliveries for a webhook configured in an organization.
    */
  @JSName("listWebhookDeliveries")
  var listWebhookDeliveries_Original: `401`
  
  def listWebhooks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks']['response'] */ js.Any
  ]
  def listWebhooks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/hooks']['response'] */ js.Any
  ]
  @JSName("listWebhooks")
  var listWebhooks_Original: `402`
  
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of organizations.
    */
  @JSName("list")
  var list_Original: `386`
  
  /**
    * This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks/{hook_id}/pings']['response'] */ js.Any
  ]
  def pingWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks/{hook_id}/pings']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks/{hook_id}/pings']['response'] */ js.Any
  ]
  /**
    * This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingWebhook")
  var pingWebhook_Original: `403`
  
  /**
    * Redeliver a delivery for a webhook configured in an organization.
    */
  def redeliverWebhookDelivery(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}/attempts']['response'] */ js.Any
  ]
  def redeliverWebhookDelivery(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}/attempts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}/attempts']['response'] */ js.Any
  ]
  /**
    * Redeliver a delivery for a webhook configured in an organization.
    */
  @JSName("redeliverWebhookDelivery")
  var redeliverWebhookDelivery_Original: `404`
  
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  def removeMember(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/members/{username}']['response'] */ js.Any
  ]
  def removeMember(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/members/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/members/{username}']['response'] */ js.Any
  ]
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  @JSName("removeMember")
  var removeMember_Original: `405`
  
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  def removeMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/memberships/{username}']['response'] */ js.Any
  ]
  def removeMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/memberships/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/memberships/{username}']['response'] */ js.Any
  ]
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  @JSName("removeMembershipForUser")
  var removeMembershipForUser_Original: `406`
  
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  def removeOutsideCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/outside_collaborators/{username}']['response'] */ js.Any
  ]
  def removeOutsideCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/outside_collaborators/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/outside_collaborators/{username}']['response'] */ js.Any
  ]
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  @JSName("removeOutsideCollaborator")
  var removeOutsideCollaborator_Original: `407`
  
  def removePublicMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/public_members/{username}']['response'] */ js.Any
  ]
  def removePublicMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/public_members/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/public_members/{username}']['response'] */ js.Any
  ]
  @JSName("removePublicMembershipForAuthenticatedUser")
  var removePublicMembershipForAuthenticatedUser_Original: `408`
  
  /**
    * Removes the security manager role from a team for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) team from an organization."
    *
    * To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `admin:org` scope.
    *
    * GitHub Apps must have the `administration` organization read-write permission to use this endpoint.
    */
  def removeSecurityManagerTeam(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/security-managers/teams/{team_slug}']['response'] */ js.Any
  ]
  def removeSecurityManagerTeam(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/security-managers/teams/{team_slug}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/security-managers/teams/{team_slug}']['response'] */ js.Any
  ]
  /**
    * Removes the security manager role from a team for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) team from an organization."
    *
    * To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `admin:org` scope.
    *
    * GitHub Apps must have the `administration` organization read-write permission to use this endpoint.
    */
  @JSName("removeSecurityManagerTeam")
  var removeSecurityManagerTeam_Original: `409`
  
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://docs.github.com/rest/reference/orgs#get-organization-membership-for-a-user) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  def setMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/memberships/{username}']['response'] */ js.Any
  ]
  def setMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/memberships/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/memberships/{username}']['response'] */ js.Any
  ]
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://docs.github.com/rest/reference/orgs#get-organization-membership-for-a-user) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  @JSName("setMembershipForUser")
  var setMembershipForUser_Original: `410`
  
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  def setPublicMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/public_members/{username}']['response'] */ js.Any
  ]
  def setPublicMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/public_members/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/public_members/{username}']['response'] */ js.Any
  ]
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  @JSName("setPublicMembershipForAuthenticatedUser")
  var setPublicMembershipForAuthenticatedUser_Original: `411`
  
  def unblockUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/blocks/{username}']['response'] */ js.Any
  ]
  def unblockUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/blocks/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/blocks/{username}']['response'] */ js.Any
  ]
  @JSName("unblockUser")
  var unblockUser_Original: `412`
  
  /**
    * **Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).
    *
    * Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}']['response'] */ js.Any
  ]
  
  /**
    * **Note**: This operation is in beta and subject to change.
    *
    * Updates a custom repository role that can be used by all repositories owned by the organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information about custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  def updateCustomRole(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/custom_roles/{role_id}']['response'] */ js.Any
  ]
  def updateCustomRole(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/custom_roles/{role_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/custom_roles/{role_id}']['response'] */ js.Any
  ]
  /**
    * **Note**: This operation is in beta and subject to change.
    *
    * Updates a custom repository role that can be used by all repositories owned by the organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information about custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  @JSName("updateCustomRole")
  var updateCustomRole_Original: `414`
  
  def updateMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/memberships/orgs/{org}']['response'] */ js.Any
  ]
  def updateMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/memberships/orgs/{org}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/memberships/orgs/{org}']['response'] */ js.Any
  ]
  @JSName("updateMembershipForAuthenticatedUser")
  var updateMembershipForAuthenticatedUser_Original: `415`
  
  /**
    * Updates a webhook configured in an organization. When you update a webhook, the `secret` will be overwritten. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for an organization](/rest/reference/orgs#update-a-webhook-configuration-for-an-organization)."
    */
  def updateWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/hooks/{hook_id}']['response'] */ js.Any
  ]
  def updateWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/hooks/{hook_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/hooks/{hook_id}']['response'] */ js.Any
  ]
  
  /**
    * Updates the webhook configuration for an organization. To update more information about the webhook, including the `active` state and `events`, use "[Update an organization webhook ](/rest/reference/orgs#update-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:write` permission.
    */
  def updateWebhookConfigForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  def updateWebhookConfigForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/hooks/{hook_id}/config']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/hooks/{hook_id}/config']['response'] */ js.Any
  ]
  /**
    * Updates the webhook configuration for an organization. To update more information about the webhook, including the `active` state and `events`, use "[Update an organization webhook ](/rest/reference/orgs#update-an-organization-webhook)."
    *
    * Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:write` permission.
    */
  @JSName("updateWebhookConfigForOrg")
  var updateWebhookConfigForOrg_Original: `417`
  
  /**
    * Updates a webhook configured in an organization. When you update a webhook, the `secret` will be overwritten. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for an organization](/rest/reference/orgs#update-a-webhook-configuration-for-an-organization)."
    */
  @JSName("updateWebhook")
  var updateWebhook_Original: `416`
  
  /**
    * **Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).
    *
    * Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.
    */
  @JSName("update")
  var update_Original: `413`
}
object AddSecurityManagerTeam {
  
  inline def apply(
    addSecurityManagerTeam: `367`,
    blockUser: `368`,
    cancelInvitation: `369`,
    checkBlockedUser: `370`,
    checkMembershipForUser: `371`,
    checkPublicMembershipForUser: `372`,
    convertMemberToOutsideCollaborator: `373`,
    createCustomRole: `374`,
    createInvitation: `375`,
    createWebhook: `376`,
    deleteCustomRole: `377`,
    deleteWebhook: `378`,
    enableOrDisableSecurityProductOnAllOrgRepos: `379`,
    get: `380`,
    getMembershipForAuthenticatedUser: `381`,
    getMembershipForUser: `382`,
    getWebhook: `383`,
    getWebhookConfigForOrg: `384`,
    getWebhookDelivery: `385`,
    list: `386`,
    listAppInstallations: `387`,
    listBlockedUsers: `388`,
    listCustomRoles: `389`,
    listFailedInvitations: `390`,
    listFineGrainedPermissions: `391`,
    listForAuthenticatedUser: `392`,
    listForUser: `393`,
    listInvitationTeams: `394`,
    listMembers: `395`,
    listMembershipsForAuthenticatedUser: `396`,
    listOutsideCollaborators: `397`,
    listPendingInvitations: `398`,
    listPublicMembers: `399`,
    listSecurityManagerTeams: `400`,
    listWebhookDeliveries: `401`,
    listWebhooks: `402`,
    pingWebhook: `403`,
    redeliverWebhookDelivery: `404`,
    removeMember: `405`,
    removeMembershipForUser: `406`,
    removeOutsideCollaborator: `407`,
    removePublicMembershipForAuthenticatedUser: `408`,
    removeSecurityManagerTeam: `409`,
    setMembershipForUser: `410`,
    setPublicMembershipForAuthenticatedUser: `411`,
    unblockUser: `412`,
    update: `413`,
    updateCustomRole: `414`,
    updateMembershipForAuthenticatedUser: `415`,
    updateWebhook: `416`,
    updateWebhookConfigForOrg: `417`
  ): AddSecurityManagerTeam = {
    val __obj = js.Dynamic.literal(addSecurityManagerTeam = addSecurityManagerTeam.asInstanceOf[js.Any], blockUser = blockUser.asInstanceOf[js.Any], cancelInvitation = cancelInvitation.asInstanceOf[js.Any], checkBlockedUser = checkBlockedUser.asInstanceOf[js.Any], checkMembershipForUser = checkMembershipForUser.asInstanceOf[js.Any], checkPublicMembershipForUser = checkPublicMembershipForUser.asInstanceOf[js.Any], convertMemberToOutsideCollaborator = convertMemberToOutsideCollaborator.asInstanceOf[js.Any], createCustomRole = createCustomRole.asInstanceOf[js.Any], createInvitation = createInvitation.asInstanceOf[js.Any], createWebhook = createWebhook.asInstanceOf[js.Any], deleteCustomRole = deleteCustomRole.asInstanceOf[js.Any], deleteWebhook = deleteWebhook.asInstanceOf[js.Any], enableOrDisableSecurityProductOnAllOrgRepos = enableOrDisableSecurityProductOnAllOrgRepos.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getMembershipForAuthenticatedUser = getMembershipForAuthenticatedUser.asInstanceOf[js.Any], getMembershipForUser = getMembershipForUser.asInstanceOf[js.Any], getWebhook = getWebhook.asInstanceOf[js.Any], getWebhookConfigForOrg = getWebhookConfigForOrg.asInstanceOf[js.Any], getWebhookDelivery = getWebhookDelivery.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAppInstallations = listAppInstallations.asInstanceOf[js.Any], listBlockedUsers = listBlockedUsers.asInstanceOf[js.Any], listCustomRoles = listCustomRoles.asInstanceOf[js.Any], listFailedInvitations = listFailedInvitations.asInstanceOf[js.Any], listFineGrainedPermissions = listFineGrainedPermissions.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listInvitationTeams = listInvitationTeams.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMembershipsForAuthenticatedUser = listMembershipsForAuthenticatedUser.asInstanceOf[js.Any], listOutsideCollaborators = listOutsideCollaborators.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPublicMembers = listPublicMembers.asInstanceOf[js.Any], listSecurityManagerTeams = listSecurityManagerTeams.asInstanceOf[js.Any], listWebhookDeliveries = listWebhookDeliveries.asInstanceOf[js.Any], listWebhooks = listWebhooks.asInstanceOf[js.Any], pingWebhook = pingWebhook.asInstanceOf[js.Any], redeliverWebhookDelivery = redeliverWebhookDelivery.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMembershipForUser = removeMembershipForUser.asInstanceOf[js.Any], removeOutsideCollaborator = removeOutsideCollaborator.asInstanceOf[js.Any], removePublicMembershipForAuthenticatedUser = removePublicMembershipForAuthenticatedUser.asInstanceOf[js.Any], removeSecurityManagerTeam = removeSecurityManagerTeam.asInstanceOf[js.Any], setMembershipForUser = setMembershipForUser.asInstanceOf[js.Any], setPublicMembershipForAuthenticatedUser = setPublicMembershipForAuthenticatedUser.asInstanceOf[js.Any], unblockUser = unblockUser.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateCustomRole = updateCustomRole.asInstanceOf[js.Any], updateMembershipForAuthenticatedUser = updateMembershipForAuthenticatedUser.asInstanceOf[js.Any], updateWebhook = updateWebhook.asInstanceOf[js.Any], updateWebhookConfigForOrg = updateWebhookConfigForOrg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSecurityManagerTeam]
  }
  
  extension [Self <: AddSecurityManagerTeam](x: Self) {
    
    inline def setAddSecurityManagerTeam(value: `367`): Self = StObject.set(x, "addSecurityManagerTeam", value.asInstanceOf[js.Any])
    
    inline def setBlockUser(value: `368`): Self = StObject.set(x, "blockUser", value.asInstanceOf[js.Any])
    
    inline def setCancelInvitation(value: `369`): Self = StObject.set(x, "cancelInvitation", value.asInstanceOf[js.Any])
    
    inline def setCheckBlockedUser(value: `370`): Self = StObject.set(x, "checkBlockedUser", value.asInstanceOf[js.Any])
    
    inline def setCheckMembershipForUser(value: `371`): Self = StObject.set(x, "checkMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setCheckPublicMembershipForUser(value: `372`): Self = StObject.set(x, "checkPublicMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setConvertMemberToOutsideCollaborator(value: `373`): Self = StObject.set(x, "convertMemberToOutsideCollaborator", value.asInstanceOf[js.Any])
    
    inline def setCreateCustomRole(value: `374`): Self = StObject.set(x, "createCustomRole", value.asInstanceOf[js.Any])
    
    inline def setCreateInvitation(value: `375`): Self = StObject.set(x, "createInvitation", value.asInstanceOf[js.Any])
    
    inline def setCreateWebhook(value: `376`): Self = StObject.set(x, "createWebhook", value.asInstanceOf[js.Any])
    
    inline def setDeleteCustomRole(value: `377`): Self = StObject.set(x, "deleteCustomRole", value.asInstanceOf[js.Any])
    
    inline def setDeleteWebhook(value: `378`): Self = StObject.set(x, "deleteWebhook", value.asInstanceOf[js.Any])
    
    inline def setEnableOrDisableSecurityProductOnAllOrgRepos(value: `379`): Self = StObject.set(x, "enableOrDisableSecurityProductOnAllOrgRepos", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `380`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetMembershipForAuthenticatedUser(value: `381`): Self = StObject.set(x, "getMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetMembershipForUser(value: `382`): Self = StObject.set(x, "getMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setGetWebhook(value: `383`): Self = StObject.set(x, "getWebhook", value.asInstanceOf[js.Any])
    
    inline def setGetWebhookConfigForOrg(value: `384`): Self = StObject.set(x, "getWebhookConfigForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetWebhookDelivery(value: `385`): Self = StObject.set(x, "getWebhookDelivery", value.asInstanceOf[js.Any])
    
    inline def setList(value: `386`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListAppInstallations(value: `387`): Self = StObject.set(x, "listAppInstallations", value.asInstanceOf[js.Any])
    
    inline def setListBlockedUsers(value: `388`): Self = StObject.set(x, "listBlockedUsers", value.asInstanceOf[js.Any])
    
    inline def setListCustomRoles(value: `389`): Self = StObject.set(x, "listCustomRoles", value.asInstanceOf[js.Any])
    
    inline def setListFailedInvitations(value: `390`): Self = StObject.set(x, "listFailedInvitations", value.asInstanceOf[js.Any])
    
    inline def setListFineGrainedPermissions(value: `391`): Self = StObject.set(x, "listFineGrainedPermissions", value.asInstanceOf[js.Any])
    
    inline def setListForAuthenticatedUser(value: `392`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListForUser(value: `393`): Self = StObject.set(x, "listForUser", value.asInstanceOf[js.Any])
    
    inline def setListInvitationTeams(value: `394`): Self = StObject.set(x, "listInvitationTeams", value.asInstanceOf[js.Any])
    
    inline def setListMembers(value: `395`): Self = StObject.set(x, "listMembers", value.asInstanceOf[js.Any])
    
    inline def setListMembershipsForAuthenticatedUser(value: `396`): Self = StObject.set(x, "listMembershipsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListOutsideCollaborators(value: `397`): Self = StObject.set(x, "listOutsideCollaborators", value.asInstanceOf[js.Any])
    
    inline def setListPendingInvitations(value: `398`): Self = StObject.set(x, "listPendingInvitations", value.asInstanceOf[js.Any])
    
    inline def setListPublicMembers(value: `399`): Self = StObject.set(x, "listPublicMembers", value.asInstanceOf[js.Any])
    
    inline def setListSecurityManagerTeams(value: `400`): Self = StObject.set(x, "listSecurityManagerTeams", value.asInstanceOf[js.Any])
    
    inline def setListWebhookDeliveries(value: `401`): Self = StObject.set(x, "listWebhookDeliveries", value.asInstanceOf[js.Any])
    
    inline def setListWebhooks(value: `402`): Self = StObject.set(x, "listWebhooks", value.asInstanceOf[js.Any])
    
    inline def setPingWebhook(value: `403`): Self = StObject.set(x, "pingWebhook", value.asInstanceOf[js.Any])
    
    inline def setRedeliverWebhookDelivery(value: `404`): Self = StObject.set(x, "redeliverWebhookDelivery", value.asInstanceOf[js.Any])
    
    inline def setRemoveMember(value: `405`): Self = StObject.set(x, "removeMember", value.asInstanceOf[js.Any])
    
    inline def setRemoveMembershipForUser(value: `406`): Self = StObject.set(x, "removeMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setRemoveOutsideCollaborator(value: `407`): Self = StObject.set(x, "removeOutsideCollaborator", value.asInstanceOf[js.Any])
    
    inline def setRemovePublicMembershipForAuthenticatedUser(value: `408`): Self = StObject.set(x, "removePublicMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRemoveSecurityManagerTeam(value: `409`): Self = StObject.set(x, "removeSecurityManagerTeam", value.asInstanceOf[js.Any])
    
    inline def setSetMembershipForUser(value: `410`): Self = StObject.set(x, "setMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setSetPublicMembershipForAuthenticatedUser(value: `411`): Self = StObject.set(x, "setPublicMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setUnblockUser(value: `412`): Self = StObject.set(x, "unblockUser", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `413`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateCustomRole(value: `414`): Self = StObject.set(x, "updateCustomRole", value.asInstanceOf[js.Any])
    
    inline def setUpdateMembershipForAuthenticatedUser(value: `415`): Self = StObject.set(x, "updateMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setUpdateWebhook(value: `416`): Self = StObject.set(x, "updateWebhook", value.asInstanceOf[js.Any])
    
    inline def setUpdateWebhookConfigForOrg(value: `417`): Self = StObject.set(x, "updateWebhookConfigForOrg", value.asInstanceOf[js.Any])
  }
}
