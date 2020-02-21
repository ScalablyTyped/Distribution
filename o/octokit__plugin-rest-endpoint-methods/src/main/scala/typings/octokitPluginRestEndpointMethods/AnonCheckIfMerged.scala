package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckIfMerged extends js.Object {
  var checkIfMerged: AnonMethodParamsUrlAnonNumber
  var create: AnonMethodParamsUrlAnonBase
  var createComment: AnonMethodParamsUrlAnonBodyCommitid
  var createCommentReply: AnonDeprecatedMethodParamsUrlAnonBodyCommitid
  var createFromIssue: AnonDeprecatedMethodParamsUrlAnonBaseDraft
  var createReview: AnonMethodParamsUrlAnonBodyComments
  var createReviewCommentReply: AnonMethodParamsUrlAnonBodyCommentidOwnerPullnumber
  var createReviewRequest: AnonMethodParamsUrlAnonNumberOwner
  var deleteComment: AnonMethodParamsUrlAnonCommentidOwner
  var deletePendingReview: AnonMethodParamsUrlAnonNumberOwnerPullnumber
  var deleteReviewRequest: AnonMethodParamsUrlAnonNumberOwner
  var dismissReview: AnonMethodParamsUrlAnonMessageNumber
  var get: AnonMethodParamsUrlAnonNumber
  var getComment: AnonMethodParamsUrlAnonCommentidOwner
  var getCommentsForReview: AnonMethodParamsUrlAnonNumberOwnerPage
  var getReview: AnonMethodParamsUrlAnonNumberOwnerPullnumber
  var list: AnonMethodParamsUrlAnonBaseDirection
  var listComments: AnonMethodParamsUrlAnonDirectionNumber
  var listCommentsForRepo: AnonMethodParamsUrlAnonDirectionOwnerPagePerpage
  var listCommits: AnonMethodParamsUrlAnonNumberOwnerPagePerpage
  var listFiles: AnonMethodParamsUrlAnonNumberOwnerPagePerpage
  var listReviewRequests: AnonMethodParamsUrlAnonNumberOwnerPagePerpage
  var listReviews: AnonMethodParamsUrlAnonNumberOwnerPagePerpage
  var merge: AnonMethodParamsUrlAnonCommitmessage
  var submitReview: AnonMethodParamsUrlAnonBodyEvent
  var update: AnonMethodParamsUrlAnonBaseBody
  var updateBranch: AnonHeadersMethodParamsUrlAnonAcceptAnonExpectedheadsha
  var updateComment: AnonMethodParamsUrlAnonBodyCommentidOwner
  var updateReview: AnonMethodParamsUrlAnonBodyNumber
}

object AnonCheckIfMerged {
  @scala.inline
  def apply(
    checkIfMerged: AnonMethodParamsUrlAnonNumber,
    create: AnonMethodParamsUrlAnonBase,
    createComment: AnonMethodParamsUrlAnonBodyCommitid,
    createCommentReply: AnonDeprecatedMethodParamsUrlAnonBodyCommitid,
    createFromIssue: AnonDeprecatedMethodParamsUrlAnonBaseDraft,
    createReview: AnonMethodParamsUrlAnonBodyComments,
    createReviewCommentReply: AnonMethodParamsUrlAnonBodyCommentidOwnerPullnumber,
    createReviewRequest: AnonMethodParamsUrlAnonNumberOwner,
    deleteComment: AnonMethodParamsUrlAnonCommentidOwner,
    deletePendingReview: AnonMethodParamsUrlAnonNumberOwnerPullnumber,
    deleteReviewRequest: AnonMethodParamsUrlAnonNumberOwner,
    dismissReview: AnonMethodParamsUrlAnonMessageNumber,
    get: AnonMethodParamsUrlAnonNumber,
    getComment: AnonMethodParamsUrlAnonCommentidOwner,
    getCommentsForReview: AnonMethodParamsUrlAnonNumberOwnerPage,
    getReview: AnonMethodParamsUrlAnonNumberOwnerPullnumber,
    list: AnonMethodParamsUrlAnonBaseDirection,
    listComments: AnonMethodParamsUrlAnonDirectionNumber,
    listCommentsForRepo: AnonMethodParamsUrlAnonDirectionOwnerPagePerpage,
    listCommits: AnonMethodParamsUrlAnonNumberOwnerPagePerpage,
    listFiles: AnonMethodParamsUrlAnonNumberOwnerPagePerpage,
    listReviewRequests: AnonMethodParamsUrlAnonNumberOwnerPagePerpage,
    listReviews: AnonMethodParamsUrlAnonNumberOwnerPagePerpage,
    merge: AnonMethodParamsUrlAnonCommitmessage,
    submitReview: AnonMethodParamsUrlAnonBodyEvent,
    update: AnonMethodParamsUrlAnonBaseBody,
    updateBranch: AnonHeadersMethodParamsUrlAnonAcceptAnonExpectedheadsha,
    updateComment: AnonMethodParamsUrlAnonBodyCommentidOwner,
    updateReview: AnonMethodParamsUrlAnonBodyNumber
  ): AnonCheckIfMerged = {
    val __obj = js.Dynamic.literal(checkIfMerged = checkIfMerged.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], createCommentReply = createCommentReply.asInstanceOf[js.Any], createFromIssue = createFromIssue.asInstanceOf[js.Any], createReview = createReview.asInstanceOf[js.Any], createReviewCommentReply = createReviewCommentReply.asInstanceOf[js.Any], createReviewRequest = createReviewRequest.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], deletePendingReview = deletePendingReview.asInstanceOf[js.Any], deleteReviewRequest = deleteReviewRequest.asInstanceOf[js.Any], dismissReview = dismissReview.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getCommentsForReview = getCommentsForReview.asInstanceOf[js.Any], getReview = getReview.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommentsForRepo = listCommentsForRepo.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listFiles = listFiles.asInstanceOf[js.Any], listReviewRequests = listReviewRequests.asInstanceOf[js.Any], listReviews = listReviews.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], submitReview = submitReview.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranch = updateBranch.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckIfMerged]
  }
}

