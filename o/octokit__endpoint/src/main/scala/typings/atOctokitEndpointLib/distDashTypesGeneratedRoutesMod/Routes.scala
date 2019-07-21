package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Routes extends js.Object {
  var `DELETE /app/installations/:installation_id`: js.Tuple2[AppsDeleteInstallationEndpoint, AppsDeleteInstallationRequestOptions]
  var `DELETE /applications/:client_id/grants/:access_token`: js.Tuple2[
    OauthAuthorizationsRevokeGrantForApplicationEndpoint, 
    OauthAuthorizationsRevokeGrantForApplicationRequestOptions
  ]
  var `DELETE /applications/:client_id/tokens/:access_token`: js.Tuple2[
    OauthAuthorizationsRevokeAuthorizationForApplicationEndpoint, 
    OauthAuthorizationsRevokeAuthorizationForApplicationRequestOptions
  ]
  var `DELETE /applications/grants/:grant_id`: js.Tuple2[
    OauthAuthorizationsDeleteGrantEndpoint, 
    OauthAuthorizationsDeleteGrantRequestOptions
  ]
  var `DELETE /authorizations/:authorization_id`: js.Tuple2[
    OauthAuthorizationsDeleteAuthorizationEndpoint, 
    OauthAuthorizationsDeleteAuthorizationRequestOptions
  ]
  var `DELETE /gists/:gist_id`: js.Tuple2[GistsDeleteEndpoint, GistsDeleteRequestOptions]
  var `DELETE /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsDeleteCommentEndpoint, GistsDeleteCommentRequestOptions]
  var `DELETE /gists/:gist_id/star`: js.Tuple2[GistsUnstarEndpoint, GistsUnstarRequestOptions]
  var `DELETE /notifications/threads/:thread_id/subscription`: js.Tuple2[
    ActivityDeleteThreadSubscriptionEndpoint, 
    ActivityDeleteThreadSubscriptionRequestOptions
  ]
  var `DELETE /orgs/:org/blocks/:username`: js.Tuple2[OrgsUnblockUserEndpoint, OrgsUnblockUserRequestOptions]
  var `DELETE /orgs/:org/credential-authorizations/:credential_id`: js.Tuple2[
    OrgsRemoveCredentialAuthorizationEndpoint, 
    OrgsRemoveCredentialAuthorizationRequestOptions
  ]
  var `DELETE /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsDeleteHookEndpoint, OrgsDeleteHookRequestOptions]
  var `DELETE /orgs/:org/interaction-limits`: js.Tuple2[
    InteractionsRemoveRestrictionsForOrgEndpoint, 
    InteractionsRemoveRestrictionsForOrgRequestOptions
  ]
  var `DELETE /orgs/:org/members/:username`: js.Tuple2[OrgsRemoveMemberEndpoint, OrgsRemoveMemberRequestOptions]
  var `DELETE /orgs/:org/memberships/:username`: js.Tuple2[OrgsRemoveMembershipEndpoint, OrgsRemoveMembershipRequestOptions]
  var `DELETE /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[MigrationsDeleteArchiveForOrgEndpoint, MigrationsDeleteArchiveForOrgRequestOptions]
  var `DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[MigrationsUnlockRepoForOrgEndpoint, MigrationsUnlockRepoForOrgRequestOptions]
  var `DELETE /orgs/:org/outside_collaborators/:username`: js.Tuple2[OrgsRemoveOutsideCollaboratorEndpoint, OrgsRemoveOutsideCollaboratorRequestOptions]
  var `DELETE /orgs/:org/public_members/:username`: js.Tuple2[OrgsConcealMembershipEndpoint, OrgsConcealMembershipRequestOptions]
  var `DELETE /projects/:project_id`: js.Tuple2[ProjectsDeleteEndpoint, ProjectsDeleteRequestOptions]
  var `DELETE /projects/:project_id/collaborators/:username`: js.Tuple2[ProjectsRemoveCollaboratorEndpoint, ProjectsRemoveCollaboratorRequestOptions]
  var `DELETE /projects/columns/:column_id`: js.Tuple2[ProjectsDeleteColumnEndpoint, ProjectsDeleteColumnRequestOptions]
  var `DELETE /projects/columns/cards/:card_id`: js.Tuple2[ProjectsDeleteCardEndpoint, ProjectsDeleteCardRequestOptions]
  var `DELETE /reactions/:reaction_id`: js.Tuple2[ReactionsDeleteEndpoint, ReactionsDeleteRequestOptions]
  var `DELETE /repos/:owner/:repo`: js.Tuple2[ReposDeleteEndpoint, ReposDeleteRequestOptions]
  var `DELETE /repos/:owner/:repo/automated-security-fixes`: js.Tuple2[
    ReposDisableAutomatedSecurityFixesEndpoint, 
    ReposDisableAutomatedSecurityFixesRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposRemoveBranchProtectionEndpoint, ReposRemoveBranchProtectionRequestOptions]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
    ReposRemoveProtectedBranchAdminEnforcementEndpoint, 
    ReposRemoveProtectedBranchAdminEnforcementRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
    ReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint, 
    ReposRemoveProtectedBranchPullRequestReviewEnforcementRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
    ReposRemoveProtectedBranchRequiredSignaturesEndpoint, 
    ReposRemoveProtectedBranchRequiredSignaturesRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
    ReposRemoveProtectedBranchRequiredStatusChecksEndpoint, 
    ReposRemoveProtectedBranchRequiredStatusChecksRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint, 
    ReposRemoveProtectedBranchRequiredStatusChecksContextsRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
    ReposRemoveProtectedBranchRestrictionsEndpoint, 
    ReposRemoveProtectedBranchRestrictionsRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposRemoveProtectedBranchTeamRestrictionsEndpoint, 
    ReposRemoveProtectedBranchTeamRestrictionsRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposRemoveProtectedBranchUserRestrictionsEndpoint, 
    ReposRemoveProtectedBranchUserRestrictionsRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposRemoveCollaboratorEndpoint, ReposRemoveCollaboratorRequestOptions]
  var `DELETE /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposDeleteCommitCommentEndpoint, ReposDeleteCommitCommentRequestOptions]
  var `DELETE /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposDeleteFileEndpoint, ReposDeleteFileRequestOptions]
  var `DELETE /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposDeleteDownloadEndpoint, ReposDeleteDownloadRequestOptions]
  var `DELETE /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitDeleteRefEndpoint, GitDeleteRefRequestOptions]
  var `DELETE /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposDeleteHookEndpoint, ReposDeleteHookRequestOptions]
  var `DELETE /repos/:owner/:repo/import`: js.Tuple2[MigrationsCancelImportEndpoint, MigrationsCancelImportRequestOptions]
  var `DELETE /repos/:owner/:repo/interaction-limits`: js.Tuple2[
    InteractionsRemoveRestrictionsForRepoEndpoint, 
    InteractionsRemoveRestrictionsForRepoRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/invitations/:invitation_id`: js.Tuple2[ReposDeleteInvitationEndpoint, ReposDeleteInvitationRequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/assignees`: js.Tuple2[IssuesRemoveAssigneesEndpoint, IssuesRemoveAssigneesRequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesRemoveLabelsEndpoint, IssuesRemoveLabelsRequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name`: js.Tuple2[IssuesRemoveLabelEndpoint, IssuesRemoveLabelRequestOptions]
  var `DELETE /repos/:owner/:repo/issues/:issue_number/lock`: js.Tuple2[IssuesUnlockEndpoint, IssuesUnlockRequestOptions]
  var `DELETE /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesDeleteCommentEndpoint, IssuesDeleteCommentRequestOptions]
  var `DELETE /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposRemoveDeployKeyEndpoint, ReposRemoveDeployKeyRequestOptions]
  var `DELETE /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesDeleteLabelEndpoint, IssuesDeleteLabelRequestOptions]
  var `DELETE /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesDeleteMilestoneEndpoint, IssuesDeleteMilestoneRequestOptions]
  var `DELETE /repos/:owner/:repo/pages`: js.Tuple2[ReposDisablePagesSiteEndpoint, ReposDisablePagesSiteRequestOptions]
  var `DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsDeleteReviewRequestEndpoint, PullsDeleteReviewRequestRequestOptions]
  var `DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsDeletePendingReviewEndpoint, PullsDeletePendingReviewRequestOptions]
  var `DELETE /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsDeleteCommentEndpoint, PullsDeleteCommentRequestOptions]
  var `DELETE /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposDeleteReleaseEndpoint, ReposDeleteReleaseRequestOptions]
  var `DELETE /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposDeleteReleaseAssetEndpoint, ReposDeleteReleaseAssetRequestOptions]
  var `DELETE /repos/:owner/:repo/subscription`: js.Tuple2[
    ActivityDeleteRepoSubscriptionEndpoint, 
    ActivityDeleteRepoSubscriptionRequestOptions
  ]
  var `DELETE /repos/:owner/:repo/vulnerability-alerts`: js.Tuple2[
    ReposDisableVulnerabilityAlertsEndpoint, 
    ReposDisableVulnerabilityAlertsRequestOptions
  ]
  var `DELETE /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[ScimRemoveUserFromOrgEndpoint, ScimRemoveUserFromOrgRequestOptions]
  var `DELETE /teams/:team_id`: js.Tuple2[TeamsDeleteEndpoint, TeamsDeleteRequestOptions]
  var `DELETE /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsDeleteDiscussionEndpoint, TeamsDeleteDiscussionRequestOptions]
  var `DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsDeleteDiscussionCommentEndpoint, TeamsDeleteDiscussionCommentRequestOptions]
  var `DELETE /teams/:team_id/members/:username`: js.Tuple2[TeamsRemoveMemberEndpoint, TeamsRemoveMemberRequestOptions]
  var `DELETE /teams/:team_id/memberships/:username`: js.Tuple2[TeamsRemoveMembershipEndpoint, TeamsRemoveMembershipRequestOptions]
  var `DELETE /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsRemoveProjectEndpoint, TeamsRemoveProjectRequestOptions]
  var `DELETE /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsRemoveRepoEndpoint, TeamsRemoveRepoRequestOptions]
  var `DELETE /user/blocks/:username`: js.Tuple2[UsersUnblockEndpoint, UsersUnblockRequestOptions]
  var `DELETE /user/emails`: js.Tuple2[UsersDeleteEmailsEndpoint, UsersDeleteEmailsRequestOptions]
  var `DELETE /user/following/:username`: js.Tuple2[UsersUnfollowEndpoint, UsersUnfollowRequestOptions]
  var `DELETE /user/gpg_keys/:gpg_key_id`: js.Tuple2[UsersDeleteGpgKeyEndpoint, UsersDeleteGpgKeyRequestOptions]
  var `DELETE /user/installations/:installation_id/repositories/:repository_id`: js.Tuple2[
    AppsRemoveRepoFromInstallationEndpoint, 
    AppsRemoveRepoFromInstallationRequestOptions
  ]
  var `DELETE /user/keys/:key_id`: js.Tuple2[UsersDeletePublicKeyEndpoint, UsersDeletePublicKeyRequestOptions]
  var `DELETE /user/migrations/:migration_id/archive`: js.Tuple2[
    MigrationsDeleteArchiveForAuthenticatedUserEndpoint, 
    MigrationsDeleteArchiveForAuthenticatedUserRequestOptions
  ]
  var `DELETE /user/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[
    MigrationsUnlockRepoForAuthenticatedUserEndpoint, 
    MigrationsUnlockRepoForAuthenticatedUserRequestOptions
  ]
  var `DELETE /user/repository_invitations/:invitation_id`: js.Tuple2[ReposDeclineInvitationEndpoint, ReposDeclineInvitationRequestOptions]
  var `DELETE /user/starred/:owner/:repo`: js.Tuple2[ActivityUnstarRepoEndpoint, ActivityUnstarRepoRequestOptions]
  var `DELETE /user/subscriptions/:owner/:repo`: js.Tuple2[
    ActivityStopWatchingRepoLegacyEndpoint, 
    ActivityStopWatchingRepoLegacyRequestOptions
  ]
  var `GET /app`: js.Tuple2[AppsGetAuthenticatedEndpoint, AppsGetAuthenticatedRequestOptions]
  var `GET /app/installations`: js.Tuple2[AppsListInstallationsEndpoint, AppsListInstallationsRequestOptions]
  var `GET /app/installations/:installation_id`: js.Tuple2[AppsGetInstallationEndpoint, AppsGetInstallationRequestOptions]
  var `GET /applications/:client_id/tokens/:access_token`: js.Tuple2[
    OauthAuthorizationsCheckAuthorizationEndpoint, 
    OauthAuthorizationsCheckAuthorizationRequestOptions
  ]
  var `GET /applications/grants`: js.Tuple2[OauthAuthorizationsListGrantsEndpoint, OauthAuthorizationsListGrantsRequestOptions]
  var `GET /applications/grants/:grant_id`: js.Tuple2[OauthAuthorizationsGetGrantEndpoint, OauthAuthorizationsGetGrantRequestOptions]
  var `GET /apps/:app_slug`: js.Tuple2[AppsGetBySlugEndpoint, AppsGetBySlugRequestOptions]
  var `GET /authorizations`: js.Tuple2[
    OauthAuthorizationsListAuthorizationsEndpoint, 
    OauthAuthorizationsListAuthorizationsRequestOptions
  ]
  var `GET /authorizations/:authorization_id`: js.Tuple2[
    OauthAuthorizationsGetAuthorizationEndpoint, 
    OauthAuthorizationsGetAuthorizationRequestOptions
  ]
  var `GET /codes_of_conduct`: js.Tuple2[
    CodesOfConductListConductCodesEndpoint, 
    CodesOfConductListConductCodesRequestOptions
  ]
  var `GET /codes_of_conduct/:key`: js.Tuple2[CodesOfConductGetConductCodeEndpoint, CodesOfConductGetConductCodeRequestOptions]
  var `GET /emojis`: js.Tuple2[EmojisGetEndpoint, EmojisGetRequestOptions]
  var `GET /events`: js.Tuple2[ActivityListPublicEventsEndpoint, ActivityListPublicEventsRequestOptions]
  var `GET /feeds`: js.Tuple2[ActivityListFeedsEndpoint, ActivityListFeedsRequestOptions]
  var `GET /gists`: js.Tuple2[GistsListEndpoint, GistsListRequestOptions]
  var `GET /gists/:gist_id`: js.Tuple2[GistsGetEndpoint, GistsGetRequestOptions]
  var `GET /gists/:gist_id/:sha`: js.Tuple2[GistsGetRevisionEndpoint, GistsGetRevisionRequestOptions]
  var `GET /gists/:gist_id/comments`: js.Tuple2[GistsListCommentsEndpoint, GistsListCommentsRequestOptions]
  var `GET /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsGetCommentEndpoint, GistsGetCommentRequestOptions]
  var `GET /gists/:gist_id/commits`: js.Tuple2[GistsListCommitsEndpoint, GistsListCommitsRequestOptions]
  var `GET /gists/:gist_id/forks`: js.Tuple2[GistsListForksEndpoint, GistsListForksRequestOptions]
  var `GET /gists/:gist_id/star`: js.Tuple2[GistsCheckIsStarredEndpoint, GistsCheckIsStarredRequestOptions]
  var `GET /gists/public`: js.Tuple2[GistsListPublicEndpoint, GistsListPublicRequestOptions]
  var `GET /gists/starred`: js.Tuple2[GistsListStarredEndpoint, GistsListStarredRequestOptions]
  var `GET /gitignore/templates`: js.Tuple2[GitignoreListTemplatesEndpoint, GitignoreListTemplatesRequestOptions]
  var `GET /gitignore/templates/:name`: js.Tuple2[GitignoreGetTemplateEndpoint, GitignoreGetTemplateRequestOptions]
  var `GET /installation/repositories`: js.Tuple2[AppsListReposEndpoint, AppsListReposRequestOptions]
  var `GET /issues`: js.Tuple2[IssuesListEndpoint, IssuesListRequestOptions]
  var `GET /legacy/issues/search/:owner/:repository/:state/:keyword`: js.Tuple2[SearchIssuesLegacyEndpoint, SearchIssuesLegacyRequestOptions]
  var `GET /legacy/repos/search/:keyword`: js.Tuple2[SearchReposLegacyEndpoint, SearchReposLegacyRequestOptions]
  var `GET /legacy/user/email/:email`: js.Tuple2[SearchEmailLegacyEndpoint, SearchEmailLegacyRequestOptions]
  var `GET /legacy/user/search/:keyword`: js.Tuple2[SearchUsersLegacyEndpoint, SearchUsersLegacyRequestOptions]
  var `GET /licenses`: js.Tuple2[
    LicensesListCommonlyUsedEndpoint | LicensesListEndpoint, 
    LicensesListCommonlyUsedRequestOptions | LicensesListRequestOptions
  ]
  var `GET /licenses/:license`: js.Tuple2[LicensesGetEndpoint, LicensesGetRequestOptions]
  var `GET /marketplace_listing/accounts/:account_id`: js.Tuple2[
    AppsCheckAccountIsAssociatedWithAnyEndpoint, 
    AppsCheckAccountIsAssociatedWithAnyRequestOptions
  ]
  var `GET /marketplace_listing/plans`: js.Tuple2[AppsListPlansEndpoint, AppsListPlansRequestOptions]
  var `GET /marketplace_listing/plans/:plan_id/accounts`: js.Tuple2[
    AppsListAccountsUserOrOrgOnPlanEndpoint, 
    AppsListAccountsUserOrOrgOnPlanRequestOptions
  ]
  var `GET /marketplace_listing/stubbed/accounts/:account_id`: js.Tuple2[
    AppsCheckAccountIsAssociatedWithAnyStubbedEndpoint, 
    AppsCheckAccountIsAssociatedWithAnyStubbedRequestOptions
  ]
  var `GET /marketplace_listing/stubbed/plans`: js.Tuple2[AppsListPlansStubbedEndpoint, AppsListPlansStubbedRequestOptions]
  var `GET /marketplace_listing/stubbed/plans/:plan_id/accounts`: js.Tuple2[
    AppsListAccountsUserOrOrgOnPlanStubbedEndpoint, 
    AppsListAccountsUserOrOrgOnPlanStubbedRequestOptions
  ]
  var `GET /meta`: js.Tuple2[MetaGetEndpoint, MetaGetRequestOptions]
  var `GET /networks/:owner/:repo/events`: js.Tuple2[
    ActivityListPublicEventsForRepoNetworkEndpoint, 
    ActivityListPublicEventsForRepoNetworkRequestOptions
  ]
  var `GET /notifications`: js.Tuple2[ActivityListNotificationsEndpoint, ActivityListNotificationsRequestOptions]
  var `GET /notifications/threads/:thread_id`: js.Tuple2[ActivityGetThreadEndpoint, ActivityGetThreadRequestOptions]
  var `GET /notifications/threads/:thread_id/subscription`: js.Tuple2[ActivityGetThreadSubscriptionEndpoint, ActivityGetThreadSubscriptionRequestOptions]
  var `GET /organizations`: js.Tuple2[OrgsListEndpoint, OrgsListRequestOptions]
  var `GET /orgs/:org`: js.Tuple2[OrgsGetEndpoint, OrgsGetRequestOptions]
  var `GET /orgs/:org/blocks`: js.Tuple2[OrgsListBlockedUsersEndpoint, OrgsListBlockedUsersRequestOptions]
  var `GET /orgs/:org/blocks/:username`: js.Tuple2[OrgsCheckBlockedUserEndpoint, OrgsCheckBlockedUserRequestOptions]
  var `GET /orgs/:org/credential-authorizations`: js.Tuple2[
    OrgsListCredentialAuthorizationsEndpoint, 
    OrgsListCredentialAuthorizationsRequestOptions
  ]
  var `GET /orgs/:org/events`: js.Tuple2[
    ActivityListPublicEventsForOrgEndpoint, 
    ActivityListPublicEventsForOrgRequestOptions
  ]
  var `GET /orgs/:org/hooks`: js.Tuple2[OrgsListHooksEndpoint, OrgsListHooksRequestOptions]
  var `GET /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsGetHookEndpoint, OrgsGetHookRequestOptions]
  var `GET /orgs/:org/installation`: js.Tuple2[
    AppsGetOrgInstallationEndpoint | AppsFindOrgInstallationEndpoint, 
    AppsGetOrgInstallationRequestOptions | AppsFindOrgInstallationRequestOptions
  ]
  var `GET /orgs/:org/interaction-limits`: js.Tuple2[
    InteractionsGetRestrictionsForOrgEndpoint, 
    InteractionsGetRestrictionsForOrgRequestOptions
  ]
  var `GET /orgs/:org/invitations`: js.Tuple2[OrgsListPendingInvitationsEndpoint, OrgsListPendingInvitationsRequestOptions]
  var `GET /orgs/:org/invitations/:invitation_id/teams`: js.Tuple2[OrgsListInvitationTeamsEndpoint, OrgsListInvitationTeamsRequestOptions]
  var `GET /orgs/:org/issues`: js.Tuple2[IssuesListForOrgEndpoint, IssuesListForOrgRequestOptions]
  var `GET /orgs/:org/members`: js.Tuple2[OrgsListMembersEndpoint, OrgsListMembersRequestOptions]
  var `GET /orgs/:org/members/:username`: js.Tuple2[OrgsCheckMembershipEndpoint, OrgsCheckMembershipRequestOptions]
  var `GET /orgs/:org/memberships/:username`: js.Tuple2[OrgsGetMembershipEndpoint, OrgsGetMembershipRequestOptions]
  var `GET /orgs/:org/migrations`: js.Tuple2[MigrationsListForOrgEndpoint, MigrationsListForOrgRequestOptions]
  var `GET /orgs/:org/migrations/:migration_id`: js.Tuple2[MigrationsGetStatusForOrgEndpoint, MigrationsGetStatusForOrgRequestOptions]
  var `GET /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[MigrationsGetArchiveForOrgEndpoint, MigrationsGetArchiveForOrgRequestOptions]
  var `GET /orgs/:org/outside_collaborators`: js.Tuple2[OrgsListOutsideCollaboratorsEndpoint, OrgsListOutsideCollaboratorsRequestOptions]
  var `GET /orgs/:org/projects`: js.Tuple2[ProjectsListForOrgEndpoint, ProjectsListForOrgRequestOptions]
  var `GET /orgs/:org/public_members`: js.Tuple2[OrgsListPublicMembersEndpoint, OrgsListPublicMembersRequestOptions]
  var `GET /orgs/:org/public_members/:username`: js.Tuple2[OrgsCheckPublicMembershipEndpoint, OrgsCheckPublicMembershipRequestOptions]
  var `GET /orgs/:org/repos`: js.Tuple2[ReposListForOrgEndpoint, ReposListForOrgRequestOptions]
  var `GET /orgs/:org/team-sync/groups`: js.Tuple2[TeamsListIdPGroupsForOrgEndpoint, TeamsListIdPGroupsForOrgRequestOptions]
  var `GET /orgs/:org/teams`: js.Tuple2[TeamsListEndpoint, TeamsListRequestOptions]
  var `GET /orgs/:org/teams/:team_slug`: js.Tuple2[TeamsGetByNameEndpoint, TeamsGetByNameRequestOptions]
  var `GET /projects/:project_id`: js.Tuple2[ProjectsGetEndpoint, ProjectsGetRequestOptions]
  var `GET /projects/:project_id/collaborators`: js.Tuple2[ProjectsListCollaboratorsEndpoint, ProjectsListCollaboratorsRequestOptions]
  var `GET /projects/:project_id/collaborators/:username/permission`: js.Tuple2[
    ProjectsReviewUserPermissionLevelEndpoint, 
    ProjectsReviewUserPermissionLevelRequestOptions
  ]
  var `GET /projects/:project_id/columns`: js.Tuple2[ProjectsListColumnsEndpoint, ProjectsListColumnsRequestOptions]
  var `GET /projects/columns/:column_id`: js.Tuple2[ProjectsGetColumnEndpoint, ProjectsGetColumnRequestOptions]
  var `GET /projects/columns/:column_id/cards`: js.Tuple2[ProjectsListCardsEndpoint, ProjectsListCardsRequestOptions]
  var `GET /projects/columns/cards/:card_id`: js.Tuple2[ProjectsGetCardEndpoint, ProjectsGetCardRequestOptions]
  var `GET /rate_limit`: js.Tuple2[RateLimitGetEndpoint, RateLimitGetRequestOptions]
  var `GET /repos/:owner/:repo`: js.Tuple2[ReposGetEndpoint, ReposGetRequestOptions]
  var `GET /repos/:owner/:repo/:archive_format/:ref`: js.Tuple2[ReposGetArchiveLinkEndpoint, ReposGetArchiveLinkRequestOptions]
  var `GET /repos/:owner/:repo/assignees`: js.Tuple2[IssuesListAssigneesEndpoint, IssuesListAssigneesRequestOptions]
  var `GET /repos/:owner/:repo/assignees/:assignee`: js.Tuple2[IssuesCheckAssigneeEndpoint, IssuesCheckAssigneeRequestOptions]
  var `GET /repos/:owner/:repo/branches`: js.Tuple2[ReposListBranchesEndpoint, ReposListBranchesRequestOptions]
  var `GET /repos/:owner/:repo/branches/:branch`: js.Tuple2[ReposGetBranchEndpoint, ReposGetBranchRequestOptions]
  var `GET /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposGetBranchProtectionEndpoint, ReposGetBranchProtectionRequestOptions]
  var `GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
    ReposGetProtectedBranchAdminEnforcementEndpoint, 
    ReposGetProtectedBranchAdminEnforcementRequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
    ReposGetProtectedBranchPullRequestReviewEnforcementEndpoint, 
    ReposGetProtectedBranchPullRequestReviewEnforcementRequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
    ReposGetProtectedBranchRequiredSignaturesEndpoint, 
    ReposGetProtectedBranchRequiredSignaturesRequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
    ReposGetProtectedBranchRequiredStatusChecksEndpoint, 
    ReposGetProtectedBranchRequiredStatusChecksRequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposListProtectedBranchRequiredStatusChecksContextsEndpoint, 
    ReposListProtectedBranchRequiredStatusChecksContextsRequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
    ReposGetProtectedBranchRestrictionsEndpoint, 
    ReposGetProtectedBranchRestrictionsRequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposListProtectedBranchTeamRestrictionsEndpoint, 
    ReposListProtectedBranchTeamRestrictionsRequestOptions
  ]
  var `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposListProtectedBranchUserRestrictionsEndpoint, 
    ReposListProtectedBranchUserRestrictionsRequestOptions
  ]
  var `GET /repos/:owner/:repo/check-runs/:check_run_id`: js.Tuple2[ChecksGetEndpoint, ChecksGetRequestOptions]
  var `GET /repos/:owner/:repo/check-runs/:check_run_id/annotations`: js.Tuple2[ChecksListAnnotationsEndpoint, ChecksListAnnotationsRequestOptions]
  var `GET /repos/:owner/:repo/check-suites/:check_suite_id`: js.Tuple2[ChecksGetSuiteEndpoint, ChecksGetSuiteRequestOptions]
  var `GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs`: js.Tuple2[ChecksListForSuiteEndpoint, ChecksListForSuiteRequestOptions]
  var `GET /repos/:owner/:repo/collaborators`: js.Tuple2[ReposListCollaboratorsEndpoint, ReposListCollaboratorsRequestOptions]
  var `GET /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposCheckCollaboratorEndpoint, ReposCheckCollaboratorRequestOptions]
  var `GET /repos/:owner/:repo/collaborators/:username/permission`: js.Tuple2[
    ReposGetCollaboratorPermissionLevelEndpoint, 
    ReposGetCollaboratorPermissionLevelRequestOptions
  ]
  var `GET /repos/:owner/:repo/comments`: js.Tuple2[ReposListCommitCommentsEndpoint, ReposListCommitCommentsRequestOptions]
  var `GET /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposGetCommitCommentEndpoint, ReposGetCommitCommentRequestOptions]
  var `GET /repos/:owner/:repo/comments/:comment_id/reactions`: js.Tuple2[ReactionsListForCommitCommentEndpoint, ReactionsListForCommitCommentRequestOptions]
  var `GET /repos/:owner/:repo/commits`: js.Tuple2[ReposListCommitsEndpoint, ReposListCommitsRequestOptions]
  var `GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`: js.Tuple2[
    ReposListBranchesForHeadCommitEndpoint, 
    ReposListBranchesForHeadCommitRequestOptions
  ]
  var `GET /repos/:owner/:repo/commits/:commit_sha/comments`: js.Tuple2[ReposListCommentsForCommitEndpoint, ReposListCommentsForCommitRequestOptions]
  var `GET /repos/:owner/:repo/commits/:commit_sha/pulls`: js.Tuple2[
    ReposListPullRequestsAssociatedWithCommitEndpoint, 
    ReposListPullRequestsAssociatedWithCommitRequestOptions
  ]
  var `GET /repos/:owner/:repo/commits/:ref`: js.Tuple2[
    ReposGetCommitEndpoint | ReposGetCommitRefShaEndpoint, 
    ReposGetCommitRequestOptions | ReposGetCommitRefShaRequestOptions
  ]
  var `GET /repos/:owner/:repo/commits/:ref/check-runs`: js.Tuple2[ChecksListForRefEndpoint, ChecksListForRefRequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/check-suites`: js.Tuple2[ChecksListSuitesForRefEndpoint, ChecksListSuitesForRefRequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/status`: js.Tuple2[ReposGetCombinedStatusForRefEndpoint, ReposGetCombinedStatusForRefRequestOptions]
  var `GET /repos/:owner/:repo/commits/:ref/statuses`: js.Tuple2[ReposListStatusesForRefEndpoint, ReposListStatusesForRefRequestOptions]
  var `GET /repos/:owner/:repo/community/code_of_conduct`: js.Tuple2[CodesOfConductGetForRepoEndpoint, CodesOfConductGetForRepoRequestOptions]
  var `GET /repos/:owner/:repo/community/profile`: js.Tuple2[
    ReposRetrieveCommunityProfileMetricsEndpoint, 
    ReposRetrieveCommunityProfileMetricsRequestOptions
  ]
  var `GET /repos/:owner/:repo/compare/:base...:head`: js.Tuple2[ReposCompareCommitsEndpoint, ReposCompareCommitsRequestOptions]
  var `GET /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposGetContentsEndpoint, ReposGetContentsRequestOptions]
  var `GET /repos/:owner/:repo/contributors`: js.Tuple2[ReposListContributorsEndpoint, ReposListContributorsRequestOptions]
  var `GET /repos/:owner/:repo/deployments`: js.Tuple2[ReposListDeploymentsEndpoint, ReposListDeploymentsRequestOptions]
  var `GET /repos/:owner/:repo/deployments/:deployment_id`: js.Tuple2[ReposGetDeploymentEndpoint, ReposGetDeploymentRequestOptions]
  var `GET /repos/:owner/:repo/deployments/:deployment_id/statuses`: js.Tuple2[ReposListDeploymentStatusesEndpoint, ReposListDeploymentStatusesRequestOptions]
  var `GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id`: js.Tuple2[ReposGetDeploymentStatusEndpoint, ReposGetDeploymentStatusRequestOptions]
  var `GET /repos/:owner/:repo/downloads`: js.Tuple2[ReposListDownloadsEndpoint, ReposListDownloadsRequestOptions]
  var `GET /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposGetDownloadEndpoint, ReposGetDownloadRequestOptions]
  var `GET /repos/:owner/:repo/events`: js.Tuple2[ActivityListRepoEventsEndpoint, ActivityListRepoEventsRequestOptions]
  var `GET /repos/:owner/:repo/forks`: js.Tuple2[ReposListForksEndpoint, ReposListForksRequestOptions]
  var `GET /repos/:owner/:repo/git/blobs/:file_sha`: js.Tuple2[GitGetBlobEndpoint, GitGetBlobRequestOptions]
  var `GET /repos/:owner/:repo/git/commits/:commit_sha`: js.Tuple2[GitGetCommitEndpoint, GitGetCommitRequestOptions]
  var `GET /repos/:owner/:repo/git/refs/:namespace`: js.Tuple2[GitListRefsEndpoint, GitListRefsRequestOptions]
  var `GET /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitGetRefEndpoint, GitGetRefRequestOptions]
  var `GET /repos/:owner/:repo/git/tags/:tag_sha`: js.Tuple2[GitGetTagEndpoint, GitGetTagRequestOptions]
  var `GET /repos/:owner/:repo/git/trees/:tree_sha`: js.Tuple2[GitGetTreeEndpoint, GitGetTreeRequestOptions]
  var `GET /repos/:owner/:repo/hooks`: js.Tuple2[ReposListHooksEndpoint, ReposListHooksRequestOptions]
  var `GET /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposGetHookEndpoint, ReposGetHookRequestOptions]
  var `GET /repos/:owner/:repo/import`: js.Tuple2[MigrationsGetImportProgressEndpoint, MigrationsGetImportProgressRequestOptions]
  var `GET /repos/:owner/:repo/import/authors`: js.Tuple2[MigrationsGetCommitAuthorsEndpoint, MigrationsGetCommitAuthorsRequestOptions]
  var `GET /repos/:owner/:repo/import/large_files`: js.Tuple2[MigrationsGetLargeFilesEndpoint, MigrationsGetLargeFilesRequestOptions]
  var `GET /repos/:owner/:repo/installation`: js.Tuple2[
    AppsGetRepoInstallationEndpoint | AppsFindRepoInstallationEndpoint, 
    AppsGetRepoInstallationRequestOptions | AppsFindRepoInstallationRequestOptions
  ]
  var `GET /repos/:owner/:repo/interaction-limits`: js.Tuple2[
    InteractionsGetRestrictionsForRepoEndpoint, 
    InteractionsGetRestrictionsForRepoRequestOptions
  ]
  var `GET /repos/:owner/:repo/invitations`: js.Tuple2[ReposListInvitationsEndpoint, ReposListInvitationsRequestOptions]
  var `GET /repos/:owner/:repo/issues`: js.Tuple2[IssuesListForRepoEndpoint, IssuesListForRepoRequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number`: js.Tuple2[IssuesGetEndpoint, IssuesGetRequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/comments`: js.Tuple2[IssuesListCommentsEndpoint, IssuesListCommentsRequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/events`: js.Tuple2[IssuesListEventsEndpoint, IssuesListEventsRequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesListLabelsOnIssueEndpoint, IssuesListLabelsOnIssueRequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/reactions`: js.Tuple2[ReactionsListForIssueEndpoint, ReactionsListForIssueRequestOptions]
  var `GET /repos/:owner/:repo/issues/:issue_number/timeline`: js.Tuple2[IssuesListEventsForTimelineEndpoint, IssuesListEventsForTimelineRequestOptions]
  var `GET /repos/:owner/:repo/issues/comments`: js.Tuple2[IssuesListCommentsForRepoEndpoint, IssuesListCommentsForRepoRequestOptions]
  var `GET /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesGetCommentEndpoint, IssuesGetCommentRequestOptions]
  var `GET /repos/:owner/:repo/issues/comments/:comment_id/reactions`: js.Tuple2[ReactionsListForIssueCommentEndpoint, ReactionsListForIssueCommentRequestOptions]
  var `GET /repos/:owner/:repo/issues/events`: js.Tuple2[IssuesListEventsForRepoEndpoint, IssuesListEventsForRepoRequestOptions]
  var `GET /repos/:owner/:repo/issues/events/:event_id`: js.Tuple2[IssuesGetEventEndpoint, IssuesGetEventRequestOptions]
  var `GET /repos/:owner/:repo/keys`: js.Tuple2[ReposListDeployKeysEndpoint, ReposListDeployKeysRequestOptions]
  var `GET /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposGetDeployKeyEndpoint, ReposGetDeployKeyRequestOptions]
  var `GET /repos/:owner/:repo/labels`: js.Tuple2[IssuesListLabelsForRepoEndpoint, IssuesListLabelsForRepoRequestOptions]
  var `GET /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesGetLabelEndpoint, IssuesGetLabelRequestOptions]
  var `GET /repos/:owner/:repo/languages`: js.Tuple2[ReposListLanguagesEndpoint, ReposListLanguagesRequestOptions]
  var `GET /repos/:owner/:repo/license`: js.Tuple2[LicensesGetForRepoEndpoint, LicensesGetForRepoRequestOptions]
  var `GET /repos/:owner/:repo/milestones`: js.Tuple2[IssuesListMilestonesForRepoEndpoint, IssuesListMilestonesForRepoRequestOptions]
  var `GET /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesGetMilestoneEndpoint, IssuesGetMilestoneRequestOptions]
  var `GET /repos/:owner/:repo/milestones/:milestone_number/labels`: js.Tuple2[IssuesListLabelsForMilestoneEndpoint, IssuesListLabelsForMilestoneRequestOptions]
  var `GET /repos/:owner/:repo/notifications`: js.Tuple2[
    ActivityListNotificationsForRepoEndpoint, 
    ActivityListNotificationsForRepoRequestOptions
  ]
  var `GET /repos/:owner/:repo/pages`: js.Tuple2[ReposGetPagesEndpoint, ReposGetPagesRequestOptions]
  var `GET /repos/:owner/:repo/pages/builds`: js.Tuple2[ReposListPagesBuildsEndpoint, ReposListPagesBuildsRequestOptions]
  var `GET /repos/:owner/:repo/pages/builds/:build_id`: js.Tuple2[ReposGetPagesBuildEndpoint, ReposGetPagesBuildRequestOptions]
  var `GET /repos/:owner/:repo/pages/builds/latest`: js.Tuple2[ReposGetLatestPagesBuildEndpoint, ReposGetLatestPagesBuildRequestOptions]
  var `GET /repos/:owner/:repo/projects`: js.Tuple2[ProjectsListForRepoEndpoint, ProjectsListForRepoRequestOptions]
  var `GET /repos/:owner/:repo/pulls`: js.Tuple2[PullsListEndpoint, PullsListRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number`: js.Tuple2[PullsGetEndpoint, PullsGetRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/comments`: js.Tuple2[PullsListCommentsEndpoint, PullsListCommentsRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/commits`: js.Tuple2[PullsListCommitsEndpoint, PullsListCommitsRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/files`: js.Tuple2[PullsListFilesEndpoint, PullsListFilesRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/merge`: js.Tuple2[PullsCheckIfMergedEndpoint, PullsCheckIfMergedRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsListReviewRequestsEndpoint, PullsListReviewRequestsRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/reviews`: js.Tuple2[PullsListReviewsEndpoint, PullsListReviewsRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsGetReviewEndpoint, PullsGetReviewRequestOptions]
  var `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments`: js.Tuple2[PullsGetCommentsForReviewEndpoint, PullsGetCommentsForReviewRequestOptions]
  var `GET /repos/:owner/:repo/pulls/comments`: js.Tuple2[PullsListCommentsForRepoEndpoint, PullsListCommentsForRepoRequestOptions]
  var `GET /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsGetCommentEndpoint, PullsGetCommentRequestOptions]
  var `GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsListForPullRequestReviewCommentEndpoint, 
    ReactionsListForPullRequestReviewCommentRequestOptions
  ]
  var `GET /repos/:owner/:repo/readme`: js.Tuple2[ReposGetReadmeEndpoint, ReposGetReadmeRequestOptions]
  var `GET /repos/:owner/:repo/releases`: js.Tuple2[ReposListReleasesEndpoint, ReposListReleasesRequestOptions]
  var `GET /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposGetReleaseEndpoint, ReposGetReleaseRequestOptions]
  var `GET /repos/:owner/:repo/releases/:release_id/assets`: js.Tuple2[ReposListAssetsForReleaseEndpoint, ReposListAssetsForReleaseRequestOptions]
  var `GET /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposGetReleaseAssetEndpoint, ReposGetReleaseAssetRequestOptions]
  var `GET /repos/:owner/:repo/releases/latest`: js.Tuple2[ReposGetLatestReleaseEndpoint, ReposGetLatestReleaseRequestOptions]
  var `GET /repos/:owner/:repo/releases/tags/:tag`: js.Tuple2[ReposGetReleaseByTagEndpoint, ReposGetReleaseByTagRequestOptions]
  var `GET /repos/:owner/:repo/stargazers`: js.Tuple2[ActivityListStargazersForRepoEndpoint, ActivityListStargazersForRepoRequestOptions]
  var `GET /repos/:owner/:repo/stats/code_frequency`: js.Tuple2[ReposGetCodeFrequencyStatsEndpoint, ReposGetCodeFrequencyStatsRequestOptions]
  var `GET /repos/:owner/:repo/stats/commit_activity`: js.Tuple2[ReposGetCommitActivityStatsEndpoint, ReposGetCommitActivityStatsRequestOptions]
  var `GET /repos/:owner/:repo/stats/contributors`: js.Tuple2[ReposGetContributorsStatsEndpoint, ReposGetContributorsStatsRequestOptions]
  var `GET /repos/:owner/:repo/stats/participation`: js.Tuple2[ReposGetParticipationStatsEndpoint, ReposGetParticipationStatsRequestOptions]
  var `GET /repos/:owner/:repo/stats/punch_card`: js.Tuple2[ReposGetPunchCardStatsEndpoint, ReposGetPunchCardStatsRequestOptions]
  var `GET /repos/:owner/:repo/subscribers`: js.Tuple2[ActivityListWatchersForRepoEndpoint, ActivityListWatchersForRepoRequestOptions]
  var `GET /repos/:owner/:repo/subscription`: js.Tuple2[ActivityGetRepoSubscriptionEndpoint, ActivityGetRepoSubscriptionRequestOptions]
  var `GET /repos/:owner/:repo/tags`: js.Tuple2[ReposListTagsEndpoint, ReposListTagsRequestOptions]
  var `GET /repos/:owner/:repo/teams`: js.Tuple2[ReposListTeamsEndpoint, ReposListTeamsRequestOptions]
  var `GET /repos/:owner/:repo/topics`: js.Tuple2[ReposListTopicsEndpoint, ReposListTopicsRequestOptions]
  var `GET /repos/:owner/:repo/traffic/clones`: js.Tuple2[ReposGetClonesEndpoint, ReposGetClonesRequestOptions]
  var `GET /repos/:owner/:repo/traffic/popular/paths`: js.Tuple2[ReposGetTopPathsEndpoint, ReposGetTopPathsRequestOptions]
  var `GET /repos/:owner/:repo/traffic/popular/referrers`: js.Tuple2[ReposGetTopReferrersEndpoint, ReposGetTopReferrersRequestOptions]
  var `GET /repos/:owner/:repo/traffic/views`: js.Tuple2[ReposGetViewsEndpoint, ReposGetViewsRequestOptions]
  var `GET /repos/:owner/:repo/vulnerability-alerts`: js.Tuple2[ReposCheckVulnerabilityAlertsEndpoint, ReposCheckVulnerabilityAlertsRequestOptions]
  var `GET /repositories`: js.Tuple2[ReposListPublicEndpoint, ReposListPublicRequestOptions]
  var `GET /scim/v2/organizations/:org/Users`: js.Tuple2[ScimListProvisionedIdentitiesEndpoint, ScimListProvisionedIdentitiesRequestOptions]
  var `GET /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[
    ScimGetProvisioningDetailsForUserEndpoint, 
    ScimGetProvisioningDetailsForUserRequestOptions
  ]
  var `GET /search/code`: js.Tuple2[SearchCodeEndpoint, SearchCodeRequestOptions]
  var `GET /search/commits`: js.Tuple2[SearchCommitsEndpoint, SearchCommitsRequestOptions]
  var `GET /search/issues`: js.Tuple2[
    SearchIssuesAndPullRequestsEndpoint | SearchIssuesEndpoint, 
    SearchIssuesAndPullRequestsRequestOptions | SearchIssuesRequestOptions
  ]
  var `GET /search/labels`: js.Tuple2[SearchLabelsEndpoint, SearchLabelsRequestOptions]
  var `GET /search/repositories`: js.Tuple2[SearchReposEndpoint, SearchReposRequestOptions]
  var `GET /search/topics`: js.Tuple2[SearchTopicsEndpoint, SearchTopicsRequestOptions]
  var `GET /search/users`: js.Tuple2[SearchUsersEndpoint, SearchUsersRequestOptions]
  var `GET /teams/:team_id`: js.Tuple2[TeamsGetEndpoint, TeamsGetRequestOptions]
  var `GET /teams/:team_id/discussions`: js.Tuple2[TeamsListDiscussionsEndpoint, TeamsListDiscussionsRequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsGetDiscussionEndpoint, TeamsGetDiscussionRequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number/comments`: js.Tuple2[TeamsListDiscussionCommentsEndpoint, TeamsListDiscussionCommentsRequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsGetDiscussionCommentEndpoint, TeamsGetDiscussionCommentRequestOptions]
  var `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`: js.Tuple2[
    ReactionsListForTeamDiscussionCommentEndpoint, 
    ReactionsListForTeamDiscussionCommentRequestOptions
  ]
  var `GET /teams/:team_id/discussions/:discussion_number/reactions`: js.Tuple2[
    ReactionsListForTeamDiscussionEndpoint, 
    ReactionsListForTeamDiscussionRequestOptions
  ]
  var `GET /teams/:team_id/invitations`: js.Tuple2[TeamsListPendingInvitationsEndpoint, TeamsListPendingInvitationsRequestOptions]
  var `GET /teams/:team_id/members`: js.Tuple2[TeamsListMembersEndpoint, TeamsListMembersRequestOptions]
  var `GET /teams/:team_id/members/:username`: js.Tuple2[TeamsGetMemberEndpoint, TeamsGetMemberRequestOptions]
  var `GET /teams/:team_id/memberships/:username`: js.Tuple2[TeamsGetMembershipEndpoint, TeamsGetMembershipRequestOptions]
  var `GET /teams/:team_id/projects`: js.Tuple2[TeamsListProjectsEndpoint, TeamsListProjectsRequestOptions]
  var `GET /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsReviewProjectEndpoint, TeamsReviewProjectRequestOptions]
  var `GET /teams/:team_id/repos`: js.Tuple2[TeamsListReposEndpoint, TeamsListReposRequestOptions]
  var `GET /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsCheckManagesRepoEndpoint, TeamsCheckManagesRepoRequestOptions]
  var `GET /teams/:team_id/team-sync/group-mappings`: js.Tuple2[TeamsListIdPGroupsEndpoint, TeamsListIdPGroupsRequestOptions]
  var `GET /teams/:team_id/teams`: js.Tuple2[TeamsListChildEndpoint, TeamsListChildRequestOptions]
  var `GET /user`: js.Tuple2[UsersGetAuthenticatedEndpoint, UsersGetAuthenticatedRequestOptions]
  var `GET /user/blocks`: js.Tuple2[UsersListBlockedEndpoint, UsersListBlockedRequestOptions]
  var `GET /user/blocks/:username`: js.Tuple2[UsersCheckBlockedEndpoint, UsersCheckBlockedRequestOptions]
  var `GET /user/emails`: js.Tuple2[UsersListEmailsEndpoint, UsersListEmailsRequestOptions]
  var `GET /user/followers`: js.Tuple2[
    UsersListFollowersForAuthenticatedUserEndpoint, 
    UsersListFollowersForAuthenticatedUserRequestOptions
  ]
  var `GET /user/following`: js.Tuple2[
    UsersListFollowingForAuthenticatedUserEndpoint, 
    UsersListFollowingForAuthenticatedUserRequestOptions
  ]
  var `GET /user/following/:username`: js.Tuple2[UsersCheckFollowingEndpoint, UsersCheckFollowingRequestOptions]
  var `GET /user/gpg_keys`: js.Tuple2[UsersListGpgKeysEndpoint, UsersListGpgKeysRequestOptions]
  var `GET /user/gpg_keys/:gpg_key_id`: js.Tuple2[UsersGetGpgKeyEndpoint, UsersGetGpgKeyRequestOptions]
  var `GET /user/installations`: js.Tuple2[
    AppsListInstallationsForAuthenticatedUserEndpoint, 
    AppsListInstallationsForAuthenticatedUserRequestOptions
  ]
  var `GET /user/installations/:installation_id/repositories`: js.Tuple2[
    AppsListInstallationReposForAuthenticatedUserEndpoint, 
    AppsListInstallationReposForAuthenticatedUserRequestOptions
  ]
  var `GET /user/issues`: js.Tuple2[
    IssuesListForAuthenticatedUserEndpoint, 
    IssuesListForAuthenticatedUserRequestOptions
  ]
  var `GET /user/keys`: js.Tuple2[UsersListPublicKeysEndpoint, UsersListPublicKeysRequestOptions]
  var `GET /user/keys/:key_id`: js.Tuple2[UsersGetPublicKeyEndpoint, UsersGetPublicKeyRequestOptions]
  var `GET /user/marketplace_purchases`: js.Tuple2[
    AppsListMarketplacePurchasesForAuthenticatedUserEndpoint, 
    AppsListMarketplacePurchasesForAuthenticatedUserRequestOptions
  ]
  var `GET /user/marketplace_purchases/stubbed`: js.Tuple2[
    AppsListMarketplacePurchasesForAuthenticatedUserStubbedEndpoint, 
    AppsListMarketplacePurchasesForAuthenticatedUserStubbedRequestOptions
  ]
  var `GET /user/memberships/orgs`: js.Tuple2[OrgsListMembershipsEndpoint, OrgsListMembershipsRequestOptions]
  var `GET /user/memberships/orgs/:org`: js.Tuple2[
    OrgsGetMembershipForAuthenticatedUserEndpoint, 
    OrgsGetMembershipForAuthenticatedUserRequestOptions
  ]
  var `GET /user/migrations`: js.Tuple2[
    MigrationsListForAuthenticatedUserEndpoint, 
    MigrationsListForAuthenticatedUserRequestOptions
  ]
  var `GET /user/migrations/:migration_id`: js.Tuple2[
    MigrationsGetStatusForAuthenticatedUserEndpoint, 
    MigrationsGetStatusForAuthenticatedUserRequestOptions
  ]
  var `GET /user/migrations/:migration_id/archive`: js.Tuple2[
    MigrationsGetArchiveForAuthenticatedUserEndpoint, 
    MigrationsGetArchiveForAuthenticatedUserRequestOptions
  ]
  var `GET /user/orgs`: js.Tuple2[OrgsListForAuthenticatedUserEndpoint, OrgsListForAuthenticatedUserRequestOptions]
  var `GET /user/public_emails`: js.Tuple2[UsersListPublicEmailsEndpoint, UsersListPublicEmailsRequestOptions]
  var `GET /user/repos`: js.Tuple2[ReposListEndpoint, ReposListRequestOptions]
  var `GET /user/repository_invitations`: js.Tuple2[
    ReposListInvitationsForAuthenticatedUserEndpoint, 
    ReposListInvitationsForAuthenticatedUserRequestOptions
  ]
  var `GET /user/starred`: js.Tuple2[
    ActivityListReposStarredByAuthenticatedUserEndpoint, 
    ActivityListReposStarredByAuthenticatedUserRequestOptions
  ]
  var `GET /user/starred/:owner/:repo`: js.Tuple2[ActivityCheckStarringRepoEndpoint, ActivityCheckStarringRepoRequestOptions]
  var `GET /user/subscriptions`: js.Tuple2[
    ActivityListWatchedReposForAuthenticatedUserEndpoint, 
    ActivityListWatchedReposForAuthenticatedUserRequestOptions
  ]
  var `GET /user/subscriptions/:owner/:repo`: js.Tuple2[
    ActivityCheckWatchingRepoLegacyEndpoint, 
    ActivityCheckWatchingRepoLegacyRequestOptions
  ]
  var `GET /user/teams`: js.Tuple2[TeamsListForAuthenticatedUserEndpoint, TeamsListForAuthenticatedUserRequestOptions]
  var `GET /users`: js.Tuple2[UsersListEndpoint, UsersListRequestOptions]
  var `GET /users/:username`: js.Tuple2[UsersGetByUsernameEndpoint, UsersGetByUsernameRequestOptions]
  var `GET /users/:username/events`: js.Tuple2[ActivityListEventsForUserEndpoint, ActivityListEventsForUserRequestOptions]
  var `GET /users/:username/events/orgs/:org`: js.Tuple2[ActivityListEventsForOrgEndpoint, ActivityListEventsForOrgRequestOptions]
  var `GET /users/:username/events/public`: js.Tuple2[
    ActivityListPublicEventsForUserEndpoint, 
    ActivityListPublicEventsForUserRequestOptions
  ]
  var `GET /users/:username/followers`: js.Tuple2[UsersListFollowersForUserEndpoint, UsersListFollowersForUserRequestOptions]
  var `GET /users/:username/following`: js.Tuple2[UsersListFollowingForUserEndpoint, UsersListFollowingForUserRequestOptions]
  var `GET /users/:username/following/:target_user`: js.Tuple2[UsersCheckFollowingForUserEndpoint, UsersCheckFollowingForUserRequestOptions]
  var `GET /users/:username/gists`: js.Tuple2[GistsListPublicForUserEndpoint, GistsListPublicForUserRequestOptions]
  var `GET /users/:username/gpg_keys`: js.Tuple2[UsersListGpgKeysForUserEndpoint, UsersListGpgKeysForUserRequestOptions]
  var `GET /users/:username/hovercard`: js.Tuple2[UsersGetContextForUserEndpoint, UsersGetContextForUserRequestOptions]
  var `GET /users/:username/installation`: js.Tuple2[
    AppsGetUserInstallationEndpoint | AppsFindUserInstallationEndpoint, 
    AppsGetUserInstallationRequestOptions | AppsFindUserInstallationRequestOptions
  ]
  var `GET /users/:username/keys`: js.Tuple2[UsersListPublicKeysForUserEndpoint, UsersListPublicKeysForUserRequestOptions]
  var `GET /users/:username/orgs`: js.Tuple2[OrgsListForUserEndpoint, OrgsListForUserRequestOptions]
  var `GET /users/:username/projects`: js.Tuple2[ProjectsListForUserEndpoint, ProjectsListForUserRequestOptions]
  var `GET /users/:username/received_events`: js.Tuple2[
    ActivityListReceivedEventsForUserEndpoint, 
    ActivityListReceivedEventsForUserRequestOptions
  ]
  var `GET /users/:username/received_events/public`: js.Tuple2[
    ActivityListReceivedPublicEventsForUserEndpoint, 
    ActivityListReceivedPublicEventsForUserRequestOptions
  ]
  var `GET /users/:username/repos`: js.Tuple2[ReposListForUserEndpoint, ReposListForUserRequestOptions]
  var `GET /users/:username/starred`: js.Tuple2[
    ActivityListReposStarredByUserEndpoint, 
    ActivityListReposStarredByUserRequestOptions
  ]
  var `GET /users/:username/subscriptions`: js.Tuple2[
    ActivityListReposWatchedByUserEndpoint, 
    ActivityListReposWatchedByUserRequestOptions
  ]
  var `PATCH /authorizations/:authorization_id`: js.Tuple2[
    OauthAuthorizationsUpdateAuthorizationEndpoint, 
    OauthAuthorizationsUpdateAuthorizationRequestOptions
  ]
  var `PATCH /gists/:gist_id`: js.Tuple2[GistsUpdateEndpoint, GistsUpdateRequestOptions]
  var `PATCH /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsUpdateCommentEndpoint, GistsUpdateCommentRequestOptions]
  var `PATCH /notifications/threads/:thread_id`: js.Tuple2[ActivityMarkThreadAsReadEndpoint, ActivityMarkThreadAsReadRequestOptions]
  var `PATCH /orgs/:org`: js.Tuple2[OrgsUpdateEndpoint, OrgsUpdateRequestOptions]
  var `PATCH /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsUpdateHookEndpoint, OrgsUpdateHookRequestOptions]
  var `PATCH /projects/:project_id`: js.Tuple2[ProjectsUpdateEndpoint, ProjectsUpdateRequestOptions]
  var `PATCH /projects/columns/:column_id`: js.Tuple2[ProjectsUpdateColumnEndpoint, ProjectsUpdateColumnRequestOptions]
  var `PATCH /projects/columns/cards/:card_id`: js.Tuple2[ProjectsUpdateCardEndpoint, ProjectsUpdateCardRequestOptions]
  var `PATCH /repos/:owner/:repo`: js.Tuple2[ReposUpdateEndpoint, ReposUpdateRequestOptions]
  var `PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
    ReposUpdateProtectedBranchPullRequestReviewEnforcementEndpoint, 
    ReposUpdateProtectedBranchPullRequestReviewEnforcementRequestOptions
  ]
  var `PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
    ReposUpdateProtectedBranchRequiredStatusChecksEndpoint, 
    ReposUpdateProtectedBranchRequiredStatusChecksRequestOptions
  ]
  var `PATCH /repos/:owner/:repo/check-runs/:check_run_id`: js.Tuple2[ChecksUpdateEndpoint, ChecksUpdateRequestOptions]
  var `PATCH /repos/:owner/:repo/check-suites/preferences`: js.Tuple2[ChecksSetSuitesPreferencesEndpoint, ChecksSetSuitesPreferencesRequestOptions]
  var `PATCH /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposUpdateCommitCommentEndpoint, ReposUpdateCommitCommentRequestOptions]
  var `PATCH /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitUpdateRefEndpoint, GitUpdateRefRequestOptions]
  var `PATCH /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposUpdateHookEndpoint, ReposUpdateHookRequestOptions]
  var `PATCH /repos/:owner/:repo/import`: js.Tuple2[MigrationsUpdateImportEndpoint, MigrationsUpdateImportRequestOptions]
  var `PATCH /repos/:owner/:repo/import/authors/:author_id`: js.Tuple2[MigrationsMapCommitAuthorEndpoint, MigrationsMapCommitAuthorRequestOptions]
  var `PATCH /repos/:owner/:repo/import/lfs`: js.Tuple2[MigrationsSetLfsPreferenceEndpoint, MigrationsSetLfsPreferenceRequestOptions]
  var `PATCH /repos/:owner/:repo/invitations/:invitation_id`: js.Tuple2[ReposUpdateInvitationEndpoint, ReposUpdateInvitationRequestOptions]
  var `PATCH /repos/:owner/:repo/issues/:issue_number`: js.Tuple2[IssuesUpdateEndpoint, IssuesUpdateRequestOptions]
  var `PATCH /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesUpdateCommentEndpoint, IssuesUpdateCommentRequestOptions]
  var `PATCH /repos/:owner/:repo/labels/:current_name`: js.Tuple2[IssuesUpdateLabelEndpoint, IssuesUpdateLabelRequestOptions]
  var `PATCH /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesUpdateMilestoneEndpoint, IssuesUpdateMilestoneRequestOptions]
  var `PATCH /repos/:owner/:repo/pulls/:pull_number`: js.Tuple2[PullsUpdateEndpoint, PullsUpdateRequestOptions]
  var `PATCH /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsUpdateCommentEndpoint, PullsUpdateCommentRequestOptions]
  var `PATCH /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposUpdateReleaseEndpoint, ReposUpdateReleaseRequestOptions]
  var `PATCH /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposUpdateReleaseAssetEndpoint, ReposUpdateReleaseAssetRequestOptions]
  var `PATCH /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[ScimUpdateUserAttributeEndpoint, ScimUpdateUserAttributeRequestOptions]
  var `PATCH /teams/:team_id`: js.Tuple2[TeamsUpdateEndpoint, TeamsUpdateRequestOptions]
  var `PATCH /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsUpdateDiscussionEndpoint, TeamsUpdateDiscussionRequestOptions]
  var `PATCH /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsUpdateDiscussionCommentEndpoint, TeamsUpdateDiscussionCommentRequestOptions]
  var `PATCH /teams/:team_id/team-sync/group-mappings`: js.Tuple2[
    TeamsCreateOrUpdateIdPGroupConnectionsEndpoint, 
    TeamsCreateOrUpdateIdPGroupConnectionsRequestOptions
  ]
  var `PATCH /user`: js.Tuple2[UsersUpdateAuthenticatedEndpoint, UsersUpdateAuthenticatedRequestOptions]
  var `PATCH /user/email/visibility`: js.Tuple2[
    UsersTogglePrimaryEmailVisibilityEndpoint, 
    UsersTogglePrimaryEmailVisibilityRequestOptions
  ]
  var `PATCH /user/memberships/orgs/:org`: js.Tuple2[OrgsUpdateMembershipEndpoint, OrgsUpdateMembershipRequestOptions]
  var `PATCH /user/repository_invitations/:invitation_id`: js.Tuple2[ReposAcceptInvitationEndpoint, ReposAcceptInvitationRequestOptions]
  var `POST /app-manifests/:code/conversions`: js.Tuple2[AppsCreateFromManifestEndpoint, AppsCreateFromManifestRequestOptions]
  var `POST /app/installations/:installation_id/access_tokens`: js.Tuple2[AppsCreateInstallationTokenEndpoint, AppsCreateInstallationTokenRequestOptions]
  var `POST /applications/:client_id/tokens/:access_token`: js.Tuple2[
    OauthAuthorizationsResetAuthorizationEndpoint, 
    OauthAuthorizationsResetAuthorizationRequestOptions
  ]
  var `POST /authorizations`: js.Tuple2[
    OauthAuthorizationsCreateAuthorizationEndpoint, 
    OauthAuthorizationsCreateAuthorizationRequestOptions
  ]
  var `POST /content_references/:content_reference_id/attachments`: js.Tuple2[AppsCreateContentAttachmentEndpoint, AppsCreateContentAttachmentRequestOptions]
  var `POST /gists`: js.Tuple2[GistsCreateEndpoint, GistsCreateRequestOptions]
  var `POST /gists/:gist_id/comments`: js.Tuple2[GistsCreateCommentEndpoint, GistsCreateCommentRequestOptions]
  var `POST /gists/:gist_id/forks`: js.Tuple2[GistsForkEndpoint, GistsForkRequestOptions]
  var `POST /markdown`: js.Tuple2[MarkdownRenderEndpoint, MarkdownRenderRequestOptions]
  var `POST /markdown/raw`: js.Tuple2[MarkdownRenderRawEndpoint, MarkdownRenderRawRequestOptions]
  var `POST /orgs/:org/hooks`: js.Tuple2[OrgsCreateHookEndpoint, OrgsCreateHookRequestOptions]
  var `POST /orgs/:org/hooks/:hook_id/pings`: js.Tuple2[OrgsPingHookEndpoint, OrgsPingHookRequestOptions]
  var `POST /orgs/:org/invitations`: js.Tuple2[OrgsCreateInvitationEndpoint, OrgsCreateInvitationRequestOptions]
  var `POST /orgs/:org/migrations`: js.Tuple2[MigrationsStartForOrgEndpoint, MigrationsStartForOrgRequestOptions]
  var `POST /orgs/:org/projects`: js.Tuple2[ProjectsCreateForOrgEndpoint, ProjectsCreateForOrgRequestOptions]
  var `POST /orgs/:org/repos`: js.Tuple2[ReposCreateInOrgEndpoint, ReposCreateInOrgRequestOptions]
  var `POST /orgs/:org/teams`: js.Tuple2[TeamsCreateEndpoint, TeamsCreateRequestOptions]
  var `POST /projects/:project_id/columns`: js.Tuple2[ProjectsCreateColumnEndpoint, ProjectsCreateColumnRequestOptions]
  var `POST /projects/columns/:column_id/cards`: js.Tuple2[ProjectsCreateCardEndpoint, ProjectsCreateCardRequestOptions]
  var `POST /projects/columns/:column_id/moves`: js.Tuple2[ProjectsMoveColumnEndpoint, ProjectsMoveColumnRequestOptions]
  var `POST /projects/columns/cards/:card_id/moves`: js.Tuple2[ProjectsMoveCardEndpoint, ProjectsMoveCardRequestOptions]
  var `POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
    ReposAddProtectedBranchAdminEnforcementEndpoint, 
    ReposAddProtectedBranchAdminEnforcementRequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
    ReposAddProtectedBranchRequiredSignaturesEndpoint, 
    ReposAddProtectedBranchRequiredSignaturesRequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposAddProtectedBranchRequiredStatusChecksContextsEndpoint, 
    ReposAddProtectedBranchRequiredStatusChecksContextsRequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposAddProtectedBranchTeamRestrictionsEndpoint, 
    ReposAddProtectedBranchTeamRestrictionsRequestOptions
  ]
  var `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposAddProtectedBranchUserRestrictionsEndpoint, 
    ReposAddProtectedBranchUserRestrictionsRequestOptions
  ]
  var `POST /repos/:owner/:repo/check-runs`: js.Tuple2[ChecksCreateEndpoint, ChecksCreateRequestOptions]
  var `POST /repos/:owner/:repo/check-suites`: js.Tuple2[ChecksCreateSuiteEndpoint, ChecksCreateSuiteRequestOptions]
  var `POST /repos/:owner/:repo/check-suites/:check_suite_id/rerequest`: js.Tuple2[ChecksRerequestSuiteEndpoint, ChecksRerequestSuiteRequestOptions]
  var `POST /repos/:owner/:repo/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsCreateForCommitCommentEndpoint, 
    ReactionsCreateForCommitCommentRequestOptions
  ]
  var `POST /repos/:owner/:repo/commits/:commit_sha/comments`: js.Tuple2[ReposCreateCommitCommentEndpoint, ReposCreateCommitCommentRequestOptions]
  var `POST /repos/:owner/:repo/deployments`: js.Tuple2[ReposCreateDeploymentEndpoint, ReposCreateDeploymentRequestOptions]
  var `POST /repos/:owner/:repo/deployments/:deployment_id/statuses`: js.Tuple2[ReposCreateDeploymentStatusEndpoint, ReposCreateDeploymentStatusRequestOptions]
  var `POST /repos/:owner/:repo/forks`: js.Tuple2[ReposCreateForkEndpoint, ReposCreateForkRequestOptions]
  var `POST /repos/:owner/:repo/git/blobs`: js.Tuple2[GitCreateBlobEndpoint, GitCreateBlobRequestOptions]
  var `POST /repos/:owner/:repo/git/commits`: js.Tuple2[GitCreateCommitEndpoint, GitCreateCommitRequestOptions]
  var `POST /repos/:owner/:repo/git/refs`: js.Tuple2[GitCreateRefEndpoint, GitCreateRefRequestOptions]
  var `POST /repos/:owner/:repo/git/tags`: js.Tuple2[GitCreateTagEndpoint, GitCreateTagRequestOptions]
  var `POST /repos/:owner/:repo/git/trees`: js.Tuple2[GitCreateTreeEndpoint, GitCreateTreeRequestOptions]
  var `POST /repos/:owner/:repo/hooks`: js.Tuple2[ReposCreateHookEndpoint, ReposCreateHookRequestOptions]
  var `POST /repos/:owner/:repo/hooks/:hook_id/pings`: js.Tuple2[ReposPingHookEndpoint, ReposPingHookRequestOptions]
  var `POST /repos/:owner/:repo/hooks/:hook_id/tests`: js.Tuple2[ReposTestPushHookEndpoint, ReposTestPushHookRequestOptions]
  var `POST /repos/:owner/:repo/issues`: js.Tuple2[IssuesCreateEndpoint, IssuesCreateRequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/assignees`: js.Tuple2[IssuesAddAssigneesEndpoint, IssuesAddAssigneesRequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/comments`: js.Tuple2[IssuesCreateCommentEndpoint, IssuesCreateCommentRequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesAddLabelsEndpoint, IssuesAddLabelsRequestOptions]
  var `POST /repos/:owner/:repo/issues/:issue_number/reactions`: js.Tuple2[ReactionsCreateForIssueEndpoint, ReactionsCreateForIssueRequestOptions]
  var `POST /repos/:owner/:repo/issues/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsCreateForIssueCommentEndpoint, 
    ReactionsCreateForIssueCommentRequestOptions
  ]
  var `POST /repos/:owner/:repo/keys`: js.Tuple2[ReposAddDeployKeyEndpoint, ReposAddDeployKeyRequestOptions]
  var `POST /repos/:owner/:repo/labels`: js.Tuple2[IssuesCreateLabelEndpoint, IssuesCreateLabelRequestOptions]
  var `POST /repos/:owner/:repo/merges`: js.Tuple2[ReposMergeEndpoint, ReposMergeRequestOptions]
  var `POST /repos/:owner/:repo/milestones`: js.Tuple2[IssuesCreateMilestoneEndpoint, IssuesCreateMilestoneRequestOptions]
  var `POST /repos/:owner/:repo/pages`: js.Tuple2[ReposEnablePagesSiteEndpoint, ReposEnablePagesSiteRequestOptions]
  var `POST /repos/:owner/:repo/pages/builds`: js.Tuple2[ReposRequestPageBuildEndpoint, ReposRequestPageBuildRequestOptions]
  var `POST /repos/:owner/:repo/projects`: js.Tuple2[ProjectsCreateForRepoEndpoint, ProjectsCreateForRepoRequestOptions]
  var `POST /repos/:owner/:repo/pulls`: js.Tuple2[
    PullsCreateEndpoint | PullsCreateFromIssueEndpoint, 
    PullsCreateRequestOptions | PullsCreateFromIssueRequestOptions
  ]
  var `POST /repos/:owner/:repo/pulls/:pull_number/comments`: js.Tuple2[
    PullsCreateCommentEndpoint | PullsCreateCommentReplyEndpoint, 
    PullsCreateCommentRequestOptions | PullsCreateCommentReplyRequestOptions
  ]
  var `POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsCreateReviewRequestEndpoint, PullsCreateReviewRequestRequestOptions]
  var `POST /repos/:owner/:repo/pulls/:pull_number/reviews`: js.Tuple2[PullsCreateReviewEndpoint, PullsCreateReviewRequestOptions]
  var `POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events`: js.Tuple2[PullsSubmitReviewEndpoint, PullsSubmitReviewRequestOptions]
  var `POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions`: js.Tuple2[
    ReactionsCreateForPullRequestReviewCommentEndpoint, 
    ReactionsCreateForPullRequestReviewCommentRequestOptions
  ]
  var `POST /repos/:owner/:repo/releases`: js.Tuple2[ReposCreateReleaseEndpoint, ReposCreateReleaseRequestOptions]
  var `POST /repos/:owner/:repo/statuses/:sha`: js.Tuple2[ReposCreateStatusEndpoint, ReposCreateStatusRequestOptions]
  var `POST /repos/:owner/:repo/transfer`: js.Tuple2[ReposTransferEndpoint, ReposTransferRequestOptions]
  var `POST /repos/:template_owner/:template_repo/generate`: js.Tuple2[ReposCreateUsingTemplateEndpoint, ReposCreateUsingTemplateRequestOptions]
  var `POST /scim/v2/organizations/:org/Users`: js.Tuple2[
    ScimProvisionAndInviteUsersEndpoint | ScimProvisionInviteUsersEndpoint, 
    ScimProvisionAndInviteUsersRequestOptions | ScimProvisionInviteUsersRequestOptions
  ]
  var `POST /teams/:team_id/discussions`: js.Tuple2[TeamsCreateDiscussionEndpoint, TeamsCreateDiscussionRequestOptions]
  var `POST /teams/:team_id/discussions/:discussion_number/comments`: js.Tuple2[TeamsCreateDiscussionCommentEndpoint, TeamsCreateDiscussionCommentRequestOptions]
  var `POST /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`: js.Tuple2[
    ReactionsCreateForTeamDiscussionCommentEndpoint, 
    ReactionsCreateForTeamDiscussionCommentRequestOptions
  ]
  var `POST /teams/:team_id/discussions/:discussion_number/reactions`: js.Tuple2[
    ReactionsCreateForTeamDiscussionEndpoint, 
    ReactionsCreateForTeamDiscussionRequestOptions
  ]
  var `POST /user/emails`: js.Tuple2[UsersAddEmailsEndpoint, UsersAddEmailsRequestOptions]
  var `POST /user/gpg_keys`: js.Tuple2[UsersCreateGpgKeyEndpoint, UsersCreateGpgKeyRequestOptions]
  var `POST /user/keys`: js.Tuple2[UsersCreatePublicKeyEndpoint, UsersCreatePublicKeyRequestOptions]
  var `POST /user/migrations`: js.Tuple2[
    MigrationsStartForAuthenticatedUserEndpoint, 
    MigrationsStartForAuthenticatedUserRequestOptions
  ]
  var `POST /user/projects`: js.Tuple2[
    ProjectsCreateForAuthenticatedUserEndpoint, 
    ProjectsCreateForAuthenticatedUserRequestOptions
  ]
  var `POST /user/repos`: js.Tuple2[
    ReposCreateForAuthenticatedUserEndpoint, 
    ReposCreateForAuthenticatedUserRequestOptions
  ]
  var `POST :url`: js.Tuple2[ReposUploadReleaseAssetEndpoint, ReposUploadReleaseAssetRequestOptions]
  var `PUT /authorizations/clients/:client_id`: js.Tuple2[
    OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint, 
    OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions
  ]
  var `PUT /authorizations/clients/:client_id/:fingerprint`: js.Tuple2[
    OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint | OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintEndpoint, 
    OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions | OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintRequestOptions
  ]
  var `PUT /gists/:gist_id/star`: js.Tuple2[GistsStarEndpoint, GistsStarRequestOptions]
  var `PUT /notifications`: js.Tuple2[ActivityMarkAsReadEndpoint, ActivityMarkAsReadRequestOptions]
  var `PUT /notifications/threads/:thread_id/subscription`: js.Tuple2[ActivitySetThreadSubscriptionEndpoint, ActivitySetThreadSubscriptionRequestOptions]
  var `PUT /orgs/:org/blocks/:username`: js.Tuple2[OrgsBlockUserEndpoint, OrgsBlockUserRequestOptions]
  var `PUT /orgs/:org/interaction-limits`: js.Tuple2[
    InteractionsAddOrUpdateRestrictionsForOrgEndpoint, 
    InteractionsAddOrUpdateRestrictionsForOrgRequestOptions
  ]
  var `PUT /orgs/:org/memberships/:username`: js.Tuple2[OrgsAddOrUpdateMembershipEndpoint, OrgsAddOrUpdateMembershipRequestOptions]
  var `PUT /orgs/:org/outside_collaborators/:username`: js.Tuple2[
    OrgsConvertMemberToOutsideCollaboratorEndpoint, 
    OrgsConvertMemberToOutsideCollaboratorRequestOptions
  ]
  var `PUT /orgs/:org/public_members/:username`: js.Tuple2[OrgsPublicizeMembershipEndpoint, OrgsPublicizeMembershipRequestOptions]
  var `PUT /projects/:project_id/collaborators/:username`: js.Tuple2[ProjectsAddCollaboratorEndpoint, ProjectsAddCollaboratorRequestOptions]
  var `PUT /repos/:owner/:repo/automated-security-fixes`: js.Tuple2[
    ReposEnableAutomatedSecurityFixesEndpoint, 
    ReposEnableAutomatedSecurityFixesRequestOptions
  ]
  var `PUT /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposUpdateBranchProtectionEndpoint, ReposUpdateBranchProtectionRequestOptions]
  var `PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
    ReposReplaceProtectedBranchRequiredStatusChecksContextsEndpoint, 
    ReposReplaceProtectedBranchRequiredStatusChecksContextsRequestOptions
  ]
  var `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
    ReposReplaceProtectedBranchTeamRestrictionsEndpoint, 
    ReposReplaceProtectedBranchTeamRestrictionsRequestOptions
  ]
  var `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
    ReposReplaceProtectedBranchUserRestrictionsEndpoint, 
    ReposReplaceProtectedBranchUserRestrictionsRequestOptions
  ]
  var `PUT /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposAddCollaboratorEndpoint, ReposAddCollaboratorRequestOptions]
  var `PUT /repos/:owner/:repo/contents/:path`: js.Tuple2[
    ReposCreateOrUpdateFileEndpoint | ReposCreateFileEndpoint | ReposUpdateFileEndpoint, 
    ReposCreateOrUpdateFileRequestOptions | ReposCreateFileRequestOptions | ReposUpdateFileRequestOptions
  ]
  var `PUT /repos/:owner/:repo/import`: js.Tuple2[MigrationsStartImportEndpoint, MigrationsStartImportRequestOptions]
  var `PUT /repos/:owner/:repo/interaction-limits`: js.Tuple2[
    InteractionsAddOrUpdateRestrictionsForRepoEndpoint, 
    InteractionsAddOrUpdateRestrictionsForRepoRequestOptions
  ]
  var `PUT /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesReplaceLabelsEndpoint, IssuesReplaceLabelsRequestOptions]
  var `PUT /repos/:owner/:repo/issues/:issue_number/lock`: js.Tuple2[IssuesLockEndpoint, IssuesLockRequestOptions]
  var `PUT /repos/:owner/:repo/notifications`: js.Tuple2[
    ActivityMarkNotificationsAsReadForRepoEndpoint, 
    ActivityMarkNotificationsAsReadForRepoRequestOptions
  ]
  var `PUT /repos/:owner/:repo/pages`: js.Tuple2[
    ReposUpdateInformationAboutPagesSiteEndpoint, 
    ReposUpdateInformationAboutPagesSiteRequestOptions
  ]
  var `PUT /repos/:owner/:repo/pulls/:pull_number/merge`: js.Tuple2[PullsMergeEndpoint, PullsMergeRequestOptions]
  var `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsUpdateReviewEndpoint, PullsUpdateReviewRequestOptions]
  var `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals`: js.Tuple2[PullsDismissReviewEndpoint, PullsDismissReviewRequestOptions]
  var `PUT /repos/:owner/:repo/pulls/:pull_number/update-branch`: js.Tuple2[PullsUpdateBranchEndpoint, PullsUpdateBranchRequestOptions]
  var `PUT /repos/:owner/:repo/subscription`: js.Tuple2[ActivitySetRepoSubscriptionEndpoint, ActivitySetRepoSubscriptionRequestOptions]
  var `PUT /repos/:owner/:repo/topics`: js.Tuple2[ReposReplaceTopicsEndpoint, ReposReplaceTopicsRequestOptions]
  var `PUT /repos/:owner/:repo/vulnerability-alerts`: js.Tuple2[
    ReposEnableVulnerabilityAlertsEndpoint, 
    ReposEnableVulnerabilityAlertsRequestOptions
  ]
  var `PUT /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[
    ScimReplaceProvisionedUserInformationEndpoint | ScimUpdateProvisionedOrgMembershipEndpoint, 
    ScimReplaceProvisionedUserInformationRequestOptions | ScimUpdateProvisionedOrgMembershipRequestOptions
  ]
  var `PUT /teams/:team_id/members/:username`: js.Tuple2[TeamsAddMemberEndpoint, TeamsAddMemberRequestOptions]
  var `PUT /teams/:team_id/memberships/:username`: js.Tuple2[TeamsAddOrUpdateMembershipEndpoint, TeamsAddOrUpdateMembershipRequestOptions]
  var `PUT /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsAddOrUpdateProjectEndpoint, TeamsAddOrUpdateProjectRequestOptions]
  var `PUT /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsAddOrUpdateRepoEndpoint, TeamsAddOrUpdateRepoRequestOptions]
  var `PUT /user/blocks/:username`: js.Tuple2[UsersBlockEndpoint, UsersBlockRequestOptions]
  var `PUT /user/following/:username`: js.Tuple2[UsersFollowEndpoint, UsersFollowRequestOptions]
  var `PUT /user/installations/:installation_id/repositories/:repository_id`: js.Tuple2[AppsAddRepoToInstallationEndpoint, AppsAddRepoToInstallationRequestOptions]
  var `PUT /user/starred/:owner/:repo`: js.Tuple2[ActivityStarRepoEndpoint, ActivityStarRepoRequestOptions]
  var `PUT /user/subscriptions/:owner/:repo`: js.Tuple2[ActivityWatchRepoLegacyEndpoint, ActivityWatchRepoLegacyRequestOptions]
}

object Routes {
  @scala.inline
  def apply(
    `DELETE /app/installations/:installation_id`: js.Tuple2[AppsDeleteInstallationEndpoint, AppsDeleteInstallationRequestOptions],
    `DELETE /applications/:client_id/grants/:access_token`: js.Tuple2[
      OauthAuthorizationsRevokeGrantForApplicationEndpoint, 
      OauthAuthorizationsRevokeGrantForApplicationRequestOptions
    ],
    `DELETE /applications/:client_id/tokens/:access_token`: js.Tuple2[
      OauthAuthorizationsRevokeAuthorizationForApplicationEndpoint, 
      OauthAuthorizationsRevokeAuthorizationForApplicationRequestOptions
    ],
    `DELETE /applications/grants/:grant_id`: js.Tuple2[
      OauthAuthorizationsDeleteGrantEndpoint, 
      OauthAuthorizationsDeleteGrantRequestOptions
    ],
    `DELETE /authorizations/:authorization_id`: js.Tuple2[
      OauthAuthorizationsDeleteAuthorizationEndpoint, 
      OauthAuthorizationsDeleteAuthorizationRequestOptions
    ],
    `DELETE /gists/:gist_id`: js.Tuple2[GistsDeleteEndpoint, GistsDeleteRequestOptions],
    `DELETE /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsDeleteCommentEndpoint, GistsDeleteCommentRequestOptions],
    `DELETE /gists/:gist_id/star`: js.Tuple2[GistsUnstarEndpoint, GistsUnstarRequestOptions],
    `DELETE /notifications/threads/:thread_id/subscription`: js.Tuple2[
      ActivityDeleteThreadSubscriptionEndpoint, 
      ActivityDeleteThreadSubscriptionRequestOptions
    ],
    `DELETE /orgs/:org/blocks/:username`: js.Tuple2[OrgsUnblockUserEndpoint, OrgsUnblockUserRequestOptions],
    `DELETE /orgs/:org/credential-authorizations/:credential_id`: js.Tuple2[
      OrgsRemoveCredentialAuthorizationEndpoint, 
      OrgsRemoveCredentialAuthorizationRequestOptions
    ],
    `DELETE /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsDeleteHookEndpoint, OrgsDeleteHookRequestOptions],
    `DELETE /orgs/:org/interaction-limits`: js.Tuple2[
      InteractionsRemoveRestrictionsForOrgEndpoint, 
      InteractionsRemoveRestrictionsForOrgRequestOptions
    ],
    `DELETE /orgs/:org/members/:username`: js.Tuple2[OrgsRemoveMemberEndpoint, OrgsRemoveMemberRequestOptions],
    `DELETE /orgs/:org/memberships/:username`: js.Tuple2[OrgsRemoveMembershipEndpoint, OrgsRemoveMembershipRequestOptions],
    `DELETE /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[MigrationsDeleteArchiveForOrgEndpoint, MigrationsDeleteArchiveForOrgRequestOptions],
    `DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[MigrationsUnlockRepoForOrgEndpoint, MigrationsUnlockRepoForOrgRequestOptions],
    `DELETE /orgs/:org/outside_collaborators/:username`: js.Tuple2[OrgsRemoveOutsideCollaboratorEndpoint, OrgsRemoveOutsideCollaboratorRequestOptions],
    `DELETE /orgs/:org/public_members/:username`: js.Tuple2[OrgsConcealMembershipEndpoint, OrgsConcealMembershipRequestOptions],
    `DELETE /projects/:project_id`: js.Tuple2[ProjectsDeleteEndpoint, ProjectsDeleteRequestOptions],
    `DELETE /projects/:project_id/collaborators/:username`: js.Tuple2[ProjectsRemoveCollaboratorEndpoint, ProjectsRemoveCollaboratorRequestOptions],
    `DELETE /projects/columns/:column_id`: js.Tuple2[ProjectsDeleteColumnEndpoint, ProjectsDeleteColumnRequestOptions],
    `DELETE /projects/columns/cards/:card_id`: js.Tuple2[ProjectsDeleteCardEndpoint, ProjectsDeleteCardRequestOptions],
    `DELETE /reactions/:reaction_id`: js.Tuple2[ReactionsDeleteEndpoint, ReactionsDeleteRequestOptions],
    `DELETE /repos/:owner/:repo`: js.Tuple2[ReposDeleteEndpoint, ReposDeleteRequestOptions],
    `DELETE /repos/:owner/:repo/automated-security-fixes`: js.Tuple2[
      ReposDisableAutomatedSecurityFixesEndpoint, 
      ReposDisableAutomatedSecurityFixesRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposRemoveBranchProtectionEndpoint, ReposRemoveBranchProtectionRequestOptions],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
      ReposRemoveProtectedBranchAdminEnforcementEndpoint, 
      ReposRemoveProtectedBranchAdminEnforcementRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
      ReposRemoveProtectedBranchPullRequestReviewEnforcementEndpoint, 
      ReposRemoveProtectedBranchPullRequestReviewEnforcementRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
      ReposRemoveProtectedBranchRequiredSignaturesEndpoint, 
      ReposRemoveProtectedBranchRequiredSignaturesRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
      ReposRemoveProtectedBranchRequiredStatusChecksEndpoint, 
      ReposRemoveProtectedBranchRequiredStatusChecksRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
      ReposRemoveProtectedBranchRequiredStatusChecksContextsEndpoint, 
      ReposRemoveProtectedBranchRequiredStatusChecksContextsRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
      ReposRemoveProtectedBranchRestrictionsEndpoint, 
      ReposRemoveProtectedBranchRestrictionsRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
      ReposRemoveProtectedBranchTeamRestrictionsEndpoint, 
      ReposRemoveProtectedBranchTeamRestrictionsRequestOptions
    ],
    `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
      ReposRemoveProtectedBranchUserRestrictionsEndpoint, 
      ReposRemoveProtectedBranchUserRestrictionsRequestOptions
    ],
    `DELETE /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposRemoveCollaboratorEndpoint, ReposRemoveCollaboratorRequestOptions],
    `DELETE /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposDeleteCommitCommentEndpoint, ReposDeleteCommitCommentRequestOptions],
    `DELETE /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposDeleteFileEndpoint, ReposDeleteFileRequestOptions],
    `DELETE /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposDeleteDownloadEndpoint, ReposDeleteDownloadRequestOptions],
    `DELETE /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitDeleteRefEndpoint, GitDeleteRefRequestOptions],
    `DELETE /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposDeleteHookEndpoint, ReposDeleteHookRequestOptions],
    `DELETE /repos/:owner/:repo/import`: js.Tuple2[MigrationsCancelImportEndpoint, MigrationsCancelImportRequestOptions],
    `DELETE /repos/:owner/:repo/interaction-limits`: js.Tuple2[
      InteractionsRemoveRestrictionsForRepoEndpoint, 
      InteractionsRemoveRestrictionsForRepoRequestOptions
    ],
    `DELETE /repos/:owner/:repo/invitations/:invitation_id`: js.Tuple2[ReposDeleteInvitationEndpoint, ReposDeleteInvitationRequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/assignees`: js.Tuple2[IssuesRemoveAssigneesEndpoint, IssuesRemoveAssigneesRequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesRemoveLabelsEndpoint, IssuesRemoveLabelsRequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name`: js.Tuple2[IssuesRemoveLabelEndpoint, IssuesRemoveLabelRequestOptions],
    `DELETE /repos/:owner/:repo/issues/:issue_number/lock`: js.Tuple2[IssuesUnlockEndpoint, IssuesUnlockRequestOptions],
    `DELETE /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesDeleteCommentEndpoint, IssuesDeleteCommentRequestOptions],
    `DELETE /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposRemoveDeployKeyEndpoint, ReposRemoveDeployKeyRequestOptions],
    `DELETE /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesDeleteLabelEndpoint, IssuesDeleteLabelRequestOptions],
    `DELETE /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesDeleteMilestoneEndpoint, IssuesDeleteMilestoneRequestOptions],
    `DELETE /repos/:owner/:repo/pages`: js.Tuple2[ReposDisablePagesSiteEndpoint, ReposDisablePagesSiteRequestOptions],
    `DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsDeleteReviewRequestEndpoint, PullsDeleteReviewRequestRequestOptions],
    `DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: js.Tuple2[PullsDeletePendingReviewEndpoint, PullsDeletePendingReviewRequestOptions],
    `DELETE /repos/:owner/:repo/pulls/comments/:comment_id`: js.Tuple2[PullsDeleteCommentEndpoint, PullsDeleteCommentRequestOptions],
    `DELETE /repos/:owner/:repo/releases/:release_id`: js.Tuple2[ReposDeleteReleaseEndpoint, ReposDeleteReleaseRequestOptions],
    `DELETE /repos/:owner/:repo/releases/assets/:asset_id`: js.Tuple2[ReposDeleteReleaseAssetEndpoint, ReposDeleteReleaseAssetRequestOptions],
    `DELETE /repos/:owner/:repo/subscription`: js.Tuple2[
      ActivityDeleteRepoSubscriptionEndpoint, 
      ActivityDeleteRepoSubscriptionRequestOptions
    ],
    `DELETE /repos/:owner/:repo/vulnerability-alerts`: js.Tuple2[
      ReposDisableVulnerabilityAlertsEndpoint, 
      ReposDisableVulnerabilityAlertsRequestOptions
    ],
    `DELETE /scim/v2/organizations/:org/Users/:scim_user_id`: js.Tuple2[ScimRemoveUserFromOrgEndpoint, ScimRemoveUserFromOrgRequestOptions],
    `DELETE /teams/:team_id`: js.Tuple2[TeamsDeleteEndpoint, TeamsDeleteRequestOptions],
    `DELETE /teams/:team_id/discussions/:discussion_number`: js.Tuple2[TeamsDeleteDiscussionEndpoint, TeamsDeleteDiscussionRequestOptions],
    `DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: js.Tuple2[TeamsDeleteDiscussionCommentEndpoint, TeamsDeleteDiscussionCommentRequestOptions],
    `DELETE /teams/:team_id/members/:username`: js.Tuple2[TeamsRemoveMemberEndpoint, TeamsRemoveMemberRequestOptions],
    `DELETE /teams/:team_id/memberships/:username`: js.Tuple2[TeamsRemoveMembershipEndpoint, TeamsRemoveMembershipRequestOptions],
    `DELETE /teams/:team_id/projects/:project_id`: js.Tuple2[TeamsRemoveProjectEndpoint, TeamsRemoveProjectRequestOptions],
    `DELETE /teams/:team_id/repos/:owner/:repo`: js.Tuple2[TeamsRemoveRepoEndpoint, TeamsRemoveRepoRequestOptions],
    `DELETE /user/blocks/:username`: js.Tuple2[UsersUnblockEndpoint, UsersUnblockRequestOptions],
    `DELETE /user/emails`: js.Tuple2[UsersDeleteEmailsEndpoint, UsersDeleteEmailsRequestOptions],
    `DELETE /user/following/:username`: js.Tuple2[UsersUnfollowEndpoint, UsersUnfollowRequestOptions],
    `DELETE /user/gpg_keys/:gpg_key_id`: js.Tuple2[UsersDeleteGpgKeyEndpoint, UsersDeleteGpgKeyRequestOptions],
    `DELETE /user/installations/:installation_id/repositories/:repository_id`: js.Tuple2[
      AppsRemoveRepoFromInstallationEndpoint, 
      AppsRemoveRepoFromInstallationRequestOptions
    ],
    `DELETE /user/keys/:key_id`: js.Tuple2[UsersDeletePublicKeyEndpoint, UsersDeletePublicKeyRequestOptions],
    `DELETE /user/migrations/:migration_id/archive`: js.Tuple2[
      MigrationsDeleteArchiveForAuthenticatedUserEndpoint, 
      MigrationsDeleteArchiveForAuthenticatedUserRequestOptions
    ],
    `DELETE /user/migrations/:migration_id/repos/:repo_name/lock`: js.Tuple2[
      MigrationsUnlockRepoForAuthenticatedUserEndpoint, 
      MigrationsUnlockRepoForAuthenticatedUserRequestOptions
    ],
    `DELETE /user/repository_invitations/:invitation_id`: js.Tuple2[ReposDeclineInvitationEndpoint, ReposDeclineInvitationRequestOptions],
    `DELETE /user/starred/:owner/:repo`: js.Tuple2[ActivityUnstarRepoEndpoint, ActivityUnstarRepoRequestOptions],
    `DELETE /user/subscriptions/:owner/:repo`: js.Tuple2[
      ActivityStopWatchingRepoLegacyEndpoint, 
      ActivityStopWatchingRepoLegacyRequestOptions
    ],
    `GET /app`: js.Tuple2[AppsGetAuthenticatedEndpoint, AppsGetAuthenticatedRequestOptions],
    `GET /app/installations`: js.Tuple2[AppsListInstallationsEndpoint, AppsListInstallationsRequestOptions],
    `GET /app/installations/:installation_id`: js.Tuple2[AppsGetInstallationEndpoint, AppsGetInstallationRequestOptions],
    `GET /applications/:client_id/tokens/:access_token`: js.Tuple2[
      OauthAuthorizationsCheckAuthorizationEndpoint, 
      OauthAuthorizationsCheckAuthorizationRequestOptions
    ],
    `GET /applications/grants`: js.Tuple2[OauthAuthorizationsListGrantsEndpoint, OauthAuthorizationsListGrantsRequestOptions],
    `GET /applications/grants/:grant_id`: js.Tuple2[OauthAuthorizationsGetGrantEndpoint, OauthAuthorizationsGetGrantRequestOptions],
    `GET /apps/:app_slug`: js.Tuple2[AppsGetBySlugEndpoint, AppsGetBySlugRequestOptions],
    `GET /authorizations`: js.Tuple2[
      OauthAuthorizationsListAuthorizationsEndpoint, 
      OauthAuthorizationsListAuthorizationsRequestOptions
    ],
    `GET /authorizations/:authorization_id`: js.Tuple2[
      OauthAuthorizationsGetAuthorizationEndpoint, 
      OauthAuthorizationsGetAuthorizationRequestOptions
    ],
    `GET /codes_of_conduct`: js.Tuple2[
      CodesOfConductListConductCodesEndpoint, 
      CodesOfConductListConductCodesRequestOptions
    ],
    `GET /codes_of_conduct/:key`: js.Tuple2[CodesOfConductGetConductCodeEndpoint, CodesOfConductGetConductCodeRequestOptions],
    `GET /emojis`: js.Tuple2[EmojisGetEndpoint, EmojisGetRequestOptions],
    `GET /events`: js.Tuple2[ActivityListPublicEventsEndpoint, ActivityListPublicEventsRequestOptions],
    `GET /feeds`: js.Tuple2[ActivityListFeedsEndpoint, ActivityListFeedsRequestOptions],
    `GET /gists`: js.Tuple2[GistsListEndpoint, GistsListRequestOptions],
    `GET /gists/:gist_id`: js.Tuple2[GistsGetEndpoint, GistsGetRequestOptions],
    `GET /gists/:gist_id/:sha`: js.Tuple2[GistsGetRevisionEndpoint, GistsGetRevisionRequestOptions],
    `GET /gists/:gist_id/comments`: js.Tuple2[GistsListCommentsEndpoint, GistsListCommentsRequestOptions],
    `GET /gists/:gist_id/comments/:comment_id`: js.Tuple2[GistsGetCommentEndpoint, GistsGetCommentRequestOptions],
    `GET /gists/:gist_id/commits`: js.Tuple2[GistsListCommitsEndpoint, GistsListCommitsRequestOptions],
    `GET /gists/:gist_id/forks`: js.Tuple2[GistsListForksEndpoint, GistsListForksRequestOptions],
    `GET /gists/:gist_id/star`: js.Tuple2[GistsCheckIsStarredEndpoint, GistsCheckIsStarredRequestOptions],
    `GET /gists/public`: js.Tuple2[GistsListPublicEndpoint, GistsListPublicRequestOptions],
    `GET /gists/starred`: js.Tuple2[GistsListStarredEndpoint, GistsListStarredRequestOptions],
    `GET /gitignore/templates`: js.Tuple2[GitignoreListTemplatesEndpoint, GitignoreListTemplatesRequestOptions],
    `GET /gitignore/templates/:name`: js.Tuple2[GitignoreGetTemplateEndpoint, GitignoreGetTemplateRequestOptions],
    `GET /installation/repositories`: js.Tuple2[AppsListReposEndpoint, AppsListReposRequestOptions],
    `GET /issues`: js.Tuple2[IssuesListEndpoint, IssuesListRequestOptions],
    `GET /legacy/issues/search/:owner/:repository/:state/:keyword`: js.Tuple2[SearchIssuesLegacyEndpoint, SearchIssuesLegacyRequestOptions],
    `GET /legacy/repos/search/:keyword`: js.Tuple2[SearchReposLegacyEndpoint, SearchReposLegacyRequestOptions],
    `GET /legacy/user/email/:email`: js.Tuple2[SearchEmailLegacyEndpoint, SearchEmailLegacyRequestOptions],
    `GET /legacy/user/search/:keyword`: js.Tuple2[SearchUsersLegacyEndpoint, SearchUsersLegacyRequestOptions],
    `GET /licenses`: js.Tuple2[
      LicensesListCommonlyUsedEndpoint | LicensesListEndpoint, 
      LicensesListCommonlyUsedRequestOptions | LicensesListRequestOptions
    ],
    `GET /licenses/:license`: js.Tuple2[LicensesGetEndpoint, LicensesGetRequestOptions],
    `GET /marketplace_listing/accounts/:account_id`: js.Tuple2[
      AppsCheckAccountIsAssociatedWithAnyEndpoint, 
      AppsCheckAccountIsAssociatedWithAnyRequestOptions
    ],
    `GET /marketplace_listing/plans`: js.Tuple2[AppsListPlansEndpoint, AppsListPlansRequestOptions],
    `GET /marketplace_listing/plans/:plan_id/accounts`: js.Tuple2[
      AppsListAccountsUserOrOrgOnPlanEndpoint, 
      AppsListAccountsUserOrOrgOnPlanRequestOptions
    ],
    `GET /marketplace_listing/stubbed/accounts/:account_id`: js.Tuple2[
      AppsCheckAccountIsAssociatedWithAnyStubbedEndpoint, 
      AppsCheckAccountIsAssociatedWithAnyStubbedRequestOptions
    ],
    `GET /marketplace_listing/stubbed/plans`: js.Tuple2[AppsListPlansStubbedEndpoint, AppsListPlansStubbedRequestOptions],
    `GET /marketplace_listing/stubbed/plans/:plan_id/accounts`: js.Tuple2[
      AppsListAccountsUserOrOrgOnPlanStubbedEndpoint, 
      AppsListAccountsUserOrOrgOnPlanStubbedRequestOptions
    ],
    `GET /meta`: js.Tuple2[MetaGetEndpoint, MetaGetRequestOptions],
    `GET /networks/:owner/:repo/events`: js.Tuple2[
      ActivityListPublicEventsForRepoNetworkEndpoint, 
      ActivityListPublicEventsForRepoNetworkRequestOptions
    ],
    `GET /notifications`: js.Tuple2[ActivityListNotificationsEndpoint, ActivityListNotificationsRequestOptions],
    `GET /notifications/threads/:thread_id`: js.Tuple2[ActivityGetThreadEndpoint, ActivityGetThreadRequestOptions],
    `GET /notifications/threads/:thread_id/subscription`: js.Tuple2[ActivityGetThreadSubscriptionEndpoint, ActivityGetThreadSubscriptionRequestOptions],
    `GET /organizations`: js.Tuple2[OrgsListEndpoint, OrgsListRequestOptions],
    `GET /orgs/:org`: js.Tuple2[OrgsGetEndpoint, OrgsGetRequestOptions],
    `GET /orgs/:org/blocks`: js.Tuple2[OrgsListBlockedUsersEndpoint, OrgsListBlockedUsersRequestOptions],
    `GET /orgs/:org/blocks/:username`: js.Tuple2[OrgsCheckBlockedUserEndpoint, OrgsCheckBlockedUserRequestOptions],
    `GET /orgs/:org/credential-authorizations`: js.Tuple2[
      OrgsListCredentialAuthorizationsEndpoint, 
      OrgsListCredentialAuthorizationsRequestOptions
    ],
    `GET /orgs/:org/events`: js.Tuple2[
      ActivityListPublicEventsForOrgEndpoint, 
      ActivityListPublicEventsForOrgRequestOptions
    ],
    `GET /orgs/:org/hooks`: js.Tuple2[OrgsListHooksEndpoint, OrgsListHooksRequestOptions],
    `GET /orgs/:org/hooks/:hook_id`: js.Tuple2[OrgsGetHookEndpoint, OrgsGetHookRequestOptions],
    `GET /orgs/:org/installation`: js.Tuple2[
      AppsGetOrgInstallationEndpoint | AppsFindOrgInstallationEndpoint, 
      AppsGetOrgInstallationRequestOptions | AppsFindOrgInstallationRequestOptions
    ],
    `GET /orgs/:org/interaction-limits`: js.Tuple2[
      InteractionsGetRestrictionsForOrgEndpoint, 
      InteractionsGetRestrictionsForOrgRequestOptions
    ],
    `GET /orgs/:org/invitations`: js.Tuple2[OrgsListPendingInvitationsEndpoint, OrgsListPendingInvitationsRequestOptions],
    `GET /orgs/:org/invitations/:invitation_id/teams`: js.Tuple2[OrgsListInvitationTeamsEndpoint, OrgsListInvitationTeamsRequestOptions],
    `GET /orgs/:org/issues`: js.Tuple2[IssuesListForOrgEndpoint, IssuesListForOrgRequestOptions],
    `GET /orgs/:org/members`: js.Tuple2[OrgsListMembersEndpoint, OrgsListMembersRequestOptions],
    `GET /orgs/:org/members/:username`: js.Tuple2[OrgsCheckMembershipEndpoint, OrgsCheckMembershipRequestOptions],
    `GET /orgs/:org/memberships/:username`: js.Tuple2[OrgsGetMembershipEndpoint, OrgsGetMembershipRequestOptions],
    `GET /orgs/:org/migrations`: js.Tuple2[MigrationsListForOrgEndpoint, MigrationsListForOrgRequestOptions],
    `GET /orgs/:org/migrations/:migration_id`: js.Tuple2[MigrationsGetStatusForOrgEndpoint, MigrationsGetStatusForOrgRequestOptions],
    `GET /orgs/:org/migrations/:migration_id/archive`: js.Tuple2[MigrationsGetArchiveForOrgEndpoint, MigrationsGetArchiveForOrgRequestOptions],
    `GET /orgs/:org/outside_collaborators`: js.Tuple2[OrgsListOutsideCollaboratorsEndpoint, OrgsListOutsideCollaboratorsRequestOptions],
    `GET /orgs/:org/projects`: js.Tuple2[ProjectsListForOrgEndpoint, ProjectsListForOrgRequestOptions],
    `GET /orgs/:org/public_members`: js.Tuple2[OrgsListPublicMembersEndpoint, OrgsListPublicMembersRequestOptions],
    `GET /orgs/:org/public_members/:username`: js.Tuple2[OrgsCheckPublicMembershipEndpoint, OrgsCheckPublicMembershipRequestOptions],
    `GET /orgs/:org/repos`: js.Tuple2[ReposListForOrgEndpoint, ReposListForOrgRequestOptions],
    `GET /orgs/:org/team-sync/groups`: js.Tuple2[TeamsListIdPGroupsForOrgEndpoint, TeamsListIdPGroupsForOrgRequestOptions],
    `GET /orgs/:org/teams`: js.Tuple2[TeamsListEndpoint, TeamsListRequestOptions],
    `GET /orgs/:org/teams/:team_slug`: js.Tuple2[TeamsGetByNameEndpoint, TeamsGetByNameRequestOptions],
    `GET /projects/:project_id`: js.Tuple2[ProjectsGetEndpoint, ProjectsGetRequestOptions],
    `GET /projects/:project_id/collaborators`: js.Tuple2[ProjectsListCollaboratorsEndpoint, ProjectsListCollaboratorsRequestOptions],
    `GET /projects/:project_id/collaborators/:username/permission`: js.Tuple2[
      ProjectsReviewUserPermissionLevelEndpoint, 
      ProjectsReviewUserPermissionLevelRequestOptions
    ],
    `GET /projects/:project_id/columns`: js.Tuple2[ProjectsListColumnsEndpoint, ProjectsListColumnsRequestOptions],
    `GET /projects/columns/:column_id`: js.Tuple2[ProjectsGetColumnEndpoint, ProjectsGetColumnRequestOptions],
    `GET /projects/columns/:column_id/cards`: js.Tuple2[ProjectsListCardsEndpoint, ProjectsListCardsRequestOptions],
    `GET /projects/columns/cards/:card_id`: js.Tuple2[ProjectsGetCardEndpoint, ProjectsGetCardRequestOptions],
    `GET /rate_limit`: js.Tuple2[RateLimitGetEndpoint, RateLimitGetRequestOptions],
    `GET /repos/:owner/:repo`: js.Tuple2[ReposGetEndpoint, ReposGetRequestOptions],
    `GET /repos/:owner/:repo/:archive_format/:ref`: js.Tuple2[ReposGetArchiveLinkEndpoint, ReposGetArchiveLinkRequestOptions],
    `GET /repos/:owner/:repo/assignees`: js.Tuple2[IssuesListAssigneesEndpoint, IssuesListAssigneesRequestOptions],
    `GET /repos/:owner/:repo/assignees/:assignee`: js.Tuple2[IssuesCheckAssigneeEndpoint, IssuesCheckAssigneeRequestOptions],
    `GET /repos/:owner/:repo/branches`: js.Tuple2[ReposListBranchesEndpoint, ReposListBranchesRequestOptions],
    `GET /repos/:owner/:repo/branches/:branch`: js.Tuple2[ReposGetBranchEndpoint, ReposGetBranchRequestOptions],
    `GET /repos/:owner/:repo/branches/:branch/protection`: js.Tuple2[ReposGetBranchProtectionEndpoint, ReposGetBranchProtectionRequestOptions],
    `GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: js.Tuple2[
      ReposGetProtectedBranchAdminEnforcementEndpoint, 
      ReposGetProtectedBranchAdminEnforcementRequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: js.Tuple2[
      ReposGetProtectedBranchPullRequestReviewEnforcementEndpoint, 
      ReposGetProtectedBranchPullRequestReviewEnforcementRequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_signatures`: js.Tuple2[
      ReposGetProtectedBranchRequiredSignaturesEndpoint, 
      ReposGetProtectedBranchRequiredSignaturesRequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: js.Tuple2[
      ReposGetProtectedBranchRequiredStatusChecksEndpoint, 
      ReposGetProtectedBranchRequiredStatusChecksRequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: js.Tuple2[
      ReposListProtectedBranchRequiredStatusChecksContextsEndpoint, 
      ReposListProtectedBranchRequiredStatusChecksContextsRequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/restrictions`: js.Tuple2[
      ReposGetProtectedBranchRestrictionsEndpoint, 
      ReposGetProtectedBranchRestrictionsRequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: js.Tuple2[
      ReposListProtectedBranchTeamRestrictionsEndpoint, 
      ReposListProtectedBranchTeamRestrictionsRequestOptions
    ],
    `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: js.Tuple2[
      ReposListProtectedBranchUserRestrictionsEndpoint, 
      ReposListProtectedBranchUserRestrictionsRequestOptions
    ],
    `GET /repos/:owner/:repo/check-runs/:check_run_id`: js.Tuple2[ChecksGetEndpoint, ChecksGetRequestOptions],
    `GET /repos/:owner/:repo/check-runs/:check_run_id/annotations`: js.Tuple2[ChecksListAnnotationsEndpoint, ChecksListAnnotationsRequestOptions],
    `GET /repos/:owner/:repo/check-suites/:check_suite_id`: js.Tuple2[ChecksGetSuiteEndpoint, ChecksGetSuiteRequestOptions],
    `GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs`: js.Tuple2[ChecksListForSuiteEndpoint, ChecksListForSuiteRequestOptions],
    `GET /repos/:owner/:repo/collaborators`: js.Tuple2[ReposListCollaboratorsEndpoint, ReposListCollaboratorsRequestOptions],
    `GET /repos/:owner/:repo/collaborators/:username`: js.Tuple2[ReposCheckCollaboratorEndpoint, ReposCheckCollaboratorRequestOptions],
    `GET /repos/:owner/:repo/collaborators/:username/permission`: js.Tuple2[
      ReposGetCollaboratorPermissionLevelEndpoint, 
      ReposGetCollaboratorPermissionLevelRequestOptions
    ],
    `GET /repos/:owner/:repo/comments`: js.Tuple2[ReposListCommitCommentsEndpoint, ReposListCommitCommentsRequestOptions],
    `GET /repos/:owner/:repo/comments/:comment_id`: js.Tuple2[ReposGetCommitCommentEndpoint, ReposGetCommitCommentRequestOptions],
    `GET /repos/:owner/:repo/comments/:comment_id/reactions`: js.Tuple2[ReactionsListForCommitCommentEndpoint, ReactionsListForCommitCommentRequestOptions],
    `GET /repos/:owner/:repo/commits`: js.Tuple2[ReposListCommitsEndpoint, ReposListCommitsRequestOptions],
    `GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`: js.Tuple2[
      ReposListBranchesForHeadCommitEndpoint, 
      ReposListBranchesForHeadCommitRequestOptions
    ],
    `GET /repos/:owner/:repo/commits/:commit_sha/comments`: js.Tuple2[ReposListCommentsForCommitEndpoint, ReposListCommentsForCommitRequestOptions],
    `GET /repos/:owner/:repo/commits/:commit_sha/pulls`: js.Tuple2[
      ReposListPullRequestsAssociatedWithCommitEndpoint, 
      ReposListPullRequestsAssociatedWithCommitRequestOptions
    ],
    `GET /repos/:owner/:repo/commits/:ref`: js.Tuple2[
      ReposGetCommitEndpoint | ReposGetCommitRefShaEndpoint, 
      ReposGetCommitRequestOptions | ReposGetCommitRefShaRequestOptions
    ],
    `GET /repos/:owner/:repo/commits/:ref/check-runs`: js.Tuple2[ChecksListForRefEndpoint, ChecksListForRefRequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/check-suites`: js.Tuple2[ChecksListSuitesForRefEndpoint, ChecksListSuitesForRefRequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/status`: js.Tuple2[ReposGetCombinedStatusForRefEndpoint, ReposGetCombinedStatusForRefRequestOptions],
    `GET /repos/:owner/:repo/commits/:ref/statuses`: js.Tuple2[ReposListStatusesForRefEndpoint, ReposListStatusesForRefRequestOptions],
    `GET /repos/:owner/:repo/community/code_of_conduct`: js.Tuple2[CodesOfConductGetForRepoEndpoint, CodesOfConductGetForRepoRequestOptions],
    `GET /repos/:owner/:repo/community/profile`: js.Tuple2[
      ReposRetrieveCommunityProfileMetricsEndpoint, 
      ReposRetrieveCommunityProfileMetricsRequestOptions
    ],
    `GET /repos/:owner/:repo/compare/:base...:head`: js.Tuple2[ReposCompareCommitsEndpoint, ReposCompareCommitsRequestOptions],
    `GET /repos/:owner/:repo/contents/:path`: js.Tuple2[ReposGetContentsEndpoint, ReposGetContentsRequestOptions],
    `GET /repos/:owner/:repo/contributors`: js.Tuple2[ReposListContributorsEndpoint, ReposListContributorsRequestOptions],
    `GET /repos/:owner/:repo/deployments`: js.Tuple2[ReposListDeploymentsEndpoint, ReposListDeploymentsRequestOptions],
    `GET /repos/:owner/:repo/deployments/:deployment_id`: js.Tuple2[ReposGetDeploymentEndpoint, ReposGetDeploymentRequestOptions],
    `GET /repos/:owner/:repo/deployments/:deployment_id/statuses`: js.Tuple2[ReposListDeploymentStatusesEndpoint, ReposListDeploymentStatusesRequestOptions],
    `GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id`: js.Tuple2[ReposGetDeploymentStatusEndpoint, ReposGetDeploymentStatusRequestOptions],
    `GET /repos/:owner/:repo/downloads`: js.Tuple2[ReposListDownloadsEndpoint, ReposListDownloadsRequestOptions],
    `GET /repos/:owner/:repo/downloads/:download_id`: js.Tuple2[ReposGetDownloadEndpoint, ReposGetDownloadRequestOptions],
    `GET /repos/:owner/:repo/events`: js.Tuple2[ActivityListRepoEventsEndpoint, ActivityListRepoEventsRequestOptions],
    `GET /repos/:owner/:repo/forks`: js.Tuple2[ReposListForksEndpoint, ReposListForksRequestOptions],
    `GET /repos/:owner/:repo/git/blobs/:file_sha`: js.Tuple2[GitGetBlobEndpoint, GitGetBlobRequestOptions],
    `GET /repos/:owner/:repo/git/commits/:commit_sha`: js.Tuple2[GitGetCommitEndpoint, GitGetCommitRequestOptions],
    `GET /repos/:owner/:repo/git/refs/:namespace`: js.Tuple2[GitListRefsEndpoint, GitListRefsRequestOptions],
    `GET /repos/:owner/:repo/git/refs/:ref`: js.Tuple2[GitGetRefEndpoint, GitGetRefRequestOptions],
    `GET /repos/:owner/:repo/git/tags/:tag_sha`: js.Tuple2[GitGetTagEndpoint, GitGetTagRequestOptions],
    `GET /repos/:owner/:repo/git/trees/:tree_sha`: js.Tuple2[GitGetTreeEndpoint, GitGetTreeRequestOptions],
    `GET /repos/:owner/:repo/hooks`: js.Tuple2[ReposListHooksEndpoint, ReposListHooksRequestOptions],
    `GET /repos/:owner/:repo/hooks/:hook_id`: js.Tuple2[ReposGetHookEndpoint, ReposGetHookRequestOptions],
    `GET /repos/:owner/:repo/import`: js.Tuple2[MigrationsGetImportProgressEndpoint, MigrationsGetImportProgressRequestOptions],
    `GET /repos/:owner/:repo/import/authors`: js.Tuple2[MigrationsGetCommitAuthorsEndpoint, MigrationsGetCommitAuthorsRequestOptions],
    `GET /repos/:owner/:repo/import/large_files`: js.Tuple2[MigrationsGetLargeFilesEndpoint, MigrationsGetLargeFilesRequestOptions],
    `GET /repos/:owner/:repo/installation`: js.Tuple2[
      AppsGetRepoInstallationEndpoint | AppsFindRepoInstallationEndpoint, 
      AppsGetRepoInstallationRequestOptions | AppsFindRepoInstallationRequestOptions
    ],
    `GET /repos/:owner/:repo/interaction-limits`: js.Tuple2[
      InteractionsGetRestrictionsForRepoEndpoint, 
      InteractionsGetRestrictionsForRepoRequestOptions
    ],
    `GET /repos/:owner/:repo/invitations`: js.Tuple2[ReposListInvitationsEndpoint, ReposListInvitationsRequestOptions],
    `GET /repos/:owner/:repo/issues`: js.Tuple2[IssuesListForRepoEndpoint, IssuesListForRepoRequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number`: js.Tuple2[IssuesGetEndpoint, IssuesGetRequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/comments`: js.Tuple2[IssuesListCommentsEndpoint, IssuesListCommentsRequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/events`: js.Tuple2[IssuesListEventsEndpoint, IssuesListEventsRequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/labels`: js.Tuple2[IssuesListLabelsOnIssueEndpoint, IssuesListLabelsOnIssueRequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/reactions`: js.Tuple2[ReactionsListForIssueEndpoint, ReactionsListForIssueRequestOptions],
    `GET /repos/:owner/:repo/issues/:issue_number/timeline`: js.Tuple2[IssuesListEventsForTimelineEndpoint, IssuesListEventsForTimelineRequestOptions],
    `GET /repos/:owner/:repo/issues/comments`: js.Tuple2[IssuesListCommentsForRepoEndpoint, IssuesListCommentsForRepoRequestOptions],
    `GET /repos/:owner/:repo/issues/comments/:comment_id`: js.Tuple2[IssuesGetCommentEndpoint, IssuesGetCommentRequestOptions],
    `GET /repos/:owner/:repo/issues/comments/:comment_id/reactions`: js.Tuple2[ReactionsListForIssueCommentEndpoint, ReactionsListForIssueCommentRequestOptions],
    `GET /repos/:owner/:repo/issues/events`: js.Tuple2[IssuesListEventsForRepoEndpoint, IssuesListEventsForRepoRequestOptions],
    `GET /repos/:owner/:repo/issues/events/:event_id`: js.Tuple2[IssuesGetEventEndpoint, IssuesGetEventRequestOptions],
    `GET /repos/:owner/:repo/keys`: js.Tuple2[ReposListDeployKeysEndpoint, ReposListDeployKeysRequestOptions],
    `GET /repos/:owner/:repo/keys/:key_id`: js.Tuple2[ReposGetDeployKeyEndpoint, ReposGetDeployKeyRequestOptions],
    `GET /repos/:owner/:repo/labels`: js.Tuple2[IssuesListLabelsForRepoEndpoint, IssuesListLabelsForRepoRequestOptions],
    `GET /repos/:owner/:repo/labels/:name`: js.Tuple2[IssuesGetLabelEndpoint, IssuesGetLabelRequestOptions],
    `GET /repos/:owner/:repo/languages`: js.Tuple2[ReposListLanguagesEndpoint, ReposListLanguagesRequestOptions],
    `GET /repos/:owner/:repo/license`: js.Tuple2[LicensesGetForRepoEndpoint, LicensesGetForRepoRequestOptions],
    `GET /repos/:owner/:repo/milestones`: js.Tuple2[IssuesListMilestonesForRepoEndpoint, IssuesListMilestonesForRepoRequestOptions],
    `GET /repos/:owner/:repo/milestones/:milestone_number`: js.Tuple2[IssuesGetMilestoneEndpoint, IssuesGetMilestoneRequestOptions],
    `GET /repos/:owner/:repo/milestones/:milestone_number/labels`: js.Tuple2[IssuesListLabelsForMilestoneEndpoint, IssuesListLabelsForMilestoneRequestOptions],
    `GET /repos/:owner/:repo/notifications`: js.Tuple2[
      ActivityListNotificationsForRepoEndpoint, 
      ActivityListNotificationsForRepoRequestOptions
    ],
    `GET /repos/:owner/:repo/pages`: js.Tuple2[ReposGetPagesEndpoint, ReposGetPagesRequestOptions],
    `GET /repos/:owner/:repo/pages/builds`: js.Tuple2[ReposListPagesBuildsEndpoint, ReposListPagesBuildsRequestOptions],
    `GET /repos/:owner/:repo/pages/builds/:build_id`: js.Tuple2[ReposGetPagesBuildEndpoint, ReposGetPagesBuildRequestOptions],
    `GET /repos/:owner/:repo/pages/builds/latest`: js.Tuple2[ReposGetLatestPagesBuildEndpoint, ReposGetLatestPagesBuildRequestOptions],
    `GET /repos/:owner/:repo/projects`: js.Tuple2[ProjectsListForRepoEndpoint, ProjectsListForRepoRequestOptions],
    `GET /repos/:owner/:repo/pulls`: js.Tuple2[PullsListEndpoint, PullsListRequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number`: js.Tuple2[PullsGetEndpoint, PullsGetRequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/comments`: js.Tuple2[PullsListCommentsEndpoint, PullsListCommentsRequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/commits`: js.Tuple2[PullsListCommitsEndpoint, PullsListCommitsRequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/files`: js.Tuple2[PullsListFilesEndpoint, PullsListFilesRequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/merge`: js.Tuple2[PullsCheckIfMergedEndpoint, PullsCheckIfMergedRequestOptions],
    `GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: js.Tuple2[PullsListReviewRequestsEndpoint, PullsListReviewRequestsRequestOptions]
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
    __obj.updateDynamic("DELETE /repos/:owner/:repo/automated-security-fixes")(`DELETE /repos/:owner/:repo/automated-security-fixes`)
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
    __obj.updateDynamic("GET /orgs/:org/team-sync/groups")(`GET /orgs/:org/team-sync/groups`)
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
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head")(`GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/comments")(`GET /repos/:owner/:repo/commits/:commit_sha/comments`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/pulls")(`GET /repos/:owner/:repo/commits/:commit_sha/pulls`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref")(`GET /repos/:owner/:repo/commits/:ref`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/check-runs")(`GET /repos/:owner/:repo/commits/:ref/check-runs`)
    __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/check-suites")(`GET /repos/:owner/:repo/commits/:ref/check-suites`)
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
    __obj.asInstanceOf[Routes]
  }
}

