package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockUser extends StObject {
  
  def blockUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/blocks/:username']['response'] */ js.Any
  ]
  def blockUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/blocks/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/blocks/:username']['response'] */ js.Any
  ]
  @JSName("blockUser")
  var blockUser_Original: `232`
  
  def checkBlockedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/blocks/:username']['response'] */ js.Any
  ]
  def checkBlockedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/blocks/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/blocks/:username']['response'] */ js.Any
  ]
  @JSName("checkBlockedUser")
  var checkBlockedUser_Original: `233`
  
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  def checkMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/members/:username']['response'] */ js.Any
  ]
  def checkMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/members/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/members/:username']['response'] */ js.Any
  ]
  /**
    * Check if a user is, publicly or privately, a member of the organization.
    */
  @JSName("checkMembershipForUser")
  var checkMembershipForUser_Original: `234`
  
  def checkPublicMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/public_members/:username']['response'] */ js.Any
  ]
  def checkPublicMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/public_members/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/public_members/:username']['response'] */ js.Any
  ]
  @JSName("checkPublicMembershipForUser")
  var checkPublicMembershipForUser_Original: `235`
  
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)".
    */
  def convertMemberToOutsideCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/outside_collaborators/:username']['response'] */ js.Any
  ]
  def convertMemberToOutsideCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/outside_collaborators/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/outside_collaborators/:username']['response'] */ js.Any
  ]
  /**
    * When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)".
    */
  @JSName("convertMemberToOutsideCollaborator")
  var convertMemberToOutsideCollaborator_Original: `236`
  
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createInvitation(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/invitations']['response'] */ js.Any
  ]
  def createInvitation(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/invitations']['response'] */ js.Any
  ]
  /**
    * Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createInvitation")
  var createInvitation_Original: `237`
  
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  def createWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/hooks']['response'] */ js.Any
  ]
  def createWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/hooks']['response'] */ js.Any
  ]
  /**
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  @JSName("createWebhook")
  var createWebhook_Original: `238`
  
  def deleteWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/hooks/:hook_id']['response'] */ js.Any
  ]
  def deleteWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/hooks/:hook_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/hooks/:hook_id']['response'] */ js.Any
  ]
  @JSName("deleteWebhook")
  var deleteWebhook_Original: `239`
  
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/orgs/#response-with-github-plan-information)."
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org']['response'] */ js.Any
  ]
  
  def getMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs/:org']['response'] */ js.Any
  ]
  def getMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs/:org']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/memberships/orgs/:org']['response'] */ js.Any
  ]
  @JSName("getMembershipForAuthenticatedUser")
  var getMembershipForAuthenticatedUser_Original: `241`
  
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  def getMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/memberships/:username']['response'] */ js.Any
  ]
  def getMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/memberships/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/memberships/:username']['response'] */ js.Any
  ]
  /**
    * In order to get a user's membership with an organization, the authenticated user must be an organization member.
    */
  @JSName("getMembershipForUser")
  var getMembershipForUser_Original: `242`
  
  def getWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/hooks/:hook_id']['response'] */ js.Any
  ]
  def getWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/hooks/:hook_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/hooks/:hook_id']['response'] */ js.Any
  ]
  @JSName("getWebhook")
  var getWebhook_Original: `243`
  
  /**
    * To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).
    *
    * GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see "[Response with GitHub plan information](https://developer.github.com/v3/orgs/#response-with-github-plan-information)."
    */
  @JSName("get")
  var get_Original: `240`
  
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of organizations.
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/installations']['response'] */ js.Any
  ]
  def listAppInstallations(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/installations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/installations']['response'] */ js.Any
  ]
  /**
    * Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.
    */
  @JSName("listAppInstallations")
  var listAppInstallations_Original: `245`
  
  /**
    * List the users blocked by an organization.
    */
  def listBlockedUsers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/blocks']['response'] */ js.Any
  ]
  def listBlockedUsers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/blocks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/blocks']['response'] */ js.Any
  ]
  /**
    * List the users blocked by an organization.
    */
  @JSName("listBlockedUsers")
  var listBlockedUsers_Original: `246`
  
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
  var listForAuthenticatedUser_Original: `247`
  
  /**
    * List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://developer.github.com/v3/orgs/#list-organizations-for-the-authenticated-user) API instead.
    */
  def listForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/orgs']['response'] */ js.Any
  ]
  def listForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/orgs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/:username/orgs']['response'] */ js.Any
  ]
  /**
    * List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.
    *
    * This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://developer.github.com/v3/orgs/#list-organizations-for-the-authenticated-user) API instead.
    */
  @JSName("listForUser")
  var listForUser_Original: `248`
  
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  def listInvitationTeams(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/invitations/:invitation_id/teams']['response'] */ js.Any
  ]
  def listInvitationTeams(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/invitations/:invitation_id/teams']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/invitations/:invitation_id/teams']['response'] */ js.Any
  ]
  /**
    * List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.
    */
  @JSName("listInvitationTeams")
  var listInvitationTeams_Original: `249`
  
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  def listMembers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/members']['response'] */ js.Any
  ]
  def listMembers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/members']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/members']['response'] */ js.Any
  ]
  /**
    * List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  @JSName("listMembers")
  var listMembers_Original: `250`
  
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
  var listMembershipsForAuthenticatedUser_Original: `251`
  
  /**
    * List all users who are outside collaborators of an organization.
    */
  def listOutsideCollaborators(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/outside_collaborators']['response'] */ js.Any
  ]
  def listOutsideCollaborators(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/outside_collaborators']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/outside_collaborators']['response'] */ js.Any
  ]
  /**
    * List all users who are outside collaborators of an organization.
    */
  @JSName("listOutsideCollaborators")
  var listOutsideCollaborators_Original: `252`
  
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  def listPendingInvitations(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/invitations']['response'] */ js.Any
  ]
  def listPendingInvitations(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/invitations']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/invitations']['response'] */ js.Any
  ]
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    */
  @JSName("listPendingInvitations")
  var listPendingInvitations_Original: `253`
  
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  def listPublicMembers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/public_members']['response'] */ js.Any
  ]
  def listPublicMembers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/public_members']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/public_members']['response'] */ js.Any
  ]
  /**
    * Members of an organization can choose to have their membership publicized or not.
    */
  @JSName("listPublicMembers")
  var listPublicMembers_Original: `254`
  
  def listWebhooks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/hooks']['response'] */ js.Any
  ]
  def listWebhooks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/hooks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/hooks']['response'] */ js.Any
  ]
  @JSName("listWebhooks")
  var listWebhooks_Original: `255`
  
  /**
    * Lists all organizations, in the order that they were created on GitHub.
    *
    * **Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of organizations.
    */
  @JSName("list")
  var list_Original: `244`
  
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/hooks/:hook_id/pings']['response'] */ js.Any
  ]
  def pingWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/hooks/:hook_id/pings']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/hooks/:hook_id/pings']['response'] */ js.Any
  ]
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingWebhook")
  var pingWebhook_Original: `256`
  
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  def removeMember(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/members/:username']['response'] */ js.Any
  ]
  def removeMember(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/members/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/members/:username']['response'] */ js.Any
  ]
  /**
    * Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.
    */
  @JSName("removeMember")
  var removeMember_Original: `257`
  
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  def removeMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/memberships/:username']['response'] */ js.Any
  ]
  def removeMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/memberships/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/memberships/:username']['response'] */ js.Any
  ]
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  @JSName("removeMembershipForUser")
  var removeMembershipForUser_Original: `258`
  
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  def removeOutsideCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/outside_collaborators/:username']['response'] */ js.Any
  ]
  def removeOutsideCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/outside_collaborators/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/outside_collaborators/:username']['response'] */ js.Any
  ]
  /**
    * Removing a user from this list will remove them from all the organization's repositories.
    */
  @JSName("removeOutsideCollaborator")
  var removeOutsideCollaborator_Original: `259`
  
  def removePublicMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/public_members/:username']['response'] */ js.Any
  ]
  def removePublicMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/public_members/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/public_members/:username']['response'] */ js.Any
  ]
  @JSName("removePublicMembershipForAuthenticatedUser")
  var removePublicMembershipForAuthenticatedUser_Original: `260`
  
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://developer.github.com/v3/orgs/members/#get-organization-membership-for-a-user) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  def setMembershipForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/memberships/:username']['response'] */ js.Any
  ]
  def setMembershipForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/memberships/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/memberships/:username']['response'] */ js.Any
  ]
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://developer.github.com/v3/orgs/members/#get-organization-membership-for-a-user) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  @JSName("setMembershipForUser")
  var setMembershipForUser_Original: `261`
  
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def setPublicMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/public_members/:username']['response'] */ js.Any
  ]
  def setPublicMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/public_members/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/public_members/:username']['response'] */ js.Any
  ]
  /**
    * The user can publicize their own membership. (A user cannot publicize the membership for another user.)
    *
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("setPublicMembershipForAuthenticatedUser")
  var setPublicMembershipForAuthenticatedUser_Original: `262`
  
  def unblockUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/blocks/:username']['response'] */ js.Any
  ]
  def unblockUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/blocks/:username']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/blocks/:username']['response'] */ js.Any
  ]
  @JSName("unblockUser")
  var unblockUser_Original: `263`
  
  /**
    * **Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).
    *
    * Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/:org']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/:org']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/:org']['response'] */ js.Any
  ]
  
  def updateMembershipForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/memberships/orgs/:org']['response'] */ js.Any
  ]
  def updateMembershipForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/memberships/orgs/:org']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/memberships/orgs/:org']['response'] */ js.Any
  ]
  @JSName("updateMembershipForAuthenticatedUser")
  var updateMembershipForAuthenticatedUser_Original: `265`
  
  def updateWebhook(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/:org/hooks/:hook_id']['response'] */ js.Any
  ]
  def updateWebhook(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/:org/hooks/:hook_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/:org/hooks/:hook_id']['response'] */ js.Any
  ]
  @JSName("updateWebhook")
  var updateWebhook_Original: `266`
  
  /**
    * **Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).
    *
    * Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.
    */
  @JSName("update")
  var update_Original: `264`
}
object BlockUser {
  
  inline def apply(
    blockUser: `232`,
    checkBlockedUser: `233`,
    checkMembershipForUser: `234`,
    checkPublicMembershipForUser: `235`,
    convertMemberToOutsideCollaborator: `236`,
    createInvitation: `237`,
    createWebhook: `238`,
    deleteWebhook: `239`,
    get: `240`,
    getMembershipForAuthenticatedUser: `241`,
    getMembershipForUser: `242`,
    getWebhook: `243`,
    list: `244`,
    listAppInstallations: `245`,
    listBlockedUsers: `246`,
    listForAuthenticatedUser: `247`,
    listForUser: `248`,
    listInvitationTeams: `249`,
    listMembers: `250`,
    listMembershipsForAuthenticatedUser: `251`,
    listOutsideCollaborators: `252`,
    listPendingInvitations: `253`,
    listPublicMembers: `254`,
    listWebhooks: `255`,
    pingWebhook: `256`,
    removeMember: `257`,
    removeMembershipForUser: `258`,
    removeOutsideCollaborator: `259`,
    removePublicMembershipForAuthenticatedUser: `260`,
    setMembershipForUser: `261`,
    setPublicMembershipForAuthenticatedUser: `262`,
    unblockUser: `263`,
    update: `264`,
    updateMembershipForAuthenticatedUser: `265`,
    updateWebhook: `266`
  ): BlockUser = {
    val __obj = js.Dynamic.literal(blockUser = blockUser.asInstanceOf[js.Any], checkBlockedUser = checkBlockedUser.asInstanceOf[js.Any], checkMembershipForUser = checkMembershipForUser.asInstanceOf[js.Any], checkPublicMembershipForUser = checkPublicMembershipForUser.asInstanceOf[js.Any], convertMemberToOutsideCollaborator = convertMemberToOutsideCollaborator.asInstanceOf[js.Any], createInvitation = createInvitation.asInstanceOf[js.Any], createWebhook = createWebhook.asInstanceOf[js.Any], deleteWebhook = deleteWebhook.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getMembershipForAuthenticatedUser = getMembershipForAuthenticatedUser.asInstanceOf[js.Any], getMembershipForUser = getMembershipForUser.asInstanceOf[js.Any], getWebhook = getWebhook.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAppInstallations = listAppInstallations.asInstanceOf[js.Any], listBlockedUsers = listBlockedUsers.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listInvitationTeams = listInvitationTeams.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMembershipsForAuthenticatedUser = listMembershipsForAuthenticatedUser.asInstanceOf[js.Any], listOutsideCollaborators = listOutsideCollaborators.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPublicMembers = listPublicMembers.asInstanceOf[js.Any], listWebhooks = listWebhooks.asInstanceOf[js.Any], pingWebhook = pingWebhook.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMembershipForUser = removeMembershipForUser.asInstanceOf[js.Any], removeOutsideCollaborator = removeOutsideCollaborator.asInstanceOf[js.Any], removePublicMembershipForAuthenticatedUser = removePublicMembershipForAuthenticatedUser.asInstanceOf[js.Any], setMembershipForUser = setMembershipForUser.asInstanceOf[js.Any], setPublicMembershipForAuthenticatedUser = setPublicMembershipForAuthenticatedUser.asInstanceOf[js.Any], unblockUser = unblockUser.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateMembershipForAuthenticatedUser = updateMembershipForAuthenticatedUser.asInstanceOf[js.Any], updateWebhook = updateWebhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockUser]
  }
  
  extension [Self <: BlockUser](x: Self) {
    
    inline def setBlockUser(value: `232`): Self = StObject.set(x, "blockUser", value.asInstanceOf[js.Any])
    
    inline def setCheckBlockedUser(value: `233`): Self = StObject.set(x, "checkBlockedUser", value.asInstanceOf[js.Any])
    
    inline def setCheckMembershipForUser(value: `234`): Self = StObject.set(x, "checkMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setCheckPublicMembershipForUser(value: `235`): Self = StObject.set(x, "checkPublicMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setConvertMemberToOutsideCollaborator(value: `236`): Self = StObject.set(x, "convertMemberToOutsideCollaborator", value.asInstanceOf[js.Any])
    
    inline def setCreateInvitation(value: `237`): Self = StObject.set(x, "createInvitation", value.asInstanceOf[js.Any])
    
    inline def setCreateWebhook(value: `238`): Self = StObject.set(x, "createWebhook", value.asInstanceOf[js.Any])
    
    inline def setDeleteWebhook(value: `239`): Self = StObject.set(x, "deleteWebhook", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `240`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetMembershipForAuthenticatedUser(value: `241`): Self = StObject.set(x, "getMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetMembershipForUser(value: `242`): Self = StObject.set(x, "getMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setGetWebhook(value: `243`): Self = StObject.set(x, "getWebhook", value.asInstanceOf[js.Any])
    
    inline def setList(value: `244`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListAppInstallations(value: `245`): Self = StObject.set(x, "listAppInstallations", value.asInstanceOf[js.Any])
    
    inline def setListBlockedUsers(value: `246`): Self = StObject.set(x, "listBlockedUsers", value.asInstanceOf[js.Any])
    
    inline def setListForAuthenticatedUser(value: `247`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListForUser(value: `248`): Self = StObject.set(x, "listForUser", value.asInstanceOf[js.Any])
    
    inline def setListInvitationTeams(value: `249`): Self = StObject.set(x, "listInvitationTeams", value.asInstanceOf[js.Any])
    
    inline def setListMembers(value: `250`): Self = StObject.set(x, "listMembers", value.asInstanceOf[js.Any])
    
    inline def setListMembershipsForAuthenticatedUser(value: `251`): Self = StObject.set(x, "listMembershipsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListOutsideCollaborators(value: `252`): Self = StObject.set(x, "listOutsideCollaborators", value.asInstanceOf[js.Any])
    
    inline def setListPendingInvitations(value: `253`): Self = StObject.set(x, "listPendingInvitations", value.asInstanceOf[js.Any])
    
    inline def setListPublicMembers(value: `254`): Self = StObject.set(x, "listPublicMembers", value.asInstanceOf[js.Any])
    
    inline def setListWebhooks(value: `255`): Self = StObject.set(x, "listWebhooks", value.asInstanceOf[js.Any])
    
    inline def setPingWebhook(value: `256`): Self = StObject.set(x, "pingWebhook", value.asInstanceOf[js.Any])
    
    inline def setRemoveMember(value: `257`): Self = StObject.set(x, "removeMember", value.asInstanceOf[js.Any])
    
    inline def setRemoveMembershipForUser(value: `258`): Self = StObject.set(x, "removeMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setRemoveOutsideCollaborator(value: `259`): Self = StObject.set(x, "removeOutsideCollaborator", value.asInstanceOf[js.Any])
    
    inline def setRemovePublicMembershipForAuthenticatedUser(value: `260`): Self = StObject.set(x, "removePublicMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setSetMembershipForUser(value: `261`): Self = StObject.set(x, "setMembershipForUser", value.asInstanceOf[js.Any])
    
    inline def setSetPublicMembershipForAuthenticatedUser(value: `262`): Self = StObject.set(x, "setPublicMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setUnblockUser(value: `263`): Self = StObject.set(x, "unblockUser", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `264`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateMembershipForAuthenticatedUser(value: `265`): Self = StObject.set(x, "updateMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setUpdateWebhook(value: `266`): Self = StObject.set(x, "updateWebhook", value.asInstanceOf[js.Any])
  }
}
