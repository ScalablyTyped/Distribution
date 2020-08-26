package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComment extends js.Object {
  var checkIsStarred: `671` = js.native
  var create: `672` = js.native
  var createComment: `673` = js.native
  var delete: `674` = js.native
  var deleteComment: `675` = js.native
  var fork: `676` = js.native
  var get: `677` = js.native
  var getComment: `678` = js.native
  var getRevision: `679` = js.native
  var list: `680` = js.native
  var listComments: `681` = js.native
  var listCommits: `682` = js.native
  var listForUser: `683` = js.native
  var listForks: `684` = js.native
  var listPublic: `685` = js.native
  var listStarred: `686` = js.native
  var star: `687` = js.native
  var unstar: `688` = js.native
  var update: `689` = js.native
  var updateComment: `690` = js.native
}

object CreateComment {
  @scala.inline
  def apply(
    checkIsStarred: `671`,
    create: `672`,
    createComment: `673`,
    delete: `674`,
    deleteComment: `675`,
    fork: `676`,
    get: `677`,
    getComment: `678`,
    getRevision: `679`,
    list: `680`,
    listComments: `681`,
    listCommits: `682`,
    listForUser: `683`,
    listForks: `684`,
    listPublic: `685`,
    listStarred: `686`,
    star: `687`,
    unstar: `688`,
    update: `689`,
    updateComment: `690`
  ): CreateComment = {
    val __obj = js.Dynamic.literal(checkIsStarred = checkIsStarred.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getRevision = getRevision.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listStarred = listStarred.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], unstar = unstar.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComment]
  }
  @scala.inline
  implicit class CreateCommentOps[Self <: CreateComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckIsStarred(value: `671`): Self = this.set("checkIsStarred", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: `672`): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateComment(value: `673`): Self = this.set("createComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: `674`): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteComment(value: `675`): Self = this.set("deleteComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setFork(value: `676`): Self = this.set("fork", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: `677`): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetComment(value: `678`): Self = this.set("getComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRevision(value: `679`): Self = this.set("getRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: `680`): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setListComments(value: `681`): Self = this.set("listComments", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommits(value: `682`): Self = this.set("listCommits", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForUser(value: `683`): Self = this.set("listForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForks(value: `684`): Self = this.set("listForks", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPublic(value: `685`): Self = this.set("listPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setListStarred(value: `686`): Self = this.set("listStarred", value.asInstanceOf[js.Any])
    @scala.inline
    def setStar(value: `687`): Self = this.set("star", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnstar(value: `688`): Self = this.set("unstar", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: `689`): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateComment(value: `690`): Self = this.set("updateComment", value.asInstanceOf[js.Any])
  }
  
}

