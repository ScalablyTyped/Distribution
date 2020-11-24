package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBlockedUser extends js.Object {
  
  var blockUser: `785` = js.native
  
  var checkBlockedUser: `786` = js.native
  
  var checkMembershipForUser: `787` = js.native
  
  var checkPublicMembershipForUser: `788` = js.native
  
  var convertMemberToOutsideCollaborator: `789` = js.native
  
  var createInvitation: `790` = js.native
  
  var createWebhook: `791` = js.native
  
  var deleteWebhook: `792` = js.native
  
  var get: `793` = js.native
  
  var getMembershipForAuthenticatedUser: `794` = js.native
  
  var getMembershipForUser: `795` = js.native
  
  var getWebhook: `796` = js.native
  
  var list: `797` = js.native
  
  var listAppInstallations: `798` = js.native
  
  var listBlockedUsers: `799` = js.native
  
  var listForAuthenticatedUser: `800` = js.native
  
  var listForUser: `801` = js.native
  
  var listInvitationTeams: `802` = js.native
  
  var listMembers: `803` = js.native
  
  var listMembershipsForAuthenticatedUser: `804` = js.native
  
  var listOutsideCollaborators: `805` = js.native
  
  var listPendingInvitations: `806` = js.native
  
  var listPublicMembers: `807` = js.native
  
  var listWebhooks: `808` = js.native
  
  var pingWebhook: `809` = js.native
  
  var removeMember: `810` = js.native
  
  var removeMembershipForUser: `811` = js.native
  
  var removeOutsideCollaborator: `812` = js.native
  
  var removePublicMembershipForAuthenticatedUser: `813` = js.native
  
  var setMembershipForUser: `814` = js.native
  
  var setPublicMembershipForAuthenticatedUser: `815` = js.native
  
  var unblockUser: `816` = js.native
  
  var update: `817` = js.native
  
  var updateMembershipForAuthenticatedUser: `818` = js.native
  
  var updateWebhook: `819` = js.native
}
object CheckBlockedUser {
  
  @scala.inline
  def apply(
    blockUser: `785`,
    checkBlockedUser: `786`,
    checkMembershipForUser: `787`,
    checkPublicMembershipForUser: `788`,
    convertMemberToOutsideCollaborator: `789`,
    createInvitation: `790`,
    createWebhook: `791`,
    deleteWebhook: `792`,
    get: `793`,
    getMembershipForAuthenticatedUser: `794`,
    getMembershipForUser: `795`,
    getWebhook: `796`,
    list: `797`,
    listAppInstallations: `798`,
    listBlockedUsers: `799`,
    listForAuthenticatedUser: `800`,
    listForUser: `801`,
    listInvitationTeams: `802`,
    listMembers: `803`,
    listMembershipsForAuthenticatedUser: `804`,
    listOutsideCollaborators: `805`,
    listPendingInvitations: `806`,
    listPublicMembers: `807`,
    listWebhooks: `808`,
    pingWebhook: `809`,
    removeMember: `810`,
    removeMembershipForUser: `811`,
    removeOutsideCollaborator: `812`,
    removePublicMembershipForAuthenticatedUser: `813`,
    setMembershipForUser: `814`,
    setPublicMembershipForAuthenticatedUser: `815`,
    unblockUser: `816`,
    update: `817`,
    updateMembershipForAuthenticatedUser: `818`,
    updateWebhook: `819`
  ): CheckBlockedUser = {
    val __obj = js.Dynamic.literal(blockUser = blockUser.asInstanceOf[js.Any], checkBlockedUser = checkBlockedUser.asInstanceOf[js.Any], checkMembershipForUser = checkMembershipForUser.asInstanceOf[js.Any], checkPublicMembershipForUser = checkPublicMembershipForUser.asInstanceOf[js.Any], convertMemberToOutsideCollaborator = convertMemberToOutsideCollaborator.asInstanceOf[js.Any], createInvitation = createInvitation.asInstanceOf[js.Any], createWebhook = createWebhook.asInstanceOf[js.Any], deleteWebhook = deleteWebhook.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getMembershipForAuthenticatedUser = getMembershipForAuthenticatedUser.asInstanceOf[js.Any], getMembershipForUser = getMembershipForUser.asInstanceOf[js.Any], getWebhook = getWebhook.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAppInstallations = listAppInstallations.asInstanceOf[js.Any], listBlockedUsers = listBlockedUsers.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listInvitationTeams = listInvitationTeams.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMembershipsForAuthenticatedUser = listMembershipsForAuthenticatedUser.asInstanceOf[js.Any], listOutsideCollaborators = listOutsideCollaborators.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPublicMembers = listPublicMembers.asInstanceOf[js.Any], listWebhooks = listWebhooks.asInstanceOf[js.Any], pingWebhook = pingWebhook.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMembershipForUser = removeMembershipForUser.asInstanceOf[js.Any], removeOutsideCollaborator = removeOutsideCollaborator.asInstanceOf[js.Any], removePublicMembershipForAuthenticatedUser = removePublicMembershipForAuthenticatedUser.asInstanceOf[js.Any], setMembershipForUser = setMembershipForUser.asInstanceOf[js.Any], setPublicMembershipForAuthenticatedUser = setPublicMembershipForAuthenticatedUser.asInstanceOf[js.Any], unblockUser = unblockUser.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateMembershipForAuthenticatedUser = updateMembershipForAuthenticatedUser.asInstanceOf[js.Any], updateWebhook = updateWebhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBlockedUser]
  }
  
  @scala.inline
  implicit class CheckBlockedUserOps[Self <: CheckBlockedUser] (val x: Self) extends AnyVal {
    
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
    def setBlockUser(value: `785`): Self = this.set("blockUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBlockedUser(value: `786`): Self = this.set("checkBlockedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckMembershipForUser(value: `787`): Self = this.set("checkMembershipForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckPublicMembershipForUser(value: `788`): Self = this.set("checkPublicMembershipForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertMemberToOutsideCollaborator(value: `789`): Self = this.set("convertMemberToOutsideCollaborator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateInvitation(value: `790`): Self = this.set("createInvitation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateWebhook(value: `791`): Self = this.set("createWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteWebhook(value: `792`): Self = this.set("deleteWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: `793`): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMembershipForAuthenticatedUser(value: `794`): Self = this.set("getMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMembershipForUser(value: `795`): Self = this.set("getMembershipForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWebhook(value: `796`): Self = this.set("getWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: `797`): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAppInstallations(value: `798`): Self = this.set("listAppInstallations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListBlockedUsers(value: `799`): Self = this.set("listBlockedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForAuthenticatedUser(value: `800`): Self = this.set("listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListForUser(value: `801`): Self = this.set("listForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInvitationTeams(value: `802`): Self = this.set("listInvitationTeams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListMembers(value: `803`): Self = this.set("listMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListMembershipsForAuthenticatedUser(value: `804`): Self = this.set("listMembershipsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListOutsideCollaborators(value: `805`): Self = this.set("listOutsideCollaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPendingInvitations(value: `806`): Self = this.set("listPendingInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicMembers(value: `807`): Self = this.set("listPublicMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWebhooks(value: `808`): Self = this.set("listWebhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingWebhook(value: `809`): Self = this.set("pingWebhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMember(value: `810`): Self = this.set("removeMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMembershipForUser(value: `811`): Self = this.set("removeMembershipForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveOutsideCollaborator(value: `812`): Self = this.set("removeOutsideCollaborator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovePublicMembershipForAuthenticatedUser(value: `813`): Self = this.set("removePublicMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMembershipForUser(value: `814`): Self = this.set("setMembershipForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPublicMembershipForAuthenticatedUser(value: `815`): Self = this.set("setPublicMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnblockUser(value: `816`): Self = this.set("unblockUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: `817`): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMembershipForAuthenticatedUser(value: `818`): Self = this.set("updateMembershipForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateWebhook(value: `819`): Self = this.set("updateWebhook", value.asInstanceOf[js.Any])
  }
}
