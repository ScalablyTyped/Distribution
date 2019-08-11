package typings.atOctokitRequest

import typings.atOctokitRequest.distDashTypesTypesMod.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atOctokitRequestStrings {
  @js.native
  sealed trait DELETE extends Method
  
  @js.native
  sealed trait `DELETE /app/installations/:installation_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /applications/:client_id/grants/:access_token` extends js.Object
  
  @js.native
  sealed trait `DELETE /applications/:client_id/tokens/:access_token` extends js.Object
  
  @js.native
  sealed trait `DELETE /applications/grants/:grant_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /authorizations/:authorization_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /gists/:gist_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /gists/:gist_id/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /gists/:gist_id/star` extends js.Object
  
  @js.native
  sealed trait `DELETE /notifications/threads/:thread_id/subscription` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/blocks/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/credential-authorizations/:credential_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/hooks/:hook_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/interaction-limits` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/members/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/memberships/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/migrations/:migration_id/archive` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/outside_collaborators/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /orgs/:org/public_members/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /projects/:project_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /projects/:project_id/collaborators/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /projects/columns/:column_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /projects/columns/cards/:card_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /reactions/:reaction_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/automated-security-fixes` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/collaborators/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/contents/:path` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/downloads/:download_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/git/refs/:ref` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/hooks/:hook_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/import` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/interaction-limits` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/invitations/:invitation_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/issues/:issue_number/assignees` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/issues/:issue_number/labels` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/issues/:issue_number/lock` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/issues/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/keys/:key_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/labels/:name` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/milestones/:milestone_number` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/pages` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/pulls/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/releases/:release_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/releases/assets/:asset_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/subscription` extends js.Object
  
  @js.native
  sealed trait `DELETE /repos/:owner/:repo/vulnerability-alerts` extends js.Object
  
  @js.native
  sealed trait `DELETE /scim/v2/organizations/:org/Users/:scim_user_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /teams/:team_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /teams/:team_id/discussions/:discussion_number` extends js.Object
  
  @js.native
  sealed trait `DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number` extends js.Object
  
  @js.native
  sealed trait `DELETE /teams/:team_id/members/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /teams/:team_id/memberships/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /teams/:team_id/projects/:project_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /teams/:team_id/repos/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/blocks/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/emails` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/following/:username` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/gpg_keys/:gpg_key_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/installations/:installation_id/repositories/:repository_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/keys/:key_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/migrations/:migration_id/archive` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/migrations/:migration_id/repos/:repo_name/lock` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/repository_invitations/:invitation_id` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/starred/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `DELETE /user/subscriptions/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait GET extends Method
  
  @js.native
  sealed trait `GET /app` extends js.Object
  
  @js.native
  sealed trait `GET /app/installations` extends js.Object
  
  @js.native
  sealed trait `GET /app/installations/:installation_id` extends js.Object
  
  @js.native
  sealed trait `GET /applications/:client_id/tokens/:access_token` extends js.Object
  
  @js.native
  sealed trait `GET /applications/grants` extends js.Object
  
  @js.native
  sealed trait `GET /applications/grants/:grant_id` extends js.Object
  
  @js.native
  sealed trait `GET /apps/:app_slug` extends js.Object
  
  @js.native
  sealed trait `GET /authorizations` extends js.Object
  
  @js.native
  sealed trait `GET /authorizations/:authorization_id` extends js.Object
  
  @js.native
  sealed trait `GET /codes_of_conduct` extends js.Object
  
  @js.native
  sealed trait `GET /codes_of_conduct/:key` extends js.Object
  
  @js.native
  sealed trait `GET /emojis` extends js.Object
  
  @js.native
  sealed trait `GET /events` extends js.Object
  
  @js.native
  sealed trait `GET /feeds` extends js.Object
  
  @js.native
  sealed trait `GET /gists` extends js.Object
  
  @js.native
  sealed trait `GET /gists/:gist_id` extends js.Object
  
  @js.native
  sealed trait `GET /gists/:gist_id/:sha` extends js.Object
  
  @js.native
  sealed trait `GET /gists/:gist_id/comments` extends js.Object
  
  @js.native
  sealed trait `GET /gists/:gist_id/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `GET /gists/:gist_id/commits` extends js.Object
  
  @js.native
  sealed trait `GET /gists/:gist_id/forks` extends js.Object
  
  @js.native
  sealed trait `GET /gists/:gist_id/star` extends js.Object
  
  @js.native
  sealed trait `GET /gists/public` extends js.Object
  
  @js.native
  sealed trait `GET /gists/starred` extends js.Object
  
  @js.native
  sealed trait `GET /gitignore/templates` extends js.Object
  
  @js.native
  sealed trait `GET /gitignore/templates/:name` extends js.Object
  
  @js.native
  sealed trait `GET /installation/repositories` extends js.Object
  
  @js.native
  sealed trait `GET /issues` extends js.Object
  
  @js.native
  sealed trait `GET /legacy/issues/search/:owner/:repository/:state/:keyword` extends js.Object
  
  @js.native
  sealed trait `GET /legacy/repos/search/:keyword` extends js.Object
  
  @js.native
  sealed trait `GET /legacy/user/email/:email` extends js.Object
  
  @js.native
  sealed trait `GET /legacy/user/search/:keyword` extends js.Object
  
  @js.native
  sealed trait `GET /licenses` extends js.Object
  
  @js.native
  sealed trait `GET /licenses/:license` extends js.Object
  
  @js.native
  sealed trait `GET /marketplace_listing/accounts/:account_id` extends js.Object
  
  @js.native
  sealed trait `GET /marketplace_listing/plans` extends js.Object
  
  @js.native
  sealed trait `GET /marketplace_listing/plans/:plan_id/accounts` extends js.Object
  
  @js.native
  sealed trait `GET /marketplace_listing/stubbed/accounts/:account_id` extends js.Object
  
  @js.native
  sealed trait `GET /marketplace_listing/stubbed/plans` extends js.Object
  
  @js.native
  sealed trait `GET /marketplace_listing/stubbed/plans/:plan_id/accounts` extends js.Object
  
  @js.native
  sealed trait `GET /meta` extends js.Object
  
  @js.native
  sealed trait `GET /networks/:owner/:repo/events` extends js.Object
  
  @js.native
  sealed trait `GET /notifications` extends js.Object
  
  @js.native
  sealed trait `GET /notifications/threads/:thread_id` extends js.Object
  
  @js.native
  sealed trait `GET /notifications/threads/:thread_id/subscription` extends js.Object
  
  @js.native
  sealed trait `GET /organizations` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/blocks` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/blocks/:username` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/credential-authorizations` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/events` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/hooks` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/hooks/:hook_id` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/installation` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/interaction-limits` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/invitations` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/invitations/:invitation_id/teams` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/issues` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/members` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/members/:username` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/memberships/:username` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/migrations` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/migrations/:migration_id` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/migrations/:migration_id/archive` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/outside_collaborators` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/projects` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/public_members` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/public_members/:username` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/repos` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/team-sync/groups` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/teams` extends js.Object
  
  @js.native
  sealed trait `GET /orgs/:org/teams/:team_slug` extends js.Object
  
  @js.native
  sealed trait `GET /projects/:project_id` extends js.Object
  
  @js.native
  sealed trait `GET /projects/:project_id/collaborators` extends js.Object
  
  @js.native
  sealed trait `GET /projects/:project_id/collaborators/:username/permission` extends js.Object
  
  @js.native
  sealed trait `GET /projects/:project_id/columns` extends js.Object
  
  @js.native
  sealed trait `GET /projects/columns/:column_id` extends js.Object
  
  @js.native
  sealed trait `GET /projects/columns/:column_id/cards` extends js.Object
  
  @js.native
  sealed trait `GET /projects/columns/cards/:card_id` extends js.Object
  
  @js.native
  sealed trait `GET /rate_limit` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/:archive_format/:ref` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/assignees` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/assignees/:assignee` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/required_signatures` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/restrictions` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/check-runs/:check_run_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/check-runs/:check_run_id/annotations` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/check-suites/:check_suite_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/collaborators` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/collaborators/:username` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/collaborators/:username/permission` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/comments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/comments/:comment_id/reactions` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:commit_sha/comments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:commit_sha/pulls` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:ref` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:ref/check-runs` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:ref/check-suites` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:ref/status` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/commits/:ref/statuses` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/community/code_of_conduct` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/community/profile` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/compare/:baseDOTDOTDOT:head` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/contents/:path` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/contributors` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/deployments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/deployments/:deployment_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/deployments/:deployment_id/statuses` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/downloads` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/downloads/:download_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/events` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/forks` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/git/blobs/:file_sha` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/git/commits/:commit_sha` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/git/refs/:namespace` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/git/refs/:ref` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/git/tags/:tag_sha` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/git/trees/:tree_sha` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/hooks` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/hooks/:hook_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/import` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/import/authors` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/import/large_files` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/installation` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/interaction-limits` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/invitations` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/:issue_number` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/:issue_number/comments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/:issue_number/events` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/:issue_number/labels` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/:issue_number/reactions` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/:issue_number/timeline` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/comments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/comments/:comment_id/reactions` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/events` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/issues/events/:event_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/keys` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/keys/:key_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/labels` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/labels/:name` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/languages` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/license` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/milestones` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/milestones/:milestone_number` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/milestones/:milestone_number/labels` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/notifications` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pages` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pages/builds` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pages/builds/:build_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pages/builds/latest` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/projects` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/comments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/commits` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/files` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/merge` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/reviews` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/comments` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/readme` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/releases` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/releases/:release_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/releases/:release_id/assets` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/releases/assets/:asset_id` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/releases/latest` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/releases/tags/:tag` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/stargazers` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/stats/code_frequency` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/stats/commit_activity` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/stats/contributors` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/stats/participation` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/stats/punch_card` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/subscribers` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/subscription` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/tags` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/teams` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/topics` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/traffic/clones` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/traffic/popular/paths` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/traffic/popular/referrers` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/traffic/views` extends js.Object
  
  @js.native
  sealed trait `GET /repos/:owner/:repo/vulnerability-alerts` extends js.Object
  
  @js.native
  sealed trait `GET /repositories` extends js.Object
  
  @js.native
  sealed trait `GET /scim/v2/organizations/:org/Users` extends js.Object
  
  @js.native
  sealed trait `GET /scim/v2/organizations/:org/Users/:scim_user_id` extends js.Object
  
  @js.native
  sealed trait `GET /search/code` extends js.Object
  
  @js.native
  sealed trait `GET /search/commits` extends js.Object
  
  @js.native
  sealed trait `GET /search/issues` extends js.Object
  
  @js.native
  sealed trait `GET /search/labels` extends js.Object
  
  @js.native
  sealed trait `GET /search/repositories` extends js.Object
  
  @js.native
  sealed trait `GET /search/topics` extends js.Object
  
  @js.native
  sealed trait `GET /search/users` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/discussions` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/discussions/:discussion_number` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/discussions/:discussion_number/comments` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/discussions/:discussion_number/reactions` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/invitations` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/members` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/members/:username` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/memberships/:username` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/projects` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/projects/:project_id` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/repos` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/repos/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/team-sync/group-mappings` extends js.Object
  
  @js.native
  sealed trait `GET /teams/:team_id/teams` extends js.Object
  
  @js.native
  sealed trait `GET /user` extends js.Object
  
  @js.native
  sealed trait `GET /user/blocks` extends js.Object
  
  @js.native
  sealed trait `GET /user/blocks/:username` extends js.Object
  
  @js.native
  sealed trait `GET /user/emails` extends js.Object
  
  @js.native
  sealed trait `GET /user/followers` extends js.Object
  
  @js.native
  sealed trait `GET /user/following` extends js.Object
  
  @js.native
  sealed trait `GET /user/following/:username` extends js.Object
  
  @js.native
  sealed trait `GET /user/gpg_keys` extends js.Object
  
  @js.native
  sealed trait `GET /user/gpg_keys/:gpg_key_id` extends js.Object
  
  @js.native
  sealed trait `GET /user/installations` extends js.Object
  
  @js.native
  sealed trait `GET /user/installations/:installation_id/repositories` extends js.Object
  
  @js.native
  sealed trait `GET /user/issues` extends js.Object
  
  @js.native
  sealed trait `GET /user/keys` extends js.Object
  
  @js.native
  sealed trait `GET /user/keys/:key_id` extends js.Object
  
  @js.native
  sealed trait `GET /user/marketplace_purchases` extends js.Object
  
  @js.native
  sealed trait `GET /user/marketplace_purchases/stubbed` extends js.Object
  
  @js.native
  sealed trait `GET /user/memberships/orgs` extends js.Object
  
  @js.native
  sealed trait `GET /user/memberships/orgs/:org` extends js.Object
  
  @js.native
  sealed trait `GET /user/migrations` extends js.Object
  
  @js.native
  sealed trait `GET /user/migrations/:migration_id` extends js.Object
  
  @js.native
  sealed trait `GET /user/migrations/:migration_id/archive` extends js.Object
  
  @js.native
  sealed trait `GET /user/orgs` extends js.Object
  
  @js.native
  sealed trait `GET /user/public_emails` extends js.Object
  
  @js.native
  sealed trait `GET /user/repos` extends js.Object
  
  @js.native
  sealed trait `GET /user/repository_invitations` extends js.Object
  
  @js.native
  sealed trait `GET /user/starred` extends js.Object
  
  @js.native
  sealed trait `GET /user/starred/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `GET /user/subscriptions` extends js.Object
  
  @js.native
  sealed trait `GET /user/subscriptions/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `GET /user/teams` extends js.Object
  
  @js.native
  sealed trait `GET /users` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/events` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/events/orgs/:org` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/events/public` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/followers` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/following` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/following/:target_user` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/gists` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/gpg_keys` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/hovercard` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/installation` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/keys` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/orgs` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/projects` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/received_events` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/received_events/public` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/repos` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/starred` extends js.Object
  
  @js.native
  sealed trait `GET /users/:username/subscriptions` extends js.Object
  
  @js.native
  sealed trait HEAD extends Method
  
  @js.native
  sealed trait PATCH extends Method
  
  @js.native
  sealed trait `PATCH /authorizations/:authorization_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /gists/:gist_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /gists/:gist_id/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /notifications/threads/:thread_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /orgs/:org` extends js.Object
  
  @js.native
  sealed trait `PATCH /orgs/:org/hooks/:hook_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /projects/:project_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /projects/columns/:column_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /projects/columns/cards/:card_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/check-runs/:check_run_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/check-suites/preferences` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/git/refs/:ref` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/hooks/:hook_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/import` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/import/authors/:author_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/import/lfs` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/invitations/:invitation_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/issues/:issue_number` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/issues/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/labels/:current_name` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/milestones/:milestone_number` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/pulls/:pull_number` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/pulls/comments/:comment_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/releases/:release_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /repos/:owner/:repo/releases/assets/:asset_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /scim/v2/organizations/:org/Users/:scim_user_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /teams/:team_id` extends js.Object
  
  @js.native
  sealed trait `PATCH /teams/:team_id/discussions/:discussion_number` extends js.Object
  
  @js.native
  sealed trait `PATCH /teams/:team_id/discussions/:discussion_number/comments/:comment_number` extends js.Object
  
  @js.native
  sealed trait `PATCH /teams/:team_id/team-sync/group-mappings` extends js.Object
  
  @js.native
  sealed trait `PATCH /user` extends js.Object
  
  @js.native
  sealed trait `PATCH /user/email/visibility` extends js.Object
  
  @js.native
  sealed trait `PATCH /user/memberships/orgs/:org` extends js.Object
  
  @js.native
  sealed trait `PATCH /user/repository_invitations/:invitation_id` extends js.Object
  
  @js.native
  sealed trait POST extends Method
  
  @js.native
  sealed trait `POST /app-manifests/:code/conversions` extends js.Object
  
  @js.native
  sealed trait `POST /app/installations/:installation_id/access_tokens` extends js.Object
  
  @js.native
  sealed trait `POST /applications/:client_id/tokens/:access_token` extends js.Object
  
  @js.native
  sealed trait `POST /authorizations` extends js.Object
  
  @js.native
  sealed trait `POST /content_references/:content_reference_id/attachments` extends js.Object
  
  @js.native
  sealed trait `POST /gists` extends js.Object
  
  @js.native
  sealed trait `POST /gists/:gist_id/comments` extends js.Object
  
  @js.native
  sealed trait `POST /gists/:gist_id/forks` extends js.Object
  
  @js.native
  sealed trait `POST /markdown` extends js.Object
  
  @js.native
  sealed trait `POST /markdown/raw` extends js.Object
  
  @js.native
  sealed trait `POST /orgs/:org/hooks` extends js.Object
  
  @js.native
  sealed trait `POST /orgs/:org/hooks/:hook_id/pings` extends js.Object
  
  @js.native
  sealed trait `POST /orgs/:org/invitations` extends js.Object
  
  @js.native
  sealed trait `POST /orgs/:org/migrations` extends js.Object
  
  @js.native
  sealed trait `POST /orgs/:org/projects` extends js.Object
  
  @js.native
  sealed trait `POST /orgs/:org/repos` extends js.Object
  
  @js.native
  sealed trait `POST /orgs/:org/teams` extends js.Object
  
  @js.native
  sealed trait `POST /projects/:project_id/columns` extends js.Object
  
  @js.native
  sealed trait `POST /projects/columns/:column_id/cards` extends js.Object
  
  @js.native
  sealed trait `POST /projects/columns/:column_id/moves` extends js.Object
  
  @js.native
  sealed trait `POST /projects/columns/cards/:card_id/moves` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/branches/:branch/protection/required_signatures` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/check-runs` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/check-suites` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/check-suites/:check_suite_id/rerequest` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/comments/:comment_id/reactions` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/commits/:commit_sha/comments` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/deployments` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/deployments/:deployment_id/statuses` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/forks` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/git/blobs` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/git/commits` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/git/refs` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/git/tags` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/git/trees` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/hooks` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/hooks/:hook_id/pings` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/hooks/:hook_id/tests` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/issues` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/issues/:issue_number/assignees` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/issues/:issue_number/comments` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/issues/:issue_number/labels` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/issues/:issue_number/reactions` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/issues/comments/:comment_id/reactions` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/keys` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/labels` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/merges` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/milestones` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pages` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pages/builds` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/projects` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pulls` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pulls/:pull_number/comments` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pulls/:pull_number/reviews` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/releases` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/statuses/:sha` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:owner/:repo/transfer` extends js.Object
  
  @js.native
  sealed trait `POST /repos/:template_owner/:template_repo/generate` extends js.Object
  
  @js.native
  sealed trait `POST /scim/v2/organizations/:org/Users` extends js.Object
  
  @js.native
  sealed trait `POST /teams/:team_id/discussions` extends js.Object
  
  @js.native
  sealed trait `POST /teams/:team_id/discussions/:discussion_number/comments` extends js.Object
  
  @js.native
  sealed trait `POST /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions` extends js.Object
  
  @js.native
  sealed trait `POST /teams/:team_id/discussions/:discussion_number/reactions` extends js.Object
  
  @js.native
  sealed trait `POST /user/emails` extends js.Object
  
  @js.native
  sealed trait `POST /user/gpg_keys` extends js.Object
  
  @js.native
  sealed trait `POST /user/keys` extends js.Object
  
  @js.native
  sealed trait `POST /user/migrations` extends js.Object
  
  @js.native
  sealed trait `POST /user/projects` extends js.Object
  
  @js.native
  sealed trait `POST /user/repos` extends js.Object
  
  @js.native
  sealed trait `POST :url` extends js.Object
  
  @js.native
  sealed trait PUT extends Method
  
  @js.native
  sealed trait `PUT /authorizations/clients/:client_id` extends js.Object
  
  @js.native
  sealed trait `PUT /authorizations/clients/:client_id/:fingerprint` extends js.Object
  
  @js.native
  sealed trait `PUT /gists/:gist_id/star` extends js.Object
  
  @js.native
  sealed trait `PUT /notifications` extends js.Object
  
  @js.native
  sealed trait `PUT /notifications/threads/:thread_id/subscription` extends js.Object
  
  @js.native
  sealed trait `PUT /orgs/:org/blocks/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /orgs/:org/interaction-limits` extends js.Object
  
  @js.native
  sealed trait `PUT /orgs/:org/memberships/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /orgs/:org/outside_collaborators/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /orgs/:org/public_members/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /projects/:project_id/collaborators/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/automated-security-fixes` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/branches/:branch/protection` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/collaborators/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/contents/:path` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/import` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/interaction-limits` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/issues/:issue_number/labels` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/issues/:issue_number/lock` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/notifications` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/pages` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/pulls/:pull_number/merge` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/pulls/:pull_number/update-branch` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/subscription` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/topics` extends js.Object
  
  @js.native
  sealed trait `PUT /repos/:owner/:repo/vulnerability-alerts` extends js.Object
  
  @js.native
  sealed trait `PUT /scim/v2/organizations/:org/Users/:scim_user_id` extends js.Object
  
  @js.native
  sealed trait `PUT /teams/:team_id/members/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /teams/:team_id/memberships/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /teams/:team_id/projects/:project_id` extends js.Object
  
  @js.native
  sealed trait `PUT /teams/:team_id/repos/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `PUT /user/blocks/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /user/following/:username` extends js.Object
  
  @js.native
  sealed trait `PUT /user/installations/:installation_id/repositories/:repository_id` extends js.Object
  
  @js.native
  sealed trait `PUT /user/starred/:owner/:repo` extends js.Object
  
  @js.native
  sealed trait `PUT /user/subscriptions/:owner/:repo` extends js.Object
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def `DELETE /app/installations/:installation_id`: `DELETE /app/installations/:installation_id` = "DELETE /app/installations/:installation_id".asInstanceOf[`DELETE /app/installations/:installation_id`]
  @scala.inline
  def `DELETE /applications/:client_id/grants/:access_token`: `DELETE /applications/:client_id/grants/:access_token` = "DELETE /applications/:client_id/grants/:access_token".asInstanceOf[`DELETE /applications/:client_id/grants/:access_token`]
  @scala.inline
  def `DELETE /applications/:client_id/tokens/:access_token`: `DELETE /applications/:client_id/tokens/:access_token` = "DELETE /applications/:client_id/tokens/:access_token".asInstanceOf[`DELETE /applications/:client_id/tokens/:access_token`]
  @scala.inline
  def `DELETE /applications/grants/:grant_id`: `DELETE /applications/grants/:grant_id` = "DELETE /applications/grants/:grant_id".asInstanceOf[`DELETE /applications/grants/:grant_id`]
  @scala.inline
  def `DELETE /authorizations/:authorization_id`: `DELETE /authorizations/:authorization_id` = "DELETE /authorizations/:authorization_id".asInstanceOf[`DELETE /authorizations/:authorization_id`]
  @scala.inline
  def `DELETE /gists/:gist_id`: `DELETE /gists/:gist_id` = "DELETE /gists/:gist_id".asInstanceOf[`DELETE /gists/:gist_id`]
  @scala.inline
  def `DELETE /gists/:gist_id/comments/:comment_id`: `DELETE /gists/:gist_id/comments/:comment_id` = "DELETE /gists/:gist_id/comments/:comment_id".asInstanceOf[`DELETE /gists/:gist_id/comments/:comment_id`]
  @scala.inline
  def `DELETE /gists/:gist_id/star`: `DELETE /gists/:gist_id/star` = "DELETE /gists/:gist_id/star".asInstanceOf[`DELETE /gists/:gist_id/star`]
  @scala.inline
  def `DELETE /notifications/threads/:thread_id/subscription`: `DELETE /notifications/threads/:thread_id/subscription` = "DELETE /notifications/threads/:thread_id/subscription".asInstanceOf[`DELETE /notifications/threads/:thread_id/subscription`]
  @scala.inline
  def `DELETE /orgs/:org/blocks/:username`: `DELETE /orgs/:org/blocks/:username` = "DELETE /orgs/:org/blocks/:username".asInstanceOf[`DELETE /orgs/:org/blocks/:username`]
  @scala.inline
  def `DELETE /orgs/:org/credential-authorizations/:credential_id`: `DELETE /orgs/:org/credential-authorizations/:credential_id` = "DELETE /orgs/:org/credential-authorizations/:credential_id".asInstanceOf[`DELETE /orgs/:org/credential-authorizations/:credential_id`]
  @scala.inline
  def `DELETE /orgs/:org/hooks/:hook_id`: `DELETE /orgs/:org/hooks/:hook_id` = "DELETE /orgs/:org/hooks/:hook_id".asInstanceOf[`DELETE /orgs/:org/hooks/:hook_id`]
  @scala.inline
  def `DELETE /orgs/:org/interaction-limits`: `DELETE /orgs/:org/interaction-limits` = "DELETE /orgs/:org/interaction-limits".asInstanceOf[`DELETE /orgs/:org/interaction-limits`]
  @scala.inline
  def `DELETE /orgs/:org/members/:username`: `DELETE /orgs/:org/members/:username` = "DELETE /orgs/:org/members/:username".asInstanceOf[`DELETE /orgs/:org/members/:username`]
  @scala.inline
  def `DELETE /orgs/:org/memberships/:username`: `DELETE /orgs/:org/memberships/:username` = "DELETE /orgs/:org/memberships/:username".asInstanceOf[`DELETE /orgs/:org/memberships/:username`]
  @scala.inline
  def `DELETE /orgs/:org/migrations/:migration_id/archive`: `DELETE /orgs/:org/migrations/:migration_id/archive` = "DELETE /orgs/:org/migrations/:migration_id/archive".asInstanceOf[`DELETE /orgs/:org/migrations/:migration_id/archive`]
  @scala.inline
  def `DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock`: `DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock` = "DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock".asInstanceOf[`DELETE /orgs/:org/migrations/:migration_id/repos/:repo_name/lock`]
  @scala.inline
  def `DELETE /orgs/:org/outside_collaborators/:username`: `DELETE /orgs/:org/outside_collaborators/:username` = "DELETE /orgs/:org/outside_collaborators/:username".asInstanceOf[`DELETE /orgs/:org/outside_collaborators/:username`]
  @scala.inline
  def `DELETE /orgs/:org/public_members/:username`: `DELETE /orgs/:org/public_members/:username` = "DELETE /orgs/:org/public_members/:username".asInstanceOf[`DELETE /orgs/:org/public_members/:username`]
  @scala.inline
  def `DELETE /projects/:project_id`: `DELETE /projects/:project_id` = "DELETE /projects/:project_id".asInstanceOf[`DELETE /projects/:project_id`]
  @scala.inline
  def `DELETE /projects/:project_id/collaborators/:username`: `DELETE /projects/:project_id/collaborators/:username` = "DELETE /projects/:project_id/collaborators/:username".asInstanceOf[`DELETE /projects/:project_id/collaborators/:username`]
  @scala.inline
  def `DELETE /projects/columns/:column_id`: `DELETE /projects/columns/:column_id` = "DELETE /projects/columns/:column_id".asInstanceOf[`DELETE /projects/columns/:column_id`]
  @scala.inline
  def `DELETE /projects/columns/cards/:card_id`: `DELETE /projects/columns/cards/:card_id` = "DELETE /projects/columns/cards/:card_id".asInstanceOf[`DELETE /projects/columns/cards/:card_id`]
  @scala.inline
  def `DELETE /reactions/:reaction_id`: `DELETE /reactions/:reaction_id` = "DELETE /reactions/:reaction_id".asInstanceOf[`DELETE /reactions/:reaction_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo`: `DELETE /repos/:owner/:repo` = "DELETE /repos/:owner/:repo".asInstanceOf[`DELETE /repos/:owner/:repo`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/automated-security-fixes`: `DELETE /repos/:owner/:repo/automated-security-fixes` = "DELETE /repos/:owner/:repo/automated-security-fixes".asInstanceOf[`DELETE /repos/:owner/:repo/automated-security-fixes`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection`: `DELETE /repos/:owner/:repo/branches/:branch/protection` = "DELETE /repos/:owner/:repo/branches/:branch/protection".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: `DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins` = "DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/enforce_admins`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: `DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews` = "DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures`: `DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures` = "DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/required_signatures`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks` = "DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: `DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` = "DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions`: `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions` = "DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` = "DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: `DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users` = "DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users".asInstanceOf[`DELETE /repos/:owner/:repo/branches/:branch/protection/restrictions/users`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/collaborators/:username`: `DELETE /repos/:owner/:repo/collaborators/:username` = "DELETE /repos/:owner/:repo/collaborators/:username".asInstanceOf[`DELETE /repos/:owner/:repo/collaborators/:username`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/comments/:comment_id`: `DELETE /repos/:owner/:repo/comments/:comment_id` = "DELETE /repos/:owner/:repo/comments/:comment_id".asInstanceOf[`DELETE /repos/:owner/:repo/comments/:comment_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/contents/:path`: `DELETE /repos/:owner/:repo/contents/:path` = "DELETE /repos/:owner/:repo/contents/:path".asInstanceOf[`DELETE /repos/:owner/:repo/contents/:path`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/downloads/:download_id`: `DELETE /repos/:owner/:repo/downloads/:download_id` = "DELETE /repos/:owner/:repo/downloads/:download_id".asInstanceOf[`DELETE /repos/:owner/:repo/downloads/:download_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/git/refs/:ref`: `DELETE /repos/:owner/:repo/git/refs/:ref` = "DELETE /repos/:owner/:repo/git/refs/:ref".asInstanceOf[`DELETE /repos/:owner/:repo/git/refs/:ref`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/hooks/:hook_id`: `DELETE /repos/:owner/:repo/hooks/:hook_id` = "DELETE /repos/:owner/:repo/hooks/:hook_id".asInstanceOf[`DELETE /repos/:owner/:repo/hooks/:hook_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/import`: `DELETE /repos/:owner/:repo/import` = "DELETE /repos/:owner/:repo/import".asInstanceOf[`DELETE /repos/:owner/:repo/import`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/interaction-limits`: `DELETE /repos/:owner/:repo/interaction-limits` = "DELETE /repos/:owner/:repo/interaction-limits".asInstanceOf[`DELETE /repos/:owner/:repo/interaction-limits`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/invitations/:invitation_id`: `DELETE /repos/:owner/:repo/invitations/:invitation_id` = "DELETE /repos/:owner/:repo/invitations/:invitation_id".asInstanceOf[`DELETE /repos/:owner/:repo/invitations/:invitation_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/issues/:issue_number/assignees`: `DELETE /repos/:owner/:repo/issues/:issue_number/assignees` = "DELETE /repos/:owner/:repo/issues/:issue_number/assignees".asInstanceOf[`DELETE /repos/:owner/:repo/issues/:issue_number/assignees`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/issues/:issue_number/labels`: `DELETE /repos/:owner/:repo/issues/:issue_number/labels` = "DELETE /repos/:owner/:repo/issues/:issue_number/labels".asInstanceOf[`DELETE /repos/:owner/:repo/issues/:issue_number/labels`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name`: `DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name` = "DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name".asInstanceOf[`DELETE /repos/:owner/:repo/issues/:issue_number/labels/:name`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/issues/:issue_number/lock`: `DELETE /repos/:owner/:repo/issues/:issue_number/lock` = "DELETE /repos/:owner/:repo/issues/:issue_number/lock".asInstanceOf[`DELETE /repos/:owner/:repo/issues/:issue_number/lock`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/issues/comments/:comment_id`: `DELETE /repos/:owner/:repo/issues/comments/:comment_id` = "DELETE /repos/:owner/:repo/issues/comments/:comment_id".asInstanceOf[`DELETE /repos/:owner/:repo/issues/comments/:comment_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/keys/:key_id`: `DELETE /repos/:owner/:repo/keys/:key_id` = "DELETE /repos/:owner/:repo/keys/:key_id".asInstanceOf[`DELETE /repos/:owner/:repo/keys/:key_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/labels/:name`: `DELETE /repos/:owner/:repo/labels/:name` = "DELETE /repos/:owner/:repo/labels/:name".asInstanceOf[`DELETE /repos/:owner/:repo/labels/:name`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/milestones/:milestone_number`: `DELETE /repos/:owner/:repo/milestones/:milestone_number` = "DELETE /repos/:owner/:repo/milestones/:milestone_number".asInstanceOf[`DELETE /repos/:owner/:repo/milestones/:milestone_number`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/pages`: `DELETE /repos/:owner/:repo/pages` = "DELETE /repos/:owner/:repo/pages".asInstanceOf[`DELETE /repos/:owner/:repo/pages`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: `DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers` = "DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers".asInstanceOf[`DELETE /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: `DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id` = "DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id".asInstanceOf[`DELETE /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/pulls/comments/:comment_id`: `DELETE /repos/:owner/:repo/pulls/comments/:comment_id` = "DELETE /repos/:owner/:repo/pulls/comments/:comment_id".asInstanceOf[`DELETE /repos/:owner/:repo/pulls/comments/:comment_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/releases/:release_id`: `DELETE /repos/:owner/:repo/releases/:release_id` = "DELETE /repos/:owner/:repo/releases/:release_id".asInstanceOf[`DELETE /repos/:owner/:repo/releases/:release_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/releases/assets/:asset_id`: `DELETE /repos/:owner/:repo/releases/assets/:asset_id` = "DELETE /repos/:owner/:repo/releases/assets/:asset_id".asInstanceOf[`DELETE /repos/:owner/:repo/releases/assets/:asset_id`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/subscription`: `DELETE /repos/:owner/:repo/subscription` = "DELETE /repos/:owner/:repo/subscription".asInstanceOf[`DELETE /repos/:owner/:repo/subscription`]
  @scala.inline
  def `DELETE /repos/:owner/:repo/vulnerability-alerts`: `DELETE /repos/:owner/:repo/vulnerability-alerts` = "DELETE /repos/:owner/:repo/vulnerability-alerts".asInstanceOf[`DELETE /repos/:owner/:repo/vulnerability-alerts`]
  @scala.inline
  def `DELETE /scim/v2/organizations/:org/Users/:scim_user_id`: `DELETE /scim/v2/organizations/:org/Users/:scim_user_id` = "DELETE /scim/v2/organizations/:org/Users/:scim_user_id".asInstanceOf[`DELETE /scim/v2/organizations/:org/Users/:scim_user_id`]
  @scala.inline
  def `DELETE /teams/:team_id`: `DELETE /teams/:team_id` = "DELETE /teams/:team_id".asInstanceOf[`DELETE /teams/:team_id`]
  @scala.inline
  def `DELETE /teams/:team_id/discussions/:discussion_number`: `DELETE /teams/:team_id/discussions/:discussion_number` = "DELETE /teams/:team_id/discussions/:discussion_number".asInstanceOf[`DELETE /teams/:team_id/discussions/:discussion_number`]
  @scala.inline
  def `DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: `DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number` = "DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number".asInstanceOf[`DELETE /teams/:team_id/discussions/:discussion_number/comments/:comment_number`]
  @scala.inline
  def `DELETE /teams/:team_id/members/:username`: `DELETE /teams/:team_id/members/:username` = "DELETE /teams/:team_id/members/:username".asInstanceOf[`DELETE /teams/:team_id/members/:username`]
  @scala.inline
  def `DELETE /teams/:team_id/memberships/:username`: `DELETE /teams/:team_id/memberships/:username` = "DELETE /teams/:team_id/memberships/:username".asInstanceOf[`DELETE /teams/:team_id/memberships/:username`]
  @scala.inline
  def `DELETE /teams/:team_id/projects/:project_id`: `DELETE /teams/:team_id/projects/:project_id` = "DELETE /teams/:team_id/projects/:project_id".asInstanceOf[`DELETE /teams/:team_id/projects/:project_id`]
  @scala.inline
  def `DELETE /teams/:team_id/repos/:owner/:repo`: `DELETE /teams/:team_id/repos/:owner/:repo` = "DELETE /teams/:team_id/repos/:owner/:repo".asInstanceOf[`DELETE /teams/:team_id/repos/:owner/:repo`]
  @scala.inline
  def `DELETE /user/blocks/:username`: `DELETE /user/blocks/:username` = "DELETE /user/blocks/:username".asInstanceOf[`DELETE /user/blocks/:username`]
  @scala.inline
  def `DELETE /user/emails`: `DELETE /user/emails` = "DELETE /user/emails".asInstanceOf[`DELETE /user/emails`]
  @scala.inline
  def `DELETE /user/following/:username`: `DELETE /user/following/:username` = "DELETE /user/following/:username".asInstanceOf[`DELETE /user/following/:username`]
  @scala.inline
  def `DELETE /user/gpg_keys/:gpg_key_id`: `DELETE /user/gpg_keys/:gpg_key_id` = "DELETE /user/gpg_keys/:gpg_key_id".asInstanceOf[`DELETE /user/gpg_keys/:gpg_key_id`]
  @scala.inline
  def `DELETE /user/installations/:installation_id/repositories/:repository_id`: `DELETE /user/installations/:installation_id/repositories/:repository_id` = "DELETE /user/installations/:installation_id/repositories/:repository_id".asInstanceOf[`DELETE /user/installations/:installation_id/repositories/:repository_id`]
  @scala.inline
  def `DELETE /user/keys/:key_id`: `DELETE /user/keys/:key_id` = "DELETE /user/keys/:key_id".asInstanceOf[`DELETE /user/keys/:key_id`]
  @scala.inline
  def `DELETE /user/migrations/:migration_id/archive`: `DELETE /user/migrations/:migration_id/archive` = "DELETE /user/migrations/:migration_id/archive".asInstanceOf[`DELETE /user/migrations/:migration_id/archive`]
  @scala.inline
  def `DELETE /user/migrations/:migration_id/repos/:repo_name/lock`: `DELETE /user/migrations/:migration_id/repos/:repo_name/lock` = "DELETE /user/migrations/:migration_id/repos/:repo_name/lock".asInstanceOf[`DELETE /user/migrations/:migration_id/repos/:repo_name/lock`]
  @scala.inline
  def `DELETE /user/repository_invitations/:invitation_id`: `DELETE /user/repository_invitations/:invitation_id` = "DELETE /user/repository_invitations/:invitation_id".asInstanceOf[`DELETE /user/repository_invitations/:invitation_id`]
  @scala.inline
  def `DELETE /user/starred/:owner/:repo`: `DELETE /user/starred/:owner/:repo` = "DELETE /user/starred/:owner/:repo".asInstanceOf[`DELETE /user/starred/:owner/:repo`]
  @scala.inline
  def `DELETE /user/subscriptions/:owner/:repo`: `DELETE /user/subscriptions/:owner/:repo` = "DELETE /user/subscriptions/:owner/:repo".asInstanceOf[`DELETE /user/subscriptions/:owner/:repo`]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def `GET /app`: `GET /app` = "GET /app".asInstanceOf[`GET /app`]
  @scala.inline
  def `GET /app/installations`: `GET /app/installations` = "GET /app/installations".asInstanceOf[`GET /app/installations`]
  @scala.inline
  def `GET /app/installations/:installation_id`: `GET /app/installations/:installation_id` = "GET /app/installations/:installation_id".asInstanceOf[`GET /app/installations/:installation_id`]
  @scala.inline
  def `GET /applications/:client_id/tokens/:access_token`: `GET /applications/:client_id/tokens/:access_token` = "GET /applications/:client_id/tokens/:access_token".asInstanceOf[`GET /applications/:client_id/tokens/:access_token`]
  @scala.inline
  def `GET /applications/grants`: `GET /applications/grants` = "GET /applications/grants".asInstanceOf[`GET /applications/grants`]
  @scala.inline
  def `GET /applications/grants/:grant_id`: `GET /applications/grants/:grant_id` = "GET /applications/grants/:grant_id".asInstanceOf[`GET /applications/grants/:grant_id`]
  @scala.inline
  def `GET /apps/:app_slug`: `GET /apps/:app_slug` = "GET /apps/:app_slug".asInstanceOf[`GET /apps/:app_slug`]
  @scala.inline
  def `GET /authorizations`: `GET /authorizations` = "GET /authorizations".asInstanceOf[`GET /authorizations`]
  @scala.inline
  def `GET /authorizations/:authorization_id`: `GET /authorizations/:authorization_id` = "GET /authorizations/:authorization_id".asInstanceOf[`GET /authorizations/:authorization_id`]
  @scala.inline
  def `GET /codes_of_conduct`: `GET /codes_of_conduct` = "GET /codes_of_conduct".asInstanceOf[`GET /codes_of_conduct`]
  @scala.inline
  def `GET /codes_of_conduct/:key`: `GET /codes_of_conduct/:key` = "GET /codes_of_conduct/:key".asInstanceOf[`GET /codes_of_conduct/:key`]
  @scala.inline
  def `GET /emojis`: `GET /emojis` = "GET /emojis".asInstanceOf[`GET /emojis`]
  @scala.inline
  def `GET /events`: `GET /events` = "GET /events".asInstanceOf[`GET /events`]
  @scala.inline
  def `GET /feeds`: `GET /feeds` = "GET /feeds".asInstanceOf[`GET /feeds`]
  @scala.inline
  def `GET /gists`: `GET /gists` = "GET /gists".asInstanceOf[`GET /gists`]
  @scala.inline
  def `GET /gists/:gist_id`: `GET /gists/:gist_id` = "GET /gists/:gist_id".asInstanceOf[`GET /gists/:gist_id`]
  @scala.inline
  def `GET /gists/:gist_id/:sha`: `GET /gists/:gist_id/:sha` = "GET /gists/:gist_id/:sha".asInstanceOf[`GET /gists/:gist_id/:sha`]
  @scala.inline
  def `GET /gists/:gist_id/comments`: `GET /gists/:gist_id/comments` = "GET /gists/:gist_id/comments".asInstanceOf[`GET /gists/:gist_id/comments`]
  @scala.inline
  def `GET /gists/:gist_id/comments/:comment_id`: `GET /gists/:gist_id/comments/:comment_id` = "GET /gists/:gist_id/comments/:comment_id".asInstanceOf[`GET /gists/:gist_id/comments/:comment_id`]
  @scala.inline
  def `GET /gists/:gist_id/commits`: `GET /gists/:gist_id/commits` = "GET /gists/:gist_id/commits".asInstanceOf[`GET /gists/:gist_id/commits`]
  @scala.inline
  def `GET /gists/:gist_id/forks`: `GET /gists/:gist_id/forks` = "GET /gists/:gist_id/forks".asInstanceOf[`GET /gists/:gist_id/forks`]
  @scala.inline
  def `GET /gists/:gist_id/star`: `GET /gists/:gist_id/star` = "GET /gists/:gist_id/star".asInstanceOf[`GET /gists/:gist_id/star`]
  @scala.inline
  def `GET /gists/public`: `GET /gists/public` = "GET /gists/public".asInstanceOf[`GET /gists/public`]
  @scala.inline
  def `GET /gists/starred`: `GET /gists/starred` = "GET /gists/starred".asInstanceOf[`GET /gists/starred`]
  @scala.inline
  def `GET /gitignore/templates`: `GET /gitignore/templates` = "GET /gitignore/templates".asInstanceOf[`GET /gitignore/templates`]
  @scala.inline
  def `GET /gitignore/templates/:name`: `GET /gitignore/templates/:name` = "GET /gitignore/templates/:name".asInstanceOf[`GET /gitignore/templates/:name`]
  @scala.inline
  def `GET /installation/repositories`: `GET /installation/repositories` = "GET /installation/repositories".asInstanceOf[`GET /installation/repositories`]
  @scala.inline
  def `GET /issues`: `GET /issues` = "GET /issues".asInstanceOf[`GET /issues`]
  @scala.inline
  def `GET /legacy/issues/search/:owner/:repository/:state/:keyword`: `GET /legacy/issues/search/:owner/:repository/:state/:keyword` = "GET /legacy/issues/search/:owner/:repository/:state/:keyword".asInstanceOf[`GET /legacy/issues/search/:owner/:repository/:state/:keyword`]
  @scala.inline
  def `GET /legacy/repos/search/:keyword`: `GET /legacy/repos/search/:keyword` = "GET /legacy/repos/search/:keyword".asInstanceOf[`GET /legacy/repos/search/:keyword`]
  @scala.inline
  def `GET /legacy/user/email/:email`: `GET /legacy/user/email/:email` = "GET /legacy/user/email/:email".asInstanceOf[`GET /legacy/user/email/:email`]
  @scala.inline
  def `GET /legacy/user/search/:keyword`: `GET /legacy/user/search/:keyword` = "GET /legacy/user/search/:keyword".asInstanceOf[`GET /legacy/user/search/:keyword`]
  @scala.inline
  def `GET /licenses`: `GET /licenses` = "GET /licenses".asInstanceOf[`GET /licenses`]
  @scala.inline
  def `GET /licenses/:license`: `GET /licenses/:license` = "GET /licenses/:license".asInstanceOf[`GET /licenses/:license`]
  @scala.inline
  def `GET /marketplace_listing/accounts/:account_id`: `GET /marketplace_listing/accounts/:account_id` = "GET /marketplace_listing/accounts/:account_id".asInstanceOf[`GET /marketplace_listing/accounts/:account_id`]
  @scala.inline
  def `GET /marketplace_listing/plans`: `GET /marketplace_listing/plans` = "GET /marketplace_listing/plans".asInstanceOf[`GET /marketplace_listing/plans`]
  @scala.inline
  def `GET /marketplace_listing/plans/:plan_id/accounts`: `GET /marketplace_listing/plans/:plan_id/accounts` = "GET /marketplace_listing/plans/:plan_id/accounts".asInstanceOf[`GET /marketplace_listing/plans/:plan_id/accounts`]
  @scala.inline
  def `GET /marketplace_listing/stubbed/accounts/:account_id`: `GET /marketplace_listing/stubbed/accounts/:account_id` = "GET /marketplace_listing/stubbed/accounts/:account_id".asInstanceOf[`GET /marketplace_listing/stubbed/accounts/:account_id`]
  @scala.inline
  def `GET /marketplace_listing/stubbed/plans`: `GET /marketplace_listing/stubbed/plans` = "GET /marketplace_listing/stubbed/plans".asInstanceOf[`GET /marketplace_listing/stubbed/plans`]
  @scala.inline
  def `GET /marketplace_listing/stubbed/plans/:plan_id/accounts`: `GET /marketplace_listing/stubbed/plans/:plan_id/accounts` = "GET /marketplace_listing/stubbed/plans/:plan_id/accounts".asInstanceOf[`GET /marketplace_listing/stubbed/plans/:plan_id/accounts`]
  @scala.inline
  def `GET /meta`: `GET /meta` = "GET /meta".asInstanceOf[`GET /meta`]
  @scala.inline
  def `GET /networks/:owner/:repo/events`: `GET /networks/:owner/:repo/events` = "GET /networks/:owner/:repo/events".asInstanceOf[`GET /networks/:owner/:repo/events`]
  @scala.inline
  def `GET /notifications`: `GET /notifications` = "GET /notifications".asInstanceOf[`GET /notifications`]
  @scala.inline
  def `GET /notifications/threads/:thread_id`: `GET /notifications/threads/:thread_id` = "GET /notifications/threads/:thread_id".asInstanceOf[`GET /notifications/threads/:thread_id`]
  @scala.inline
  def `GET /notifications/threads/:thread_id/subscription`: `GET /notifications/threads/:thread_id/subscription` = "GET /notifications/threads/:thread_id/subscription".asInstanceOf[`GET /notifications/threads/:thread_id/subscription`]
  @scala.inline
  def `GET /organizations`: `GET /organizations` = "GET /organizations".asInstanceOf[`GET /organizations`]
  @scala.inline
  def `GET /orgs/:org`: `GET /orgs/:org` = "GET /orgs/:org".asInstanceOf[`GET /orgs/:org`]
  @scala.inline
  def `GET /orgs/:org/blocks`: `GET /orgs/:org/blocks` = "GET /orgs/:org/blocks".asInstanceOf[`GET /orgs/:org/blocks`]
  @scala.inline
  def `GET /orgs/:org/blocks/:username`: `GET /orgs/:org/blocks/:username` = "GET /orgs/:org/blocks/:username".asInstanceOf[`GET /orgs/:org/blocks/:username`]
  @scala.inline
  def `GET /orgs/:org/credential-authorizations`: `GET /orgs/:org/credential-authorizations` = "GET /orgs/:org/credential-authorizations".asInstanceOf[`GET /orgs/:org/credential-authorizations`]
  @scala.inline
  def `GET /orgs/:org/events`: `GET /orgs/:org/events` = "GET /orgs/:org/events".asInstanceOf[`GET /orgs/:org/events`]
  @scala.inline
  def `GET /orgs/:org/hooks`: `GET /orgs/:org/hooks` = "GET /orgs/:org/hooks".asInstanceOf[`GET /orgs/:org/hooks`]
  @scala.inline
  def `GET /orgs/:org/hooks/:hook_id`: `GET /orgs/:org/hooks/:hook_id` = "GET /orgs/:org/hooks/:hook_id".asInstanceOf[`GET /orgs/:org/hooks/:hook_id`]
  @scala.inline
  def `GET /orgs/:org/installation`: `GET /orgs/:org/installation` = "GET /orgs/:org/installation".asInstanceOf[`GET /orgs/:org/installation`]
  @scala.inline
  def `GET /orgs/:org/interaction-limits`: `GET /orgs/:org/interaction-limits` = "GET /orgs/:org/interaction-limits".asInstanceOf[`GET /orgs/:org/interaction-limits`]
  @scala.inline
  def `GET /orgs/:org/invitations`: `GET /orgs/:org/invitations` = "GET /orgs/:org/invitations".asInstanceOf[`GET /orgs/:org/invitations`]
  @scala.inline
  def `GET /orgs/:org/invitations/:invitation_id/teams`: `GET /orgs/:org/invitations/:invitation_id/teams` = "GET /orgs/:org/invitations/:invitation_id/teams".asInstanceOf[`GET /orgs/:org/invitations/:invitation_id/teams`]
  @scala.inline
  def `GET /orgs/:org/issues`: `GET /orgs/:org/issues` = "GET /orgs/:org/issues".asInstanceOf[`GET /orgs/:org/issues`]
  @scala.inline
  def `GET /orgs/:org/members`: `GET /orgs/:org/members` = "GET /orgs/:org/members".asInstanceOf[`GET /orgs/:org/members`]
  @scala.inline
  def `GET /orgs/:org/members/:username`: `GET /orgs/:org/members/:username` = "GET /orgs/:org/members/:username".asInstanceOf[`GET /orgs/:org/members/:username`]
  @scala.inline
  def `GET /orgs/:org/memberships/:username`: `GET /orgs/:org/memberships/:username` = "GET /orgs/:org/memberships/:username".asInstanceOf[`GET /orgs/:org/memberships/:username`]
  @scala.inline
  def `GET /orgs/:org/migrations`: `GET /orgs/:org/migrations` = "GET /orgs/:org/migrations".asInstanceOf[`GET /orgs/:org/migrations`]
  @scala.inline
  def `GET /orgs/:org/migrations/:migration_id`: `GET /orgs/:org/migrations/:migration_id` = "GET /orgs/:org/migrations/:migration_id".asInstanceOf[`GET /orgs/:org/migrations/:migration_id`]
  @scala.inline
  def `GET /orgs/:org/migrations/:migration_id/archive`: `GET /orgs/:org/migrations/:migration_id/archive` = "GET /orgs/:org/migrations/:migration_id/archive".asInstanceOf[`GET /orgs/:org/migrations/:migration_id/archive`]
  @scala.inline
  def `GET /orgs/:org/outside_collaborators`: `GET /orgs/:org/outside_collaborators` = "GET /orgs/:org/outside_collaborators".asInstanceOf[`GET /orgs/:org/outside_collaborators`]
  @scala.inline
  def `GET /orgs/:org/projects`: `GET /orgs/:org/projects` = "GET /orgs/:org/projects".asInstanceOf[`GET /orgs/:org/projects`]
  @scala.inline
  def `GET /orgs/:org/public_members`: `GET /orgs/:org/public_members` = "GET /orgs/:org/public_members".asInstanceOf[`GET /orgs/:org/public_members`]
  @scala.inline
  def `GET /orgs/:org/public_members/:username`: `GET /orgs/:org/public_members/:username` = "GET /orgs/:org/public_members/:username".asInstanceOf[`GET /orgs/:org/public_members/:username`]
  @scala.inline
  def `GET /orgs/:org/repos`: `GET /orgs/:org/repos` = "GET /orgs/:org/repos".asInstanceOf[`GET /orgs/:org/repos`]
  @scala.inline
  def `GET /orgs/:org/team-sync/groups`: `GET /orgs/:org/team-sync/groups` = "GET /orgs/:org/team-sync/groups".asInstanceOf[`GET /orgs/:org/team-sync/groups`]
  @scala.inline
  def `GET /orgs/:org/teams`: `GET /orgs/:org/teams` = "GET /orgs/:org/teams".asInstanceOf[`GET /orgs/:org/teams`]
  @scala.inline
  def `GET /orgs/:org/teams/:team_slug`: `GET /orgs/:org/teams/:team_slug` = "GET /orgs/:org/teams/:team_slug".asInstanceOf[`GET /orgs/:org/teams/:team_slug`]
  @scala.inline
  def `GET /projects/:project_id`: `GET /projects/:project_id` = "GET /projects/:project_id".asInstanceOf[`GET /projects/:project_id`]
  @scala.inline
  def `GET /projects/:project_id/collaborators`: `GET /projects/:project_id/collaborators` = "GET /projects/:project_id/collaborators".asInstanceOf[`GET /projects/:project_id/collaborators`]
  @scala.inline
  def `GET /projects/:project_id/collaborators/:username/permission`: `GET /projects/:project_id/collaborators/:username/permission` = "GET /projects/:project_id/collaborators/:username/permission".asInstanceOf[`GET /projects/:project_id/collaborators/:username/permission`]
  @scala.inline
  def `GET /projects/:project_id/columns`: `GET /projects/:project_id/columns` = "GET /projects/:project_id/columns".asInstanceOf[`GET /projects/:project_id/columns`]
  @scala.inline
  def `GET /projects/columns/:column_id`: `GET /projects/columns/:column_id` = "GET /projects/columns/:column_id".asInstanceOf[`GET /projects/columns/:column_id`]
  @scala.inline
  def `GET /projects/columns/:column_id/cards`: `GET /projects/columns/:column_id/cards` = "GET /projects/columns/:column_id/cards".asInstanceOf[`GET /projects/columns/:column_id/cards`]
  @scala.inline
  def `GET /projects/columns/cards/:card_id`: `GET /projects/columns/cards/:card_id` = "GET /projects/columns/cards/:card_id".asInstanceOf[`GET /projects/columns/cards/:card_id`]
  @scala.inline
  def `GET /rate_limit`: `GET /rate_limit` = "GET /rate_limit".asInstanceOf[`GET /rate_limit`]
  @scala.inline
  def `GET /repos/:owner/:repo`: `GET /repos/:owner/:repo` = "GET /repos/:owner/:repo".asInstanceOf[`GET /repos/:owner/:repo`]
  @scala.inline
  def `GET /repos/:owner/:repo/:archive_format/:ref`: `GET /repos/:owner/:repo/:archive_format/:ref` = "GET /repos/:owner/:repo/:archive_format/:ref".asInstanceOf[`GET /repos/:owner/:repo/:archive_format/:ref`]
  @scala.inline
  def `GET /repos/:owner/:repo/assignees`: `GET /repos/:owner/:repo/assignees` = "GET /repos/:owner/:repo/assignees".asInstanceOf[`GET /repos/:owner/:repo/assignees`]
  @scala.inline
  def `GET /repos/:owner/:repo/assignees/:assignee`: `GET /repos/:owner/:repo/assignees/:assignee` = "GET /repos/:owner/:repo/assignees/:assignee".asInstanceOf[`GET /repos/:owner/:repo/assignees/:assignee`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches`: `GET /repos/:owner/:repo/branches` = "GET /repos/:owner/:repo/branches".asInstanceOf[`GET /repos/:owner/:repo/branches`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch`: `GET /repos/:owner/:repo/branches/:branch` = "GET /repos/:owner/:repo/branches/:branch".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection`: `GET /repos/:owner/:repo/branches/:branch/protection` = "GET /repos/:owner/:repo/branches/:branch/protection".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: `GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins` = "GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/enforce_admins`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: `GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews` = "GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/required_signatures`: `GET /repos/:owner/:repo/branches/:branch/protection/required_signatures` = "GET /repos/:owner/:repo/branches/:branch/protection/required_signatures".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/required_signatures`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks` = "GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: `GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` = "GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/restrictions`: `GET /repos/:owner/:repo/branches/:branch/protection/restrictions` = "GET /repos/:owner/:repo/branches/:branch/protection/restrictions".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/restrictions`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` = "GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`]
  @scala.inline
  def `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: `GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users` = "GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users".asInstanceOf[`GET /repos/:owner/:repo/branches/:branch/protection/restrictions/users`]
  @scala.inline
  def `GET /repos/:owner/:repo/check-runs/:check_run_id`: `GET /repos/:owner/:repo/check-runs/:check_run_id` = "GET /repos/:owner/:repo/check-runs/:check_run_id".asInstanceOf[`GET /repos/:owner/:repo/check-runs/:check_run_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/check-runs/:check_run_id/annotations`: `GET /repos/:owner/:repo/check-runs/:check_run_id/annotations` = "GET /repos/:owner/:repo/check-runs/:check_run_id/annotations".asInstanceOf[`GET /repos/:owner/:repo/check-runs/:check_run_id/annotations`]
  @scala.inline
  def `GET /repos/:owner/:repo/check-suites/:check_suite_id`: `GET /repos/:owner/:repo/check-suites/:check_suite_id` = "GET /repos/:owner/:repo/check-suites/:check_suite_id".asInstanceOf[`GET /repos/:owner/:repo/check-suites/:check_suite_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs`: `GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs` = "GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs".asInstanceOf[`GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs`]
  @scala.inline
  def `GET /repos/:owner/:repo/collaborators`: `GET /repos/:owner/:repo/collaborators` = "GET /repos/:owner/:repo/collaborators".asInstanceOf[`GET /repos/:owner/:repo/collaborators`]
  @scala.inline
  def `GET /repos/:owner/:repo/collaborators/:username`: `GET /repos/:owner/:repo/collaborators/:username` = "GET /repos/:owner/:repo/collaborators/:username".asInstanceOf[`GET /repos/:owner/:repo/collaborators/:username`]
  @scala.inline
  def `GET /repos/:owner/:repo/collaborators/:username/permission`: `GET /repos/:owner/:repo/collaborators/:username/permission` = "GET /repos/:owner/:repo/collaborators/:username/permission".asInstanceOf[`GET /repos/:owner/:repo/collaborators/:username/permission`]
  @scala.inline
  def `GET /repos/:owner/:repo/comments`: `GET /repos/:owner/:repo/comments` = "GET /repos/:owner/:repo/comments".asInstanceOf[`GET /repos/:owner/:repo/comments`]
  @scala.inline
  def `GET /repos/:owner/:repo/comments/:comment_id`: `GET /repos/:owner/:repo/comments/:comment_id` = "GET /repos/:owner/:repo/comments/:comment_id".asInstanceOf[`GET /repos/:owner/:repo/comments/:comment_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/comments/:comment_id/reactions`: `GET /repos/:owner/:repo/comments/:comment_id/reactions` = "GET /repos/:owner/:repo/comments/:comment_id/reactions".asInstanceOf[`GET /repos/:owner/:repo/comments/:comment_id/reactions`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits`: `GET /repos/:owner/:repo/commits` = "GET /repos/:owner/:repo/commits".asInstanceOf[`GET /repos/:owner/:repo/commits`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`: `GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head` = "GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head".asInstanceOf[`GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:commit_sha/comments`: `GET /repos/:owner/:repo/commits/:commit_sha/comments` = "GET /repos/:owner/:repo/commits/:commit_sha/comments".asInstanceOf[`GET /repos/:owner/:repo/commits/:commit_sha/comments`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:commit_sha/pulls`: `GET /repos/:owner/:repo/commits/:commit_sha/pulls` = "GET /repos/:owner/:repo/commits/:commit_sha/pulls".asInstanceOf[`GET /repos/:owner/:repo/commits/:commit_sha/pulls`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:ref`: `GET /repos/:owner/:repo/commits/:ref` = "GET /repos/:owner/:repo/commits/:ref".asInstanceOf[`GET /repos/:owner/:repo/commits/:ref`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:ref/check-runs`: `GET /repos/:owner/:repo/commits/:ref/check-runs` = "GET /repos/:owner/:repo/commits/:ref/check-runs".asInstanceOf[`GET /repos/:owner/:repo/commits/:ref/check-runs`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:ref/check-suites`: `GET /repos/:owner/:repo/commits/:ref/check-suites` = "GET /repos/:owner/:repo/commits/:ref/check-suites".asInstanceOf[`GET /repos/:owner/:repo/commits/:ref/check-suites`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:ref/status`: `GET /repos/:owner/:repo/commits/:ref/status` = "GET /repos/:owner/:repo/commits/:ref/status".asInstanceOf[`GET /repos/:owner/:repo/commits/:ref/status`]
  @scala.inline
  def `GET /repos/:owner/:repo/commits/:ref/statuses`: `GET /repos/:owner/:repo/commits/:ref/statuses` = "GET /repos/:owner/:repo/commits/:ref/statuses".asInstanceOf[`GET /repos/:owner/:repo/commits/:ref/statuses`]
  @scala.inline
  def `GET /repos/:owner/:repo/community/code_of_conduct`: `GET /repos/:owner/:repo/community/code_of_conduct` = "GET /repos/:owner/:repo/community/code_of_conduct".asInstanceOf[`GET /repos/:owner/:repo/community/code_of_conduct`]
  @scala.inline
  def `GET /repos/:owner/:repo/community/profile`: `GET /repos/:owner/:repo/community/profile` = "GET /repos/:owner/:repo/community/profile".asInstanceOf[`GET /repos/:owner/:repo/community/profile`]
  @scala.inline
  def `GET /repos/:owner/:repo/compare/:baseDOTDOTDOT:head`: `GET /repos/:owner/:repo/compare/:baseDOTDOTDOT:head` = "GET /repos/:owner/:repo/compare/:base...:head".asInstanceOf[`GET /repos/:owner/:repo/compare/:baseDOTDOTDOT:head`]
  @scala.inline
  def `GET /repos/:owner/:repo/contents/:path`: `GET /repos/:owner/:repo/contents/:path` = "GET /repos/:owner/:repo/contents/:path".asInstanceOf[`GET /repos/:owner/:repo/contents/:path`]
  @scala.inline
  def `GET /repos/:owner/:repo/contributors`: `GET /repos/:owner/:repo/contributors` = "GET /repos/:owner/:repo/contributors".asInstanceOf[`GET /repos/:owner/:repo/contributors`]
  @scala.inline
  def `GET /repos/:owner/:repo/deployments`: `GET /repos/:owner/:repo/deployments` = "GET /repos/:owner/:repo/deployments".asInstanceOf[`GET /repos/:owner/:repo/deployments`]
  @scala.inline
  def `GET /repos/:owner/:repo/deployments/:deployment_id`: `GET /repos/:owner/:repo/deployments/:deployment_id` = "GET /repos/:owner/:repo/deployments/:deployment_id".asInstanceOf[`GET /repos/:owner/:repo/deployments/:deployment_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/deployments/:deployment_id/statuses`: `GET /repos/:owner/:repo/deployments/:deployment_id/statuses` = "GET /repos/:owner/:repo/deployments/:deployment_id/statuses".asInstanceOf[`GET /repos/:owner/:repo/deployments/:deployment_id/statuses`]
  @scala.inline
  def `GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id`: `GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id` = "GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id".asInstanceOf[`GET /repos/:owner/:repo/deployments/:deployment_id/statuses/:status_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/downloads`: `GET /repos/:owner/:repo/downloads` = "GET /repos/:owner/:repo/downloads".asInstanceOf[`GET /repos/:owner/:repo/downloads`]
  @scala.inline
  def `GET /repos/:owner/:repo/downloads/:download_id`: `GET /repos/:owner/:repo/downloads/:download_id` = "GET /repos/:owner/:repo/downloads/:download_id".asInstanceOf[`GET /repos/:owner/:repo/downloads/:download_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/events`: `GET /repos/:owner/:repo/events` = "GET /repos/:owner/:repo/events".asInstanceOf[`GET /repos/:owner/:repo/events`]
  @scala.inline
  def `GET /repos/:owner/:repo/forks`: `GET /repos/:owner/:repo/forks` = "GET /repos/:owner/:repo/forks".asInstanceOf[`GET /repos/:owner/:repo/forks`]
  @scala.inline
  def `GET /repos/:owner/:repo/git/blobs/:file_sha`: `GET /repos/:owner/:repo/git/blobs/:file_sha` = "GET /repos/:owner/:repo/git/blobs/:file_sha".asInstanceOf[`GET /repos/:owner/:repo/git/blobs/:file_sha`]
  @scala.inline
  def `GET /repos/:owner/:repo/git/commits/:commit_sha`: `GET /repos/:owner/:repo/git/commits/:commit_sha` = "GET /repos/:owner/:repo/git/commits/:commit_sha".asInstanceOf[`GET /repos/:owner/:repo/git/commits/:commit_sha`]
  @scala.inline
  def `GET /repos/:owner/:repo/git/refs/:namespace`: `GET /repos/:owner/:repo/git/refs/:namespace` = "GET /repos/:owner/:repo/git/refs/:namespace".asInstanceOf[`GET /repos/:owner/:repo/git/refs/:namespace`]
  @scala.inline
  def `GET /repos/:owner/:repo/git/refs/:ref`: `GET /repos/:owner/:repo/git/refs/:ref` = "GET /repos/:owner/:repo/git/refs/:ref".asInstanceOf[`GET /repos/:owner/:repo/git/refs/:ref`]
  @scala.inline
  def `GET /repos/:owner/:repo/git/tags/:tag_sha`: `GET /repos/:owner/:repo/git/tags/:tag_sha` = "GET /repos/:owner/:repo/git/tags/:tag_sha".asInstanceOf[`GET /repos/:owner/:repo/git/tags/:tag_sha`]
  @scala.inline
  def `GET /repos/:owner/:repo/git/trees/:tree_sha`: `GET /repos/:owner/:repo/git/trees/:tree_sha` = "GET /repos/:owner/:repo/git/trees/:tree_sha".asInstanceOf[`GET /repos/:owner/:repo/git/trees/:tree_sha`]
  @scala.inline
  def `GET /repos/:owner/:repo/hooks`: `GET /repos/:owner/:repo/hooks` = "GET /repos/:owner/:repo/hooks".asInstanceOf[`GET /repos/:owner/:repo/hooks`]
  @scala.inline
  def `GET /repos/:owner/:repo/hooks/:hook_id`: `GET /repos/:owner/:repo/hooks/:hook_id` = "GET /repos/:owner/:repo/hooks/:hook_id".asInstanceOf[`GET /repos/:owner/:repo/hooks/:hook_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/import`: `GET /repos/:owner/:repo/import` = "GET /repos/:owner/:repo/import".asInstanceOf[`GET /repos/:owner/:repo/import`]
  @scala.inline
  def `GET /repos/:owner/:repo/import/authors`: `GET /repos/:owner/:repo/import/authors` = "GET /repos/:owner/:repo/import/authors".asInstanceOf[`GET /repos/:owner/:repo/import/authors`]
  @scala.inline
  def `GET /repos/:owner/:repo/import/large_files`: `GET /repos/:owner/:repo/import/large_files` = "GET /repos/:owner/:repo/import/large_files".asInstanceOf[`GET /repos/:owner/:repo/import/large_files`]
  @scala.inline
  def `GET /repos/:owner/:repo/installation`: `GET /repos/:owner/:repo/installation` = "GET /repos/:owner/:repo/installation".asInstanceOf[`GET /repos/:owner/:repo/installation`]
  @scala.inline
  def `GET /repos/:owner/:repo/interaction-limits`: `GET /repos/:owner/:repo/interaction-limits` = "GET /repos/:owner/:repo/interaction-limits".asInstanceOf[`GET /repos/:owner/:repo/interaction-limits`]
  @scala.inline
  def `GET /repos/:owner/:repo/invitations`: `GET /repos/:owner/:repo/invitations` = "GET /repos/:owner/:repo/invitations".asInstanceOf[`GET /repos/:owner/:repo/invitations`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues`: `GET /repos/:owner/:repo/issues` = "GET /repos/:owner/:repo/issues".asInstanceOf[`GET /repos/:owner/:repo/issues`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/:issue_number`: `GET /repos/:owner/:repo/issues/:issue_number` = "GET /repos/:owner/:repo/issues/:issue_number".asInstanceOf[`GET /repos/:owner/:repo/issues/:issue_number`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/:issue_number/comments`: `GET /repos/:owner/:repo/issues/:issue_number/comments` = "GET /repos/:owner/:repo/issues/:issue_number/comments".asInstanceOf[`GET /repos/:owner/:repo/issues/:issue_number/comments`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/:issue_number/events`: `GET /repos/:owner/:repo/issues/:issue_number/events` = "GET /repos/:owner/:repo/issues/:issue_number/events".asInstanceOf[`GET /repos/:owner/:repo/issues/:issue_number/events`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/:issue_number/labels`: `GET /repos/:owner/:repo/issues/:issue_number/labels` = "GET /repos/:owner/:repo/issues/:issue_number/labels".asInstanceOf[`GET /repos/:owner/:repo/issues/:issue_number/labels`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/:issue_number/reactions`: `GET /repos/:owner/:repo/issues/:issue_number/reactions` = "GET /repos/:owner/:repo/issues/:issue_number/reactions".asInstanceOf[`GET /repos/:owner/:repo/issues/:issue_number/reactions`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/:issue_number/timeline`: `GET /repos/:owner/:repo/issues/:issue_number/timeline` = "GET /repos/:owner/:repo/issues/:issue_number/timeline".asInstanceOf[`GET /repos/:owner/:repo/issues/:issue_number/timeline`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/comments`: `GET /repos/:owner/:repo/issues/comments` = "GET /repos/:owner/:repo/issues/comments".asInstanceOf[`GET /repos/:owner/:repo/issues/comments`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/comments/:comment_id`: `GET /repos/:owner/:repo/issues/comments/:comment_id` = "GET /repos/:owner/:repo/issues/comments/:comment_id".asInstanceOf[`GET /repos/:owner/:repo/issues/comments/:comment_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/comments/:comment_id/reactions`: `GET /repos/:owner/:repo/issues/comments/:comment_id/reactions` = "GET /repos/:owner/:repo/issues/comments/:comment_id/reactions".asInstanceOf[`GET /repos/:owner/:repo/issues/comments/:comment_id/reactions`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/events`: `GET /repos/:owner/:repo/issues/events` = "GET /repos/:owner/:repo/issues/events".asInstanceOf[`GET /repos/:owner/:repo/issues/events`]
  @scala.inline
  def `GET /repos/:owner/:repo/issues/events/:event_id`: `GET /repos/:owner/:repo/issues/events/:event_id` = "GET /repos/:owner/:repo/issues/events/:event_id".asInstanceOf[`GET /repos/:owner/:repo/issues/events/:event_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/keys`: `GET /repos/:owner/:repo/keys` = "GET /repos/:owner/:repo/keys".asInstanceOf[`GET /repos/:owner/:repo/keys`]
  @scala.inline
  def `GET /repos/:owner/:repo/keys/:key_id`: `GET /repos/:owner/:repo/keys/:key_id` = "GET /repos/:owner/:repo/keys/:key_id".asInstanceOf[`GET /repos/:owner/:repo/keys/:key_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/labels`: `GET /repos/:owner/:repo/labels` = "GET /repos/:owner/:repo/labels".asInstanceOf[`GET /repos/:owner/:repo/labels`]
  @scala.inline
  def `GET /repos/:owner/:repo/labels/:name`: `GET /repos/:owner/:repo/labels/:name` = "GET /repos/:owner/:repo/labels/:name".asInstanceOf[`GET /repos/:owner/:repo/labels/:name`]
  @scala.inline
  def `GET /repos/:owner/:repo/languages`: `GET /repos/:owner/:repo/languages` = "GET /repos/:owner/:repo/languages".asInstanceOf[`GET /repos/:owner/:repo/languages`]
  @scala.inline
  def `GET /repos/:owner/:repo/license`: `GET /repos/:owner/:repo/license` = "GET /repos/:owner/:repo/license".asInstanceOf[`GET /repos/:owner/:repo/license`]
  @scala.inline
  def `GET /repos/:owner/:repo/milestones`: `GET /repos/:owner/:repo/milestones` = "GET /repos/:owner/:repo/milestones".asInstanceOf[`GET /repos/:owner/:repo/milestones`]
  @scala.inline
  def `GET /repos/:owner/:repo/milestones/:milestone_number`: `GET /repos/:owner/:repo/milestones/:milestone_number` = "GET /repos/:owner/:repo/milestones/:milestone_number".asInstanceOf[`GET /repos/:owner/:repo/milestones/:milestone_number`]
  @scala.inline
  def `GET /repos/:owner/:repo/milestones/:milestone_number/labels`: `GET /repos/:owner/:repo/milestones/:milestone_number/labels` = "GET /repos/:owner/:repo/milestones/:milestone_number/labels".asInstanceOf[`GET /repos/:owner/:repo/milestones/:milestone_number/labels`]
  @scala.inline
  def `GET /repos/:owner/:repo/notifications`: `GET /repos/:owner/:repo/notifications` = "GET /repos/:owner/:repo/notifications".asInstanceOf[`GET /repos/:owner/:repo/notifications`]
  @scala.inline
  def `GET /repos/:owner/:repo/pages`: `GET /repos/:owner/:repo/pages` = "GET /repos/:owner/:repo/pages".asInstanceOf[`GET /repos/:owner/:repo/pages`]
  @scala.inline
  def `GET /repos/:owner/:repo/pages/builds`: `GET /repos/:owner/:repo/pages/builds` = "GET /repos/:owner/:repo/pages/builds".asInstanceOf[`GET /repos/:owner/:repo/pages/builds`]
  @scala.inline
  def `GET /repos/:owner/:repo/pages/builds/:build_id`: `GET /repos/:owner/:repo/pages/builds/:build_id` = "GET /repos/:owner/:repo/pages/builds/:build_id".asInstanceOf[`GET /repos/:owner/:repo/pages/builds/:build_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/pages/builds/latest`: `GET /repos/:owner/:repo/pages/builds/latest` = "GET /repos/:owner/:repo/pages/builds/latest".asInstanceOf[`GET /repos/:owner/:repo/pages/builds/latest`]
  @scala.inline
  def `GET /repos/:owner/:repo/projects`: `GET /repos/:owner/:repo/projects` = "GET /repos/:owner/:repo/projects".asInstanceOf[`GET /repos/:owner/:repo/projects`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls`: `GET /repos/:owner/:repo/pulls` = "GET /repos/:owner/:repo/pulls".asInstanceOf[`GET /repos/:owner/:repo/pulls`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number`: `GET /repos/:owner/:repo/pulls/:pull_number` = "GET /repos/:owner/:repo/pulls/:pull_number".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/comments`: `GET /repos/:owner/:repo/pulls/:pull_number/comments` = "GET /repos/:owner/:repo/pulls/:pull_number/comments".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/comments`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/commits`: `GET /repos/:owner/:repo/pulls/:pull_number/commits` = "GET /repos/:owner/:repo/pulls/:pull_number/commits".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/commits`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/files`: `GET /repos/:owner/:repo/pulls/:pull_number/files` = "GET /repos/:owner/:repo/pulls/:pull_number/files".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/files`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/merge`: `GET /repos/:owner/:repo/pulls/:pull_number/merge` = "GET /repos/:owner/:repo/pulls/:pull_number/merge".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/merge`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: `GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers` = "GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/reviews`: `GET /repos/:owner/:repo/pulls/:pull_number/reviews` = "GET /repos/:owner/:repo/pulls/:pull_number/reviews".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/reviews`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id` = "GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments`: `GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments` = "GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments".asInstanceOf[`GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/comments`: `GET /repos/:owner/:repo/pulls/comments` = "GET /repos/:owner/:repo/pulls/comments".asInstanceOf[`GET /repos/:owner/:repo/pulls/comments`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/comments/:comment_id`: `GET /repos/:owner/:repo/pulls/comments/:comment_id` = "GET /repos/:owner/:repo/pulls/comments/:comment_id".asInstanceOf[`GET /repos/:owner/:repo/pulls/comments/:comment_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions`: `GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions` = "GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions".asInstanceOf[`GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions`]
  @scala.inline
  def `GET /repos/:owner/:repo/readme`: `GET /repos/:owner/:repo/readme` = "GET /repos/:owner/:repo/readme".asInstanceOf[`GET /repos/:owner/:repo/readme`]
  @scala.inline
  def `GET /repos/:owner/:repo/releases`: `GET /repos/:owner/:repo/releases` = "GET /repos/:owner/:repo/releases".asInstanceOf[`GET /repos/:owner/:repo/releases`]
  @scala.inline
  def `GET /repos/:owner/:repo/releases/:release_id`: `GET /repos/:owner/:repo/releases/:release_id` = "GET /repos/:owner/:repo/releases/:release_id".asInstanceOf[`GET /repos/:owner/:repo/releases/:release_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/releases/:release_id/assets`: `GET /repos/:owner/:repo/releases/:release_id/assets` = "GET /repos/:owner/:repo/releases/:release_id/assets".asInstanceOf[`GET /repos/:owner/:repo/releases/:release_id/assets`]
  @scala.inline
  def `GET /repos/:owner/:repo/releases/assets/:asset_id`: `GET /repos/:owner/:repo/releases/assets/:asset_id` = "GET /repos/:owner/:repo/releases/assets/:asset_id".asInstanceOf[`GET /repos/:owner/:repo/releases/assets/:asset_id`]
  @scala.inline
  def `GET /repos/:owner/:repo/releases/latest`: `GET /repos/:owner/:repo/releases/latest` = "GET /repos/:owner/:repo/releases/latest".asInstanceOf[`GET /repos/:owner/:repo/releases/latest`]
  @scala.inline
  def `GET /repos/:owner/:repo/releases/tags/:tag`: `GET /repos/:owner/:repo/releases/tags/:tag` = "GET /repos/:owner/:repo/releases/tags/:tag".asInstanceOf[`GET /repos/:owner/:repo/releases/tags/:tag`]
  @scala.inline
  def `GET /repos/:owner/:repo/stargazers`: `GET /repos/:owner/:repo/stargazers` = "GET /repos/:owner/:repo/stargazers".asInstanceOf[`GET /repos/:owner/:repo/stargazers`]
  @scala.inline
  def `GET /repos/:owner/:repo/stats/code_frequency`: `GET /repos/:owner/:repo/stats/code_frequency` = "GET /repos/:owner/:repo/stats/code_frequency".asInstanceOf[`GET /repos/:owner/:repo/stats/code_frequency`]
  @scala.inline
  def `GET /repos/:owner/:repo/stats/commit_activity`: `GET /repos/:owner/:repo/stats/commit_activity` = "GET /repos/:owner/:repo/stats/commit_activity".asInstanceOf[`GET /repos/:owner/:repo/stats/commit_activity`]
  @scala.inline
  def `GET /repos/:owner/:repo/stats/contributors`: `GET /repos/:owner/:repo/stats/contributors` = "GET /repos/:owner/:repo/stats/contributors".asInstanceOf[`GET /repos/:owner/:repo/stats/contributors`]
  @scala.inline
  def `GET /repos/:owner/:repo/stats/participation`: `GET /repos/:owner/:repo/stats/participation` = "GET /repos/:owner/:repo/stats/participation".asInstanceOf[`GET /repos/:owner/:repo/stats/participation`]
  @scala.inline
  def `GET /repos/:owner/:repo/stats/punch_card`: `GET /repos/:owner/:repo/stats/punch_card` = "GET /repos/:owner/:repo/stats/punch_card".asInstanceOf[`GET /repos/:owner/:repo/stats/punch_card`]
  @scala.inline
  def `GET /repos/:owner/:repo/subscribers`: `GET /repos/:owner/:repo/subscribers` = "GET /repos/:owner/:repo/subscribers".asInstanceOf[`GET /repos/:owner/:repo/subscribers`]
  @scala.inline
  def `GET /repos/:owner/:repo/subscription`: `GET /repos/:owner/:repo/subscription` = "GET /repos/:owner/:repo/subscription".asInstanceOf[`GET /repos/:owner/:repo/subscription`]
  @scala.inline
  def `GET /repos/:owner/:repo/tags`: `GET /repos/:owner/:repo/tags` = "GET /repos/:owner/:repo/tags".asInstanceOf[`GET /repos/:owner/:repo/tags`]
  @scala.inline
  def `GET /repos/:owner/:repo/teams`: `GET /repos/:owner/:repo/teams` = "GET /repos/:owner/:repo/teams".asInstanceOf[`GET /repos/:owner/:repo/teams`]
  @scala.inline
  def `GET /repos/:owner/:repo/topics`: `GET /repos/:owner/:repo/topics` = "GET /repos/:owner/:repo/topics".asInstanceOf[`GET /repos/:owner/:repo/topics`]
  @scala.inline
  def `GET /repos/:owner/:repo/traffic/clones`: `GET /repos/:owner/:repo/traffic/clones` = "GET /repos/:owner/:repo/traffic/clones".asInstanceOf[`GET /repos/:owner/:repo/traffic/clones`]
  @scala.inline
  def `GET /repos/:owner/:repo/traffic/popular/paths`: `GET /repos/:owner/:repo/traffic/popular/paths` = "GET /repos/:owner/:repo/traffic/popular/paths".asInstanceOf[`GET /repos/:owner/:repo/traffic/popular/paths`]
  @scala.inline
  def `GET /repos/:owner/:repo/traffic/popular/referrers`: `GET /repos/:owner/:repo/traffic/popular/referrers` = "GET /repos/:owner/:repo/traffic/popular/referrers".asInstanceOf[`GET /repos/:owner/:repo/traffic/popular/referrers`]
  @scala.inline
  def `GET /repos/:owner/:repo/traffic/views`: `GET /repos/:owner/:repo/traffic/views` = "GET /repos/:owner/:repo/traffic/views".asInstanceOf[`GET /repos/:owner/:repo/traffic/views`]
  @scala.inline
  def `GET /repos/:owner/:repo/vulnerability-alerts`: `GET /repos/:owner/:repo/vulnerability-alerts` = "GET /repos/:owner/:repo/vulnerability-alerts".asInstanceOf[`GET /repos/:owner/:repo/vulnerability-alerts`]
  @scala.inline
  def `GET /repositories`: `GET /repositories` = "GET /repositories".asInstanceOf[`GET /repositories`]
  @scala.inline
  def `GET /scim/v2/organizations/:org/Users`: `GET /scim/v2/organizations/:org/Users` = "GET /scim/v2/organizations/:org/Users".asInstanceOf[`GET /scim/v2/organizations/:org/Users`]
  @scala.inline
  def `GET /scim/v2/organizations/:org/Users/:scim_user_id`: `GET /scim/v2/organizations/:org/Users/:scim_user_id` = "GET /scim/v2/organizations/:org/Users/:scim_user_id".asInstanceOf[`GET /scim/v2/organizations/:org/Users/:scim_user_id`]
  @scala.inline
  def `GET /search/code`: `GET /search/code` = "GET /search/code".asInstanceOf[`GET /search/code`]
  @scala.inline
  def `GET /search/commits`: `GET /search/commits` = "GET /search/commits".asInstanceOf[`GET /search/commits`]
  @scala.inline
  def `GET /search/issues`: `GET /search/issues` = "GET /search/issues".asInstanceOf[`GET /search/issues`]
  @scala.inline
  def `GET /search/labels`: `GET /search/labels` = "GET /search/labels".asInstanceOf[`GET /search/labels`]
  @scala.inline
  def `GET /search/repositories`: `GET /search/repositories` = "GET /search/repositories".asInstanceOf[`GET /search/repositories`]
  @scala.inline
  def `GET /search/topics`: `GET /search/topics` = "GET /search/topics".asInstanceOf[`GET /search/topics`]
  @scala.inline
  def `GET /search/users`: `GET /search/users` = "GET /search/users".asInstanceOf[`GET /search/users`]
  @scala.inline
  def `GET /teams/:team_id`: `GET /teams/:team_id` = "GET /teams/:team_id".asInstanceOf[`GET /teams/:team_id`]
  @scala.inline
  def `GET /teams/:team_id/discussions`: `GET /teams/:team_id/discussions` = "GET /teams/:team_id/discussions".asInstanceOf[`GET /teams/:team_id/discussions`]
  @scala.inline
  def `GET /teams/:team_id/discussions/:discussion_number`: `GET /teams/:team_id/discussions/:discussion_number` = "GET /teams/:team_id/discussions/:discussion_number".asInstanceOf[`GET /teams/:team_id/discussions/:discussion_number`]
  @scala.inline
  def `GET /teams/:team_id/discussions/:discussion_number/comments`: `GET /teams/:team_id/discussions/:discussion_number/comments` = "GET /teams/:team_id/discussions/:discussion_number/comments".asInstanceOf[`GET /teams/:team_id/discussions/:discussion_number/comments`]
  @scala.inline
  def `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number` = "GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number".asInstanceOf[`GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number`]
  @scala.inline
  def `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`: `GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions` = "GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions".asInstanceOf[`GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`]
  @scala.inline
  def `GET /teams/:team_id/discussions/:discussion_number/reactions`: `GET /teams/:team_id/discussions/:discussion_number/reactions` = "GET /teams/:team_id/discussions/:discussion_number/reactions".asInstanceOf[`GET /teams/:team_id/discussions/:discussion_number/reactions`]
  @scala.inline
  def `GET /teams/:team_id/invitations`: `GET /teams/:team_id/invitations` = "GET /teams/:team_id/invitations".asInstanceOf[`GET /teams/:team_id/invitations`]
  @scala.inline
  def `GET /teams/:team_id/members`: `GET /teams/:team_id/members` = "GET /teams/:team_id/members".asInstanceOf[`GET /teams/:team_id/members`]
  @scala.inline
  def `GET /teams/:team_id/members/:username`: `GET /teams/:team_id/members/:username` = "GET /teams/:team_id/members/:username".asInstanceOf[`GET /teams/:team_id/members/:username`]
  @scala.inline
  def `GET /teams/:team_id/memberships/:username`: `GET /teams/:team_id/memberships/:username` = "GET /teams/:team_id/memberships/:username".asInstanceOf[`GET /teams/:team_id/memberships/:username`]
  @scala.inline
  def `GET /teams/:team_id/projects`: `GET /teams/:team_id/projects` = "GET /teams/:team_id/projects".asInstanceOf[`GET /teams/:team_id/projects`]
  @scala.inline
  def `GET /teams/:team_id/projects/:project_id`: `GET /teams/:team_id/projects/:project_id` = "GET /teams/:team_id/projects/:project_id".asInstanceOf[`GET /teams/:team_id/projects/:project_id`]
  @scala.inline
  def `GET /teams/:team_id/repos`: `GET /teams/:team_id/repos` = "GET /teams/:team_id/repos".asInstanceOf[`GET /teams/:team_id/repos`]
  @scala.inline
  def `GET /teams/:team_id/repos/:owner/:repo`: `GET /teams/:team_id/repos/:owner/:repo` = "GET /teams/:team_id/repos/:owner/:repo".asInstanceOf[`GET /teams/:team_id/repos/:owner/:repo`]
  @scala.inline
  def `GET /teams/:team_id/team-sync/group-mappings`: `GET /teams/:team_id/team-sync/group-mappings` = "GET /teams/:team_id/team-sync/group-mappings".asInstanceOf[`GET /teams/:team_id/team-sync/group-mappings`]
  @scala.inline
  def `GET /teams/:team_id/teams`: `GET /teams/:team_id/teams` = "GET /teams/:team_id/teams".asInstanceOf[`GET /teams/:team_id/teams`]
  @scala.inline
  def `GET /user`: `GET /user` = "GET /user".asInstanceOf[`GET /user`]
  @scala.inline
  def `GET /user/blocks`: `GET /user/blocks` = "GET /user/blocks".asInstanceOf[`GET /user/blocks`]
  @scala.inline
  def `GET /user/blocks/:username`: `GET /user/blocks/:username` = "GET /user/blocks/:username".asInstanceOf[`GET /user/blocks/:username`]
  @scala.inline
  def `GET /user/emails`: `GET /user/emails` = "GET /user/emails".asInstanceOf[`GET /user/emails`]
  @scala.inline
  def `GET /user/followers`: `GET /user/followers` = "GET /user/followers".asInstanceOf[`GET /user/followers`]
  @scala.inline
  def `GET /user/following`: `GET /user/following` = "GET /user/following".asInstanceOf[`GET /user/following`]
  @scala.inline
  def `GET /user/following/:username`: `GET /user/following/:username` = "GET /user/following/:username".asInstanceOf[`GET /user/following/:username`]
  @scala.inline
  def `GET /user/gpg_keys`: `GET /user/gpg_keys` = "GET /user/gpg_keys".asInstanceOf[`GET /user/gpg_keys`]
  @scala.inline
  def `GET /user/gpg_keys/:gpg_key_id`: `GET /user/gpg_keys/:gpg_key_id` = "GET /user/gpg_keys/:gpg_key_id".asInstanceOf[`GET /user/gpg_keys/:gpg_key_id`]
  @scala.inline
  def `GET /user/installations`: `GET /user/installations` = "GET /user/installations".asInstanceOf[`GET /user/installations`]
  @scala.inline
  def `GET /user/installations/:installation_id/repositories`: `GET /user/installations/:installation_id/repositories` = "GET /user/installations/:installation_id/repositories".asInstanceOf[`GET /user/installations/:installation_id/repositories`]
  @scala.inline
  def `GET /user/issues`: `GET /user/issues` = "GET /user/issues".asInstanceOf[`GET /user/issues`]
  @scala.inline
  def `GET /user/keys`: `GET /user/keys` = "GET /user/keys".asInstanceOf[`GET /user/keys`]
  @scala.inline
  def `GET /user/keys/:key_id`: `GET /user/keys/:key_id` = "GET /user/keys/:key_id".asInstanceOf[`GET /user/keys/:key_id`]
  @scala.inline
  def `GET /user/marketplace_purchases`: `GET /user/marketplace_purchases` = "GET /user/marketplace_purchases".asInstanceOf[`GET /user/marketplace_purchases`]
  @scala.inline
  def `GET /user/marketplace_purchases/stubbed`: `GET /user/marketplace_purchases/stubbed` = "GET /user/marketplace_purchases/stubbed".asInstanceOf[`GET /user/marketplace_purchases/stubbed`]
  @scala.inline
  def `GET /user/memberships/orgs`: `GET /user/memberships/orgs` = "GET /user/memberships/orgs".asInstanceOf[`GET /user/memberships/orgs`]
  @scala.inline
  def `GET /user/memberships/orgs/:org`: `GET /user/memberships/orgs/:org` = "GET /user/memberships/orgs/:org".asInstanceOf[`GET /user/memberships/orgs/:org`]
  @scala.inline
  def `GET /user/migrations`: `GET /user/migrations` = "GET /user/migrations".asInstanceOf[`GET /user/migrations`]
  @scala.inline
  def `GET /user/migrations/:migration_id`: `GET /user/migrations/:migration_id` = "GET /user/migrations/:migration_id".asInstanceOf[`GET /user/migrations/:migration_id`]
  @scala.inline
  def `GET /user/migrations/:migration_id/archive`: `GET /user/migrations/:migration_id/archive` = "GET /user/migrations/:migration_id/archive".asInstanceOf[`GET /user/migrations/:migration_id/archive`]
  @scala.inline
  def `GET /user/orgs`: `GET /user/orgs` = "GET /user/orgs".asInstanceOf[`GET /user/orgs`]
  @scala.inline
  def `GET /user/public_emails`: `GET /user/public_emails` = "GET /user/public_emails".asInstanceOf[`GET /user/public_emails`]
  @scala.inline
  def `GET /user/repos`: `GET /user/repos` = "GET /user/repos".asInstanceOf[`GET /user/repos`]
  @scala.inline
  def `GET /user/repository_invitations`: `GET /user/repository_invitations` = "GET /user/repository_invitations".asInstanceOf[`GET /user/repository_invitations`]
  @scala.inline
  def `GET /user/starred`: `GET /user/starred` = "GET /user/starred".asInstanceOf[`GET /user/starred`]
  @scala.inline
  def `GET /user/starred/:owner/:repo`: `GET /user/starred/:owner/:repo` = "GET /user/starred/:owner/:repo".asInstanceOf[`GET /user/starred/:owner/:repo`]
  @scala.inline
  def `GET /user/subscriptions`: `GET /user/subscriptions` = "GET /user/subscriptions".asInstanceOf[`GET /user/subscriptions`]
  @scala.inline
  def `GET /user/subscriptions/:owner/:repo`: `GET /user/subscriptions/:owner/:repo` = "GET /user/subscriptions/:owner/:repo".asInstanceOf[`GET /user/subscriptions/:owner/:repo`]
  @scala.inline
  def `GET /user/teams`: `GET /user/teams` = "GET /user/teams".asInstanceOf[`GET /user/teams`]
  @scala.inline
  def `GET /users`: `GET /users` = "GET /users".asInstanceOf[`GET /users`]
  @scala.inline
  def `GET /users/:username`: `GET /users/:username` = "GET /users/:username".asInstanceOf[`GET /users/:username`]
  @scala.inline
  def `GET /users/:username/events`: `GET /users/:username/events` = "GET /users/:username/events".asInstanceOf[`GET /users/:username/events`]
  @scala.inline
  def `GET /users/:username/events/orgs/:org`: `GET /users/:username/events/orgs/:org` = "GET /users/:username/events/orgs/:org".asInstanceOf[`GET /users/:username/events/orgs/:org`]
  @scala.inline
  def `GET /users/:username/events/public`: `GET /users/:username/events/public` = "GET /users/:username/events/public".asInstanceOf[`GET /users/:username/events/public`]
  @scala.inline
  def `GET /users/:username/followers`: `GET /users/:username/followers` = "GET /users/:username/followers".asInstanceOf[`GET /users/:username/followers`]
  @scala.inline
  def `GET /users/:username/following`: `GET /users/:username/following` = "GET /users/:username/following".asInstanceOf[`GET /users/:username/following`]
  @scala.inline
  def `GET /users/:username/following/:target_user`: `GET /users/:username/following/:target_user` = "GET /users/:username/following/:target_user".asInstanceOf[`GET /users/:username/following/:target_user`]
  @scala.inline
  def `GET /users/:username/gists`: `GET /users/:username/gists` = "GET /users/:username/gists".asInstanceOf[`GET /users/:username/gists`]
  @scala.inline
  def `GET /users/:username/gpg_keys`: `GET /users/:username/gpg_keys` = "GET /users/:username/gpg_keys".asInstanceOf[`GET /users/:username/gpg_keys`]
  @scala.inline
  def `GET /users/:username/hovercard`: `GET /users/:username/hovercard` = "GET /users/:username/hovercard".asInstanceOf[`GET /users/:username/hovercard`]
  @scala.inline
  def `GET /users/:username/installation`: `GET /users/:username/installation` = "GET /users/:username/installation".asInstanceOf[`GET /users/:username/installation`]
  @scala.inline
  def `GET /users/:username/keys`: `GET /users/:username/keys` = "GET /users/:username/keys".asInstanceOf[`GET /users/:username/keys`]
  @scala.inline
  def `GET /users/:username/orgs`: `GET /users/:username/orgs` = "GET /users/:username/orgs".asInstanceOf[`GET /users/:username/orgs`]
  @scala.inline
  def `GET /users/:username/projects`: `GET /users/:username/projects` = "GET /users/:username/projects".asInstanceOf[`GET /users/:username/projects`]
  @scala.inline
  def `GET /users/:username/received_events`: `GET /users/:username/received_events` = "GET /users/:username/received_events".asInstanceOf[`GET /users/:username/received_events`]
  @scala.inline
  def `GET /users/:username/received_events/public`: `GET /users/:username/received_events/public` = "GET /users/:username/received_events/public".asInstanceOf[`GET /users/:username/received_events/public`]
  @scala.inline
  def `GET /users/:username/repos`: `GET /users/:username/repos` = "GET /users/:username/repos".asInstanceOf[`GET /users/:username/repos`]
  @scala.inline
  def `GET /users/:username/starred`: `GET /users/:username/starred` = "GET /users/:username/starred".asInstanceOf[`GET /users/:username/starred`]
  @scala.inline
  def `GET /users/:username/subscriptions`: `GET /users/:username/subscriptions` = "GET /users/:username/subscriptions".asInstanceOf[`GET /users/:username/subscriptions`]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def `PATCH /authorizations/:authorization_id`: `PATCH /authorizations/:authorization_id` = "PATCH /authorizations/:authorization_id".asInstanceOf[`PATCH /authorizations/:authorization_id`]
  @scala.inline
  def `PATCH /gists/:gist_id`: `PATCH /gists/:gist_id` = "PATCH /gists/:gist_id".asInstanceOf[`PATCH /gists/:gist_id`]
  @scala.inline
  def `PATCH /gists/:gist_id/comments/:comment_id`: `PATCH /gists/:gist_id/comments/:comment_id` = "PATCH /gists/:gist_id/comments/:comment_id".asInstanceOf[`PATCH /gists/:gist_id/comments/:comment_id`]
  @scala.inline
  def `PATCH /notifications/threads/:thread_id`: `PATCH /notifications/threads/:thread_id` = "PATCH /notifications/threads/:thread_id".asInstanceOf[`PATCH /notifications/threads/:thread_id`]
  @scala.inline
  def `PATCH /orgs/:org`: `PATCH /orgs/:org` = "PATCH /orgs/:org".asInstanceOf[`PATCH /orgs/:org`]
  @scala.inline
  def `PATCH /orgs/:org/hooks/:hook_id`: `PATCH /orgs/:org/hooks/:hook_id` = "PATCH /orgs/:org/hooks/:hook_id".asInstanceOf[`PATCH /orgs/:org/hooks/:hook_id`]
  @scala.inline
  def `PATCH /projects/:project_id`: `PATCH /projects/:project_id` = "PATCH /projects/:project_id".asInstanceOf[`PATCH /projects/:project_id`]
  @scala.inline
  def `PATCH /projects/columns/:column_id`: `PATCH /projects/columns/:column_id` = "PATCH /projects/columns/:column_id".asInstanceOf[`PATCH /projects/columns/:column_id`]
  @scala.inline
  def `PATCH /projects/columns/cards/:card_id`: `PATCH /projects/columns/cards/:card_id` = "PATCH /projects/columns/cards/:card_id".asInstanceOf[`PATCH /projects/columns/cards/:card_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo`: `PATCH /repos/:owner/:repo` = "PATCH /repos/:owner/:repo".asInstanceOf[`PATCH /repos/:owner/:repo`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`: `PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews` = "PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews".asInstanceOf[`PATCH /repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks`: `PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks` = "PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks".asInstanceOf[`PATCH /repos/:owner/:repo/branches/:branch/protection/required_status_checks`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/check-runs/:check_run_id`: `PATCH /repos/:owner/:repo/check-runs/:check_run_id` = "PATCH /repos/:owner/:repo/check-runs/:check_run_id".asInstanceOf[`PATCH /repos/:owner/:repo/check-runs/:check_run_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/check-suites/preferences`: `PATCH /repos/:owner/:repo/check-suites/preferences` = "PATCH /repos/:owner/:repo/check-suites/preferences".asInstanceOf[`PATCH /repos/:owner/:repo/check-suites/preferences`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/comments/:comment_id`: `PATCH /repos/:owner/:repo/comments/:comment_id` = "PATCH /repos/:owner/:repo/comments/:comment_id".asInstanceOf[`PATCH /repos/:owner/:repo/comments/:comment_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/git/refs/:ref`: `PATCH /repos/:owner/:repo/git/refs/:ref` = "PATCH /repos/:owner/:repo/git/refs/:ref".asInstanceOf[`PATCH /repos/:owner/:repo/git/refs/:ref`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/hooks/:hook_id`: `PATCH /repos/:owner/:repo/hooks/:hook_id` = "PATCH /repos/:owner/:repo/hooks/:hook_id".asInstanceOf[`PATCH /repos/:owner/:repo/hooks/:hook_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/import`: `PATCH /repos/:owner/:repo/import` = "PATCH /repos/:owner/:repo/import".asInstanceOf[`PATCH /repos/:owner/:repo/import`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/import/authors/:author_id`: `PATCH /repos/:owner/:repo/import/authors/:author_id` = "PATCH /repos/:owner/:repo/import/authors/:author_id".asInstanceOf[`PATCH /repos/:owner/:repo/import/authors/:author_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/import/lfs`: `PATCH /repos/:owner/:repo/import/lfs` = "PATCH /repos/:owner/:repo/import/lfs".asInstanceOf[`PATCH /repos/:owner/:repo/import/lfs`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/invitations/:invitation_id`: `PATCH /repos/:owner/:repo/invitations/:invitation_id` = "PATCH /repos/:owner/:repo/invitations/:invitation_id".asInstanceOf[`PATCH /repos/:owner/:repo/invitations/:invitation_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/issues/:issue_number`: `PATCH /repos/:owner/:repo/issues/:issue_number` = "PATCH /repos/:owner/:repo/issues/:issue_number".asInstanceOf[`PATCH /repos/:owner/:repo/issues/:issue_number`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/issues/comments/:comment_id`: `PATCH /repos/:owner/:repo/issues/comments/:comment_id` = "PATCH /repos/:owner/:repo/issues/comments/:comment_id".asInstanceOf[`PATCH /repos/:owner/:repo/issues/comments/:comment_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/labels/:current_name`: `PATCH /repos/:owner/:repo/labels/:current_name` = "PATCH /repos/:owner/:repo/labels/:current_name".asInstanceOf[`PATCH /repos/:owner/:repo/labels/:current_name`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/milestones/:milestone_number`: `PATCH /repos/:owner/:repo/milestones/:milestone_number` = "PATCH /repos/:owner/:repo/milestones/:milestone_number".asInstanceOf[`PATCH /repos/:owner/:repo/milestones/:milestone_number`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/pulls/:pull_number`: `PATCH /repos/:owner/:repo/pulls/:pull_number` = "PATCH /repos/:owner/:repo/pulls/:pull_number".asInstanceOf[`PATCH /repos/:owner/:repo/pulls/:pull_number`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/pulls/comments/:comment_id`: `PATCH /repos/:owner/:repo/pulls/comments/:comment_id` = "PATCH /repos/:owner/:repo/pulls/comments/:comment_id".asInstanceOf[`PATCH /repos/:owner/:repo/pulls/comments/:comment_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/releases/:release_id`: `PATCH /repos/:owner/:repo/releases/:release_id` = "PATCH /repos/:owner/:repo/releases/:release_id".asInstanceOf[`PATCH /repos/:owner/:repo/releases/:release_id`]
  @scala.inline
  def `PATCH /repos/:owner/:repo/releases/assets/:asset_id`: `PATCH /repos/:owner/:repo/releases/assets/:asset_id` = "PATCH /repos/:owner/:repo/releases/assets/:asset_id".asInstanceOf[`PATCH /repos/:owner/:repo/releases/assets/:asset_id`]
  @scala.inline
  def `PATCH /scim/v2/organizations/:org/Users/:scim_user_id`: `PATCH /scim/v2/organizations/:org/Users/:scim_user_id` = "PATCH /scim/v2/organizations/:org/Users/:scim_user_id".asInstanceOf[`PATCH /scim/v2/organizations/:org/Users/:scim_user_id`]
  @scala.inline
  def `PATCH /teams/:team_id`: `PATCH /teams/:team_id` = "PATCH /teams/:team_id".asInstanceOf[`PATCH /teams/:team_id`]
  @scala.inline
  def `PATCH /teams/:team_id/discussions/:discussion_number`: `PATCH /teams/:team_id/discussions/:discussion_number` = "PATCH /teams/:team_id/discussions/:discussion_number".asInstanceOf[`PATCH /teams/:team_id/discussions/:discussion_number`]
  @scala.inline
  def `PATCH /teams/:team_id/discussions/:discussion_number/comments/:comment_number`: `PATCH /teams/:team_id/discussions/:discussion_number/comments/:comment_number` = "PATCH /teams/:team_id/discussions/:discussion_number/comments/:comment_number".asInstanceOf[`PATCH /teams/:team_id/discussions/:discussion_number/comments/:comment_number`]
  @scala.inline
  def `PATCH /teams/:team_id/team-sync/group-mappings`: `PATCH /teams/:team_id/team-sync/group-mappings` = "PATCH /teams/:team_id/team-sync/group-mappings".asInstanceOf[`PATCH /teams/:team_id/team-sync/group-mappings`]
  @scala.inline
  def `PATCH /user`: `PATCH /user` = "PATCH /user".asInstanceOf[`PATCH /user`]
  @scala.inline
  def `PATCH /user/email/visibility`: `PATCH /user/email/visibility` = "PATCH /user/email/visibility".asInstanceOf[`PATCH /user/email/visibility`]
  @scala.inline
  def `PATCH /user/memberships/orgs/:org`: `PATCH /user/memberships/orgs/:org` = "PATCH /user/memberships/orgs/:org".asInstanceOf[`PATCH /user/memberships/orgs/:org`]
  @scala.inline
  def `PATCH /user/repository_invitations/:invitation_id`: `PATCH /user/repository_invitations/:invitation_id` = "PATCH /user/repository_invitations/:invitation_id".asInstanceOf[`PATCH /user/repository_invitations/:invitation_id`]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def `POST /app-manifests/:code/conversions`: `POST /app-manifests/:code/conversions` = "POST /app-manifests/:code/conversions".asInstanceOf[`POST /app-manifests/:code/conversions`]
  @scala.inline
  def `POST /app/installations/:installation_id/access_tokens`: `POST /app/installations/:installation_id/access_tokens` = "POST /app/installations/:installation_id/access_tokens".asInstanceOf[`POST /app/installations/:installation_id/access_tokens`]
  @scala.inline
  def `POST /applications/:client_id/tokens/:access_token`: `POST /applications/:client_id/tokens/:access_token` = "POST /applications/:client_id/tokens/:access_token".asInstanceOf[`POST /applications/:client_id/tokens/:access_token`]
  @scala.inline
  def `POST /authorizations`: `POST /authorizations` = "POST /authorizations".asInstanceOf[`POST /authorizations`]
  @scala.inline
  def `POST /content_references/:content_reference_id/attachments`: `POST /content_references/:content_reference_id/attachments` = "POST /content_references/:content_reference_id/attachments".asInstanceOf[`POST /content_references/:content_reference_id/attachments`]
  @scala.inline
  def `POST /gists`: `POST /gists` = "POST /gists".asInstanceOf[`POST /gists`]
  @scala.inline
  def `POST /gists/:gist_id/comments`: `POST /gists/:gist_id/comments` = "POST /gists/:gist_id/comments".asInstanceOf[`POST /gists/:gist_id/comments`]
  @scala.inline
  def `POST /gists/:gist_id/forks`: `POST /gists/:gist_id/forks` = "POST /gists/:gist_id/forks".asInstanceOf[`POST /gists/:gist_id/forks`]
  @scala.inline
  def `POST /markdown`: `POST /markdown` = "POST /markdown".asInstanceOf[`POST /markdown`]
  @scala.inline
  def `POST /markdown/raw`: `POST /markdown/raw` = "POST /markdown/raw".asInstanceOf[`POST /markdown/raw`]
  @scala.inline
  def `POST /orgs/:org/hooks`: `POST /orgs/:org/hooks` = "POST /orgs/:org/hooks".asInstanceOf[`POST /orgs/:org/hooks`]
  @scala.inline
  def `POST /orgs/:org/hooks/:hook_id/pings`: `POST /orgs/:org/hooks/:hook_id/pings` = "POST /orgs/:org/hooks/:hook_id/pings".asInstanceOf[`POST /orgs/:org/hooks/:hook_id/pings`]
  @scala.inline
  def `POST /orgs/:org/invitations`: `POST /orgs/:org/invitations` = "POST /orgs/:org/invitations".asInstanceOf[`POST /orgs/:org/invitations`]
  @scala.inline
  def `POST /orgs/:org/migrations`: `POST /orgs/:org/migrations` = "POST /orgs/:org/migrations".asInstanceOf[`POST /orgs/:org/migrations`]
  @scala.inline
  def `POST /orgs/:org/projects`: `POST /orgs/:org/projects` = "POST /orgs/:org/projects".asInstanceOf[`POST /orgs/:org/projects`]
  @scala.inline
  def `POST /orgs/:org/repos`: `POST /orgs/:org/repos` = "POST /orgs/:org/repos".asInstanceOf[`POST /orgs/:org/repos`]
  @scala.inline
  def `POST /orgs/:org/teams`: `POST /orgs/:org/teams` = "POST /orgs/:org/teams".asInstanceOf[`POST /orgs/:org/teams`]
  @scala.inline
  def `POST /projects/:project_id/columns`: `POST /projects/:project_id/columns` = "POST /projects/:project_id/columns".asInstanceOf[`POST /projects/:project_id/columns`]
  @scala.inline
  def `POST /projects/columns/:column_id/cards`: `POST /projects/columns/:column_id/cards` = "POST /projects/columns/:column_id/cards".asInstanceOf[`POST /projects/columns/:column_id/cards`]
  @scala.inline
  def `POST /projects/columns/:column_id/moves`: `POST /projects/columns/:column_id/moves` = "POST /projects/columns/:column_id/moves".asInstanceOf[`POST /projects/columns/:column_id/moves`]
  @scala.inline
  def `POST /projects/columns/cards/:card_id/moves`: `POST /projects/columns/cards/:card_id/moves` = "POST /projects/columns/cards/:card_id/moves".asInstanceOf[`POST /projects/columns/cards/:card_id/moves`]
  @scala.inline
  def `POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins`: `POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins` = "POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins".asInstanceOf[`POST /repos/:owner/:repo/branches/:branch/protection/enforce_admins`]
  @scala.inline
  def `POST /repos/:owner/:repo/branches/:branch/protection/required_signatures`: `POST /repos/:owner/:repo/branches/:branch/protection/required_signatures` = "POST /repos/:owner/:repo/branches/:branch/protection/required_signatures".asInstanceOf[`POST /repos/:owner/:repo/branches/:branch/protection/required_signatures`]
  @scala.inline
  def `POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: `POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` = "POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts".asInstanceOf[`POST /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`]
  @scala.inline
  def `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` = "POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams".asInstanceOf[`POST /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`]
  @scala.inline
  def `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: `POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users` = "POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users".asInstanceOf[`POST /repos/:owner/:repo/branches/:branch/protection/restrictions/users`]
  @scala.inline
  def `POST /repos/:owner/:repo/check-runs`: `POST /repos/:owner/:repo/check-runs` = "POST /repos/:owner/:repo/check-runs".asInstanceOf[`POST /repos/:owner/:repo/check-runs`]
  @scala.inline
  def `POST /repos/:owner/:repo/check-suites`: `POST /repos/:owner/:repo/check-suites` = "POST /repos/:owner/:repo/check-suites".asInstanceOf[`POST /repos/:owner/:repo/check-suites`]
  @scala.inline
  def `POST /repos/:owner/:repo/check-suites/:check_suite_id/rerequest`: `POST /repos/:owner/:repo/check-suites/:check_suite_id/rerequest` = "POST /repos/:owner/:repo/check-suites/:check_suite_id/rerequest".asInstanceOf[`POST /repos/:owner/:repo/check-suites/:check_suite_id/rerequest`]
  @scala.inline
  def `POST /repos/:owner/:repo/comments/:comment_id/reactions`: `POST /repos/:owner/:repo/comments/:comment_id/reactions` = "POST /repos/:owner/:repo/comments/:comment_id/reactions".asInstanceOf[`POST /repos/:owner/:repo/comments/:comment_id/reactions`]
  @scala.inline
  def `POST /repos/:owner/:repo/commits/:commit_sha/comments`: `POST /repos/:owner/:repo/commits/:commit_sha/comments` = "POST /repos/:owner/:repo/commits/:commit_sha/comments".asInstanceOf[`POST /repos/:owner/:repo/commits/:commit_sha/comments`]
  @scala.inline
  def `POST /repos/:owner/:repo/deployments`: `POST /repos/:owner/:repo/deployments` = "POST /repos/:owner/:repo/deployments".asInstanceOf[`POST /repos/:owner/:repo/deployments`]
  @scala.inline
  def `POST /repos/:owner/:repo/deployments/:deployment_id/statuses`: `POST /repos/:owner/:repo/deployments/:deployment_id/statuses` = "POST /repos/:owner/:repo/deployments/:deployment_id/statuses".asInstanceOf[`POST /repos/:owner/:repo/deployments/:deployment_id/statuses`]
  @scala.inline
  def `POST /repos/:owner/:repo/forks`: `POST /repos/:owner/:repo/forks` = "POST /repos/:owner/:repo/forks".asInstanceOf[`POST /repos/:owner/:repo/forks`]
  @scala.inline
  def `POST /repos/:owner/:repo/git/blobs`: `POST /repos/:owner/:repo/git/blobs` = "POST /repos/:owner/:repo/git/blobs".asInstanceOf[`POST /repos/:owner/:repo/git/blobs`]
  @scala.inline
  def `POST /repos/:owner/:repo/git/commits`: `POST /repos/:owner/:repo/git/commits` = "POST /repos/:owner/:repo/git/commits".asInstanceOf[`POST /repos/:owner/:repo/git/commits`]
  @scala.inline
  def `POST /repos/:owner/:repo/git/refs`: `POST /repos/:owner/:repo/git/refs` = "POST /repos/:owner/:repo/git/refs".asInstanceOf[`POST /repos/:owner/:repo/git/refs`]
  @scala.inline
  def `POST /repos/:owner/:repo/git/tags`: `POST /repos/:owner/:repo/git/tags` = "POST /repos/:owner/:repo/git/tags".asInstanceOf[`POST /repos/:owner/:repo/git/tags`]
  @scala.inline
  def `POST /repos/:owner/:repo/git/trees`: `POST /repos/:owner/:repo/git/trees` = "POST /repos/:owner/:repo/git/trees".asInstanceOf[`POST /repos/:owner/:repo/git/trees`]
  @scala.inline
  def `POST /repos/:owner/:repo/hooks`: `POST /repos/:owner/:repo/hooks` = "POST /repos/:owner/:repo/hooks".asInstanceOf[`POST /repos/:owner/:repo/hooks`]
  @scala.inline
  def `POST /repos/:owner/:repo/hooks/:hook_id/pings`: `POST /repos/:owner/:repo/hooks/:hook_id/pings` = "POST /repos/:owner/:repo/hooks/:hook_id/pings".asInstanceOf[`POST /repos/:owner/:repo/hooks/:hook_id/pings`]
  @scala.inline
  def `POST /repos/:owner/:repo/hooks/:hook_id/tests`: `POST /repos/:owner/:repo/hooks/:hook_id/tests` = "POST /repos/:owner/:repo/hooks/:hook_id/tests".asInstanceOf[`POST /repos/:owner/:repo/hooks/:hook_id/tests`]
  @scala.inline
  def `POST /repos/:owner/:repo/issues`: `POST /repos/:owner/:repo/issues` = "POST /repos/:owner/:repo/issues".asInstanceOf[`POST /repos/:owner/:repo/issues`]
  @scala.inline
  def `POST /repos/:owner/:repo/issues/:issue_number/assignees`: `POST /repos/:owner/:repo/issues/:issue_number/assignees` = "POST /repos/:owner/:repo/issues/:issue_number/assignees".asInstanceOf[`POST /repos/:owner/:repo/issues/:issue_number/assignees`]
  @scala.inline
  def `POST /repos/:owner/:repo/issues/:issue_number/comments`: `POST /repos/:owner/:repo/issues/:issue_number/comments` = "POST /repos/:owner/:repo/issues/:issue_number/comments".asInstanceOf[`POST /repos/:owner/:repo/issues/:issue_number/comments`]
  @scala.inline
  def `POST /repos/:owner/:repo/issues/:issue_number/labels`: `POST /repos/:owner/:repo/issues/:issue_number/labels` = "POST /repos/:owner/:repo/issues/:issue_number/labels".asInstanceOf[`POST /repos/:owner/:repo/issues/:issue_number/labels`]
  @scala.inline
  def `POST /repos/:owner/:repo/issues/:issue_number/reactions`: `POST /repos/:owner/:repo/issues/:issue_number/reactions` = "POST /repos/:owner/:repo/issues/:issue_number/reactions".asInstanceOf[`POST /repos/:owner/:repo/issues/:issue_number/reactions`]
  @scala.inline
  def `POST /repos/:owner/:repo/issues/comments/:comment_id/reactions`: `POST /repos/:owner/:repo/issues/comments/:comment_id/reactions` = "POST /repos/:owner/:repo/issues/comments/:comment_id/reactions".asInstanceOf[`POST /repos/:owner/:repo/issues/comments/:comment_id/reactions`]
  @scala.inline
  def `POST /repos/:owner/:repo/keys`: `POST /repos/:owner/:repo/keys` = "POST /repos/:owner/:repo/keys".asInstanceOf[`POST /repos/:owner/:repo/keys`]
  @scala.inline
  def `POST /repos/:owner/:repo/labels`: `POST /repos/:owner/:repo/labels` = "POST /repos/:owner/:repo/labels".asInstanceOf[`POST /repos/:owner/:repo/labels`]
  @scala.inline
  def `POST /repos/:owner/:repo/merges`: `POST /repos/:owner/:repo/merges` = "POST /repos/:owner/:repo/merges".asInstanceOf[`POST /repos/:owner/:repo/merges`]
  @scala.inline
  def `POST /repos/:owner/:repo/milestones`: `POST /repos/:owner/:repo/milestones` = "POST /repos/:owner/:repo/milestones".asInstanceOf[`POST /repos/:owner/:repo/milestones`]
  @scala.inline
  def `POST /repos/:owner/:repo/pages`: `POST /repos/:owner/:repo/pages` = "POST /repos/:owner/:repo/pages".asInstanceOf[`POST /repos/:owner/:repo/pages`]
  @scala.inline
  def `POST /repos/:owner/:repo/pages/builds`: `POST /repos/:owner/:repo/pages/builds` = "POST /repos/:owner/:repo/pages/builds".asInstanceOf[`POST /repos/:owner/:repo/pages/builds`]
  @scala.inline
  def `POST /repos/:owner/:repo/projects`: `POST /repos/:owner/:repo/projects` = "POST /repos/:owner/:repo/projects".asInstanceOf[`POST /repos/:owner/:repo/projects`]
  @scala.inline
  def `POST /repos/:owner/:repo/pulls`: `POST /repos/:owner/:repo/pulls` = "POST /repos/:owner/:repo/pulls".asInstanceOf[`POST /repos/:owner/:repo/pulls`]
  @scala.inline
  def `POST /repos/:owner/:repo/pulls/:pull_number/comments`: `POST /repos/:owner/:repo/pulls/:pull_number/comments` = "POST /repos/:owner/:repo/pulls/:pull_number/comments".asInstanceOf[`POST /repos/:owner/:repo/pulls/:pull_number/comments`]
  @scala.inline
  def `POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`: `POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers` = "POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers".asInstanceOf[`POST /repos/:owner/:repo/pulls/:pull_number/requested_reviewers`]
  @scala.inline
  def `POST /repos/:owner/:repo/pulls/:pull_number/reviews`: `POST /repos/:owner/:repo/pulls/:pull_number/reviews` = "POST /repos/:owner/:repo/pulls/:pull_number/reviews".asInstanceOf[`POST /repos/:owner/:repo/pulls/:pull_number/reviews`]
  @scala.inline
  def `POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events`: `POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events` = "POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events".asInstanceOf[`POST /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/events`]
  @scala.inline
  def `POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions`: `POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions` = "POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions".asInstanceOf[`POST /repos/:owner/:repo/pulls/comments/:comment_id/reactions`]
  @scala.inline
  def `POST /repos/:owner/:repo/releases`: `POST /repos/:owner/:repo/releases` = "POST /repos/:owner/:repo/releases".asInstanceOf[`POST /repos/:owner/:repo/releases`]
  @scala.inline
  def `POST /repos/:owner/:repo/statuses/:sha`: `POST /repos/:owner/:repo/statuses/:sha` = "POST /repos/:owner/:repo/statuses/:sha".asInstanceOf[`POST /repos/:owner/:repo/statuses/:sha`]
  @scala.inline
  def `POST /repos/:owner/:repo/transfer`: `POST /repos/:owner/:repo/transfer` = "POST /repos/:owner/:repo/transfer".asInstanceOf[`POST /repos/:owner/:repo/transfer`]
  @scala.inline
  def `POST /repos/:template_owner/:template_repo/generate`: `POST /repos/:template_owner/:template_repo/generate` = "POST /repos/:template_owner/:template_repo/generate".asInstanceOf[`POST /repos/:template_owner/:template_repo/generate`]
  @scala.inline
  def `POST /scim/v2/organizations/:org/Users`: `POST /scim/v2/organizations/:org/Users` = "POST /scim/v2/organizations/:org/Users".asInstanceOf[`POST /scim/v2/organizations/:org/Users`]
  @scala.inline
  def `POST /teams/:team_id/discussions`: `POST /teams/:team_id/discussions` = "POST /teams/:team_id/discussions".asInstanceOf[`POST /teams/:team_id/discussions`]
  @scala.inline
  def `POST /teams/:team_id/discussions/:discussion_number/comments`: `POST /teams/:team_id/discussions/:discussion_number/comments` = "POST /teams/:team_id/discussions/:discussion_number/comments".asInstanceOf[`POST /teams/:team_id/discussions/:discussion_number/comments`]
  @scala.inline
  def `POST /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`: `POST /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions` = "POST /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions".asInstanceOf[`POST /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`]
  @scala.inline
  def `POST /teams/:team_id/discussions/:discussion_number/reactions`: `POST /teams/:team_id/discussions/:discussion_number/reactions` = "POST /teams/:team_id/discussions/:discussion_number/reactions".asInstanceOf[`POST /teams/:team_id/discussions/:discussion_number/reactions`]
  @scala.inline
  def `POST /user/emails`: `POST /user/emails` = "POST /user/emails".asInstanceOf[`POST /user/emails`]
  @scala.inline
  def `POST /user/gpg_keys`: `POST /user/gpg_keys` = "POST /user/gpg_keys".asInstanceOf[`POST /user/gpg_keys`]
  @scala.inline
  def `POST /user/keys`: `POST /user/keys` = "POST /user/keys".asInstanceOf[`POST /user/keys`]
  @scala.inline
  def `POST /user/migrations`: `POST /user/migrations` = "POST /user/migrations".asInstanceOf[`POST /user/migrations`]
  @scala.inline
  def `POST /user/projects`: `POST /user/projects` = "POST /user/projects".asInstanceOf[`POST /user/projects`]
  @scala.inline
  def `POST /user/repos`: `POST /user/repos` = "POST /user/repos".asInstanceOf[`POST /user/repos`]
  @scala.inline
  def `POST :url`: `POST :url` = "POST :url".asInstanceOf[`POST :url`]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def `PUT /authorizations/clients/:client_id`: `PUT /authorizations/clients/:client_id` = "PUT /authorizations/clients/:client_id".asInstanceOf[`PUT /authorizations/clients/:client_id`]
  @scala.inline
  def `PUT /authorizations/clients/:client_id/:fingerprint`: `PUT /authorizations/clients/:client_id/:fingerprint` = "PUT /authorizations/clients/:client_id/:fingerprint".asInstanceOf[`PUT /authorizations/clients/:client_id/:fingerprint`]
  @scala.inline
  def `PUT /gists/:gist_id/star`: `PUT /gists/:gist_id/star` = "PUT /gists/:gist_id/star".asInstanceOf[`PUT /gists/:gist_id/star`]
  @scala.inline
  def `PUT /notifications`: `PUT /notifications` = "PUT /notifications".asInstanceOf[`PUT /notifications`]
  @scala.inline
  def `PUT /notifications/threads/:thread_id/subscription`: `PUT /notifications/threads/:thread_id/subscription` = "PUT /notifications/threads/:thread_id/subscription".asInstanceOf[`PUT /notifications/threads/:thread_id/subscription`]
  @scala.inline
  def `PUT /orgs/:org/blocks/:username`: `PUT /orgs/:org/blocks/:username` = "PUT /orgs/:org/blocks/:username".asInstanceOf[`PUT /orgs/:org/blocks/:username`]
  @scala.inline
  def `PUT /orgs/:org/interaction-limits`: `PUT /orgs/:org/interaction-limits` = "PUT /orgs/:org/interaction-limits".asInstanceOf[`PUT /orgs/:org/interaction-limits`]
  @scala.inline
  def `PUT /orgs/:org/memberships/:username`: `PUT /orgs/:org/memberships/:username` = "PUT /orgs/:org/memberships/:username".asInstanceOf[`PUT /orgs/:org/memberships/:username`]
  @scala.inline
  def `PUT /orgs/:org/outside_collaborators/:username`: `PUT /orgs/:org/outside_collaborators/:username` = "PUT /orgs/:org/outside_collaborators/:username".asInstanceOf[`PUT /orgs/:org/outside_collaborators/:username`]
  @scala.inline
  def `PUT /orgs/:org/public_members/:username`: `PUT /orgs/:org/public_members/:username` = "PUT /orgs/:org/public_members/:username".asInstanceOf[`PUT /orgs/:org/public_members/:username`]
  @scala.inline
  def `PUT /projects/:project_id/collaborators/:username`: `PUT /projects/:project_id/collaborators/:username` = "PUT /projects/:project_id/collaborators/:username".asInstanceOf[`PUT /projects/:project_id/collaborators/:username`]
  @scala.inline
  def `PUT /repos/:owner/:repo/automated-security-fixes`: `PUT /repos/:owner/:repo/automated-security-fixes` = "PUT /repos/:owner/:repo/automated-security-fixes".asInstanceOf[`PUT /repos/:owner/:repo/automated-security-fixes`]
  @scala.inline
  def `PUT /repos/:owner/:repo/branches/:branch/protection`: `PUT /repos/:owner/:repo/branches/:branch/protection` = "PUT /repos/:owner/:repo/branches/:branch/protection".asInstanceOf[`PUT /repos/:owner/:repo/branches/:branch/protection`]
  @scala.inline
  def `PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`: `PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts` = "PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts".asInstanceOf[`PUT /repos/:owner/:repo/branches/:branch/protection/required_status_checks/contexts`]
  @scala.inline
  def `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`: `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams` = "PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams".asInstanceOf[`PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/teams`]
  @scala.inline
  def `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users`: `PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users` = "PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users".asInstanceOf[`PUT /repos/:owner/:repo/branches/:branch/protection/restrictions/users`]
  @scala.inline
  def `PUT /repos/:owner/:repo/collaborators/:username`: `PUT /repos/:owner/:repo/collaborators/:username` = "PUT /repos/:owner/:repo/collaborators/:username".asInstanceOf[`PUT /repos/:owner/:repo/collaborators/:username`]
  @scala.inline
  def `PUT /repos/:owner/:repo/contents/:path`: `PUT /repos/:owner/:repo/contents/:path` = "PUT /repos/:owner/:repo/contents/:path".asInstanceOf[`PUT /repos/:owner/:repo/contents/:path`]
  @scala.inline
  def `PUT /repos/:owner/:repo/import`: `PUT /repos/:owner/:repo/import` = "PUT /repos/:owner/:repo/import".asInstanceOf[`PUT /repos/:owner/:repo/import`]
  @scala.inline
  def `PUT /repos/:owner/:repo/interaction-limits`: `PUT /repos/:owner/:repo/interaction-limits` = "PUT /repos/:owner/:repo/interaction-limits".asInstanceOf[`PUT /repos/:owner/:repo/interaction-limits`]
  @scala.inline
  def `PUT /repos/:owner/:repo/issues/:issue_number/labels`: `PUT /repos/:owner/:repo/issues/:issue_number/labels` = "PUT /repos/:owner/:repo/issues/:issue_number/labels".asInstanceOf[`PUT /repos/:owner/:repo/issues/:issue_number/labels`]
  @scala.inline
  def `PUT /repos/:owner/:repo/issues/:issue_number/lock`: `PUT /repos/:owner/:repo/issues/:issue_number/lock` = "PUT /repos/:owner/:repo/issues/:issue_number/lock".asInstanceOf[`PUT /repos/:owner/:repo/issues/:issue_number/lock`]
  @scala.inline
  def `PUT /repos/:owner/:repo/notifications`: `PUT /repos/:owner/:repo/notifications` = "PUT /repos/:owner/:repo/notifications".asInstanceOf[`PUT /repos/:owner/:repo/notifications`]
  @scala.inline
  def `PUT /repos/:owner/:repo/pages`: `PUT /repos/:owner/:repo/pages` = "PUT /repos/:owner/:repo/pages".asInstanceOf[`PUT /repos/:owner/:repo/pages`]
  @scala.inline
  def `PUT /repos/:owner/:repo/pulls/:pull_number/merge`: `PUT /repos/:owner/:repo/pulls/:pull_number/merge` = "PUT /repos/:owner/:repo/pulls/:pull_number/merge".asInstanceOf[`PUT /repos/:owner/:repo/pulls/:pull_number/merge`]
  @scala.inline
  def `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`: `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id` = "PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id".asInstanceOf[`PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id`]
  @scala.inline
  def `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals`: `PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals` = "PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals".asInstanceOf[`PUT /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/dismissals`]
  @scala.inline
  def `PUT /repos/:owner/:repo/pulls/:pull_number/update-branch`: `PUT /repos/:owner/:repo/pulls/:pull_number/update-branch` = "PUT /repos/:owner/:repo/pulls/:pull_number/update-branch".asInstanceOf[`PUT /repos/:owner/:repo/pulls/:pull_number/update-branch`]
  @scala.inline
  def `PUT /repos/:owner/:repo/subscription`: `PUT /repos/:owner/:repo/subscription` = "PUT /repos/:owner/:repo/subscription".asInstanceOf[`PUT /repos/:owner/:repo/subscription`]
  @scala.inline
  def `PUT /repos/:owner/:repo/topics`: `PUT /repos/:owner/:repo/topics` = "PUT /repos/:owner/:repo/topics".asInstanceOf[`PUT /repos/:owner/:repo/topics`]
  @scala.inline
  def `PUT /repos/:owner/:repo/vulnerability-alerts`: `PUT /repos/:owner/:repo/vulnerability-alerts` = "PUT /repos/:owner/:repo/vulnerability-alerts".asInstanceOf[`PUT /repos/:owner/:repo/vulnerability-alerts`]
  @scala.inline
  def `PUT /scim/v2/organizations/:org/Users/:scim_user_id`: `PUT /scim/v2/organizations/:org/Users/:scim_user_id` = "PUT /scim/v2/organizations/:org/Users/:scim_user_id".asInstanceOf[`PUT /scim/v2/organizations/:org/Users/:scim_user_id`]
  @scala.inline
  def `PUT /teams/:team_id/members/:username`: `PUT /teams/:team_id/members/:username` = "PUT /teams/:team_id/members/:username".asInstanceOf[`PUT /teams/:team_id/members/:username`]
  @scala.inline
  def `PUT /teams/:team_id/memberships/:username`: `PUT /teams/:team_id/memberships/:username` = "PUT /teams/:team_id/memberships/:username".asInstanceOf[`PUT /teams/:team_id/memberships/:username`]
  @scala.inline
  def `PUT /teams/:team_id/projects/:project_id`: `PUT /teams/:team_id/projects/:project_id` = "PUT /teams/:team_id/projects/:project_id".asInstanceOf[`PUT /teams/:team_id/projects/:project_id`]
  @scala.inline
  def `PUT /teams/:team_id/repos/:owner/:repo`: `PUT /teams/:team_id/repos/:owner/:repo` = "PUT /teams/:team_id/repos/:owner/:repo".asInstanceOf[`PUT /teams/:team_id/repos/:owner/:repo`]
  @scala.inline
  def `PUT /user/blocks/:username`: `PUT /user/blocks/:username` = "PUT /user/blocks/:username".asInstanceOf[`PUT /user/blocks/:username`]
  @scala.inline
  def `PUT /user/following/:username`: `PUT /user/following/:username` = "PUT /user/following/:username".asInstanceOf[`PUT /user/following/:username`]
  @scala.inline
  def `PUT /user/installations/:installation_id/repositories/:repository_id`: `PUT /user/installations/:installation_id/repositories/:repository_id` = "PUT /user/installations/:installation_id/repositories/:repository_id".asInstanceOf[`PUT /user/installations/:installation_id/repositories/:repository_id`]
  @scala.inline
  def `PUT /user/starred/:owner/:repo`: `PUT /user/starred/:owner/:repo` = "PUT /user/starred/:owner/:repo".asInstanceOf[`PUT /user/starred/:owner/:repo`]
  @scala.inline
  def `PUT /user/subscriptions/:owner/:repo`: `PUT /user/subscriptions/:owner/:repo` = "PUT /user/subscriptions/:owner/:repo".asInstanceOf[`PUT /user/subscriptions/:owner/:repo`]
}

