package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.GistsCheckIsStarredParams
import typings.atOctokitRest.atOctokitRestMod.GistsCreateCommentParams
import typings.atOctokitRest.atOctokitRestMod.GistsCreateCommentResponse
import typings.atOctokitRest.atOctokitRestMod.GistsCreateParams
import typings.atOctokitRest.atOctokitRestMod.GistsCreateResponse
import typings.atOctokitRest.atOctokitRestMod.GistsDeleteCommentParams
import typings.atOctokitRest.atOctokitRestMod.GistsDeleteParams
import typings.atOctokitRest.atOctokitRestMod.GistsForkParams
import typings.atOctokitRest.atOctokitRestMod.GistsForkResponse
import typings.atOctokitRest.atOctokitRestMod.GistsGetCommentParams
import typings.atOctokitRest.atOctokitRestMod.GistsGetCommentResponse
import typings.atOctokitRest.atOctokitRestMod.GistsGetParams
import typings.atOctokitRest.atOctokitRestMod.GistsGetResponse
import typings.atOctokitRest.atOctokitRestMod.GistsGetRevisionParams
import typings.atOctokitRest.atOctokitRestMod.GistsGetRevisionResponse
import typings.atOctokitRest.atOctokitRestMod.GistsListCommentsParams
import typings.atOctokitRest.atOctokitRestMod.GistsListCommentsResponse
import typings.atOctokitRest.atOctokitRestMod.GistsListCommitsParams
import typings.atOctokitRest.atOctokitRestMod.GistsListCommitsResponse
import typings.atOctokitRest.atOctokitRestMod.GistsListForksParams
import typings.atOctokitRest.atOctokitRestMod.GistsListForksResponse
import typings.atOctokitRest.atOctokitRestMod.GistsListParams
import typings.atOctokitRest.atOctokitRestMod.GistsListPublicForUserParams
import typings.atOctokitRest.atOctokitRestMod.GistsListPublicForUserResponse
import typings.atOctokitRest.atOctokitRestMod.GistsListPublicParams
import typings.atOctokitRest.atOctokitRestMod.GistsListPublicResponse
import typings.atOctokitRest.atOctokitRestMod.GistsListResponse
import typings.atOctokitRest.atOctokitRestMod.GistsListStarredParams
import typings.atOctokitRest.atOctokitRestMod.GistsListStarredResponse
import typings.atOctokitRest.atOctokitRestMod.GistsStarParams
import typings.atOctokitRest.atOctokitRestMod.GistsUnstarParams
import typings.atOctokitRest.atOctokitRestMod.GistsUpdateCommentParams
import typings.atOctokitRest.atOctokitRestMod.GistsUpdateCommentResponse
import typings.atOctokitRest.atOctokitRestMod.GistsUpdateParams
import typings.atOctokitRest.atOctokitRestMod.GistsUpdateResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CheckIsStarred extends js.Object {
  @JSName("checkIsStarred")
  var checkIsStarred_Original: Anon_EndpointParamsAnyResponseGistsCheckIsStarredParams = js.native
  @JSName("createComment")
  var createComment_Original: Anon_EndpointParamsGistsCreateCommentParams = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  @JSName("create")
  var create_Original: Anon_EndpointParamsGistsCreateParams = js.native
  @JSName("deleteComment")
  var deleteComment_Original: Anon_EndpointParamsAnyResponseGistsDeleteCommentParams = js.native
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsAnyResponseGistsDeleteParams = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  @JSName("fork")
  var fork_Original: Anon_EndpointParamsGistsForkParams = js.native
  @JSName("getComment")
  var getComment_Original: Anon_EndpointParamsGistsGetCommentParams = js.native
  @JSName("getRevision")
  var getRevision_Original: Anon_EndpointParamsGistsGetRevisionParams = js.native
  @JSName("get")
  var get_Original: Anon_EndpointParamsGistsGetParams = js.native
  @JSName("listComments")
  var listComments_Original: Anon_EndpointParamsGistsListCommentsParams = js.native
  @JSName("listCommits")
  var listCommits_Original: Anon_EndpointParamsGistsListCommitsParams = js.native
  @JSName("listForks")
  var listForks_Original: Anon_EndpointParamsGistsListForksParams = js.native
  @JSName("listPublicForUser")
  var listPublicForUser_Original: Anon_EndpointParamsGistsListPublicForUserParams = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  @JSName("listPublic")
  var listPublic_Original: Anon_EndpointParamsGistsListPublicParams = js.native
  /**
    * List the authenticated user's starred gists:
    */
  @JSName("listStarred")
  var listStarred_Original: Anon_EndpointParamsGistsListStarredParams = js.native
  @JSName("list")
  var list_Original: Anon_EndpointParamsGistsListParams = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("star")
  var star_Original: Anon_EndpointParamsAnyResponseGistsStarParams = js.native
  @JSName("unstar")
  var unstar_Original: Anon_EndpointParamsAnyResponseGistsUnstarParams = js.native
  @JSName("updateComment")
  var updateComment_Original: Anon_EndpointParamsGistsUpdateCommentParams = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsGistsUpdateParams = js.native
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

