package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddOrUpdateMembership extends js.Object {
  var addOrUpdateMembership: AnonMethodParamsUrlAnonOrgRole
  var blockUser: AnonMethodParamsUrlAnonOrgUsername
  var checkBlockedUser: AnonMethodParamsUrlAnonOrgUsername
  var checkMembership: AnonMethodParamsUrlAnonOrgUsername
  var checkPublicMembership: AnonMethodParamsUrlAnonOrgUsername
  var concealMembership: AnonMethodParamsUrlAnonOrgUsername
  var convertMemberToOutsideCollaborator: AnonMethodParamsUrlAnonOrgUsername
  var createHook: AnonMethodParamsUrlAnonActive
  var createInvitation: AnonMethodParamsUrlAnonEmail
  var deleteHook: AnonMethodParamsUrlAnonHookid
  var get: AnonMethodParamsUrlAnonOrgAnonRequired
  var getHook: AnonMethodParamsUrlAnonHookid
  var getMembership: AnonMethodParamsUrlAnonOrgUsername
  var getMembershipForAuthenticatedUser: AnonMethodParamsUrlAnonOrgAnonRequired
  var list: AnonMethodParamsUrlAnonPagePerpageSince
  var listBlockedUsers: AnonMethodParamsUrlAnonOrgAnonRequired
  var listForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage
  var listForUser: AnonMethodParamsUrlAnonPage
  var listHooks: AnonMethodParamsUrlAnonOrgPage
  var listInstallations: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPage
  var listInvitationTeams: AnonMethodParamsUrlAnonInvitationid
  var listMembers: AnonMethodParamsUrlAnonFilter
  var listMemberships: AnonMethodParamsUrlAnonPagePerpageState
  var listOutsideCollaborators: AnonMethodParamsUrlAnonFilterOrg
  var listPendingInvitations: AnonMethodParamsUrlAnonOrgPage
  var listPublicMembers: AnonMethodParamsUrlAnonOrgPage
  var pingHook: AnonMethodParamsUrlAnonHookid
  var publicizeMembership: AnonMethodParamsUrlAnonOrgUsername
  var removeMember: AnonMethodParamsUrlAnonOrgUsername
  var removeMembership: AnonMethodParamsUrlAnonOrgUsername
  var removeOutsideCollaborator: AnonMethodParamsUrlAnonOrgUsername
  var unblockUser: AnonMethodParamsUrlAnonOrgUsername
  var update: AnonMethodParamsUrlAnonBillingemail
  var updateHook: AnonMethodParamsUrlAnonActiveConfig
  var updateMembership: AnonMethodParamsUrlAnonOrgState
}

object AnonAddOrUpdateMembership {
  @scala.inline
  def apply(
    addOrUpdateMembership: AnonMethodParamsUrlAnonOrgRole,
    blockUser: AnonMethodParamsUrlAnonOrgUsername,
    checkBlockedUser: AnonMethodParamsUrlAnonOrgUsername,
    checkMembership: AnonMethodParamsUrlAnonOrgUsername,
    checkPublicMembership: AnonMethodParamsUrlAnonOrgUsername,
    concealMembership: AnonMethodParamsUrlAnonOrgUsername,
    convertMemberToOutsideCollaborator: AnonMethodParamsUrlAnonOrgUsername,
    createHook: AnonMethodParamsUrlAnonActive,
    createInvitation: AnonMethodParamsUrlAnonEmail,
    deleteHook: AnonMethodParamsUrlAnonHookid,
    get: AnonMethodParamsUrlAnonOrgAnonRequired,
    getHook: AnonMethodParamsUrlAnonHookid,
    getMembership: AnonMethodParamsUrlAnonOrgUsername,
    getMembershipForAuthenticatedUser: AnonMethodParamsUrlAnonOrgAnonRequired,
    list: AnonMethodParamsUrlAnonPagePerpageSince,
    listBlockedUsers: AnonMethodParamsUrlAnonOrgAnonRequired,
    listForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage,
    listForUser: AnonMethodParamsUrlAnonPage,
    listHooks: AnonMethodParamsUrlAnonOrgPage,
    listInstallations: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPage,
    listInvitationTeams: AnonMethodParamsUrlAnonInvitationid,
    listMembers: AnonMethodParamsUrlAnonFilter,
    listMemberships: AnonMethodParamsUrlAnonPagePerpageState,
    listOutsideCollaborators: AnonMethodParamsUrlAnonFilterOrg,
    listPendingInvitations: AnonMethodParamsUrlAnonOrgPage,
    listPublicMembers: AnonMethodParamsUrlAnonOrgPage,
    pingHook: AnonMethodParamsUrlAnonHookid,
    publicizeMembership: AnonMethodParamsUrlAnonOrgUsername,
    removeMember: AnonMethodParamsUrlAnonOrgUsername,
    removeMembership: AnonMethodParamsUrlAnonOrgUsername,
    removeOutsideCollaborator: AnonMethodParamsUrlAnonOrgUsername,
    unblockUser: AnonMethodParamsUrlAnonOrgUsername,
    update: AnonMethodParamsUrlAnonBillingemail,
    updateHook: AnonMethodParamsUrlAnonActiveConfig,
    updateMembership: AnonMethodParamsUrlAnonOrgState
  ): AnonAddOrUpdateMembership = {
    val __obj = js.Dynamic.literal(addOrUpdateMembership = addOrUpdateMembership.asInstanceOf[js.Any], blockUser = blockUser.asInstanceOf[js.Any], checkBlockedUser = checkBlockedUser.asInstanceOf[js.Any], checkMembership = checkMembership.asInstanceOf[js.Any], checkPublicMembership = checkPublicMembership.asInstanceOf[js.Any], concealMembership = concealMembership.asInstanceOf[js.Any], convertMemberToOutsideCollaborator = convertMemberToOutsideCollaborator.asInstanceOf[js.Any], createHook = createHook.asInstanceOf[js.Any], createInvitation = createInvitation.asInstanceOf[js.Any], deleteHook = deleteHook.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getHook = getHook.asInstanceOf[js.Any], getMembership = getMembership.asInstanceOf[js.Any], getMembershipForAuthenticatedUser = getMembershipForAuthenticatedUser.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlockedUsers = listBlockedUsers.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listHooks = listHooks.asInstanceOf[js.Any], listInstallations = listInstallations.asInstanceOf[js.Any], listInvitationTeams = listInvitationTeams.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMemberships = listMemberships.asInstanceOf[js.Any], listOutsideCollaborators = listOutsideCollaborators.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPublicMembers = listPublicMembers.asInstanceOf[js.Any], pingHook = pingHook.asInstanceOf[js.Any], publicizeMembership = publicizeMembership.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMembership = removeMembership.asInstanceOf[js.Any], removeOutsideCollaborator = removeOutsideCollaborator.asInstanceOf[js.Any], unblockUser = unblockUser.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], updateMembership = updateMembership.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddOrUpdateMembership]
  }
}

