package typings.octokitRest.mod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitRest.AnonAcceptInvitation
import typings.octokitRest.AnonAddAssignees
import typings.octokitRest.AnonAddCollaborator
import typings.octokitRest.AnonAddEmails
import typings.octokitRest.AnonAddMember
import typings.octokitRest.AnonAddOrUpdateMembership
import typings.octokitRest.AnonAddOrUpdateRestrictionsForOrg
import typings.octokitRest.AnonAddRepoToInstallation
import typings.octokitRest.AnonAfter
import typings.octokitRest.AnonCancelImport
import typings.octokitRest.AnonCheckAuthorization
import typings.octokitRest.AnonCheckIfMerged
import typings.octokitRest.AnonCheckIsStarred
import typings.octokitRest.AnonCheckStarringRepo
import typings.octokitRest.AnonCodeCommits
import typings.octokitRest.AnonCreate
import typings.octokitRest.AnonCreateBlob
import typings.octokitRest.AnonCreateForCommitComment
import typings.octokitRest.AnonGet
import typings.octokitRest.AnonGetAnonEndpointParamsEmptyParamsMetaGetResponse
import typings.octokitRest.AnonGetAnonEndpointParamsEmptyParamsPromise
import typings.octokitRest.AnonGetConductCode
import typings.octokitRest.AnonGetGetForRepo
import typings.octokitRest.AnonGetTemplate
import typings.octokitRest.AnonRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Octokit extends js.Object {
  var activity: AnonCheckStarringRepo = js.native
  var apps: AnonAddRepoToInstallation = js.native
  var checks: AnonCreate = js.native
  var codesOfConduct: AnonGetConductCode = js.native
  var emojis: AnonGet = js.native
  var gists: AnonCheckIsStarred = js.native
  var git: AnonCreateBlob = js.native
  var gitignore: AnonGetTemplate = js.native
  var hook: AnonAfter = js.native
  var interactions: AnonAddOrUpdateRestrictionsForOrg = js.native
  var issues: AnonAddAssignees = js.native
  var licenses: AnonGetGetForRepo = js.native
  var log: Log = js.native
  var markdown: AnonRender = js.native
  var meta: AnonGetAnonEndpointParamsEmptyParamsMetaGetResponse = js.native
  var migrations: AnonCancelImport = js.native
  var oauthAuthorizations: AnonCheckAuthorization = js.native
  var orgs: AnonAddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: Paginate = js.native
  var projects: AnonAddCollaborator = js.native
  var pulls: AnonCheckIfMerged = js.native
  var rateLimit: AnonGetAnonEndpointParamsEmptyParamsPromise = js.native
  var reactions: AnonCreateForCommitComment = js.native
  var repos: AnonAcceptInvitation = js.native
  @JSName("request")
  var request_Original: Request = js.native
  var search: AnonCodeCommits = js.native
  var teams: AnonAddMember = js.native
  var users: AnonAddEmails = js.native
  def authenticate(auth: AuthBasic): Unit = js.native
  def authenticate(auth: AuthJWT): Unit = js.native
  def authenticate(auth: AuthOAuthSecret): Unit = js.native
  def authenticate(auth: AuthOAuthToken): Unit = js.native
  def authenticate(auth: AuthUserToken): Unit = js.native
  def paginate(EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String, EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    Route: String,
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def registerEndpoints(endpoints: StringDictionary[EndpointOptions]): Unit = js.native
  def request(EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
  def request(Route: String): js.Promise[AnyResponse] = js.native
  def request(Route: String, EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
}

