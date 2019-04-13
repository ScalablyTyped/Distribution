package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Octokit extends js.Object {
  var activity: atOctokitRestLib.Anon_CheckStarringRepo = js.native
  var apps: atOctokitRestLib.Anon_AddRepoToInstallation = js.native
  var checks: atOctokitRestLib.Anon_Create = js.native
  var codesOfConduct: atOctokitRestLib.Anon_GetConductCode = js.native
  var emojis: atOctokitRestLib.Anon_Get = js.native
  var gists: atOctokitRestLib.Anon_CheckIsStarred = js.native
  var git: atOctokitRestLib.Anon_CreateBlob = js.native
  var gitignore: atOctokitRestLib.Anon_GetTemplate = js.native
  var hook: atOctokitRestLib.Anon_After = js.native
  var interactions: atOctokitRestLib.Anon_AddOrUpdateRestrictionsForOrg = js.native
  var issues: atOctokitRestLib.Anon_AddAssignees = js.native
  var licenses: atOctokitRestLib.Anon_GetGetForRepo = js.native
  var log: Log = js.native
  var markdown: atOctokitRestLib.Anon_Render = js.native
  var meta: atOctokitRestLib.Anon_GetAnonEndpointParamsEmptyParamsMetaGetResponse = js.native
  var migrations: atOctokitRestLib.Anon_CancelImport = js.native
  var oauthAuthorizations: atOctokitRestLib.Anon_CheckAuthorization = js.native
  var orgs: atOctokitRestLib.Anon_AddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: Paginate = js.native
  var projects: atOctokitRestLib.Anon_AddCollaborator = js.native
  var pulls: atOctokitRestLib.Anon_CheckIfMerged = js.native
  var rateLimit: atOctokitRestLib.Anon_GetAnonEndpointParamsEmptyParamsPromise = js.native
  var reactions: atOctokitRestLib.Anon_CreateForCommitComment = js.native
  var repos: atOctokitRestLib.Anon_AcceptInvitation = js.native
  @JSName("request")
  var request_Original: Request = js.native
  var search: atOctokitRestLib.Anon_CodeCommits = js.native
  var teams: atOctokitRestLib.Anon_AddMember = js.native
  var users: atOctokitRestLib.Anon_AddEmails = js.native
  def authenticate(auth: AuthBasic): scala.Unit = js.native
  def authenticate(auth: AuthJWT): scala.Unit = js.native
  def authenticate(auth: AuthOAuthSecret): scala.Unit = js.native
  def authenticate(auth: AuthOAuthToken): scala.Unit = js.native
  def authenticate(auth: AuthUserToken): scala.Unit = js.native
  def paginate(EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(EndpointOptions: EndpointOptions, callback: js.Function1[/* response */ AnyResponse, _]): js.Promise[js.Array[_]] = js.native
  def paginate(Route: java.lang.String): js.Promise[js.Array[_]] = js.native
  def paginate(Route: java.lang.String, EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    Route: java.lang.String,
    EndpointOptions: EndpointOptions,
    callback: js.Function1[/* response */ AnyResponse, _]
  ): js.Promise[js.Array[_]] = js.native
  def registerEndpoints(endpoints: org.scalablytyped.runtime.StringDictionary[EndpointOptions]): scala.Unit = js.native
  def request(EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
  def request(Route: java.lang.String): js.Promise[AnyResponse] = js.native
  def request(Route: java.lang.String, EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
}

