package typings.octokitRest

import org.scalablytyped.runtime.Instantiable0
import typings.octokitCore.anon.Plugins
import typings.octokitCore.mod.Octokit
import typings.octokitCore.typesMod.Constructor
import typings.octokitCore.typesMod.OctokitOptions
import typings.octokitCore.typesMod.OctokitPlugin
import typings.octokitCore.typesMod.ReturnTypeOf
import typings.octokitCore.typesMod.UnionToIntersection
import typings.octokitPluginPaginateRest.typesMod.DataType
import typings.octokitPluginPaginateRest.typesMod.MapFunction
import typings.octokitPluginPaginateRest.typesMod.NormalizeResponse
import typings.octokitPluginPaginateRest.typesMod.PaginateInterface
import typings.octokitPluginPaginateRest.typesMod.PaginationResults
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
import typings.octokitPluginRestEndpointMethods.anon.Get494
import typings.octokitPluginRestEndpointMethods.anon.GetAlert
import typings.octokitPluginRestEndpointMethods.anon.GetAllCodesOfConduct
import typings.octokitPluginRestEndpointMethods.anon.GetAllCommonlyUsed
import typings.octokitPluginRestEndpointMethods.anon.GetAllTemplates
import typings.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingOrg
import typings.octokitPluginRestEndpointMethods.anon.GetOctocat
import typings.octokitPluginRestEndpointMethods.anon.GetRestrictionsForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Render
import typings.octokitPluginRestEndpointMethods.methodTypesMod.RestEndpointMethods
import typings.octokitTypes.endpointOptionsMod.EndpointOptions
import typings.octokitTypes.getResponseTypeFromEndpointMethodMod.GetResponseTypeFromEndpointMethod
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
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
    
    var meta: GetOctocat
    
    var migrations: CancelImport
    
    var orgs: AddSecurityManagerTeam
    
    var packages: DeletePackageForAuthenticatedUser
    
    /**
      * Paginate a request using endpoint options
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def paginate[T](options: EndpointOptions): js.Promise[PaginationResults[T]]
    /**
      * Paginate a request using an endpoint method and parameters
      *
      * @param {string} request Request method (`octokit.request` or `@octokit/request`)
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    def paginate[R /* <: RequestInterface[js.Object] */](request: R): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/types.NormalizeResponse<@octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.GetResponseTypeFromEndpointMethod<R>>['data'] */ js.Any
      ]
    /**
      * Paginate a request using endpoint options and map each response to a custom array
      *
      * @param {object} options Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
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
      parameters: RequestParameters | (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['parameters'] */ js.Any)
    ): js.Promise[js.Array[T]]
    /**
      * Paginate a request using a known endpoint route string and parameters, and map each response to a custom array
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      * @param {function} mapFn Optional method to map each response to a custom array
      */
    def paginate[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */, M /* <: js.Array[Any] */](
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
      * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
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
      * Paginate a request using an known endpoint route string
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    @JSName("paginate")
    def paginate_R_Any[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */](route: R): js.Promise[
        DataType[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any
        ]
      ]
    /**
      * Paginate a request using an unknown endpoint route string
      *
      * @param {string} route Request method + URL. Example: `'GET /orgs/{org}'`
      * @param {object} parameters? URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
      */
    @JSName("paginate")
    def paginate_TR_Route[T, R /* <: Route */](route: R): js.Promise[js.Array[T]]
    @JSName("paginate")
    def paginate_parameters[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */](
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
    def paginate_response[R /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 214 */ Any */, M /* <: js.Array[Any] */](
      route: R,
      mapFn: MapFunction[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest/dist-types/generated/paginating-endpoints.PaginatingEndpoints[R]['response'] */ js.Any, 
          M
        ]
    ): js.Promise[M]
    
    var projects: AddCollaborator
    
    var pulls: CheckIfMerged
    
    var rateLimit: Get494
    
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
      meta: GetOctocat,
      migrations: CancelImport,
      orgs: AddSecurityManagerTeam,
      packages: DeletePackageForAuthenticatedUser,
      paginate: PaginateInterface,
      projects: AddCollaborator,
      pulls: CheckIfMerged,
      rateLimit: Get494,
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
    
    extension [Self <: paginatePaginateInterface](x: Self) {
      
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
      
      inline def setMeta(value: GetOctocat): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: CancelImport): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: AddSecurityManagerTeam): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: DeletePackageForAuthenticatedUser): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPaginate(value: PaginateInterface): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: AddCollaborator): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CheckIfMerged): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get494): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
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
