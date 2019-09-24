package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.AppsAddRepoToInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsCheckAccountIsAssociatedWithAnyParams
import typings.atOctokitRest.atOctokitRestMod.AppsCheckAccountIsAssociatedWithAnyResponse
import typings.atOctokitRest.atOctokitRestMod.AppsCheckAccountIsAssociatedWithAnyStubbedParams
import typings.atOctokitRest.atOctokitRestMod.AppsCheckAccountIsAssociatedWithAnyStubbedResponse
import typings.atOctokitRest.atOctokitRestMod.AppsCreateContentAttachmentParams
import typings.atOctokitRest.atOctokitRestMod.AppsCreateContentAttachmentResponse
import typings.atOctokitRest.atOctokitRestMod.AppsCreateFromManifestParams
import typings.atOctokitRest.atOctokitRestMod.AppsCreateFromManifestResponse
import typings.atOctokitRest.atOctokitRestMod.AppsCreateInstallationTokenParams
import typings.atOctokitRest.atOctokitRestMod.AppsCreateInstallationTokenResponse
import typings.atOctokitRest.atOctokitRestMod.AppsDeleteInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsFindOrgInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsFindOrgInstallationResponse
import typings.atOctokitRest.atOctokitRestMod.AppsFindRepoInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsFindRepoInstallationResponse
import typings.atOctokitRest.atOctokitRestMod.AppsFindUserInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsFindUserInstallationResponse
import typings.atOctokitRest.atOctokitRestMod.AppsGetAuthenticatedResponse
import typings.atOctokitRest.atOctokitRestMod.AppsGetBySlugParams
import typings.atOctokitRest.atOctokitRestMod.AppsGetBySlugResponse
import typings.atOctokitRest.atOctokitRestMod.AppsGetInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsGetInstallationResponse
import typings.atOctokitRest.atOctokitRestMod.AppsGetOrgInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsGetOrgInstallationResponse
import typings.atOctokitRest.atOctokitRestMod.AppsGetRepoInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsGetRepoInstallationResponse
import typings.atOctokitRest.atOctokitRestMod.AppsGetUserInstallationParams
import typings.atOctokitRest.atOctokitRestMod.AppsGetUserInstallationResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListAccountsUserOrOrgOnPlanParams
import typings.atOctokitRest.atOctokitRestMod.AppsListAccountsUserOrOrgOnPlanResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListAccountsUserOrOrgOnPlanStubbedParams
import typings.atOctokitRest.atOctokitRestMod.AppsListAccountsUserOrOrgOnPlanStubbedResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListInstallationReposForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.AppsListInstallationReposForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListInstallationsForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.AppsListInstallationsForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListInstallationsParams
import typings.atOctokitRest.atOctokitRestMod.AppsListInstallationsResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListMarketplacePurchasesForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.AppsListMarketplacePurchasesForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListMarketplacePurchasesForAuthenticatedUserStubbedParams
import typings.atOctokitRest.atOctokitRestMod.AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListPlansParams
import typings.atOctokitRest.atOctokitRestMod.AppsListPlansResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListPlansStubbedParams
import typings.atOctokitRest.atOctokitRestMod.AppsListPlansStubbedResponse
import typings.atOctokitRest.atOctokitRestMod.AppsListReposParams
import typings.atOctokitRest.atOctokitRestMod.AppsListReposResponse
import typings.atOctokitRest.atOctokitRestMod.AppsRemoveRepoFromInstallationParams
import typings.atOctokitRest.atOctokitRestMod.EmptyParams
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddRepoToInstallation extends js.Object {
  /**
    * Add a single repository to an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  @JSName("addRepoToInstallation")
  var addRepoToInstallation_Original: Anon_EndpointParamsAnyResponse = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("checkAccountIsAssociatedWithAnyStubbed")
  var checkAccountIsAssociatedWithAnyStubbed_Original: Anon_EndpointParamsAppsCheckAccountIsAssociatedWithAnyStubbedParams = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("checkAccountIsAssociatedWithAny")
  var checkAccountIsAssociatedWithAny_Original: Anon_EndpointParamsAppsCheckAccountIsAssociatedWithAnyParams = js.native
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
  var createContentAttachment_Original: Anon_EndpointParamsAppsCreateContentAttachmentParams = js.native
  /**
    * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://developer.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.
    */
  @JSName("createFromManifest")
  var createFromManifest_Original: Anon_EndpointParamsAppsCreateFromManifestParams = js.native
  /**
    * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token.
    *
    * By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * This example grants the token "Read and write" permission to `issues` and "Read" permission to `contents`, and restricts the token's access to the repository with an `id` of 1296269.
    */
  @JSName("createInstallationToken")
  var createInstallationToken_Original: Anon_EndpointParamsAppsCreateInstallationTokenParams = js.native
  /**
    * Uninstalls a GitHub App on a user, organization, or business account.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("deleteInstallation")
  var deleteInstallation_Original: Anon_EndpointParamsAnyResponseAppsDeleteInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("findOrgInstallation")
  var findOrgInstallation_Original: Anon_EndpointParamsAppsFindOrgInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("findRepoInstallation")
  var findRepoInstallation_Original: Anon_EndpointParamsAppsFindRepoInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("findUserInstallation")
  var findUserInstallation_Original: Anon_EndpointParamsAppsFindUserInstallationParams = js.native
  /**
    * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the "[List installations](https://developer.github.com/v3/apps/#list-installations)" endpoint.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getAuthenticated")
  var getAuthenticated_Original: Anon_EndpointParamsAppsGetAuthenticatedResponse = js.native
  /**
    * **Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
    *
    * If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("getBySlug")
  var getBySlug_Original: Anon_EndpointParamsAppsGetBySlugParams = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getInstallation")
  var getInstallation_Original: Anon_EndpointParamsAppsGetInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getOrgInstallation")
  var getOrgInstallation_Original: Anon_EndpointParamsAppsGetOrgInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getRepoInstallation")
  var getRepoInstallation_Original: Anon_EndpointParamsAppsGetRepoInstallationParams = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  @JSName("getUserInstallation")
  var getUserInstallation_Original: Anon_EndpointParamsAppsGetUserInstallationParams = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listAccountsUserOrOrgOnPlanStubbed")
  var listAccountsUserOrOrgOnPlanStubbed_Original: Anon_EndpointParamsAppsListAccountsUserOrOrgOnPlanStubbedParams = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listAccountsUserOrOrgOnPlan")
  var listAccountsUserOrOrgOnPlan_Original: Anon_EndpointParamsAppsListAccountsUserOrOrgOnPlanParams = js.native
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
  var listInstallationReposForAuthenticatedUser_Original: Anon_EndpointParamsAppsListInstallationReposForAuthenticatedUserParams = js.native
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
  var listInstallationsForAuthenticatedUser_Original: Anon_EndpointParamsAppsListInstallationsForAuthenticatedUserParams = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  @JSName("listInstallations")
  var listInstallations_Original: Anon_EndpointParamsAppsListInstallationsParams = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  @JSName("listMarketplacePurchasesForAuthenticatedUserStubbed")
  var listMarketplacePurchasesForAuthenticatedUserStubbed_Original: Anon_EndpointParamsAppsListMarketplacePurchasesForAuthenticatedUserStubbedParams = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  @JSName("listMarketplacePurchasesForAuthenticatedUser")
  var listMarketplacePurchasesForAuthenticatedUser_Original: Anon_EndpointParamsAppsListMarketplacePurchasesForAuthenticatedUserParams = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listPlansStubbed")
  var listPlansStubbed_Original: Anon_EndpointParamsAppsListPlansStubbedParams = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  @JSName("listPlans")
  var listPlans_Original: Anon_EndpointParamsAppsListPlansParams = js.native
  /**
    * List repositories that an installation can access.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  @JSName("listRepos")
  var listRepos_Original: Anon_EndpointParamsAppsListReposParams = js.native
  /**
    * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  @JSName("removeRepoFromInstallation")
  var removeRepoFromInstallation_Original: Anon_EndpointParamsAnyResponseAppsRemoveRepoFromInstallationParams = js.native
  /**
    * Add a single repository to an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  def addRepoToInstallation(): js.Promise[AnyResponse] = js.native
  def addRepoToInstallation(params: RequestOptions with AppsAddRepoToInstallationParams): js.Promise[AnyResponse] = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def checkAccountIsAssociatedWithAny(): js.Promise[Response[AppsCheckAccountIsAssociatedWithAnyResponse]] = js.native
  def checkAccountIsAssociatedWithAny(params: RequestOptions with AppsCheckAccountIsAssociatedWithAnyParams): js.Promise[Response[AppsCheckAccountIsAssociatedWithAnyResponse]] = js.native
  /**
    * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def checkAccountIsAssociatedWithAnyStubbed(): js.Promise[Response[AppsCheckAccountIsAssociatedWithAnyStubbedResponse]] = js.native
  def checkAccountIsAssociatedWithAnyStubbed(params: RequestOptions with AppsCheckAccountIsAssociatedWithAnyStubbedParams): js.Promise[Response[AppsCheckAccountIsAssociatedWithAnyStubbedResponse]] = js.native
  /**
    * Creates an attachment under a content reference URL in the body or comment of an issue or pull request. Use the `id` of the content reference from the [`content_reference` event](https://developer.github.com/v3/activity/events/types/#contentreferenceevent) to create an attachment.
    *
    * The app must create a content attachment within six hours of the content reference URL being posted. See "[Using content attachments](https://developer.github.com/apps/using-content-attachments/)" for details about content attachments.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    *
    * This example creates a content attachment for the domain `https://errors.ai/`.
    */
  def createContentAttachment(): js.Promise[Response[AppsCreateContentAttachmentResponse]] = js.native
  def createContentAttachment(params: RequestOptions with AppsCreateContentAttachmentParams): js.Promise[Response[AppsCreateContentAttachmentResponse]] = js.native
  /**
    * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://developer.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem` (private key), and `webhook_secret`.
    */
  def createFromManifest(): js.Promise[Response[AppsCreateFromManifestResponse]] = js.native
  def createFromManifest(params: RequestOptions with AppsCreateFromManifestParams): js.Promise[Response[AppsCreateFromManifestResponse]] = js.native
  /**
    * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new installation token.
    *
    * By default the installation token has access to all repositories that the installation can access. To restrict the access to specific repositories, you can provide the `repository_ids` when creating the token. When you omit `repository_ids`, the response does not contain the `repositories` key.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * This example grants the token "Read and write" permission to `issues` and "Read" permission to `contents`, and restricts the token's access to the repository with an `id` of 1296269.
    */
  def createInstallationToken(): js.Promise[Response[AppsCreateInstallationTokenResponse]] = js.native
  def createInstallationToken(params: RequestOptions with AppsCreateInstallationTokenParams): js.Promise[Response[AppsCreateInstallationTokenResponse]] = js.native
  /**
    * Uninstalls a GitHub App on a user, organization, or business account.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def deleteInstallation(): js.Promise[AnyResponse] = js.native
  def deleteInstallation(params: RequestOptions with AppsDeleteInstallationParams): js.Promise[AnyResponse] = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def findOrgInstallation(): js.Promise[Response[AppsFindOrgInstallationResponse]] = js.native
  def findOrgInstallation(params: RequestOptions with AppsFindOrgInstallationParams): js.Promise[Response[AppsFindOrgInstallationResponse]] = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def findRepoInstallation(): js.Promise[Response[AppsFindRepoInstallationResponse]] = js.native
  def findRepoInstallation(params: RequestOptions with AppsFindRepoInstallationParams): js.Promise[Response[AppsFindRepoInstallationResponse]] = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def findUserInstallation(): js.Promise[Response[AppsFindUserInstallationResponse]] = js.native
  def findUserInstallation(params: RequestOptions with AppsFindUserInstallationParams): js.Promise[Response[AppsFindUserInstallationResponse]] = js.native
  /**
    * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the `installations_count` in the response. For more details about your app's installations, see the "[List installations](https://developer.github.com/v3/apps/#list-installations)" endpoint.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getAuthenticated(): js.Promise[Response[AppsGetAuthenticatedResponse]] = js.native
  def getAuthenticated(params: RequestOptions with EmptyParams): js.Promise[Response[AppsGetAuthenticatedResponse]] = js.native
  /**
    * **Note**: The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
    *
    * If the GitHub App you specify is public, you can access this endpoint without authenticating. If the GitHub App you specify is private, you must authenticate with a [personal access token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  def getBySlug(): js.Promise[Response[AppsGetBySlugResponse]] = js.native
  def getBySlug(params: RequestOptions with AppsGetBySlugParams): js.Promise[Response[AppsGetBySlugResponse]] = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getInstallation(): js.Promise[Response[AppsGetInstallationResponse]] = js.native
  def getInstallation(params: RequestOptions with AppsGetInstallationParams): js.Promise[Response[AppsGetInstallationResponse]] = js.native
  /**
    * Enables an authenticated GitHub App to find the organization's installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getOrgInstallation(): js.Promise[Response[AppsGetOrgInstallationResponse]] = js.native
  def getOrgInstallation(params: RequestOptions with AppsGetOrgInstallationParams): js.Promise[Response[AppsGetOrgInstallationResponse]] = js.native
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getRepoInstallation(): js.Promise[Response[AppsGetRepoInstallationResponse]] = js.native
  def getRepoInstallation(params: RequestOptions with AppsGetRepoInstallationParams): js.Promise[Response[AppsGetRepoInstallationResponse]] = js.native
  /**
    * Enables an authenticated GitHub App to find the user’s installation information.
    *
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  def getUserInstallation(): js.Promise[Response[AppsGetUserInstallationResponse]] = js.native
  def getUserInstallation(params: RequestOptions with AppsGetUserInstallationParams): js.Promise[Response[AppsGetUserInstallationResponse]] = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listAccountsUserOrOrgOnPlan(): js.Promise[Response[AppsListAccountsUserOrOrgOnPlanResponse]] = js.native
  def listAccountsUserOrOrgOnPlan(params: RequestOptions with AppsListAccountsUserOrOrgOnPlanParams): js.Promise[Response[AppsListAccountsUserOrOrgOnPlanResponse]] = js.native
  /**
    * Returns any accounts associated with a plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listAccountsUserOrOrgOnPlanStubbed(): js.Promise[Response[AppsListAccountsUserOrOrgOnPlanStubbedResponse]] = js.native
  def listAccountsUserOrOrgOnPlanStubbed(params: RequestOptions with AppsListAccountsUserOrOrgOnPlanStubbedParams): js.Promise[Response[AppsListAccountsUserOrOrgOnPlanStubbedResponse]] = js.native
  /**
    * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access for an installation.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The access the user has to each repository is included in the hash under the `permissions` key.
    */
  def listInstallationReposForAuthenticatedUser(): js.Promise[Response[AppsListInstallationReposForAuthenticatedUserResponse]] = js.native
  def listInstallationReposForAuthenticatedUser(params: RequestOptions with AppsListInstallationReposForAuthenticatedUserParams): js.Promise[Response[AppsListInstallationReposForAuthenticatedUserResponse]] = js.native
  /**
    * You must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    *
    * The permissions the installation has are included under the `permissions` key.
    */
  def listInstallations(): js.Promise[Response[AppsListInstallationsResponse]] = js.native
  def listInstallations(params: RequestOptions with AppsListInstallationsParams): js.Promise[Response[AppsListInstallationsResponse]] = js.native
  /**
    * Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    *
    * You can find the permissions for the installation under the `permissions` key.
    */
  def listInstallationsForAuthenticatedUser(): js.Promise[Response[AppsListInstallationsForAuthenticatedUserResponse]] = js.native
  def listInstallationsForAuthenticatedUser(params: RequestOptions with AppsListInstallationsForAuthenticatedUserParams): js.Promise[Response[AppsListInstallationsForAuthenticatedUserResponse]] = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  def listMarketplacePurchasesForAuthenticatedUser(): js.Promise[Response[AppsListMarketplacePurchasesForAuthenticatedUserResponse]] = js.native
  def listMarketplacePurchasesForAuthenticatedUser(params: RequestOptions with AppsListMarketplacePurchasesForAuthenticatedUserParams): js.Promise[Response[AppsListMarketplacePurchasesForAuthenticatedUserResponse]] = js.native
  /**
    * Returns only active subscriptions. You must use a [user-to-server OAuth access token](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  def listMarketplacePurchasesForAuthenticatedUserStubbed(): js.Promise[Response[AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse]] = js.native
  def listMarketplacePurchasesForAuthenticatedUserStubbed(params: RequestOptions with AppsListMarketplacePurchasesForAuthenticatedUserStubbedParams): js.Promise[Response[AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse]] = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listPlans(): js.Promise[Response[AppsListPlansResponse]] = js.native
  def listPlans(params: RequestOptions with AppsListPlansParams): js.Promise[Response[AppsListPlansResponse]] = js.native
  /**
    * GitHub Apps must use a [JWT](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://developer.github.com/v3/auth/#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  def listPlansStubbed(): js.Promise[Response[AppsListPlansStubbedResponse]] = js.native
  def listPlansStubbed(params: RequestOptions with AppsListPlansStubbedParams): js.Promise[Response[AppsListPlansStubbedResponse]] = js.native
  /**
    * List repositories that an installation can access.
    *
    * You must use an [installation access token](https://developer.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-an-installation) to access this endpoint.
    */
  def listRepos(): js.Promise[Response[AppsListReposResponse]] = js.native
  def listRepos(params: RequestOptions with AppsListReposParams): js.Promise[Response[AppsListReposResponse]] = js.native
  /**
    * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) or the [OAuth Authorizations API](https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization)) or [Basic Authentication](https://developer.github.com/v3/auth/#basic-authentication) to access this endpoint.
    */
  def removeRepoFromInstallation(): js.Promise[AnyResponse] = js.native
  def removeRepoFromInstallation(params: RequestOptions with AppsRemoveRepoFromInstallationParams): js.Promise[AnyResponse] = js.native
}

