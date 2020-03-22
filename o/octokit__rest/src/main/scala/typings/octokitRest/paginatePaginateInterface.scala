package typings.octokitRest

import typings.octokitPluginPaginateRest.typesMod.MapFunction
import typings.octokitPluginPaginateRest.typesMod.PaginateInterface
import typings.octokitPluginPaginateRest.typesMod.PaginationResults
import typings.octokitPluginRestEndpointMethods.AnonAcceptInvitation
import typings.octokitPluginRestEndpointMethods.AnonAddAssignees
import typings.octokitPluginRestEndpointMethods.AnonAddCollaborator
import typings.octokitPluginRestEndpointMethods.AnonAddEmails
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateMembership
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateMembershipInOrg
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateRestrictionsForOrg
import typings.octokitPluginRestEndpointMethods.AnonAddRepoToInstallation
import typings.octokitPluginRestEndpointMethods.AnonCancelImport
import typings.octokitPluginRestEndpointMethods.AnonCancelWorkflowRun
import typings.octokitPluginRestEndpointMethods.AnonCheckIfMerged
import typings.octokitPluginRestEndpointMethods.AnonCheckIsStarred
import typings.octokitPluginRestEndpointMethods.AnonCheckStarringRepo
import typings.octokitPluginRestEndpointMethods.AnonCode
import typings.octokitPluginRestEndpointMethods.AnonCreate
import typings.octokitPluginRestEndpointMethods.AnonCreateBlob
import typings.octokitPluginRestEndpointMethods.AnonCreateForCommitComment
import typings.octokitPluginRestEndpointMethods.AnonGet
import typings.octokitPluginRestEndpointMethods.AnonGetAnon30
import typings.octokitPluginRestEndpointMethods.AnonGetConductCode
import typings.octokitPluginRestEndpointMethods.AnonGetForRepo
import typings.octokitPluginRestEndpointMethods.AnonGetTemplate
import typings.octokitPluginRestEndpointMethods.AnonRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  paginate  :@octokit/plugin-paginate-rest.@octokit/plugin-paginate-rest.PaginateInterface} & @octokit/plugin-rest-endpoint-methods.@octokit/plugin-rest-endpoint-methods/dist-types/generated/types.RestEndpointMethods */
@js.native
trait paginatePaginateInterface extends js.Object {
  var actions: AnonCancelWorkflowRun = js.native
  var activity: AnonCheckStarringRepo = js.native
  var apps: AnonAddRepoToInstallation = js.native
  var checks: AnonCreate = js.native
  var codesOfConduct: AnonGetConductCode = js.native
  var emojis: AnonGet = js.native
  var gists: AnonCheckIsStarred = js.native
  var git: AnonCreateBlob = js.native
  var gitignore: AnonGetTemplate = js.native
  var interactions: AnonAddOrUpdateRestrictionsForOrg = js.native
  var issues: AnonAddAssignees = js.native
  var licenses: AnonGetForRepo = js.native
  var markdown: AnonRender = js.native
  var meta: AnonGetAnon30 = js.native
  var migrations: AnonCancelImport = js.native
  var orgs: AnonAddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: PaginateInterface = js.native
  var projects: AnonAddCollaborator = js.native
  var pulls: AnonCheckIfMerged = js.native
  var rateLimit: AnonGetAnon30 = js.native
  var reactions: AnonCreateForCommitComment = js.native
  var repos: AnonAcceptInvitation = js.native
  var search: AnonCode = js.native
  var teams: AnonAddOrUpdateMembershipInOrg = js.native
  var users: AnonAddEmails = js.native
  /**
    * Sends a request based on endpoint options
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def paginate[T](
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointOptions */ js.Any
  ): js.Promise[PaginationResults[T]] = js.native
  /**
    * Sends a request based on endpoint options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    */
  def paginate[T](
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
  ): js.Promise[PaginationResults[T]] = js.native
  /**
    * Sends a request based on endpoint options
    *
    * @param {object} endpoint Must set `method` and `url`. Plus URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    * @param {function} mapFn Optional method to map each response to a custom array
    */
  /**
    * Sends a request based on endpoint options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {function} mapFn Optional method to map each response to a custom array
    */
  def paginate[T, R](
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
    mapFn: MapFunction[T, _ | R]
  ): js.Promise[PaginationResults[R]] = js.native
  /**
    * Sends a request based on endpoint options
    *
    * @param {string} route Request method + URL. Example: `'GET /orgs/:org'`
    * @param {object} parameters URL, query or body parameters, as well as `headers`, `mediaType.{format|previews}`, `request`, or `baseUrl`.
    * @param {function} mapFn Optional method to map each response to a custom array
    */
  def paginate[T, R](
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.Route */ js.Any,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any,
    mapFn: MapFunction[T, _]
  ): js.Promise[PaginationResults[R]] = js.native
}

