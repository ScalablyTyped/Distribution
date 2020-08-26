package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOrUpdateProjectPermissionsInOrg extends js.Object {
  var addOrUpdateMembershipForUserInOrg: `1032` = js.native
  var addOrUpdateProjectPermissionsInOrg: `1033` = js.native
  var addOrUpdateRepoPermissionsInOrg: `1034` = js.native
  var checkPermissionsForProjectInOrg: `1035` = js.native
  var checkPermissionsForRepoInOrg: `1036` = js.native
  var create: `1037` = js.native
  var createDiscussionCommentInOrg: `1038` = js.native
  var createDiscussionInOrg: `1039` = js.native
  var deleteDiscussionCommentInOrg: `1040` = js.native
  var deleteDiscussionInOrg: `1041` = js.native
  var deleteInOrg: `1042` = js.native
  var getByName: `1043` = js.native
  var getDiscussionCommentInOrg: `1044` = js.native
  var getDiscussionInOrg: `1045` = js.native
  var getMembershipForUserInOrg: `1046` = js.native
  var list: `1047` = js.native
  var listChildInOrg: `1048` = js.native
  var listDiscussionCommentsInOrg: `1049` = js.native
  var listDiscussionsInOrg: `1050` = js.native
  var listForAuthenticatedUser: `1051` = js.native
  var listMembersInOrg: `1052` = js.native
  var listPendingInvitationsInOrg: `1053` = js.native
  var listProjectsInOrg: `1054` = js.native
  var listReposInOrg: `1055` = js.native
  var removeMembershipForUserInOrg: `1056` = js.native
  var removeProjectInOrg: `1057` = js.native
  var removeRepoInOrg: `1058` = js.native
  var updateDiscussionCommentInOrg: `1059` = js.native
  var updateDiscussionInOrg: `1060` = js.native
  var updateInOrg: `1061` = js.native
}

object AddOrUpdateProjectPermissionsInOrg {
  @scala.inline
  def apply(
    addOrUpdateMembershipForUserInOrg: `1032`,
    addOrUpdateProjectPermissionsInOrg: `1033`,
    addOrUpdateRepoPermissionsInOrg: `1034`,
    checkPermissionsForProjectInOrg: `1035`,
    checkPermissionsForRepoInOrg: `1036`,
    create: `1037`,
    createDiscussionCommentInOrg: `1038`,
    createDiscussionInOrg: `1039`,
    deleteDiscussionCommentInOrg: `1040`,
    deleteDiscussionInOrg: `1041`,
    deleteInOrg: `1042`,
    getByName: `1043`,
    getDiscussionCommentInOrg: `1044`,
    getDiscussionInOrg: `1045`,
    getMembershipForUserInOrg: `1046`,
    list: `1047`,
    listChildInOrg: `1048`,
    listDiscussionCommentsInOrg: `1049`,
    listDiscussionsInOrg: `1050`,
    listForAuthenticatedUser: `1051`,
    listMembersInOrg: `1052`,
    listPendingInvitationsInOrg: `1053`,
    listProjectsInOrg: `1054`,
    listReposInOrg: `1055`,
    removeMembershipForUserInOrg: `1056`,
    removeProjectInOrg: `1057`,
    removeRepoInOrg: `1058`,
    updateDiscussionCommentInOrg: `1059`,
    updateDiscussionInOrg: `1060`,
    updateInOrg: `1061`
  ): AddOrUpdateProjectPermissionsInOrg = {
    val __obj = js.Dynamic.literal(addOrUpdateMembershipForUserInOrg = addOrUpdateMembershipForUserInOrg.asInstanceOf[js.Any], addOrUpdateProjectPermissionsInOrg = addOrUpdateProjectPermissionsInOrg.asInstanceOf[js.Any], addOrUpdateRepoPermissionsInOrg = addOrUpdateRepoPermissionsInOrg.asInstanceOf[js.Any], checkPermissionsForProjectInOrg = checkPermissionsForProjectInOrg.asInstanceOf[js.Any], checkPermissionsForRepoInOrg = checkPermissionsForRepoInOrg.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createDiscussionCommentInOrg = createDiscussionCommentInOrg.asInstanceOf[js.Any], createDiscussionInOrg = createDiscussionInOrg.asInstanceOf[js.Any], deleteDiscussionCommentInOrg = deleteDiscussionCommentInOrg.asInstanceOf[js.Any], deleteDiscussionInOrg = deleteDiscussionInOrg.asInstanceOf[js.Any], deleteInOrg = deleteInOrg.asInstanceOf[js.Any], getByName = getByName.asInstanceOf[js.Any], getDiscussionCommentInOrg = getDiscussionCommentInOrg.asInstanceOf[js.Any], getDiscussionInOrg = getDiscussionInOrg.asInstanceOf[js.Any], getMembershipForUserInOrg = getMembershipForUserInOrg.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listChildInOrg = listChildInOrg.asInstanceOf[js.Any], listDiscussionCommentsInOrg = listDiscussionCommentsInOrg.asInstanceOf[js.Any], listDiscussionsInOrg = listDiscussionsInOrg.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listMembersInOrg = listMembersInOrg.asInstanceOf[js.Any], listPendingInvitationsInOrg = listPendingInvitationsInOrg.asInstanceOf[js.Any], listProjectsInOrg = listProjectsInOrg.asInstanceOf[js.Any], listReposInOrg = listReposInOrg.asInstanceOf[js.Any], removeMembershipForUserInOrg = removeMembershipForUserInOrg.asInstanceOf[js.Any], removeProjectInOrg = removeProjectInOrg.asInstanceOf[js.Any], removeRepoInOrg = removeRepoInOrg.asInstanceOf[js.Any], updateDiscussionCommentInOrg = updateDiscussionCommentInOrg.asInstanceOf[js.Any], updateDiscussionInOrg = updateDiscussionInOrg.asInstanceOf[js.Any], updateInOrg = updateInOrg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOrUpdateProjectPermissionsInOrg]
  }
  @scala.inline
  implicit class AddOrUpdateProjectPermissionsInOrgOps[Self <: AddOrUpdateProjectPermissionsInOrg] (val x: Self) extends AnyVal {
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
    def setAddOrUpdateMembershipForUserInOrg(value: `1032`): Self = this.set("addOrUpdateMembershipForUserInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddOrUpdateProjectPermissionsInOrg(value: `1033`): Self = this.set("addOrUpdateProjectPermissionsInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddOrUpdateRepoPermissionsInOrg(value: `1034`): Self = this.set("addOrUpdateRepoPermissionsInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckPermissionsForProjectInOrg(value: `1035`): Self = this.set("checkPermissionsForProjectInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckPermissionsForRepoInOrg(value: `1036`): Self = this.set("checkPermissionsForRepoInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: `1037`): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDiscussionCommentInOrg(value: `1038`): Self = this.set("createDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDiscussionInOrg(value: `1039`): Self = this.set("createDiscussionInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteDiscussionCommentInOrg(value: `1040`): Self = this.set("deleteDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteDiscussionInOrg(value: `1041`): Self = this.set("deleteDiscussionInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteInOrg(value: `1042`): Self = this.set("deleteInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetByName(value: `1043`): Self = this.set("getByName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDiscussionCommentInOrg(value: `1044`): Self = this.set("getDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDiscussionInOrg(value: `1045`): Self = this.set("getDiscussionInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMembershipForUserInOrg(value: `1046`): Self = this.set("getMembershipForUserInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: `1047`): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setListChildInOrg(value: `1048`): Self = this.set("listChildInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListDiscussionCommentsInOrg(value: `1049`): Self = this.set("listDiscussionCommentsInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListDiscussionsInOrg(value: `1050`): Self = this.set("listDiscussionsInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForAuthenticatedUser(value: `1051`): Self = this.set("listForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListMembersInOrg(value: `1052`): Self = this.set("listMembersInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPendingInvitationsInOrg(value: `1053`): Self = this.set("listPendingInvitationsInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListProjectsInOrg(value: `1054`): Self = this.set("listProjectsInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReposInOrg(value: `1055`): Self = this.set("listReposInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveMembershipForUserInOrg(value: `1056`): Self = this.set("removeMembershipForUserInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveProjectInOrg(value: `1057`): Self = this.set("removeProjectInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveRepoInOrg(value: `1058`): Self = this.set("removeRepoInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateDiscussionCommentInOrg(value: `1059`): Self = this.set("updateDiscussionCommentInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateDiscussionInOrg(value: `1060`): Self = this.set("updateDiscussionInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateInOrg(value: `1061`): Self = this.set("updateInOrg", value.asInstanceOf[js.Any])
  }
  
}

