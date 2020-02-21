package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Octokit {
  type ActionsListDownloadsForSelfHostedRunnerApplicationResponse = js.Array[
    typings.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem
  ]
  type ActionsListSelfHostedRunnersForRepoResponse = js.Array[
    js.Array[
      typings.octokitRest.mod.Octokit.ActionsListSelfHostedRunnersForRepoResponseItemItem
    ]
  ]
  type ActivityListNotificationsForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.ActivityListNotificationsForRepoResponseItem]
  type ActivityListNotificationsResponse = js.Array[typings.octokitRest.mod.Octokit.ActivityListNotificationsResponseItem]
  type ActivityListReposStarredByAuthenticatedUserResponse = js.Array[
    typings.octokitRest.mod.Octokit.ActivityListReposStarredByAuthenticatedUserResponseItem
  ]
  type ActivityListReposStarredByUserResponse = js.Array[typings.octokitRest.mod.Octokit.ActivityListReposStarredByUserResponseItem]
  type ActivityListReposWatchedByUserResponse = js.Array[typings.octokitRest.mod.Octokit.ActivityListReposWatchedByUserResponseItem]
  type ActivityListStargazersForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.ActivityListStargazersForRepoResponseItem]
  type ActivityListWatchedReposForAuthenticatedUserResponse = js.Array[
    typings.octokitRest.mod.Octokit.ActivityListWatchedReposForAuthenticatedUserResponseItem
  ]
  type ActivityListWatchersForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.ActivityListWatchersForRepoResponseItem]
  type AnyResponse = typings.octokitRest.mod.Octokit.Response[js.Any]
  type AppsCreateInstallationTokenParamsPermissions = js.Object
  type AppsListAccountsUserOrOrgOnPlanResponse = js.Array[typings.octokitRest.mod.Octokit.AppsListAccountsUserOrOrgOnPlanResponseItem]
  type AppsListAccountsUserOrOrgOnPlanStubbedResponse = js.Array[
    typings.octokitRest.mod.Octokit.AppsListAccountsUserOrOrgOnPlanStubbedResponseItem
  ]
  type AppsListInstallationsResponse = js.Array[typings.octokitRest.mod.Octokit.AppsListInstallationsResponseItem]
  type AppsListMarketplacePurchasesForAuthenticatedUserResponse = js.Array[
    typings.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserResponseItem
  ]
  type AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse = js.Array[
    typings.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem
  ]
  type AppsListPlansResponse = js.Array[typings.octokitRest.mod.Octokit.AppsListPlansResponseItem]
  type AppsListPlansStubbedResponse = js.Array[typings.octokitRest.mod.Octokit.AppsListPlansStubbedResponseItem]
  type Callback[T] = js.Function2[/* error */ typings.std.Error | scala.Null, /* result */ T, js.Any]
  type ChecksListAnnotationsResponse = js.Array[typings.octokitRest.mod.Octokit.ChecksListAnnotationsResponseItem]
  type CodesOfConductListConductCodesResponse = js.Array[typings.octokitRest.mod.Octokit.CodesOfConductListConductCodesResponseItem]
  type GistsListCommentsResponse = js.Array[typings.octokitRest.mod.Octokit.GistsListCommentsResponseItem]
  type GistsListCommitsResponse = js.Array[typings.octokitRest.mod.Octokit.GistsListCommitsResponseItem]
  type GistsListForksResponse = js.Array[typings.octokitRest.mod.Octokit.GistsListForksResponseItem]
  type GistsListPublicForUserResponse = js.Array[typings.octokitRest.mod.Octokit.GistsListPublicForUserResponseItem]
  type GistsListPublicResponse = js.Array[typings.octokitRest.mod.Octokit.GistsListPublicResponseItem]
  type GistsListResponse = js.Array[typings.octokitRest.mod.Octokit.GistsListResponseItem]
  type GistsListStarredResponse = js.Array[typings.octokitRest.mod.Octokit.GistsListStarredResponseItem]
  type GitListMatchingRefsResponse = js.Array[typings.octokitRest.mod.Octokit.GitListMatchingRefsResponseItem]
  type GitignoreListTemplatesResponse = js.Array[java.lang.String]
  type HookError = typings.std.Error with typings.octokitRest.AnonDocumentationurl
  type IssuesAddLabelsResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesAddLabelsResponseItem]
  type IssuesListAssigneesResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListAssigneesResponseItem]
  type IssuesListCommentsForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListCommentsForRepoResponseItem]
  type IssuesListCommentsResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListCommentsResponseItem]
  type IssuesListEventsForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListEventsForRepoResponseItem]
  type IssuesListEventsForTimelineResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListEventsForTimelineResponseItem]
  type IssuesListEventsResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListEventsResponseItem]
  type IssuesListForAuthenticatedUserResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListForAuthenticatedUserResponseItem]
  type IssuesListForOrgResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListForOrgResponseItem]
  type IssuesListForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListForRepoResponseItem]
  type IssuesListLabelsForMilestoneResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListLabelsForMilestoneResponseItem]
  type IssuesListLabelsForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListLabelsForRepoResponseItem]
  type IssuesListLabelsOnIssueResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListLabelsOnIssueResponseItem]
  type IssuesListMilestonesForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListMilestonesForRepoResponseItem]
  type IssuesListResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesListResponseItem]
  type IssuesRemoveLabelResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesRemoveLabelResponseItem]
  type IssuesReplaceLabelsResponse = js.Array[typings.octokitRest.mod.Octokit.IssuesReplaceLabelsResponseItem]
  type LicensesListCommonlyUsedResponse = js.Array[typings.octokitRest.mod.Octokit.LicensesListCommonlyUsedResponseItem]
  type LicensesListResponse = js.Array[typings.octokitRest.mod.Octokit.LicensesListResponseItem]
  /* Rewritten from type alias, can be one of: 
    - typings.octokitRest.AnonLink
    - typings.octokitRest.AnonHeaders
    - java.lang.String
  */
  type Link = typings.octokitRest.mod.Octokit._Link | java.lang.String
  type MigrationsGetCommitAuthorsResponse = js.Array[typings.octokitRest.mod.Octokit.MigrationsGetCommitAuthorsResponseItem]
  type MigrationsGetLargeFilesResponse = js.Array[typings.octokitRest.mod.Octokit.MigrationsGetLargeFilesResponseItem]
  type MigrationsListForAuthenticatedUserResponse = js.Array[typings.octokitRest.mod.Octokit.MigrationsListForAuthenticatedUserResponseItem]
  type MigrationsListForOrgResponse = js.Array[typings.octokitRest.mod.Octokit.MigrationsListForOrgResponseItem]
  type MigrationsListReposForOrgResponse = js.Array[typings.octokitRest.mod.Octokit.MigrationsListReposForOrgResponseItem]
  type MigrationsListReposForUserResponse = js.Array[typings.octokitRest.mod.Octokit.MigrationsListReposForUserResponseItem]
  type OauthAuthorizationsListAuthorizationsResponse = js.Array[
    typings.octokitRest.mod.Octokit.OauthAuthorizationsListAuthorizationsResponseItem
  ]
  type OauthAuthorizationsListGrantsResponse = js.Array[typings.octokitRest.mod.Octokit.OauthAuthorizationsListGrantsResponseItem]
  type OrgsListBlockedUsersResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListBlockedUsersResponseItem]
  type OrgsListForAuthenticatedUserResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListForAuthenticatedUserResponseItem]
  type OrgsListForUserResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListForUserResponseItem]
  type OrgsListHooksResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListHooksResponseItem]
  type OrgsListInvitationTeamsResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListInvitationTeamsResponseItem]
  type OrgsListMembersResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListMembersResponseItem]
  type OrgsListMembershipsResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListMembershipsResponseItem]
  type OrgsListOutsideCollaboratorsResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListOutsideCollaboratorsResponseItem]
  type OrgsListPendingInvitationsResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListPendingInvitationsResponseItem]
  type OrgsListPublicMembersResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListPublicMembersResponseItem]
  type OrgsListResponse = js.Array[typings.octokitRest.mod.Octokit.OrgsListResponseItem]
  type Plugin = js.Function2[
    /* octokit */ typings.octokitRest.mod.Octokit, 
    /* options */ typings.octokitRest.mod.Octokit.Options, 
    scala.Unit
  ]
  type ProjectsListCardsResponse = js.Array[typings.octokitRest.mod.Octokit.ProjectsListCardsResponseItem]
  type ProjectsListCollaboratorsResponse = js.Array[typings.octokitRest.mod.Octokit.ProjectsListCollaboratorsResponseItem]
  type ProjectsListColumnsResponse = js.Array[typings.octokitRest.mod.Octokit.ProjectsListColumnsResponseItem]
  type ProjectsListForOrgResponse = js.Array[typings.octokitRest.mod.Octokit.ProjectsListForOrgResponseItem]
  type ProjectsListForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.ProjectsListForRepoResponseItem]
  type ProjectsListForUserResponse = js.Array[typings.octokitRest.mod.Octokit.ProjectsListForUserResponseItem]
  type PullsGetCommentsForReviewResponse = js.Array[typings.octokitRest.mod.Octokit.PullsGetCommentsForReviewResponseItem]
  type PullsListCommentsForRepoResponse = js.Array[typings.octokitRest.mod.Octokit.PullsListCommentsForRepoResponseItem]
  type PullsListCommentsResponse = js.Array[typings.octokitRest.mod.Octokit.PullsListCommentsResponseItem]
  type PullsListCommitsResponse = js.Array[typings.octokitRest.mod.Octokit.PullsListCommitsResponseItem]
  type PullsListFilesResponse = js.Array[typings.octokitRest.mod.Octokit.PullsListFilesResponseItem]
  type PullsListResponse = js.Array[typings.octokitRest.mod.Octokit.PullsListResponseItem]
  type PullsListReviewsResponse = js.Array[typings.octokitRest.mod.Octokit.PullsListReviewsResponseItem]
  type ReactionsListForCommitCommentResponse = js.Array[typings.octokitRest.mod.Octokit.ReactionsListForCommitCommentResponseItem]
  type ReactionsListForIssueCommentResponse = js.Array[typings.octokitRest.mod.Octokit.ReactionsListForIssueCommentResponseItem]
  type ReactionsListForIssueResponse = js.Array[typings.octokitRest.mod.Octokit.ReactionsListForIssueResponseItem]
  type ReactionsListForPullRequestReviewCommentResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReactionsListForPullRequestReviewCommentResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentInOrgResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentInOrgResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentLegacyResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentLegacyResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentResponseItem
  ]
  type ReactionsListForTeamDiscussionInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionInOrgResponseItem]
  type ReactionsListForTeamDiscussionLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionLegacyResponseItem]
  type ReactionsListForTeamDiscussionResponse = js.Array[typings.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionResponseItem]
  type ReposAddProtectedBranchAppRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposAddProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposAddProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposAddProtectedBranchTeamRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposAddProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposAddProtectedBranchUserRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposAddProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposCreateDispatchEventParamsClientPayload = js.Object
  type ReposGetAppsWithAccessToProtectedBranchResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposGetAppsWithAccessToProtectedBranchResponseItem
  ]
  type ReposGetCodeFrequencyStatsResponse = js.Array[js.Array[scala.Double]]
  type ReposGetCommitActivityStatsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposGetCommitActivityStatsResponseItem]
  type ReposGetContentsResponse = typings.octokitRest.AnonContent | js.Array[typings.octokitRest.mod.Octokit.ReposGetContentsResponseItem]
  type ReposGetContributorsStatsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposGetContributorsStatsResponseItem]
  type ReposGetPunchCardStatsResponse = js.Array[js.Array[scala.Double]]
  type ReposGetTeamsWithAccessToProtectedBranchResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposGetTeamsWithAccessToProtectedBranchResponseItem
  ]
  type ReposGetTopPathsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposGetTopPathsResponseItem]
  type ReposGetTopReferrersResponse = js.Array[typings.octokitRest.mod.Octokit.ReposGetTopReferrersResponseItem]
  type ReposGetUsersWithAccessToProtectedBranchResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposGetUsersWithAccessToProtectedBranchResponseItem
  ]
  type ReposListAppsWithAccessToProtectedBranchResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposListAppsWithAccessToProtectedBranchResponseItem
  ]
  type ReposListAssetsForReleaseResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListAssetsForReleaseResponseItem]
  type ReposListBranchesForHeadCommitResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListBranchesForHeadCommitResponseItem]
  type ReposListBranchesResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListBranchesResponseItem]
  type ReposListCollaboratorsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListCollaboratorsResponseItem]
  type ReposListCommentsForCommitResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListCommentsForCommitResponseItem]
  type ReposListCommitCommentsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListCommitCommentsResponseItem]
  type ReposListCommitsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListCommitsResponseItem]
  type ReposListContributorsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListContributorsResponseItem]
  type ReposListDeployKeysResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListDeployKeysResponseItem]
  type ReposListDeploymentStatusesResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListDeploymentStatusesResponseItem]
  type ReposListDeploymentsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListDeploymentsResponseItem]
  type ReposListDownloadsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListDownloadsResponseItem]
  type ReposListForOrgResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListForOrgResponseItem]
  type ReposListForksResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListForksResponseItem]
  type ReposListHooksResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListHooksResponseItem]
  type ReposListInvitationsForAuthenticatedUserResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposListInvitationsForAuthenticatedUserResponseItem
  ]
  type ReposListInvitationsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListInvitationsResponseItem]
  type ReposListPagesBuildsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListPagesBuildsResponseItem]
  type ReposListProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposListProtectedBranchTeamRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposListProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposListProtectedBranchUserRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposListProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposListPublicResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListPublicResponseItem]
  type ReposListPullRequestsAssociatedWithCommitResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposListPullRequestsAssociatedWithCommitResponseItem
  ]
  type ReposListReleasesResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListReleasesResponseItem]
  type ReposListStatusesForRefResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListStatusesForRefResponseItem]
  type ReposListTagsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListTagsResponseItem]
  type ReposListTeamsResponse = js.Array[typings.octokitRest.mod.Octokit.ReposListTeamsResponseItem]
  type ReposListTeamsWithAccessToProtectedBranchResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposListTeamsWithAccessToProtectedBranchResponseItem
  ]
  type ReposListUsersWithAccessToProtectedBranchResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposListUsersWithAccessToProtectedBranchResponseItem
  ]
  type ReposRemoveProtectedBranchAppRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposRemoveProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposRemoveProtectedBranchTeamRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposRemoveProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposRemoveProtectedBranchUserRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposRemoveProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchAppRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposReplaceProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposReplaceProtectedBranchTeamRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposReplaceProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchUserRestrictionsResponse = js.Array[
    typings.octokitRest.mod.Octokit.ReposReplaceProtectedBranchUserRestrictionsResponseItem
  ]
  type TeamsListChildInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListChildInOrgResponseItem]
  type TeamsListChildLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListChildLegacyResponseItem]
  type TeamsListChildResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListChildResponseItem]
  type TeamsListDiscussionCommentsInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListDiscussionCommentsInOrgResponseItem]
  type TeamsListDiscussionCommentsLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListDiscussionCommentsLegacyResponseItem]
  type TeamsListDiscussionCommentsResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListDiscussionCommentsResponseItem]
  type TeamsListDiscussionsInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListDiscussionsInOrgResponseItem]
  type TeamsListDiscussionsLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListDiscussionsLegacyResponseItem]
  type TeamsListDiscussionsResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListDiscussionsResponseItem]
  type TeamsListForAuthenticatedUserResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListForAuthenticatedUserResponseItem]
  type TeamsListMembersInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListMembersInOrgResponseItem]
  type TeamsListMembersLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListMembersLegacyResponseItem]
  type TeamsListMembersResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListMembersResponseItem]
  type TeamsListPendingInvitationsInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListPendingInvitationsInOrgResponseItem]
  type TeamsListPendingInvitationsLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListPendingInvitationsLegacyResponseItem]
  type TeamsListPendingInvitationsResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListPendingInvitationsResponseItem]
  type TeamsListProjectsInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListProjectsInOrgResponseItem]
  type TeamsListProjectsLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListProjectsLegacyResponseItem]
  type TeamsListProjectsResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListProjectsResponseItem]
  type TeamsListReposInOrgResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListReposInOrgResponseItem]
  type TeamsListReposLegacyResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListReposLegacyResponseItem]
  type TeamsListReposResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListReposResponseItem]
  type TeamsListResponse = js.Array[typings.octokitRest.mod.Octokit.TeamsListResponseItem]
  type UsersAddEmailsResponse = js.Array[typings.octokitRest.mod.Octokit.UsersAddEmailsResponseItem]
  type UsersListBlockedResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListBlockedResponseItem]
  type UsersListEmailsResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListEmailsResponseItem]
  type UsersListFollowersForAuthenticatedUserResponse = js.Array[
    typings.octokitRest.mod.Octokit.UsersListFollowersForAuthenticatedUserResponseItem
  ]
  type UsersListFollowersForUserResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListFollowersForUserResponseItem]
  type UsersListFollowingForAuthenticatedUserResponse = js.Array[
    typings.octokitRest.mod.Octokit.UsersListFollowingForAuthenticatedUserResponseItem
  ]
  type UsersListFollowingForUserResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListFollowingForUserResponseItem]
  type UsersListGpgKeysForUserResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListGpgKeysForUserResponseItem]
  type UsersListGpgKeysResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListGpgKeysResponseItem]
  type UsersListPublicEmailsResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListPublicEmailsResponseItem]
  type UsersListPublicKeysForUserResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListPublicKeysForUserResponseItem]
  type UsersListPublicKeysResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListPublicKeysResponseItem]
  type UsersListResponse = js.Array[typings.octokitRest.mod.Octokit.UsersListResponseItem]
  type UsersTogglePrimaryEmailVisibilityResponse = js.Array[typings.octokitRest.mod.Octokit.UsersTogglePrimaryEmailVisibilityResponseItem]
  type date = java.lang.String
  type json = js.Any
}
