package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplyForReviewComment extends js.Object {
  var checkIfMerged: `839` = js.native
  var create: `840` = js.native
  var createReplyForReviewComment: `841` = js.native
  var createReview: `842` = js.native
  var createReviewComment: `843` = js.native
  var deletePendingReview: `844` = js.native
  var deleteReviewComment: `845` = js.native
  var dismissReview: `846` = js.native
  var get: `847` = js.native
  var getReview: `848` = js.native
  var getReviewComment: `849` = js.native
  var list: `850` = js.native
  var listCommentsForReview: `851` = js.native
  var listCommits: `852` = js.native
  var listFiles: `853` = js.native
  var listRequestedReviewers: `854` = js.native
  var listReviewComments: `855` = js.native
  var listReviewCommentsForRepo: `856` = js.native
  var listReviews: `857` = js.native
  var merge: `858` = js.native
  var removeRequestedReviewers: `859` = js.native
  var requestReviewers: `860` = js.native
  var submitReview: `861` = js.native
  var update: `862` = js.native
  var updateBranch: `863` = js.native
  var updateReview: `864` = js.native
  var updateReviewComment: `865` = js.native
}

object CreateReplyForReviewComment {
  @scala.inline
  def apply(
    checkIfMerged: `839`,
    create: `840`,
    createReplyForReviewComment: `841`,
    createReview: `842`,
    createReviewComment: `843`,
    deletePendingReview: `844`,
    deleteReviewComment: `845`,
    dismissReview: `846`,
    get: `847`,
    getReview: `848`,
    getReviewComment: `849`,
    list: `850`,
    listCommentsForReview: `851`,
    listCommits: `852`,
    listFiles: `853`,
    listRequestedReviewers: `854`,
    listReviewComments: `855`,
    listReviewCommentsForRepo: `856`,
    listReviews: `857`,
    merge: `858`,
    removeRequestedReviewers: `859`,
    requestReviewers: `860`,
    submitReview: `861`,
    update: `862`,
    updateBranch: `863`,
    updateReview: `864`,
    updateReviewComment: `865`
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
    def setCheckIfMerged(value: `839`): Self = this.set("checkIfMerged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: `840`): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateReplyForReviewComment(value: `841`): Self = this.set("createReplyForReviewComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateReview(value: `842`): Self = this.set("createReview", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateReviewComment(value: `843`): Self = this.set("createReviewComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletePendingReview(value: `844`): Self = this.set("deletePendingReview", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteReviewComment(value: `845`): Self = this.set("deleteReviewComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDismissReview(value: `846`): Self = this.set("dismissReview", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: `847`): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetReview(value: `848`): Self = this.set("getReview", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetReviewComment(value: `849`): Self = this.set("getReviewComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: `850`): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommentsForReview(value: `851`): Self = this.set("listCommentsForReview", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommits(value: `852`): Self = this.set("listCommits", value.asInstanceOf[js.Any])
    @scala.inline
    def setListFiles(value: `853`): Self = this.set("listFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setListRequestedReviewers(value: `854`): Self = this.set("listRequestedReviewers", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReviewComments(value: `855`): Self = this.set("listReviewComments", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReviewCommentsForRepo(value: `856`): Self = this.set("listReviewCommentsForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReviews(value: `857`): Self = this.set("listReviews", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerge(value: `858`): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveRequestedReviewers(value: `859`): Self = this.set("removeRequestedReviewers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestReviewers(value: `860`): Self = this.set("requestReviewers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmitReview(value: `861`): Self = this.set("submitReview", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: `862`): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateBranch(value: `863`): Self = this.set("updateBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateReview(value: `864`): Self = this.set("updateReview", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateReviewComment(value: `865`): Self = this.set("updateReviewComment", value.asInstanceOf[js.Any])
  }
  
}

