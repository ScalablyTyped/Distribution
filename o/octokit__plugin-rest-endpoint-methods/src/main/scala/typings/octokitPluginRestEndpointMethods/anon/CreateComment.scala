package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateComment extends js.Object {
  
  var checkIsStarred: `677` = js.native
  
  var create: `678` = js.native
  
  var createComment: `679` = js.native
  
  var delete: `680` = js.native
  
  var deleteComment: `681` = js.native
  
  var fork: `682` = js.native
  
  var get: `683` = js.native
  
  var getComment: `684` = js.native
  
  var getRevision: `685` = js.native
  
  var list: `686` = js.native
  
  var listComments: `687` = js.native
  
  var listCommits: `688` = js.native
  
  var listForUser: `689` = js.native
  
  var listForks: `690` = js.native
  
  var listPublic: `691` = js.native
  
  var listStarred: `692` = js.native
  
  var star: `693` = js.native
  
  var unstar: `694` = js.native
  
  var update: `695` = js.native
  
  var updateComment: `696` = js.native
}
object CreateComment {
  
  @scala.inline
  def apply(
    checkIsStarred: `677`,
    create: `678`,
    createComment: `679`,
    delete: `680`,
    deleteComment: `681`,
    fork: `682`,
    get: `683`,
    getComment: `684`,
    getRevision: `685`,
    list: `686`,
    listComments: `687`,
    listCommits: `688`,
    listForUser: `689`,
    listForks: `690`,
    listPublic: `691`,
    listStarred: `692`,
    star: `693`,
    unstar: `694`,
    update: `695`,
    updateComment: `696`
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
    def setCheckIsStarred(value: `677`): Self = this.set("checkIsStarred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: `678`): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateComment(value: `679`): Self = this.set("createComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: `680`): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteComment(value: `681`): Self = this.set("deleteComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFork(value: `682`): Self = this.set("fork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: `683`): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComment(value: `684`): Self = this.set("getComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRevision(value: `685`): Self = this.set("getRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: `686`): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListComments(value: `687`): Self = this.set("listComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommits(value: `688`): Self = this.set("listCommits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForUser(value: `689`): Self = this.set("listForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForks(value: `690`): Self = this.set("listForks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublic(value: `691`): Self = this.set("listPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStarred(value: `692`): Self = this.set("listStarred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStar(value: `693`): Self = this.set("star", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstar(value: `694`): Self = this.set("unstar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: `695`): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateComment(value: `696`): Self = this.set("updateComment", value.asInstanceOf[js.Any])
  }
}
