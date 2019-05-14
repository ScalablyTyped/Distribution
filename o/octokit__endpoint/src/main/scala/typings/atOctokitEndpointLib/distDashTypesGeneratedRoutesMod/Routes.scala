package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Routes extends js.Object {
  var `DELETE /app/installations/:installation_id`: js.Tuple2[AppsDeleteInstallation_Options, AppsDeleteInstallation_RequestOptions]
  var `DELETE /applications/:client_id/grants/:access_token`: js.Tuple2[
    OauthAuthorizationsRevokeGrantForApplication_Options, 
    OauthAuthorizationsRevokeGrantForApplication_RequestOptions
  ]
  var `DELETE /applications/:client_id/tokens/:access_token`: js.Tuple2[
    OauthAuthorizationsRevokeAuthorizationForApplication_Options, 
    OauthAuthorizationsRevokeAuthorizationForApplication_RequestOptions
  ]
  var `DELETE /applications/grants/:grant_id`: js.Tuple2[
    OauthAuthorizationsDeleteGrant_Options, 
    OauthAuthorizationsDeleteGrant_RequestOptions
  ]
  var `DELETE /authorizations/:authorization_id`: js.Tuple2[
    OauthAuthorizationsDeleteAuthorization_Options, 
    OauthAuthorizationsDeleteAuthorization_RequestOptions
  ]
  var `DELETE /gists/:gist_id`: js.Tuple2[GistsDelete_Options, GistsDelete_RequestOptions]
  var `DELETE /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsDeleteComment_Options, GistsDeleteComment_RequestOptions]
  var `DELETE /gists/:gist_id/star`: js.Tuple2[GistsUnstar_Options, GistsUnstar_RequestOptions]
  var `DELETE /notifications/threads/:thread_id/subscription`: js.Tuple2[
    ActivityDeleteThreadSubscription_Options, 
    ActivityDeleteThreadSubscription_RequestOptions
  ]
  var `DELETE /orgs/:org/blocks/:username`: js.Tuple2[OrgsUnblockUser_Options, OrgsUnblockUser_RequestOptions]
  var `DELETE /orgs/:org/credential-authorizations/:credential_id`: js.Tuple2[
    OrgsRemoveCredentialAuthorization_Options, 
    OrgsRemoveCredentialAuthorization_RequestOptions
  ]
  var `DELETE /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsDeleteHook_Options, OrgsDeleteHook_RequestOptions]
  var `DELETE /orgs/:org/interaction-limits`: js.Tuple2[
    InteractionsRemoveRestrictionsForOrg_Options, 
    InteractionsRemoveRestrictionsForOrg_RequestOptions
  ]
  var `DELETE /orgs/:org/members/:username`: js.Tuple2[OrgsRemoveMember_Options, OrgsRemoveMember_RequestOptions]
  var `DELETE /orgs/:org/memberships/:username`: js.Tuple2[OrgsRemoveMembership_Options, OrgsRemoveMembership_RequestOptions]
  var `DELETE /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[
    MigrationsDeleteArchiveForOrg_Options, 
    MigrationsDeleteArchiveForOrg_RequestOptions
  ]
  var `DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[MigrationsUnlockRepoForOrg_Options, MigrationsUnlockRepoForOrg_RequestOptions]
  var `DELETE /orgs/:org/outside_collaborators/:username`: js.Tuple2[
    OrgsRemoveOutsideCollaborator_Options, 
    OrgsRemoveOutsideCollaborator_RequestOptions
  ]
  var `DELETE /orgs/:org/public_members/:username`: js.Tuple2[OrgsConcealMembership_Options, OrgsConcealMembership_RequestOptions]
  var `DELETE /projects/:project_id`: js.Tuple2[ProjectsDelete_Options, ProjectsDelete_RequestOptions]
  var `DELETE /projects/:project_id/collaborators/:username`: js.Tuple2[ProjectsRemoveCollaborator_Options, ProjectsRemoveCollaborator_RequestOptions]
  var `DELETE /projects/columns/:column_id`: js.Tuple2[ProjectsDeleteColumn_Options, ProjectsDeleteColumn_RequestOptions]
  var `DELETE /projects/columns/cards/:card_id`: js.Tuple2[ProjectsDeleteCard_Options, ProjectsDeleteCard_RequestOptions]
  var `DELETE /reactions/:reaction_id`: js.Tuple2[ReactionsDelete_Options, ReactionsDelete_RequestOptions]
  var `DELETE /repos/:owner/:repo`: js.Tuple2[ReposDelete_Options, ReposDelete_RequestOptions]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposRemoveBranchProtection_Options, ReposRemoveBranchProtection_RequestOptions]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
    ReposRemoveProtectedBranchAdminEnforcement_Options, 
    ReposRemoveProtectedBranchAdminEnforcement_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
    ReposRemoveProtectedBranchPullRequestReviewEnforcement_Options, 
    ReposRemoveProtectedBranchPullRequestReviewEnforcement_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
    ReposRemoveProtectedBranchRequiredSignatures_Options, 
    ReposRemoveProtectedBranchRequiredSignatures_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
    ReposRemoveProtectedBranchRequiredStatusChecks_Options, 
    ReposRemoveProtectedBranchRequiredStatusChecks_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposRemoveProtectedBranchRequiredStatusChecksContexts_Options, 
    ReposRemoveProtectedBranchRequiredStatusChecksContexts_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
    ReposRemoveProtectedBranchRestrictions_Options, 
    ReposRemoveProtectedBranchRestrictions_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposRemoveProtectedBranchTeamRestrictions_Options, 
    ReposRemoveProtectedBranchTeamRestrictions_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposRemoveProtectedBranchUserRestrictions_Options, 
    ReposRemoveProtectedBranchUserRestrictions_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposRemoveCollaborator_Options, ReposRemoveCollaborator_RequestOptions]
  var `DELETE /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposDeleteCommitComment_Options, ReposDeleteCommitComment_RequestOptions]
  var `DELETE /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposDeleteFile_Options, ReposDeleteFile_RequestOptions]
  var `DELETE /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposDeleteDownload_Options, ReposDeleteDownload_RequestOptions]
  var `DELETE /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitDeleteRef_Options, GitDeleteRef_RequestOptions]
  var `DELETE /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposDeleteHook_Options, ReposDeleteHook_RequestOptions]
  var `DELETE /repos/:owner/:repo/import`: js.Tuple2[MigrationsCancelImport_Options, MigrationsCancelImport_RequestOptions]
  var `DELETE /repos/:owner/:repo/interaction-limits`: js.Tuple2[
    InteractionsRemoveRestrictionsForRepo_Options, 
    InteractionsRemoveRestrictionsForRepo_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/invitations/:invitation_id`: js.Tuple2[ReposDeleteInvitation_Options, ReposDeleteInvitation_RequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/assignees`: js.Tuple2[IssuesRemoveAssignees_Options, IssuesRemoveAssignees_RequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesRemoveLabels_Options, IssuesRemoveLabels_RequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name`: js.Tuple2[IssuesRemoveLabel_Options, IssuesRemoveLabel_RequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/lock`: js.Tuple2[IssuesUnlock_Options, IssuesUnlock_RequestOptions]
  var `DELETE /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesDeleteComment_Options, IssuesDeleteComment_RequestOptions]
  var `DELETE /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposRemoveDeployKey_Options, ReposRemoveDeployKey_RequestOptions]
  var `DELETE /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesDeleteLabel_Options, IssuesDeleteLabel_RequestOptions]
  var `DELETE /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesDeleteMilestone_Options, IssuesDeleteMilestone_RequestOptions]
  var `DELETE /repos/:owner/:repo/pages`: js.Tuple2[ReposDisablePagesSite_Options, ReposDisablePagesSite_RequestOptions]
  var `DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsDeleteReviewRequest_Options, PullsDeleteReviewRequest_RequestOptions]
  var `DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsDeletePendingReview_Options, PullsDeletePendingReview_RequestOptions]
  var `DELETE /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsDeleteComment_Options, PullsDeleteComment_RequestOptions]
  var `DELETE /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposDeleteRelease_Options, ReposDeleteRelease_RequestOptions]
  var `DELETE /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposDeleteReleaseAsset_Options, ReposDeleteReleaseAsset_RequestOptions]
  var `DELETE /repos/:owner/:repo/subscription`: js.Tuple2[
    ActivityDeleteRepoSubscription_Options, 
    ActivityDeleteRepoSubscription_RequestOptions
  ]
  var `DELETE /repos/:owner/:repo/vulnerability-alerts`: js.Tuple2[
    ReposDisableVulnerabilityAlerts_Options, 
    ReposDisableVulnerabilityAlerts_RequestOptions
  ]
  var `DELETE /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[ScimRemoveUserFromOrg_Options, ScimRemoveUserFromOrg_RequestOptions]
  var `DELETE /teams/:team_id`: js.Tuple2[TeamsDelete_Options, TeamsDelete_RequestOptions]
  var `DELETE /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsDeleteDiscussion_Options, TeamsDeleteDiscussion_RequestOptions]
  var `DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsDeleteDiscussionComment_Options, TeamsDeleteDiscussionComment_RequestOptions]
  var `DELETE /teams/:team_id/members/:username`: js.Tuple2[TeamsRemoveMember_Options, TeamsRemoveMember_RequestOptions]
  var `DELETE /teams/:team_id/memberships/:username`: js.Tuple2[TeamsRemoveMembership_Options, TeamsRemoveMembership_RequestOptions]
  var `DELETE /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsRemoveProject_Options, TeamsRemoveProject_RequestOptions]
  var `DELETE /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsRemoveRepo_Options, TeamsRemoveRepo_RequestOptions]
  var `DELETE /user/blocks/:username`: js.Tuple2[UsersUnblock_Options, UsersUnblock_RequestOptions]
  var `DELETE /user/emails`: js.Tuple2[UsersDeleteEmails_Options, UsersDeleteEmails_RequestOptions]
  var `DELETE /user/following/:username`: js.Tuple2[UsersUnfollow_Options, UsersUnfollow_RequestOptions]
  var `DELETE /user/gpg_keys/:gpg_key_id`: js.Tuple2[UsersDeleteGpgKey_Options, UsersDeleteGpgKey_RequestOptions]
  var `DELETE /user/installations/:installation_id/repositories/:repository_id`: js.Tuple2[
    AppsRemoveRepoFromInstallation_Options, 
    AppsRemoveRepoFromInstallation_RequestOptions
  ]
  var `DELETE /user/keys/:key_id`: js.Tuple2[UsersDeletePublicKey_Options, UsersDeletePublicKey_RequestOptions]
  var `DELETE /user/migrations/:migration_id/archive`: js.Tuple2[
    MigrationsDeleteArchiveForAuthenticatedUser_Options, 
    MigrationsDeleteArchiveForAuthenticatedUser_RequestOptions
  ]
  var `DELETE /user/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[
    MigrationsUnlockRepoForAuthenticatedUser_Options, 
    MigrationsUnlockRepoForAuthenticatedUser_RequestOptions
  ]
  var `DELETE /user/repository_invitations/:invitation_id`: js.Tuple2[ReposDeclineInvitation_Options, ReposDeclineInvitation_RequestOptions]
  var `DELETE /user/starred/:owner/:repo`: js.Tuple2[ActivityUnstarRepo_Options, ActivityUnstarRepo_RequestOptions]
  var `DELETE /user/subscriptions/:owner/:repo`: js.Tuple2[
    ActivityStopWatchingRepoLegacy_Options, 
    ActivityStopWatchingRepoLegacy_RequestOptions
  ]
  var `GET /app`: js.Tuple2[AppsGetAuthenticated_Options, AppsGetAuthenticated_RequestOptions]
  var `GET /app/installations`: js.Tuple2[AppsListInstallations_Options, AppsListInstallations_RequestOptions]
  var `GET /app/installations/:installation_id`: js.Tuple2[AppsGetInstallation_Options, AppsGetInstallation_RequestOptions]
  var `GET /applications/:client_id/tokens/:access_token`: js.Tuple2[
    OauthAuthorizationsCheckAuthorization_Options, 
    OauthAuthorizationsCheckAuthorization_RequestOptions
  ]
  var `GET /applications/grants`: js.Tuple2[
    OauthAuthorizationsListGrants_Options, 
    OauthAuthorizationsListGrants_RequestOptions
  ]
  var `GET /applications/grants/:grant_id`: js.Tuple2[OauthAuthorizationsGetGrant_Options, OauthAuthorizationsGetGrant_RequestOptions]
  var `GET /apps/:app_slug`: js.Tuple2[AppsGetBySlug_Options, AppsGetBySlug_RequestOptions]
  var `GET /authorizations`: js.Tuple2[
    OauthAuthorizationsListAuthorizations_Options, 
    OauthAuthorizationsListAuthorizations_RequestOptions
  ]
  var `GET /authorizations/:authorization_id`: js.Tuple2[
    OauthAuthorizationsGetAuthorization_Options, 
    OauthAuthorizationsGetAuthorization_RequestOptions
  ]
  var `GET /codes_of_conduct`: js.Tuple2[
    CodesOfConductListConductCodes_Options, 
    CodesOfConductListConductCodes_RequestOptions
  ]
  var `GET /codes_of_conduct/:key`: js.Tuple2[CodesOfConductGetConductCode_Options, CodesOfConductGetConductCode_RequestOptions]
  var `GET /emojis`: js.Tuple2[EmojisGet_Options, EmojisGet_RequestOptions]
  var `GET /events`: js.Tuple2[ActivityListPublicEvents_Options, ActivityListPublicEvents_RequestOptions]
  var `GET /feeds`: js.Tuple2[ActivityListFeeds_Options, ActivityListFeeds_RequestOptions]
  var `GET /gists`: js.Tuple2[GistsList_Options, GistsList_RequestOptions]
  var `GET /gists/:gist_id`: js.Tuple2[GistsGet_Options, GistsGet_RequestOptions]
  var `GET /gists/:gist_id/:sha`: js.Tuple2[GistsGetRevision_Options, GistsGetRevision_RequestOptions]
  var `GET /gists/:gist_id/comments`: js.Tuple2[GistsListComments_Options, GistsListComments_RequestOptions]
  var `GET /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsGetComment_Options, GistsGetComment_RequestOptions]
  var `GET /gists/:gist_id/commits`: js.Tuple2[GistsListCommits_Options, GistsListCommits_RequestOptions]
  var `GET /gists/:gist_id/forks`: js.Tuple2[GistsListForks_Options, GistsListForks_RequestOptions]
  var `GET /gists/:gist_id/star`: js.Tuple2[GistsCheckIsStarred_Options, GistsCheckIsStarred_RequestOptions]
  var `GET /gists/public`: js.Tuple2[GistsListPublic_Options, GistsListPublic_RequestOptions]
  var `GET /gists/starred`: js.Tuple2[GistsListStarred_Options, GistsListStarred_RequestOptions]
  var `GET /gitignore/templates`: js.Tuple2[GitignoreListTemplates_Options, GitignoreListTemplates_RequestOptions]
  var `GET /gitignore/templates/:name`: js.Tuple2[GitignoreGetTemplate_Options, GitignoreGetTemplate_RequestOptions]
  var `GET /installation/repositories`: js.Tuple2[AppsListRepos_Options, AppsListRepos_RequestOptions]
  var `GET /issues`: js.Tuple2[IssuesList_Options, IssuesList_RequestOptions]
  var `GET /legacy/issues/search/:owner/:repository/:state/:keyword`: js.Tuple2[SearchIssuesLegacy_Options, SearchIssuesLegacy_RequestOptions]
  var `GET /legacy/repos/search/:keyword`: js.Tuple2[SearchReposLegacy_Options, SearchReposLegacy_RequestOptions]
  var `GET /legacy/user/email/:email`: js.Tuple2[SearchEmailLegacy_Options, SearchEmailLegacy_RequestOptions]
  var `GET /legacy/user/search/:keyword`: js.Tuple2[SearchUsersLegacy_Options, SearchUsersLegacy_RequestOptions]
  var `GET /licenses`: js.Tuple2[
    LicensesListCommonlyUsed_Options | LicensesList_Options, 
    LicensesListCommonlyUsed_RequestOptions | LicensesList_RequestOptions
  ]
  var `GET /licenses/:license`: js.Tuple2[LicensesGet_Options, LicensesGet_RequestOptions]
  var `GET /marketplace_listing/accounts/:account_id`: js.Tuple2[
    AppsCheckAccountIsAssociatedWithAny_Options, 
    AppsCheckAccountIsAssociatedWithAny_RequestOptions
  ]
  var `GET /marketplace_listing/plans`: js.Tuple2[AppsListPlans_Options, AppsListPlans_RequestOptions]
  var `GET /marketplace_listing/plans/:plan_id/accounts`: js.Tuple2[
    AppsListAccountsUserOrOrgOnPlan_Options, 
    AppsListAccountsUserOrOrgOnPlan_RequestOptions
  ]
  var `GET /marketplace_listing/stubbed/accounts/:account_id`: js.Tuple2[
    AppsCheckAccountIsAssociatedWithAnyStubbed_Options, 
    AppsCheckAccountIsAssociatedWithAnyStubbed_RequestOptions
  ]
  var `GET /marketplace_listing/stubbed/plans`: js.Tuple2[AppsListPlansStubbed_Options, AppsListPlansStubbed_RequestOptions]
  var `GET /marketplace_listing/stubbed/plans/:plan_id/accounts`: js.Tuple2[
    AppsListAccountsUserOrOrgOnPlanStubbed_Options, 
    AppsListAccountsUserOrOrgOnPlanStubbed_RequestOptions
  ]
  var `GET /meta`: js.Tuple2[MetaGet_Options, MetaGet_RequestOptions]
  var `GET /networks/:owner/:repo/events`: js.Tuple2[
    ActivityListPublicEventsForRepoNetwork_Options, 
    ActivityListPublicEventsForRepoNetwork_RequestOptions
  ]
  var `GET /notifications`: js.Tuple2[ActivityListNotifications_Options, ActivityListNotifications_RequestOptions]
  var `GET /notifications/threads/:thread_id`: js.Tuple2[ActivityGetThread_Options, ActivityGetThread_RequestOptions]
  var `GET /notifications/threads/:thread_id/subscription`: js.Tuple2[
    ActivityGetThreadSubscription_Options, 
    ActivityGetThreadSubscription_RequestOptions
  ]
  var `GET /organizations`: js.Tuple2[OrgsList_Options, OrgsList_RequestOptions]
  var `GET /orgs/:org`: js.Tuple2[OrgsGet_Options, OrgsGet_RequestOptions]
  var `GET /orgs/:org/blocks`: js.Tuple2[OrgsListBlockedUsers_Options, OrgsListBlockedUsers_RequestOptions]
  var `GET /orgs/:org/blocks/:username`: js.Tuple2[OrgsCheckBlockedUser_Options, OrgsCheckBlockedUser_RequestOptions]
  var `GET /orgs/:org/credential-authorizations`: js.Tuple2[
    OrgsListCredentialAuthorizations_Options, 
    OrgsListCredentialAuthorizations_RequestOptions
  ]
  var `GET /orgs/:org/events`: js.Tuple2[
    ActivityListPublicEventsForOrg_Options, 
    ActivityListPublicEventsForOrg_RequestOptions
  ]
  var `GET /orgs/:org/hooks`: js.Tuple2[OrgsListHooks_Options, OrgsListHooks_RequestOptions]
  var `GET /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsGetHook_Options, OrgsGetHook_RequestOptions]
  var `GET /orgs/:org/installation`: js.Tuple2[
    AppsGetOrgInstallation_Options | AppsFindOrgInstallation_Options, 
    AppsGetOrgInstallation_RequestOptions | AppsFindOrgInstallation_RequestOptions
  ]
  var `GET /orgs/:org/interaction-limits`: js.Tuple2[
    InteractionsGetRestrictionsForOrg_Options, 
    InteractionsGetRestrictionsForOrg_RequestOptions
  ]
  var `GET /orgs/:org/invitations`: js.Tuple2[OrgsListPendingInvitations_Options, OrgsListPendingInvitations_RequestOptions]
  var `GET /orgs/:org/invitations/:invitation_id/teams`: js.Tuple2[OrgsListInvitationTeams_Options, OrgsListInvitationTeams_RequestOptions]
  var `GET /orgs/:org/issues`: js.Tuple2[IssuesListForOrg_Options, IssuesListForOrg_RequestOptions]
  var `GET /orgs/:org/members`: js.Tuple2[OrgsListMembers_Options, OrgsListMembers_RequestOptions]
  var `GET /orgs/:org/members/:username`: js.Tuple2[OrgsCheckMembership_Options, OrgsCheckMembership_RequestOptions]
  var `GET /orgs/:org/memberships/:username`: js.Tuple2[OrgsGetMembership_Options, OrgsGetMembership_RequestOptions]
  var `GET /orgs/:org/migrations`: js.Tuple2[MigrationsListForOrg_Options, MigrationsListForOrg_RequestOptions]
  var `GET /orgs/:org/migrations/:migration_id`: js.Tuple2[MigrationsGetStatusForOrg_Options, MigrationsGetStatusForOrg_RequestOptions]
  var `GET /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[MigrationsGetArchiveForOrg_Options, MigrationsGetArchiveForOrg_RequestOptions]
  var `GET /orgs/:org/outside_collaborators`: js.Tuple2[OrgsListOutsideCollaborators_Options, OrgsListOutsideCollaborators_RequestOptions]
  var `GET /orgs/:org/projects`: js.Tuple2[ProjectsListForOrg_Options, ProjectsListForOrg_RequestOptions]
  var `GET /orgs/:org/public_members`: js.Tuple2[OrgsListPublicMembers_Options, OrgsListPublicMembers_RequestOptions]
  var `GET /orgs/:org/public_members/:username`: js.Tuple2[OrgsCheckPublicMembership_Options, OrgsCheckPublicMembership_RequestOptions]
  var `GET /orgs/:org/repos`: js.Tuple2[ReposListForOrg_Options, ReposListForOrg_RequestOptions]
  var `GET /orgs/:org/teams`: js.Tuple2[TeamsList_Options, TeamsList_RequestOptions]
  var `GET /orgs/:org/teams/:team_slug`: js.Tuple2[TeamsGetByName_Options, TeamsGetByName_RequestOptions]
  var `GET /projects/:project_id`: js.Tuple2[ProjectsGet_Options, ProjectsGet_RequestOptions]
  var `GET /projects/:project_id/collaborators`: js.Tuple2[ProjectsListCollaborators_Options, ProjectsListCollaborators_RequestOptions]
  var `GET /projects/:project_id/collaborators/:username/permission`: js.Tuple2[
    ProjectsReviewUserPermissionLevel_Options, 
    ProjectsReviewUserPermissionLevel_RequestOptions
  ]
  var `GET /projects/:project_id/columns`: js.Tuple2[ProjectsListColumns_Options, ProjectsListColumns_RequestOptions]
  var `GET /projects/columns/:column_id`: js.Tuple2[ProjectsGetColumn_Options, ProjectsGetColumn_RequestOptions]
  var `GET /projects/columns/:column_id/cards`: js.Tuple2[ProjectsListCards_Options, ProjectsListCards_RequestOptions]
  var `GET /projects/columns/cards/:card_id`: js.Tuple2[ProjectsGetCard_Options, ProjectsGetCard_RequestOptions]
  var `GET /rate_limit`: js.Tuple2[RateLimitGet_Options, RateLimitGet_RequestOptions]
  var `GET /repos/:owner/:repo`: js.Tuple2[ReposGet_Options, ReposGet_RequestOptions]
  var `GET /repos/:owner/:repo/:archive_format/:ref`: js.Tuple2[ReposGetArchiveLink_Options, ReposGetArchiveLink_RequestOptions]
  var `GET /repos/:owner/:repo/assignees`: js.Tuple2[IssuesListAssignees_Options, IssuesListAssignees_RequestOptions]
  var `GET /repos/:owner/:repo/assignees/:assignee`: js.Tuple2[IssuesCheckAssignee_Options, IssuesCheckAssignee_RequestOptions]
  var `GET /repos/:owner/:repo/branches`: js.Tuple2[ReposListBranches_Options, ReposListBranches_RequestOptions]
  var `GET /repos/:owner/:repo/branches/:branch`: js.Tuple2[ReposGetBranch_Options, ReposGetBranch_RequestOptions]
  var `GET /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposGetBranchProtection_Options, ReposGetBranchProtection_RequestOptions]
  var `GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
    ReposGetProtectedBranchAdminEnforcement_Options, 
    ReposGetProtectedBranchAdminEnforcement_RequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
    ReposGetProtectedBranchPullRequestReviewEnforcement_Options, 
    ReposGetProtectedBranchPullRequestReviewEnforcement_RequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
    ReposGetProtectedBranchRequiredSignatures_Options, 
    ReposGetProtectedBranchRequiredSignatures_RequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
    ReposGetProtectedBranchRequiredStatusChecks_Options, 
    ReposGetProtectedBranchRequiredStatusChecks_RequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposListProtectedBranchRequiredStatusChecksContexts_Options, 
    ReposListProtectedBranchRequiredStatusChecksContexts_RequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
    ReposGetProtectedBranchRestrictions_Options, 
    ReposGetProtectedBranchRestrictions_RequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposListProtectedBranchTeamRestrictions_Options, 
    ReposListProtectedBranchTeamRestrictions_RequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposListProtectedBranchUserRestrictions_Options, 
    ReposListProtectedBranchUserRestrictions_RequestOptions
  ]
  var `GET /repos/:owner/:repo/check-runs/:check_run_id`: js.Tuple2[ChecksGet_Options, ChecksGet_RequestOptions]
  var `GET /repos/:owner/:repo/check-runs/:check_run_id/annotations`: js.Tuple2[ChecksListAnnotations_Options, ChecksListAnnotations_RequestOptions]
  var `GET /repos/:owner/:repo/check-suites/:check_suite_id`: js.Tuple2[ChecksGetSuite_Options, ChecksGetSuite_RequestOptions]
  var `GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs`: js.Tuple2[ChecksListForSuite_Options, ChecksListForSuite_RequestOptions]
  var `GET /repos/:owner/:repo/collaborators`: js.Tuple2[ReposListCollaborators_Options, ReposListCollaborators_RequestOptions]
  var `GET /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposCheckCollaborator_Options, ReposCheckCollaborator_RequestOptions]
  var `GET /repos/:owner/:repo/collaborators/:username/permission`: js.Tuple2[
    ReposGetCollaboratorPermissionLevel_Options, 
    ReposGetCollaboratorPermissionLevel_RequestOptions
  ]
  var `GET /repos/:owner/:repo/comments`: js.Tuple2[ReposListCommitComments_Options, ReposListCommitComments_RequestOptions]
  var `GET /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposGetCommitComment_Options, ReposGetCommitComment_RequestOptions]
  var `GET /repos/:owner/:repo/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsListForCommitComment_Options, 
    ReactionsListForCommitComment_RequestOptions
  ]
  var `GET /repos/:owner/:repo/commits`: js.Tuple2[ReposListCommits_Options, ReposListCommits_RequestOptions]
  var `GET /repos/:owner/:repo/commits/:commit_sha`: js.Tuple2[ReposGetCommit_Options, ReposGetCommit_RequestOptions]
  var `GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`: js.Tuple2[
    ReposListBranchesForHeadCommit_Options, 
    ReposListBranchesForHeadCommit_RequestOptions
  ]
  var `GET /repos/:owner/:repo/commits/:commit_sha/pulls`: js.Tuple2[
    ReposListPullRequestsAssociatedWithCommit_Options, 
    ReposListPullRequestsAssociatedWithCommit_RequestOptions
  ]
  var `GET /repos/:owner/:repo/commits/:ref`: js.Tuple2[ReposGetCommitRefSha_Options, ReposGetCommitRefSha_RequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/check-runs`: js.Tuple2[ChecksListForRef_Options, ChecksListForRef_RequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/check-suites`: js.Tuple2[ChecksListSuitesForRef_Options, ChecksListSuitesForRef_RequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/comments`: js.Tuple2[ReposListCommentsForCommit_Options, ReposListCommentsForCommit_RequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/status`: js.Tuple2[ReposGetCombinedStatusForRef_Options, ReposGetCombinedStatusForRef_RequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/statuses`: js.Tuple2[ReposListStatusesForRef_Options, ReposListStatusesForRef_RequestOptions]
  var `GET /repos/:owner/:repo/community/code_of_conduct`: js.Tuple2[CodesOfConductGetForRepo_Options, CodesOfConductGetForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/community/profile`: js.Tuple2[
    ReposRetrieveCommunityProfileMetrics_Options, 
    ReposRetrieveCommunityProfileMetrics_RequestOptions
  ]
  var `GET /repos/:owner/:repo/compare/:base...:head`: js.Tuple2[ReposCompareCommits_Options, ReposCompareCommits_RequestOptions]
  var `GET /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposGetContents_Options, ReposGetContents_RequestOptions]
  var `GET /repos/:owner/:repo/contributors`: js.Tuple2[ReposListContributors_Options, ReposListContributors_RequestOptions]
  var `GET /repos/:owner/:repo/deployments`: js.Tuple2[ReposListDeployments_Options, ReposListDeployments_RequestOptions]
  var `GET /repos/:owner/:repo/deployments/:deployment_id`: js.Tuple2[ReposGetDeployment_Options, ReposGetDeployment_RequestOptions]
  var `GET /repos/:owner/:repo/deployments/:deployment_id/statuses`: js.Tuple2[ReposListDeploymentStatuses_Options, ReposListDeploymentStatuses_RequestOptions]
  var `GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id`: js.Tuple2[ReposGetDeploymentStatus_Options, ReposGetDeploymentStatus_RequestOptions]
  var `GET /repos/:owner/:repo/downloads`: js.Tuple2[ReposListDownloads_Options, ReposListDownloads_RequestOptions]
  var `GET /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposGetDownload_Options, ReposGetDownload_RequestOptions]
  var `GET /repos/:owner/:repo/events`: js.Tuple2[ActivityListRepoEvents_Options, ActivityListRepoEvents_RequestOptions]
  var `GET /repos/:owner/:repo/forks`: js.Tuple2[ReposListForks_Options, ReposListForks_RequestOptions]
  var `GET /repos/:owner/:repo/git/blobs/:file_sha`: js.Tuple2[GitGetBlob_Options, GitGetBlob_RequestOptions]
  var `GET /repos/:owner/:repo/git/commits/:commit_sha`: js.Tuple2[GitGetCommit_Options, GitGetCommit_RequestOptions]
  var `GET /repos/:owner/:repo/git/refs/:namespace`: js.Tuple2[GitListRefs_Options, GitListRefs_RequestOptions]
  var `GET /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitGetRef_Options, GitGetRef_RequestOptions]
  var `GET /repos/:owner/:repo/git/tags/:tag_sha`: js.Tuple2[GitGetTag_Options, GitGetTag_RequestOptions]
  var `GET /repos/:owner/:repo/git/trees/:tree_sha`: js.Tuple2[GitGetTree_Options, GitGetTree_RequestOptions]
  var `GET /repos/:owner/:repo/hooks`: js.Tuple2[ReposListHooks_Options, ReposListHooks_RequestOptions]
  var `GET /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposGetHook_Options, ReposGetHook_RequestOptions]
  var `GET /repos/:owner/:repo/import`: js.Tuple2[MigrationsGetImportProgress_Options, MigrationsGetImportProgress_RequestOptions]
  var `GET /repos/:owner/:repo/import/authors`: js.Tuple2[MigrationsGetCommitAuthors_Options, MigrationsGetCommitAuthors_RequestOptions]
  var `GET /repos/:owner/:repo/import/large_files`: js.Tuple2[MigrationsGetLargeFiles_Options, MigrationsGetLargeFiles_RequestOptions]
  var `GET /repos/:owner/:repo/installation`: js.Tuple2[
    AppsGetRepoInstallation_Options | AppsFindRepoInstallation_Options, 
    AppsGetRepoInstallation_RequestOptions | AppsFindRepoInstallation_RequestOptions
  ]
  var `GET /repos/:owner/:repo/interaction-limits`: js.Tuple2[
    InteractionsGetRestrictionsForRepo_Options, 
    InteractionsGetRestrictionsForRepo_RequestOptions
  ]
  var `GET /repos/:owner/:repo/invitations`: js.Tuple2[ReposListInvitations_Options, ReposListInvitations_RequestOptions]
  var `GET /repos/:owner/:repo/issues`: js.Tuple2[IssuesListForRepo_Options, IssuesListForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number`: js.Tuple2[IssuesGet_Options, IssuesGet_RequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/comments`: js.Tuple2[IssuesListComments_Options, IssuesListComments_RequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/events`: js.Tuple2[IssuesListEvents_Options, IssuesListEvents_RequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesListLabelsOnIssue_Options, IssuesListLabelsOnIssue_RequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/reactions`: js.Tuple2[ReactionsListForIssue_Options, ReactionsListForIssue_RequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/timeline`: js.Tuple2[IssuesListEventsForTimeline_Options, IssuesListEventsForTimeline_RequestOptions]
  var `GET /repos/:owner/:repo/issues/comments`: js.Tuple2[IssuesListCommentsForRepo_Options, IssuesListCommentsForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesGetComment_Options, IssuesGetComment_RequestOptions]
  var `GET /repos/:owner/:repo/issues/comments/:comment_id/reactions`: js.Tuple2[ReactionsListForIssueComment_Options, ReactionsListForIssueComment_RequestOptions]
  var `GET /repos/:owner/:repo/issues/events`: js.Tuple2[IssuesListEventsForRepo_Options, IssuesListEventsForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/issues/events/:event_id`: js.Tuple2[IssuesGetEvent_Options, IssuesGetEvent_RequestOptions]
  var `GET /repos/:owner/:repo/keys`: js.Tuple2[ReposListDeployKeys_Options, ReposListDeployKeys_RequestOptions]
  var `GET /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposGetDeployKey_Options, ReposGetDeployKey_RequestOptions]
  var `GET /repos/:owner/:repo/labels`: js.Tuple2[IssuesListLabelsForRepo_Options, IssuesListLabelsForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesGetLabel_Options, IssuesGetLabel_RequestOptions]
  var `GET /repos/:owner/:repo/languages`: js.Tuple2[ReposListLanguages_Options, ReposListLanguages_RequestOptions]
  var `GET /repos/:owner/:repo/license`: js.Tuple2[LicensesGetForRepo_Options, LicensesGetForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/milestones`: js.Tuple2[IssuesListMilestonesForRepo_Options, IssuesListMilestonesForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesGetMilestone_Options, IssuesGetMilestone_RequestOptions]
  var `GET /repos/:owner/:repo/milestones/:milestone_number/labels`: js.Tuple2[IssuesListLabelsForMilestone_Options, IssuesListLabelsForMilestone_RequestOptions]
  var `GET /repos/:owner/:repo/notifications`: js.Tuple2[
    ActivityListNotificationsForRepo_Options, 
    ActivityListNotificationsForRepo_RequestOptions
  ]
  var `GET /repos/:owner/:repo/pages`: js.Tuple2[ReposGetPages_Options, ReposGetPages_RequestOptions]
  var `GET /repos/:owner/:repo/pages/builds`: js.Tuple2[ReposListPagesBuilds_Options, ReposListPagesBuilds_RequestOptions]
  var `GET /repos/:owner/:repo/pages/builds/:build_id`: js.Tuple2[ReposGetPagesBuild_Options, ReposGetPagesBuild_RequestOptions]
  var `GET /repos/:owner/:repo/pages/builds/latest`: js.Tuple2[ReposGetLatestPagesBuild_Options, ReposGetLatestPagesBuild_RequestOptions]
  var `GET /repos/:owner/:repo/projects`: js.Tuple2[ProjectsListForRepo_Options, ProjectsListForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/pulls`: js.Tuple2[PullsList_Options, PullsList_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number`: js.Tuple2[PullsGet_Options, PullsGet_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/comments`: js.Tuple2[PullsListComments_Options, PullsListComments_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/commits`: js.Tuple2[PullsListCommits_Options, PullsListCommits_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/files`: js.Tuple2[PullsListFiles_Options, PullsListFiles_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/merge`: js.Tuple2[PullsCheckIfMerged_Options, PullsCheckIfMerged_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsListReviewRequests_Options, PullsListReviewRequests_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/reviews`: js.Tuple2[PullsListReviews_Options, PullsListReviews_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsGetReview_Options, PullsGetReview_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments`: js.Tuple2[PullsGetCommentsForReview_Options, PullsGetCommentsForReview_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/comments`: js.Tuple2[PullsListCommentsForRepo_Options, PullsListCommentsForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsGetComment_Options, PullsGetComment_RequestOptions]
  var `GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsListForPullRequestReviewComment_Options, 
    ReactionsListForPullRequestReviewComment_RequestOptions
  ]
  var `GET /repos/:owner/:repo/readme`: js.Tuple2[ReposGetReadme_Options, ReposGetReadme_RequestOptions]
  var `GET /repos/:owner/:repo/releases`: js.Tuple2[ReposListReleases_Options, ReposListReleases_RequestOptions]
  var `GET /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposGetRelease_Options, ReposGetRelease_RequestOptions]
  var `GET /repos/:owner/:repo/releases/:release_id/assets`: js.Tuple2[ReposListAssetsForRelease_Options, ReposListAssetsForRelease_RequestOptions]
  var `GET /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposGetReleaseAsset_Options, ReposGetReleaseAsset_RequestOptions]
  var `GET /repos/:owner/:repo/releases/latest`: js.Tuple2[ReposGetLatestRelease_Options, ReposGetLatestRelease_RequestOptions]
  var `GET /repos/:owner/:repo/releases/tags/:tag`: js.Tuple2[ReposGetReleaseByTag_Options, ReposGetReleaseByTag_RequestOptions]
  var `GET /repos/:owner/:repo/stargazers`: js.Tuple2[
    ActivityListStargazersForRepo_Options, 
    ActivityListStargazersForRepo_RequestOptions
  ]
  var `GET /repos/:owner/:repo/stats/code_frequency`: js.Tuple2[ReposGetCodeFrequencyStats_Options, ReposGetCodeFrequencyStats_RequestOptions]
  var `GET /repos/:owner/:repo/stats/commit_activity`: js.Tuple2[ReposGetCommitActivityStats_Options, ReposGetCommitActivityStats_RequestOptions]
  var `GET /repos/:owner/:repo/stats/contributors`: js.Tuple2[ReposGetContributorsStats_Options, ReposGetContributorsStats_RequestOptions]
  var `GET /repos/:owner/:repo/stats/participation`: js.Tuple2[ReposGetParticipationStats_Options, ReposGetParticipationStats_RequestOptions]
  var `GET /repos/:owner/:repo/stats/punch_card`: js.Tuple2[ReposGetPunchCardStats_Options, ReposGetPunchCardStats_RequestOptions]
  var `GET /repos/:owner/:repo/subscribers`: js.Tuple2[ActivityListWatchersForRepo_Options, ActivityListWatchersForRepo_RequestOptions]
  var `GET /repos/:owner/:repo/subscription`: js.Tuple2[ActivityGetRepoSubscription_Options, ActivityGetRepoSubscription_RequestOptions]
  var `GET /repos/:owner/:repo/tags`: js.Tuple2[ReposListTags_Options, ReposListTags_RequestOptions]
  var `GET /repos/:owner/:repo/teams`: js.Tuple2[ReposListTeams_Options, ReposListTeams_RequestOptions]
  var `GET /repos/:owner/:repo/topics`: js.Tuple2[ReposListTopics_Options, ReposListTopics_RequestOptions]
  var `GET /repos/:owner/:repo/traffic/clones`: js.Tuple2[ReposGetClones_Options, ReposGetClones_RequestOptions]
  var `GET /repos/:owner/:repo/traffic/popular/paths`: js.Tuple2[ReposGetTopPaths_Options, ReposGetTopPaths_RequestOptions]
  var `GET /repos/:owner/:repo/traffic/popular/referrers`: js.Tuple2[ReposGetTopReferrers_Options, ReposGetTopReferrers_RequestOptions]
  var `GET /repos/:owner/:repo/traffic/views`: js.Tuple2[ReposGetViews_Options, ReposGetViews_RequestOptions]
  var `GET /repositories`: js.Tuple2[ReposListPublic_Options, ReposListPublic_RequestOptions]
  var `GET /scim/v2/organizations/:org/Users`: js.Tuple2[
    ScimListProvisionedIdentities_Options, 
    ScimListProvisionedIdentities_RequestOptions
  ]
  var `GET /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[
    ScimGetProvisioningDetailsForUser_Options, 
    ScimGetProvisioningDetailsForUser_RequestOptions
  ]
  var `GET /search/code`: js.Tuple2[SearchCode_Options, SearchCode_RequestOptions]
  var `GET /search/commits`: js.Tuple2[SearchCommits_Options, SearchCommits_RequestOptions]
  var `GET /search/issues`: js.Tuple2[
    SearchIssuesAndPullRequests_Options | SearchIssues_Options, 
    SearchIssuesAndPullRequests_RequestOptions | SearchIssues_RequestOptions
  ]
  var `GET /search/labels`: js.Tuple2[SearchLabels_Options, SearchLabels_RequestOptions]
  var `GET /search/repositories`: js.Tuple2[SearchRepos_Options, SearchRepos_RequestOptions]
  var `GET /search/topics`: js.Tuple2[SearchTopics_Options, SearchTopics_RequestOptions]
  var `GET /search/users`: js.Tuple2[SearchUsers_Options, SearchUsers_RequestOptions]
  var `GET /teams/:team_id`: js.Tuple2[TeamsGet_Options, TeamsGet_RequestOptions]
  var `GET /teams/:team_id/discussions`: js.Tuple2[TeamsListDiscussions_Options, TeamsListDiscussions_RequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsGetDiscussion_Options, TeamsGetDiscussion_RequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number/comments`: js.Tuple2[TeamsListDiscussionComments_Options, TeamsListDiscussionComments_RequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsGetDiscussionComment_Options, TeamsGetDiscussionComment_RequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`: js.Tuple2[
    ReactionsListForTeamDiscussionComment_Options, 
    ReactionsListForTeamDiscussionComment_RequestOptions
  ]
  var `GET /teams/:team_id/discussions/:discussion_number/reactions`: js.Tuple2[
    ReactionsListForTeamDiscussion_Options, 
    ReactionsListForTeamDiscussion_RequestOptions
  ]
  var `GET /teams/:team_id/invitations`: js.Tuple2[TeamsListPendingInvitations_Options, TeamsListPendingInvitations_RequestOptions]
  var `GET /teams/:team_id/members`: js.Tuple2[TeamsListMembers_Options, TeamsListMembers_RequestOptions]
  var `GET /teams/:team_id/members/:username`: js.Tuple2[TeamsGetMember_Options, TeamsGetMember_RequestOptions]
  var `GET /teams/:team_id/memberships/:username`: js.Tuple2[TeamsGetMembership_Options, TeamsGetMembership_RequestOptions]
  var `GET /teams/:team_id/projects`: js.Tuple2[TeamsListProjects_Options, TeamsListProjects_RequestOptions]
  var `GET /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsReviewProject_Options, TeamsReviewProject_RequestOptions]
  var `GET /teams/:team_id/repos`: js.Tuple2[TeamsListRepos_Options, TeamsListRepos_RequestOptions]
  var `GET /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsCheckManagesRepo_Options, TeamsCheckManagesRepo_RequestOptions]
  var `GET /teams/:team_id/teams`: js.Tuple2[TeamsListChild_Options, TeamsListChild_RequestOptions]
  var `GET /user`: js.Tuple2[UsersGetAuthenticated_Options, UsersGetAuthenticated_RequestOptions]
  var `GET /user/blocks`: js.Tuple2[UsersListBlocked_Options, UsersListBlocked_RequestOptions]
  var `GET /user/blocks/:username`: js.Tuple2[UsersCheckBlocked_Options, UsersCheckBlocked_RequestOptions]
  var `GET /user/emails`: js.Tuple2[UsersListEmails_Options, UsersListEmails_RequestOptions]
  var `GET /user/followers`: js.Tuple2[
    UsersListFollowersForAuthenticatedUser_Options, 
    UsersListFollowersForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/following`: js.Tuple2[
    UsersListFollowingForAuthenticatedUser_Options, 
    UsersListFollowingForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/following/:username`: js.Tuple2[UsersCheckFollowing_Options, UsersCheckFollowing_RequestOptions]
  var `GET /user/gpg_keys`: js.Tuple2[UsersListGpgKeys_Options, UsersListGpgKeys_RequestOptions]
  var `GET /user/gpg_keys/:gpg_key_id`: js.Tuple2[UsersGetGpgKey_Options, UsersGetGpgKey_RequestOptions]
  var `GET /user/installations`: js.Tuple2[
    AppsListInstallationsForAuthenticatedUser_Options, 
    AppsListInstallationsForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/installations/:installation_id/repositories`: js.Tuple2[
    AppsListInstallationReposForAuthenticatedUser_Options, 
    AppsListInstallationReposForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/issues`: js.Tuple2[
    IssuesListForAuthenticatedUser_Options, 
    IssuesListForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/keys`: js.Tuple2[UsersListPublicKeys_Options, UsersListPublicKeys_RequestOptions]
  var `GET /user/keys/:key_id`: js.Tuple2[UsersGetPublicKey_Options, UsersGetPublicKey_RequestOptions]
  var `GET /user/marketplace_purchases`: js.Tuple2[
    AppsListMarketplacePurchasesForAuthenticatedUser_Options, 
    AppsListMarketplacePurchasesForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/marketplace_purchases/stubbed`: js.Tuple2[
    AppsListMarketplacePurchasesForAuthenticatedUserStubbed_Options, 
    AppsListMarketplacePurchasesForAuthenticatedUserStubbed_RequestOptions
  ]
  var `GET /user/memberships/orgs`: js.Tuple2[OrgsListMemberships_Options, OrgsListMemberships_RequestOptions]
  var `GET /user/memberships/orgs/:org`: js.Tuple2[
    OrgsGetMembershipForAuthenticatedUser_Options, 
    OrgsGetMembershipForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/migrations`: js.Tuple2[
    MigrationsListForAuthenticatedUser_Options, 
    MigrationsListForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/migrations/:migration_id`: js.Tuple2[
    MigrationsGetStatusForAuthenticatedUser_Options, 
    MigrationsGetStatusForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/migrations/:migration_id/archive`: js.Tuple2[
    MigrationsGetArchiveForAuthenticatedUser_Options, 
    MigrationsGetArchiveForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/orgs`: js.Tuple2[OrgsListForAuthenticatedUser_Options, OrgsListForAuthenticatedUser_RequestOptions]
  var `GET /user/public_emails`: js.Tuple2[UsersListPublicEmails_Options, UsersListPublicEmails_RequestOptions]
  var `GET /user/repos`: js.Tuple2[ReposList_Options, ReposList_RequestOptions]
  var `GET /user/repository_invitations`: js.Tuple2[
    ReposListInvitationsForAuthenticatedUser_Options, 
    ReposListInvitationsForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/starred`: js.Tuple2[
    ActivityListReposStarredByAuthenticatedUser_Options, 
    ActivityListReposStarredByAuthenticatedUser_RequestOptions
  ]
  var `GET /user/starred/:owner/:repo`: js.Tuple2[ActivityCheckStarringRepo_Options, ActivityCheckStarringRepo_RequestOptions]
  var `GET /user/subscriptions`: js.Tuple2[
    ActivityListWatchedReposForAuthenticatedUser_Options, 
    ActivityListWatchedReposForAuthenticatedUser_RequestOptions
  ]
  var `GET /user/subscriptions/:owner/:repo`: js.Tuple2[
    ActivityCheckWatchingRepoLegacy_Options, 
    ActivityCheckWatchingRepoLegacy_RequestOptions
  ]
  var `GET /user/teams`: js.Tuple2[
    TeamsListForAuthenticatedUser_Options, 
    TeamsListForAuthenticatedUser_RequestOptions
  ]
  var `GET /users`: js.Tuple2[UsersList_Options, UsersList_RequestOptions]
  var `GET /users/:username`: js.Tuple2[UsersGetByUsername_Options, UsersGetByUsername_RequestOptions]
  var `GET /users/:username/events`: js.Tuple2[ActivityListEventsForUser_Options, ActivityListEventsForUser_RequestOptions]
  var `GET /users/:username/events/orgs/:org`: js.Tuple2[ActivityListEventsForOrg_Options, ActivityListEventsForOrg_RequestOptions]
  var `GET /users/:username/events/public`: js.Tuple2[
    ActivityListPublicEventsForUser_Options, 
    ActivityListPublicEventsForUser_RequestOptions
  ]
  var `GET /users/:username/followers`: js.Tuple2[UsersListFollowersForUser_Options, UsersListFollowersForUser_RequestOptions]
  var `GET /users/:username/following`: js.Tuple2[UsersListFollowingForUser_Options, UsersListFollowingForUser_RequestOptions]
  var `GET /users/:username/following/:target_user`: js.Tuple2[UsersCheckFollowingForUser_Options, UsersCheckFollowingForUser_RequestOptions]
  var `GET /users/:username/gists`: js.Tuple2[GistsListPublicForUser_Options, GistsListPublicForUser_RequestOptions]
  var `GET /users/:username/gpg_keys`: js.Tuple2[UsersListGpgKeysForUser_Options, UsersListGpgKeysForUser_RequestOptions]
  var `GET /users/:username/hovercard`: js.Tuple2[UsersGetContextForUser_Options, UsersGetContextForUser_RequestOptions]
  var `GET /users/:username/installation`: js.Tuple2[
    AppsGetUserInstallation_Options | AppsFindUserInstallation_Options, 
    AppsGetUserInstallation_RequestOptions | AppsFindUserInstallation_RequestOptions
  ]
  var `GET /users/:username/keys`: js.Tuple2[UsersListPublicKeysForUser_Options, UsersListPublicKeysForUser_RequestOptions]
  var `GET /users/:username/orgs`: js.Tuple2[OrgsListForUser_Options, OrgsListForUser_RequestOptions]
  var `GET /users/:username/projects`: js.Tuple2[ProjectsListForUser_Options, ProjectsListForUser_RequestOptions]
  var `GET /users/:username/received_events`: js.Tuple2[
    ActivityListReceivedEventsForUser_Options, 
    ActivityListReceivedEventsForUser_RequestOptions
  ]
  var `GET /users/:username/received_events/public`: js.Tuple2[
    ActivityListReceivedPublicEventsForUser_Options, 
    ActivityListReceivedPublicEventsForUser_RequestOptions
  ]
  var `GET /users/:username/repos`: js.Tuple2[ReposListForUser_Options, ReposListForUser_RequestOptions]
  var `GET /users/:username/starred`: js.Tuple2[
    ActivityListReposStarredByUser_Options, 
    ActivityListReposStarredByUser_RequestOptions
  ]
  var `GET /users/:username/subscriptions`: js.Tuple2[
    ActivityListReposWatchedByUser_Options, 
    ActivityListReposWatchedByUser_RequestOptions
  ]
  var `PATCH /authorizations/:authorization_id`: js.Tuple2[
    OauthAuthorizationsUpdateAuthorization_Options, 
    OauthAuthorizationsUpdateAuthorization_RequestOptions
  ]
  var `PATCH /gists/:gist_id`: js.Tuple2[GistsUpdate_Options, GistsUpdate_RequestOptions]
  var `PATCH /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsUpdateComment_Options, GistsUpdateComment_RequestOptions]
  var `PATCH /notifications/threads/:thread_id`: js.Tuple2[ActivityMarkThreadAsRead_Options, ActivityMarkThreadAsRead_RequestOptions]
  var `PATCH /orgs/:org`: js.Tuple2[OrgsUpdate_Options, OrgsUpdate_RequestOptions]
  var `PATCH /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsUpdateHook_Options, OrgsUpdateHook_RequestOptions]
  var `PATCH /projects/:project_id`: js.Tuple2[ProjectsUpdate_Options, ProjectsUpdate_RequestOptions]
  var `PATCH /projects/columns/:column_id`: js.Tuple2[ProjectsUpdateColumn_Options, ProjectsUpdateColumn_RequestOptions]
  var `PATCH /projects/columns/cards/:card_id`: js.Tuple2[ProjectsUpdateCard_Options, ProjectsUpdateCard_RequestOptions]
  var `PATCH /repos/:owner/:repo`: js.Tuple2[ReposUpdate_Options, ReposUpdate_RequestOptions]
  var `PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
    ReposUpdateProtectedBranchPullRequestReviewEnforcement_Options, 
    ReposUpdateProtectedBranchPullRequestReviewEnforcement_RequestOptions
  ]
  var `PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
    ReposUpdateProtectedBranchRequiredStatusChecks_Options, 
    ReposUpdateProtectedBranchRequiredStatusChecks_RequestOptions
  ]
  var `PATCH /repos/:owner/:repo/check-runs/:check_run_id`: js.Tuple2[ChecksUpdate_Options, ChecksUpdate_RequestOptions]
  var `PATCH /repos/:owner/:repo/check-suites/preferences`: js.Tuple2[ChecksSetSuitesPreferences_Options, ChecksSetSuitesPreferences_RequestOptions]
  var `PATCH /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposUpdateCommitComment_Options, ReposUpdateCommitComment_RequestOptions]
  var `PATCH /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitUpdateRef_Options, GitUpdateRef_RequestOptions]
  var `PATCH /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposUpdateHook_Options, ReposUpdateHook_RequestOptions]
  var `PATCH /repos/:owner/:repo/import`: js.Tuple2[MigrationsUpdateImport_Options, MigrationsUpdateImport_RequestOptions]
  var `PATCH /repos/:owner/:repo/import/authors/:author_id`: js.Tuple2[MigrationsMapCommitAuthor_Options, MigrationsMapCommitAuthor_RequestOptions]
  var `PATCH /repos/:owner/:repo/import/lfs`: js.Tuple2[MigrationsSetLfsPreference_Options, MigrationsSetLfsPreference_RequestOptions]
  var `PATCH /repos/:owner/:repo/invitations/:invitation_id`: js.Tuple2[ReposUpdateInvitation_Options, ReposUpdateInvitation_RequestOptions]
  var `PATCH /repos/:owner/:repo/issues/:issue_number`: js.Tuple2[IssuesUpdate_Options, IssuesUpdate_RequestOptions]
  var `PATCH /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesUpdateComment_Options, IssuesUpdateComment_RequestOptions]
  var `PATCH /repos/:owner/:repo/labels/:current_name`: js.Tuple2[IssuesUpdateLabel_Options, IssuesUpdateLabel_RequestOptions]
  var `PATCH /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesUpdateMilestone_Options, IssuesUpdateMilestone_RequestOptions]
  var `PATCH /repos/:owner/:repo/pulls/:pull_number`: js.Tuple2[PullsUpdate_Options, PullsUpdate_RequestOptions]
  var `PATCH /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsUpdateComment_Options, PullsUpdateComment_RequestOptions]
  var `PATCH /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposUpdateRelease_Options, ReposUpdateRelease_RequestOptions]
  var `PATCH /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposUpdateReleaseAsset_Options, ReposUpdateReleaseAsset_RequestOptions]
  var `PATCH /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[ScimUpdateUserAttribute_Options, ScimUpdateUserAttribute_RequestOptions]
  var `PATCH /teams/:team_id`: js.Tuple2[TeamsUpdate_Options, TeamsUpdate_RequestOptions]
  var `PATCH /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsUpdateDiscussion_Options, TeamsUpdateDiscussion_RequestOptions]
  var `PATCH /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsUpdateDiscussionComment_Options, TeamsUpdateDiscussionComment_RequestOptions]
  var `PATCH /user`: js.Tuple2[UsersUpdateAuthenticated_Options, UsersUpdateAuthenticated_RequestOptions]
  var `PATCH /user/email/visibility`: js.Tuple2[
    UsersTogglePrimaryEmailVisibility_Options, 
    UsersTogglePrimaryEmailVisibility_RequestOptions
  ]
  var `PATCH /user/memberships/orgs/:org`: js.Tuple2[OrgsUpdateMembership_Options, OrgsUpdateMembership_RequestOptions]
  var `PATCH /user/repository_invitations/:invitation_id`: js.Tuple2[ReposAcceptInvitation_Options, ReposAcceptInvitation_RequestOptions]
  var `POST /app-manifests/:code/conversions`: js.Tuple2[AppsCreateFromManifest_Options, AppsCreateFromManifest_RequestOptions]
  var `POST /app/installations/:installation_id/access_tokens`: js.Tuple2[AppsCreateInstallationToken_Options, AppsCreateInstallationToken_RequestOptions]
  var `POST /applications/:client_id/tokens/:access_token`: js.Tuple2[
    OauthAuthorizationsResetAuthorization_Options, 
    OauthAuthorizationsResetAuthorization_RequestOptions
  ]
  var `POST /authorizations`: js.Tuple2[
    OauthAuthorizationsCreateAuthorization_Options, 
    OauthAuthorizationsCreateAuthorization_RequestOptions
  ]
  var `POST /content_references/:content_reference_id/attachments`: js.Tuple2[AppsCreateContentAttachment_Options, AppsCreateContentAttachment_RequestOptions]
  var `POST /gists`: js.Tuple2[GistsCreate_Options, GistsCreate_RequestOptions]
  var `POST /gists/:gist_id/comments`: js.Tuple2[GistsCreateComment_Options, GistsCreateComment_RequestOptions]
  var `POST /gists/:gist_id/forks`: js.Tuple2[GistsFork_Options, GistsFork_RequestOptions]
  var `POST /markdown`: js.Tuple2[MarkdownRender_Options, MarkdownRender_RequestOptions]
  var `POST /markdown/raw`: js.Tuple2[MarkdownRenderRaw_Options, MarkdownRenderRaw_RequestOptions]
  var `POST /orgs/:org/hooks`: js.Tuple2[OrgsCreateHook_Options, OrgsCreateHook_RequestOptions]
  var `POST /orgs/:org/hooks/:hook_id/pings`: js.Tuple2[OrgsPingHook_Options, OrgsPingHook_RequestOptions]
  var `POST /orgs/:org/invitations`: js.Tuple2[OrgsCreateInvitation_Options, OrgsCreateInvitation_RequestOptions]
  var `POST /orgs/:org/migrations`: js.Tuple2[MigrationsStartForOrg_Options, MigrationsStartForOrg_RequestOptions]
  var `POST /orgs/:org/projects`: js.Tuple2[ProjectsCreateForOrg_Options, ProjectsCreateForOrg_RequestOptions]
  var `POST /orgs/:org/repos`: js.Tuple2[ReposCreateInOrg_Options, ReposCreateInOrg_RequestOptions]
  var `POST /orgs/:org/teams`: js.Tuple2[TeamsCreate_Options, TeamsCreate_RequestOptions]
  var `POST /projects/:project_id/columns`: js.Tuple2[ProjectsCreateColumn_Options, ProjectsCreateColumn_RequestOptions]
  var `POST /projects/columns/:column_id/cards`: js.Tuple2[ProjectsCreateCard_Options, ProjectsCreateCard_RequestOptions]
  var `POST /projects/columns/:column_id/moves`: js.Tuple2[ProjectsMoveColumn_Options, ProjectsMoveColumn_RequestOptions]
  var `POST /projects/columns/cards/:card_id/moves`: js.Tuple2[ProjectsMoveCard_Options, ProjectsMoveCard_RequestOptions]
  var `POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
    ReposAddProtectedBranchAdminEnforcement_Options, 
    ReposAddProtectedBranchAdminEnforcement_RequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
    ReposAddProtectedBranchRequiredSignatures_Options, 
    ReposAddProtectedBranchRequiredSignatures_RequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposAddProtectedBranchRequiredStatusChecksContexts_Options, 
    ReposAddProtectedBranchRequiredStatusChecksContexts_RequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposAddProtectedBranchTeamRestrictions_Options, 
    ReposAddProtectedBranchTeamRestrictions_RequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposAddProtectedBranchUserRestrictions_Options, 
    ReposAddProtectedBranchUserRestrictions_RequestOptions
  ]
  var `POST /repos/:owner/:repo/check-runs`: js.Tuple2[ChecksCreate_Options, ChecksCreate_RequestOptions]
  var `POST /repos/:owner/:repo/check-suites`: js.Tuple2[ChecksCreateSuite_Options, ChecksCreateSuite_RequestOptions]
  var `POST /repos/:owner/:repo/check-suites/:check_suite_id/rerequest`: js.Tuple2[ChecksRerequestSuite_Options, ChecksRerequestSuite_RequestOptions]
  var `POST /repos/:owner/:repo/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsCreateForCommitComment_Options, 
    ReactionsCreateForCommitComment_RequestOptions
  ]
  var `POST /repos/:owner/:repo/commits/:sha/comments`: js.Tuple2[ReposCreateCommitComment_Options, ReposCreateCommitComment_RequestOptions]
  var `POST /repos/:owner/:repo/deployments`: js.Tuple2[ReposCreateDeployment_Options, ReposCreateDeployment_RequestOptions]
  var `POST /repos/:owner/:repo/deployments/:deployment_id/statuses`: js.Tuple2[ReposCreateDeploymentStatus_Options, ReposCreateDeploymentStatus_RequestOptions]
  var `POST /repos/:owner/:repo/forks`: js.Tuple2[ReposCreateFork_Options, ReposCreateFork_RequestOptions]
  var `POST /repos/:owner/:repo/git/blobs`: js.Tuple2[GitCreateBlob_Options, GitCreateBlob_RequestOptions]
  var `POST /repos/:owner/:repo/git/commits`: js.Tuple2[GitCreateCommit_Options, GitCreateCommit_RequestOptions]
  var `POST /repos/:owner/:repo/git/refs`: js.Tuple2[GitCreateRef_Options, GitCreateRef_RequestOptions]
  var `POST /repos/:owner/:repo/git/tags`: js.Tuple2[GitCreateTag_Options, GitCreateTag_RequestOptions]
  var `POST /repos/:owner/:repo/git/trees`: js.Tuple2[GitCreateTree_Options, GitCreateTree_RequestOptions]
  var `POST /repos/:owner/:repo/hooks`: js.Tuple2[ReposCreateHook_Options, ReposCreateHook_RequestOptions]
  var `POST /repos/:owner/:repo/hooks/:hook_id/pings`: js.Tuple2[ReposPingHook_Options, ReposPingHook_RequestOptions]
  var `POST /repos/:owner/:repo/hooks/:hook_id/tests`: js.Tuple2[ReposTestPushHook_Options, ReposTestPushHook_RequestOptions]
  var `POST /repos/:owner/:repo/issues`: js.Tuple2[IssuesCreate_Options, IssuesCreate_RequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/assignees`: js.Tuple2[IssuesAddAssignees_Options, IssuesAddAssignees_RequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/comments`: js.Tuple2[IssuesCreateComment_Options, IssuesCreateComment_RequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesAddLabels_Options, IssuesAddLabels_RequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/reactions`: js.Tuple2[ReactionsCreateForIssue_Options, ReactionsCreateForIssue_RequestOptions]
  var `POST /repos/:owner/:repo/issues/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsCreateForIssueComment_Options, 
    ReactionsCreateForIssueComment_RequestOptions
  ]
  var `POST /repos/:owner/:repo/keys`: js.Tuple2[ReposAddDeployKey_Options, ReposAddDeployKey_RequestOptions]
  var `POST /repos/:owner/:repo/labels`: js.Tuple2[IssuesCreateLabel_Options, IssuesCreateLabel_RequestOptions]
  var `POST /repos/:owner/:repo/merges`: js.Tuple2[ReposMerge_Options, ReposMerge_RequestOptions]
  var `POST /repos/:owner/:repo/milestones`: js.Tuple2[IssuesCreateMilestone_Options, IssuesCreateMilestone_RequestOptions]
  var `POST /repos/:owner/:repo/pages`: js.Tuple2[ReposEnablePagesSite_Options, ReposEnablePagesSite_RequestOptions]
  var `POST /repos/:owner/:repo/pages/builds`: js.Tuple2[ReposRequestPageBuild_Options, ReposRequestPageBuild_RequestOptions]
  var `POST /repos/:owner/:repo/projects`: js.Tuple2[ProjectsCreateForRepo_Options, ProjectsCreateForRepo_RequestOptions]
  var `POST /repos/:owner/:repo/pulls`: js.Tuple2[
    PullsCreate_Options | PullsCreateFromIssue_Options, 
    PullsCreate_RequestOptions | PullsCreateFromIssue_RequestOptions
  ]
  var `POST /repos/:owner/:repo/pulls/:pull_number/comments`: js.Tuple2[
    PullsCreateComment_Options | PullsCreateCommentReply_Options, 
    PullsCreateComment_RequestOptions | PullsCreateCommentReply_RequestOptions
  ]
  var `POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsCreateReviewRequest_Options, PullsCreateReviewRequest_RequestOptions]
  var `POST /repos/:owner/:repo/pulls/:pull_number/reviews`: js.Tuple2[PullsCreateReview_Options, PullsCreateReview_RequestOptions]
  var `POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events`: js.Tuple2[PullsSubmitReview_Options, PullsSubmitReview_RequestOptions]
  var `POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsCreateForPullRequestReviewComment_Options, 
    ReactionsCreateForPullRequestReviewComment_RequestOptions
  ]
  var `POST /repos/:owner/:repo/releases`: js.Tuple2[ReposCreateRelease_Options, ReposCreateRelease_RequestOptions]
  var `POST /repos/:owner/:repo/statuses/:sha`: js.Tuple2[ReposCreateStatus_Options, ReposCreateStatus_RequestOptions]
  var `POST /repos/:owner/:repo/transfer`: js.Tuple2[ReposTransfer_Options, ReposTransfer_RequestOptions]
  var `POST /scim/v2/organizations/:org/Users`: js.Tuple2[
    ScimProvisionAndInviteUsers_Options | ScimProvisionInviteUsers_Options, 
    ScimProvisionAndInviteUsers_RequestOptions | ScimProvisionInviteUsers_RequestOptions
  ]
  var `POST /teams/:team_id/discussions`: js.Tuple2[TeamsCreateDiscussion_Options, TeamsCreateDiscussion_RequestOptions]
  var `POST /teams/:team_id/discussions/:discussion_number/comments`: js.Tuple2[TeamsCreateDiscussionComment_Options, TeamsCreateDiscussionComment_RequestOptions]
  var `POST /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`: js.Tuple2[
    ReactionsCreateForTeamDiscussionComment_Options, 
    ReactionsCreateForTeamDiscussionComment_RequestOptions
  ]
  var `POST /teams/:team_id/discussions/:discussion_number/reactions`: js.Tuple2[
    ReactionsCreateForTeamDiscussion_Options, 
    ReactionsCreateForTeamDiscussion_RequestOptions
  ]
  var `POST /user/emails`: js.Tuple2[UsersAddEmails_Options, UsersAddEmails_RequestOptions]
  var `POST /user/gpg_keys`: js.Tuple2[UsersCreateGpgKey_Options, UsersCreateGpgKey_RequestOptions]
  var `POST /user/keys`: js.Tuple2[UsersCreatePublicKey_Options, UsersCreatePublicKey_RequestOptions]
  var `POST /user/migrations`: js.Tuple2[
    MigrationsStartForAuthenticatedUser_Options, 
    MigrationsStartForAuthenticatedUser_RequestOptions
  ]
  var `POST /user/projects`: js.Tuple2[
    ProjectsCreateForAuthenticatedUser_Options, 
    ProjectsCreateForAuthenticatedUser_RequestOptions
  ]
  var `POST /user/repos`: js.Tuple2[
    ReposCreateForAuthenticatedUser_Options, 
    ReposCreateForAuthenticatedUser_RequestOptions
  ]
  var `POST :url`: js.Tuple2[ReposUploadReleaseAsset_Options, ReposUploadReleaseAsset_RequestOptions]
  var `PUT /authorizations/clients/:client_id`: js.Tuple2[
    OauthAuthorizationsGetOrCreateAuthorizationForApp_Options, 
    OauthAuthorizationsGetOrCreateAuthorizationForApp_RequestOptions
  ]
  var `PUT /authorizations/clients/:client_id/:fingerprint`: js.Tuple2[
    OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprint_Options | OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprint_Options, 
    OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprint_RequestOptions | OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprint_RequestOptions
  ]
  var `PUT /gists/:gist_id/star`: js.Tuple2[GistsStar_Options, GistsStar_RequestOptions]
  var `PUT /notifications`: js.Tuple2[ActivityMarkAsRead_Options, ActivityMarkAsRead_RequestOptions]
  var `PUT /notifications/threads/:thread_id/subscription`: js.Tuple2[
    ActivitySetThreadSubscription_Options, 
    ActivitySetThreadSubscription_RequestOptions
  ]
  var `PUT /orgs/:org/blocks/:username`: js.Tuple2[OrgsBlockUser_Options, OrgsBlockUser_RequestOptions]
  var `PUT /orgs/:org/interaction-limits`: js.Tuple2[
    InteractionsAddOrUpdateRestrictionsForOrg_Options, 
    InteractionsAddOrUpdateRestrictionsForOrg_RequestOptions
  ]
  var `PUT /orgs/:org/memberships/:username`: js.Tuple2[OrgsAddOrUpdateMembership_Options, OrgsAddOrUpdateMembership_RequestOptions]
  var `PUT /orgs/:org/outside_collaborators/:username`: js.Tuple2[
    OrgsConvertMemberToOutsideCollaborator_Options, 
    OrgsConvertMemberToOutsideCollaborator_RequestOptions
  ]
  var `PUT /orgs/:org/public_members/:username`: js.Tuple2[OrgsPublicizeMembership_Options, OrgsPublicizeMembership_RequestOptions]
  var `PUT /projects/:project_id/collaborators/:username`: js.Tuple2[ProjectsAddCollaborator_Options, ProjectsAddCollaborator_RequestOptions]
  var `PUT /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposUpdateBranchProtection_Options, ReposUpdateBranchProtection_RequestOptions]
  var `PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposReplaceProtectedBranchRequiredStatusChecksContexts_Options, 
    ReposReplaceProtectedBranchRequiredStatusChecksContexts_RequestOptions
  ]
  var `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposReplaceProtectedBranchTeamRestrictions_Options, 
    ReposReplaceProtectedBranchTeamRestrictions_RequestOptions
  ]
  var `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposReplaceProtectedBranchUserRestrictions_Options, 
    ReposReplaceProtectedBranchUserRestrictions_RequestOptions
  ]
  var `PUT /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposAddCollaborator_Options, ReposAddCollaborator_RequestOptions]
  var `PUT /repos/:owner/:repo/contents/:path`: js.Tuple2[
    ReposCreateFile_Options | ReposUpdateFile_Options, 
    ReposCreateFile_RequestOptions | ReposUpdateFile_RequestOptions
  ]
  var `PUT /repos/:owner/:repo/import`: js.Tuple2[MigrationsStartImport_Options, MigrationsStartImport_RequestOptions]
  var `PUT /repos/:owner/:repo/interaction-limits`: js.Tuple2[
    InteractionsAddOrUpdateRestrictionsForRepo_Options, 
    InteractionsAddOrUpdateRestrictionsForRepo_RequestOptions
  ]
  var `PUT /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesReplaceLabels_Options, IssuesReplaceLabels_RequestOptions]
  var `PUT /repos/:owner/:repo/issues/:issue_number/lock`: js.Tuple2[IssuesLock_Options, IssuesLock_RequestOptions]
  var `PUT /repos/:owner/:repo/notifications`: js.Tuple2[
    ActivityMarkNotificationsAsReadForRepo_Options, 
    ActivityMarkNotificationsAsReadForRepo_RequestOptions
  ]
  var `PUT /repos/:owner/:repo/pages`: js.Tuple2[
    ReposUpdateInformationAboutPagesSite_Options, 
    ReposUpdateInformationAboutPagesSite_RequestOptions
  ]
  var `PUT /repos/:owner/:repo/pulls/:pull_number/merge`: js.Tuple2[PullsMerge_Options, PullsMerge_RequestOptions]
  var `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsUpdateReview_Options, PullsUpdateReview_RequestOptions]
  var `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals`: js.Tuple2[PullsDismissReview_Options, PullsDismissReview_RequestOptions]
  var `PUT /repos/:owner/:repo/subscription`: js.Tuple2[ActivitySetRepoSubscription_Options, ActivitySetRepoSubscription_RequestOptions]
  var `PUT /repos/:owner/:repo/topics`: js.Tuple2[ReposReplaceTopics_Options, ReposReplaceTopics_RequestOptions]
  var `PUT /repos/:owner/:repo/vulnerability-alerts`: js.Tuple2[
    ReposEnableVulnerabilityAlerts_Options, 
    ReposEnableVulnerabilityAlerts_RequestOptions
  ]
  var `PUT /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[
    ScimReplaceProvisionedUserInformation_Options | ScimUpdateProvisionedOrgMembership_Options, 
    ScimReplaceProvisionedUserInformation_RequestOptions | ScimUpdateProvisionedOrgMembership_RequestOptions
  ]
  var `PUT /teams/:team_id/members/:username`: js.Tuple2[TeamsAddMember_Options, TeamsAddMember_RequestOptions]
  var `PUT /teams/:team_id/memberships/:username`: js.Tuple2[TeamsAddOrUpdateMembership_Options, TeamsAddOrUpdateMembership_RequestOptions]
  var `PUT /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsAddOrUpdateProject_Options, TeamsAddOrUpdateProject_RequestOptions]
  var `PUT /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsAddOrUpdateRepo_Options, TeamsAddOrUpdateRepo_RequestOptions]
  var `PUT /user/blocks/:username`: js.Tuple2[UsersBlock_Options, UsersBlock_RequestOptions]
  var `PUT /user/following/:username`: js.Tuple2[UsersFollow_Options, UsersFollow_RequestOptions]
  var `PUT /user/installations/:installation_id/repositories/:repository_id`: js.Tuple2[AppsAddRepoToInstallation_Options, AppsAddRepoToInstallation_RequestOptions]
  var `PUT /user/starred/:owner/:repo`: js.Tuple2[ActivityStarRepo_Options, ActivityStarRepo_RequestOptions]
  var `PUT /user/subscriptions/:owner/:repo`: js.Tuple2[ActivityWatchRepoLegacy_Options, ActivityWatchRepoLegacy_RequestOptions]
}

object Routes {
  @scala.inline
  def apply(
    `DELETE /app/installations/:installation_id`: js.Tuple2[AppsDeleteInstallation_Options, AppsDeleteInstallation_RequestOptions],
    `DELETE /applications/:client_id/grants/:access_token`: js.Tuple2[
      OauthAuthorizationsRevokeGrantForApplication_Options, 
      OauthAuthorizationsRevokeGrantForApplication_RequestOptions
    ],
    `DELETE /applications/:client_id/tokens/:access_token`: js.Tuple2[
      OauthAuthorizationsRevokeAuthorizationForApplication_Options, 
      OauthAuthorizationsRevokeAuthorizationForApplication_RequestOptions
    ],
    `DELETE /applications/grants/:grant_id`: js.Tuple2[
      OauthAuthorizationsDeleteGrant_Options, 
      OauthAuthorizationsDeleteGrant_RequestOptions
    ],
    `DELETE /authorizations/:authorization_id`: js.Tuple2[
      OauthAuthorizationsDeleteAuthorization_Options, 
      OauthAuthorizationsDeleteAuthorization_RequestOptions
    ],
    `DELETE /gists/:gist_id`: js.Tuple2[GistsDelete_Options, GistsDelete_RequestOptions],
    `DELETE /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsDeleteComment_Options, GistsDeleteComment_RequestOptions],
    `DELETE /gists/:gist_id/star`: js.Tuple2[GistsUnstar_Options, GistsUnstar_RequestOptions],
    `DELETE /notifications/threads/:thread_id/subscription`: js.Tuple2[
      ActivityDeleteThreadSubscription_Options, 
      ActivityDeleteThreadSubscription_RequestOptions
    ],
    `DELETE /orgs/:org/blocks/:username`: js.Tuple2[OrgsUnblockUser_Options, OrgsUnblockUser_RequestOptions],
    `DELETE /orgs/:org/credential-authorizations/:credential_id`: js.Tuple2[
      OrgsRemoveCredentialAuthorization_Options, 
      OrgsRemoveCredentialAuthorization_RequestOptions
    ],
    `DELETE /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsDeleteHook_Options, OrgsDeleteHook_RequestOptions],
    `DELETE /orgs/:org/interaction-limits`: js.Tuple2[
      InteractionsRemoveRestrictionsForOrg_Options, 
      InteractionsRemoveRestrictionsForOrg_RequestOptions
    ],
    `DELETE /orgs/:org/members/:username`: js.Tuple2[OrgsRemoveMember_Options, OrgsRemoveMember_RequestOptions],
    `DELETE /orgs/:org/memberships/:username`: js.Tuple2[OrgsRemoveMembership_Options, OrgsRemoveMembership_RequestOptions],
    `DELETE /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[
      MigrationsDeleteArchiveForOrg_Options, 
      MigrationsDeleteArchiveForOrg_RequestOptions
    ],
    `DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[MigrationsUnlockRepoForOrg_Options, MigrationsUnlockRepoForOrg_RequestOptions],
    `DELETE /orgs/:org/outside_collaborators/:username`: js.Tuple2[
      OrgsRemoveOutsideCollaborator_Options, 
      OrgsRemoveOutsideCollaborator_RequestOptions
    ],
    `DELETE /orgs/:org/public_members/:username`: js.Tuple2[OrgsConcealMembership_Options, OrgsConcealMembership_RequestOptions],
    `DELETE /projects/:project_id`: js.Tuple2[ProjectsDelete_Options, ProjectsDelete_RequestOptions],
    `DELETE /projects/:project_id/collaborators/:username`: js.Tuple2[ProjectsRemoveCollaborator_Options, ProjectsRemoveCollaborator_RequestOptions],
    `DELETE /projects/columns/:column_id`: js.Tuple2[ProjectsDeleteColumn_Options, ProjectsDeleteColumn_RequestOptions],
    `DELETE /projects/columns/cards/:card_id`: js.Tuple2[ProjectsDeleteCard_Options, ProjectsDeleteCard_RequestOptions],
    `DELETE /reactions/:reaction_id`: js.Tuple2[ReactionsDelete_Options, ReactionsDelete_RequestOptions],
    `DELETE /repos/:owner/:repo`: js.Tuple2[ReposDelete_Options, ReposDelete_RequestOptions],
    `DELETE /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposRemoveBranchProtection_Options, ReposRemoveBranchProtection_RequestOptions],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
      ReposRemoveProtectedBranchAdminEnforcement_Options, 
      ReposRemoveProtectedBranchAdminEnforcement_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
      ReposRemoveProtectedBranchPullRequestReviewEnforcement_Options, 
      ReposRemoveProtectedBranchPullRequestReviewEnforcement_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
      ReposRemoveProtectedBranchRequiredSignatures_Options, 
      ReposRemoveProtectedBranchRequiredSignatures_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
      ReposRemoveProtectedBranchRequiredStatusChecks_Options, 
      ReposRemoveProtectedBranchRequiredStatusChecks_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
      ReposRemoveProtectedBranchRequiredStatusChecksContexts_Options, 
      ReposRemoveProtectedBranchRequiredStatusChecksContexts_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
      ReposRemoveProtectedBranchRestrictions_Options, 
      ReposRemoveProtectedBranchRestrictions_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
      ReposRemoveProtectedBranchTeamRestrictions_Options, 
      ReposRemoveProtectedBranchTeamRestrictions_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
      ReposRemoveProtectedBranchUserRestrictions_Options, 
      ReposRemoveProtectedBranchUserRestrictions_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposRemoveCollaborator_Options, ReposRemoveCollaborator_RequestOptions],
    `DELETE /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposDeleteCommitComment_Options, ReposDeleteCommitComment_RequestOptions],
    `DELETE /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposDeleteFile_Options, ReposDeleteFile_RequestOptions],
    `DELETE /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposDeleteDownload_Options, ReposDeleteDownload_RequestOptions],
    `DELETE /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitDeleteRef_Options, GitDeleteRef_RequestOptions],
    `DELETE /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposDeleteHook_Options, ReposDeleteHook_RequestOptions],
    `DELETE /repos/:owner/:repo/import`: js.Tuple2[MigrationsCancelImport_Options, MigrationsCancelImport_RequestOptions],
    `DELETE /repos/:owner/:repo/interaction-limits`: js.Tuple2[
      InteractionsRemoveRestrictionsForRepo_Options, 
      InteractionsRemoveRestrictionsForRepo_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/invitations/:invitation_id`: js.Tuple2[ReposDeleteInvitation_Options, ReposDeleteInvitation_RequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/assignees`: js.Tuple2[IssuesRemoveAssignees_Options, IssuesRemoveAssignees_RequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesRemoveLabels_Options, IssuesRemoveLabels_RequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name`: js.Tuple2[IssuesRemoveLabel_Options, IssuesRemoveLabel_RequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/lock`: js.Tuple2[IssuesUnlock_Options, IssuesUnlock_RequestOptions],
    `DELETE /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesDeleteComment_Options, IssuesDeleteComment_RequestOptions],
    `DELETE /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposRemoveDeployKey_Options, ReposRemoveDeployKey_RequestOptions],
    `DELETE /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesDeleteLabel_Options, IssuesDeleteLabel_RequestOptions],
    `DELETE /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesDeleteMilestone_Options, IssuesDeleteMilestone_RequestOptions],
    `DELETE /repos/:owner/:repo/pages`: js.Tuple2[ReposDisablePagesSite_Options, ReposDisablePagesSite_RequestOptions],
    `DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsDeleteReviewRequest_Options, PullsDeleteReviewRequest_RequestOptions],
    `DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsDeletePendingReview_Options, PullsDeletePendingReview_RequestOptions],
    `DELETE /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsDeleteComment_Options, PullsDeleteComment_RequestOptions],
    `DELETE /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposDeleteRelease_Options, ReposDeleteRelease_RequestOptions],
    `DELETE /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposDeleteReleaseAsset_Options, ReposDeleteReleaseAsset_RequestOptions],
    `DELETE /repos/:owner/:repo/subscription`: js.Tuple2[
      ActivityDeleteRepoSubscription_Options, 
      ActivityDeleteRepoSubscription_RequestOptions
    ],
    `DELETE /repos/:owner/:repo/vulnerability-alerts`: js.Tuple2[
      ReposDisableVulnerabilityAlerts_Options, 
      ReposDisableVulnerabilityAlerts_RequestOptions
    ],
    `DELETE /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[ScimRemoveUserFromOrg_Options, ScimRemoveUserFromOrg_RequestOptions],
    `DELETE /teams/:team_id`: js.Tuple2[TeamsDelete_Options, TeamsDelete_RequestOptions],
    `DELETE /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsDeleteDiscussion_Options, TeamsDeleteDiscussion_RequestOptions],
    `DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsDeleteDiscussionComment_Options, TeamsDeleteDiscussionComment_RequestOptions],
    `DELETE /teams/:team_id/members/:username`: js.Tuple2[TeamsRemoveMember_Options, TeamsRemoveMember_RequestOptions],
    `DELETE /teams/:team_id/memberships/:username`: js.Tuple2[TeamsRemoveMembership_Options, TeamsRemoveMembership_RequestOptions],
    `DELETE /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsRemoveProject_Options, TeamsRemoveProject_RequestOptions],
    `DELETE /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsRemoveRepo_Options, TeamsRemoveRepo_RequestOptions],
    `DELETE /user/blocks/:username`: js.Tuple2[UsersUnblock_Options, UsersUnblock_RequestOptions],
    `DELETE /user/emails`: js.Tuple2[UsersDeleteEmails_Options, UsersDeleteEmails_RequestOptions],
    `DELETE /user/following/:username`: js.Tuple2[UsersUnfollow_Options, UsersUnfollow_RequestOptions],
    `DELETE /user/gpg_keys/:gpg_key_id`: js.Tuple2[UsersDeleteGpgKey_Options, UsersDeleteGpgKey_RequestOptions],
    `DELETE /user/installations/:installation_id/repositories/:repository_id`: js.Tuple2[
      AppsRemoveRepoFromInstallation_Options, 
      AppsRemoveRepoFromInstallation_RequestOptions
    ],
    `DELETE /user/keys/:key_id`: js.Tuple2[UsersDeletePublicKey_Options, UsersDeletePublicKey_RequestOptions],
    `DELETE /user/migrations/:migration_id/archive`: js.Tuple2[
      MigrationsDeleteArchiveForAuthenticatedUser_Options, 
      MigrationsDeleteArchiveForAuthenticatedUser_RequestOptions
    ],
    `DELETE /user/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[
      MigrationsUnlockRepoForAuthenticatedUser_Options, 
      MigrationsUnlockRepoForAuthenticatedUser_RequestOptions
    ],
    `DELETE /user/repository_invitations/:invitation_id`: js.Tuple2[ReposDeclineInvitation_Options, ReposDeclineInvitation_RequestOptions],
    `DELETE /user/starred/:owner/:repo`: js.Tuple2[ActivityUnstarRepo_Options, ActivityUnstarRepo_RequestOptions],
    `DELETE /user/subscriptions/:owner/:repo`: js.Tuple2[
      ActivityStopWatchingRepoLegacy_Options, 
      ActivityStopWatchingRepoLegacy_RequestOptions
    ],
    `GET /app`: js.Tuple2[AppsGetAuthenticated_Options, AppsGetAuthenticated_RequestOptions],
    `GET /app/installations`: js.Tuple2[AppsListInstallations_Options, AppsListInstallations_RequestOptions],
    `GET /app/installations/:installation_id`: js.Tuple2[AppsGetInstallation_Options, AppsGetInstallation_RequestOptions],
    `GET /applications/:client_id/tokens/:access_token`: js.Tuple2[
      OauthAuthorizationsCheckAuthorization_Options, 
      OauthAuthorizationsCheckAuthorization_RequestOptions
    ],
    `GET /applications/grants`: js.Tuple2[
      OauthAuthorizationsListGrants_Options, 
      OauthAuthorizationsListGrants_RequestOptions
    ],
    `GET /applications/grants/:grant_id`: js.Tuple2[OauthAuthorizationsGetGrant_Options, OauthAuthorizationsGetGrant_RequestOptions],
    `GET /apps/:app_slug`: js.Tuple2[AppsGetBySlug_Options, AppsGetBySlug_RequestOptions],
    `GET /authorizations`: js.Tuple2[
      OauthAuthorizationsListAuthorizations_Options, 
      OauthAuthorizationsListAuthorizations_RequestOptions
    ],
    `GET /authorizations/:authorization_id`: js.Tuple2[
      OauthAuthorizationsGetAuthorization_Options, 
      OauthAuthorizationsGetAuthorization_RequestOptions
    ],
    `GET /codes_of_conduct`: js.Tuple2[
      CodesOfConductListConductCodes_Options, 
      CodesOfConductListConductCodes_RequestOptions
    ],
    `GET /codes_of_conduct/:key`: js.Tuple2[CodesOfConductGetConductCode_Options, CodesOfConductGetConductCode_RequestOptions],
    `GET /emojis`: js.Tuple2[EmojisGet_Options, EmojisGet_RequestOptions],
    `GET /events`: js.Tuple2[ActivityListPublicEvents_Options, ActivityListPublicEvents_RequestOptions],
    `GET /feeds`: js.Tuple2[ActivityListFeeds_Options, ActivityListFeeds_RequestOptions],
    `GET /gists`: js.Tuple2[GistsList_Options, GistsList_RequestOptions],
    `GET /gists/:gist_id`: js.Tuple2[GistsGet_Options, GistsGet_RequestOptions],
    `GET /gists/:gist_id/:sha`: js.Tuple2[GistsGetRevision_Options, GistsGetRevision_RequestOptions],
    `GET /gists/:gist_id/comments`: js.Tuple2[GistsListComments_Options, GistsListComments_RequestOptions],
    `GET /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsGetComment_Options, GistsGetComment_RequestOptions],
    `GET /gists/:gist_id/commits`: js.Tuple2[GistsListCommits_Options, GistsListCommits_RequestOptions],
    `GET /gists/:gist_id/forks`: js.Tuple2[GistsListForks_Options, GistsListForks_RequestOptions],
    `GET /gists/:gist_id/star`: js.Tuple2[GistsCheckIsStarred_Options, GistsCheckIsStarred_RequestOptions],
    `GET /gists/public`: js.Tuple2[GistsListPublic_Options, GistsListPublic_RequestOptions],
    `GET /gists/starred`: js.Tuple2[GistsListStarred_Options, GistsListStarred_RequestOptions],
    `GET /gitignore/templates`: js.Tuple2[GitignoreListTemplates_Options, GitignoreListTemplates_RequestOptions],
    `GET /gitignore/templates/:name`: js.Tuple2[GitignoreGetTemplate_Options, GitignoreGetTemplate_RequestOptions],
    `GET /installation/repositories`: js.Tuple2[AppsListRepos_Options, AppsListRepos_RequestOptions],
    `GET /issues`: js.Tuple2[IssuesList_Options, IssuesList_RequestOptions],
    `GET /legacy/issues/search/:owner/:repository/:state/:keyword`: js.Tuple2[SearchIssuesLegacy_Options, SearchIssuesLegacy_RequestOptions],
    `GET /legacy/repos/search/:keyword`: js.Tuple2[SearchReposLegacy_Options, SearchReposLegacy_RequestOptions],
    `GET /legacy/user/email/:email`: js.Tuple2[SearchEmailLegacy_Options, SearchEmailLegacy_RequestOptions],
    `GET /legacy/user/search/:keyword`: js.Tuple2[SearchUsersLegacy_Options, SearchUsersLegacy_RequestOptions],
    `GET /licenses`: js.Tuple2[
      LicensesListCommonlyUsed_Options | LicensesList_Options, 
      LicensesListCommonlyUsed_RequestOptions | LicensesList_RequestOptions
    ],
    `GET /licenses/:license`: js.Tuple2[LicensesGet_Options, LicensesGet_RequestOptions],
    `GET /marketplace_listing/accounts/:account_id`: js.Tuple2[
      AppsCheckAccountIsAssociatedWithAny_Options, 
      AppsCheckAccountIsAssociatedWithAny_RequestOptions
    ],
    `GET /marketplace_listing/plans`: js.Tuple2[AppsListPlans_Options, AppsListPlans_RequestOptions],
    `GET /marketplace_listing/plans/:plan_id/accounts`: js.Tuple2[
      AppsListAccountsUserOrOrgOnPlan_Options, 
      AppsListAccountsUserOrOrgOnPlan_RequestOptions
    ],
    `GET /marketplace_listing/stubbed/accounts/:account_id`: js.Tuple2[
      AppsCheckAccountIsAssociatedWithAnyStubbed_Options, 
      AppsCheckAccountIsAssociatedWithAnyStubbed_RequestOptions
    ],
    `GET /marketplace_listing/stubbed/plans`: js.Tuple2[AppsListPlansStubbed_Options, AppsListPlansStubbed_RequestOptions],
    `GET /marketplace_listing/stubbed/plans/:plan_id/accounts`: js.Tuple2[
      AppsListAccountsUserOrOrgOnPlanStubbed_Options, 
      AppsListAccountsUserOrOrgOnPlanStubbed_RequestOptions
    ],
    `GET /meta`: js.Tuple2[MetaGet_Options, MetaGet_RequestOptions],
    `GET /networks/:owner/:repo/events`: js.Tuple2[
      ActivityListPublicEventsForRepoNetwork_Options, 
      ActivityListPublicEventsForRepoNetwork_RequestOptions
    ],
    `GET /notifications`: js.Tuple2[ActivityListNotifications_Options, ActivityListNotifications_RequestOptions],
    `GET /notifications/threads/:thread_id`: js.Tuple2[ActivityGetThread_Options, ActivityGetThread_RequestOptions],
    `GET /notifications/threads/:thread_id/subscription`: js.Tuple2[
      ActivityGetThreadSubscription_Options, 
      ActivityGetThreadSubscription_RequestOptions
    ],
    `GET /organizations`: js.Tuple2[OrgsList_Options, OrgsList_RequestOptions],
    `GET /orgs/:org`: js.Tuple2[OrgsGet_Options, OrgsGet_RequestOptions],
    `GET /orgs/:org/blocks`: js.Tuple2[OrgsListBlockedUsers_Options, OrgsListBlockedUsers_RequestOptions],
    `GET /orgs/:org/blocks/:username`: js.Tuple2[OrgsCheckBlockedUser_Options, OrgsCheckBlockedUser_RequestOptions],
    `GET /orgs/:org/credential-authorizations`: js.Tuple2[
      OrgsListCredentialAuthorizations_Options, 
      OrgsListCredentialAuthorizations_RequestOptions
    ],
    `GET /orgs/:org/events`: js.Tuple2[
      ActivityListPublicEventsForOrg_Options, 
      ActivityListPublicEventsForOrg_RequestOptions
    ],
    `GET /orgs/:org/hooks`: js.Tuple2[OrgsListHooks_Options, OrgsListHooks_RequestOptions],
    `GET /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsGetHook_Options, OrgsGetHook_RequestOptions],
    `GET /orgs/:org/installation`: js.Tuple2[
      AppsGetOrgInstallation_Options | AppsFindOrgInstallation_Options, 
      AppsGetOrgInstallation_RequestOptions | AppsFindOrgInstallation_RequestOptions
    ],
    `GET /orgs/:org/interaction-limits`: js.Tuple2[
      InteractionsGetRestrictionsForOrg_Options, 
      InteractionsGetRestrictionsForOrg_RequestOptions
    ],
    `GET /orgs/:org/invitations`: js.Tuple2[OrgsListPendingInvitations_Options, OrgsListPendingInvitations_RequestOptions],
    `GET /orgs/:org/invitations/:invitation_id/teams`: js.Tuple2[OrgsListInvitationTeams_Options, OrgsListInvitationTeams_RequestOptions],
    `GET /orgs/:org/issues`: js.Tuple2[IssuesListForOrg_Options, IssuesListForOrg_RequestOptions],
    `GET /orgs/:org/members`: js.Tuple2[OrgsListMembers_Options, OrgsListMembers_RequestOptions],
    `GET /orgs/:org/members/:username`: js.Tuple2[OrgsCheckMembership_Options, OrgsCheckMembership_RequestOptions],
    `GET /orgs/:org/memberships/:username`: js.Tuple2[OrgsGetMembership_Options, OrgsGetMembership_RequestOptions],
    `GET /orgs/:org/migrations`: js.Tuple2[MigrationsListForOrg_Options, MigrationsListForOrg_RequestOptions],
    `GET /orgs/:org/migrations/:migration_id`: js.Tuple2[MigrationsGetStatusForOrg_Options, MigrationsGetStatusForOrg_RequestOptions],
    `GET /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[MigrationsGetArchiveForOrg_Options, MigrationsGetArchiveForOrg_RequestOptions],
    `GET /orgs/:org/outside_collaborators`: js.Tuple2[OrgsListOutsideCollaborators_Options, OrgsListOutsideCollaborators_RequestOptions],
    `GET /orgs/:org/projects`: js.Tuple2[ProjectsListForOrg_Options, ProjectsListForOrg_RequestOptions],
    `GET /orgs/:org/public_members`: js.Tuple2[OrgsListPublicMembers_Options, OrgsListPublicMembers_RequestOptions],
    `GET /orgs/:org/public_members/:username`: js.Tuple2[OrgsCheckPublicMembership_Options, OrgsCheckPublicMembership_RequestOptions],
    `GET /orgs/:org/repos`: js.Tuple2[ReposListForOrg_Options, ReposListForOrg_RequestOptions],
    `GET /orgs/:org/teams`: js.Tuple2[TeamsList_Options, TeamsList_RequestOptions],
    `GET /orgs/:org/teams/:team_slug`: js.Tuple2[TeamsGetByName_Options, TeamsGetByName_RequestOptions],
    `GET /projects/:project_id`: js.Tuple2[ProjectsGet_Options, ProjectsGet_RequestOptions],
    `GET /projects/:project_id/collaborators`: js.Tuple2[ProjectsListCollaborators_Options, ProjectsListCollaborators_RequestOptions],
    `GET /projects/:project_id/collaborators/:username/permission`: js.Tuple2[
      ProjectsReviewUserPermissionLevel_Options, 
      ProjectsReviewUserPermissionLevel_RequestOptions
    ],
    `GET /projects/:project_id/columns`: js.Tuple2[ProjectsListColumns_Options, ProjectsListColumns_RequestOptions],
    `GET /projects/columns/:column_id`: js.Tuple2[ProjectsGetColumn_Options, ProjectsGetColumn_RequestOptions],
    `GET /projects/columns/:column_id/cards`: js.Tuple2[ProjectsListCards_Options, ProjectsListCards_RequestOptions],
    `GET /projects/columns/cards/:card_id`: js.Tuple2[ProjectsGetCard_Options, ProjectsGetCard_RequestOptions],
    `GET /rate_limit`: js.Tuple2[RateLimitGet_Options, RateLimitGet_RequestOptions],
    `GET /repos/:owner/:repo`: js.Tuple2[ReposGet_Options, ReposGet_RequestOptions],
    `GET /repos/:owner/:repo/:archive_format/:ref`: js.Tuple2[ReposGetArchiveLink_Options, ReposGetArchiveLink_RequestOptions],
    `GET /repos/:owner/:repo/assignees`: js.Tuple2[IssuesListAssignees_Options, IssuesListAssignees_RequestOptions],
    `GET /repos/:owner/:repo/assignees/:assignee`: js.Tuple2[IssuesCheckAssignee_Options, IssuesCheckAssignee_RequestOptions],
    `GET /repos/:owner/:repo/branches`: js.Tuple2[ReposListBranches_Options, ReposListBranches_RequestOptions],
    `GET /repos/:owner/:repo/branches/:branch`: js.Tuple2[ReposGetBranch_Options, ReposGetBranch_RequestOptions],
    `GET /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposGetBranchProtection_Options, ReposGetBranchProtection_RequestOptions],
    `GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
      ReposGetProtectedBranchAdminEnforcement_Options, 
      ReposGetProtectedBranchAdminEnforcement_RequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
      ReposGetProtectedBranchPullRequestReviewEnforcement_Options, 
      ReposGetProtectedBranchPullRequestReviewEnforcement_RequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
      ReposGetProtectedBranchRequiredSignatures_Options, 
      ReposGetProtectedBranchRequiredSignatures_RequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
      ReposGetProtectedBranchRequiredStatusChecks_Options, 
      ReposGetProtectedBranchRequiredStatusChecks_RequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
      ReposListProtectedBranchRequiredStatusChecksContexts_Options, 
      ReposListProtectedBranchRequiredStatusChecksContexts_RequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
      ReposGetProtectedBranchRestrictions_Options, 
      ReposGetProtectedBranchRestrictions_RequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
      ReposListProtectedBranchTeamRestrictions_Options, 
      ReposListProtectedBranchTeamRestrictions_RequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
      ReposListProtectedBranchUserRestrictions_Options, 
      ReposListProtectedBranchUserRestrictions_RequestOptions
    ],
    `GET /repos/:owner/:repo/check-runs/:check_run_id`: js.Tuple2[ChecksGet_Options, ChecksGet_RequestOptions],
    `GET /repos/:owner/:repo/check-runs/:check_run_id/annotations`: js.Tuple2[ChecksListAnnotations_Options, ChecksListAnnotations_RequestOptions],
    `GET /repos/:owner/:repo/check-suites/:check_suite_id`: js.Tuple2[ChecksGetSuite_Options, ChecksGetSuite_RequestOptions],
    `GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs`: js.Tuple2[ChecksListForSuite_Options, ChecksListForSuite_RequestOptions],
    `GET /repos/:owner/:repo/collaborators`: js.Tuple2[ReposListCollaborators_Options, ReposListCollaborators_RequestOptions],
    `GET /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposCheckCollaborator_Options, ReposCheckCollaborator_RequestOptions],
    `GET /repos/:owner/:repo/collaborators/:username/permission`: js.Tuple2[
      ReposGetCollaboratorPermissionLevel_Options, 
      ReposGetCollaboratorPermissionLevel_RequestOptions
    ],
    `GET /repos/:owner/:repo/comments`: js.Tuple2[ReposListCommitComments_Options, ReposListCommitComments_RequestOptions],
    `GET /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposGetCommitComment_Options, ReposGetCommitComment_RequestOptions],
    `GET /repos/:owner/:repo/comments/:comment_id/reactions`: js.Tuple2[
      ReactionsListForCommitComment_Options, 
      ReactionsListForCommitComment_RequestOptions
    ],
    `GET /repos/:owner/:repo/commits`: js.Tuple2[ReposListCommits_Options, ReposListCommits_RequestOptions],
    `GET /repos/:owner/:repo/commits/:commit_sha`: js.Tuple2[ReposGetCommit_Options, ReposGetCommit_RequestOptions],
    `GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`: js.Tuple2[
      ReposListBranchesForHeadCommit_Options, 
      ReposListBranchesForHeadCommit_RequestOptions
    ],
    `GET /repos/:owner/:repo/commits/:commit_sha/pulls`: js.Tuple2[
      ReposListPullRequestsAssociatedWithCommit_Options, 
      ReposListPullRequestsAssociatedWithCommit_RequestOptions
    ],
    `GET /repos/:owner/:repo/commits/:ref`: js.Tuple2[ReposGetCommitRefSha_Options, ReposGetCommitRefSha_RequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/check-runs`: js.Tuple2[ChecksListForRef_Options, ChecksListForRef_RequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/check-suites`: js.Tuple2[ChecksListSuitesForRef_Options, ChecksListSuitesForRef_RequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/comments`: js.Tuple2[ReposListCommentsForCommit_Options, ReposListCommentsForCommit_RequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/status`: js.Tuple2[ReposGetCombinedStatusForRef_Options, ReposGetCombinedStatusForRef_RequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/statuses`: js.Tuple2[ReposListStatusesForRef_Options, ReposListStatusesForRef_RequestOptions],
    `GET /repos/:owner/:repo/community/code_of_conduct`: js.Tuple2[CodesOfConductGetForRepo_Options, CodesOfConductGetForRepo_RequestOptions],
    `GET /repos/:owner/:repo/community/profile`: js.Tuple2[
      ReposRetrieveCommunityProfileMetrics_Options, 
      ReposRetrieveCommunityProfileMetrics_RequestOptions
    ],
    `GET /repos/:owner/:repo/compare/:base...:head`: js.Tuple2[ReposCompareCommits_Options, ReposCompareCommits_RequestOptions],
    `GET /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposGetContents_Options, ReposGetContents_RequestOptions],
    `GET /repos/:owner/:repo/contributors`: js.Tuple2[ReposListContributors_Options, ReposListContributors_RequestOptions],
    `GET /repos/:owner/:repo/deployments`: js.Tuple2[ReposListDeployments_Options, ReposListDeployments_RequestOptions],
    `GET /repos/:owner/:repo/deployments/:deployment_id`: js.Tuple2[ReposGetDeployment_Options, ReposGetDeployment_RequestOptions],
    `GET /repos/:owner/:repo/deployments/:deployment_id/statuses`: js.Tuple2[ReposListDeploymentStatuses_Options, ReposListDeploymentStatuses_RequestOptions],
    `GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id`: js.Tuple2[ReposGetDeploymentStatus_Options, ReposGetDeploymentStatus_RequestOptions],
    `GET /repos/:owner/:repo/downloads`: js.Tuple2[ReposListDownloads_Options, ReposListDownloads_RequestOptions],
    `GET /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposGetDownload_Options, ReposGetDownload_RequestOptions],
    `GET /repos/:owner/:repo/events`: js.Tuple2[ActivityListRepoEvents_Options, ActivityListRepoEvents_RequestOptions],
    `GET /repos/:owner/:repo/forks`: js.Tuple2[ReposListForks_Options, ReposListForks_RequestOptions],
    `GET /repos/:owner/:repo/git/blobs/:file_sha`: js.Tuple2[GitGetBlob_Options, GitGetBlob_RequestOptions],
    `GET /repos/:owner/:repo/git/commits/:commit_sha`: js.Tuple2[GitGetCommit_Options, GitGetCommit_RequestOptions],
    `GET /repos/:owner/:repo/git/refs/:namespace`: js.Tuple2[GitListRefs_Options, GitListRefs_RequestOptions],
    `GET /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitGetRef_Options, GitGetRef_RequestOptions],
    `GET /repos/:owner/:repo/git/tags/:tag_sha`: js.Tuple2[GitGetTag_Options, GitGetTag_RequestOptions],
    `GET /repos/:owner/:repo/git/trees/:tree_sha`: js.Tuple2[GitGetTree_Options, GitGetTree_RequestOptions],
    `GET /repos/:owner/:repo/hooks`: js.Tuple2[ReposListHooks_Options, ReposListHooks_RequestOptions],
    `GET /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposGetHook_Options, ReposGetHook_RequestOptions],
    `GET /repos/:owner/:repo/import`: js.Tuple2[MigrationsGetImportProgress_Options, MigrationsGetImportProgress_RequestOptions],
    `GET /repos/:owner/:repo/import/authors`: js.Tuple2[MigrationsGetCommitAuthors_Options, MigrationsGetCommitAuthors_RequestOptions],
    `GET /repos/:owner/:repo/import/large_files`: js.Tuple2[MigrationsGetLargeFiles_Options, MigrationsGetLargeFiles_RequestOptions],
    `GET /repos/:owner/:repo/installation`: js.Tuple2[
      AppsGetRepoInstallation_Options | AppsFindRepoInstallation_Options, 
      AppsGetRepoInstallation_RequestOptions | AppsFindRepoInstallation_RequestOptions
    ],
    `GET /repos/:owner/:repo/interaction-limits`: js.Tuple2[
      InteractionsGetRestrictionsForRepo_Options, 
      InteractionsGetRestrictionsForRepo_RequestOptions
    ],
    `GET /repos/:owner/:repo/invitations`: js.Tuple2[ReposListInvitations_Options, ReposListInvitations_RequestOptions],
    `GET /repos/:owner/:repo/issues`: js.Tuple2[IssuesListForRepo_Options, IssuesListForRepo_RequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number`: js.Tuple2[IssuesGet_Options, IssuesGet_RequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/comments`: js.Tuple2[IssuesListComments_Options, IssuesListComments_RequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/events`: js.Tuple2[IssuesListEvents_Options, IssuesListEvents_RequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesListLabelsOnIssue_Options, IssuesListLabelsOnIssue_RequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/reactions`: js.Tuple2[ReactionsListForIssue_Options, ReactionsListForIssue_RequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/timeline`: js.Tuple2[IssuesListEventsForTimeline_Options, IssuesListEventsForTimeline_RequestOptions],
    `GET /repos/:owner/:repo/issues/comments`: js.Tuple2[IssuesListCommentsForRepo_Options, IssuesListCommentsForRepo_RequestOptions],
    `GET /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesGetComment_Options, IssuesGetComment_RequestOptions],
    `GET /repos/:owner/:repo/issues/comments/:comment_id/reactions`: js.Tuple2[ReactionsListForIssueComment_Options, ReactionsListForIssueComment_RequestOptions],
    `GET /repos/:owner/:repo/issues/events`: js.Tuple2[IssuesListEventsForRepo_Options, IssuesListEventsForRepo_RequestOptions],
    `GET /repos/:owner/:repo/issues/events/:event_id`: js.Tuple2[IssuesGetEvent_Options, IssuesGetEvent_RequestOptions],
    `GET /repos/:owner/:repo/keys`: js.Tuple2[ReposListDeployKeys_Options, ReposListDeployKeys_RequestOptions],
    `GET /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposGetDeployKey_Options, ReposGetDeployKey_RequestOptions],
    `GET /repos/:owner/:repo/labels`: js.Tuple2[IssuesListLabelsForRepo_Options, IssuesListLabelsForRepo_RequestOptions],
    `GET /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesGetLabel_Options, IssuesGetLabel_RequestOptions],
    `GET /repos/:owner/:repo/languages`: js.Tuple2[ReposListLanguages_Options, ReposListLanguages_RequestOptions],
    `GET /repos/:owner/:repo/license`: js.Tuple2[LicensesGetForRepo_Options, LicensesGetForRepo_RequestOptions],
    `GET /repos/:owner/:repo/milestones`: js.Tuple2[IssuesListMilestonesForRepo_Options, IssuesListMilestonesForRepo_RequestOptions],
    `GET /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesGetMilestone_Options, IssuesGetMilestone_RequestOptions],
    `GET /repos/:owner/:repo/milestones/:milestone_number/labels`: js.Tuple2[IssuesListLabelsForMilestone_Options, IssuesListLabelsForMilestone_RequestOptions],
    `GET /repos/:owner/:repo/notifications`: js.Tuple2[
      ActivityListNotificationsForRepo_Options, 
      ActivityListNotificationsForRepo_RequestOptions
    ],
    `GET /repos/:owner/:repo/pages`: js.Tuple2[ReposGetPages_Options, ReposGetPages_RequestOptions],
    `GET /repos/:owner/:repo/pages/builds`: js.Tuple2[ReposListPagesBuilds_Options, ReposListPagesBuilds_RequestOptions],
    `GET /repos/:owner/:repo/pages/builds/:build_id`: js.Tuple2[ReposGetPagesBuild_Options, ReposGetPagesBuild_RequestOptions],
    `GET /repos/:owner/:repo/pages/builds/latest`: js.Tuple2[ReposGetLatestPagesBuild_Options, ReposGetLatestPagesBuild_RequestOptions],
    `GET /repos/:owner/:repo/projects`: js.Tuple2[ProjectsListForRepo_Options, ProjectsListForRepo_RequestOptions],
    `GET /repos/:owner/:repo/pulls`: js.Tuple2[PullsList_Options, PullsList_RequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number`: js.Tuple2[PullsGet_Options, PullsGet_RequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/comments`: js.Tuple2[PullsListComments_Options, PullsListComments_RequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/commits`: js.Tuple2[PullsListCommits_Options, PullsListCommits_RequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/files`: js.Tuple2[PullsListFiles_Options, PullsListFiles_RequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/merge`: js.Tuple2[PullsCheckIfMerged_Options, PullsCheckIfMerged_RequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsListReviewRequests_Options, PullsListReviewRequests_RequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/reviews`: js.Tuple2[PullsListReviews_Options, PullsListReviews_RequestOptions]
  ): Routes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DELETE /app/installations/:installation_id")(`DELETE /app/installations/:installation_id`)
    __obj.updateDynamic("DELETE /applications/:client_id/grants/:access_token")(`DELETE /applications/:client_id/grants/:access_token`)
    __obj.updateDynamic("DELETE /applications/:client_id/tokens/:access_token")(`DELETE /applications/:client_id/tokens/:access_token`)
    __obj.updateDynamic("DELETE /applications/grants/:grant_id")(`DELETE /applications/grants/:grant_id`)
    __obj.updateDynamic("DELETE /authorizations/:authorization_id")(`DELETE /authorizations/:authorization_id`)
    __obj.updateDynamic("DELETE /gists/:gist_id")(`DELETE /gists/:gist_id`)
    __obj.updateDynamic("DELETE /gists/:gist_id/comments/:comment_id")(`DELETE /gists/:gist_id/comments/:comment_id`)
    __obj.updateDynamic("DELETE /gists/:gist_id/star")(`DELETE /gists/:gist_id/star`)
    __obj.updateDynamic("DELETE /notifications/threads/:thread_id/subscription")(`DELETE /notifications/threads/:thread_id/subscription`)
    __obj.updateDynamic("DELETE /orgs/:org/blocks/:username")(`DELETE /orgs/:org/blocks/:username`)
    __obj.updateDynamic("DELETE /orgs/:org/credential-authorizations/:credential_id")(`DELETE /orgs/:org/credential-authorizations/:credential_id`)
    __obj.updateDynamic("DELETE /orgs/:org/hooks/:hook_id")(`DELETE /orgs/:org/hooks/:hook_id`)
    __obj.updateDynamic("DELETE /orgs/:org/interaction-limits")(`DELETE /orgs/:org/interaction-limits`)
    __obj.updateDynamic("DELETE /orgs/:org/members/:username")(`DELETE /orgs/:org/members/:username`)
    __obj.updateDynamic("DELETE /orgs/:org/memberships/:username")(`DELETE /orgs/:org/memberships/:username`)
    __obj.updateDynamic("DELETE /orgs/:org/migrations/:migration_id/archive")(`DELETE /orgs/:org/migrations/:migration_id/archive`)
    __obj.updateDynamic("DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock")(`DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock`)
    __obj.updateDynamic("DELETE /orgs/:org/outside_collaborators/:username")(`DELETE /orgs/:org/outside_collaborators/:username`)
    __obj.updateDynamic("DELETE /orgs/:org/public_members/:username")(`DELETE /orgs/:org/public_members/:username`)
    __obj.updateDynamic("DELETE /projects/:project_id")(`DELETE /projects/:project_id`)
    __obj.updateDynamic("DELETE /projects/:project_id/collaborators/:username")(`DELETE /projects/:project_id/collaborators/:username`)
    __obj.updateDynamic("DELETE /projects/columns/:column_id")(`DELETE /projects/columns/:column_id`)
    __obj.updateDynamic("DELETE /projects/columns/cards/:card_id")(`DELETE /projects/columns/cards/:card_id`)
    __obj.updateDynamic("DELETE /reactions/:reaction_id")(`DELETE /reactions/:reaction_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo")(`DELETE /repos/:owner/:repo`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection")(`DELETE /repos/:owner/:repo/branches/:branch/protection`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins")(`DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews")(`DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures")(`DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks")(`DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts")(`DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions")(`DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams")(`DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users")(`DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/collaborators/:username")(`DELETE /repos/:owner/:repo/collaborators/:username`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/comments/:comment_id")(`DELETE /repos/:owner/:repo/comments/:comment_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/contents/:path")(`DELETE /repos/:owner/:repo/contents/:path`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/downloads/:download_id")(`DELETE /repos/:owner/:repo/downloads/:download_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/git/refs/:ref")(`DELETE /repos/:owner/:repo/git/refs/:ref`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/hooks/:hook_id")(`DELETE /repos/:owner/:repo/hooks/:hook_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/import")(`DELETE /repos/:owner/:repo/import`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/interaction-limits")(`DELETE /repos/:owner/:repo/interaction-limits`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/invitations/:invitation_id")(`DELETE /repos/:owner/:repo/invitations/:invitation_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/issues/:issue_number/assignees")(`DELETE /repos/:owner/:repo/issues/:issue_number/assignees`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/issues/:issue_number/labels")(`DELETE /repos/:owner/:repo/issues/:issue_number/labels`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name")(`DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/issues/:issue_number/lock")(`DELETE /repos/:owner/:repo/issues/:issue_number/lock`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/issues/comments/:comment_id")(`DELETE /repos/:owner/:repo/issues/comments/:comment_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/keys/:key_id")(`DELETE /repos/:owner/:repo/keys/:key_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/labels/:name")(`DELETE /repos/:owner/:repo/labels/:name`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/milestones/:milestone_number")(`DELETE /repos/:owner/:repo/milestones/:milestone_number`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/pages")(`DELETE /repos/:owner/:repo/pages`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers")(`DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id")(`DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/pulls/comments/:comment_id")(`DELETE /repos/:owner/:repo/pulls/comments/:comment_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/releases/:release_id")(`DELETE /repos/:owner/:repo/releases/:release_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/releases/assets/:asset_id")(`DELETE /repos/:owner/:repo/releases/assets/:asset_id`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/subscription")(`DELETE /repos/:owner/:repo/subscription`)
    __obj.updateDynamic("DELETE /repos/:owner/:repo/vulnerability-alerts")(`DELETE /repos/:owner/:repo/vulnerability-alerts`)
    __obj.updateDynamic("DELETE /scim/v2/organizations/:org/Users/:scim_user_id")(`DELETE /scim/v2/organizations/:org/Users/:scim_user_id`)
    __obj.updateDynamic("DELETE /teams/:team_id")(`DELETE /teams/:team_id`)
    __obj.updateDynamic("DELETE /teams/:team_id/discussions/:discussion_number")(`DELETE /teams/:team_id/discussions/:discussion_number`)
    __obj.updateDynamic("DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number")(`DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number`)
    __obj.updateDynamic("DELETE /teams/:team_id/members/:username")(`DELETE /teams/:team_id/members/:username`)
    __obj.updateDynamic("DELETE /teams/:team_id/memberships/:username")(`DELETE /teams/:team_id/memberships/:username`)
    __obj.updateDynamic("DELETE /teams/:team_id/projects/:project_id")(`DELETE /teams/:team_id/projects/:project_id`)
    __obj.updateDynamic("DELETE /teams/:team_id/repos/:owner/:repo")(`DELETE /teams/:team_id/repos/:owner/:repo`)
    __obj.updateDynamic("DELETE /user/blocks/:username")(`DELETE /user/blocks/:username`)
    __obj.updateDynamic("DELETE /user/emails")(`DELETE /user/emails`)
    __obj.updateDynamic("DELETE /user/following/:username")(`DELETE /user/following/:username`)
    __obj.updateDynamic("DELETE /user/gpg_keys/:gpg_key_id")(`DELETE /user/gpg_keys/:gpg_key_id`)
    __obj.updateDynamic("DELETE /user/installations/:installation_id/repositories/:repository_id")(`DELETE /user/installations/:installation_id/repositories/:repository_id`)
    __obj.updateDynamic("DELETE /user/keys/:key_id")(`DELETE /user/keys/:key_id`)
    __obj.updateDynamic("DELETE /user/migrations/:migration_id/archive")(`DELETE /user/migrations/:migration_id/archive`)
    __obj.updateDynamic("DELETE /user/migrations/:migration_id/repos/:repo_name/lock")(`DELETE /user/migrations/:migration_id/repos/:repo_name/lock`)
    __obj.updateDynamic("DELETE /user/repository_invitations/:invitation_id")(`DELETE /user/repository_invitations/:invitation_id`)
    __obj.updateDynamic("DELETE /user/starred/:owner/:repo")(`DELETE /user/starred/:owner/:repo`)
    __obj.updateDynamic("DELETE /user/subscriptions/:owner/:repo")(`DELETE /user/subscriptions/:owner/:repo`)
    __obj.updateDynamic("GET /app")(`GET /app`)
    __obj.updateDynamic("GET /app/installations")(`GET /app/installations`)
    __obj.updateDynamic("GET /app/installations/:installation_id")(`GET /app/installations/:installation_id`)
    __obj.updateDynamic("GET /applications/:client_id/tokens/:access_token")(`GET /applications/:client_id/tokens/:access_token`)
    __obj.updateDynamic("GET /applications/grants")(`GET /applications/grants`)
    __obj.updateDynamic("GET /applications/grants/:grant_id")(`GET /applications/grants/:grant_id`)
    __obj.updateDynamic("GET /apps/:app_slug")(`GET /apps/:app_slug`)
    __obj.updateDynamic("GET /authorizations")(`GET /authorizations`)
    __obj.updateDynamic("GET /authorizations/:authorization_id")(`GET /authorizations/:authorization_id`)
    __obj.updateDynamic("GET /codes_of_conduct")(`GET /codes_of_conduct`)
    __obj.updateDynamic("GET /codes_of_conduct/:key")(`GET /codes_of_conduct/:key`)
    __obj.updateDynamic("GET /emojis")(`GET /emojis`)
    __obj.updateDynamic("GET /events")(`GET /events`)
    __obj.updateDynamic("GET /feeds")(`GET /feeds`)
    __obj.updateDynamic("GET /gists")(`GET /gists`)
    __obj.updateDynamic("GET /gists/:gist_id")(`GET /gists/:gist_id`)
    __obj.updateDynamic("GET /gists/:gist_id/:sha")(`GET /gists/:gist_id/:sha`)
    __obj.updateDynamic("GET /gists/:gist_id/comments")(`GET /gists/:gist_id/comments`)
    __obj.updateDynamic("GET /gists/:gist_id/comments/:comment_id")(`GET /gists/:gist_id/comments/:comment_id`)
    __obj.updateDynamic("GET /gists/:gist_id/commits")(`GET /gists/:gist_id/commits`)
    __obj.updateDynamic("GET /gists/:gist_id/forks")(`GET /gists/:gist_id/forks`)
    __obj.updateDynamic("GET /gists/:gist_id/star")(`GET /gists/:gist_id/star`)
    __obj.updateDynamic("GET /gists/public")(`GET /gists/public`)
    __obj.updateDynamic("GET /gists/starred")(`GET /gists/starred`)
    __obj.updateDynamic("GET /gitignore/templates")(`GET /gitignore/templates`)
    __obj.updateDynamic("GET /gitignore/templates/:name")(`GET /gitignore/templates/:name`)
    __obj.updateDynamic("GET /installation/repositories")(`GET /installation/repositories`)
    __obj.updateDynamic("GET /issues")(`GET /issues`)
    __obj.updateDynamic("GET /legacy/issues/search/:owner/:repository/:state/:keyword")(`GET /legacy/issues/search/:owner/:repository/:state/:keyword`)
    __obj.updateDynamic("GET /legacy/repos/search/:keyword")(`GET /legacy/repos/search/:keyword`)
    __obj.updateDynamic("GET /legacy/user/email/:email")(`GET /legacy/user/email/:email`)
    __obj.updateDynamic("GET /legacy/user/search/:keyword")(`GET /legacy/user/search/:keyword`)
    __obj.updateDynamic("GET /licenses")(`GET /licenses`)
    __obj.updateDynamic("GET /licenses/:license")(`GET /licenses/:license`)
    __obj.updateDynamic("GET /marketplace_listing/accounts/:account_id")(`GET /marketplace_listing/accounts/:account_id`)
    __obj.updateDynamic("GET /marketplace_listing/plans")(`GET /marketplace_listing/plans`)
    __obj.updateDynamic("GET /marketplace_listing/plans/:plan_id/accounts")(`GET /marketplace_listing/plans/:plan_id/accounts`)
    __obj.updateDynamic("GET /marketplace_listing/stubbed/accounts/:account_id")(`GET /marketplace_listing/stubbed/accounts/:account_id`)
    __obj.updateDynamic("GET /marketplace_listing/stubbed/plans")(`GET /marketplace_listing/stubbed/plans`)
    __obj.updateDynamic("GET /marketplace_listing/stubbed/plans/:plan_id/accounts")(`GET /marketplace_listing/stubbed/plans/:plan_id/accounts`)
    __obj.updateDynamic("GET /meta")(`GET /meta`)
    __obj.updateDynamic("GET /networks/:owner/:repo/events")(`GET /networks/:owner/:repo/events`)
    __obj.updateDynamic("GET /notifications")(`GET /notifications`)
    __obj.updateDynamic("GET /notifications/threads/:thread_id")(`GET /notifications/threads/:thread_id`)
    __obj.updateDynamic("GET /notifications/threads/:thread_id/subscription")(`GET /notifications/threads/:thread_id/subscription`)
    __obj.updateDynamic("GET /organizations")(`GET /organizations`)
    __obj.updateDynamic("GET /orgs/:org")(`GET /orgs/:org`)
    __obj.updateDynamic("GET /orgs/:org/blocks")(`GET /orgs/:org/blocks`)
    __obj.updateDynamic("GET /orgs/:org/blocks/:username")(`GET /orgs/:org/blocks/:username`)
    __obj.updateDynamic("GET /orgs/:org/credential-authorizations")(`GET /orgs/:org/credential-authorizations`)
    __obj.updateDynamic("GET /orgs/:org/events")(`GET /orgs/:org/events`)
    __obj.updateDynamic("GET /orgs/:org/hooks")(`GET /orgs/:org/hooks`)
    __obj.updateDynamic("GET /orgs/:org/hooks/:hook_id")(`GET /orgs/:org/hooks/:hook_id`)
    __obj.updateDynamic("GET /orgs/:org/installation")(`GET /orgs/:org/installation`)
    __obj.updateDynamic("GET /orgs/:org/interaction-limits")(`GET /orgs/:org/interaction-limits`)
    __obj.updateDynamic("GET /orgs/:org/invitations")(`GET /orgs/:org/invitations`)
    __obj.updateDynamic("GET /orgs/:org/invitations/:invitation_id/teams")(`GET /orgs/:org/invitations/:invitation_id/teams`)
    __obj.updateDynamic("GET /orgs/:org/issues")(`GET /orgs/:org/issues`)
    __obj.updateDynamic("GET /orgs/:org/members")(`GET /orgs/:org/members`)
    __obj.updateDynamic("GET /orgs/:org/members/:username")(`GET /orgs/:org/members/:username`)
    __obj.updateDynamic("GET /orgs/:org/memberships/:username")(`GET /orgs/:org/memberships/:username`)
    __obj.updateDynamic("GET /orgs/:org/migrations")(`GET /orgs/:org/migrations`)
    __obj.updateDynamic("GET /orgs/:org/migrations/:migration_id")(`GET /orgs/:org/migrations/:migration_id`)
    __obj.updateDynamic("GET /orgs/:org/migrations/:migration_id/archive")(`GET /orgs/:org/migrations/:migration_id/archive`)
    __obj.updateDynamic("GET /orgs/:org/outside_collaborators")(`GET /orgs/:org/outside_collaborators`)
    __obj.updateDynamic("GET /orgs/:org/projects")(`GET /orgs/:org/projects`)
    __obj.updateDynamic("GET /orgs/:org/public_members")(`GET /orgs/:org/public_members`)
    __obj.updateDynamic("GET /orgs/:org/public_members/:username")(`GET /orgs/:org/public_members/:username`)
    __obj.updateDynamic("GET /orgs/:org/repos")(`GET /orgs/:org/repos`)
    __obj.updateDynamic("GET /orgs/:org/teams")(`GET /orgs/:org/teams`)
    __obj.updateDynamic("GET /orgs/:org/teams/:team_slug")(`GET /orgs/:org/teams/:team_slug`)
    __obj.updateDynamic("GET /projects/:project_id")(`GET /projects/:project_id`)
    __obj.updateDynamic("GET /projects/:project_id/collaborators")(`GET /projects/:project_id/collaborators`)
    __obj.updateDynamic("GET /projects/:project_id/collaborators/:username/permission")(`GET /projects/:project_id/collaborators/:username/permission`)
    __obj.updateDynamic("GET /projects/:project_id/columns")(`GET /projects/:project_id/columns`)
    __obj.updateDynamic("GET /projects/columns/:column_id")(`GET /projects/columns/:column_id`)
    __obj.updateDynamic("GET /projects/columns/:column_id/cards")(`GET /projects/columns/:column_id/cards`)
    __obj.updateDynamic("GET /projects/columns/cards/:card_id")(`GET /projects/columns/cards/:card_id`)
    __obj.updateDynamic("GET /rate_limit")(`GET /rate_limit`)
    __obj.updateDynamic("GET /repos/:owner/:repo")(`GET /repos/:owner/:repo`)
    __obj.updateDynamic("GET /repos/:owner/:repo/:archive_format/:ref")(`GET /repos/:owner/:repo/:archive_format/:ref`)
    __obj.updateDynamic("GET /repos/:owner/:repo/assignees")(`GET /repos/:owner/:repo/assignees`)
    __obj.updateDynamic("GET /repos/:owner/:repo/assignees/:assignee")(`GET /repos/:owner/:repo/assignees/:assignee`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches")(`GET /repos/:owner/:repo/branches`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch")(`GET /repos/:owner/:repo/branches/:branch`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection")(`GET /repos/:owner/:repo/branches/:branch/protection`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins")(`GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews")(`GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/required_signatures")(`GET /repos/:owner/:repo/branches/:branch/protection/required_signatures`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks")(`GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts")(`GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/restrictions")(`GET /repos/:owner/:repo/branches/:branch/protection/restrictions`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams")(`GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`)
    __obj.updateDynamic("GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users")(`GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users`)
    __obj.updateDynamic("GET /repos/:owner/:repo/check-runs/:check_run_id")(`GET /repos/:owner/:repo/check-runs/:check_run_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/check-runs/:check_run_id/annotations")(`GET /repos/:owner/:repo/check-runs/:check_run_id/annotations`)
    __obj.updateDynamic("GET /repos/:owner/:repo/check-suites/:check_suite_id")(`GET /repos/:owner/:repo/check-suites/:check_suite_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs")(`GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs`)
    __obj.updateDynamic("GET /repos/:owner/:repo/collaborators")(`GET /repos/:owner/:repo/collaborators`)
    __obj.updateDynamic("GET /repos/:owner/:repo/collaborators/:username")(`GET /repos/:owner/:repo/collaborators/:username`)
    __obj.updateDynamic("GET /repos/:owner/:repo/collaborators/:username/permission")(`GET /repos/:owner/:repo/collaborators/:username/permission`)
    __obj.updateDynamic("GET /repos/:owner/:repo/comments")(`GET /repos/:owner/:repo/comments`)
    __obj.updateDynamic("GET /repos/:owner/:repo/comments/:comment_id")(`GET /repos/:owner/:repo/comments/:comment_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/comments/:comment_id/reactions")(`GET /repos/:owner/:repo/comments/:comment_id/reactions`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits")(`GET /repos/:owner/:repo/commits`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha")(`GET /repos/:owner/:repo/commits/:commit_sha`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head")(`GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/pulls")(`GET /repos/:owner/:repo/commits/:commit_sha/pulls`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref")(`GET /repos/:owner/:repo/commits/:ref`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/check-runs")(`GET /repos/:owner/:repo/commits/:ref/check-runs`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/check-suites")(`GET /repos/:owner/:repo/commits/:ref/check-suites`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/comments")(`GET /repos/:owner/:repo/commits/:ref/comments`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/status")(`GET /repos/:owner/:repo/commits/:ref/status`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/statuses")(`GET /repos/:owner/:repo/commits/:ref/statuses`)
    __obj.updateDynamic("GET /repos/:owner/:repo/community/code_of_conduct")(`GET /repos/:owner/:repo/community/code_of_conduct`)
    __obj.updateDynamic("GET /repos/:owner/:repo/community/profile")(`GET /repos/:owner/:repo/community/profile`)
    __obj.updateDynamic("GET /repos/:owner/:repo/compare/:base...:head")(`GET /repos/:owner/:repo/compare/:base...:head`)
    __obj.updateDynamic("GET /repos/:owner/:repo/contents/:path")(`GET /repos/:owner/:repo/contents/:path`)
    __obj.updateDynamic("GET /repos/:owner/:repo/contributors")(`GET /repos/:owner/:repo/contributors`)
    __obj.updateDynamic("GET /repos/:owner/:repo/deployments")(`GET /repos/:owner/:repo/deployments`)
    __obj.updateDynamic("GET /repos/:owner/:repo/deployments/:deployment_id")(`GET /repos/:owner/:repo/deployments/:deployment_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/deployments/:deployment_id/statuses")(`GET /repos/:owner/:repo/deployments/:deployment_id/statuses`)
    __obj.updateDynamic("GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id")(`GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/downloads")(`GET /repos/:owner/:repo/downloads`)
    __obj.updateDynamic("GET /repos/:owner/:repo/downloads/:download_id")(`GET /repos/:owner/:repo/downloads/:download_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/events")(`GET /repos/:owner/:repo/events`)
    __obj.updateDynamic("GET /repos/:owner/:repo/forks")(`GET /repos/:owner/:repo/forks`)
    __obj.updateDynamic("GET /repos/:owner/:repo/git/blobs/:file_sha")(`GET /repos/:owner/:repo/git/blobs/:file_sha`)
    __obj.updateDynamic("GET /repos/:owner/:repo/git/commits/:commit_sha")(`GET /repos/:owner/:repo/git/commits/:commit_sha`)
    __obj.updateDynamic("GET /repos/:owner/:repo/git/refs/:namespace")(`GET /repos/:owner/:repo/git/refs/:namespace`)
    __obj.updateDynamic("GET /repos/:owner/:repo/git/refs/:ref")(`GET /repos/:owner/:repo/git/refs/:ref`)
    __obj.updateDynamic("GET /repos/:owner/:repo/git/tags/:tag_sha")(`GET /repos/:owner/:repo/git/tags/:tag_sha`)
    __obj.updateDynamic("GET /repos/:owner/:repo/git/trees/:tree_sha")(`GET /repos/:owner/:repo/git/trees/:tree_sha`)
    __obj.updateDynamic("GET /repos/:owner/:repo/hooks")(`GET /repos/:owner/:repo/hooks`)
    __obj.updateDynamic("GET /repos/:owner/:repo/hooks/:hook_id")(`GET /repos/:owner/:repo/hooks/:hook_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/import")(`GET /repos/:owner/:repo/import`)
    __obj.updateDynamic("GET /repos/:owner/:repo/import/authors")(`GET /repos/:owner/:repo/import/authors`)
    __obj.updateDynamic("GET /repos/:owner/:repo/import/large_files")(`GET /repos/:owner/:repo/import/large_files`)
    __obj.updateDynamic("GET /repos/:owner/:repo/installation")(`GET /repos/:owner/:repo/installation`)
    __obj.updateDynamic("GET /repos/:owner/:repo/interaction-limits")(`GET /repos/:owner/:repo/interaction-limits`)
    __obj.updateDynamic("GET /repos/:owner/:repo/invitations")(`GET /repos/:owner/:repo/invitations`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues")(`GET /repos/:owner/:repo/issues`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number")(`GET /repos/:owner/:repo/issues/:issue_number`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/comments")(`GET /repos/:owner/:repo/issues/:issue_number/comments`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/events")(`GET /repos/:owner/:repo/issues/:issue_number/events`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/labels")(`GET /repos/:owner/:repo/issues/:issue_number/labels`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/reactions")(`GET /repos/:owner/:repo/issues/:issue_number/reactions`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/timeline")(`GET /repos/:owner/:repo/issues/:issue_number/timeline`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/comments")(`GET /repos/:owner/:repo/issues/comments`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/comments/:comment_id")(`GET /repos/:owner/:repo/issues/comments/:comment_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/comments/:comment_id/reactions")(`GET /repos/:owner/:repo/issues/comments/:comment_id/reactions`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/events")(`GET /repos/:owner/:repo/issues/events`)
    __obj.updateDynamic("GET /repos/:owner/:repo/issues/events/:event_id")(`GET /repos/:owner/:repo/issues/events/:event_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/keys")(`GET /repos/:owner/:repo/keys`)
    __obj.updateDynamic("GET /repos/:owner/:repo/keys/:key_id")(`GET /repos/:owner/:repo/keys/:key_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/labels")(`GET /repos/:owner/:repo/labels`)
    __obj.updateDynamic("GET /repos/:owner/:repo/labels/:name")(`GET /repos/:owner/:repo/labels/:name`)
    __obj.updateDynamic("GET /repos/:owner/:repo/languages")(`GET /repos/:owner/:repo/languages`)
    __obj.updateDynamic("GET /repos/:owner/:repo/license")(`GET /repos/:owner/:repo/license`)
    __obj.updateDynamic("GET /repos/:owner/:repo/milestones")(`GET /repos/:owner/:repo/milestones`)
    __obj.updateDynamic("GET /repos/:owner/:repo/milestones/:milestone_number")(`GET /repos/:owner/:repo/milestones/:milestone_number`)
    __obj.updateDynamic("GET /repos/:owner/:repo/milestones/:milestone_number/labels")(`GET /repos/:owner/:repo/milestones/:milestone_number/labels`)
    __obj.updateDynamic("GET /repos/:owner/:repo/notifications")(`GET /repos/:owner/:repo/notifications`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pages")(`GET /repos/:owner/:repo/pages`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pages/builds")(`GET /repos/:owner/:repo/pages/builds`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pages/builds/:build_id")(`GET /repos/:owner/:repo/pages/builds/:build_id`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pages/builds/latest")(`GET /repos/:owner/:repo/pages/builds/latest`)
    __obj.updateDynamic("GET /repos/:owner/:repo/projects")(`GET /repos/:owner/:repo/projects`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls")(`GET /repos/:owner/:repo/pulls`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number")(`GET /repos/:owner/:repo/pulls/:pull_number`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/comments")(`GET /repos/:owner/:repo/pulls/:pull_number/comments`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/commits")(`GET /repos/:owner/:repo/pulls/:pull_number/commits`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/files")(`GET /repos/:owner/:repo/pulls/:pull_number/files`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/merge")(`GET /repos/:owner/:repo/pulls/:pull_number/merge`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers")(`GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`)
    __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/reviews")(`GET /repos/:owner/:repo/pulls/:pull_number/reviews`)
    __obj.asInstanceOf[Routes]
  }
}

