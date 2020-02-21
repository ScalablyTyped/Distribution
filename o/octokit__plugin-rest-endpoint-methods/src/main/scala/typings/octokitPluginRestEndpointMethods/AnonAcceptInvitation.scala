package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptInvitation extends js.Object {
  var acceptInvitation: AnonMethodParamsUrlAnonInvitationidAnonRequired
  var addCollaborator: AnonMethodParamsUrlAnonOwnerPermission
  var addDeployKey: AnonMethodParamsUrlAnonKeyOwner
  var addProtectedBranchAdminEnforcement: AnonMethodParamsUrlAnonBranch
  var addProtectedBranchAppRestrictions: AnonMethodParamsUrlAnonApps
  var addProtectedBranchRequiredSignatures: AnonHeadersMethodParamsUrlAnonAcceptAnonBranch
  var addProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranchContexts
  var addProtectedBranchTeamRestrictions: AnonMethodParamsUrlAnonBranchOwner
  var addProtectedBranchUserRestrictions: AnonMethodParamsUrlAnonBranchOwnerRepo
  var checkCollaborator: AnonMethodParamsUrlAnonOwnerRepoUsername
  var checkVulnerabilityAlerts: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var compareCommits: AnonMethodParamsUrlAnonBaseHead
  var createCommitComment: AnonMethodParamsUrlAnonBodyCommitsha
  var createDeployment: AnonMethodParamsUrlAnonAutomerge
  var createDeploymentStatus: AnonMethodParamsUrlAnonAutoinactive
  var createDispatchEvent: AnonMethodParamsUrlAnonClientpayload
  var createFile: AnonDeprecatedMethodParamsUrlAnonAuthorAuthoremail
  var createForAuthenticatedUser: AnonMethodParamsUrlAnonAllowmergecommit
  var createFork: AnonMethodParamsUrlAnonOrganization
  var createHook: AnonMethodParamsUrlAnonActiveConfigConfigcontenttype
  var createInOrg: AnonMethodParamsUrlAnonAllowmergecommitAllowrebasemerge
  var createOrUpdateFile: AnonMethodParamsUrlAnonAuthorAuthoremail
  var createRelease: AnonMethodParamsUrlAnonBodyDraft
  var createStatus: AnonMethodParamsUrlAnonContextDescription
  var createUsingTemplate: AnonHeadersMethodParamsUrlAnonAcceptAnonDescriptionName
  var declineInvitation: AnonMethodParamsUrlAnonInvitationidAnonRequired
  var delete: AnonMethodParamsUrl
  var deleteCommitComment: AnonMethodParamsUrlAnonCommentidOwner
  var deleteDownload: AnonMethodParamsUrlAnonDownloadid
  var deleteFile: AnonMethodParamsUrlAnonAuthorAuthoremailAuthorname
  var deleteHook: AnonMethodParamsUrlAnonHookidOwner
  var deleteInvitation: AnonMethodParamsUrlAnonInvitationidOwner
  var deleteRelease: AnonMethodParamsUrlAnonOwnerReleaseid
  var deleteReleaseAsset: AnonMethodParamsUrlAnonAssetid
  var disableAutomatedSecurityFixes: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var disablePagesSite: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var disableVulnerabilityAlerts: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var enableAutomatedSecurityFixes: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var enablePagesSite: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepoSource
  var enableVulnerabilityAlerts: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var get: AnonMethodParamsUrl
  var getAppsWithAccessToProtectedBranch: AnonMethodParamsUrlAnonBranch
  var getArchiveLink: AnonMethodParamsUrlAnonArchiveformatOwner
  var getBranch: AnonMethodParamsUrlAnonBranch
  var getBranchProtection: AnonMethodParamsUrlAnonBranch
  var getClones: AnonMethodParamsUrlAnonOwnerPer
  var getCodeFrequencyStats: AnonMethodParamsUrl
  var getCollaboratorPermissionLevel: AnonMethodParamsUrlAnonOwnerRepoUsername
  var getCombinedStatusForRef: AnonMethodParamsUrlAnonOwnerRefRepo
  var getCommit: AnonMethodParamsUrlAnonCommitshaOwner
  var getCommitActivityStats: AnonMethodParamsUrl
  var getCommitComment: AnonMethodParamsUrlAnonCommentidOwner
  var getCommitRefSha: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonOwnerRefRepo
  var getContents: AnonMethodParamsUrlAnonOwnerPath
  var getContributorsStats: AnonMethodParamsUrl
  var getDeployKey: AnonMethodParamsUrlAnonKeyid
  var getDeployment: AnonMethodParamsUrlAnonDeploymentid
  var getDeploymentStatus: AnonMethodParamsUrlAnonDeploymentidOwner
  var getDownload: AnonMethodParamsUrlAnonDownloadid
  var getHook: AnonMethodParamsUrlAnonHookidOwner
  var getLatestPagesBuild: AnonMethodParamsUrl
  var getLatestRelease: AnonMethodParamsUrl
  var getPages: AnonMethodParamsUrl
  var getPagesBuild: AnonMethodParamsUrlAnonBuildid
  var getParticipationStats: AnonMethodParamsUrl
  var getProtectedBranchAdminEnforcement: AnonMethodParamsUrlAnonBranch
  var getProtectedBranchPullRequestReviewEnforcement: AnonMethodParamsUrlAnonBranch
  var getProtectedBranchRequiredSignatures: AnonHeadersMethodParamsUrlAnonAcceptAnonBranch
  var getProtectedBranchRequiredStatusChecks: AnonMethodParamsUrlAnonBranch
  var getProtectedBranchRestrictions: AnonMethodParamsUrlAnonBranch
  var getPunchCardStats: AnonMethodParamsUrl
  var getReadme: AnonMethodParamsUrlAnonOwnerRefRepoAnonRequired
  var getRelease: AnonMethodParamsUrlAnonOwnerReleaseid
  var getReleaseAsset: AnonMethodParamsUrlAnonAssetid
  var getReleaseByTag: AnonMethodParamsUrlAnonOwnerRepoTag
  var getTeamsWithAccessToProtectedBranch: AnonMethodParamsUrlAnonBranch
  var getTopPaths: AnonMethodParamsUrl
  var getTopReferrers: AnonMethodParamsUrl
  var getUsersWithAccessToProtectedBranch: AnonMethodParamsUrlAnonBranch
  var getViews: AnonMethodParamsUrlAnonOwnerPer
  var list: AnonMethodParamsUrlAnonAffiliationDirection
  var listAppsWithAccessToProtectedBranch: AnonDeprecatedMethodParamsUrlAnonBranch
  var listAssetsForRelease: AnonMethodParamsUrlAnonOwnerPagePerpageReleaseid
  var listBranches: AnonMethodParamsUrlAnonOwnerPagePerpageProtected
  var listBranchesForHeadCommit: AnonHeadersMethodParamsUrlAnonAcceptAnonCommitsha
  var listCollaborators: AnonMethodParamsUrlAnonAffiliationOwner
  var listCommentsForCommit: AnonMethodParamsUrlAnonCommitshaOwnerPage
  var listCommitComments: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listCommits: AnonMethodParamsUrlAnonAuthorOwner
  var listContributors: AnonMethodParamsUrlAnonAnon
  var listDeployKeys: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listDeploymentStatuses: AnonMethodParamsUrlAnonDeploymentidOwnerPage
  var listDeployments: AnonMethodParamsUrlAnonEnvironment
  var listDownloads: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listForOrg: AnonMethodParamsUrlAnonDirectionOrg
  var listForUser: AnonMethodParamsUrlAnonDirectionPagePerpageSort
  var listForks: AnonMethodParamsUrlAnonOwnerPagePerpageRepoSort
  var listHooks: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listInvitations: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listInvitationsForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage
  var listLanguages: AnonMethodParamsUrl
  var listPagesBuilds: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranch
  var listProtectedBranchTeamRestrictions: AnonDeprecatedMethodParamsUrlAnonBranch
  var listProtectedBranchUserRestrictions: AnonDeprecatedMethodParamsUrlAnonBranch
  var listPublic: AnonMethodParamsUrlAnonPagePerpageSince
  var listPullRequestsAssociatedWithCommit: AnonHeadersMethodParamsUrlAnonAcceptAnonCommitshaOwnerPagePerpage
  var listReleases: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listStatusesForRef: AnonMethodParamsUrlAnonOwnerPagePerpageRef
  var listTags: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listTeams: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listTeamsWithAccessToProtectedBranch: AnonDeprecatedMethodParamsUrlAnonBranch
  var listTopics: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var listUsersWithAccessToProtectedBranch: AnonDeprecatedMethodParamsUrlAnonBranch
  var merge: AnonMethodParamsUrlAnonBaseCommitmessage
  var pingHook: AnonMethodParamsUrlAnonHookidOwner
  var removeBranchProtection: AnonMethodParamsUrlAnonBranch
  var removeCollaborator: AnonMethodParamsUrlAnonOwnerRepoUsername
  var removeDeployKey: AnonMethodParamsUrlAnonKeyid
  var removeProtectedBranchAdminEnforcement: AnonMethodParamsUrlAnonBranch
  var removeProtectedBranchAppRestrictions: AnonMethodParamsUrlAnonApps
  var removeProtectedBranchPullRequestReviewEnforcement: AnonMethodParamsUrlAnonBranch
  var removeProtectedBranchRequiredSignatures: AnonHeadersMethodParamsUrlAnonAcceptAnonBranch
  var removeProtectedBranchRequiredStatusChecks: AnonMethodParamsUrlAnonBranch
  var removeProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranchContexts
  var removeProtectedBranchRestrictions: AnonMethodParamsUrlAnonBranch
  var removeProtectedBranchTeamRestrictions: AnonMethodParamsUrlAnonBranchOwner
  var removeProtectedBranchUserRestrictions: AnonMethodParamsUrlAnonBranchOwnerRepo
  var replaceProtectedBranchAppRestrictions: AnonMethodParamsUrlAnonApps
  var replaceProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranchContexts
  var replaceProtectedBranchTeamRestrictions: AnonMethodParamsUrlAnonBranchOwner
  var replaceProtectedBranchUserRestrictions: AnonMethodParamsUrlAnonBranchOwnerRepo
  var replaceTopics: AnonHeadersMethodParamsUrlAnonAcceptAnonNames
  var requestPageBuild: AnonMethodParamsUrl
  var retrieveCommunityProfileMetrics: AnonMethodParamsUrl
  var testPushHook: AnonMethodParamsUrlAnonHookidOwner
  var transfer: AnonMethodParamsUrlAnonNewowner
  var update: AnonMethodParamsUrlAnonAllowmergecommitAllowrebasemergeAllowsquashmerge
  var updateBranchProtection: AnonMethodParamsUrlAnonAllowdeletions
  var updateCommitComment: AnonMethodParamsUrlAnonBodyCommentidOwner
  var updateFile: AnonDeprecatedMethodParamsUrlAnonAuthorAuthoremail
  var updateHook: AnonMethodParamsUrlAnonActiveAddevents
  var updateInformationAboutPagesSite: AnonMethodParamsUrlAnonCname
  var updateInvitation: AnonMethodParamsUrlAnonInvitationidOwnerPermissions
  var updateProtectedBranchPullRequestReviewEnforcement: AnonMethodParamsUrlAnonBranchDismissalrestrictions
  var updateProtectedBranchRequiredStatusChecks: AnonMethodParamsUrlAnonBranchContextsOwner
  var updateRelease: AnonMethodParamsUrlAnonBodyDraftName
  var updateReleaseAsset: AnonMethodParamsUrlAnonAssetidLabel
  var uploadReleaseAsset: AnonMethodParamsUrlAnonDataFile
}

object AnonAcceptInvitation {
  @scala.inline
  def apply(
    acceptInvitation: AnonMethodParamsUrlAnonInvitationidAnonRequired,
    addCollaborator: AnonMethodParamsUrlAnonOwnerPermission,
    addDeployKey: AnonMethodParamsUrlAnonKeyOwner,
    addProtectedBranchAdminEnforcement: AnonMethodParamsUrlAnonBranch,
    addProtectedBranchAppRestrictions: AnonMethodParamsUrlAnonApps,
    addProtectedBranchRequiredSignatures: AnonHeadersMethodParamsUrlAnonAcceptAnonBranch,
    addProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranchContexts,
    addProtectedBranchTeamRestrictions: AnonMethodParamsUrlAnonBranchOwner,
    addProtectedBranchUserRestrictions: AnonMethodParamsUrlAnonBranchOwnerRepo,
    checkCollaborator: AnonMethodParamsUrlAnonOwnerRepoUsername,
    checkVulnerabilityAlerts: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    compareCommits: AnonMethodParamsUrlAnonBaseHead,
    createCommitComment: AnonMethodParamsUrlAnonBodyCommitsha,
    createDeployment: AnonMethodParamsUrlAnonAutomerge,
    createDeploymentStatus: AnonMethodParamsUrlAnonAutoinactive,
    createDispatchEvent: AnonMethodParamsUrlAnonClientpayload,
    createFile: AnonDeprecatedMethodParamsUrlAnonAuthorAuthoremail,
    createForAuthenticatedUser: AnonMethodParamsUrlAnonAllowmergecommit,
    createFork: AnonMethodParamsUrlAnonOrganization,
    createHook: AnonMethodParamsUrlAnonActiveConfigConfigcontenttype,
    createInOrg: AnonMethodParamsUrlAnonAllowmergecommitAllowrebasemerge,
    createOrUpdateFile: AnonMethodParamsUrlAnonAuthorAuthoremail,
    createRelease: AnonMethodParamsUrlAnonBodyDraft,
    createStatus: AnonMethodParamsUrlAnonContextDescription,
    createUsingTemplate: AnonHeadersMethodParamsUrlAnonAcceptAnonDescriptionName,
    declineInvitation: AnonMethodParamsUrlAnonInvitationidAnonRequired,
    delete: AnonMethodParamsUrl,
    deleteCommitComment: AnonMethodParamsUrlAnonCommentidOwner,
    deleteDownload: AnonMethodParamsUrlAnonDownloadid,
    deleteFile: AnonMethodParamsUrlAnonAuthorAuthoremailAuthorname,
    deleteHook: AnonMethodParamsUrlAnonHookidOwner,
    deleteInvitation: AnonMethodParamsUrlAnonInvitationidOwner,
    deleteRelease: AnonMethodParamsUrlAnonOwnerReleaseid,
    deleteReleaseAsset: AnonMethodParamsUrlAnonAssetid,
    disableAutomatedSecurityFixes: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    disablePagesSite: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    disableVulnerabilityAlerts: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    enableAutomatedSecurityFixes: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    enablePagesSite: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepoSource,
    enableVulnerabilityAlerts: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    get: AnonMethodParamsUrl,
    getAppsWithAccessToProtectedBranch: AnonMethodParamsUrlAnonBranch,
    getArchiveLink: AnonMethodParamsUrlAnonArchiveformatOwner,
    getBranch: AnonMethodParamsUrlAnonBranch,
    getBranchProtection: AnonMethodParamsUrlAnonBranch,
    getClones: AnonMethodParamsUrlAnonOwnerPer,
    getCodeFrequencyStats: AnonMethodParamsUrl,
    getCollaboratorPermissionLevel: AnonMethodParamsUrlAnonOwnerRepoUsername,
    getCombinedStatusForRef: AnonMethodParamsUrlAnonOwnerRefRepo,
    getCommit: AnonMethodParamsUrlAnonCommitshaOwner,
    getCommitActivityStats: AnonMethodParamsUrl,
    getCommitComment: AnonMethodParamsUrlAnonCommentidOwner,
    getCommitRefSha: AnonDeprecatedHeadersMethodParamsUrlAnonAcceptAnonOwnerRefRepo,
    getContents: AnonMethodParamsUrlAnonOwnerPath,
    getContributorsStats: AnonMethodParamsUrl,
    getDeployKey: AnonMethodParamsUrlAnonKeyid,
    getDeployment: AnonMethodParamsUrlAnonDeploymentid,
    getDeploymentStatus: AnonMethodParamsUrlAnonDeploymentidOwner,
    getDownload: AnonMethodParamsUrlAnonDownloadid,
    getHook: AnonMethodParamsUrlAnonHookidOwner,
    getLatestPagesBuild: AnonMethodParamsUrl,
    getLatestRelease: AnonMethodParamsUrl,
    getPages: AnonMethodParamsUrl,
    getPagesBuild: AnonMethodParamsUrlAnonBuildid,
    getParticipationStats: AnonMethodParamsUrl,
    getProtectedBranchAdminEnforcement: AnonMethodParamsUrlAnonBranch,
    getProtectedBranchPullRequestReviewEnforcement: AnonMethodParamsUrlAnonBranch,
    getProtectedBranchRequiredSignatures: AnonHeadersMethodParamsUrlAnonAcceptAnonBranch,
    getProtectedBranchRequiredStatusChecks: AnonMethodParamsUrlAnonBranch,
    getProtectedBranchRestrictions: AnonMethodParamsUrlAnonBranch,
    getPunchCardStats: AnonMethodParamsUrl,
    getReadme: AnonMethodParamsUrlAnonOwnerRefRepoAnonRequired,
    getRelease: AnonMethodParamsUrlAnonOwnerReleaseid,
    getReleaseAsset: AnonMethodParamsUrlAnonAssetid,
    getReleaseByTag: AnonMethodParamsUrlAnonOwnerRepoTag,
    getTeamsWithAccessToProtectedBranch: AnonMethodParamsUrlAnonBranch,
    getTopPaths: AnonMethodParamsUrl,
    getTopReferrers: AnonMethodParamsUrl,
    getUsersWithAccessToProtectedBranch: AnonMethodParamsUrlAnonBranch,
    getViews: AnonMethodParamsUrlAnonOwnerPer,
    list: AnonMethodParamsUrlAnonAffiliationDirection,
    listAppsWithAccessToProtectedBranch: AnonDeprecatedMethodParamsUrlAnonBranch,
    listAssetsForRelease: AnonMethodParamsUrlAnonOwnerPagePerpageReleaseid,
    listBranches: AnonMethodParamsUrlAnonOwnerPagePerpageProtected,
    listBranchesForHeadCommit: AnonHeadersMethodParamsUrlAnonAcceptAnonCommitsha,
    listCollaborators: AnonMethodParamsUrlAnonAffiliationOwner,
    listCommentsForCommit: AnonMethodParamsUrlAnonCommitshaOwnerPage,
    listCommitComments: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listCommits: AnonMethodParamsUrlAnonAuthorOwner,
    listContributors: AnonMethodParamsUrlAnonAnon,
    listDeployKeys: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listDeploymentStatuses: AnonMethodParamsUrlAnonDeploymentidOwnerPage,
    listDeployments: AnonMethodParamsUrlAnonEnvironment,
    listDownloads: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listForOrg: AnonMethodParamsUrlAnonDirectionOrg,
    listForUser: AnonMethodParamsUrlAnonDirectionPagePerpageSort,
    listForks: AnonMethodParamsUrlAnonOwnerPagePerpageRepoSort,
    listHooks: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listInvitations: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listInvitationsForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage,
    listLanguages: AnonMethodParamsUrl,
    listPagesBuilds: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranch,
    listProtectedBranchTeamRestrictions: AnonDeprecatedMethodParamsUrlAnonBranch,
    listProtectedBranchUserRestrictions: AnonDeprecatedMethodParamsUrlAnonBranch,
    listPublic: AnonMethodParamsUrlAnonPagePerpageSince,
    listPullRequestsAssociatedWithCommit: AnonHeadersMethodParamsUrlAnonAcceptAnonCommitshaOwnerPagePerpage,
    listReleases: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listStatusesForRef: AnonMethodParamsUrlAnonOwnerPagePerpageRef,
    listTags: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listTeams: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listTeamsWithAccessToProtectedBranch: AnonDeprecatedMethodParamsUrlAnonBranch,
    listTopics: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    listUsersWithAccessToProtectedBranch: AnonDeprecatedMethodParamsUrlAnonBranch,
    merge: AnonMethodParamsUrlAnonBaseCommitmessage,
    pingHook: AnonMethodParamsUrlAnonHookidOwner,
    removeBranchProtection: AnonMethodParamsUrlAnonBranch,
    removeCollaborator: AnonMethodParamsUrlAnonOwnerRepoUsername,
    removeDeployKey: AnonMethodParamsUrlAnonKeyid,
    removeProtectedBranchAdminEnforcement: AnonMethodParamsUrlAnonBranch,
    removeProtectedBranchAppRestrictions: AnonMethodParamsUrlAnonApps,
    removeProtectedBranchPullRequestReviewEnforcement: AnonMethodParamsUrlAnonBranch,
    removeProtectedBranchRequiredSignatures: AnonHeadersMethodParamsUrlAnonAcceptAnonBranch,
    removeProtectedBranchRequiredStatusChecks: AnonMethodParamsUrlAnonBranch,
    removeProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranchContexts,
    removeProtectedBranchRestrictions: AnonMethodParamsUrlAnonBranch,
    removeProtectedBranchTeamRestrictions: AnonMethodParamsUrlAnonBranchOwner,
    removeProtectedBranchUserRestrictions: AnonMethodParamsUrlAnonBranchOwnerRepo,
    replaceProtectedBranchAppRestrictions: AnonMethodParamsUrlAnonApps,
    replaceProtectedBranchRequiredStatusChecksContexts: AnonMethodParamsUrlAnonBranchContexts,
    replaceProtectedBranchTeamRestrictions: AnonMethodParamsUrlAnonBranchOwner,
    replaceProtectedBranchUserRestrictions: AnonMethodParamsUrlAnonBranchOwnerRepo,
    replaceTopics: AnonHeadersMethodParamsUrlAnonAcceptAnonNames,
    requestPageBuild: AnonMethodParamsUrl,
    retrieveCommunityProfileMetrics: AnonMethodParamsUrl,
    testPushHook: AnonMethodParamsUrlAnonHookidOwner,
    transfer: AnonMethodParamsUrlAnonNewowner,
    update: AnonMethodParamsUrlAnonAllowmergecommitAllowrebasemergeAllowsquashmerge,
    updateBranchProtection: AnonMethodParamsUrlAnonAllowdeletions,
    updateCommitComment: AnonMethodParamsUrlAnonBodyCommentidOwner,
    updateFile: AnonDeprecatedMethodParamsUrlAnonAuthorAuthoremail,
    updateHook: AnonMethodParamsUrlAnonActiveAddevents,
    updateInformationAboutPagesSite: AnonMethodParamsUrlAnonCname,
    updateInvitation: AnonMethodParamsUrlAnonInvitationidOwnerPermissions,
    updateProtectedBranchPullRequestReviewEnforcement: AnonMethodParamsUrlAnonBranchDismissalrestrictions,
    updateProtectedBranchRequiredStatusChecks: AnonMethodParamsUrlAnonBranchContextsOwner,
    updateRelease: AnonMethodParamsUrlAnonBodyDraftName,
    updateReleaseAsset: AnonMethodParamsUrlAnonAssetidLabel,
    uploadReleaseAsset: AnonMethodParamsUrlAnonDataFile
  ): AnonAcceptInvitation = {
    val __obj = js.Dynamic.literal(acceptInvitation = acceptInvitation.asInstanceOf[js.Any], addCollaborator = addCollaborator.asInstanceOf[js.Any], addDeployKey = addDeployKey.asInstanceOf[js.Any], addProtectedBranchAdminEnforcement = addProtectedBranchAdminEnforcement.asInstanceOf[js.Any], addProtectedBranchAppRestrictions = addProtectedBranchAppRestrictions.asInstanceOf[js.Any], addProtectedBranchRequiredSignatures = addProtectedBranchRequiredSignatures.asInstanceOf[js.Any], addProtectedBranchRequiredStatusChecksContexts = addProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], addProtectedBranchTeamRestrictions = addProtectedBranchTeamRestrictions.asInstanceOf[js.Any], addProtectedBranchUserRestrictions = addProtectedBranchUserRestrictions.asInstanceOf[js.Any], checkCollaborator = checkCollaborator.asInstanceOf[js.Any], checkVulnerabilityAlerts = checkVulnerabilityAlerts.asInstanceOf[js.Any], compareCommits = compareCommits.asInstanceOf[js.Any], createCommitComment = createCommitComment.asInstanceOf[js.Any], createDeployment = createDeployment.asInstanceOf[js.Any], createDeploymentStatus = createDeploymentStatus.asInstanceOf[js.Any], createDispatchEvent = createDispatchEvent.asInstanceOf[js.Any], createFile = createFile.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createFork = createFork.asInstanceOf[js.Any], createHook = createHook.asInstanceOf[js.Any], createInOrg = createInOrg.asInstanceOf[js.Any], createOrUpdateFile = createOrUpdateFile.asInstanceOf[js.Any], createRelease = createRelease.asInstanceOf[js.Any], createStatus = createStatus.asInstanceOf[js.Any], createUsingTemplate = createUsingTemplate.asInstanceOf[js.Any], declineInvitation = declineInvitation.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCommitComment = deleteCommitComment.asInstanceOf[js.Any], deleteDownload = deleteDownload.asInstanceOf[js.Any], deleteFile = deleteFile.asInstanceOf[js.Any], deleteHook = deleteHook.asInstanceOf[js.Any], deleteInvitation = deleteInvitation.asInstanceOf[js.Any], deleteRelease = deleteRelease.asInstanceOf[js.Any], deleteReleaseAsset = deleteReleaseAsset.asInstanceOf[js.Any], disableAutomatedSecurityFixes = disableAutomatedSecurityFixes.asInstanceOf[js.Any], disablePagesSite = disablePagesSite.asInstanceOf[js.Any], disableVulnerabilityAlerts = disableVulnerabilityAlerts.asInstanceOf[js.Any], enableAutomatedSecurityFixes = enableAutomatedSecurityFixes.asInstanceOf[js.Any], enablePagesSite = enablePagesSite.asInstanceOf[js.Any], enableVulnerabilityAlerts = enableVulnerabilityAlerts.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAppsWithAccessToProtectedBranch = getAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], getArchiveLink = getArchiveLink.asInstanceOf[js.Any], getBranch = getBranch.asInstanceOf[js.Any], getBranchProtection = getBranchProtection.asInstanceOf[js.Any], getClones = getClones.asInstanceOf[js.Any], getCodeFrequencyStats = getCodeFrequencyStats.asInstanceOf[js.Any], getCollaboratorPermissionLevel = getCollaboratorPermissionLevel.asInstanceOf[js.Any], getCombinedStatusForRef = getCombinedStatusForRef.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getCommitActivityStats = getCommitActivityStats.asInstanceOf[js.Any], getCommitComment = getCommitComment.asInstanceOf[js.Any], getCommitRefSha = getCommitRefSha.asInstanceOf[js.Any], getContents = getContents.asInstanceOf[js.Any], getContributorsStats = getContributorsStats.asInstanceOf[js.Any], getDeployKey = getDeployKey.asInstanceOf[js.Any], getDeployment = getDeployment.asInstanceOf[js.Any], getDeploymentStatus = getDeploymentStatus.asInstanceOf[js.Any], getDownload = getDownload.asInstanceOf[js.Any], getHook = getHook.asInstanceOf[js.Any], getLatestPagesBuild = getLatestPagesBuild.asInstanceOf[js.Any], getLatestRelease = getLatestRelease.asInstanceOf[js.Any], getPages = getPages.asInstanceOf[js.Any], getPagesBuild = getPagesBuild.asInstanceOf[js.Any], getParticipationStats = getParticipationStats.asInstanceOf[js.Any], getProtectedBranchAdminEnforcement = getProtectedBranchAdminEnforcement.asInstanceOf[js.Any], getProtectedBranchPullRequestReviewEnforcement = getProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], getProtectedBranchRequiredSignatures = getProtectedBranchRequiredSignatures.asInstanceOf[js.Any], getProtectedBranchRequiredStatusChecks = getProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], getProtectedBranchRestrictions = getProtectedBranchRestrictions.asInstanceOf[js.Any], getPunchCardStats = getPunchCardStats.asInstanceOf[js.Any], getReadme = getReadme.asInstanceOf[js.Any], getRelease = getRelease.asInstanceOf[js.Any], getReleaseAsset = getReleaseAsset.asInstanceOf[js.Any], getReleaseByTag = getReleaseByTag.asInstanceOf[js.Any], getTeamsWithAccessToProtectedBranch = getTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], getTopPaths = getTopPaths.asInstanceOf[js.Any], getTopReferrers = getTopReferrers.asInstanceOf[js.Any], getUsersWithAccessToProtectedBranch = getUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], getViews = getViews.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAppsWithAccessToProtectedBranch = listAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], listAssetsForRelease = listAssetsForRelease.asInstanceOf[js.Any], listBranches = listBranches.asInstanceOf[js.Any], listBranchesForHeadCommit = listBranchesForHeadCommit.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listCommentsForCommit = listCommentsForCommit.asInstanceOf[js.Any], listCommitComments = listCommitComments.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listContributors = listContributors.asInstanceOf[js.Any], listDeployKeys = listDeployKeys.asInstanceOf[js.Any], listDeploymentStatuses = listDeploymentStatuses.asInstanceOf[js.Any], listDeployments = listDeployments.asInstanceOf[js.Any], listDownloads = listDownloads.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listHooks = listHooks.asInstanceOf[js.Any], listInvitations = listInvitations.asInstanceOf[js.Any], listInvitationsForAuthenticatedUser = listInvitationsForAuthenticatedUser.asInstanceOf[js.Any], listLanguages = listLanguages.asInstanceOf[js.Any], listPagesBuilds = listPagesBuilds.asInstanceOf[js.Any], listProtectedBranchRequiredStatusChecksContexts = listProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], listProtectedBranchTeamRestrictions = listProtectedBranchTeamRestrictions.asInstanceOf[js.Any], listProtectedBranchUserRestrictions = listProtectedBranchUserRestrictions.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPullRequestsAssociatedWithCommit = listPullRequestsAssociatedWithCommit.asInstanceOf[js.Any], listReleases = listReleases.asInstanceOf[js.Any], listStatusesForRef = listStatusesForRef.asInstanceOf[js.Any], listTags = listTags.asInstanceOf[js.Any], listTeams = listTeams.asInstanceOf[js.Any], listTeamsWithAccessToProtectedBranch = listTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], listTopics = listTopics.asInstanceOf[js.Any], listUsersWithAccessToProtectedBranch = listUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], pingHook = pingHook.asInstanceOf[js.Any], removeBranchProtection = removeBranchProtection.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], removeDeployKey = removeDeployKey.asInstanceOf[js.Any], removeProtectedBranchAdminEnforcement = removeProtectedBranchAdminEnforcement.asInstanceOf[js.Any], removeProtectedBranchAppRestrictions = removeProtectedBranchAppRestrictions.asInstanceOf[js.Any], removeProtectedBranchPullRequestReviewEnforcement = removeProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], removeProtectedBranchRequiredSignatures = removeProtectedBranchRequiredSignatures.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecks = removeProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecksContexts = removeProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], removeProtectedBranchRestrictions = removeProtectedBranchRestrictions.asInstanceOf[js.Any], removeProtectedBranchTeamRestrictions = removeProtectedBranchTeamRestrictions.asInstanceOf[js.Any], removeProtectedBranchUserRestrictions = removeProtectedBranchUserRestrictions.asInstanceOf[js.Any], replaceProtectedBranchAppRestrictions = replaceProtectedBranchAppRestrictions.asInstanceOf[js.Any], replaceProtectedBranchRequiredStatusChecksContexts = replaceProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], replaceProtectedBranchTeamRestrictions = replaceProtectedBranchTeamRestrictions.asInstanceOf[js.Any], replaceProtectedBranchUserRestrictions = replaceProtectedBranchUserRestrictions.asInstanceOf[js.Any], replaceTopics = replaceTopics.asInstanceOf[js.Any], requestPageBuild = requestPageBuild.asInstanceOf[js.Any], retrieveCommunityProfileMetrics = retrieveCommunityProfileMetrics.asInstanceOf[js.Any], testPushHook = testPushHook.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranchProtection = updateBranchProtection.asInstanceOf[js.Any], updateCommitComment = updateCommitComment.asInstanceOf[js.Any], updateFile = updateFile.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], updateInformationAboutPagesSite = updateInformationAboutPagesSite.asInstanceOf[js.Any], updateInvitation = updateInvitation.asInstanceOf[js.Any], updateProtectedBranchPullRequestReviewEnforcement = updateProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], updateProtectedBranchRequiredStatusChecks = updateProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], updateRelease = updateRelease.asInstanceOf[js.Any], updateReleaseAsset = updateReleaseAsset.asInstanceOf[js.Any], uploadReleaseAsset = uploadReleaseAsset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAcceptInvitation]
  }
}

