package typings.atOctokitRest.atOctokitRestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atOctokitRest.Anon_AcceptInvitation
import typings.atOctokitRest.Anon_AddAssignees
import typings.atOctokitRest.Anon_AddCollaborator
import typings.atOctokitRest.Anon_AddEmails
import typings.atOctokitRest.Anon_AddMember
import typings.atOctokitRest.Anon_AddOrUpdateMembership
import typings.atOctokitRest.Anon_AddOrUpdateRestrictionsForOrg
import typings.atOctokitRest.Anon_AddRepoToInstallation
import typings.atOctokitRest.Anon_After
import typings.atOctokitRest.Anon_CancelImport
import typings.atOctokitRest.Anon_CheckAuthorization
import typings.atOctokitRest.Anon_CheckIfMerged
import typings.atOctokitRest.Anon_CheckIsStarred
import typings.atOctokitRest.Anon_CheckStarringRepo
import typings.atOctokitRest.Anon_CodeCommits
import typings.atOctokitRest.Anon_Create
import typings.atOctokitRest.Anon_CreateBlob
import typings.atOctokitRest.Anon_CreateForCommitComment
import typings.atOctokitRest.Anon_Get
import typings.atOctokitRest.Anon_GetAnonEndpointParamsEmptyParamsMetaGetResponse
import typings.atOctokitRest.Anon_GetAnonEndpointParamsEmptyParamsPromise
import typings.atOctokitRest.Anon_GetConductCode
import typings.atOctokitRest.Anon_GetGetForRepo
import typings.atOctokitRest.Anon_GetTemplate
import typings.atOctokitRest.Anon_Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Octokit extends js.Object {
  var activity: Anon_CheckStarringRepo = js.native
  var apps: Anon_AddRepoToInstallation = js.native
  var checks: Anon_Create = js.native
  var codesOfConduct: Anon_GetConductCode = js.native
  var emojis: Anon_Get = js.native
  var gists: Anon_CheckIsStarred = js.native
  var git: Anon_CreateBlob = js.native
  var gitignore: Anon_GetTemplate = js.native
  var hook: Anon_After = js.native
  var interactions: Anon_AddOrUpdateRestrictionsForOrg = js.native
  var issues: Anon_AddAssignees = js.native
  var licenses: Anon_GetGetForRepo = js.native
  var log: Log = js.native
  var markdown: Anon_Render = js.native
  var meta: Anon_GetAnonEndpointParamsEmptyParamsMetaGetResponse = js.native
  var migrations: Anon_CancelImport = js.native
  var oauthAuthorizations: Anon_CheckAuthorization = js.native
  var orgs: Anon_AddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: Paginate = js.native
  var projects: Anon_AddCollaborator = js.native
  var pulls: Anon_CheckIfMerged = js.native
  var rateLimit: Anon_GetAnonEndpointParamsEmptyParamsPromise = js.native
  var reactions: Anon_CreateForCommitComment = js.native
  var repos: Anon_AcceptInvitation = js.native
  @JSName("request")
  var request_Original: Request = js.native
  var search: Anon_CodeCommits = js.native
  var teams: Anon_AddMember = js.native
  var users: Anon_AddEmails = js.native
  def authenticate(auth: AuthBasic): Unit = js.native
  def authenticate(auth: AuthJWT): Unit = js.native
  def authenticate(auth: AuthOAuthSecret): Unit = js.native
  def authenticate(auth: AuthOAuthToken): Unit = js.native
  def authenticate(auth: AuthUserToken): Unit = js.native
  def paginate(EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(EndpointOptions: EndpointOptions, callback: js.Function1[/* response */ AnyResponse, _]): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String, EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    Route: String,
    EndpointOptions: EndpointOptions,
    callback: js.Function1[/* response */ AnyResponse, _]
  ): js.Promise[js.Array[_]] = js.native
  def registerEndpoints(endpoints: StringDictionary[EndpointOptions]): Unit = js.native
  def request(EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
  def request(Route: String): js.Promise[AnyResponse] = js.native
  def request(Route: String, EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
}

