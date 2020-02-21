package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsAddRepoToInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsCheckAccountIsAssociatedWithAnyParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsCheckAccountIsAssociatedWithAnyStubbedParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsCheckAuthorizationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsCheckTokenParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsCreateContentAttachmentParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsCreateFromManifestParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsCreateInstallationTokenParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsDeleteAuthorizationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsDeleteInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsDeleteTokenParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsFindOrgInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsFindRepoInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsFindUserInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsGetBySlugParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsGetInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsGetOrgInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsGetRepoInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsGetUserInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListAccountsUserOrOrgOnPlanParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListAccountsUserOrOrgOnPlanStubbedParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListInstallationReposForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListInstallationsForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListInstallationsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListMarketplacePurchasesForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListMarketplacePurchasesForAuthenticatedUserStubbedParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListPlansParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListPlansStubbedParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsListReposParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsRemoveRepoFromInstallationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsResetAuthorizationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsResetTokenParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsRevokeAuthorizationForApplicationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AppsRevokeGrantForApplicationParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.EmptyParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddRepoToInstallationCheckAccountIsAssociatedWithAny extends js.Object {
  /**
    * Add a single repository to an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  @JSName("addRepoToInstallation")
  var addRepoToInstallation_Original: AnonEndpointParamsAnyAnyResponse = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("checkAccountIsAssociatedWithAnyStubbed")
  var checkAccountIsAssociatedWithAnyStubbed_Original: AnonEndpointParamsAnyAppsCheckAccountIsAssociatedWithAnyStubbedParams = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("checkAccountIsAssociatedWithAny")
  var checkAccountIsAssociatedWithAny_Original: AnonEndpointParamsAnyAppsCheckAccountIsAssociatedWithAnyParams = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.
    * @deprecated octokit.apps.checkAuthorization() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#check-an-authorization
    */
  @JSName("checkAuthorization")
  var checkAuthorization_Original: AnonEndpointParamsAnyAppsCheckAuthorizationParams = js.native
  /**
    * OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) to use this endpoint, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  @JSName("checkToken")
  var checkToken_Original: AnonEndpointParamsAnyAppsCheckTokenParams = js.native
  /**
    * Creates an attachment under a content reference URL in the body or comment of an issue or pull request. Use the `id` of the content reference from the [`content_reference` event](https://developer.github.com/v3/activity/events/types/#contentreferenceevent) to create an attachment.
    *
    * The app must create a content attachment within six hours of the content reference URL being posted. See "[Using content attachments](https://developer.github.com/apps/using-content-attachments/)" for details about content attachments.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    *
    * This example creates a content attachment for the domain `https://errors.ai/`.
    */
  @JSName("createContentAttachment")
  var createContentAttachment_Original: AnonEndpointParamsAnyAppsCreateContentAttachmentParams = js.native
  /**
    * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://developer.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.
    */
  @JSName("createFromManifest")
  var createFromManifest_Original: AnonEndpointParamsAnyAppsCreateFromManifestParams = js.native
  /**
    * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * This example grants the token "Read and write" permission to `issues` and "Read" permission to `contents`, and restricts the token's access to the repository with an `id` of 1296269.
    */
  @JSName("createInstallationToken")
  var createInstallationToken_Original: AnonEndpointParamsAnyAppsCreateInstallationTokenParams = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  @JSName("deleteAuthorization")
  var deleteAuthorization_Original: AnonEndpointParamsAnyAnyResponseAppsDeleteAuthorizationParams = js.native
  /**
    * Uninstalls a GitHub App on a user, organization, or business account.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("deleteInstallation")
  var deleteInstallation_Original: AnonEndpointParamsAnyAnyResponseAppsDeleteInstallationParams = js.native
  /**
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password.
    */
  @JSName("deleteToken")
  var deleteToken_Original: AnonEndpointParamsAnyAnyResponseAppsDeleteTokenParams = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    * @deprecated octokit.apps.findOrgInstallation() has been renamed to octokit.apps.getOrgInstallation() (2019-04-10)
    */
  @JSName("findOrgInstallation")
  var findOrgInstallation_Original: AnonEndpointParamsAnyAppsFindOrgInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    * @deprecated octokit.apps.findRepoInstallation() has been renamed to octokit.apps.getRepoInstallation() (2019-04-10)
    */
  @JSName("findRepoInstallation")
  var findRepoInstallation_Original: AnonEndpointParamsAnyAppsFindRepoInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    * @deprecated octokit.apps.findUserInstallation() has been renamed to octokit.apps.getUserInstallation() (2019-04-10)
    */
  @JSName("findUserInstallation")
  var findUserInstallation_Original: AnonEndpointParamsAnyAppsFindUserInstallationParams = js.native
  /**
    * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the "[List installations](https://developer.github.com/v3/apps/#list-installations)" endpoint.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: AnonEndpointParamsAny = js.native
  /**
    * **Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
    *
    * If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("getBySlug")
  var getBySlug_Original: AnonEndpointParamsAnyAppsGetBySlugParams = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getInstallation")
  var getInstallation_Original: AnonEndpointParamsAnyAppsGetInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getOrgInstallation")
  var getOrgInstallation_Original: AnonEndpointParamsAnyAppsGetOrgInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getRepoInstallation")
  var getRepoInstallation_Original: AnonEndpointParamsAnyAppsGetRepoInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getUserInstallation")
  var getUserInstallation_Original: AnonEndpointParamsAnyAppsGetUserInstallationParams = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listAccountsUserOrOrgOnPlanStubbed")
  var listAccountsUserOrOrgOnPlanStubbed_Original: AnonEndpointParamsAnyAppsListAccountsUserOrOrgOnPlanStubbedParams = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listAccountsUserOrOrgOnPlan")
  var listAccountsUserOrOrgOnPlan_Original: AnonEndpointParamsAnyAppsListAccountsUserOrOrgOnPlanParams = js.native
  /**
    * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access for an installation.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The access the user has to each repository is included in the hash under the `permissions` key.
    */
  @JSName("listInstallationReposForAuthenticatedUser")
  var listInstallationReposForAuthenticatedUser_Original: AnonEndpointParamsAnyAppsListInstallationReposForAuthenticatedUserParams = js.native
  /**
    * Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You can find the permissions for the installation under the `permissions` key.
    */
  @JSName("listInstallationsForAuthenticatedUser")
  var listInstallationsForAuthenticatedUser_Original: AnonEndpointParamsAnyAppsListInstallationsForAuthenticatedUserParams = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  @JSName("listInstallations")
  var listInstallations_Original: AnonEndpointParamsAnyAppsListInstallationsParams = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  @JSName("listMarketplacePurchasesForAuthenticatedUserStubbed")
  var listMarketplacePurchasesForAuthenticatedUserStubbed_Original: AnonEndpointParamsAnyAppsListMarketplacePurchasesForAuthenticatedUserStubbedParams = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  @JSName("listMarketplacePurchasesForAuthenticatedUser")
  var listMarketplacePurchasesForAuthenticatedUser_Original: AnonEndpointParamsAnyAppsListMarketplacePurchasesForAuthenticatedUserParams = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listPlansStubbed")
  var listPlansStubbed_Original: AnonEndpointParamsAnyAppsListPlansStubbedParams = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listPlans")
  var listPlans_Original: AnonEndpointParamsAnyAppsListPlansParams = js.native
  /**
    * List repositories that an installation can access.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("listRepos")
  var listRepos_Original: AnonEndpointParamsAnyAppsListReposParams = js.native
  /**
    * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  @JSName("removeRepoFromInstallation")
  var removeRepoFromInstallation_Original: AnonEndpointParamsAnyAnyResponseAppsRemoveRepoFromInstallationParams = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the "token" property in the response because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.
    * @deprecated octokit.apps.resetAuthorization() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#reset-an-authorization
    */
  @JSName("resetAuthorization")
  var resetAuthorization_Original: AnonEndpointParamsAnyAppsResetAuthorizationParams = js.native
  /**
    * OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the "token" property in the response because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.
    */
  @JSName("resetToken")
  var resetToken_Original: AnonEndpointParamsAnyAppsResetTokenParams = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password.
    * @deprecated octokit.apps.revokeAuthorizationForApplication() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#revoke-an-authorization-for-an-application
    */
  @JSName("revokeAuthorizationForApplication")
  var revokeAuthorizationForApplication_Original: AnonEndpointParamsAnyAnyResponseAppsRevokeAuthorizationForApplicationParams = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the Applications settings page under "Authorized OAuth Apps" on GitHub](https://github.com/settings/applications#authorized).
    * @deprecated octokit.apps.revokeGrantForApplication() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#revoke-a-grant-for-an-application
    */
  @JSName("revokeGrantForApplication")
  var revokeGrantForApplication_Original: AnonEndpointParamsAnyAnyResponseAppsRevokeGrantForApplicationParams = js.native
  /**
    * Revokes the installation token you're using to authenticate as an installation and access this endpoint.
    *
    * Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the "[Create a new installation token](https://developer.github.com/v3/apps/#create-a-new-installation-token)" endpoint.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("revokeInstallationToken")
  var revokeInstallationToken_Original: AnonEndpointParamsAnyAnyResponseEmptyParams = js.native
  /**
    * Add a single repository to an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  def addRepoToInstallation(): js.Promise[AnyResponse] = js.native
  def addRepoToInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsAddRepoToInstallationParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def checkAccountIsAssociatedWithAny(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckAccountIsAssociatedWithAnyResponse> */ _
  ] = js.native
  def checkAccountIsAssociatedWithAny(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsCheckAccountIsAssociatedWithAnyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckAccountIsAssociatedWithAnyResponse> */ _
  ] = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def checkAccountIsAssociatedWithAnyStubbed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckAccountIsAssociatedWithAnyStubbedResponse> */ _
  ] = js.native
  def checkAccountIsAssociatedWithAnyStubbed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsCheckAccountIsAssociatedWithAnyStubbedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckAccountIsAssociatedWithAnyStubbedResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.
    * @deprecated octokit.apps.checkAuthorization() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#check-an-authorization
    */
  def checkAuthorization(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckAuthorizationResponse> */ _
  ] = js.native
  def checkAuthorization(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsCheckAuthorizationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckAuthorizationResponse> */ _
  ] = js.native
  /**
    * OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) to use this endpoint, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  def checkToken(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckTokenResponse> */ _
  ] = js.native
  def checkToken(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsCheckTokenParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCheckTokenResponse> */ _
  ] = js.native
  /**
    * Creates an attachment under a content reference URL in the body or comment of an issue or pull request. Use the `id` of the content reference from the [`content_reference` event](https://developer.github.com/v3/activity/events/types/#contentreferenceevent) to create an attachment.
    *
    * The app must create a content attachment within six hours of the content reference URL being posted. See "[Using content attachments](https://developer.github.com/apps/using-content-attachments/)" for details about content attachments.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    *
    * This example creates a content attachment for the domain `https://errors.ai/`.
    */
  def createContentAttachment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCreateContentAttachmentResponse> */ _
  ] = js.native
  def createContentAttachment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsCreateContentAttachmentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCreateContentAttachmentResponse> */ _
  ] = js.native
  /**
    * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://developer.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.
    */
  def createFromManifest(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCreateFromManifestResponse> */ _
  ] = js.native
  def createFromManifest(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsCreateFromManifestParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCreateFromManifestResponse> */ _
  ] = js.native
  /**
    * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * This example grants the token "Read and write" permission to `issues` and "Read" permission to `contents`, and restricts the token's access to the repository with an `id` of 1296269.
    */
  def createInstallationToken(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCreateInstallationTokenResponse> */ _
  ] = js.native
  def createInstallationToken(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsCreateInstallationTokenParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsCreateInstallationTokenResponse> */ _
  ] = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  def deleteAuthorization(): js.Promise[AnyResponse] = js.native
  def deleteAuthorization(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsDeleteAuthorizationParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Uninstalls a GitHub App on a user, organization, or business account.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def deleteInstallation(): js.Promise[AnyResponse] = js.native
  def deleteInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsDeleteInstallationParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password.
    */
  def deleteToken(): js.Promise[AnyResponse] = js.native
  def deleteToken(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsDeleteTokenParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    * @deprecated octokit.apps.findOrgInstallation() has been renamed to octokit.apps.getOrgInstallation() (2019-04-10)
    */
  def findOrgInstallation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsFindOrgInstallationResponse> */ _
  ] = js.native
  def findOrgInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsFindOrgInstallationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsFindOrgInstallationResponse> */ _
  ] = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    * @deprecated octokit.apps.findRepoInstallation() has been renamed to octokit.apps.getRepoInstallation() (2019-04-10)
    */
  def findRepoInstallation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsFindRepoInstallationResponse> */ _
  ] = js.native
  def findRepoInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsFindRepoInstallationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsFindRepoInstallationResponse> */ _
  ] = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    * @deprecated octokit.apps.findUserInstallation() has been renamed to octokit.apps.getUserInstallation() (2019-04-10)
    */
  def findUserInstallation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsFindUserInstallationResponse> */ _
  ] = js.native
  def findUserInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsFindUserInstallationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsFindUserInstallationResponse> */ _
  ] = js.native
  /**
    * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the "[List installations](https://developer.github.com/v3/apps/#list-installations)" endpoint.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getAuthenticated(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def getAuthenticated(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  /**
    * **Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
    *
    * If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  def getBySlug(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetBySlugResponse> */ _
  ] = js.native
  def getBySlug(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsGetBySlugParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetBySlugResponse> */ _
  ] = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getInstallation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetInstallationResponse> */ _
  ] = js.native
  def getInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsGetInstallationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetInstallationResponse> */ _
  ] = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getOrgInstallation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetOrgInstallationResponse> */ _
  ] = js.native
  def getOrgInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsGetOrgInstallationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetOrgInstallationResponse> */ _
  ] = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getRepoInstallation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetRepoInstallationResponse> */ _
  ] = js.native
  def getRepoInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsGetRepoInstallationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetRepoInstallationResponse> */ _
  ] = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getUserInstallation(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetUserInstallationResponse> */ _
  ] = js.native
  def getUserInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsGetUserInstallationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetUserInstallationResponse> */ _
  ] = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listAccountsUserOrOrgOnPlan(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsUserOrOrgOnPlanResponse> */ _
  ] = js.native
  def listAccountsUserOrOrgOnPlan(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListAccountsUserOrOrgOnPlanParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsUserOrOrgOnPlanResponse> */ _
  ] = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listAccountsUserOrOrgOnPlanStubbed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsUserOrOrgOnPlanStubbedResponse> */ _
  ] = js.native
  def listAccountsUserOrOrgOnPlanStubbed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListAccountsUserOrOrgOnPlanStubbedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsUserOrOrgOnPlanStubbedResponse> */ _
  ] = js.native
  /**
    * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access for an installation.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The access the user has to each repository is included in the hash under the `permissions` key.
    */
  def listInstallationReposForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListInstallationReposForAuthenticatedUserResponse> */ _
  ] = js.native
  def listInstallationReposForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListInstallationReposForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListInstallationReposForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  def listInstallations(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListInstallationsResponse> */ _
  ] = js.native
  def listInstallations(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListInstallationsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListInstallationsResponse> */ _
  ] = js.native
  /**
    * Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You can find the permissions for the installation under the `permissions` key.
    */
  def listInstallationsForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListInstallationsForAuthenticatedUserResponse> */ _
  ] = js.native
  def listInstallationsForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListInstallationsForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListInstallationsForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  def listMarketplacePurchasesForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListMarketplacePurchasesForAuthenticatedUserResponse> */ _
  ] = js.native
  def listMarketplacePurchasesForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListMarketplacePurchasesForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListMarketplacePurchasesForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  def listMarketplacePurchasesForAuthenticatedUserStubbed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse> */ _
  ] = js.native
  def listMarketplacePurchasesForAuthenticatedUserStubbed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListMarketplacePurchasesForAuthenticatedUserStubbedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse> */ _
  ] = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listPlans(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListPlansResponse> */ _
  ] = js.native
  def listPlans(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListPlansParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListPlansResponse> */ _
  ] = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listPlansStubbed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListPlansStubbedResponse> */ _
  ] = js.native
  def listPlansStubbed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListPlansStubbedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListPlansStubbedResponse> */ _
  ] = js.native
  /**
    * List repositories that an installation can access.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  def listRepos(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListReposResponse> */ _
  ] = js.native
  def listRepos(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListReposParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListReposResponse> */ _
  ] = js.native
  /**
    * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  def removeRepoFromInstallation(): js.Promise[AnyResponse] = js.native
  def removeRepoFromInstallation(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsRemoveRepoFromInstallationParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the "token" property in the response because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.
    * @deprecated octokit.apps.resetAuthorization() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#reset-an-authorization
    */
  def resetAuthorization(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsResetAuthorizationResponse> */ _
  ] = js.native
  def resetAuthorization(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsResetAuthorizationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsResetAuthorizationResponse> */ _
  ] = js.native
  /**
    * OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the "token" property in the response because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.
    */
  def resetToken(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsResetTokenResponse> */ _
  ] = js.native
  def resetToken(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsResetTokenParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsResetTokenResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password.
    * @deprecated octokit.apps.revokeAuthorizationForApplication() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#revoke-an-authorization-for-an-application
    */
  def revokeAuthorizationForApplication(): js.Promise[AnyResponse] = js.native
  def revokeAuthorizationForApplication(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsRevokeAuthorizationForApplicationParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Deprecation Notice:** GitHub will replace and discontinue OAuth endpoints containing `access_token` in the path parameter. We are introducing new endpoints that allow you to securely manage tokens for OAuth Apps by using `access_token` as an input parameter. For more information, see the [blog post](https://developer.github.com/changes/2019-11-05-deprecated-passwords-and-authorizations-api).
    *
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid token as `:access_token` and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the Applications settings page under "Authorized OAuth Apps" on GitHub](https://github.com/settings/applications#authorized).
    * @deprecated octokit.apps.revokeGrantForApplication() is deprecated, see https://developer.github.com/v3/apps/oauth_applications/#revoke-a-grant-for-an-application
    */
  def revokeGrantForApplication(): js.Promise[AnyResponse] = js.native
  def revokeGrantForApplication(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsRevokeGrantForApplicationParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Revokes the installation token you're using to authenticate as an installation and access this endpoint.
    *
    * Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the "[Create a new installation token](https://developer.github.com/v3/apps/#create-a-new-installation-token)" endpoint.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  def revokeInstallationToken(): js.Promise[AnyResponse] = js.native
  def revokeInstallationToken(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[AnyResponse] = js.native
}

