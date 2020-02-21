package typings.octokitRest

import typings.octokitRest.mod.Octokit.AnyResponse
import typings.octokitRest.mod.Octokit.GistsCheckIsStarredParams
import typings.octokitRest.mod.Octokit.GistsCreateCommentParams
import typings.octokitRest.mod.Octokit.GistsCreateCommentResponse
import typings.octokitRest.mod.Octokit.GistsCreateParams
import typings.octokitRest.mod.Octokit.GistsCreateResponse
import typings.octokitRest.mod.Octokit.GistsDeleteCommentParams
import typings.octokitRest.mod.Octokit.GistsDeleteParams
import typings.octokitRest.mod.Octokit.GistsForkParams
import typings.octokitRest.mod.Octokit.GistsForkResponse
import typings.octokitRest.mod.Octokit.GistsGetCommentParams
import typings.octokitRest.mod.Octokit.GistsGetCommentResponse
import typings.octokitRest.mod.Octokit.GistsGetParams
import typings.octokitRest.mod.Octokit.GistsGetResponse
import typings.octokitRest.mod.Octokit.GistsGetRevisionParams
import typings.octokitRest.mod.Octokit.GistsGetRevisionResponse
import typings.octokitRest.mod.Octokit.GistsListCommentsParams
import typings.octokitRest.mod.Octokit.GistsListCommentsResponse
import typings.octokitRest.mod.Octokit.GistsListCommitsParams
import typings.octokitRest.mod.Octokit.GistsListCommitsResponse
import typings.octokitRest.mod.Octokit.GistsListForksParams
import typings.octokitRest.mod.Octokit.GistsListForksResponse
import typings.octokitRest.mod.Octokit.GistsListParams
import typings.octokitRest.mod.Octokit.GistsListPublicForUserParams
import typings.octokitRest.mod.Octokit.GistsListPublicForUserResponse
import typings.octokitRest.mod.Octokit.GistsListPublicParams
import typings.octokitRest.mod.Octokit.GistsListPublicResponse
import typings.octokitRest.mod.Octokit.GistsListResponse
import typings.octokitRest.mod.Octokit.GistsListStarredParams
import typings.octokitRest.mod.Octokit.GistsListStarredResponse
import typings.octokitRest.mod.Octokit.GistsStarParams
import typings.octokitRest.mod.Octokit.GistsUnstarParams
import typings.octokitRest.mod.Octokit.GistsUpdateCommentParams
import typings.octokitRest.mod.Octokit.GistsUpdateCommentResponse
import typings.octokitRest.mod.Octokit.GistsUpdateParams
import typings.octokitRest.mod.Octokit.GistsUpdateResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckIsStarred extends js.Object {
  @JSName("checkIsStarred")
  var checkIsStarred_Original: AnonEndpointParamsAnyResponseGistsCheckIsStarredParams = js.native
  @JSName("createComment")
  var createComment_Original: AnonEndpointParamsGistsCreateCommentParams = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  @JSName("create")
  var create_Original: AnonEndpointParamsGistsCreateParams = js.native
  @JSName("deleteComment")
  var deleteComment_Original: AnonEndpointParamsAnyResponseGistsDeleteCommentParams = js.native
  @JSName("delete")
  var delete_Original: AnonEndpointParamsAnyResponseGistsDeleteParams = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  @JSName("fork")
  var fork_Original: AnonEndpointParamsGistsForkParams = js.native
  @JSName("getComment")
  var getComment_Original: AnonEndpointParamsGistsGetCommentParams = js.native
  @JSName("getRevision")
  var getRevision_Original: AnonEndpointParamsGistsGetRevisionParams = js.native
  @JSName("get")
  var get_Original: AnonEndpointParamsGistsGetParams = js.native
  @JSName("listComments")
  var listComments_Original: AnonEndpointParamsGistsListCommentsParams = js.native
  @JSName("listCommits")
  var listCommits_Original: AnonEndpointParamsGistsListCommitsParams = js.native
  @JSName("listForks")
  var listForks_Original: AnonEndpointParamsGistsListForksParams = js.native
  @JSName("listPublicForUser")
  var listPublicForUser_Original: AnonEndpointParamsGistsListPublicForUserParams = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  @JSName("listPublic")
  var listPublic_Original: AnonEndpointParamsGistsListPublicParams = js.native
  /**
    * List the authenticated user's starred gists:
    */
  @JSName("listStarred")
  var listStarred_Original: AnonEndpointParamsGistsListStarredParams = js.native
  @JSName("list")
  var list_Original: AnonEndpointParamsGistsListParams = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("star")
  var star_Original: AnonEndpointParamsAnyResponseGistsStarParams = js.native
  @JSName("unstar")
  var unstar_Original: AnonEndpointParamsAnyResponseGistsUnstarParams = js.native
  @JSName("updateComment")
  var updateComment_Original: AnonEndpointParamsGistsUpdateCommentParams = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  @JSName("update")
  var update_Original: AnonEndpointParamsGistsUpdateParams = js.native
  def checkIsStarred(): js.Promise[AnyResponse] = js.native
  def checkIsStarred(params: RequestOptions with GistsCheckIsStarredParams): js.Promise[AnyResponse] = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  def create(): js.Promise[Response[GistsCreateResponse]] = js.native
  def create(params: RequestOptions with GistsCreateParams): js.Promise[Response[GistsCreateResponse]] = js.native
  def createComment(): js.Promise[Response[GistsCreateCommentResponse]] = js.native
  def createComment(params: RequestOptions with GistsCreateCommentParams): js.Promise[Response[GistsCreateCommentResponse]] = js.native
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: RequestOptions with GistsDeleteParams): js.Promise[AnyResponse] = js.native
  def deleteComment(): js.Promise[AnyResponse] = js.native
  def deleteComment(params: RequestOptions with GistsDeleteCommentParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  def fork(): js.Promise[Response[GistsForkResponse]] = js.native
  def fork(params: RequestOptions with GistsForkParams): js.Promise[Response[GistsForkResponse]] = js.native
  def get(): js.Promise[Response[GistsGetResponse]] = js.native
  def get(params: RequestOptions with GistsGetParams): js.Promise[Response[GistsGetResponse]] = js.native
  def getComment(): js.Promise[Response[GistsGetCommentResponse]] = js.native
  def getComment(params: RequestOptions with GistsGetCommentParams): js.Promise[Response[GistsGetCommentResponse]] = js.native
  def getRevision(): js.Promise[Response[GistsGetRevisionResponse]] = js.native
  def getRevision(params: RequestOptions with GistsGetRevisionParams): js.Promise[Response[GistsGetRevisionResponse]] = js.native
  def list(): js.Promise[Response[GistsListResponse]] = js.native
  def list(params: RequestOptions with GistsListParams): js.Promise[Response[GistsListResponse]] = js.native
  def listComments(): js.Promise[Response[GistsListCommentsResponse]] = js.native
  def listComments(params: RequestOptions with GistsListCommentsParams): js.Promise[Response[GistsListCommentsResponse]] = js.native
  def listCommits(): js.Promise[Response[GistsListCommitsResponse]] = js.native
  def listCommits(params: RequestOptions with GistsListCommitsParams): js.Promise[Response[GistsListCommitsResponse]] = js.native
  def listForks(): js.Promise[Response[GistsListForksResponse]] = js.native
  def listForks(params: RequestOptions with GistsListForksParams): js.Promise[Response[GistsListForksResponse]] = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  def listPublic(): js.Promise[Response[GistsListPublicResponse]] = js.native
  def listPublic(params: RequestOptions with GistsListPublicParams): js.Promise[Response[GistsListPublicResponse]] = js.native
  def listPublicForUser(): js.Promise[Response[GistsListPublicForUserResponse]] = js.native
  def listPublicForUser(params: RequestOptions with GistsListPublicForUserParams): js.Promise[Response[GistsListPublicForUserResponse]] = js.native
  /**
    * List the authenticated user's starred gists:
    */
  def listStarred(): js.Promise[Response[GistsListStarredResponse]] = js.native
  def listStarred(params: RequestOptions with GistsListStarredParams): js.Promise[Response[GistsListStarredResponse]] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def star(): js.Promise[AnyResponse] = js.native
  def star(params: RequestOptions with GistsStarParams): js.Promise[AnyResponse] = js.native
  def unstar(): js.Promise[AnyResponse] = js.native
  def unstar(params: RequestOptions with GistsUnstarParams): js.Promise[AnyResponse] = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  def update(): js.Promise[Response[GistsUpdateResponse]] = js.native
  def update(params: RequestOptions with GistsUpdateParams): js.Promise[Response[GistsUpdateResponse]] = js.native
  def updateComment(): js.Promise[Response[GistsUpdateCommentResponse]] = js.native
  def updateComment(params: RequestOptions with GistsUpdateCommentParams): js.Promise[Response[GistsUpdateCommentResponse]] = js.native
}

