package typings.octokitRest

import org.scalablytyped.runtime.Instantiable0
import typings.octokitCore.anon.Plugins
import typings.octokitCore.distTypesTypesMod.Constructor
import typings.octokitCore.distTypesTypesMod.OctokitOptions
import typings.octokitCore.distTypesTypesMod.OctokitPlugin
import typings.octokitCore.distTypesTypesMod.ReturnTypeOf
import typings.octokitCore.distTypesTypesMod.UnionToIntersection
import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.distTypesTypesMod.DataType
import typings.octokitPluginPaginateRest.distTypesTypesMod.MapFunction
import typings.octokitPluginPaginateRest.distTypesTypesMod.NormalizeResponse
import typings.octokitPluginPaginateRest.distTypesTypesMod.PaginateInterface
import typings.octokitPluginPaginateRest.distTypesTypesMod.PaginationResults
import typings.octokitPluginRestEndpointMethods.anon.AcceptInvitation
import typings.octokitPluginRestEndpointMethods.anon.AddAssignees
import typings.octokitPluginRestEndpointMethods.anon.AddCollaborator
import typings.octokitPluginRestEndpointMethods.anon.AddCustomLabelsToSelfHostedRunnerForEnterprise
import typings.octokitPluginRestEndpointMethods.anon.AddCustomLabelsToSelfHostedRunnerForOrg
import typings.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticated
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembershipForUserInOrg
import typings.octokitPluginRestEndpointMethods.anon.AddRepoToInstallation
import typings.octokitPluginRestEndpointMethods.anon.AddRepositoryForSecretForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.AddSecurityManagerTeam
import typings.octokitPluginRestEndpointMethods.anon.AddSelectedRepoToOrgSecret
import typings.octokitPluginRestEndpointMethods.anon.CancelImport
import typings.octokitPluginRestEndpointMethods.anon.CheckIfMerged
import typings.octokitPluginRestEndpointMethods.anon.CheckIsStarred
import typings.octokitPluginRestEndpointMethods.anon.CheckRepoIsStarredByAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Code
import typings.octokitPluginRestEndpointMethods.anon.Create
import typings.octokitPluginRestEndpointMethods.anon.CreateBlob
import typings.octokitPluginRestEndpointMethods.anon.CreateForCommitComment
import typings.octokitPluginRestEndpointMethods.anon.CreateRepositorySnapshot
import typings.octokitPluginRestEndpointMethods.anon.DeleteAnalysis
import typings.octokitPluginRestEndpointMethods.anon.DeletePackageForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Get
import typings.octokitPluginRestEndpointMethods.anon.Get525
import typings.octokitPluginRestEndpointMethods.anon.GetAlert
import typings.octokitPluginRestEndpointMethods.anon.GetAllCodesOfConduct
import typings.octokitPluginRestEndpointMethods.anon.GetAllCommonlyUsed
import typings.octokitPluginRestEndpointMethods.anon.GetAllTemplates
import typings.octokitPluginRestEndpointMethods.anon.GetAllVersions
import typings.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingOrg
import typings.octokitPluginRestEndpointMethods.anon.GetRestrictionsForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Render
import typings.octokitPluginRestEndpointMethods.distTypesGeneratedMethodTypesMod.RestEndpointMethods
import typings.octokitTypes.distTypesEndpointOptionsMod.EndpointOptions
import typings.octokitTypes.distTypesGetResponseTypeFromEndpointMethodMod.GetResponseTypeFromEndpointMethod
import typings.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import typings.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typings.octokitTypes.distTypesRouteMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofCore
    extends StObject
       with Instantiable0[Octokit] {
    
    var VERSION: String = js.native
    
    def defaults[S /* <: Constructor[Any] */](defaults: js.Function): S = js.native
    def defaults[S /* <: Constructor[Any] */](defaults: OctokitOptions): S = js.native
    
    /**
      * Attach a plugin (or many) to your Octokit instance.
      *
      * @example
      * const API = Octokit.plugin(plugin1, plugin2, plugin3, ...)
      */
    def plugin[S /* <: Constructor[Any] & Plugins */, T /* <: js.Array[OctokitPlugin] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param newPlugins because its type T is not an array type */ newPlugins: T
    ): S & Constructor[UnionToIntersection[ReturnTypeOf[T]]] = js.native
    
    var plugins: js.Array[OctokitPlugin] = js.native
  }
  
  /* Inlined {  paginate :@octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest.PaginateInterface} & @octokit/plugin-rest-endpoint-methods.@octokit/plugin-rest-endpoint-methods/dist-types/generated/method-types.RestEndpointMethods & @octokit/plugin-rest-endpoint-methods.@octokit/plugin-rest-endpoint-methods/dist-types/types.Api */
  trait paginatePaginateInterface extends StObject {
    
    var actions: AddCustomLabelsToSelfHostedRunnerForOrg
    
    var activity: CheckRepoIsStarredByAuthenticatedUser
    
    var apps: AddRepoToInstallation
    
    var billing: GetGithubActionsBillingOrg
    
    var checks: Create
    
    var codeScanning: DeleteAnalysis
    
    var codesOfConduct: GetAllCodesOfConduct
    
    var codespaces: AddRepositoryForSecretForAuthenticatedUser
    
    var dependabot: AddSelectedRepoToOrgSecret
    
    var dependencyGraph: CreateRepositorySnapshot
    
    var emojis: Get
    
    var enterpriseAdmin: AddCustomLabelsToSelfHostedRunnerForEnterprise
    
    var gists: CheckIsStarred
    
    var git: CreateBlob
    
    var gitignore: GetAllTemplates
    
    var interactions: GetRestrictionsForAuthenticatedUser
    
    var issues: AddAssignees
    
    var licenses: GetAllCommonlyUsed
    
    var markdown: Render
    
    var meta: GetAllVersions
    
    var migrations: CancelImport
    
    var orgs: AddSecurityManagerTeam
    
    var packages: DeletePackageForAuthenticatedUser
    
    /**
      * Paginate a request using endpoint options
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    def paginate[T](options: EndpointOptions): js.Promise[PaginationResults[T]]
    /**
      * Paginate a request using an known endpoint route string
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    /**
      * Paginate a request using an endpoint method and parameters
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    def paginate[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 190, starting with typings.octokitRest.octokitRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitRest.octokitRestStrings.`GET SlashappSlashinstallations`, typings.octokitRest.octokitRestStrings.`GET SlashenterprisesSlashLeftcurlybracketenterpriseRightcurlybracketSlashactionsSlashrunner-groups` */ Any */](route: R): js.Promise[
        DataType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
        ]
      ]
    /**
      * Paginate a request using endpoint options and map each response to a custom array
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def paginate[T, M](
      options: EndpointOptions,
      mapFn: MapFunction[OctokitResponse[PaginationResults[T], Double], js.Array[M]]
    ): js.Promise[PaginationResults[M]]
    /**
      * Paginate a request using an endpoint method and a map function
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def paginate[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](request: R, mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]): js.Promise[M]
    def paginate[T, R /* <: Route */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'GET /app/hook/deliveries' | 'GET /app/installations' | 'GET /enterprises/{enterprise}/actions/runner-groups' | 'GET /enterprises/{enterprise}/dependabot/alerts' | 'GET /enterprises/{enterprise}/secret-scanning/alerts' | 'GET /events' | 'GET /gists' | 'GET /gists/public' | 'GET /gists/starred' | 'GET /gists/{gist_id}/comments' | 'GET /gists/{gist_id}/commits' | 'GET /gists/{gist_id}/forks' | 'GET /installation/repositories' | 'GET /issues' | 'GET /licenses' | 'GET /marketplace_listing/plans' | 'GET /marketplace_listing/plans/{plan_id}/accounts' | 'GET /marketplace_listing/stubbed/plans' | 'GET /marketplace_listing/stubbed/plans/{plan_id}/accounts' | 'GET /networks/{owner}/{repo}/events' | 'GET /notifications' | 'GET /organizations' | 'GET /orgs/{org}/actions/cache/usage-by-repository' | 'GET /orgs/{org}/actions/permissions/repositories' | 'GET /orgs/{org}/actions/required_workflows' | 'GET /orgs/{org}/actions/runner-groups' | 'GET /orgs/{org}/actions/runner-groups/{runner_group_id}/repositories' | 'GET /orgs/{org}/actions/runner-groups/{runner_group_id}/runners' | 'GET /orgs/{org}/actions/runners' | 'GET /orgs/{org}/actions/secrets' | 'GET /orgs/{org}/actions/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/actions/variables' | 'GET /orgs/{org}/actions/variables/{name}/repositories' | 'GET /orgs/{org}/blocks' | 'GET /orgs/{org}/code-scanning/alerts' | 'GET /orgs/{org}/codespaces' | 'GET /orgs/{org}/codespaces/secrets' | 'GET /orgs/{org}/codespaces/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/dependabot/alerts' | 'GET /orgs/{org}/dependabot/secrets' | 'GET /orgs/{org}/dependabot/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/events' | 'GET /orgs/{org}/failed_invitations' | 'GET /orgs/{org}/hooks' | 'GET /orgs/{org}/hooks/{hook_id}/deliveries' | 'GET /orgs/{org}/installations' | 'GET /orgs/{org}/invitations' | 'GET /orgs/{org}/invitations/{invitation_id}/teams' | 'GET /orgs/{org}/issues' | 'GET /orgs/{org}/members' | 'GET /orgs/{org}/members/{username}/codespaces' | 'GET /orgs/{org}/migrations' | 'GET /orgs/{org}/migrations/{migration_id}/repositories' | 'GET /orgs/{org}/outside_collaborators' | 'GET /orgs/{org}/packages' | 'GET /orgs/{org}/packages/{package_type}/{package_name}/versions' | 'GET /orgs/{org}/projects' | 'GET /orgs/{org}/public_members' | 'GET /orgs/{org}/repos' | 'GET /orgs/{org}/secret-scanning/alerts' | 'GET /orgs/{org}/teams' | 'GET /orgs/{org}/teams/{team_slug}/discussions' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions' | 'GET /orgs/{org}/teams/{team_slug}/invitations' | 'GET /orgs/{org}/teams/{team_slug}/members' | 'GET /orgs/{org}/teams/{team_slug}/projects' | 'GET /orgs/{org}/teams/{team_slug}/repos' | 'GET /orgs/{org}/teams/{team_slug}/teams' | 'GET /projects/columns/{column_id}/cards' | 'GET /projects/{project_id}/collaborators' | 'GET /projects/{project_id}/columns' | 'GET /repos/{org}/{repo}/actions/required_workflows' | 'GET /repos/{owner}/{repo}/actions/artifacts' | 'GET /repos/{owner}/{repo}/actions/caches' | 'GET /repos/{owner}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/runs' | 'GET /repos/{owner}/{repo}/actions/runners' | 'GET /repos/{owner}/{repo}/actions/runs' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/jobs' | 'GET /repos/{owner}/{repo}/actions/secrets' | 'GET /repos/{owner}/{repo}/actions/variables' | 'GET /repos/{owner}/{repo}/actions/workflows' | 'GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs' | 'GET /repos/{owner}/{repo}/assignees' | 'GET /repos/{owner}/{repo}/branches' | 'GET /repos/{owner}/{repo}/check-runs/{check_run_id}/annotations' | 'GET /repos/{owner}/{repo}/check-suites/{check_suite_id}/check-runs' | 'GET /repos/{owner}/{repo}/code-scanning/alerts' | 'GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances' | 'GET /repos/{owner}/{repo}/code-scanning/analyses' | 'GET /repos/{owner}/{repo}/codespaces' | 'GET /repos/{owner}/{repo}/codespaces/devcontainers' | 'GET /repos/{owner}/{repo}/codespaces/secrets' | 'GET /repos/{owner}/{repo}/collaborators' | 'GET /repos/{owner}/{repo}/comments' | 'GET /repos/{owner}/{repo}/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/commits' | 'GET /repos/{owner}/{repo}/commits/{commit_sha}/comments' | 'GET /repos/{owner}/{repo}/commits/{commit_sha}/pulls' | 'GET /repos/{owner}/{repo}/commits/{ref}/check-runs' | 'GET /repos/{owner}/{repo}/commits/{ref}/check-suites' | 'GET /repos/{owner}/{repo}/commits/{ref}/status' | 'GET /repos/{owner}/{repo}/commits/{ref}/statuses' | 'GET /repos/{owner}/{repo}/contributors' | 'GET /repos/{owner}/{repo}/dependabot/alerts' | 'GET /repos/{owner}/{repo}/dependabot/secrets' | 'GET /repos/{owner}/{repo}/deployments' | 'GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses' | 'GET /repos/{owner}/{repo}/environments' | 'GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies' | 'GET /repos/{owner}/{repo}/events' | 'GET /repos/{owner}/{repo}/forks' | 'GET /repos/{owner}/{repo}/hooks' | 'GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries' | 'GET /repos/{owner}/{repo}/invitations' | 'GET /repos/{owner}/{repo}/issues' | 'GET /repos/{owner}/{repo}/issues/comments' | 'GET /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/issues/events' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/comments' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/events' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/labels' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/reactions' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/timeline' | 'GET /repos/{owner}/{repo}/keys' | 'GET /repos/{owner}/{repo}/labels' | 'GET /repos/{owner}/{repo}/milestones' | 'GET /repos/{owner}/{repo}/milestones/{milestone_number}/labels' | 'GET /repos/{owner}/{repo}/notifications' | 'GET /repos/{owner}/{repo}/pages/builds' | 'GET /repos/{owner}/{repo}/projects' | 'GET /repos/{owner}/{repo}/pulls' | 'GET /repos/{owner}/{repo}/pulls/comments' | 'GET /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/comments' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/commits' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/files' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments' | 'GET /repos/{owner}/{repo}/releases' | 'GET /repos/{owner}/{repo}/releases/{release_id}/assets' | 'GET /repos/{owner}/{repo}/releases/{release_id}/reactions' | 'GET /repos/{owner}/{repo}/secret-scanning/alerts' | 'GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations' | 'GET /repos/{owner}/{repo}/stargazers' | 'GET /repos/{owner}/{repo}/subscribers' | 'GET /repos/{owner}/{repo}/tags' | 'GET /repos/{owner}/{repo}/teams' | 'GET /repos/{owner}/{repo}/topics' | 'GET /repositories' | 'GET /repositories/{repository_id}/environments/{environment_name}/secrets' | 'GET /repositories/{repository_id}/environments/{environment_name}/variables' | 'GET /search/code' | 'GET /search/commits' | 'GET /search/issues' | 'GET /search/labels' | 'GET /search/repositories' | 'GET /search/topics' | 'GET /search/users' | 'GET /teams/{team_id}/discussions' | 'GET /teams/{team_id}/discussions/{discussion_number}/comments' | 'GET /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions' | 'GET /teams/{team_id}/discussions/{discussion_number}/reactions' | 'GET /teams/{team_id}/invitations' | 'GET /teams/{team_id}/members' | 'GET /teams/{team_id}/projects' | 'GET /teams/{team_id}/repos' | 'GET /teams/{team_id}/teams' | 'GET /user/blocks' | 'GET /user/codespaces' | 'GET /user/codespaces/secrets' | 'GET /user/emails' | 'GET /user/followers' | 'GET /user/following' | 'GET /user/gpg_keys' | 'GET /user/installations' | 'GET /user/installations/{installation_id}/repositories' | 'GET /user/issues' | 'GET /user/keys' | 'GET /user/marketplace_purchases' | 'GET /user/marketplace_purchases/stubbed' | 'GET /user/memberships/orgs' | 'GET /user/migrations' | 'GET /user/migrations/{migration_id}/repositories' | 'GET /user/orgs' | 'GET /user/packages' | 'GET /user/packages/{package_type}/{package_name}/versions' | 'GET /user/public_emails' | 'GET /user/repos' | 'GET /user/repository_invitations' | 'GET /user/ssh_signing_keys' | 'GET /user/starred' | 'GET /user/subscriptions' | 'GET /user/teams' | 'GET /users' | 'GET /users/{username}/events' | 'GET /users/{username}/events/orgs/{org}' | 'GET /users/{username}/events/public' | 'GET /users/{username}/followers' | 'GET /users/{username}/following' | 'GET /users/{username}/gists' | 'GET /users/{username}/gpg_keys' | 'GET /users/{username}/keys' | 'GET /users/{username}/orgs' | 'GET /users/{username}/packages' | 'GET /users/{username}/projects' | 'GET /users/{username}/received_events' | 'GET /users/{username}/received_events/public' | 'GET /users/{username}/repos' | 'GET /users/{username}/ssh_signing_keys' | 'GET /users/{username}/starred' | 'GET /users/{username}/subscriptions' ? @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] : @octokit/types.@octokit/types/dist-types/RequestParameters.RequestParameters */ js.Any
    ): js.Promise[js.Array[T]]
    /**
      * Paginate a request using a known endpoint route string and parameters, and map each response to a custom array
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def paginate[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 190, starting with typings.octokitRest.octokitRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitRest.octokitRestStrings.`GET SlashappSlashinstallations`, typings.octokitRest.octokitRestStrings.`GET SlashenterprisesSlashLeftcurlybracketenterpriseRightcurlybracketSlashactionsSlashrunner-groups` */ Any */, M /* <: js.Array[Any] */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any,
      mapFn: MapFunction[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any, 
          M
        ]
    ): js.Promise[M]
    @JSName("paginate")
    def paginate_0[R /* <: RequestInterface[js.Object] */](
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.NormalizeResponse<@octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.GetResponseTypeFromEndpointMethod<R>>['data'] */ js.Any
      ]
    /**
      * Paginate a request using an endpoint method, parameters, and a map function
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    @JSName("paginate")
    def paginate_0[R /* <: RequestInterface[js.Object] */, M /* <: js.Array[Any] */](
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any,
      mapFn: MapFunction[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], M]
    ): js.Promise[M]
    @JSName("paginate")
    var paginate_Original: PaginateInterface
    /**
      * Paginate a request using an unknown endpoint route string
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    @JSName("paginate")
    def paginate_TR[T, R /* <: Route */](route: R): js.Promise[js.Array[T]]
    @JSName("paginate")
    def paginate_parameters[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 190, starting with typings.octokitRest.octokitRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitRest.octokitRestStrings.`GET SlashappSlashinstallations`, typings.octokitRest.octokitRestStrings.`GET SlashenterprisesSlashLeftcurlybracketenterpriseRightcurlybracketSlashactionsSlashrunner-groups` */ Any */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any
    ): js.Promise[
        DataType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
        ]
      ]
    /**
      * Paginate a request using a known endpoint route string and map each response to a custom array
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    @JSName("paginate")
    def paginate_response[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 190, starting with typings.octokitRest.octokitRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitRest.octokitRestStrings.`GET SlashappSlashinstallations`, typings.octokitRest.octokitRestStrings.`GET SlashenterprisesSlashLeftcurlybracketenterpriseRightcurlybracketSlashactionsSlashrunner-groups` */ Any */, M /* <: js.Array[Any] */](
      route: R,
      mapFn: MapFunction[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any, 
          M
        ]
    ): js.Promise[M]
    
    var projects: AddCollaborator
    
    var pulls: CheckIfMerged
    
    var rateLimit: Get525
    
    var reactions: CreateForCommitComment
    
    var repos: AcceptInvitation
    
    var rest: RestEndpointMethods
    
    var search: Code
    
    var secretScanning: GetAlert
    
    var teams: AddOrUpdateMembershipForUserInOrg
    
    var users: AddEmailForAuthenticated
  }
  object paginatePaginateInterface {
    
    inline def apply(
      actions: AddCustomLabelsToSelfHostedRunnerForOrg,
      activity: CheckRepoIsStarredByAuthenticatedUser,
      apps: AddRepoToInstallation,
      billing: GetGithubActionsBillingOrg,
      checks: Create,
      codeScanning: DeleteAnalysis,
      codesOfConduct: GetAllCodesOfConduct,
      codespaces: AddRepositoryForSecretForAuthenticatedUser,
      dependabot: AddSelectedRepoToOrgSecret,
      dependencyGraph: CreateRepositorySnapshot,
      emojis: Get,
      enterpriseAdmin: AddCustomLabelsToSelfHostedRunnerForEnterprise,
      gists: CheckIsStarred,
      git: CreateBlob,
      gitignore: GetAllTemplates,
      interactions: GetRestrictionsForAuthenticatedUser,
      issues: AddAssignees,
      licenses: GetAllCommonlyUsed,
      markdown: Render,
      meta: GetAllVersions,
      migrations: CancelImport,
      orgs: AddSecurityManagerTeam,
      packages: DeletePackageForAuthenticatedUser,
      paginate: PaginateInterface,
      projects: AddCollaborator,
      pulls: CheckIfMerged,
      rateLimit: Get525,
      reactions: CreateForCommitComment,
      repos: AcceptInvitation,
      rest: RestEndpointMethods,
      search: Code,
      secretScanning: GetAlert,
      teams: AddOrUpdateMembershipForUserInOrg,
      users: AddEmailForAuthenticated
    ): paginatePaginateInterface = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], codespaces = codespaces.asInstanceOf[js.Any], dependabot = dependabot.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], enterpriseAdmin = enterpriseAdmin.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], paginate = paginate.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], secretScanning = secretScanning.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[paginatePaginateInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: paginatePaginateInterface] (val x: Self) extends AnyVal {
      
      inline def setActions(value: AddCustomLabelsToSelfHostedRunnerForOrg): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActivity(value: CheckRepoIsStarredByAuthenticatedUser): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setApps(value: AddRepoToInstallation): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: GetGithubActionsBillingOrg): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: Create): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setCodeScanning(value: DeleteAnalysis): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      inline def setCodesOfConduct(value: GetAllCodesOfConduct): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      inline def setCodespaces(value: AddRepositoryForSecretForAuthenticatedUser): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
      
      inline def setDependabot(value: AddSelectedRepoToOrgSecret): Self = StObject.set(x, "dependabot", value.asInstanceOf[js.Any])
      
      inline def setDependencyGraph(value: CreateRepositorySnapshot): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: Get): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setEnterpriseAdmin(value: AddCustomLabelsToSelfHostedRunnerForEnterprise): Self = StObject.set(x, "enterpriseAdmin", value.asInstanceOf[js.Any])
      
      inline def setGists(value: CheckIsStarred): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      inline def setGit(value: CreateBlob): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitignore(value: GetAllTemplates): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setInteractions(value: GetRestrictionsForAuthenticatedUser): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: AddAssignees): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: GetAllCommonlyUsed): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setMarkdown(value: Render): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: GetAllVersions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: CancelImport): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: AddSecurityManagerTeam): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: DeletePackageForAuthenticatedUser): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPaginate(value: PaginateInterface): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: AddCollaborator): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CheckIfMerged): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get525): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: CreateForCommitComment): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: AcceptInvitation): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      inline def setRest(value: RestEndpointMethods): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Code): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSecretScanning(value: GetAlert): Self = StObject.set(x, "secretScanning", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: AddOrUpdateMembershipForUserInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: AddEmailForAuthenticated): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
