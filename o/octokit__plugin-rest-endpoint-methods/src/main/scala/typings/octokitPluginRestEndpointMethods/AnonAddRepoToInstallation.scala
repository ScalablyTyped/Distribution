package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.typesMod.AppsAddRepoToInstallationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsCheckAccountIsAssociatedWithAnyParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsCheckAccountIsAssociatedWithAnyStubbedParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsCheckTokenParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsCreateContentAttachmentParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsCreateFromManifestParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsCreateInstallationTokenParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsDeleteAuthorizationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsDeleteInstallationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsDeleteTokenParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsGetBySlugParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsGetInstallationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsGetOrgInstallationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsGetRepoInstallationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsGetSubscriptionPlanForAccountParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsGetSubscriptionPlanForAccountStubbedParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsGetUserInstallationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListAccountsForPlanParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListAccountsForPlanStubbedParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListAccountsUserOrOrgOnPlanParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListAccountsUserOrOrgOnPlanStubbedParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListInstallationReposForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListInstallationsForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListInstallationsParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListMarketplacePurchasesForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListMarketplacePurchasesForAuthenticatedUserStubbedParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListPlansParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListPlansStubbedParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListReposParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListSubscriptionsForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsListSubscriptionsForAuthenticatedUserStubbedParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsRemoveRepoFromInstallationParams
import typings.octokitPluginRestEndpointMethods.typesMod.AppsResetTokenParams
import typings.octokitPluginRestEndpointMethods.typesMod.EmptyParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddRepoToInstallation extends js.Object {
  /**
    * Add a single repository to an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  @JSName("addRepoToInstallation")
  var addRepoToInstallation_Original: Anon63 = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    * @deprecated octokit.apps.checkAccountIsAssociatedWithAnyStubbed() has been renamed to octokit.apps.getSubscriptionPlanForAccountStubbed() (2020-03-08)
    */
  @JSName("checkAccountIsAssociatedWithAnyStubbed")
  var checkAccountIsAssociatedWithAnyStubbed_Original: Anon65 = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    * @deprecated octokit.apps.checkAccountIsAssociatedWithAny() has been renamed to octokit.apps.getSubscriptionPlanForAccount() (2020-03-08)
    */
  @JSName("checkAccountIsAssociatedWithAny")
  var checkAccountIsAssociatedWithAny_Original: Anon64 = js.native
  /**
    * OAuth applications can use a special API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) to use this endpoint, where the username is the OAuth application `client_id` and the password is its `client_secret`. Invalid tokens will return `404 NOT FOUND`.
    */
  @JSName("checkToken")
  var checkToken_Original: Anon66 = js.native
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
  var createContentAttachment_Original: Anon67 = js.native
  /**
    * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://developer.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.
    */
  @JSName("createFromManifest")
  var createFromManifest_Original: Anon68 = js.native
  /**
    * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * This example grants the token "Read and write" permission to `issues` and "Read" permission to `contents`, and restricts the token's access to the repository with an `id` of 1296269.
    */
  @JSName("createInstallationToken")
  var createInstallationToken_Original: Anon69 = js.native
  /**
    * OAuth application owners can revoke a grant for their OAuth application and a specific user. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. You must also provide a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
    *
    * Deleting an OAuth application's grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user's account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
    */
  @JSName("deleteAuthorization")
  var deleteAuthorization_Original: Anon70 = js.native
  /**
    * Uninstalls a GitHub App on a user, organization, or business account.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("deleteInstallation")
  var deleteInstallation_Original: Anon71 = js.native
  /**
    * OAuth application owners can revoke a single token for an OAuth application. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password.
    */
  @JSName("deleteToken")
  var deleteToken_Original: Anon72 = js.native
  /**
    * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the "[List installations](https://developer.github.com/v3/apps/#list-installations)" endpoint.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: Anon25 = js.native
  /**
    * **Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
    *
    * If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("getBySlug")
  var getBySlug_Original: Anon73 = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getInstallation")
  var getInstallation_Original: Anon74 = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getOrgInstallation")
  var getOrgInstallation_Original: Anon75 = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getRepoInstallation")
  var getRepoInstallation_Original: Anon76 = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("getSubscriptionPlanForAccountStubbed")
  var getSubscriptionPlanForAccountStubbed_Original: Anon78 = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("getSubscriptionPlanForAccount")
  var getSubscriptionPlanForAccount_Original: Anon77 = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getUserInstallation")
  var getUserInstallation_Original: Anon79 = js.native
  /**
    * Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listAccountsForPlanStubbed")
  var listAccountsForPlanStubbed_Original: Anon81 = js.native
  /**
    * Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listAccountsForPlan")
  var listAccountsForPlan_Original: Anon80 = js.native
  /**
    * Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    * @deprecated octokit.apps.listAccountsUserOrOrgOnPlanStubbed() has been renamed to octokit.apps.listAccountsForPlanStubbed() (2020-03-04)
    */
  @JSName("listAccountsUserOrOrgOnPlanStubbed")
  var listAccountsUserOrOrgOnPlanStubbed_Original: Anon83 = js.native
  /**
    * Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    * @deprecated octokit.apps.listAccountsUserOrOrgOnPlan() has been renamed to octokit.apps.listAccountsForPlan() (2020-03-04)
    */
  @JSName("listAccountsUserOrOrgOnPlan")
  var listAccountsUserOrOrgOnPlan_Original: Anon82 = js.native
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
  var listInstallationReposForAuthenticatedUser_Original: Anon84 = js.native
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
  var listInstallationsForAuthenticatedUser_Original: Anon86 = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  @JSName("listInstallations")
  var listInstallations_Original: Anon85 = js.native
  /**
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    * @deprecated octokit.apps.listMarketplacePurchasesForAuthenticatedUserStubbed() has been renamed to octokit.apps.listSubscriptionsForAuthenticatedUserStubbed() (2020-03-08)
    */
  @JSName("listMarketplacePurchasesForAuthenticatedUserStubbed")
  var listMarketplacePurchasesForAuthenticatedUserStubbed_Original: Anon88 = js.native
  /**
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    * @deprecated octokit.apps.listMarketplacePurchasesForAuthenticatedUser() has been renamed to octokit.apps.listSubscriptionsForAuthenticatedUser() (2020-03-08)
    */
  @JSName("listMarketplacePurchasesForAuthenticatedUser")
  var listMarketplacePurchasesForAuthenticatedUser_Original: Anon87 = js.native
  /**
    * Lists all plans that are part of your GitHub Marketplace listing.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listPlansStubbed")
  var listPlansStubbed_Original: Anon90 = js.native
  /**
    * Lists all plans that are part of your GitHub Marketplace listing.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listPlans")
  var listPlans_Original: Anon89 = js.native
  /**
    * List repositories that an installation can access.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("listRepos")
  var listRepos_Original: Anon91 = js.native
  /**
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  @JSName("listSubscriptionsForAuthenticatedUserStubbed")
  var listSubscriptionsForAuthenticatedUserStubbed_Original: Anon93 = js.native
  /**
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  @JSName("listSubscriptionsForAuthenticatedUser")
  var listSubscriptionsForAuthenticatedUser_Original: Anon92 = js.native
  /**
    * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  @JSName("removeRepoFromInstallation")
  var removeRepoFromInstallation_Original: Anon94 = js.native
  /**
    * OAuth applications can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the "token" property in the response because changes take effect immediately. You must use [Basic Authentication](https://developer.github.com/v3/auth#basic-authentication) when accessing this endpoint, using the OAuth application's `client_id` and `client_secret` as the username and password. Invalid tokens will return `404 NOT FOUND`.
    */
  @JSName("resetToken")
  var resetToken_Original: Anon95 = js.native
  /**
    * Revokes the installation token you're using to authenticate as an installation and access this endpoint.
    *
    * Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the "[Create a new installation token](https://developer.github.com/v3/apps/#create-a-new-installation-token)" endpoint.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("revokeInstallationToken")
  var revokeInstallationToken_Original: Anon96 = js.native
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
    * @deprecated octokit.apps.checkAccountIsAssociatedWithAny() has been renamed to octokit.apps.getSubscriptionPlanForAccount() (2020-03-08)
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
    * @deprecated octokit.apps.checkAccountIsAssociatedWithAnyStubbed() has been renamed to octokit.apps.getSubscriptionPlanForAccountStubbed() (2020-03-08)
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
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def getSubscriptionPlanForAccount(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetSubscriptionPlanForAccountResponse> */ _
  ] = js.native
  def getSubscriptionPlanForAccount(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsGetSubscriptionPlanForAccountParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetSubscriptionPlanForAccountResponse> */ _
  ] = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def getSubscriptionPlanForAccountStubbed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetSubscriptionPlanForAccountStubbedResponse> */ _
  ] = js.native
  def getSubscriptionPlanForAccountStubbed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsGetSubscriptionPlanForAccountStubbedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsGetSubscriptionPlanForAccountStubbedResponse> */ _
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
    * Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listAccountsForPlan(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsForPlanResponse> */ _
  ] = js.native
  def listAccountsForPlan(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListAccountsForPlanParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsForPlanResponse> */ _
  ] = js.native
  /**
    * Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listAccountsForPlanStubbed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsForPlanStubbedResponse> */ _
  ] = js.native
  def listAccountsForPlanStubbed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListAccountsForPlanStubbedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListAccountsForPlanStubbedResponse> */ _
  ] = js.native
  /**
    * Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    * @deprecated octokit.apps.listAccountsUserOrOrgOnPlan() has been renamed to octokit.apps.listAccountsForPlan() (2020-03-04)
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
    * Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    * @deprecated octokit.apps.listAccountsUserOrOrgOnPlanStubbed() has been renamed to octokit.apps.listAccountsForPlanStubbed() (2020-03-04)
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
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    * @deprecated octokit.apps.listMarketplacePurchasesForAuthenticatedUser() has been renamed to octokit.apps.listSubscriptionsForAuthenticatedUser() (2020-03-08)
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
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    * @deprecated octokit.apps.listMarketplacePurchasesForAuthenticatedUserStubbed() has been renamed to octokit.apps.listSubscriptionsForAuthenticatedUserStubbed() (2020-03-08)
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
    * Lists all plans that are part of your GitHub Marketplace listing.
    *
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
    * Lists all plans that are part of your GitHub Marketplace listing.
    *
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
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  def listSubscriptionsForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListSubscriptionsForAuthenticatedUserResponse> */ _
  ] = js.native
  def listSubscriptionsForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListSubscriptionsForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListSubscriptionsForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  def listSubscriptionsForAuthenticatedUserStubbed(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListSubscriptionsForAuthenticatedUserStubbedResponse> */ _
  ] = js.native
  def listSubscriptionsForAuthenticatedUserStubbed(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with AppsListSubscriptionsForAuthenticatedUserStubbedParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<AppsListSubscriptionsForAuthenticatedUserStubbedResponse> */ _
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

