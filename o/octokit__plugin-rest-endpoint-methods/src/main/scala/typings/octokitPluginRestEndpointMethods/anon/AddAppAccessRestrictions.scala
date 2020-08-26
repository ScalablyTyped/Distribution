package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAppAccessRestrictions extends js.Object {
  var acceptInvitation: `886` = js.native
  var addAppAccessRestrictions: `887` = js.native
  var addCollaborator: `888` = js.native
  var addStatusCheckContexts: `889` = js.native
  var addTeamAccessRestrictions: `890` = js.native
  var addUserAccessRestrictions: `891` = js.native
  var checkCollaborator: `892` = js.native
  var checkVulnerabilityAlerts: `893` = js.native
  var compareCommits: `894` = js.native
  var createCommitComment: `895` = js.native
  var createCommitSignatureProtection: `896` = js.native
  var createCommitStatus: `897` = js.native
  var createDeployKey: `898` = js.native
  var createDeployment: `899` = js.native
  var createDeploymentStatus: `900` = js.native
  var createDispatchEvent: `901` = js.native
  var createForAuthenticatedUser: `902` = js.native
  var createFork: `903` = js.native
  var createInOrg: `904` = js.native
  var createOrUpdateFileContents: `905` = js.native
  var createPagesSite: `906` = js.native
  var createRelease: `907` = js.native
  var createUsingTemplate: `908` = js.native
  var createWebhook: `909` = js.native
  var declineInvitation: `910` = js.native
  var delete: `911` = js.native
  var deleteAccessRestrictions: `912` = js.native
  var deleteAdminBranchProtection: `913` = js.native
  var deleteBranchProtection: `914` = js.native
  var deleteCommitComment: `915` = js.native
  var deleteCommitSignatureProtection: `916` = js.native
  var deleteDeployKey: `917` = js.native
  var deleteDeployment: `918` = js.native
  var deleteFile: `919` = js.native
  var deleteInvitation: `920` = js.native
  var deletePagesSite: `921` = js.native
  var deletePullRequestReviewProtection: `922` = js.native
  var deleteRelease: `923` = js.native
  var deleteReleaseAsset: `924` = js.native
  var deleteWebhook: `925` = js.native
  var disableAutomatedSecurityFixes: `926` = js.native
  var disableVulnerabilityAlerts: `927` = js.native
  var downloadArchive: `928` = js.native
  var enableAutomatedSecurityFixes: `929` = js.native
  var enableVulnerabilityAlerts: `930` = js.native
  var get: `931` = js.native
  var getAccessRestrictions: `932` = js.native
  var getAdminBranchProtection: `933` = js.native
  var getAllStatusCheckContexts: `934` = js.native
  var getAllTopics: `935` = js.native
  var getAppsWithAccessToProtectedBranch: `936` = js.native
  var getBranch: `937` = js.native
  var getBranchProtection: `938` = js.native
  var getClones: `939` = js.native
  var getCodeFrequencyStats: `940` = js.native
  var getCollaboratorPermissionLevel: `941` = js.native
  var getCombinedStatusForRef: `942` = js.native
  var getCommit: `943` = js.native
  var getCommitActivityStats: `944` = js.native
  var getCommitComment: `945` = js.native
  var getCommitSignatureProtection: `946` = js.native
  var getCommunityProfileMetrics: `947` = js.native
  var getContent: `948` = js.native
  var getContributorsStats: `949` = js.native
  var getDeployKey: `950` = js.native
  var getDeployment: `951` = js.native
  var getDeploymentStatus: `952` = js.native
  var getLatestPagesBuild: `953` = js.native
  var getLatestRelease: `954` = js.native
  var getPages: `955` = js.native
  var getPagesBuild: `956` = js.native
  var getParticipationStats: `957` = js.native
  var getPullRequestReviewProtection: `958` = js.native
  var getPunchCardStats: `959` = js.native
  var getReadme: `960` = js.native
  var getRelease: `961` = js.native
  var getReleaseAsset: `962` = js.native
  var getReleaseByTag: `963` = js.native
  var getStatusChecksProtection: `964` = js.native
  var getTeamsWithAccessToProtectedBranch: `965` = js.native
  var getTopPaths: `966` = js.native
  var getTopReferrers: `967` = js.native
  var getUsersWithAccessToProtectedBranch: `968` = js.native
  var getViews: `969` = js.native
  var getWebhook: `970` = js.native
  var listBranches: `971` = js.native
  var listBranchesForHeadCommit: `972` = js.native
  var listCollaborators: `973` = js.native
  var listCommentsForCommit: `974` = js.native
  var listCommitCommentsForRepo: `975` = js.native
  var listCommitStatusesForRef: `976` = js.native
  var listCommits: `977` = js.native
  var listContributors: `978` = js.native
  var listDeployKeys: `979` = js.native
  var listDeploymentStatuses: `980` = js.native
  var listDeployments: `981` = js.native
  var listForAuthenticatedUser: `982` = js.native
  var listForOrg: `983` = js.native
  var listForUser: `984` = js.native
  var listForks: `985` = js.native
  var listInvitations: `986` = js.native
  var listInvitationsForAuthenticatedUser: `987` = js.native
  var listLanguages: `988` = js.native
  var listPagesBuilds: `989` = js.native
  var listPublic: `990` = js.native
  var listPullRequestsAssociatedWithCommit: `991` = js.native
  var listReleaseAssets: `992` = js.native
  var listReleases: `993` = js.native
  var listTags: `994` = js.native
  var listTeams: `995` = js.native
  var listWebhooks: `996` = js.native
  var merge: `997` = js.native
  var pingWebhook: `998` = js.native
  var removeAppAccessRestrictions: `999` = js.native
  var removeCollaborator: `1000` = js.native
  var removeStatusCheckContexts: `1001` = js.native
  var removeStatusCheckProtection: `1002` = js.native
  var removeTeamAccessRestrictions: `1003` = js.native
  var removeUserAccessRestrictions: `1004` = js.native
  var replaceAllTopics: `1005` = js.native
  var requestPagesBuild: `1006` = js.native
  var setAdminBranchProtection: `1007` = js.native
  var setAppAccessRestrictions: `1008` = js.native
  var setStatusCheckContexts: `1009` = js.native
  var setTeamAccessRestrictions: `1010` = js.native
  var setUserAccessRestrictions: `1011` = js.native
  var testPushWebhook: `1012` = js.native
  var transfer: `1013` = js.native
  var update: `1014` = js.native
  var updateBranchProtection: `1015` = js.native
  var updateCommitComment: `1016` = js.native
  var updateInformationAboutPagesSite: `1017` = js.native
  var updateInvitation: `1018` = js.native
  var updatePullRequestReviewProtection: `1019` = js.native
  var updateRelease: `1020` = js.native
  var updateReleaseAsset: `1021` = js.native
  var updateStatusCheckPotection: `1022` = js.native
  var updateWebhook: `1023` = js.native
  var uploadReleaseAsset: `1024` = js.native
}

object AddAppAccessRestrictions {
  @scala.inline
  def apply(
    acceptInvitation: `886`,
    addAppAccessRestrictions: `887`,
    addCollaborator: `888`,
    addStatusCheckContexts: `889`,
    addTeamAccessRestrictions: `890`,
    addUserAccessRestrictions: `891`,
    checkCollaborator: `892`,
    checkVulnerabilityAlerts: `893`,
    compareCommits: `894`,
    createCommitComment: `895`,
    createCommitSignatureProtection: `896`,
    createCommitStatus: `897`,
    createDeployKey: `898`,
    createDeployment: `899`,
    createDeploymentStatus: `900`,
    createDispatchEvent: `901`,
    createForAuthenticatedUser: `902`,
    createFork: `903`,
    createInOrg: `904`,
    createOrUpdateFileContents: `905`,
    createPagesSite: `906`,
    createRelease: `907`,
    createUsingTemplate: `908`,
    createWebhook: `909`,
    declineInvitation: `910`,
    delete: `911`,
    deleteAccessRestrictions: `912`,
    deleteAdminBranchProtection: `913`,
    deleteBranchProtection: `914`,
    deleteCommitComment: `915`,
    deleteCommitSignatureProtection: `916`,
    deleteDeployKey: `917`,
    deleteDeployment: `918`,
    deleteFile: `919`,
    deleteInvitation: `920`,
    deletePagesSite: `921`,
    deletePullRequestReviewProtection: `922`,
    deleteRelease: `923`,
    deleteReleaseAsset: `924`,
    deleteWebhook: `925`,
    disableAutomatedSecurityFixes: `926`,
    disableVulnerabilityAlerts: `927`,
    downloadArchive: `928`,
    enableAutomatedSecurityFixes: `929`,
    enableVulnerabilityAlerts: `930`,
    get: `931`,
    getAccessRestrictions: `932`,
    getAdminBranchProtection: `933`,
    getAllStatusCheckContexts: `934`,
    getAllTopics: `935`,
    getAppsWithAccessToProtectedBranch: `936`,
    getBranch: `937`,
    getBranchProtection: `938`,
    getClones: `939`,
    getCodeFrequencyStats: `940`,
    getCollaboratorPermissionLevel: `941`,
    getCombinedStatusForRef: `942`,
    getCommit: `943`,
    getCommitActivityStats: `944`,
    getCommitComment: `945`,
    getCommitSignatureProtection: `946`,
    getCommunityProfileMetrics: `947`,
    getContent: `948`,
    getContributorsStats: `949`,
    getDeployKey: `950`,
    getDeployment: `951`,
    getDeploymentStatus: `952`,
    getLatestPagesBuild: `953`,
    getLatestRelease: `954`,
    getPages: `955`,
    getPagesBuild: `956`,
    getParticipationStats: `957`,
    getPullRequestReviewProtection: `958`,
    getPunchCardStats: `959`,
    getReadme: `960`,
    getRelease: `961`,
    getReleaseAsset: `962`,
    getReleaseByTag: `963`,
    getStatusChecksProtection: `964`,
    getTeamsWithAccessToProtectedBranch: `965`,
    getTopPaths: `966`,
    getTopReferrers: `967`,
    getUsersWithAccessToProtectedBranch: `968`,
    getViews: `969`,
    getWebhook: `970`,
    listBranches: `971`,
    listBranchesForHeadCommit: `972`,
    listCollaborators: `973`,
    listCommentsForCommit: `974`,
    listCommitCommentsForRepo: `975`,
    listCommitStatusesForRef: `976`,
    listCommits: `977`,
    listContributors: `978`,
    listDeployKeys: `979`,
    listDeploymentStatuses: `980`,
    listDeployments: `981`,
    listForAuthenticatedUser: `982`,
    listForOrg: `983`,
    listForUser: `984`,
    listForks: `985`,
    listInvitations: `986`,
    listInvitationsForAuthenticatedUser: `987`,
    listLanguages: `988`,
    listPagesBuilds: `989`,
    listPublic: `990`,
    listPullRequestsAssociatedWithCommit: `991`,
    listReleaseAssets: `992`,
    listReleases: `993`,
    listTags: `994`,
    listTeams: `995`,
    listWebhooks: `996`,
    merge: `997`,
    pingWebhook: `998`,
    removeAppAccessRestrictions: `999`,
    removeCollaborator: `1000`,
    removeStatusCheckContexts: `1001`,
    removeStatusCheckProtection: `1002`,
    removeTeamAccessRestrictions: `1003`,
    removeUserAccessRestrictions: `1004`,
    replaceAllTopics: `1005`,
    requestPagesBuild: `1006`,
    setAdminBranchProtection: `1007`,
    setAppAccessRestrictions: `1008`,
    setStatusCheckContexts: `1009`,
    setTeamAccessRestrictions: `1010`,
    setUserAccessRestrictions: `1011`,
    testPushWebhook: `1012`,
    transfer: `1013`,
    update: `1014`,
    updateBranchProtection: `1015`,
    updateCommitComment: `1016`,
    updateInformationAboutPagesSite: `1017`,
    updateInvitation: `1018`,
    updatePullRequestReviewProtection: `1019`,
    updateRelease: `1020`,
    updateReleaseAsset: `1021`,
    updateStatusCheckPotection: `1022`,
    updateWebhook: `1023`,
    uploadReleaseAsset: `1024`
  ): AddAppAccessRestrictions = {
    val __obj = js.Dynamic.literal(acceptInvitation = acceptInvitation.asInstanceOf[js.Any], addAppAccessRestrictions = addAppAccessRestrictions.asInstanceOf[js.Any], addCollaborator = addCollaborator.asInstanceOf[js.Any], addStatusCheckContexts = addStatusCheckContexts.asInstanceOf[js.Any], addTeamAccessRestrictions = addTeamAccessRestrictions.asInstanceOf[js.Any], addUserAccessRestrictions = addUserAccessRestrictions.asInstanceOf[js.Any], checkCollaborator = checkCollaborator.asInstanceOf[js.Any], checkVulnerabilityAlerts = checkVulnerabilityAlerts.asInstanceOf[js.Any], compareCommits = compareCommits.asInstanceOf[js.Any], createCommitComment = createCommitComment.asInstanceOf[js.Any], createCommitSignatureProtection = createCommitSignatureProtection.asInstanceOf[js.Any], createCommitStatus = createCommitStatus.asInstanceOf[js.Any], createDeployKey = createDeployKey.asInstanceOf[js.Any], createDeployment = createDeployment.asInstanceOf[js.Any], createDeploymentStatus = createDeploymentStatus.asInstanceOf[js.Any], createDispatchEvent = createDispatchEvent.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createFork = createFork.asInstanceOf[js.Any], createInOrg = createInOrg.asInstanceOf[js.Any], createOrUpdateFileContents = createOrUpdateFileContents.asInstanceOf[js.Any], createPagesSite = createPagesSite.asInstanceOf[js.Any], createRelease = createRelease.asInstanceOf[js.Any], createUsingTemplate = createUsingTemplate.asInstanceOf[js.Any], createWebhook = createWebhook.asInstanceOf[js.Any], declineInvitation = declineInvitation.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteAccessRestrictions = deleteAccessRestrictions.asInstanceOf[js.Any], deleteAdminBranchProtection = deleteAdminBranchProtection.asInstanceOf[js.Any], deleteBranchProtection = deleteBranchProtection.asInstanceOf[js.Any], deleteCommitComment = deleteCommitComment.asInstanceOf[js.Any], deleteCommitSignatureProtection = deleteCommitSignatureProtection.asInstanceOf[js.Any], deleteDeployKey = deleteDeployKey.asInstanceOf[js.Any], deleteDeployment = deleteDeployment.asInstanceOf[js.Any], deleteFile = deleteFile.asInstanceOf[js.Any], deleteInvitation = deleteInvitation.asInstanceOf[js.Any], deletePagesSite = deletePagesSite.asInstanceOf[js.Any], deletePullRequestReviewProtection = deletePullRequestReviewProtection.asInstanceOf[js.Any], deleteRelease = deleteRelease.asInstanceOf[js.Any], deleteReleaseAsset = deleteReleaseAsset.asInstanceOf[js.Any], deleteWebhook = deleteWebhook.asInstanceOf[js.Any], disableAutomatedSecurityFixes = disableAutomatedSecurityFixes.asInstanceOf[js.Any], disableVulnerabilityAlerts = disableVulnerabilityAlerts.asInstanceOf[js.Any], downloadArchive = downloadArchive.asInstanceOf[js.Any], enableAutomatedSecurityFixes = enableAutomatedSecurityFixes.asInstanceOf[js.Any], enableVulnerabilityAlerts = enableVulnerabilityAlerts.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAccessRestrictions = getAccessRestrictions.asInstanceOf[js.Any], getAdminBranchProtection = getAdminBranchProtection.asInstanceOf[js.Any], getAllStatusCheckContexts = getAllStatusCheckContexts.asInstanceOf[js.Any], getAllTopics = getAllTopics.asInstanceOf[js.Any], getAppsWithAccessToProtectedBranch = getAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], getBranch = getBranch.asInstanceOf[js.Any], getBranchProtection = getBranchProtection.asInstanceOf[js.Any], getClones = getClones.asInstanceOf[js.Any], getCodeFrequencyStats = getCodeFrequencyStats.asInstanceOf[js.Any], getCollaboratorPermissionLevel = getCollaboratorPermissionLevel.asInstanceOf[js.Any], getCombinedStatusForRef = getCombinedStatusForRef.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getCommitActivityStats = getCommitActivityStats.asInstanceOf[js.Any], getCommitComment = getCommitComment.asInstanceOf[js.Any], getCommitSignatureProtection = getCommitSignatureProtection.asInstanceOf[js.Any], getCommunityProfileMetrics = getCommunityProfileMetrics.asInstanceOf[js.Any], getContent = getContent.asInstanceOf[js.Any], getContributorsStats = getContributorsStats.asInstanceOf[js.Any], getDeployKey = getDeployKey.asInstanceOf[js.Any], getDeployment = getDeployment.asInstanceOf[js.Any], getDeploymentStatus = getDeploymentStatus.asInstanceOf[js.Any], getLatestPagesBuild = getLatestPagesBuild.asInstanceOf[js.Any], getLatestRelease = getLatestRelease.asInstanceOf[js.Any], getPages = getPages.asInstanceOf[js.Any], getPagesBuild = getPagesBuild.asInstanceOf[js.Any], getParticipationStats = getParticipationStats.asInstanceOf[js.Any], getPullRequestReviewProtection = getPullRequestReviewProtection.asInstanceOf[js.Any], getPunchCardStats = getPunchCardStats.asInstanceOf[js.Any], getReadme = getReadme.asInstanceOf[js.Any], getRelease = getRelease.asInstanceOf[js.Any], getReleaseAsset = getReleaseAsset.asInstanceOf[js.Any], getReleaseByTag = getReleaseByTag.asInstanceOf[js.Any], getStatusChecksProtection = getStatusChecksProtection.asInstanceOf[js.Any], getTeamsWithAccessToProtectedBranch = getTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], getTopPaths = getTopPaths.asInstanceOf[js.Any], getTopReferrers = getTopReferrers.asInstanceOf[js.Any], getUsersWithAccessToProtectedBranch = getUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], getViews = getViews.asInstanceOf[js.Any], getWebhook = getWebhook.asInstanceOf[js.Any], listBranches = listBranches.asInstanceOf[js.Any], listBranchesForHeadCommit = listBranchesForHeadCommit.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listCommentsForCommit = listCommentsForCommit.asInstanceOf[js.Any], listCommitCommentsForRepo = listCommitCommentsForRepo.asInstanceOf[js.Any], listCommitStatusesForRef = listCommitStatusesForRef.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listContributors = listContributors.asInstanceOf[js.Any], listDeployKeys = listDeployKeys.asInstanceOf[js.Any], listDeploymentStatuses = listDeploymentStatuses.asInstanceOf[js.Any], listDeployments = listDeployments.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listInvitations = listInvitations.asInstanceOf[js.Any], listInvitationsForAuthenticatedUser = listInvitationsForAuthenticatedUser.asInstanceOf[js.Any], listLanguages = listLanguages.asInstanceOf[js.Any], listPagesBuilds = listPagesBuilds.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPullRequestsAssociatedWithCommit = listPullRequestsAssociatedWithCommit.asInstanceOf[js.Any], listReleaseAssets = listReleaseAssets.asInstanceOf[js.Any], listReleases = listReleases.asInstanceOf[js.Any], listTags = listTags.asInstanceOf[js.Any], listTeams = listTeams.asInstanceOf[js.Any], listWebhooks = listWebhooks.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], pingWebhook = pingWebhook.asInstanceOf[js.Any], removeAppAccessRestrictions = removeAppAccessRestrictions.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], removeStatusCheckContexts = removeStatusCheckContexts.asInstanceOf[js.Any], removeStatusCheckProtection = removeStatusCheckProtection.asInstanceOf[js.Any], removeTeamAccessRestrictions = removeTeamAccessRestrictions.asInstanceOf[js.Any], removeUserAccessRestrictions = removeUserAccessRestrictions.asInstanceOf[js.Any], replaceAllTopics = replaceAllTopics.asInstanceOf[js.Any], requestPagesBuild = requestPagesBuild.asInstanceOf[js.Any], setAdminBranchProtection = setAdminBranchProtection.asInstanceOf[js.Any], setAppAccessRestrictions = setAppAccessRestrictions.asInstanceOf[js.Any], setStatusCheckContexts = setStatusCheckContexts.asInstanceOf[js.Any], setTeamAccessRestrictions = setTeamAccessRestrictions.asInstanceOf[js.Any], setUserAccessRestrictions = setUserAccessRestrictions.asInstanceOf[js.Any], testPushWebhook = testPushWebhook.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranchProtection = updateBranchProtection.asInstanceOf[js.Any], updateCommitComment = updateCommitComment.asInstanceOf[js.Any], updateInformationAboutPagesSite = updateInformationAboutPagesSite.asInstanceOf[js.Any], updateInvitation = updateInvitation.asInstanceOf[js.Any], updatePullRequestReviewProtection = updatePullRequestReviewProtection.asInstanceOf[js.Any], updateRelease = updateRelease.asInstanceOf[js.Any], updateReleaseAsset = updateReleaseAsset.asInstanceOf[js.Any], updateStatusCheckPotection = updateStatusCheckPotection.asInstanceOf[js.Any], updateWebhook = updateWebhook.asInstanceOf[js.Any], uploadReleaseAsset = uploadReleaseAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAppAccessRestrictions]
  }
  @scala.inline
  implicit class AddAppAccessRestrictionsOps[Self <: AddAppAccessRestrictions] (val x: Self) extends AnyVal {
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
    def setAcceptInvitation(value: `886`): Self = this.set("acceptInvitation", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddAppAccessRestrictions(value: `887`): Self = this.set("addAppAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddCollaborator(value: `888`): Self = this.set("addCollaborator", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddStatusCheckContexts(value: `889`): Self = this.set("addStatusCheckContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddTeamAccessRestrictions(value: `890`): Self = this.set("addTeamAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddUserAccessRestrictions(value: `891`): Self = this.set("addUserAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckCollaborator(value: `892`): Self = this.set("checkCollaborator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckVulnerabilityAlerts(value: `893`): Self = this.set("checkVulnerabilityAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompareCommits(value: `894`): Self = this.set("compareCommits", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateCommitComment(value: `895`): Self = this.set("createCommitComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateCommitSignatureProtection(value: `896`): Self = this.set("createCommitSignatureProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateCommitStatus(value: `897`): Self = this.set("createCommitStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDeployKey(value: `898`): Self = this.set("createDeployKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDeployment(value: `899`): Self = this.set("createDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDeploymentStatus(value: `900`): Self = this.set("createDeploymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDispatchEvent(value: `901`): Self = this.set("createDispatchEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateForAuthenticatedUser(value: `902`): Self = this.set("createForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateFork(value: `903`): Self = this.set("createFork", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateInOrg(value: `904`): Self = this.set("createInOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateOrUpdateFileContents(value: `905`): Self = this.set("createOrUpdateFileContents", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatePagesSite(value: `906`): Self = this.set("createPagesSite", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateRelease(value: `907`): Self = this.set("createRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateUsingTemplate(value: `908`): Self = this.set("createUsingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateWebhook(value: `909`): Self = this.set("createWebhook", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclineInvitation(value: `910`): Self = this.set("declineInvitation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: `911`): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteAccessRestrictions(value: `912`): Self = this.set("deleteAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteAdminBranchProtection(value: `913`): Self = this.set("deleteAdminBranchProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteBranchProtection(value: `914`): Self = this.set("deleteBranchProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteCommitComment(value: `915`): Self = this.set("deleteCommitComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteCommitSignatureProtection(value: `916`): Self = this.set("deleteCommitSignatureProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteDeployKey(value: `917`): Self = this.set("deleteDeployKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteDeployment(value: `918`): Self = this.set("deleteDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteFile(value: `919`): Self = this.set("deleteFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteInvitation(value: `920`): Self = this.set("deleteInvitation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletePagesSite(value: `921`): Self = this.set("deletePagesSite", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletePullRequestReviewProtection(value: `922`): Self = this.set("deletePullRequestReviewProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteRelease(value: `923`): Self = this.set("deleteRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteReleaseAsset(value: `924`): Self = this.set("deleteReleaseAsset", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteWebhook(value: `925`): Self = this.set("deleteWebhook", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableAutomatedSecurityFixes(value: `926`): Self = this.set("disableAutomatedSecurityFixes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableVulnerabilityAlerts(value: `927`): Self = this.set("disableVulnerabilityAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadArchive(value: `928`): Self = this.set("downloadArchive", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableAutomatedSecurityFixes(value: `929`): Self = this.set("enableAutomatedSecurityFixes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableVulnerabilityAlerts(value: `930`): Self = this.set("enableVulnerabilityAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: `931`): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAccessRestrictions(value: `932`): Self = this.set("getAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAdminBranchProtection(value: `933`): Self = this.set("getAdminBranchProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAllStatusCheckContexts(value: `934`): Self = this.set("getAllStatusCheckContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAllTopics(value: `935`): Self = this.set("getAllTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAppsWithAccessToProtectedBranch(value: `936`): Self = this.set("getAppsWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBranch(value: `937`): Self = this.set("getBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBranchProtection(value: `938`): Self = this.set("getBranchProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetClones(value: `939`): Self = this.set("getClones", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCodeFrequencyStats(value: `940`): Self = this.set("getCodeFrequencyStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCollaboratorPermissionLevel(value: `941`): Self = this.set("getCollaboratorPermissionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCombinedStatusForRef(value: `942`): Self = this.set("getCombinedStatusForRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCommit(value: `943`): Self = this.set("getCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCommitActivityStats(value: `944`): Self = this.set("getCommitActivityStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCommitComment(value: `945`): Self = this.set("getCommitComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCommitSignatureProtection(value: `946`): Self = this.set("getCommitSignatureProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCommunityProfileMetrics(value: `947`): Self = this.set("getCommunityProfileMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContent(value: `948`): Self = this.set("getContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetContributorsStats(value: `949`): Self = this.set("getContributorsStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeployKey(value: `950`): Self = this.set("getDeployKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeployment(value: `951`): Self = this.set("getDeployment", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeploymentStatus(value: `952`): Self = this.set("getDeploymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLatestPagesBuild(value: `953`): Self = this.set("getLatestPagesBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLatestRelease(value: `954`): Self = this.set("getLatestRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPages(value: `955`): Self = this.set("getPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPagesBuild(value: `956`): Self = this.set("getPagesBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetParticipationStats(value: `957`): Self = this.set("getParticipationStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPullRequestReviewProtection(value: `958`): Self = this.set("getPullRequestReviewProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPunchCardStats(value: `959`): Self = this.set("getPunchCardStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetReadme(value: `960`): Self = this.set("getReadme", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRelease(value: `961`): Self = this.set("getRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetReleaseAsset(value: `962`): Self = this.set("getReleaseAsset", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetReleaseByTag(value: `963`): Self = this.set("getReleaseByTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStatusChecksProtection(value: `964`): Self = this.set("getStatusChecksProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTeamsWithAccessToProtectedBranch(value: `965`): Self = this.set("getTeamsWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTopPaths(value: `966`): Self = this.set("getTopPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTopReferrers(value: `967`): Self = this.set("getTopReferrers", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetUsersWithAccessToProtectedBranch(value: `968`): Self = this.set("getUsersWithAccessToProtectedBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetViews(value: `969`): Self = this.set("getViews", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetWebhook(value: `970`): Self = this.set("getWebhook", value.asInstanceOf[js.Any])
    @scala.inline
    def setListBranches(value: `971`): Self = this.set("listBranches", value.asInstanceOf[js.Any])
    @scala.inline
    def setListBranchesForHeadCommit(value: `972`): Self = this.set("listBranchesForHeadCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCollaborators(value: `973`): Self = this.set("listCollaborators", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommentsForCommit(value: `974`): Self = this.set("listCommentsForCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommitCommentsForRepo(value: `975`): Self = this.set("listCommitCommentsForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommitStatusesForRef(value: `976`): Self = this.set("listCommitStatusesForRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setListCommits(value: `977`): Self = this.set("listCommits", value.asInstanceOf[js.Any])
    @scala.inline
    def setListContributors(value: `978`): Self = this.set("listContributors", value.asInstanceOf[js.Any])
    @scala.inline
    def setListDeployKeys(value: `979`): Self = this.set("listDeployKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setListDeploymentStatuses(value: `980`): Self = this.set("listDeploymentStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def setListDeployments(value: `981`): Self = this.set("listDeployments", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForAuthenticatedUser(value: `982`): Self = this.set("listForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForOrg(value: `983`): Self = this.set("listForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForUser(value: `984`): Self = this.set("listForUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListForks(value: `985`): Self = this.set("listForks", value.asInstanceOf[js.Any])
    @scala.inline
    def setListInvitations(value: `986`): Self = this.set("listInvitations", value.asInstanceOf[js.Any])
    @scala.inline
    def setListInvitationsForAuthenticatedUser(value: `987`): Self = this.set("listInvitationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setListLanguages(value: `988`): Self = this.set("listLanguages", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPagesBuilds(value: `989`): Self = this.set("listPagesBuilds", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPublic(value: `990`): Self = this.set("listPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setListPullRequestsAssociatedWithCommit(value: `991`): Self = this.set("listPullRequestsAssociatedWithCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReleaseAssets(value: `992`): Self = this.set("listReleaseAssets", value.asInstanceOf[js.Any])
    @scala.inline
    def setListReleases(value: `993`): Self = this.set("listReleases", value.asInstanceOf[js.Any])
    @scala.inline
    def setListTags(value: `994`): Self = this.set("listTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setListTeams(value: `995`): Self = this.set("listTeams", value.asInstanceOf[js.Any])
    @scala.inline
    def setListWebhooks(value: `996`): Self = this.set("listWebhooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerge(value: `997`): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def setPingWebhook(value: `998`): Self = this.set("pingWebhook", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAppAccessRestrictions(value: `999`): Self = this.set("removeAppAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveCollaborator(value: `1000`): Self = this.set("removeCollaborator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveStatusCheckContexts(value: `1001`): Self = this.set("removeStatusCheckContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveStatusCheckProtection(value: `1002`): Self = this.set("removeStatusCheckProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveTeamAccessRestrictions(value: `1003`): Self = this.set("removeTeamAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveUserAccessRestrictions(value: `1004`): Self = this.set("removeUserAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceAllTopics(value: `1005`): Self = this.set("replaceAllTopics", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestPagesBuild(value: `1006`): Self = this.set("requestPagesBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAdminBranchProtection(value: `1007`): Self = this.set("setAdminBranchProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAppAccessRestrictions(value: `1008`): Self = this.set("setAppAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetStatusCheckContexts(value: `1009`): Self = this.set("setStatusCheckContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetTeamAccessRestrictions(value: `1010`): Self = this.set("setTeamAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetUserAccessRestrictions(value: `1011`): Self = this.set("setUserAccessRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPushWebhook(value: `1012`): Self = this.set("testPushWebhook", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransfer(value: `1013`): Self = this.set("transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: `1014`): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateBranchProtection(value: `1015`): Self = this.set("updateBranchProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateCommitComment(value: `1016`): Self = this.set("updateCommitComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateInformationAboutPagesSite(value: `1017`): Self = this.set("updateInformationAboutPagesSite", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateInvitation(value: `1018`): Self = this.set("updateInvitation", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatePullRequestReviewProtection(value: `1019`): Self = this.set("updatePullRequestReviewProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateRelease(value: `1020`): Self = this.set("updateRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateReleaseAsset(value: `1021`): Self = this.set("updateReleaseAsset", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateStatusCheckPotection(value: `1022`): Self = this.set("updateStatusCheckPotection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateWebhook(value: `1023`): Self = this.set("updateWebhook", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadReleaseAsset(value: `1024`): Self = this.set("uploadReleaseAsset", value.asInstanceOf[js.Any])
  }
  
}

