package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CheckIsStarred extends js.Object {
  @JSName("checkIsStarred")
  var checkIsStarred_Original: Anon_EndpointParamsAnyResponse = js.native
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
  var deleteComment_Original: Anon_EndpointParamsGistsDeleteCommentParams = js.native
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsGistsDeleteParams = js.native
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
  var star_Original: Anon_EndpointParamsGistsStarParams = js.native
  @JSName("unstar")
  var unstar_Original: Anon_EndpointParamsGistsUnstarParams = js.native
  @JSName("updateComment")
  var updateComment_Original: Anon_EndpointParamsGistsUpdateCommentParams = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsGistsUpdateParams = js.native
  def checkIsStarred(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkIsStarred(params: atOctokitRestLib.atOctokitRestMod.GistsCheckIsStarredParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  def create(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsCreateResponse]
  ] = js.native
  def create(params: atOctokitRestLib.atOctokitRestMod.GistsCreateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsCreateResponse]
  ] = js.native
  def createComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsCreateCommentResponse]
  ] = js.native
  def createComment(params: atOctokitRestLib.atOctokitRestMod.GistsCreateCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsCreateCommentResponse]
  ] = js.native
  def delete(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsDeleteResponse]
  ] = js.native
  def delete(params: atOctokitRestLib.atOctokitRestMod.GistsDeleteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsDeleteResponse]
  ] = js.native
  def deleteComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsDeleteCommentResponse]
  ] = js.native
  def deleteComment(params: atOctokitRestLib.atOctokitRestMod.GistsDeleteCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsDeleteCommentResponse]
  ] = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  def fork(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsForkResponse]
  ] = js.native
  def fork(params: atOctokitRestLib.atOctokitRestMod.GistsForkParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsForkResponse]
  ] = js.native
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.GistsGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsGetResponse]
  ] = js.native
  def getComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsGetCommentResponse]
  ] = js.native
  def getComment(params: atOctokitRestLib.atOctokitRestMod.GistsGetCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsGetCommentResponse]
  ] = js.native
  def getRevision(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsGetRevisionResponse]
  ] = js.native
  def getRevision(params: atOctokitRestLib.atOctokitRestMod.GistsGetRevisionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsGetRevisionResponse]
  ] = js.native
  def list(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListResponse]
  ] = js.native
  def list(params: atOctokitRestLib.atOctokitRestMod.GistsListParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListResponse]
  ] = js.native
  def listComments(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListCommentsResponse]
  ] = js.native
  def listComments(params: atOctokitRestLib.atOctokitRestMod.GistsListCommentsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListCommentsResponse]
  ] = js.native
  def listCommits(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListCommitsResponse]
  ] = js.native
  def listCommits(params: atOctokitRestLib.atOctokitRestMod.GistsListCommitsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListCommitsResponse]
  ] = js.native
  def listForks(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListForksResponse]
  ] = js.native
  def listForks(params: atOctokitRestLib.atOctokitRestMod.GistsListForksParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListForksResponse]
  ] = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  def listPublic(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListPublicResponse]
  ] = js.native
  def listPublic(params: atOctokitRestLib.atOctokitRestMod.GistsListPublicParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListPublicResponse]
  ] = js.native
  def listPublicForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListPublicForUserResponse]
  ] = js.native
  def listPublicForUser(params: atOctokitRestLib.atOctokitRestMod.GistsListPublicForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListPublicForUserResponse]
  ] = js.native
  /**
    * List the authenticated user's starred gists:
    */
  def listStarred(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListStarredResponse]
  ] = js.native
  def listStarred(params: atOctokitRestLib.atOctokitRestMod.GistsListStarredParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsListStarredResponse]
  ] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def star(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsStarResponse]
  ] = js.native
  def star(params: atOctokitRestLib.atOctokitRestMod.GistsStarParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsStarResponse]
  ] = js.native
  def unstar(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsUnstarResponse]
  ] = js.native
  def unstar(params: atOctokitRestLib.atOctokitRestMod.GistsUnstarParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsUnstarResponse]
  ] = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  def update(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsUpdateResponse]
  ] = js.native
  def update(params: atOctokitRestLib.atOctokitRestMod.GistsUpdateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsUpdateResponse]
  ] = js.native
  def updateComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsUpdateCommentResponse]
  ] = js.native
  def updateComment(params: atOctokitRestLib.atOctokitRestMod.GistsUpdateCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GistsUpdateCommentResponse]
  ] = js.native
}

