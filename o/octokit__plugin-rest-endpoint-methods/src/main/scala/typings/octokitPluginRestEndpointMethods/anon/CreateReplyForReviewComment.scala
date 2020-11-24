package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplyForReviewComment extends js.Object {
  
  var checkIfMerged: `845` = js.native
  
  var create: `846` = js.native
  
  var createReplyForReviewComment: `847` = js.native
  
  var createReview: `848` = js.native
  
  var createReviewComment: `849` = js.native
  
  var deletePendingReview: `850` = js.native
  
  var deleteReviewComment: `851` = js.native
  
  var dismissReview: `852` = js.native
  
  var get: `853` = js.native
  
  var getReview: `854` = js.native
  
  var getReviewComment: `855` = js.native
  
  var list: `856` = js.native
  
  var listCommentsForReview: `857` = js.native
  
  var listCommits: `858` = js.native
  
  var listFiles: `859` = js.native
  
  var listRequestedReviewers: `860` = js.native
  
  var listReviewComments: `861` = js.native
  
  var listReviewCommentsForRepo: `862` = js.native
  
  var listReviews: `863` = js.native
  
  var merge: `864` = js.native
  
  var removeRequestedReviewers: `865` = js.native
  
  var requestReviewers: `866` = js.native
  
  var submitReview: `867` = js.native
  
  var update: `868` = js.native
  
  var updateBranch: `869` = js.native
  
  var updateReview: `870` = js.native
  
  var updateReviewComment: `871` = js.native
}
object CreateReplyForReviewComment {
  
  @scala.inline
  def apply(
    checkIfMerged: `845`,
    create: `846`,
    createReplyForReviewComment: `847`,
    createReview: `848`,
    createReviewComment: `849`,
    deletePendingReview: `850`,
    deleteReviewComment: `851`,
    dismissReview: `852`,
    get: `853`,
    getReview: `854`,
    getReviewComment: `855`,
    list: `856`,
    listCommentsForReview: `857`,
    listCommits: `858`,
    listFiles: `859`,
    listRequestedReviewers: `860`,
    listReviewComments: `861`,
    listReviewCommentsForRepo: `862`,
    listReviews: `863`,
    merge: `864`,
    removeRequestedReviewers: `865`,
    requestReviewers: `866`,
    submitReview: `867`,
    update: `868`,
    updateBranch: `869`,
    updateReview: `870`,
    updateReviewComment: `871`
  ): CreateReplyForReviewComment = {
    val __obj = js.Dynamic.literal(checkIfMerged = checkIfMerged.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createReplyForReviewComment = createReplyForReviewComment.asInstanceOf[js.Any], createReview = createReview.asInstanceOf[js.Any], createReviewComment = createReviewComment.asInstanceOf[js.Any], deletePendingReview = deletePendingReview.asInstanceOf[js.Any], deleteReviewComment = deleteReviewComment.asInstanceOf[js.Any], dismissReview = dismissReview.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getReview = getReview.asInstanceOf[js.Any], getReviewComment = getReviewComment.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listCommentsForReview = listCommentsForReview.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listFiles = listFiles.asInstanceOf[js.Any], listRequestedReviewers = listRequestedReviewers.asInstanceOf[js.Any], listReviewComments = listReviewComments.asInstanceOf[js.Any], listReviewCommentsForRepo = listReviewCommentsForRepo.asInstanceOf[js.Any], listReviews = listReviews.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], removeRequestedReviewers = removeRequestedReviewers.asInstanceOf[js.Any], requestReviewers = requestReviewers.asInstanceOf[js.Any], submitReview = submitReview.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranch = updateBranch.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any], updateReviewComment = updateReviewComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplyForReviewComment]
  }
  
  @scala.inline
  implicit class CreateReplyForReviewCommentOps[Self <: CreateReplyForReviewComment] (val x: Self) extends AnyVal {
    
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
    def setCheckIfMerged(value: `845`): Self = this.set("checkIfMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: `846`): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateReplyForReviewComment(value: `847`): Self = this.set("createReplyForReviewComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateReview(value: `848`): Self = this.set("createReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateReviewComment(value: `849`): Self = this.set("createReviewComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePendingReview(value: `850`): Self = this.set("deletePendingReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteReviewComment(value: `851`): Self = this.set("deleteReviewComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissReview(value: `852`): Self = this.set("dismissReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: `853`): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetReview(value: `854`): Self = this.set("getReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetReviewComment(value: `855`): Self = this.set("getReviewComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: `856`): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommentsForReview(value: `857`): Self = this.set("listCommentsForReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCommits(value: `858`): Self = this.set("listCommits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFiles(value: `859`): Self = this.set("listFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRequestedReviewers(value: `860`): Self = this.set("listRequestedReviewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReviewComments(value: `861`): Self = this.set("listReviewComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReviewCommentsForRepo(value: `862`): Self = this.set("listReviewCommentsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReviews(value: `863`): Self = this.set("listReviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge(value: `864`): Self = this.set("merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRequestedReviewers(value: `865`): Self = this.set("removeRequestedReviewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestReviewers(value: `866`): Self = this.set("requestReviewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitReview(value: `867`): Self = this.set("submitReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: `868`): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBranch(value: `869`): Self = this.set("updateBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateReview(value: `870`): Self = this.set("updateReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateReviewComment(value: `871`): Self = this.set("updateReviewComment", value.asInstanceOf[js.Any])
  }
}
