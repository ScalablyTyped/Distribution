package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForIssue extends js.Object {
  var createForCommitComment: `867` = js.native
  var createForIssue: `868` = js.native
  var createForIssueComment: `869` = js.native
  var createForPullRequestReviewComment: `870` = js.native
  var createForTeamDiscussionCommentInOrg: `871` = js.native
  var createForTeamDiscussionInOrg: `872` = js.native
  var deleteForCommitComment: `873` = js.native
  var deleteForIssue: `874` = js.native
  var deleteForIssueComment: `875` = js.native
  var deleteForPullRequestComment: `876` = js.native
  var deleteForTeamDiscussion: `877` = js.native
  var deleteForTeamDiscussionComment: `878` = js.native
  var deleteLegacy: `879` = js.native
  var listForCommitComment: `880` = js.native
  var listForIssue: `881` = js.native
  var listForIssueComment: `882` = js.native
  var listForPullRequestReviewComment: `883` = js.native
  var listForTeamDiscussionCommentInOrg: `884` = js.native
  var listForTeamDiscussionInOrg: `885` = js.native
}

object CreateForIssue {
  @scala.inline
  def apply(
    createForCommitComment: `867`,
    createForIssue: `868`,
    createForIssueComment: `869`,
    createForPullRequestReviewComment: `870`,
    createForTeamDiscussionCommentInOrg: `871`,
    createForTeamDiscussionInOrg: `872`,
    deleteForCommitComment: `873`,
    deleteForIssue: `874`,
    deleteForIssueComment: `875`,
    deleteForPullRequestComment: `876`,
    deleteForTeamDiscussion: `877`,
    deleteForTeamDiscussionComment: `878`,
    deleteLegacy: `879`,
    listForCommitComment: `880`,
    listForIssue: `881`,
    listForIssueComment: `882`,
    listForPullRequestReviewComment: `883`,
    listForTeamDiscussionCommentInOrg: `884`,
    listForTeamDiscussionInOrg: `885`
  ): CreateForIssue = {
    val __obj = js.Dynamic.literal(createForCommitComment = createForCommitComment.asInstanceOf[js.Any], createForIssue = createForIssue.asInstanceOf[js.Any], createForIssueComment = createForIssueComment.asInstanceOf[js.Any], createForPullRequestReviewComment = createForPullRequestReviewComment.asInstanceOf[js.Any], createForTeamDiscussionCommentInOrg = createForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], createForTeamDiscussionInOrg = createForTeamDiscussionInOrg.asInstanceOf[js.Any], deleteForCommitComment = deleteForCommitComment.asInstanceOf[js.Any], deleteForIssue = deleteForIssue.asInstanceOf[js.Any], deleteForIssueComment = deleteForIssueComment.asInstanceOf[js.Any], deleteForPullRequestComment = deleteForPullRequestComment.asInstanceOf[js.Any], deleteForTeamDiscussion = deleteForTeamDiscussion.asInstanceOf[js.Any], deleteForTeamDiscussionComment = deleteForTeamDiscussionComment.asInstanceOf[js.Any], deleteLegacy = deleteLegacy.asInstanceOf[js.Any], listForCommitComment = listForCommitComment.asInstanceOf[js.Any], listForIssue = listForIssue.asInstanceOf[js.Any], listForIssueComment = listForIssueComment.asInstanceOf[js.Any], listForPullRequestReviewComment = listForPullRequestReviewComment.asInstanceOf[js.Any], listForTeamDiscussionCommentInOrg = listForTeamDiscussionCommentInOrg.asInstanceOf[js.Any], listForTeamDiscussionInOrg = listForTeamDiscussionInOrg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForIssue]
  }
  @scala.inline
  implicit class CreateForIssueOps[Self <: CreateForIssue] (val x: Self) extends AnyVal {
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
    def setCreateForCommitComment(value: `867`): Self = this.set("createForCommitComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForIssue(value: `868`): Self = this.set("createForIssue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForIssueComment(value: `869`): Self = this.set("createForIssueComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForPullRequestReviewComment(value: `870`): Self = this.set("createForPullRequestReviewComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForTeamDiscussionCommentInOrg(value: `871`): Self = this.set("createForTeamDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForTeamDiscussionInOrg(value: `872`): Self = this.set("createForTeamDiscussionInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteForCommitComment(value: `873`): Self = this.set("deleteForCommitComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteForIssue(value: `874`): Self = this.set("deleteForIssue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteForIssueComment(value: `875`): Self = this.set("deleteForIssueComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteForPullRequestComment(value: `876`): Self = this.set("deleteForPullRequestComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteForTeamDiscussion(value: `877`): Self = this.set("deleteForTeamDiscussion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteForTeamDiscussionComment(value: `878`): Self = this.set("deleteForTeamDiscussionComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteLegacy(value: `879`): Self = this.set("deleteLegacy", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForCommitComment(value: `880`): Self = this.set("listForCommitComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForIssue(value: `881`): Self = this.set("listForIssue", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForIssueComment(value: `882`): Self = this.set("listForIssueComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForPullRequestReviewComment(value: `883`): Self = this.set("listForPullRequestReviewComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForTeamDiscussionCommentInOrg(value: `884`): Self = this.set("listForTeamDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForTeamDiscussionInOrg(value: `885`): Self = this.set("listForTeamDiscussionInOrg", value.asInstanceOf[js.Any])
  }
  
}

