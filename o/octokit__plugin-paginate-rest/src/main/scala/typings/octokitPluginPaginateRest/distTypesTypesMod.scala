package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.anon.DataGetResultsType
import typings.octokitTypes.distTypesEndpointOptionsMod.EndpointOptions
import typings.octokitTypes.distTypesGetResponseTypeFromEndpointMethodMod.GetResponseTypeFromEndpointMethod
import typings.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import typings.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typings.octokitTypes.distTypesRouteMod.Route
import typings.std.AsyncIterableIterator
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  @js.native
  trait ComposePaginateInterface extends StObject {
    
    /**
      * Paginate a request using endpoint options
      *
      * @param {object} octokit Octokit instance
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    def apply[T](octokit: Octokit, options: EndpointOptions): js.Promise[PaginationResults[T]] = js.native
    /**
      * Paginate a request using an known endpoint route string
      *
      * @param {object} octokit Octokit instance
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    /**
      * Paginate a request using an endpoint method and parameters
      *
      * @param {object} octokit Octokit instance
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](octokit: Octokit, route: R): js.Promise[
        DataType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
        ]
      ] = js.native
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](
      octokit: Octokit,
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): js.Promise[
        DataType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
        ]
      ] = js.native
    /**
      * Paginate a request using endpoint options and map each response to a custom array
      *
      * @param {object} octokit Octokit instance
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def apply[T, M](
      octokit: Octokit,
      options: EndpointOptions,
      mapFn: MapFunction[OctokitResponse[PaginationResults[T], Double], js.Array[M]]
    ): js.Promise[PaginationResults[M]] = js.native
    /**
      * Paginate a request using a known endpoint route string and map each response to a custom array
      *
      * @param {object} octokit Octokit instance
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    /**
      * Paginate a request using an endpoint method and a map function
      *
      * @param {object} octokit Octokit instance
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */, M /* <: js.Array[Any] */](
      octokit: Octokit,
      route: R,
      mapFn: MapFunction[
          (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any) | NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], 
          M
        ]
    ): js.Promise[M] = js.native
    /**
      * Paginate a request using a known endpoint route string and parameters, and map each response to a custom array
      *
      * @param {object} octokit Octokit instance
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    /**
      * Paginate a request using an endpoint method, parameters, and a map function
      *
      * @param {object} octokit Octokit instance
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */, M /* <: js.Array[Any] */](
      octokit: Octokit,
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any,
      mapFn: MapFunction[
          (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any) | NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], 
          M
        ]
    ): js.Promise[M] = js.native
    
    def iterator[T](octokit: Octokit, options: EndpointOptions): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    def iterator[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](octokit: Octokit, route: R): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
    def iterator[T, R /* <: Route */](
      octokit: Octokit,
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'GET /app/hook/deliveries' | 'GET /app/installation-requests' | 'GET /app/installations' | 'GET /enterprises/{enterprise}/dependabot/alerts' | 'GET /enterprises/{enterprise}/secret-scanning/alerts' | 'GET /events' | 'GET /gists' | 'GET /gists/public' | 'GET /gists/starred' | 'GET /gists/{gist_id}/comments' | 'GET /gists/{gist_id}/commits' | 'GET /gists/{gist_id}/forks' | 'GET /installation/repositories' | 'GET /issues' | 'GET /licenses' | 'GET /marketplace_listing/plans' | 'GET /marketplace_listing/plans/{plan_id}/accounts' | 'GET /marketplace_listing/stubbed/plans' | 'GET /marketplace_listing/stubbed/plans/{plan_id}/accounts' | 'GET /networks/{owner}/{repo}/events' | 'GET /notifications' | 'GET /organizations' | 'GET /organizations/{org}/personal-access-token-requests' | 'GET /organizations/{org}/personal-access-token-requests/{pat_request_id}/repositories' | 'GET /organizations/{org}/personal-access-tokens' | 'GET /organizations/{org}/personal-access-tokens/{pat_id}/repositories' | 'GET /orgs/{org}/actions/cache/usage-by-repository' | 'GET /orgs/{org}/actions/permissions/repositories' | 'GET /orgs/{org}/actions/required_workflows' | 'GET /orgs/{org}/actions/runners' | 'GET /orgs/{org}/actions/secrets' | 'GET /orgs/{org}/actions/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/actions/variables' | 'GET /orgs/{org}/actions/variables/{name}/repositories' | 'GET /orgs/{org}/blocks' | 'GET /orgs/{org}/code-scanning/alerts' | 'GET /orgs/{org}/codespaces' | 'GET /orgs/{org}/codespaces/secrets' | 'GET /orgs/{org}/codespaces/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/dependabot/alerts' | 'GET /orgs/{org}/dependabot/secrets' | 'GET /orgs/{org}/dependabot/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/events' | 'GET /orgs/{org}/failed_invitations' | 'GET /orgs/{org}/hooks' | 'GET /orgs/{org}/hooks/{hook_id}/deliveries' | 'GET /orgs/{org}/installations' | 'GET /orgs/{org}/invitations' | 'GET /orgs/{org}/invitations/{invitation_id}/teams' | 'GET /orgs/{org}/issues' | 'GET /orgs/{org}/members' | 'GET /orgs/{org}/members/{username}/codespaces' | 'GET /orgs/{org}/migrations' | 'GET /orgs/{org}/migrations/{migration_id}/repositories' | 'GET /orgs/{org}/outside_collaborators' | 'GET /orgs/{org}/packages' | 'GET /orgs/{org}/packages/{package_type}/{package_name}/versions' | 'GET /orgs/{org}/projects' | 'GET /orgs/{org}/public_members' | 'GET /orgs/{org}/repos' | 'GET /orgs/{org}/rulesets' | 'GET /orgs/{org}/secret-scanning/alerts' | 'GET /orgs/{org}/teams' | 'GET /orgs/{org}/teams/{team_slug}/discussions' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions' | 'GET /orgs/{org}/teams/{team_slug}/invitations' | 'GET /orgs/{org}/teams/{team_slug}/members' | 'GET /orgs/{org}/teams/{team_slug}/projects' | 'GET /orgs/{org}/teams/{team_slug}/repos' | 'GET /orgs/{org}/teams/{team_slug}/teams' | 'GET /projects/columns/{column_id}/cards' | 'GET /projects/{project_id}/collaborators' | 'GET /projects/{project_id}/columns' | 'GET /repos/{org}/{repo}/actions/required_workflows' | 'GET /repos/{owner}/{repo}/actions/artifacts' | 'GET /repos/{owner}/{repo}/actions/caches' | 'GET /repos/{owner}/{repo}/actions/organization-secrets' | 'GET /repos/{owner}/{repo}/actions/organization-variables' | 'GET /repos/{owner}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/runs' | 'GET /repos/{owner}/{repo}/actions/runners' | 'GET /repos/{owner}/{repo}/actions/runs' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/jobs' | 'GET /repos/{owner}/{repo}/actions/secrets' | 'GET /repos/{owner}/{repo}/actions/variables' | 'GET /repos/{owner}/{repo}/actions/workflows' | 'GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs' | 'GET /repos/{owner}/{repo}/assignees' | 'GET /repos/{owner}/{repo}/branches' | 'GET /repos/{owner}/{repo}/check-runs/{check_run_id}/annotations' | 'GET /repos/{owner}/{repo}/check-suites/{check_suite_id}/check-runs' | 'GET /repos/{owner}/{repo}/code-scanning/alerts' | 'GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances' | 'GET /repos/{owner}/{repo}/code-scanning/analyses' | 'GET /repos/{owner}/{repo}/codespaces' | 'GET /repos/{owner}/{repo}/codespaces/devcontainers' | 'GET /repos/{owner}/{repo}/codespaces/secrets' | 'GET /repos/{owner}/{repo}/collaborators' | 'GET /repos/{owner}/{repo}/comments' | 'GET /repos/{owner}/{repo}/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/commits' | 'GET /repos/{owner}/{repo}/commits/{commit_sha}/comments' | 'GET /repos/{owner}/{repo}/commits/{commit_sha}/pulls' | 'GET /repos/{owner}/{repo}/commits/{ref}/check-runs' | 'GET /repos/{owner}/{repo}/commits/{ref}/check-suites' | 'GET /repos/{owner}/{repo}/commits/{ref}/status' | 'GET /repos/{owner}/{repo}/commits/{ref}/statuses' | 'GET /repos/{owner}/{repo}/contributors' | 'GET /repos/{owner}/{repo}/dependabot/alerts' | 'GET /repos/{owner}/{repo}/dependabot/secrets' | 'GET /repos/{owner}/{repo}/deployments' | 'GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses' | 'GET /repos/{owner}/{repo}/environments' | 'GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies' | 'GET /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/apps' | 'GET /repos/{owner}/{repo}/events' | 'GET /repos/{owner}/{repo}/forks' | 'GET /repos/{owner}/{repo}/hooks' | 'GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries' | 'GET /repos/{owner}/{repo}/invitations' | 'GET /repos/{owner}/{repo}/issues' | 'GET /repos/{owner}/{repo}/issues/comments' | 'GET /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/issues/events' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/comments' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/events' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/labels' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/reactions' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/timeline' | 'GET /repos/{owner}/{repo}/keys' | 'GET /repos/{owner}/{repo}/labels' | 'GET /repos/{owner}/{repo}/milestones' | 'GET /repos/{owner}/{repo}/milestones/{milestone_number}/labels' | 'GET /repos/{owner}/{repo}/notifications' | 'GET /repos/{owner}/{repo}/pages/builds' | 'GET /repos/{owner}/{repo}/projects' | 'GET /repos/{owner}/{repo}/pulls' | 'GET /repos/{owner}/{repo}/pulls/comments' | 'GET /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/comments' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/commits' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/files' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments' | 'GET /repos/{owner}/{repo}/releases' | 'GET /repos/{owner}/{repo}/releases/{release_id}/assets' | 'GET /repos/{owner}/{repo}/releases/{release_id}/reactions' | 'GET /repos/{owner}/{repo}/rules/branches/{branch}' | 'GET /repos/{owner}/{repo}/rulesets' | 'GET /repos/{owner}/{repo}/secret-scanning/alerts' | 'GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations' | 'GET /repos/{owner}/{repo}/security-advisories' | 'GET /repos/{owner}/{repo}/stargazers' | 'GET /repos/{owner}/{repo}/subscribers' | 'GET /repos/{owner}/{repo}/tags' | 'GET /repos/{owner}/{repo}/teams' | 'GET /repos/{owner}/{repo}/topics' | 'GET /repositories' | 'GET /repositories/{repository_id}/environments/{environment_name}/secrets' | 'GET /repositories/{repository_id}/environments/{environment_name}/variables' | 'GET /search/code' | 'GET /search/commits' | 'GET /search/issues' | 'GET /search/labels' | 'GET /search/repositories' | 'GET /search/topics' | 'GET /search/users' | 'GET /teams/{team_id}/discussions' | 'GET /teams/{team_id}/discussions/{discussion_number}/comments' | 'GET /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions' | 'GET /teams/{team_id}/discussions/{discussion_number}/reactions' | 'GET /teams/{team_id}/invitations' | 'GET /teams/{team_id}/members' | 'GET /teams/{team_id}/projects' | 'GET /teams/{team_id}/repos' | 'GET /teams/{team_id}/teams' | 'GET /user/blocks' | 'GET /user/codespaces' | 'GET /user/codespaces/secrets' | 'GET /user/emails' | 'GET /user/followers' | 'GET /user/following' | 'GET /user/gpg_keys' | 'GET /user/installations' | 'GET /user/installations/{installation_id}/repositories' | 'GET /user/issues' | 'GET /user/keys' | 'GET /user/marketplace_purchases' | 'GET /user/marketplace_purchases/stubbed' | 'GET /user/memberships/orgs' | 'GET /user/migrations' | 'GET /user/migrations/{migration_id}/repositories' | 'GET /user/orgs' | 'GET /user/packages' | 'GET /user/packages/{package_type}/{package_name}/versions' | 'GET /user/public_emails' | 'GET /user/repos' | 'GET /user/repository_invitations' | 'GET /user/social_accounts' | 'GET /user/ssh_signing_keys' | 'GET /user/starred' | 'GET /user/subscriptions' | 'GET /user/teams' | 'GET /users' | 'GET /users/{username}/events' | 'GET /users/{username}/events/orgs/{org}' | 'GET /users/{username}/events/public' | 'GET /users/{username}/followers' | 'GET /users/{username}/following' | 'GET /users/{username}/gists' | 'GET /users/{username}/gpg_keys' | 'GET /users/{username}/keys' | 'GET /users/{username}/orgs' | 'GET /users/{username}/packages' | 'GET /users/{username}/projects' | 'GET /users/{username}/received_events' | 'GET /users/{username}/received_events/public' | 'GET /users/{username}/repos' | 'GET /users/{username}/social_accounts' | 'GET /users/{username}/ssh_signing_keys' | 'GET /users/{username}/starred' | 'GET /users/{username}/subscriptions' ? @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] : @octokit/types.@octokit/types/dist-types/RequestParameters.RequestParameters */ js.Any
    ): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_0[R /* <: RequestInterface[js.Object] */](
      octokit: Octokit,
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): AsyncIterableIterator[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]]] = js.native
    @JSName("iterator")
    def iterator_TR[T, R /* <: Route */](octokit: Octokit, route: R): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_parameters[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](
      octokit: Octokit,
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any
    ): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    'data' extends keyof T ? T['data'] : unknown
    }}}
    */
  @js.native
  trait DataType[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {  data :std.Array<any>} ? T['data'] : T extends {  data :object} ? T['data'][@octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.KnownKeysMatching<T['data'], std.Array<any>>] : never
    }}}
    */
  @js.native
  trait GetResultsType[T] extends StObject
  
  type KeysMatching[T, V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends V? K : never}[keyof T] */ js.Any
  
  type KnownKeys[T] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: string extends K? never : number extends K? never : K} extends {[ _ in keyof T ]: infer U} ? U : never */ js.Any, 
    /* keyof T */ String
  ]
  
  type KnownKeysMatching[T, V] = KeysMatching[Pick[T, KnownKeys[T]], V]
  
  type MapFunction[T, M] = js.Function2[/* response */ T, /* done */ js.Function0[Unit], M]
  
  type NormalizeResponse[T] = T & DataGetResultsType[T]
  
  @js.native
  trait PaginateInterface extends StObject {
    
    /**
      * Paginate a request using endpoint options
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      */
    def apply[T](options: EndpointOptions): js.Promise[PaginationResults[T]] = js.native
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
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](route: R): js.Promise[
        DataType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
        ]
      ] = js.native
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): js.Promise[
        DataType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
        ]
      ] = js.native
    /**
      * Paginate a request using endpoint options and map each response to a custom array
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def apply[T, M](
      options: EndpointOptions,
      mapFn: MapFunction[OctokitResponse[PaginationResults[T], Double], js.Array[M]]
    ): js.Promise[PaginationResults[M]] = js.native
    /**
      * Paginate a request using a known endpoint route string and map each response to a custom array
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    /**
      * Paginate a request using an endpoint method and a map function
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */, M /* <: js.Array[Any] */](
      route: R,
      mapFn: MapFunction[
          (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any) | NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], 
          M
        ]
    ): js.Promise[M] = js.native
    /**
      * Paginate a request using a known endpoint route string and parameters, and map each response to a custom array
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    /**
      * Paginate a request using an endpoint method, parameters, and a map function
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.format`, `request`, or `baseUrl`.
      * @param {function} mapFn? Optional method to map each response to a custom array
      */
    def apply[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */, M /* <: js.Array[Any] */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any,
      mapFn: MapFunction[
          (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any) | NormalizeResponse[GetResponseTypeFromEndpointMethod[R]], 
          M
        ]
    ): js.Promise[M] = js.native
    
    def iterator[T](options: EndpointOptions): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    def iterator[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](route: R): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
    def iterator[T, R /* <: Route */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'GET /app/hook/deliveries' | 'GET /app/installation-requests' | 'GET /app/installations' | 'GET /enterprises/{enterprise}/dependabot/alerts' | 'GET /enterprises/{enterprise}/secret-scanning/alerts' | 'GET /events' | 'GET /gists' | 'GET /gists/public' | 'GET /gists/starred' | 'GET /gists/{gist_id}/comments' | 'GET /gists/{gist_id}/commits' | 'GET /gists/{gist_id}/forks' | 'GET /installation/repositories' | 'GET /issues' | 'GET /licenses' | 'GET /marketplace_listing/plans' | 'GET /marketplace_listing/plans/{plan_id}/accounts' | 'GET /marketplace_listing/stubbed/plans' | 'GET /marketplace_listing/stubbed/plans/{plan_id}/accounts' | 'GET /networks/{owner}/{repo}/events' | 'GET /notifications' | 'GET /organizations' | 'GET /organizations/{org}/personal-access-token-requests' | 'GET /organizations/{org}/personal-access-token-requests/{pat_request_id}/repositories' | 'GET /organizations/{org}/personal-access-tokens' | 'GET /organizations/{org}/personal-access-tokens/{pat_id}/repositories' | 'GET /orgs/{org}/actions/cache/usage-by-repository' | 'GET /orgs/{org}/actions/permissions/repositories' | 'GET /orgs/{org}/actions/required_workflows' | 'GET /orgs/{org}/actions/runners' | 'GET /orgs/{org}/actions/secrets' | 'GET /orgs/{org}/actions/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/actions/variables' | 'GET /orgs/{org}/actions/variables/{name}/repositories' | 'GET /orgs/{org}/blocks' | 'GET /orgs/{org}/code-scanning/alerts' | 'GET /orgs/{org}/codespaces' | 'GET /orgs/{org}/codespaces/secrets' | 'GET /orgs/{org}/codespaces/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/dependabot/alerts' | 'GET /orgs/{org}/dependabot/secrets' | 'GET /orgs/{org}/dependabot/secrets/{secret_name}/repositories' | 'GET /orgs/{org}/events' | 'GET /orgs/{org}/failed_invitations' | 'GET /orgs/{org}/hooks' | 'GET /orgs/{org}/hooks/{hook_id}/deliveries' | 'GET /orgs/{org}/installations' | 'GET /orgs/{org}/invitations' | 'GET /orgs/{org}/invitations/{invitation_id}/teams' | 'GET /orgs/{org}/issues' | 'GET /orgs/{org}/members' | 'GET /orgs/{org}/members/{username}/codespaces' | 'GET /orgs/{org}/migrations' | 'GET /orgs/{org}/migrations/{migration_id}/repositories' | 'GET /orgs/{org}/outside_collaborators' | 'GET /orgs/{org}/packages' | 'GET /orgs/{org}/packages/{package_type}/{package_name}/versions' | 'GET /orgs/{org}/projects' | 'GET /orgs/{org}/public_members' | 'GET /orgs/{org}/repos' | 'GET /orgs/{org}/rulesets' | 'GET /orgs/{org}/secret-scanning/alerts' | 'GET /orgs/{org}/teams' | 'GET /orgs/{org}/teams/{team_slug}/discussions' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions' | 'GET /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions' | 'GET /orgs/{org}/teams/{team_slug}/invitations' | 'GET /orgs/{org}/teams/{team_slug}/members' | 'GET /orgs/{org}/teams/{team_slug}/projects' | 'GET /orgs/{org}/teams/{team_slug}/repos' | 'GET /orgs/{org}/teams/{team_slug}/teams' | 'GET /projects/columns/{column_id}/cards' | 'GET /projects/{project_id}/collaborators' | 'GET /projects/{project_id}/columns' | 'GET /repos/{org}/{repo}/actions/required_workflows' | 'GET /repos/{owner}/{repo}/actions/artifacts' | 'GET /repos/{owner}/{repo}/actions/caches' | 'GET /repos/{owner}/{repo}/actions/organization-secrets' | 'GET /repos/{owner}/{repo}/actions/organization-variables' | 'GET /repos/{owner}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/runs' | 'GET /repos/{owner}/{repo}/actions/runners' | 'GET /repos/{owner}/{repo}/actions/runs' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs' | 'GET /repos/{owner}/{repo}/actions/runs/{run_id}/jobs' | 'GET /repos/{owner}/{repo}/actions/secrets' | 'GET /repos/{owner}/{repo}/actions/variables' | 'GET /repos/{owner}/{repo}/actions/workflows' | 'GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs' | 'GET /repos/{owner}/{repo}/assignees' | 'GET /repos/{owner}/{repo}/branches' | 'GET /repos/{owner}/{repo}/check-runs/{check_run_id}/annotations' | 'GET /repos/{owner}/{repo}/check-suites/{check_suite_id}/check-runs' | 'GET /repos/{owner}/{repo}/code-scanning/alerts' | 'GET /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances' | 'GET /repos/{owner}/{repo}/code-scanning/analyses' | 'GET /repos/{owner}/{repo}/codespaces' | 'GET /repos/{owner}/{repo}/codespaces/devcontainers' | 'GET /repos/{owner}/{repo}/codespaces/secrets' | 'GET /repos/{owner}/{repo}/collaborators' | 'GET /repos/{owner}/{repo}/comments' | 'GET /repos/{owner}/{repo}/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/commits' | 'GET /repos/{owner}/{repo}/commits/{commit_sha}/comments' | 'GET /repos/{owner}/{repo}/commits/{commit_sha}/pulls' | 'GET /repos/{owner}/{repo}/commits/{ref}/check-runs' | 'GET /repos/{owner}/{repo}/commits/{ref}/check-suites' | 'GET /repos/{owner}/{repo}/commits/{ref}/status' | 'GET /repos/{owner}/{repo}/commits/{ref}/statuses' | 'GET /repos/{owner}/{repo}/contributors' | 'GET /repos/{owner}/{repo}/dependabot/alerts' | 'GET /repos/{owner}/{repo}/dependabot/secrets' | 'GET /repos/{owner}/{repo}/deployments' | 'GET /repos/{owner}/{repo}/deployments/{deployment_id}/statuses' | 'GET /repos/{owner}/{repo}/environments' | 'GET /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies' | 'GET /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/apps' | 'GET /repos/{owner}/{repo}/events' | 'GET /repos/{owner}/{repo}/forks' | 'GET /repos/{owner}/{repo}/hooks' | 'GET /repos/{owner}/{repo}/hooks/{hook_id}/deliveries' | 'GET /repos/{owner}/{repo}/invitations' | 'GET /repos/{owner}/{repo}/issues' | 'GET /repos/{owner}/{repo}/issues/comments' | 'GET /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/issues/events' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/comments' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/events' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/labels' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/reactions' | 'GET /repos/{owner}/{repo}/issues/{issue_number}/timeline' | 'GET /repos/{owner}/{repo}/keys' | 'GET /repos/{owner}/{repo}/labels' | 'GET /repos/{owner}/{repo}/milestones' | 'GET /repos/{owner}/{repo}/milestones/{milestone_number}/labels' | 'GET /repos/{owner}/{repo}/notifications' | 'GET /repos/{owner}/{repo}/pages/builds' | 'GET /repos/{owner}/{repo}/projects' | 'GET /repos/{owner}/{repo}/pulls' | 'GET /repos/{owner}/{repo}/pulls/comments' | 'GET /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/comments' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/commits' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/files' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews' | 'GET /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments' | 'GET /repos/{owner}/{repo}/releases' | 'GET /repos/{owner}/{repo}/releases/{release_id}/assets' | 'GET /repos/{owner}/{repo}/releases/{release_id}/reactions' | 'GET /repos/{owner}/{repo}/rules/branches/{branch}' | 'GET /repos/{owner}/{repo}/rulesets' | 'GET /repos/{owner}/{repo}/secret-scanning/alerts' | 'GET /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations' | 'GET /repos/{owner}/{repo}/security-advisories' | 'GET /repos/{owner}/{repo}/stargazers' | 'GET /repos/{owner}/{repo}/subscribers' | 'GET /repos/{owner}/{repo}/tags' | 'GET /repos/{owner}/{repo}/teams' | 'GET /repos/{owner}/{repo}/topics' | 'GET /repositories' | 'GET /repositories/{repository_id}/environments/{environment_name}/secrets' | 'GET /repositories/{repository_id}/environments/{environment_name}/variables' | 'GET /search/code' | 'GET /search/commits' | 'GET /search/issues' | 'GET /search/labels' | 'GET /search/repositories' | 'GET /search/topics' | 'GET /search/users' | 'GET /teams/{team_id}/discussions' | 'GET /teams/{team_id}/discussions/{discussion_number}/comments' | 'GET /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions' | 'GET /teams/{team_id}/discussions/{discussion_number}/reactions' | 'GET /teams/{team_id}/invitations' | 'GET /teams/{team_id}/members' | 'GET /teams/{team_id}/projects' | 'GET /teams/{team_id}/repos' | 'GET /teams/{team_id}/teams' | 'GET /user/blocks' | 'GET /user/codespaces' | 'GET /user/codespaces/secrets' | 'GET /user/emails' | 'GET /user/followers' | 'GET /user/following' | 'GET /user/gpg_keys' | 'GET /user/installations' | 'GET /user/installations/{installation_id}/repositories' | 'GET /user/issues' | 'GET /user/keys' | 'GET /user/marketplace_purchases' | 'GET /user/marketplace_purchases/stubbed' | 'GET /user/memberships/orgs' | 'GET /user/migrations' | 'GET /user/migrations/{migration_id}/repositories' | 'GET /user/orgs' | 'GET /user/packages' | 'GET /user/packages/{package_type}/{package_name}/versions' | 'GET /user/public_emails' | 'GET /user/repos' | 'GET /user/repository_invitations' | 'GET /user/social_accounts' | 'GET /user/ssh_signing_keys' | 'GET /user/starred' | 'GET /user/subscriptions' | 'GET /user/teams' | 'GET /users' | 'GET /users/{username}/events' | 'GET /users/{username}/events/orgs/{org}' | 'GET /users/{username}/events/public' | 'GET /users/{username}/followers' | 'GET /users/{username}/following' | 'GET /users/{username}/gists' | 'GET /users/{username}/gpg_keys' | 'GET /users/{username}/keys' | 'GET /users/{username}/orgs' | 'GET /users/{username}/packages' | 'GET /users/{username}/projects' | 'GET /users/{username}/received_events' | 'GET /users/{username}/received_events/public' | 'GET /users/{username}/repos' | 'GET /users/{username}/social_accounts' | 'GET /users/{username}/ssh_signing_keys' | 'GET /users/{username}/starred' | 'GET /users/{username}/subscriptions' ? @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] : @octokit/types.@octokit/types/dist-types/RequestParameters.RequestParameters */ js.Any
    ): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_0[R /* <: RequestInterface[js.Object] */](
      request: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<R>[0] */ js.Any
    ): AsyncIterableIterator[NormalizeResponse[GetResponseTypeFromEndpointMethod[R]]] = js.native
    @JSName("iterator")
    def iterator_TR[T, R /* <: Route */](route: R): AsyncIterableIterator[OctokitResponse[PaginationResults[T], Double]] = js.native
    @JSName("iterator")
    def iterator_parameters[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 199, starting with typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallation-requests`, typings.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations` */ Any */](
      route: R,
      parameters: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any
    ): AsyncIterableIterator[
        OctokitResponse[
          DataType[
            /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
          ], 
          Double
        ]
      ] = js.native
  }
  
  type PaginationResults[T] = js.Array[T]
}
