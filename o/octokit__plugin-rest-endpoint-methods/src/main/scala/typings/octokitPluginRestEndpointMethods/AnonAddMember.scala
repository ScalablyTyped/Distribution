package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddMember extends js.Object {
  var addMember: AnonDeprecatedMethodParamsUrlAnonTeamid
  var addMemberLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid
  var addOrUpdateMembership: AnonDeprecatedMethodParamsUrlAnonRole
  var addOrUpdateMembershipInOrg: AnonMethodParamsUrlAnonOrgRoleTeamslug
  var addOrUpdateMembershipLegacy: AnonDeprecatedMethodParamsUrlAnonRole
  var addOrUpdateProject: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPermissionProjectid
  var addOrUpdateProjectInOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPermission
  var addOrUpdateProjectLegacy: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPermissionProjectid
  var addOrUpdateRepo: AnonDeprecatedMethodParamsUrlAnonOwnerPermissionRepo
  var addOrUpdateRepoInOrg: AnonMethodParamsUrlAnonOrgOwner
  var addOrUpdateRepoLegacy: AnonDeprecatedMethodParamsUrlAnonOwnerPermissionRepo
  var checkManagesRepo: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid
  var checkManagesRepoInOrg: AnonMethodParamsUrlAnonOrgOwnerRepo
  var checkManagesRepoLegacy: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid
  var create: AnonMethodParamsUrlAnonDescriptionMaintainers
  var createDiscussion: AnonDeprecatedMethodParamsUrlAnonBodyPrivate
  var createDiscussionComment: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumber
  var createDiscussionCommentInOrg: AnonMethodParamsUrlAnonBodyDiscussionnumberOrg
  var createDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumber
  var createDiscussionInOrg: AnonMethodParamsUrlAnonBodyOrg
  var createDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonBodyPrivate
  var delete: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired
  var deleteDiscussion: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber
  var deleteDiscussionComment: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber
  var deleteDiscussionCommentInOrg: AnonMethodParamsUrlAnonCommentnumberDiscussionnumberOrg
  var deleteDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber
  var deleteDiscussionInOrg: AnonMethodParamsUrlAnonDiscussionnumberOrg
  var deleteDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber
  var deleteInOrg: AnonMethodParamsUrlAnonOrgTeamslug
  var deleteLegacy: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired
  var get: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired
  var getByName: AnonMethodParamsUrlAnonOrgTeamslug
  var getDiscussion: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber
  var getDiscussionComment: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber
  var getDiscussionCommentInOrg: AnonMethodParamsUrlAnonCommentnumberDiscussionnumberOrg
  var getDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber
  var getDiscussionInOrg: AnonMethodParamsUrlAnonDiscussionnumberOrg
  var getDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber
  var getLegacy: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired
  var getMember: AnonDeprecatedMethodParamsUrlAnonTeamid
  var getMemberLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid
  var getMembership: AnonDeprecatedMethodParamsUrlAnonTeamid
  var getMembershipInOrg: AnonMethodParamsUrlAnonOrgTeamslugUsername
  var getMembershipLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid
  var list: AnonMethodParamsUrlAnonOrgPage
  var listChild: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid
  var listChildInOrg: AnonMethodParamsUrlAnonOrgPagePerpageTeamslug
  var listChildLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid
  var listDiscussionComments: AnonDeprecatedMethodParamsUrlAnonDirectionDiscussionnumber
  var listDiscussionCommentsInOrg: AnonMethodParamsUrlAnonDirectionDiscussionnumberOrg
  var listDiscussionCommentsLegacy: AnonDeprecatedMethodParamsUrlAnonDirectionDiscussionnumber
  var listDiscussions: AnonDeprecatedMethodParamsUrlAnonDirectionPagePerpageTeamid
  var listDiscussionsInOrg: AnonMethodParamsUrlAnonDirectionOrgPage
  var listDiscussionsLegacy: AnonDeprecatedMethodParamsUrlAnonDirectionPagePerpageTeamid
  var listForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage
  var listMembers: AnonDeprecatedMethodParamsUrlAnonPagePerpageRole
  var listMembersInOrg: AnonMethodParamsUrlAnonOrgPagePerpageRole
  var listMembersLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageRole
  var listPendingInvitations: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid
  var listPendingInvitationsInOrg: AnonMethodParamsUrlAnonOrgPagePerpageTeamslug
  var listPendingInvitationsLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid
  var listProjects: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPagePerpageTeamid
  var listProjectsInOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPagePerpageTeamslug
  var listProjectsLegacy: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPagePerpageTeamid
  var listRepos: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid
  var listReposInOrg: AnonMethodParamsUrlAnonOrgPagePerpageTeamslug
  var listReposLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid
  var removeMember: AnonDeprecatedMethodParamsUrlAnonTeamid
  var removeMemberLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid
  var removeMembership: AnonDeprecatedMethodParamsUrlAnonTeamid
  var removeMembershipInOrg: AnonMethodParamsUrlAnonOrgTeamslugUsername
  var removeMembershipLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid
  var removeProject: AnonDeprecatedMethodParamsUrlAnonProjectidTeamid
  var removeProjectInOrg: AnonMethodParamsUrlAnonOrgProjectid
  var removeProjectLegacy: AnonDeprecatedMethodParamsUrlAnonProjectidTeamid
  var removeRepo: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid
  var removeRepoInOrg: AnonMethodParamsUrlAnonOrgOwnerRepo
  var removeRepoLegacy: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid
  var reviewProject: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonProjectidTeamid
  var reviewProjectInOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgProjectid
  var reviewProjectLegacy: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonProjectidTeamid
  var update: AnonDeprecatedMethodParamsUrlAnonDescriptionNameParentteamid
  var updateDiscussion: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumberTeamid
  var updateDiscussionComment: AnonDeprecatedMethodParamsUrlAnonBodyCommentnumber
  var updateDiscussionCommentInOrg: AnonMethodParamsUrlAnonBodyCommentnumberDiscussionnumber
  var updateDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonBodyCommentnumber
  var updateDiscussionInOrg: AnonMethodParamsUrlAnonBodyDiscussionnumberOrgTeamslug
  var updateDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumberTeamid
  var updateInOrg: AnonMethodParamsUrlAnonDescriptionNameOrg
  var updateLegacy: AnonDeprecatedMethodParamsUrlAnonDescriptionNameParentteamid
}

object AnonAddMember {
  @scala.inline
  def apply(
    addMember: AnonDeprecatedMethodParamsUrlAnonTeamid,
    addMemberLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid,
    addOrUpdateMembership: AnonDeprecatedMethodParamsUrlAnonRole,
    addOrUpdateMembershipInOrg: AnonMethodParamsUrlAnonOrgRoleTeamslug,
    addOrUpdateMembershipLegacy: AnonDeprecatedMethodParamsUrlAnonRole,
    addOrUpdateProject: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPermissionProjectid,
    addOrUpdateProjectInOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPermission,
    addOrUpdateProjectLegacy: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPermissionProjectid,
    addOrUpdateRepo: AnonDeprecatedMethodParamsUrlAnonOwnerPermissionRepo,
    addOrUpdateRepoInOrg: AnonMethodParamsUrlAnonOrgOwner,
    addOrUpdateRepoLegacy: AnonDeprecatedMethodParamsUrlAnonOwnerPermissionRepo,
    checkManagesRepo: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid,
    checkManagesRepoInOrg: AnonMethodParamsUrlAnonOrgOwnerRepo,
    checkManagesRepoLegacy: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid,
    create: AnonMethodParamsUrlAnonDescriptionMaintainers,
    createDiscussion: AnonDeprecatedMethodParamsUrlAnonBodyPrivate,
    createDiscussionComment: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumber,
    createDiscussionCommentInOrg: AnonMethodParamsUrlAnonBodyDiscussionnumberOrg,
    createDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumber,
    createDiscussionInOrg: AnonMethodParamsUrlAnonBodyOrg,
    createDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonBodyPrivate,
    delete: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired,
    deleteDiscussion: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber,
    deleteDiscussionComment: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber,
    deleteDiscussionCommentInOrg: AnonMethodParamsUrlAnonCommentnumberDiscussionnumberOrg,
    deleteDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber,
    deleteDiscussionInOrg: AnonMethodParamsUrlAnonDiscussionnumberOrg,
    deleteDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber,
    deleteInOrg: AnonMethodParamsUrlAnonOrgTeamslug,
    deleteLegacy: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired,
    get: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired,
    getByName: AnonMethodParamsUrlAnonOrgTeamslug,
    getDiscussion: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber,
    getDiscussionComment: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber,
    getDiscussionCommentInOrg: AnonMethodParamsUrlAnonCommentnumberDiscussionnumberOrg,
    getDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonCommentnumberDiscussionnumber,
    getDiscussionInOrg: AnonMethodParamsUrlAnonDiscussionnumberOrg,
    getDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonDiscussionnumber,
    getLegacy: AnonDeprecatedMethodParamsUrlAnonTeamidAnonRequired,
    getMember: AnonDeprecatedMethodParamsUrlAnonTeamid,
    getMemberLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid,
    getMembership: AnonDeprecatedMethodParamsUrlAnonTeamid,
    getMembershipInOrg: AnonMethodParamsUrlAnonOrgTeamslugUsername,
    getMembershipLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid,
    list: AnonMethodParamsUrlAnonOrgPage,
    listChild: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid,
    listChildInOrg: AnonMethodParamsUrlAnonOrgPagePerpageTeamslug,
    listChildLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid,
    listDiscussionComments: AnonDeprecatedMethodParamsUrlAnonDirectionDiscussionnumber,
    listDiscussionCommentsInOrg: AnonMethodParamsUrlAnonDirectionDiscussionnumberOrg,
    listDiscussionCommentsLegacy: AnonDeprecatedMethodParamsUrlAnonDirectionDiscussionnumber,
    listDiscussions: AnonDeprecatedMethodParamsUrlAnonDirectionPagePerpageTeamid,
    listDiscussionsInOrg: AnonMethodParamsUrlAnonDirectionOrgPage,
    listDiscussionsLegacy: AnonDeprecatedMethodParamsUrlAnonDirectionPagePerpageTeamid,
    listForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage,
    listMembers: AnonDeprecatedMethodParamsUrlAnonPagePerpageRole,
    listMembersInOrg: AnonMethodParamsUrlAnonOrgPagePerpageRole,
    listMembersLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageRole,
    listPendingInvitations: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid,
    listPendingInvitationsInOrg: AnonMethodParamsUrlAnonOrgPagePerpageTeamslug,
    listPendingInvitationsLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid,
    listProjects: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPagePerpageTeamid,
    listProjectsInOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgPagePerpageTeamslug,
    listProjectsLegacy: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonPagePerpageTeamid,
    listRepos: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid,
    listReposInOrg: AnonMethodParamsUrlAnonOrgPagePerpageTeamslug,
    listReposLegacy: AnonDeprecatedMethodParamsUrlAnonPagePerpageTeamid,
    removeMember: AnonDeprecatedMethodParamsUrlAnonTeamid,
    removeMemberLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid,
    removeMembership: AnonDeprecatedMethodParamsUrlAnonTeamid,
    removeMembershipInOrg: AnonMethodParamsUrlAnonOrgTeamslugUsername,
    removeMembershipLegacy: AnonDeprecatedMethodParamsUrlAnonTeamid,
    removeProject: AnonDeprecatedMethodParamsUrlAnonProjectidTeamid,
    removeProjectInOrg: AnonMethodParamsUrlAnonOrgProjectid,
    removeProjectLegacy: AnonDeprecatedMethodParamsUrlAnonProjectidTeamid,
    removeRepo: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid,
    removeRepoInOrg: AnonMethodParamsUrlAnonOrgOwnerRepo,
    removeRepoLegacy: AnonDeprecatedMethodParamsUrlAnonOwnerRepoTeamid,
    reviewProject: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonProjectidTeamid,
    reviewProjectInOrg: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgProjectid,
    reviewProjectLegacy: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonProjectidTeamid,
    update: AnonDeprecatedMethodParamsUrlAnonDescriptionNameParentteamid,
    updateDiscussion: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumberTeamid,
    updateDiscussionComment: AnonDeprecatedMethodParamsUrlAnonBodyCommentnumber,
    updateDiscussionCommentInOrg: AnonMethodParamsUrlAnonBodyCommentnumberDiscussionnumber,
    updateDiscussionCommentLegacy: AnonDeprecatedMethodParamsUrlAnonBodyCommentnumber,
    updateDiscussionInOrg: AnonMethodParamsUrlAnonBodyDiscussionnumberOrgTeamslug,
    updateDiscussionLegacy: AnonDeprecatedMethodParamsUrlAnonBodyDiscussionnumberTeamid,
    updateInOrg: AnonMethodParamsUrlAnonDescriptionNameOrg,
    updateLegacy: AnonDeprecatedMethodParamsUrlAnonDescriptionNameParentteamid
  ): AnonAddMember = {
    val __obj = js.Dynamic.literal(addMember = addMember.asInstanceOf[js.Any], addMemberLegacy = addMemberLegacy.asInstanceOf[js.Any], addOrUpdateMembership = addOrUpdateMembership.asInstanceOf[js.Any], addOrUpdateMembershipInOrg = addOrUpdateMembershipInOrg.asInstanceOf[js.Any], addOrUpdateMembershipLegacy = addOrUpdateMembershipLegacy.asInstanceOf[js.Any], addOrUpdateProject = addOrUpdateProject.asInstanceOf[js.Any], addOrUpdateProjectInOrg = addOrUpdateProjectInOrg.asInstanceOf[js.Any], addOrUpdateProjectLegacy = addOrUpdateProjectLegacy.asInstanceOf[js.Any], addOrUpdateRepo = addOrUpdateRepo.asInstanceOf[js.Any], addOrUpdateRepoInOrg = addOrUpdateRepoInOrg.asInstanceOf[js.Any], addOrUpdateRepoLegacy = addOrUpdateRepoLegacy.asInstanceOf[js.Any], checkManagesRepo = checkManagesRepo.asInstanceOf[js.Any], checkManagesRepoInOrg = checkManagesRepoInOrg.asInstanceOf[js.Any], checkManagesRepoLegacy = checkManagesRepoLegacy.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createDiscussion = createDiscussion.asInstanceOf[js.Any], createDiscussionComment = createDiscussionComment.asInstanceOf[js.Any], createDiscussionCommentInOrg = createDiscussionCommentInOrg.asInstanceOf[js.Any], createDiscussionCommentLegacy = createDiscussionCommentLegacy.asInstanceOf[js.Any], createDiscussionInOrg = createDiscussionInOrg.asInstanceOf[js.Any], createDiscussionLegacy = createDiscussionLegacy.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteDiscussion = deleteDiscussion.asInstanceOf[js.Any], deleteDiscussionComment = deleteDiscussionComment.asInstanceOf[js.Any], deleteDiscussionCommentInOrg = deleteDiscussionCommentInOrg.asInstanceOf[js.Any], deleteDiscussionCommentLegacy = deleteDiscussionCommentLegacy.asInstanceOf[js.Any], deleteDiscussionInOrg = deleteDiscussionInOrg.asInstanceOf[js.Any], deleteDiscussionLegacy = deleteDiscussionLegacy.asInstanceOf[js.Any], deleteInOrg = deleteInOrg.asInstanceOf[js.Any], deleteLegacy = deleteLegacy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getByName = getByName.asInstanceOf[js.Any], getDiscussion = getDiscussion.asInstanceOf[js.Any], getDiscussionComment = getDiscussionComment.asInstanceOf[js.Any], getDiscussionCommentInOrg = getDiscussionCommentInOrg.asInstanceOf[js.Any], getDiscussionCommentLegacy = getDiscussionCommentLegacy.asInstanceOf[js.Any], getDiscussionInOrg = getDiscussionInOrg.asInstanceOf[js.Any], getDiscussionLegacy = getDiscussionLegacy.asInstanceOf[js.Any], getLegacy = getLegacy.asInstanceOf[js.Any], getMember = getMember.asInstanceOf[js.Any], getMemberLegacy = getMemberLegacy.asInstanceOf[js.Any], getMembership = getMembership.asInstanceOf[js.Any], getMembershipInOrg = getMembershipInOrg.asInstanceOf[js.Any], getMembershipLegacy = getMembershipLegacy.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listChild = listChild.asInstanceOf[js.Any], listChildInOrg = listChildInOrg.asInstanceOf[js.Any], listChildLegacy = listChildLegacy.asInstanceOf[js.Any], listDiscussionComments = listDiscussionComments.asInstanceOf[js.Any], listDiscussionCommentsInOrg = listDiscussionCommentsInOrg.asInstanceOf[js.Any], listDiscussionCommentsLegacy = listDiscussionCommentsLegacy.asInstanceOf[js.Any], listDiscussions = listDiscussions.asInstanceOf[js.Any], listDiscussionsInOrg = listDiscussionsInOrg.asInstanceOf[js.Any], listDiscussionsLegacy = listDiscussionsLegacy.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listMembers = listMembers.asInstanceOf[js.Any], listMembersInOrg = listMembersInOrg.asInstanceOf[js.Any], listMembersLegacy = listMembersLegacy.asInstanceOf[js.Any], listPendingInvitations = listPendingInvitations.asInstanceOf[js.Any], listPendingInvitationsInOrg = listPendingInvitationsInOrg.asInstanceOf[js.Any], listPendingInvitationsLegacy = listPendingInvitationsLegacy.asInstanceOf[js.Any], listProjects = listProjects.asInstanceOf[js.Any], listProjectsInOrg = listProjectsInOrg.asInstanceOf[js.Any], listProjectsLegacy = listProjectsLegacy.asInstanceOf[js.Any], listRepos = listRepos.asInstanceOf[js.Any], listReposInOrg = listReposInOrg.asInstanceOf[js.Any], listReposLegacy = listReposLegacy.asInstanceOf[js.Any], removeMember = removeMember.asInstanceOf[js.Any], removeMemberLegacy = removeMemberLegacy.asInstanceOf[js.Any], removeMembership = removeMembership.asInstanceOf[js.Any], removeMembershipInOrg = removeMembershipInOrg.asInstanceOf[js.Any], removeMembershipLegacy = removeMembershipLegacy.asInstanceOf[js.Any], removeProject = removeProject.asInstanceOf[js.Any], removeProjectInOrg = removeProjectInOrg.asInstanceOf[js.Any], removeProjectLegacy = removeProjectLegacy.asInstanceOf[js.Any], removeRepo = removeRepo.asInstanceOf[js.Any], removeRepoInOrg = removeRepoInOrg.asInstanceOf[js.Any], removeRepoLegacy = removeRepoLegacy.asInstanceOf[js.Any], reviewProject = reviewProject.asInstanceOf[js.Any], reviewProjectInOrg = reviewProjectInOrg.asInstanceOf[js.Any], reviewProjectLegacy = reviewProjectLegacy.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateDiscussion = updateDiscussion.asInstanceOf[js.Any], updateDiscussionComment = updateDiscussionComment.asInstanceOf[js.Any], updateDiscussionCommentInOrg = updateDiscussionCommentInOrg.asInstanceOf[js.Any], updateDiscussionCommentLegacy = updateDiscussionCommentLegacy.asInstanceOf[js.Any], updateDiscussionInOrg = updateDiscussionInOrg.asInstanceOf[js.Any], updateDiscussionLegacy = updateDiscussionLegacy.asInstanceOf[js.Any], updateInOrg = updateInOrg.asInstanceOf[js.Any], updateLegacy = updateLegacy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddMember]
  }
}

