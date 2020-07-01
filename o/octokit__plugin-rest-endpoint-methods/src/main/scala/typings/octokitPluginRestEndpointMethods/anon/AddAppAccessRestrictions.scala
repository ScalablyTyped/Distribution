package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAppAccessRestrictions extends js.Object {
  var acceptInvitation: `873`
  var addAppAccessRestrictions: `874`
  var addCollaborator: `875`
  var addDeployKey: `876`
  var addProtectedBranchAdminEnforcement: `877`
  var addProtectedBranchAppRestrictions: `874`
  var addProtectedBranchRequiredSignatures: `878`
  var addProtectedBranchRequiredStatusChecksContexts: `879`
  var addProtectedBranchTeamRestrictions: `880`
  var addProtectedBranchUserRestrictions: `881`
  var addStatusCheckContexts: `879`
  var addTeamAccessRestrictions: `880`
  var addUserAccessRestrictions: `881`
  var checkCollaborator: `882`
  var checkVulnerabilityAlerts: `883`
  var compareCommits: `884`
  var createCommitComment: `885`
  var createCommitSignatureProtection: `878`
  var createCommitStatus: `886`
  var createDeployKey: `876`
  var createDeployment: `887`
  var createDeploymentStatus: `888`
  var createDispatchEvent: `889`
  var createForAuthenticatedUser: `890`
  var createFork: `891`
  var createHook: `892`
  var createInOrg: `893`
  var createOrUpdateFile: `894`
  var createOrUpdateFileContents: `894`
  var createPagesSite: `895`
  var createRelease: `896`
  var createStatus: `886`
  var createUsingTemplate: `897`
  var createWebhook: `892`
  var declineInvitation: `898`
  var delete: `899`
  var deleteAccessRestrictions: `900`
  var deleteAdminBranchProtection: `901`
  var deleteBranchProtection: `902`
  var deleteCommitComment: `903`
  var deleteCommitSignatureProtection: `904`
  var deleteDeployKey: `905`
  var deleteDeployment: `906`
  var deleteDownload: `907`
  var deleteFile: `908`
  var deleteHook: `909`
  var deleteInvitation: `910`
  var deletePagesSite: `911`
  var deletePullRequestReviewProtection: `912`
  var deleteRelease: `913`
  var deleteReleaseAsset: `914`
  var deleteWebhook: `909`
  var disableAutomatedSecurityFixes: `915`
  var disablePagesSite: `911`
  var disableVulnerabilityAlerts: `916`
  var downloadArchive: `917`
  var enableAutomatedSecurityFixes: `918`
  var enablePagesSite: `895`
  var enableVulnerabilityAlerts: `919`
  var get: `920`
  var getAccessRestrictions: `921`
  var getAdminBranchProtection: `922`
  var getAllStatusCheckContexts: `923`
  var getAllTopics: `924`
  var getAppsWithAccessToProtectedBranch: `925`
  var getArchiveLink: `917`
  var getBranch: `926`
  var getBranchProtection: `927`
  var getClones: `928`
  var getCodeFrequencyStats: `929`
  var getCollaboratorPermissionLevel: `930`
  var getCombinedStatusForRef: `931`
  var getCommit: `932`
  var getCommitActivityStats: `933`
  var getCommitComment: `934`
  var getCommitSignatureProtection: `935`
  var getCommunityProfileMetrics: `936`
  var getContent: `937`
  var getContents: `937`
  var getContributorsStats: `938`
  var getDeployKey: `939`
  var getDeployment: `940`
  var getDeploymentStatus: `941`
  var getDownload: `942`
  var getHook: `943`
  var getLatestPagesBuild: `944`
  var getLatestRelease: `945`
  var getPages: `946`
  var getPagesBuild: `947`
  var getParticipationStats: `948`
  var getProtectedBranchAdminEnforcement: `922`
  var getProtectedBranchPullRequestReviewEnforcement: `949`
  var getProtectedBranchRequiredSignatures: `935`
  var getProtectedBranchRequiredStatusChecks: `950`
  var getProtectedBranchRestrictions: `921`
  var getPullRequestReviewProtection: `949`
  var getPunchCardStats: `951`
  var getReadme: `952`
  var getRelease: `953`
  var getReleaseAsset: `954`
  var getReleaseByTag: `955`
  var getStatusChecksProtection: `950`
  var getTeamsWithAccessToProtectedBranch: `956`
  var getTopPaths: `957`
  var getTopReferrers: `958`
  var getUsersWithAccessToProtectedBranch: `959`
  var getViews: `960`
  var getWebhook: `943`
  var list: `961`
  var listAssetsForRelease: `962`
  var listBranches: `963`
  var listBranchesForHeadCommit: `964`
  var listCollaborators: `965`
  var listCommentsForCommit: `966`
  var listCommitComments: `967`
  var listCommitCommentsForRepo: `967`
  var listCommitStatusesForRef: `968`
  var listCommits: `969`
  var listContributors: `970`
  var listDeployKeys: `971`
  var listDeploymentStatuses: `972`
  var listDeployments: `973`
  var listDownloads: `974`
  var listForAuthenticatedUser: `961`
  var listForOrg: `975`
  var listForUser: `976`
  var listForks: `977`
  var listHooks: `978`
  var listInvitations: `979`
  var listInvitationsForAuthenticatedUser: `980`
  var listLanguages: `981`
  var listPagesBuilds: `982`
  var listProtectedBranchRequiredStatusChecksContexts: `923`
  var listPublic: `983`
  var listPullRequestsAssociatedWithCommit: `984`
  var listReleaseAssets: `962`
  var listReleases: `985`
  var listStatusesForRef: `968`
  var listTags: `986`
  var listTeams: `987`
  var listTopics: `924`
  var listWebhooks: `978`
  var merge: `988`
  var pingHook: `989`
  var pingWebhook: `989`
  var removeAppAccessRestrictions: `990`
  var removeBranchProtection: `902`
  var removeCollaborator: `991`
  var removeDeployKey: `905`
  var removeProtectedBranchAdminEnforcement: `901`
  var removeProtectedBranchAppRestrictions: `990`
  var removeProtectedBranchPullRequestReviewEnforcement: `912`
  var removeProtectedBranchRequiredSignatures: `904`
  var removeProtectedBranchRequiredStatusChecks: `992`
  var removeProtectedBranchRequiredStatusChecksContexts: `993`
  var removeProtectedBranchRestrictions: `900`
  var removeProtectedBranchTeamRestrictions: `994`
  var removeProtectedBranchUserRestrictions: `995`
  var removeStatusCheckContexts: `993`
  var removeStatusCheckProtection: `992`
  var removeTeamAccessRestrictions: `994`
  var removeUserAccessRestrictions: `995`
  var replaceAllTopics: `996`
  var replaceProtectedBranchAppRestrictions: `997`
  var replaceProtectedBranchRequiredStatusChecksContexts: `998`
  var replaceProtectedBranchTeamRestrictions: `999`
  var replaceProtectedBranchUserRestrictions: `1000`
  var replaceTopics: `996`
  var requestPageBuild: `1001`
  var requestPagesBuild: `1001`
  var retrieveCommunityProfileMetrics: `936`
  var setAdminBranchProtection: `877`
  var setAppAccessRestrictions: `997`
  var setStatusCheckContexts: `998`
  var setTeamAccessRestrictions: `999`
  var setUserAccessRestrictions: `1000`
  var testPushHook: `1002`
  var testPushWebhook: `1002`
  var transfer: `1003`
  var update: `1004`
  var updateBranchProtection: `1005`
  var updateCommitComment: `1006`
  var updateHook: `1007`
  var updateInformationAboutPagesSite: `1008`
  var updateInvitation: `1009`
  var updateProtectedBranchPullRequestReviewEnforcement: `1010`
  var updateProtectedBranchRequiredStatusChecks: `1011`
  var updatePullRequestReviewProtection: `1010`
  var updateRelease: `1012`
  var updateReleaseAsset: `1013`
  var updateStatusCheckPotection: `1011`
  var updateWebhook: `1007`
  var uploadReleaseAsset: `1014`
}

object AddAppAccessRestrictions {
  @scala.inline
  def apply(
    acceptInvitation: `873`,
    addAppAccessRestrictions: `874`,
    addCollaborator: `875`,
    addDeployKey: `876`,
    addProtectedBranchAdminEnforcement: `877`,
    addProtectedBranchAppRestrictions: `874`,
    addProtectedBranchRequiredSignatures: `878`,
    addProtectedBranchRequiredStatusChecksContexts: `879`,
    addProtectedBranchTeamRestrictions: `880`,
    addProtectedBranchUserRestrictions: `881`,
    addStatusCheckContexts: `879`,
    addTeamAccessRestrictions: `880`,
    addUserAccessRestrictions: `881`,
    checkCollaborator: `882`,
    checkVulnerabilityAlerts: `883`,
    compareCommits: `884`,
    createCommitComment: `885`,
    createCommitSignatureProtection: `878`,
    createCommitStatus: `886`,
    createDeployKey: `876`,
    createDeployment: `887`,
    createDeploymentStatus: `888`,
    createDispatchEvent: `889`,
    createForAuthenticatedUser: `890`,
    createFork: `891`,
    createHook: `892`,
    createInOrg: `893`,
    createOrUpdateFile: `894`,
    createOrUpdateFileContents: `894`,
    createPagesSite: `895`,
    createRelease: `896`,
    createStatus: `886`,
    createUsingTemplate: `897`,
    createWebhook: `892`,
    declineInvitation: `898`,
    delete: `899`,
    deleteAccessRestrictions: `900`,
    deleteAdminBranchProtection: `901`,
    deleteBranchProtection: `902`,
    deleteCommitComment: `903`,
    deleteCommitSignatureProtection: `904`,
    deleteDeployKey: `905`,
    deleteDeployment: `906`,
    deleteDownload: `907`,
    deleteFile: `908`,
    deleteHook: `909`,
    deleteInvitation: `910`,
    deletePagesSite: `911`,
    deletePullRequestReviewProtection: `912`,
    deleteRelease: `913`,
    deleteReleaseAsset: `914`,
    deleteWebhook: `909`,
    disableAutomatedSecurityFixes: `915`,
    disablePagesSite: `911`,
    disableVulnerabilityAlerts: `916`,
    downloadArchive: `917`,
    enableAutomatedSecurityFixes: `918`,
    enablePagesSite: `895`,
    enableVulnerabilityAlerts: `919`,
    get: `920`,
    getAccessRestrictions: `921`,
    getAdminBranchProtection: `922`,
    getAllStatusCheckContexts: `923`,
    getAllTopics: `924`,
    getAppsWithAccessToProtectedBranch: `925`,
    getArchiveLink: `917`,
    getBranch: `926`,
    getBranchProtection: `927`,
    getClones: `928`,
    getCodeFrequencyStats: `929`,
    getCollaboratorPermissionLevel: `930`,
    getCombinedStatusForRef: `931`,
    getCommit: `932`,
    getCommitActivityStats: `933`,
    getCommitComment: `934`,
    getCommitSignatureProtection: `935`,
    getCommunityProfileMetrics: `936`,
    getContent: `937`,
    getContents: `937`,
    getContributorsStats: `938`,
    getDeployKey: `939`,
    getDeployment: `940`,
    getDeploymentStatus: `941`,
    getDownload: `942`,
    getHook: `943`,
    getLatestPagesBuild: `944`,
    getLatestRelease: `945`,
    getPages: `946`,
    getPagesBuild: `947`,
    getParticipationStats: `948`,
    getProtectedBranchAdminEnforcement: `922`,
    getProtectedBranchPullRequestReviewEnforcement: `949`,
    getProtectedBranchRequiredSignatures: `935`,
    getProtectedBranchRequiredStatusChecks: `950`,
    getProtectedBranchRestrictions: `921`,
    getPullRequestReviewProtection: `949`,
    getPunchCardStats: `951`,
    getReadme: `952`,
    getRelease: `953`,
    getReleaseAsset: `954`,
    getReleaseByTag: `955`,
    getStatusChecksProtection: `950`,
    getTeamsWithAccessToProtectedBranch: `956`,
    getTopPaths: `957`,
    getTopReferrers: `958`,
    getUsersWithAccessToProtectedBranch: `959`,
    getViews: `960`,
    getWebhook: `943`,
    list: `961`,
    listAssetsForRelease: `962`,
    listBranches: `963`,
    listBranchesForHeadCommit: `964`,
    listCollaborators: `965`,
    listCommentsForCommit: `966`,
    listCommitComments: `967`,
    listCommitCommentsForRepo: `967`,
    listCommitStatusesForRef: `968`,
    listCommits: `969`,
    listContributors: `970`,
    listDeployKeys: `971`,
    listDeploymentStatuses: `972`,
    listDeployments: `973`,
    listDownloads: `974`,
    listForAuthenticatedUser: `961`,
    listForOrg: `975`,
    listForUser: `976`,
    listForks: `977`,
    listHooks: `978`,
    listInvitations: `979`,
    listInvitationsForAuthenticatedUser: `980`,
    listLanguages: `981`,
    listPagesBuilds: `982`,
    listProtectedBranchRequiredStatusChecksContexts: `923`,
    listPublic: `983`,
    listPullRequestsAssociatedWithCommit: `984`,
    listReleaseAssets: `962`,
    listReleases: `985`,
    listStatusesForRef: `968`,
    listTags: `986`,
    listTeams: `987`,
    listTopics: `924`,
    listWebhooks: `978`,
    merge: `988`,
    pingHook: `989`,
    pingWebhook: `989`,
    removeAppAccessRestrictions: `990`,
    removeBranchProtection: `902`,
    removeCollaborator: `991`,
    removeDeployKey: `905`,
    removeProtectedBranchAdminEnforcement: `901`,
    removeProtectedBranchAppRestrictions: `990`,
    removeProtectedBranchPullRequestReviewEnforcement: `912`,
    removeProtectedBranchRequiredSignatures: `904`,
    removeProtectedBranchRequiredStatusChecks: `992`,
    removeProtectedBranchRequiredStatusChecksContexts: `993`,
    removeProtectedBranchRestrictions: `900`,
    removeProtectedBranchTeamRestrictions: `994`,
    removeProtectedBranchUserRestrictions: `995`,
    removeStatusCheckContexts: `993`,
    removeStatusCheckProtection: `992`,
    removeTeamAccessRestrictions: `994`,
    removeUserAccessRestrictions: `995`,
    replaceAllTopics: `996`,
    replaceProtectedBranchAppRestrictions: `997`,
    replaceProtectedBranchRequiredStatusChecksContexts: `998`,
    replaceProtectedBranchTeamRestrictions: `999`,
    replaceProtectedBranchUserRestrictions: `1000`,
    replaceTopics: `996`,
    requestPageBuild: `1001`,
    requestPagesBuild: `1001`,
    retrieveCommunityProfileMetrics: `936`,
    setAdminBranchProtection: `877`,
    setAppAccessRestrictions: `997`,
    setStatusCheckContexts: `998`,
    setTeamAccessRestrictions: `999`,
    setUserAccessRestrictions: `1000`,
    testPushHook: `1002`,
    testPushWebhook: `1002`,
    transfer: `1003`,
    update: `1004`,
    updateBranchProtection: `1005`,
    updateCommitComment: `1006`,
    updateHook: `1007`,
    updateInformationAboutPagesSite: `1008`,
    updateInvitation: `1009`,
    updateProtectedBranchPullRequestReviewEnforcement: `1010`,
    updateProtectedBranchRequiredStatusChecks: `1011`,
    updatePullRequestReviewProtection: `1010`,
    updateRelease: `1012`,
    updateReleaseAsset: `1013`,
    updateStatusCheckPotection: `1011`,
    updateWebhook: `1007`,
    uploadReleaseAsset: `1014`
  ): AddAppAccessRestrictions = {
    val __obj = js.Dynamic.literal(acceptInvitation = acceptInvitation.asInstanceOf[js.Any], addAppAccessRestrictions = addAppAccessRestrictions.asInstanceOf[js.Any], addCollaborator = addCollaborator.asInstanceOf[js.Any], addDeployKey = addDeployKey.asInstanceOf[js.Any], addProtectedBranchAdminEnforcement = addProtectedBranchAdminEnforcement.asInstanceOf[js.Any], addProtectedBranchAppRestrictions = addProtectedBranchAppRestrictions.asInstanceOf[js.Any], addProtectedBranchRequiredSignatures = addProtectedBranchRequiredSignatures.asInstanceOf[js.Any], addProtectedBranchRequiredStatusChecksContexts = addProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], addProtectedBranchTeamRestrictions = addProtectedBranchTeamRestrictions.asInstanceOf[js.Any], addProtectedBranchUserRestrictions = addProtectedBranchUserRestrictions.asInstanceOf[js.Any], addStatusCheckContexts = addStatusCheckContexts.asInstanceOf[js.Any], addTeamAccessRestrictions = addTeamAccessRestrictions.asInstanceOf[js.Any], addUserAccessRestrictions = addUserAccessRestrictions.asInstanceOf[js.Any], checkCollaborator = checkCollaborator.asInstanceOf[js.Any], checkVulnerabilityAlerts = checkVulnerabilityAlerts.asInstanceOf[js.Any], compareCommits = compareCommits.asInstanceOf[js.Any], createCommitComment = createCommitComment.asInstanceOf[js.Any], createCommitSignatureProtection = createCommitSignatureProtection.asInstanceOf[js.Any], createCommitStatus = createCommitStatus.asInstanceOf[js.Any], createDeployKey = createDeployKey.asInstanceOf[js.Any], createDeployment = createDeployment.asInstanceOf[js.Any], createDeploymentStatus = createDeploymentStatus.asInstanceOf[js.Any], createDispatchEvent = createDispatchEvent.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createFork = createFork.asInstanceOf[js.Any], createHook = createHook.asInstanceOf[js.Any], createInOrg = createInOrg.asInstanceOf[js.Any], createOrUpdateFile = createOrUpdateFile.asInstanceOf[js.Any], createOrUpdateFileContents = createOrUpdateFileContents.asInstanceOf[js.Any], createPagesSite = createPagesSite.asInstanceOf[js.Any], createRelease = createRelease.asInstanceOf[js.Any], createStatus = createStatus.asInstanceOf[js.Any], createUsingTemplate = createUsingTemplate.asInstanceOf[js.Any], createWebhook = createWebhook.asInstanceOf[js.Any], declineInvitation = declineInvitation.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteAccessRestrictions = deleteAccessRestrictions.asInstanceOf[js.Any], deleteAdminBranchProtection = deleteAdminBranchProtection.asInstanceOf[js.Any], deleteBranchProtection = deleteBranchProtection.asInstanceOf[js.Any], deleteCommitComment = deleteCommitComment.asInstanceOf[js.Any], deleteCommitSignatureProtection = deleteCommitSignatureProtection.asInstanceOf[js.Any], deleteDeployKey = deleteDeployKey.asInstanceOf[js.Any], deleteDeployment = deleteDeployment.asInstanceOf[js.Any], deleteDownload = deleteDownload.asInstanceOf[js.Any], deleteFile = deleteFile.asInstanceOf[js.Any], deleteHook = deleteHook.asInstanceOf[js.Any], deleteInvitation = deleteInvitation.asInstanceOf[js.Any], deletePagesSite = deletePagesSite.asInstanceOf[js.Any], deletePullRequestReviewProtection = deletePullRequestReviewProtection.asInstanceOf[js.Any], deleteRelease = deleteRelease.asInstanceOf[js.Any], deleteReleaseAsset = deleteReleaseAsset.asInstanceOf[js.Any], deleteWebhook = deleteWebhook.asInstanceOf[js.Any], disableAutomatedSecurityFixes = disableAutomatedSecurityFixes.asInstanceOf[js.Any], disablePagesSite = disablePagesSite.asInstanceOf[js.Any], disableVulnerabilityAlerts = disableVulnerabilityAlerts.asInstanceOf[js.Any], downloadArchive = downloadArchive.asInstanceOf[js.Any], enableAutomatedSecurityFixes = enableAutomatedSecurityFixes.asInstanceOf[js.Any], enablePagesSite = enablePagesSite.asInstanceOf[js.Any], enableVulnerabilityAlerts = enableVulnerabilityAlerts.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAccessRestrictions = getAccessRestrictions.asInstanceOf[js.Any], getAdminBranchProtection = getAdminBranchProtection.asInstanceOf[js.Any], getAllStatusCheckContexts = getAllStatusCheckContexts.asInstanceOf[js.Any], getAllTopics = getAllTopics.asInstanceOf[js.Any], getAppsWithAccessToProtectedBranch = getAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], getArchiveLink = getArchiveLink.asInstanceOf[js.Any], getBranch = getBranch.asInstanceOf[js.Any], getBranchProtection = getBranchProtection.asInstanceOf[js.Any], getClones = getClones.asInstanceOf[js.Any], getCodeFrequencyStats = getCodeFrequencyStats.asInstanceOf[js.Any], getCollaboratorPermissionLevel = getCollaboratorPermissionLevel.asInstanceOf[js.Any], getCombinedStatusForRef = getCombinedStatusForRef.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getCommitActivityStats = getCommitActivityStats.asInstanceOf[js.Any], getCommitComment = getCommitComment.asInstanceOf[js.Any], getCommitSignatureProtection = getCommitSignatureProtection.asInstanceOf[js.Any], getCommunityProfileMetrics = getCommunityProfileMetrics.asInstanceOf[js.Any], getContent = getContent.asInstanceOf[js.Any], getContents = getContents.asInstanceOf[js.Any], getContributorsStats = getContributorsStats.asInstanceOf[js.Any], getDeployKey = getDeployKey.asInstanceOf[js.Any], getDeployment = getDeployment.asInstanceOf[js.Any], getDeploymentStatus = getDeploymentStatus.asInstanceOf[js.Any], getDownload = getDownload.asInstanceOf[js.Any], getHook = getHook.asInstanceOf[js.Any], getLatestPagesBuild = getLatestPagesBuild.asInstanceOf[js.Any], getLatestRelease = getLatestRelease.asInstanceOf[js.Any], getPages = getPages.asInstanceOf[js.Any], getPagesBuild = getPagesBuild.asInstanceOf[js.Any], getParticipationStats = getParticipationStats.asInstanceOf[js.Any], getProtectedBranchAdminEnforcement = getProtectedBranchAdminEnforcement.asInstanceOf[js.Any], getProtectedBranchPullRequestReviewEnforcement = getProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], getProtectedBranchRequiredSignatures = getProtectedBranchRequiredSignatures.asInstanceOf[js.Any], getProtectedBranchRequiredStatusChecks = getProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], getProtectedBranchRestrictions = getProtectedBranchRestrictions.asInstanceOf[js.Any], getPullRequestReviewProtection = getPullRequestReviewProtection.asInstanceOf[js.Any], getPunchCardStats = getPunchCardStats.asInstanceOf[js.Any], getReadme = getReadme.asInstanceOf[js.Any], getRelease = getRelease.asInstanceOf[js.Any], getReleaseAsset = getReleaseAsset.asInstanceOf[js.Any], getReleaseByTag = getReleaseByTag.asInstanceOf[js.Any], getStatusChecksProtection = getStatusChecksProtection.asInstanceOf[js.Any], getTeamsWithAccessToProtectedBranch = getTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], getTopPaths = getTopPaths.asInstanceOf[js.Any], getTopReferrers = getTopReferrers.asInstanceOf[js.Any], getUsersWithAccessToProtectedBranch = getUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], getViews = getViews.asInstanceOf[js.Any], getWebhook = getWebhook.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAssetsForRelease = listAssetsForRelease.asInstanceOf[js.Any], listBranches = listBranches.asInstanceOf[js.Any], listBranchesForHeadCommit = listBranchesForHeadCommit.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listCommentsForCommit = listCommentsForCommit.asInstanceOf[js.Any], listCommitComments = listCommitComments.asInstanceOf[js.Any], listCommitCommentsForRepo = listCommitCommentsForRepo.asInstanceOf[js.Any], listCommitStatusesForRef = listCommitStatusesForRef.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listContributors = listContributors.asInstanceOf[js.Any], listDeployKeys = listDeployKeys.asInstanceOf[js.Any], listDeploymentStatuses = listDeploymentStatuses.asInstanceOf[js.Any], listDeployments = listDeployments.asInstanceOf[js.Any], listDownloads = listDownloads.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listHooks = listHooks.asInstanceOf[js.Any], listInvitations = listInvitations.asInstanceOf[js.Any], listInvitationsForAuthenticatedUser = listInvitationsForAuthenticatedUser.asInstanceOf[js.Any], listLanguages = listLanguages.asInstanceOf[js.Any], listPagesBuilds = listPagesBuilds.asInstanceOf[js.Any], listProtectedBranchRequiredStatusChecksContexts = listProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPullRequestsAssociatedWithCommit = listPullRequestsAssociatedWithCommit.asInstanceOf[js.Any], listReleaseAssets = listReleaseAssets.asInstanceOf[js.Any], listReleases = listReleases.asInstanceOf[js.Any], listStatusesForRef = listStatusesForRef.asInstanceOf[js.Any], listTags = listTags.asInstanceOf[js.Any], listTeams = listTeams.asInstanceOf[js.Any], listTopics = listTopics.asInstanceOf[js.Any], listWebhooks = listWebhooks.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], pingHook = pingHook.asInstanceOf[js.Any], pingWebhook = pingWebhook.asInstanceOf[js.Any], removeAppAccessRestrictions = removeAppAccessRestrictions.asInstanceOf[js.Any], removeBranchProtection = removeBranchProtection.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], removeDeployKey = removeDeployKey.asInstanceOf[js.Any], removeProtectedBranchAdminEnforcement = removeProtectedBranchAdminEnforcement.asInstanceOf[js.Any], removeProtectedBranchAppRestrictions = removeProtectedBranchAppRestrictions.asInstanceOf[js.Any], removeProtectedBranchPullRequestReviewEnforcement = removeProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], removeProtectedBranchRequiredSignatures = removeProtectedBranchRequiredSignatures.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecks = removeProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecksContexts = removeProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], removeProtectedBranchRestrictions = removeProtectedBranchRestrictions.asInstanceOf[js.Any], removeProtectedBranchTeamRestrictions = removeProtectedBranchTeamRestrictions.asInstanceOf[js.Any], removeProtectedBranchUserRestrictions = removeProtectedBranchUserRestrictions.asInstanceOf[js.Any], removeStatusCheckContexts = removeStatusCheckContexts.asInstanceOf[js.Any], removeStatusCheckProtection = removeStatusCheckProtection.asInstanceOf[js.Any], removeTeamAccessRestrictions = removeTeamAccessRestrictions.asInstanceOf[js.Any], removeUserAccessRestrictions = removeUserAccessRestrictions.asInstanceOf[js.Any], replaceAllTopics = replaceAllTopics.asInstanceOf[js.Any], replaceProtectedBranchAppRestrictions = replaceProtectedBranchAppRestrictions.asInstanceOf[js.Any], replaceProtectedBranchRequiredStatusChecksContexts = replaceProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], replaceProtectedBranchTeamRestrictions = replaceProtectedBranchTeamRestrictions.asInstanceOf[js.Any], replaceProtectedBranchUserRestrictions = replaceProtectedBranchUserRestrictions.asInstanceOf[js.Any], replaceTopics = replaceTopics.asInstanceOf[js.Any], requestPageBuild = requestPageBuild.asInstanceOf[js.Any], requestPagesBuild = requestPagesBuild.asInstanceOf[js.Any], retrieveCommunityProfileMetrics = retrieveCommunityProfileMetrics.asInstanceOf[js.Any], setAdminBranchProtection = setAdminBranchProtection.asInstanceOf[js.Any], setAppAccessRestrictions = setAppAccessRestrictions.asInstanceOf[js.Any], setStatusCheckContexts = setStatusCheckContexts.asInstanceOf[js.Any], setTeamAccessRestrictions = setTeamAccessRestrictions.asInstanceOf[js.Any], setUserAccessRestrictions = setUserAccessRestrictions.asInstanceOf[js.Any], testPushHook = testPushHook.asInstanceOf[js.Any], testPushWebhook = testPushWebhook.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranchProtection = updateBranchProtection.asInstanceOf[js.Any], updateCommitComment = updateCommitComment.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], updateInformationAboutPagesSite = updateInformationAboutPagesSite.asInstanceOf[js.Any], updateInvitation = updateInvitation.asInstanceOf[js.Any], updateProtectedBranchPullRequestReviewEnforcement = updateProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], updateProtectedBranchRequiredStatusChecks = updateProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], updatePullRequestReviewProtection = updatePullRequestReviewProtection.asInstanceOf[js.Any], updateRelease = updateRelease.asInstanceOf[js.Any], updateReleaseAsset = updateReleaseAsset.asInstanceOf[js.Any], updateStatusCheckPotection = updateStatusCheckPotection.asInstanceOf[js.Any], updateWebhook = updateWebhook.asInstanceOf[js.Any], uploadReleaseAsset = uploadReleaseAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAppAccessRestrictions]
  }
}

