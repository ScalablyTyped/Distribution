package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AcceptInvitation extends js.Object {
  @JSName("acceptInvitation")
  var acceptInvitation_Original: Anon_EndpointParamsPromiseReposAcceptInvitationParams = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://developer.github.com/v3/repos/invitations/).
    *
    * **Rate limits**
    *
    * To prevent abuse, you are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: Anon_EndpointParamsAnyResponsePromiseReposAddCollaboratorParams = js.native
  /**
    * Here's how you can create a read-only deploy key:
    */
  @JSName("addDeployKey")
  var addDeployKey_Original: Anon_EndpointParamsPromiseReposAddDeployKeyParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("addProtectedBranchAdminEnforcement")
  var addProtectedBranchAdminEnforcement_Original: Anon_EndpointParamsPromiseReposAddProtectedBranchAdminEnforcementParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("addProtectedBranchRequiredSignatures")
  var addProtectedBranchRequiredSignatures_Original: Anon_EndpointParamsPromiseReposAddProtectedBranchRequiredSignaturesParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("addProtectedBranchRequiredStatusChecksContexts")
  var addProtectedBranchRequiredStatusChecksContexts_Original: Anon_EndpointParamsPromiseReposAddProtectedBranchRequiredStatusChecksContextsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. If you pass the `hellcat-preview` media type, you can also give push access to child teams.
    *
    * | Type    | Description                                                                                                                         |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  @JSName("addProtectedBranchTeamRestrictions")
  var addProtectedBranchTeamRestrictions_Original: Anon_EndpointParamsPromiseReposAddProtectedBranchTeamRestrictionsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Grants the specified people push access for this branch.
    *
    * | Type    | Description                                                                                                            |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  @JSName("addProtectedBranchUserRestrictions")
  var addProtectedBranchUserRestrictions_Original: Anon_EndpointParamsPromiseReposAddProtectedBranchUserRestrictionsParams = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    */
  @JSName("checkCollaborator")
  var checkCollaborator_Original: Anon_EndpointParamsAnyResponsePromiseReposCheckCollaboratorParams = js.native
  /**
    * Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * **Working with large comparisons**
    *
    * The response will include a comparison of up to 250 commits. If you are working with a larger commit range, you can use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository) to enumerate all commits in the range.
    *
    * For comparisons with extremely large diffs, you may receive an error response indicating that the diff took too long to generate. You can typically resolve this error by using a smaller commit range.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("compareCommits")
  var compareCommits_Original: Anon_EndpointParamsPromiseReposCompareCommitsParams = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createCommitComment")
  var createCommitComment_Original: Anon_EndpointParamsPromiseReposCreateCommitCommentParams = js.native
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  @JSName("createDeploymentStatus")
  var createDeploymentStatus_Original: Anon_EndpointParamsPromiseReposCreateDeploymentStatusParams = js.native
  /**
    * Deployments offer a few configurable parameters with sane defaults.
    *
    * The `ref` parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them before we merge a pull request.
    *
    * The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter makes it easier to track which environments have requested deployments. The default environment is `production`.
    *
    * The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds, the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will return a failure response.
    *
    * By default, [commit statuses](https://developer.github.com/v3/repos/statuses) for every submitted context must be in a `success` state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do not require any contexts or create any commit statuses, the deployment will always succeed.
    *
    * The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text field that will be passed on when a deployment event is dispatched.
    *
    * The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an application with debugging enabled.
    *
    * Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref:
    *
    * A simple example putting the user and room into the payload to notify back to chat networks.
    *
    * A more advanced example specifying required commit statuses and bypassing auto-merging.
    *
    * You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating a deployment. This auto-merge happens when:
    *
    * *   Auto-merge option is enabled in the repository
    * *   Topic branch does not include the latest changes on the base branch, which is `master`in the response example
    * *   There are no merge conflicts
    *
    * If there are no new commits in the base branch, a new request to create a deployment should give a successful response.
    *
    * This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.
    *
    * This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success` status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.
    */
  @JSName("createDeployment")
  var createDeployment_Original: Anon_EndpointParamsAnyResponsePromiseReposCreateDeploymentParams = js.native
  /**
    * Creates a new file in a repository.
    */
  @JSName("createFile")
  var createFile_Original: Anon_EndpointParamsPromiseReposCreateFileParams = js.native
  /**
    * **Note**: There are two endpoints for creating a repository: one to create a repository on a user account, and one to create a repository in an organization. The organization endpoint is fully enabled for [GitHub Apps](https://developer.github.com/v3/apps/available-endpoints/), whereas the user endpoint is enabled only for [user-to-server requests](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#user-to-server-requests).
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: Anon_EndpointParamsPromiseReposCreateForAuthenticatedUserParams = js.native
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://github.com/contact).
    */
  @JSName("createFork")
  var createFork_Original: Anon_EndpointParamsPromiseReposCreateForkParams = js.native
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can share the same `config` as long as those webhooks do not have any `events` that overlap.
    *
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  @JSName("createHook")
  var createHook_Original: Anon_EndpointParamsPromiseReposCreateHookParams = js.native
  /**
    * **Note**: There are two endpoints for creating a repository: one to create a repository on a user account, and one to create a repository in an organization. The organization endpoint is fully enabled for [GitHub Apps](https://developer.github.com/v3/apps/available-endpoints/), whereas the user endpoint is enabled only for [user-to-server requests](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#user-to-server-requests).
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  @JSName("createInOrg")
  var createInOrg_Original: Anon_EndpointParamsPromiseReposCreateInOrgParams = js.native
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createRelease")
  var createRelease_Original: Anon_EndpointParamsPromiseReposCreateReleaseParams = js.native
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  @JSName("createStatus")
  var createStatus_Original: Anon_EndpointParamsPromiseReposCreateStatusParams = js.native
  @JSName("declineInvitation")
  var declineInvitation_Original: Anon_EndpointParamsPromiseReposDeclineInvitationParams = js.native
  @JSName("deleteCommitComment")
  var deleteCommitComment_Original: Anon_EndpointParamsPromiseReposDeleteCommitCommentParams = js.native
  @JSName("deleteDownload")
  var deleteDownload_Original: Anon_EndpointParamsPromiseReposDeleteDownloadParams = js.native
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    */
  @JSName("deleteFile")
  var deleteFile_Original: Anon_EndpointParamsPromiseReposDeleteFileParams = js.native
  @JSName("deleteHook")
  var deleteHook_Original: Anon_EndpointParamsPromiseReposDeleteHookParams = js.native
  @JSName("deleteInvitation")
  var deleteInvitation_Original: Anon_EndpointParamsPromiseReposDeleteInvitationParams = js.native
  @JSName("deleteReleaseAsset")
  var deleteReleaseAsset_Original: Anon_EndpointParamsPromiseReposDeleteReleaseAssetParams = js.native
  /**
    * Users with push access to the repository can delete a release.
    */
  @JSName("deleteRelease")
  var deleteRelease_Original: Anon_EndpointParamsPromiseReposDeleteReleaseParams = js.native
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response:
    */
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsPromiseReposDeleteParams = js.native
  @JSName("disablePagesSite")
  var disablePagesSite_Original: Anon_EndpointParamsPromiseReposDisablePagesSiteParams = js.native
  /**
    * Disables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  @JSName("disableVulnerabilityAlerts")
  var disableVulnerabilityAlerts_Original: Anon_EndpointParamsPromiseReposDisableVulnerabilityAlertsParams = js.native
  @JSName("enablePagesSite")
  var enablePagesSite_Original: Anon_EndpointParamsPromiseReposEnablePagesSiteParams = js.native
  /**
    * Enables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  @JSName("enableVulnerabilityAlerts")
  var enableVulnerabilityAlerts_Original: Anon_EndpointParamsPromiseReposEnableVulnerabilityAlertsParams = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. The `:archive_format` can be either `tarball` or `zipball`. The `:ref` must be a valid Git reference. If you omit `:ref`, the repository’s default branch (usually `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the `Location` header to make a second `GET` request.
    *
    * _Note_: For private repositories, these links are temporary and expire after five minutes.
    *
    * To follow redirects with curl, use the `-L` switch:
    */
  @JSName("getArchiveLink")
  var getArchiveLink_Original: Anon_EndpointParamsPromiseReposGetArchiveLinkParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("getBranchProtection")
  var getBranchProtection_Original: Anon_EndpointParamsPromiseReposGetBranchProtectionParams = js.native
  @JSName("getBranch")
  var getBranch_Original: Anon_EndpointParamsPromiseReposGetBranchParams = js.native
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getClones")
  var getClones_Original: Anon_EndpointParamsPromiseReposGetClonesParams = js.native
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  @JSName("getCodeFrequencyStats")
  var getCodeFrequencyStats_Original: Anon_EndpointParamsPromiseReposGetCodeFrequencyStatsParams = js.native
  /**
    * Possible values for the `permission` key: `admin`, `write`, `read`, `none`.
    */
  @JSName("getCollaboratorPermissionLevel")
  var getCollaboratorPermissionLevel_Original: Anon_EndpointParamsAnyResponsePromiseReposGetCollaboratorPermissionLevelParams = js.native
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    * The most recent status for each context is returned, up to 100. This field [paginates](https://developer.github.com/v3/#pagination) if there are over 100 contexts.
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  @JSName("getCombinedStatusForRef")
  var getCombinedStatusForRef_Original: Anon_EndpointParamsPromiseReposGetCombinedStatusForRefParams = js.native
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  @JSName("getCommitActivityStats")
  var getCommitActivityStats_Original: Anon_EndpointParamsPromiseReposGetCommitActivityStatsParams = js.native
  @JSName("getCommitComment")
  var getCommitComment_Original: Anon_EndpointParamsPromiseReposGetCommitCommentParams = js.native
  /**
    * **Note:** To access this endpoint, you must provide a custom [media type](https://developer.github.com/v3/media) in the `Accept` header:
    *
    * ```
    * application/vnd.github.VERSION.sha
    *
    * ```
    *
    * Returns the SHA-1 of the commit reference. You must have `read` access for the repository to get the SHA-1 of a commit reference. You can use this endpoint to check if a remote reference's SHA-1 is the same as your local reference's SHA-1 by providing the local SHA-1 reference as the ETag.
    */
  @JSName("getCommitRefSha")
  var getCommitRefSha_Original: Anon_EndpointParamsPromiseReposGetCommitRefShaParams = js.native
  /**
    * Diffs with binary data will have no `patch` property. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("getCommit")
  var getCommit_Original: Anon_EndpointParamsPromiseReposGetCommitParams = js.native
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit `:path`, you will receive the contents of all files in the repository.
    *
    * Files and symlinks support [a custom media type](#custom-media-types) for retrieving the raw content or rendered HTML (when supported). All content types support [a custom media type](#custom-media-types) to ensure the content is returned in a consistent object format.
    *
    * **Note**:
    *
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://developer.github.com/v3/git/trees/).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees API](https://developer.github.com/v3/git/trees/#get-a-tree).
    * *   This API supports files up to 1 megabyte in size.
    *
    * The response will be an array of objects, one object for each item in the directory.
    *
    * When listing the contents of a directory, submodules have their "type" specified as "file". Logically, the value _should_ be "submodule". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW). In the next major version of the API, the type will be returned as "submodule".
    *
    * If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the API responds with the content of the file (in the [format shown above](#response-if-content-is-a-file)).
    *
    * Otherwise, the API responds with an object describing the symlink itself:
    *
    * The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out the submodule at that specific commit.
    *
    * If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links["git"]`) and the github.com URLs (`html_url` and `_links["html"]`) will have null values.
    */
  @JSName("getContents")
  var getContents_Original: Anon_EndpointParamsAnyResponsePromiseReposGetContentsParams = js.native
  /**
    * *   `total` - The Total number of commits authored by the contributor.
    *
    * Weekly Hash (`weeks` array):
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  @JSName("getContributorsStats")
  var getContributorsStats_Original: Anon_EndpointParamsPromiseReposGetContributorsStatsParams = js.native
  @JSName("getDeployKey")
  var getDeployKey_Original: Anon_EndpointParamsPromiseReposGetDeployKeyParams = js.native
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  @JSName("getDeploymentStatus")
  var getDeploymentStatus_Original: Anon_EndpointParamsPromiseReposGetDeploymentStatusParams = js.native
  @JSName("getDeployment")
  var getDeployment_Original: Anon_EndpointParamsPromiseReposGetDeploymentParams = js.native
  @JSName("getDownload")
  var getDownload_Original: Anon_EndpointParamsPromiseReposGetDownloadParams = js.native
  @JSName("getHook")
  var getHook_Original: Anon_EndpointParamsPromiseReposGetHookParams = js.native
  @JSName("getLatestPagesBuild")
  var getLatestPagesBuild_Original: Anon_EndpointParamsPromiseReposGetLatestPagesBuildParams = js.native
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  @JSName("getLatestRelease")
  var getLatestRelease_Original: Anon_EndpointParamsPromiseReposGetLatestReleaseParams = js.native
  @JSName("getPagesBuild")
  var getPagesBuild_Original: Anon_EndpointParamsPromiseReposGetPagesBuildParams = js.native
  @JSName("getPages")
  var getPages_Original: Anon_EndpointParamsPromiseReposGetPagesParams = js.native
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  @JSName("getParticipationStats")
  var getParticipationStats_Original: Anon_EndpointParamsPromiseReposGetParticipationStatsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("getProtectedBranchAdminEnforcement")
  var getProtectedBranchAdminEnforcement_Original: Anon_EndpointParamsAnyResponsePromiseReposGetProtectedBranchAdminEnforcementParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("getProtectedBranchPullRequestReviewEnforcement")
  var getProtectedBranchPullRequestReviewEnforcement_Original: Anon_EndpointParamsAnyResponsePromiseReposGetProtectedBranchPullRequestReviewEnforcementParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://help.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  @JSName("getProtectedBranchRequiredSignatures")
  var getProtectedBranchRequiredSignatures_Original: Anon_EndpointParamsPromiseReposGetProtectedBranchRequiredSignaturesParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("getProtectedBranchRequiredStatusChecks")
  var getProtectedBranchRequiredStatusChecks_Original: Anon_EndpointParamsPromiseReposGetProtectedBranchRequiredStatusChecksParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * **Note**: Teams and users `restrictions` are only available for organization-owned repositories.
    */
  @JSName("getProtectedBranchRestrictions")
  var getProtectedBranchRestrictions_Original: Anon_EndpointParamsAnyResponsePromiseReposGetProtectedBranchRestrictionsParams = js.native
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  @JSName("getPunchCardStats")
  var getPunchCardStats_Original: Anon_EndpointParamsPromiseReposGetPunchCardStatsParams = js.native
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  @JSName("getReadme")
  var getReadme_Original: Anon_EndpointParamsPromiseReposGetReadmeParams = js.native
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://developer.github.com/v3/media/#media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  @JSName("getReleaseAsset")
  var getReleaseAsset_Original: Anon_EndpointParamsPromiseReposGetReleaseAssetParams = js.native
  /**
    * Get a published release with the specified tag.
    */
  @JSName("getReleaseByTag")
  var getReleaseByTag_Original: Anon_EndpointParamsPromiseReposGetReleaseByTagParams = js.native
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://developer.github.com/v3/#hypermedia).
    */
  @JSName("getRelease")
  var getRelease_Original: Anon_EndpointParamsPromiseReposGetReleaseParams = js.native
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  @JSName("getTopPaths")
  var getTopPaths_Original: Anon_EndpointParamsPromiseReposGetTopPathsParams = js.native
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  @JSName("getTopReferrers")
  var getTopReferrers_Original: Anon_EndpointParamsPromiseReposGetTopReferrersParams = js.native
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getViews")
  var getViews_Original: Anon_EndpointParamsPromiseReposGetViewsParams = js.native
  /**
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsPromiseReposGetParams = js.native
  @JSName("listAssetsForRelease")
  var listAssetsForRelease_Original: Anon_EndpointParamsPromiseReposListAssetsForReleaseParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  @JSName("listBranchesForHeadCommit")
  var listBranchesForHeadCommit_Original: Anon_EndpointParamsPromiseReposListBranchesForHeadCommitParams = js.native
  @JSName("listBranches")
  var listBranches_Original: Anon_EndpointParamsPromiseReposListBranchesParams = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: Anon_EndpointParamsPromiseReposListCollaboratorsParams = js.native
  @JSName("listCommentsForCommit")
  var listCommentsForCommit_Original: Anon_EndpointParamsPromiseReposListCommentsForCommitParams = js.native
  /**
    * Commit Comments use [these custom media types](#custom-media-types). You can read more about the use of media types in the API [here](https://developer.github.com/v3/media/).
    *
    * Comments are ordered by ascending ID.
    */
  @JSName("listCommitComments")
  var listCommitComments_Original: Anon_EndpointParamsPromiseReposListCommitCommentsParams = js.native
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("listCommits")
  var listCommits_Original: Anon_EndpointParamsPromiseReposListCommitsParams = js.native
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  @JSName("listContributors")
  var listContributors_Original: Anon_EndpointParamsAnyResponsePromiseReposListContributorsParams = js.native
  @JSName("listDeployKeys")
  var listDeployKeys_Original: Anon_EndpointParamsPromiseReposListDeployKeysParams = js.native
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  @JSName("listDeploymentStatuses")
  var listDeploymentStatuses_Original: Anon_EndpointParamsPromiseReposListDeploymentStatusesParams = js.native
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  @JSName("listDeployments")
  var listDeployments_Original: Anon_EndpointParamsPromiseReposListDeploymentsParams = js.native
  @JSName("listDownloads")
  var listDownloads_Original: Anon_EndpointParamsPromiseReposListDownloadsParams = js.native
  /**
    * List repositories for the specified org.
    */
  @JSName("listForOrg")
  var listForOrg_Original: Anon_EndpointParamsPromiseReposListForOrgParams = js.native
  /**
    * List public repositories for the specified user.
    */
  @JSName("listForUser")
  var listForUser_Original: Anon_EndpointParamsAnyResponsePromiseReposListForUserParams = js.native
  @JSName("listForks")
  var listForks_Original: Anon_EndpointParamsPromiseReposListForksParams = js.native
  @JSName("listHooks")
  var listHooks_Original: Anon_EndpointParamsPromiseReposListHooksParams = js.native
  /**
    * When authenticating as a user, this endpoint will list all currently open repository invitations for that user.
    */
  @JSName("listInvitationsForAuthenticatedUser")
  var listInvitationsForAuthenticatedUser_Original: Anon_EndpointParamsPromiseReposListInvitationsForAuthenticatedUserParams = js.native
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  @JSName("listInvitations")
  var listInvitations_Original: Anon_EndpointParamsPromiseReposListInvitationsParams = js.native
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  @JSName("listLanguages")
  var listLanguages_Original: Anon_EndpointParamsPromiseReposListLanguagesParams = js.native
  @JSName("listPagesBuilds")
  var listPagesBuilds_Original: Anon_EndpointParamsPromiseReposListPagesBuildsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("listProtectedBranchRequiredStatusChecksContexts")
  var listProtectedBranchRequiredStatusChecksContexts_Original: Anon_EndpointParamsAnyResponsePromiseReposListProtectedBranchRequiredStatusChecksContextsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. If you pass the `hellcat-preview` media type, the list includes child teams.
    */
  @JSName("listProtectedBranchTeamRestrictions")
  var listProtectedBranchTeamRestrictions_Original: Anon_EndpointParamsPromiseReposListProtectedBranchTeamRestrictionsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  @JSName("listProtectedBranchUserRestrictions")
  var listProtectedBranchUserRestrictions_Original: Anon_EndpointParamsAnyResponsePromiseReposListProtectedBranchUserRestrictionsParams = js.native
  /**
    * This provides a dump of every public repository, in the order that they were created.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of repositories.
    */
  @JSName("listPublic")
  var listPublic_Original: Anon_EndpointParamsPromiseReposListPublicParams = js.native
  /**
    * Lists all pull requests containing the provided commit SHA, which can be from any point in the commit history. The results will include open and closed pull requests. Additional preview headers may be required to see certain details for associated pull requests, such as whether a pull request is in a draft state. For more information about previews that might affect this endpoint, see the [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoint.
    */
  @JSName("listPullRequestsAssociatedWithCommit")
  var listPullRequestsAssociatedWithCommit_Original: Anon_EndpointParamsPromiseReposListPullRequestsAssociatedWithCommitParams = js.native
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://developer.github.com/v3/repos/#list-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  @JSName("listReleases")
  var listReleases_Original: Anon_EndpointParamsPromiseReposListReleasesParams = js.native
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  @JSName("listStatusesForRef")
  var listStatusesForRef_Original: Anon_EndpointParamsPromiseReposListStatusesForRefParams = js.native
  @JSName("listTags")
  var listTags_Original: Anon_EndpointParamsPromiseReposListTagsParams = js.native
  @JSName("listTeams")
  var listTeams_Original: Anon_EndpointParamsPromiseReposListTeamsParams = js.native
  @JSName("listTopics")
  var listTopics_Original: Anon_EndpointParamsPromiseReposListTopicsParams = js.native
  /**
    * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    */
  @JSName("list")
  var list_Original: Anon_EndpointParamsAnyResponsePromiseReposListParams = js.native
  @JSName("merge")
  var merge_Original: Anon_EndpointParamsAnyResponsePromiseReposMergeParams = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingHook")
  var pingHook_Original: Anon_EndpointParamsPromiseReposPingHookParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("removeBranchProtection")
  var removeBranchProtection_Original: Anon_EndpointParamsPromiseReposRemoveBranchProtectionParams = js.native
  @JSName("removeCollaborator")
  var removeCollaborator_Original: Anon_EndpointParamsPromiseReposRemoveCollaboratorParams = js.native
  @JSName("removeDeployKey")
  var removeDeployKey_Original: Anon_EndpointParamsPromiseReposRemoveDeployKeyParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("removeProtectedBranchAdminEnforcement")
  var removeProtectedBranchAdminEnforcement_Original: Anon_EndpointParamsAnyResponsePromiseReposRemoveProtectedBranchAdminEnforcementParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("removeProtectedBranchPullRequestReviewEnforcement")
  var removeProtectedBranchPullRequestReviewEnforcement_Original: Anon_EndpointParamsAnyResponsePromiseReposRemoveProtectedBranchPullRequestReviewEnforcementParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("removeProtectedBranchRequiredSignatures")
  var removeProtectedBranchRequiredSignatures_Original: Anon_EndpointParamsAnyResponsePromiseReposRemoveProtectedBranchRequiredSignaturesParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("removeProtectedBranchRequiredStatusChecksContexts")
  var removeProtectedBranchRequiredStatusChecksContexts_Original: Anon_EndpointParamsPromiseReposRemoveProtectedBranchRequiredStatusChecksContextsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("removeProtectedBranchRequiredStatusChecks")
  var removeProtectedBranchRequiredStatusChecks_Original: Anon_EndpointParamsAnyResponsePromiseReposRemoveProtectedBranchRequiredStatusChecksParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  @JSName("removeProtectedBranchRestrictions")
  var removeProtectedBranchRestrictions_Original: Anon_EndpointParamsAnyResponsePromiseReposRemoveProtectedBranchRestrictionsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. If you pass the `hellcat-preview` media type, you can include child teams.
    *
    * | Type    | Description                                                                                                                                  |
    * | ------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Teams that should no longer have push access. Use the team's `slug`. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  @JSName("removeProtectedBranchTeamRestrictions")
  var removeProtectedBranchTeamRestrictions_Original: Anon_EndpointParamsPromiseReposRemoveProtectedBranchTeamRestrictionsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch.
    *
    * | Type    | Description                                                                                                                            |
    * | ------- | -------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  @JSName("removeProtectedBranchUserRestrictions")
  var removeProtectedBranchUserRestrictions_Original: Anon_EndpointParamsPromiseReposRemoveProtectedBranchUserRestrictionsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  @JSName("replaceProtectedBranchRequiredStatusChecksContexts")
  var replaceProtectedBranchRequiredStatusChecksContexts_Original: Anon_EndpointParamsPromiseReposReplaceProtectedBranchRequiredStatusChecksContextsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. If you pass the `hellcat-preview` media type, you can include child teams.
    *
    * | Type    | Description                                                                                                                         |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  @JSName("replaceProtectedBranchTeamRestrictions")
  var replaceProtectedBranchTeamRestrictions_Original: Anon_EndpointParamsPromiseReposReplaceProtectedBranchTeamRestrictionsParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.
    *
    * | Type    | Description                                                                                                            |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  @JSName("replaceProtectedBranchUserRestrictions")
  var replaceProtectedBranchUserRestrictions_Original: Anon_EndpointParamsPromiseReposReplaceProtectedBranchUserRestrictionsParams = js.native
  @JSName("replaceTopics")
  var replaceTopics_Original: Anon_EndpointParamsPromiseReposReplaceTopicsParams = js.native
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  @JSName("requestPageBuild")
  var requestPageBuild_Original: Anon_EndpointParamsPromiseReposRequestPageBuildParams = js.native
  /**
    * This endpoint will return all community profile metrics, including an overall health score, repository description, the presence of documentation, detected code of conduct, detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE, README, and CONTRIBUTING files.
    */
  @JSName("retrieveCommunityProfileMetrics")
  var retrieveCommunityProfileMetrics_Original: Anon_EndpointParamsPromiseReposRetrieveCommunityProfileMetricsParams = js.native
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  @JSName("testPushHook")
  var testPushHook_Original: Anon_EndpointParamsPromiseReposTestPushHookParams = js.native
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://help.github.com/articles/about-repository-transfers/).
    */
  @JSName("transfer")
  var transfer_Original: Anon_EndpointParamsPromiseReposTransferParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Protecting a branch requires admin or owner permissions to the repository.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    *
    * **Note**: The list of users and teams in total is limited to 100 items.
    */
  @JSName("updateBranchProtection")
  var updateBranchProtection_Original: Anon_EndpointParamsPromiseReposUpdateBranchProtectionParams = js.native
  @JSName("updateCommitComment")
  var updateCommitComment_Original: Anon_EndpointParamsPromiseReposUpdateCommitCommentParams = js.native
  /**
    * Updates a file in a repository.
    */
  @JSName("updateFile")
  var updateFile_Original: Anon_EndpointParamsPromiseReposUpdateFileParams = js.native
  @JSName("updateHook")
  var updateHook_Original: Anon_EndpointParamsPromiseReposUpdateHookParams = js.native
  @JSName("updateInformationAboutPagesSite")
  var updateInformationAboutPagesSite_Original: Anon_EndpointParamsPromiseReposUpdateInformationAboutPagesSiteParams = js.native
  @JSName("updateInvitation")
  var updateInvitation_Original: Anon_EndpointParamsPromiseReposUpdateInvitationParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  @JSName("updateProtectedBranchPullRequestReviewEnforcement")
  var updateProtectedBranchPullRequestReviewEnforcement_Original: Anon_EndpointParamsPromiseReposUpdateProtectedBranchPullRequestReviewEnforcementParams = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("updateProtectedBranchRequiredStatusChecks")
  var updateProtectedBranchRequiredStatusChecks_Original: Anon_EndpointParamsPromiseReposUpdateProtectedBranchRequiredStatusChecksParams = js.native
  /**
    * Users with push access to the repository can edit a release asset.
    */
  @JSName("updateReleaseAsset")
  var updateReleaseAsset_Original: Anon_EndpointParamsPromiseReposUpdateReleaseAssetParams = js.native
  /**
    * Users with push access to the repository can edit a release.
    */
  @JSName("updateRelease")
  var updateRelease_Original: Anon_EndpointParamsPromiseReposUpdateReleaseParams = js.native
  /**
    * **Note**: To edit a repository's topics, use the [`topics` endpoint](#replace-all-topics-for-a-repository).
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsPromiseReposUpdateParams = js.native
  /**
    * This endpoint makes use of [a Hypermedia relation](https://developer.github.com/v3/#hypermedia) to determine which URL to access. This endpoint is provided by a URI template in [the release's API response](#get-a-single-release). You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.
    *
    * The asset data is expected in its raw binary form, rather than JSON. Everything else about the endpoint is the same as the rest of the API. For example, you'll still need to pass your authentication to be able to upload an asset.
    *
    * Send the raw binary content of the asset as the request body.
    *
    * This may leave an empty asset with a state of `"new"`. It can be safely deleted.
    */
  @JSName("uploadReleaseAsset")
  var uploadReleaseAsset_Original: Anon_EndpointParamsAnyResponsePromiseReposUploadReleaseAssetParams = js.native
  def acceptInvitation(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposAcceptInvitationResponse]
  ] = js.native
  def acceptInvitation(params: atOctokitRestLib.atOctokitRestMod.ReposAcceptInvitationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposAcceptInvitationResponse]
  ] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://developer.github.com/v3/repos/invitations/).
    *
    * **Rate limits**
    *
    * To prevent abuse, you are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  def addCollaborator(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def addCollaborator(params: atOctokitRestLib.atOctokitRestMod.ReposAddCollaboratorParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Here's how you can create a read-only deploy key:
    */
  def addDeployKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposAddDeployKeyResponse]
  ] = js.native
  def addDeployKey(params: atOctokitRestLib.atOctokitRestMod.ReposAddDeployKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposAddDeployKeyResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def addProtectedBranchAdminEnforcement(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchAdminEnforcementResponse
    ]
  ] = js.native
  def addProtectedBranchAdminEnforcement(params: atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchAdminEnforcementParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchAdminEnforcementResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def addProtectedBranchRequiredSignatures(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchRequiredSignaturesResponse
    ]
  ] = js.native
  def addProtectedBranchRequiredSignatures(params: atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchRequiredSignaturesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchRequiredSignaturesResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def addProtectedBranchRequiredStatusChecksContexts(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchRequiredStatusChecksContextsResponse
    ]
  ] = js.native
  def addProtectedBranchRequiredStatusChecksContexts(
    params: atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchRequiredStatusChecksContextsParams
  ): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchRequiredStatusChecksContextsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. If you pass the `hellcat-preview` media type, you can also give push access to child teams.
    *
    * | Type    | Description                                                                                                                         |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  def addProtectedBranchTeamRestrictions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  def addProtectedBranchTeamRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchTeamRestrictionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Grants the specified people push access for this branch.
    *
    * | Type    | Description                                                                                                            |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  def addProtectedBranchUserRestrictions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchUserRestrictionsResponse
    ]
  ] = js.native
  def addProtectedBranchUserRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchUserRestrictionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposAddProtectedBranchUserRestrictionsResponse
    ]
  ] = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    */
  def checkCollaborator(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def checkCollaborator(params: atOctokitRestLib.atOctokitRestMod.ReposCheckCollaboratorParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * **Working with large comparisons**
    *
    * The response will include a comparison of up to 250 commits. If you are working with a larger commit range, you can use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository) to enumerate all commits in the range.
    *
    * For comparisons with extremely large diffs, you may receive an error response indicating that the diff took too long to generate. You can typically resolve this error by using a smaller commit range.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def compareCommits(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCompareCommitsResponse]
  ] = js.native
  def compareCommits(params: atOctokitRestLib.atOctokitRestMod.ReposCompareCommitsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCompareCommitsResponse]
  ] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createCommitComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateCommitCommentResponse]
  ] = js.native
  def createCommitComment(params: atOctokitRestLib.atOctokitRestMod.ReposCreateCommitCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateCommitCommentResponse]
  ] = js.native
  /**
    * Deployments offer a few configurable parameters with sane defaults.
    *
    * The `ref` parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them before we merge a pull request.
    *
    * The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter makes it easier to track which environments have requested deployments. The default environment is `production`.
    *
    * The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds, the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will return a failure response.
    *
    * By default, [commit statuses](https://developer.github.com/v3/repos/statuses) for every submitted context must be in a `success` state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do not require any contexts or create any commit statuses, the deployment will always succeed.
    *
    * The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text field that will be passed on when a deployment event is dispatched.
    *
    * The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an application with debugging enabled.
    *
    * Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref:
    *
    * A simple example putting the user and room into the payload to notify back to chat networks.
    *
    * A more advanced example specifying required commit statuses and bypassing auto-merging.
    *
    * You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating a deployment. This auto-merge happens when:
    *
    * *   Auto-merge option is enabled in the repository
    * *   Topic branch does not include the latest changes on the base branch, which is `master`in the response example
    * *   There are no merge conflicts
    *
    * If there are no new commits in the base branch, a new request to create a deployment should give a successful response.
    *
    * This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.
    *
    * This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success` status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.
    */
  def createDeployment(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def createDeployment(params: atOctokitRestLib.atOctokitRestMod.ReposCreateDeploymentParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  def createDeploymentStatus(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateDeploymentStatusResponse]
  ] = js.native
  def createDeploymentStatus(params: atOctokitRestLib.atOctokitRestMod.ReposCreateDeploymentStatusParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateDeploymentStatusResponse]
  ] = js.native
  /**
    * Creates a new file in a repository.
    */
  def createFile(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateFileResponse]
  ] = js.native
  def createFile(params: atOctokitRestLib.atOctokitRestMod.ReposCreateFileParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateFileResponse]
  ] = js.native
  /**
    * **Note**: There are two endpoints for creating a repository: one to create a repository on a user account, and one to create a repository in an organization. The organization endpoint is fully enabled for [GitHub Apps](https://developer.github.com/v3/apps/available-endpoints/), whereas the user endpoint is enabled only for [user-to-server requests](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#user-to-server-requests).
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  def createForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateForAuthenticatedUserResponse]
  ] = js.native
  def createForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.ReposCreateForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateForAuthenticatedUserResponse]
  ] = js.native
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://github.com/contact).
    */
  def createFork(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateForkResponse]
  ] = js.native
  def createFork(params: atOctokitRestLib.atOctokitRestMod.ReposCreateForkParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateForkResponse]
  ] = js.native
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can share the same `config` as long as those webhooks do not have any `events` that overlap.
    *
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  def createHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateHookResponse]
  ] = js.native
  def createHook(params: atOctokitRestLib.atOctokitRestMod.ReposCreateHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateHookResponse]
  ] = js.native
  /**
    * **Note**: There are two endpoints for creating a repository: one to create a repository on a user account, and one to create a repository in an organization. The organization endpoint is fully enabled for [GitHub Apps](https://developer.github.com/v3/apps/available-endpoints/), whereas the user endpoint is enabled only for [user-to-server requests](https://developer.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#user-to-server-requests).
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  def createInOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateInOrgResponse]
  ] = js.native
  def createInOrg(params: atOctokitRestLib.atOctokitRestMod.ReposCreateInOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateInOrgResponse]
  ] = js.native
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createRelease(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateReleaseResponse]
  ] = js.native
  def createRelease(params: atOctokitRestLib.atOctokitRestMod.ReposCreateReleaseParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateReleaseResponse]
  ] = js.native
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  def createStatus(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateStatusResponse]
  ] = js.native
  def createStatus(params: atOctokitRestLib.atOctokitRestMod.ReposCreateStatusParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposCreateStatusResponse]
  ] = js.native
  def declineInvitation(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeclineInvitationResponse]
  ] = js.native
  def declineInvitation(params: atOctokitRestLib.atOctokitRestMod.ReposDeclineInvitationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeclineInvitationResponse]
  ] = js.native
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response:
    */
  def delete(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteResponse]
  ] = js.native
  def delete(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteResponse]
  ] = js.native
  def deleteCommitComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteCommitCommentResponse]
  ] = js.native
  def deleteCommitComment(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteCommitCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteCommitCommentResponse]
  ] = js.native
  def deleteDownload(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteDownloadResponse]
  ] = js.native
  def deleteDownload(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteDownloadParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteDownloadResponse]
  ] = js.native
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    */
  def deleteFile(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteFileResponse]
  ] = js.native
  def deleteFile(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteFileParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteFileResponse]
  ] = js.native
  def deleteHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteHookResponse]
  ] = js.native
  def deleteHook(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteHookResponse]
  ] = js.native
  def deleteInvitation(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteInvitationResponse]
  ] = js.native
  def deleteInvitation(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteInvitationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteInvitationResponse]
  ] = js.native
  /**
    * Users with push access to the repository can delete a release.
    */
  def deleteRelease(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteReleaseResponse]
  ] = js.native
  def deleteRelease(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteReleaseParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteReleaseResponse]
  ] = js.native
  def deleteReleaseAsset(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteReleaseAssetResponse]
  ] = js.native
  def deleteReleaseAsset(params: atOctokitRestLib.atOctokitRestMod.ReposDeleteReleaseAssetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDeleteReleaseAssetResponse]
  ] = js.native
  def disablePagesSite(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDisablePagesSiteResponse]
  ] = js.native
  def disablePagesSite(params: atOctokitRestLib.atOctokitRestMod.ReposDisablePagesSiteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDisablePagesSiteResponse]
  ] = js.native
  /**
    * Disables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  def disableVulnerabilityAlerts(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDisableVulnerabilityAlertsResponse]
  ] = js.native
  def disableVulnerabilityAlerts(params: atOctokitRestLib.atOctokitRestMod.ReposDisableVulnerabilityAlertsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposDisableVulnerabilityAlertsResponse]
  ] = js.native
  def enablePagesSite(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposEnablePagesSiteResponse]
  ] = js.native
  def enablePagesSite(params: atOctokitRestLib.atOctokitRestMod.ReposEnablePagesSiteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposEnablePagesSiteResponse]
  ] = js.native
  /**
    * Enables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  def enableVulnerabilityAlerts(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposEnableVulnerabilityAlertsResponse]
  ] = js.native
  def enableVulnerabilityAlerts(params: atOctokitRestLib.atOctokitRestMod.ReposEnableVulnerabilityAlertsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposEnableVulnerabilityAlertsResponse]
  ] = js.native
  /**
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.ReposGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetResponse]
  ] = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. The `:archive_format` can be either `tarball` or `zipball`. The `:ref` must be a valid Git reference. If you omit `:ref`, the repository’s default branch (usually `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the `Location` header to make a second `GET` request.
    *
    * _Note_: For private repositories, these links are temporary and expire after five minutes.
    *
    * To follow redirects with curl, use the `-L` switch:
    */
  def getArchiveLink(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetArchiveLinkResponse]
  ] = js.native
  def getArchiveLink(params: atOctokitRestLib.atOctokitRestMod.ReposGetArchiveLinkParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetArchiveLinkResponse]
  ] = js.native
  def getBranch(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetBranchResponse]
  ] = js.native
  def getBranch(params: atOctokitRestLib.atOctokitRestMod.ReposGetBranchParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetBranchResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def getBranchProtection(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetBranchProtectionResponse]
  ] = js.native
  def getBranchProtection(params: atOctokitRestLib.atOctokitRestMod.ReposGetBranchProtectionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetBranchProtectionResponse]
  ] = js.native
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getClones(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetClonesResponse]
  ] = js.native
  def getClones(params: atOctokitRestLib.atOctokitRestMod.ReposGetClonesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetClonesResponse]
  ] = js.native
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  def getCodeFrequencyStats(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCodeFrequencyStatsResponse]
  ] = js.native
  def getCodeFrequencyStats(params: atOctokitRestLib.atOctokitRestMod.ReposGetCodeFrequencyStatsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCodeFrequencyStatsResponse]
  ] = js.native
  /**
    * Possible values for the `permission` key: `admin`, `write`, `read`, `none`.
    */
  def getCollaboratorPermissionLevel(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getCollaboratorPermissionLevel(params: atOctokitRestLib.atOctokitRestMod.ReposGetCollaboratorPermissionLevelParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    * The most recent status for each context is returned, up to 100. This field [paginates](https://developer.github.com/v3/#pagination) if there are over 100 contexts.
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  def getCombinedStatusForRef(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCombinedStatusForRefResponse]
  ] = js.native
  def getCombinedStatusForRef(params: atOctokitRestLib.atOctokitRestMod.ReposGetCombinedStatusForRefParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCombinedStatusForRefResponse]
  ] = js.native
  /**
    * Diffs with binary data will have no `patch` property. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def getCommit(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitResponse]
  ] = js.native
  def getCommit(params: atOctokitRestLib.atOctokitRestMod.ReposGetCommitParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitResponse]
  ] = js.native
  def getCommit(params: atOctokitRestLib.atOctokitRestMod.ReposGetCommitParamsDeprecatedSha): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitResponse]
  ] = js.native
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  def getCommitActivityStats(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitActivityStatsResponse]
  ] = js.native
  def getCommitActivityStats(params: atOctokitRestLib.atOctokitRestMod.ReposGetCommitActivityStatsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitActivityStatsResponse]
  ] = js.native
  def getCommitComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitCommentResponse]
  ] = js.native
  def getCommitComment(params: atOctokitRestLib.atOctokitRestMod.ReposGetCommitCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitCommentResponse]
  ] = js.native
  /**
    * **Note:** To access this endpoint, you must provide a custom [media type](https://developer.github.com/v3/media) in the `Accept` header:
    *
    * ```
    * application/vnd.github.VERSION.sha
    *
    * ```
    *
    * Returns the SHA-1 of the commit reference. You must have `read` access for the repository to get the SHA-1 of a commit reference. You can use this endpoint to check if a remote reference's SHA-1 is the same as your local reference's SHA-1 by providing the local SHA-1 reference as the ETag.
    */
  def getCommitRefSha(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitRefShaResponse]
  ] = js.native
  def getCommitRefSha(params: atOctokitRestLib.atOctokitRestMod.ReposGetCommitRefShaParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetCommitRefShaResponse]
  ] = js.native
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit `:path`, you will receive the contents of all files in the repository.
    *
    * Files and symlinks support [a custom media type](#custom-media-types) for retrieving the raw content or rendered HTML (when supported). All content types support [a custom media type](#custom-media-types) to ensure the content is returned in a consistent object format.
    *
    * **Note**:
    *
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://developer.github.com/v3/git/trees/).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees API](https://developer.github.com/v3/git/trees/#get-a-tree).
    * *   This API supports files up to 1 megabyte in size.
    *
    * The response will be an array of objects, one object for each item in the directory.
    *
    * When listing the contents of a directory, submodules have their "type" specified as "file". Logically, the value _should_ be "submodule". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW). In the next major version of the API, the type will be returned as "submodule".
    *
    * If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the API responds with the content of the file (in the [format shown above](#response-if-content-is-a-file)).
    *
    * Otherwise, the API responds with an object describing the symlink itself:
    *
    * The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out the submodule at that specific commit.
    *
    * If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links["git"]`) and the github.com URLs (`html_url` and `_links["html"]`) will have null values.
    */
  def getContents(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getContents(params: atOctokitRestLib.atOctokitRestMod.ReposGetContentsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * *   `total` - The Total number of commits authored by the contributor.
    *
    * Weekly Hash (`weeks` array):
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  def getContributorsStats(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetContributorsStatsResponse]
  ] = js.native
  def getContributorsStats(params: atOctokitRestLib.atOctokitRestMod.ReposGetContributorsStatsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetContributorsStatsResponse]
  ] = js.native
  def getDeployKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDeployKeyResponse]
  ] = js.native
  def getDeployKey(params: atOctokitRestLib.atOctokitRestMod.ReposGetDeployKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDeployKeyResponse]
  ] = js.native
  def getDeployment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDeploymentResponse]
  ] = js.native
  def getDeployment(params: atOctokitRestLib.atOctokitRestMod.ReposGetDeploymentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDeploymentResponse]
  ] = js.native
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  def getDeploymentStatus(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDeploymentStatusResponse]
  ] = js.native
  def getDeploymentStatus(params: atOctokitRestLib.atOctokitRestMod.ReposGetDeploymentStatusParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDeploymentStatusResponse]
  ] = js.native
  def getDownload(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDownloadResponse]
  ] = js.native
  def getDownload(params: atOctokitRestLib.atOctokitRestMod.ReposGetDownloadParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetDownloadResponse]
  ] = js.native
  def getHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetHookResponse]
  ] = js.native
  def getHook(params: atOctokitRestLib.atOctokitRestMod.ReposGetHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetHookResponse]
  ] = js.native
  def getLatestPagesBuild(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetLatestPagesBuildResponse]
  ] = js.native
  def getLatestPagesBuild(params: atOctokitRestLib.atOctokitRestMod.ReposGetLatestPagesBuildParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetLatestPagesBuildResponse]
  ] = js.native
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  def getLatestRelease(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetLatestReleaseResponse]
  ] = js.native
  def getLatestRelease(params: atOctokitRestLib.atOctokitRestMod.ReposGetLatestReleaseParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetLatestReleaseResponse]
  ] = js.native
  def getPages(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetPagesResponse]
  ] = js.native
  def getPages(params: atOctokitRestLib.atOctokitRestMod.ReposGetPagesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetPagesResponse]
  ] = js.native
  def getPagesBuild(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetPagesBuildResponse]
  ] = js.native
  def getPagesBuild(params: atOctokitRestLib.atOctokitRestMod.ReposGetPagesBuildParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetPagesBuildResponse]
  ] = js.native
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  def getParticipationStats(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetParticipationStatsResponse]
  ] = js.native
  def getParticipationStats(params: atOctokitRestLib.atOctokitRestMod.ReposGetParticipationStatsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetParticipationStatsResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def getProtectedBranchAdminEnforcement(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getProtectedBranchAdminEnforcement(params: atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchAdminEnforcementParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def getProtectedBranchPullRequestReviewEnforcement(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getProtectedBranchPullRequestReviewEnforcement(
    params: atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchPullRequestReviewEnforcementParams
  ): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://help.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  def getProtectedBranchRequiredSignatures(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchRequiredSignaturesResponse
    ]
  ] = js.native
  def getProtectedBranchRequiredSignatures(params: atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchRequiredSignaturesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchRequiredSignaturesResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def getProtectedBranchRequiredStatusChecks(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchRequiredStatusChecksResponse
    ]
  ] = js.native
  def getProtectedBranchRequiredStatusChecks(params: atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchRequiredStatusChecksParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchRequiredStatusChecksResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * **Note**: Teams and users `restrictions` are only available for organization-owned repositories.
    */
  def getProtectedBranchRestrictions(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getProtectedBranchRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposGetProtectedBranchRestrictionsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  def getPunchCardStats(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetPunchCardStatsResponse]
  ] = js.native
  def getPunchCardStats(params: atOctokitRestLib.atOctokitRestMod.ReposGetPunchCardStatsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetPunchCardStatsResponse]
  ] = js.native
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  def getReadme(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReadmeResponse]
  ] = js.native
  def getReadme(params: atOctokitRestLib.atOctokitRestMod.ReposGetReadmeParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReadmeResponse]
  ] = js.native
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://developer.github.com/v3/#hypermedia).
    */
  def getRelease(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReleaseResponse]
  ] = js.native
  def getRelease(params: atOctokitRestLib.atOctokitRestMod.ReposGetReleaseParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReleaseResponse]
  ] = js.native
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://developer.github.com/v3/media/#media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  def getReleaseAsset(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReleaseAssetResponse]
  ] = js.native
  def getReleaseAsset(params: atOctokitRestLib.atOctokitRestMod.ReposGetReleaseAssetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReleaseAssetResponse]
  ] = js.native
  /**
    * Get a published release with the specified tag.
    */
  def getReleaseByTag(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReleaseByTagResponse]
  ] = js.native
  def getReleaseByTag(params: atOctokitRestLib.atOctokitRestMod.ReposGetReleaseByTagParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetReleaseByTagResponse]
  ] = js.native
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  def getTopPaths(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetTopPathsResponse]
  ] = js.native
  def getTopPaths(params: atOctokitRestLib.atOctokitRestMod.ReposGetTopPathsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetTopPathsResponse]
  ] = js.native
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  def getTopReferrers(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetTopReferrersResponse]
  ] = js.native
  def getTopReferrers(params: atOctokitRestLib.atOctokitRestMod.ReposGetTopReferrersParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetTopReferrersResponse]
  ] = js.native
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getViews(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetViewsResponse]
  ] = js.native
  def getViews(params: atOctokitRestLib.atOctokitRestMod.ReposGetViewsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposGetViewsResponse]
  ] = js.native
  /**
    * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    */
  def list(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def list(params: atOctokitRestLib.atOctokitRestMod.ReposListParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listAssetsForRelease(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListAssetsForReleaseResponse]
  ] = js.native
  def listAssetsForRelease(params: atOctokitRestLib.atOctokitRestMod.ReposListAssetsForReleaseParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListAssetsForReleaseResponse]
  ] = js.native
  def listBranches(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListBranchesResponse]
  ] = js.native
  def listBranches(params: atOctokitRestLib.atOctokitRestMod.ReposListBranchesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListBranchesResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  def listBranchesForHeadCommit(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListBranchesForHeadCommitResponse]
  ] = js.native
  def listBranchesForHeadCommit(params: atOctokitRestLib.atOctokitRestMod.ReposListBranchesForHeadCommitParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListBranchesForHeadCommitResponse]
  ] = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * If you pass the `hellcat-preview` media type, team members will include the members of child teams.
    */
  def listCollaborators(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCollaboratorsResponse]
  ] = js.native
  def listCollaborators(params: atOctokitRestLib.atOctokitRestMod.ReposListCollaboratorsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCollaboratorsResponse]
  ] = js.native
  def listCommentsForCommit(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCommentsForCommitResponse]
  ] = js.native
  def listCommentsForCommit(params: atOctokitRestLib.atOctokitRestMod.ReposListCommentsForCommitParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCommentsForCommitResponse]
  ] = js.native
  /**
    * Commit Comments use [these custom media types](#custom-media-types). You can read more about the use of media types in the API [here](https://developer.github.com/v3/media/).
    *
    * Comments are ordered by ascending ID.
    */
  def listCommitComments(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCommitCommentsResponse]
  ] = js.native
  def listCommitComments(params: atOctokitRestLib.atOctokitRestMod.ReposListCommitCommentsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCommitCommentsResponse]
  ] = js.native
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def listCommits(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCommitsResponse]
  ] = js.native
  def listCommits(params: atOctokitRestLib.atOctokitRestMod.ReposListCommitsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListCommitsResponse]
  ] = js.native
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  def listContributors(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listContributors(params: atOctokitRestLib.atOctokitRestMod.ReposListContributorsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listDeployKeys(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDeployKeysResponse]
  ] = js.native
  def listDeployKeys(params: atOctokitRestLib.atOctokitRestMod.ReposListDeployKeysParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDeployKeysResponse]
  ] = js.native
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  def listDeploymentStatuses(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDeploymentStatusesResponse]
  ] = js.native
  def listDeploymentStatuses(params: atOctokitRestLib.atOctokitRestMod.ReposListDeploymentStatusesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDeploymentStatusesResponse]
  ] = js.native
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  def listDeployments(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDeploymentsResponse]
  ] = js.native
  def listDeployments(params: atOctokitRestLib.atOctokitRestMod.ReposListDeploymentsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDeploymentsResponse]
  ] = js.native
  def listDownloads(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDownloadsResponse]
  ] = js.native
  def listDownloads(params: atOctokitRestLib.atOctokitRestMod.ReposListDownloadsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListDownloadsResponse]
  ] = js.native
  /**
    * List repositories for the specified org.
    */
  def listForOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListForOrgResponse]
  ] = js.native
  def listForOrg(params: atOctokitRestLib.atOctokitRestMod.ReposListForOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListForOrgResponse]
  ] = js.native
  /**
    * List public repositories for the specified user.
    */
  def listForUser(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listForUser(params: atOctokitRestLib.atOctokitRestMod.ReposListForUserParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listForks(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListForksResponse]
  ] = js.native
  def listForks(params: atOctokitRestLib.atOctokitRestMod.ReposListForksParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListForksResponse]
  ] = js.native
  def listHooks(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListHooksResponse]
  ] = js.native
  def listHooks(params: atOctokitRestLib.atOctokitRestMod.ReposListHooksParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListHooksResponse]
  ] = js.native
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  def listInvitations(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListInvitationsResponse]
  ] = js.native
  def listInvitations(params: atOctokitRestLib.atOctokitRestMod.ReposListInvitationsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListInvitationsResponse]
  ] = js.native
  /**
    * When authenticating as a user, this endpoint will list all currently open repository invitations for that user.
    */
  def listInvitationsForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposListInvitationsForAuthenticatedUserResponse
    ]
  ] = js.native
  def listInvitationsForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.ReposListInvitationsForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposListInvitationsForAuthenticatedUserResponse
    ]
  ] = js.native
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  def listLanguages(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListLanguagesResponse]
  ] = js.native
  def listLanguages(params: atOctokitRestLib.atOctokitRestMod.ReposListLanguagesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListLanguagesResponse]
  ] = js.native
  def listPagesBuilds(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListPagesBuildsResponse]
  ] = js.native
  def listPagesBuilds(params: atOctokitRestLib.atOctokitRestMod.ReposListPagesBuildsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListPagesBuildsResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def listProtectedBranchRequiredStatusChecksContexts(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listProtectedBranchRequiredStatusChecksContexts(
    params: atOctokitRestLib.atOctokitRestMod.ReposListProtectedBranchRequiredStatusChecksContextsParams
  ): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. If you pass the `hellcat-preview` media type, the list includes child teams.
    */
  def listProtectedBranchTeamRestrictions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposListProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  def listProtectedBranchTeamRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposListProtectedBranchTeamRestrictionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposListProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  def listProtectedBranchUserRestrictions(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listProtectedBranchUserRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposListProtectedBranchUserRestrictionsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * This provides a dump of every public repository, in the order that they were created.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of repositories.
    */
  def listPublic(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListPublicResponse]
  ] = js.native
  def listPublic(params: atOctokitRestLib.atOctokitRestMod.ReposListPublicParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListPublicResponse]
  ] = js.native
  /**
    * Lists all pull requests containing the provided commit SHA, which can be from any point in the commit history. The results will include open and closed pull requests. Additional preview headers may be required to see certain details for associated pull requests, such as whether a pull request is in a draft state. For more information about previews that might affect this endpoint, see the [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoint.
    */
  def listPullRequestsAssociatedWithCommit(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposListPullRequestsAssociatedWithCommitResponse
    ]
  ] = js.native
  def listPullRequestsAssociatedWithCommit(params: atOctokitRestLib.atOctokitRestMod.ReposListPullRequestsAssociatedWithCommitParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposListPullRequestsAssociatedWithCommitResponse
    ]
  ] = js.native
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://developer.github.com/v3/repos/#list-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  def listReleases(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListReleasesResponse]
  ] = js.native
  def listReleases(params: atOctokitRestLib.atOctokitRestMod.ReposListReleasesParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListReleasesResponse]
  ] = js.native
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  def listStatusesForRef(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListStatusesForRefResponse]
  ] = js.native
  def listStatusesForRef(params: atOctokitRestLib.atOctokitRestMod.ReposListStatusesForRefParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListStatusesForRefResponse]
  ] = js.native
  def listTags(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListTagsResponse]
  ] = js.native
  def listTags(params: atOctokitRestLib.atOctokitRestMod.ReposListTagsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListTagsResponse]
  ] = js.native
  def listTeams(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListTeamsResponse]
  ] = js.native
  def listTeams(params: atOctokitRestLib.atOctokitRestMod.ReposListTeamsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListTeamsResponse]
  ] = js.native
  def listTopics(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListTopicsResponse]
  ] = js.native
  def listTopics(params: atOctokitRestLib.atOctokitRestMod.ReposListTopicsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposListTopicsResponse]
  ] = js.native
  def merge(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def merge(params: atOctokitRestLib.atOctokitRestMod.ReposMergeParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposPingHookResponse]
  ] = js.native
  def pingHook(params: atOctokitRestLib.atOctokitRestMod.ReposPingHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposPingHookResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def removeBranchProtection(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRemoveBranchProtectionResponse]
  ] = js.native
  def removeBranchProtection(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveBranchProtectionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRemoveBranchProtectionResponse]
  ] = js.native
  def removeCollaborator(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRemoveCollaboratorResponse]
  ] = js.native
  def removeCollaborator(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveCollaboratorParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRemoveCollaboratorResponse]
  ] = js.native
  def removeDeployKey(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRemoveDeployKeyResponse]
  ] = js.native
  def removeDeployKey(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveDeployKeyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRemoveDeployKeyResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def removeProtectedBranchAdminEnforcement(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def removeProtectedBranchAdminEnforcement(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchAdminEnforcementParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def removeProtectedBranchPullRequestReviewEnforcement(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def removeProtectedBranchPullRequestReviewEnforcement(
    params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchPullRequestReviewEnforcementParams
  ): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def removeProtectedBranchRequiredSignatures(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def removeProtectedBranchRequiredSignatures(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchRequiredSignaturesParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def removeProtectedBranchRequiredStatusChecks(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def removeProtectedBranchRequiredStatusChecks(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchRequiredStatusChecksParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def removeProtectedBranchRequiredStatusChecksContexts(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse
    ]
  ] = js.native
  def removeProtectedBranchRequiredStatusChecksContexts(
    params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsParams
  ): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  def removeProtectedBranchRestrictions(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def removeProtectedBranchRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchRestrictionsParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. If you pass the `hellcat-preview` media type, you can include child teams.
    *
    * | Type    | Description                                                                                                                                  |
    * | ------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Teams that should no longer have push access. Use the team's `slug`. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  def removeProtectedBranchTeamRestrictions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  def removeProtectedBranchTeamRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchTeamRestrictionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch.
    *
    * | Type    | Description                                                                                                                            |
    * | ------- | -------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  def removeProtectedBranchUserRestrictions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchUserRestrictionsResponse
    ]
  ] = js.native
  def removeProtectedBranchUserRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchUserRestrictionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposRemoveProtectedBranchUserRestrictionsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    */
  def replaceProtectedBranchRequiredStatusChecksContexts(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse
    ]
  ] = js.native
  def replaceProtectedBranchRequiredStatusChecksContexts(
    params: atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsParams
  ): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. If you pass the `hellcat-preview` media type, you can include child teams.
    *
    * | Type    | Description                                                                                                                         |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  def replaceProtectedBranchTeamRestrictions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  def replaceProtectedBranchTeamRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchTeamRestrictionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchTeamRestrictionsResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.
    *
    * | Type    | Description                                                                                                            |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users and teams in total is limited to 100 items. |
    */
  def replaceProtectedBranchUserRestrictions(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchUserRestrictionsResponse
    ]
  ] = js.native
  def replaceProtectedBranchUserRestrictions(params: atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchUserRestrictionsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposReplaceProtectedBranchUserRestrictionsResponse
    ]
  ] = js.native
  def replaceTopics(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposReplaceTopicsResponse]
  ] = js.native
  def replaceTopics(params: atOctokitRestLib.atOctokitRestMod.ReposReplaceTopicsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposReplaceTopicsResponse]
  ] = js.native
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  def requestPageBuild(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRequestPageBuildResponse]
  ] = js.native
  def requestPageBuild(params: atOctokitRestLib.atOctokitRestMod.ReposRequestPageBuildParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRequestPageBuildResponse]
  ] = js.native
  /**
    * This endpoint will return all community profile metrics, including an overall health score, repository description, the presence of documentation, detected code of conduct, detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE, README, and CONTRIBUTING files.
    */
  def retrieveCommunityProfileMetrics(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRetrieveCommunityProfileMetricsResponse]
  ] = js.native
  def retrieveCommunityProfileMetrics(params: atOctokitRestLib.atOctokitRestMod.ReposRetrieveCommunityProfileMetricsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposRetrieveCommunityProfileMetricsResponse]
  ] = js.native
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  def testPushHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposTestPushHookResponse]
  ] = js.native
  def testPushHook(params: atOctokitRestLib.atOctokitRestMod.ReposTestPushHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposTestPushHookResponse]
  ] = js.native
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://help.github.com/articles/about-repository-transfers/).
    */
  def transfer(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposTransferResponse]
  ] = js.native
  def transfer(params: atOctokitRestLib.atOctokitRestMod.ReposTransferParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposTransferResponse]
  ] = js.native
  /**
    * **Note**: To edit a repository's topics, use the [`topics` endpoint](#replace-all-topics-for-a-repository).
    */
  def update(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateResponse]
  ] = js.native
  def update(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Protecting a branch requires admin or owner permissions to the repository.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    *
    * **Note**: The list of users and teams in total is limited to 100 items.
    */
  def updateBranchProtection(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateBranchProtectionResponse]
  ] = js.native
  def updateBranchProtection(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateBranchProtectionParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateBranchProtectionResponse]
  ] = js.native
  def updateCommitComment(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateCommitCommentResponse]
  ] = js.native
  def updateCommitComment(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateCommitCommentParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateCommitCommentResponse]
  ] = js.native
  /**
    * Updates a file in a repository.
    */
  def updateFile(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateFileResponse]
  ] = js.native
  def updateFile(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateFileParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateFileResponse]
  ] = js.native
  def updateHook(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateHookResponse]
  ] = js.native
  def updateHook(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateHookParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateHookResponse]
  ] = js.native
  def updateInformationAboutPagesSite(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateInformationAboutPagesSiteResponse]
  ] = js.native
  def updateInformationAboutPagesSite(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateInformationAboutPagesSiteParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateInformationAboutPagesSiteResponse]
  ] = js.native
  def updateInvitation(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateInvitationResponse]
  ] = js.native
  def updateInvitation(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateInvitationParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateInvitationResponse]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  def updateProtectedBranchPullRequestReviewEnforcement(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse
    ]
  ] = js.native
  def updateProtectedBranchPullRequestReviewEnforcement(
    params: atOctokitRestLib.atOctokitRestMod.ReposUpdateProtectedBranchPullRequestReviewEnforcementParams
  ): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse
    ]
  ] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's billing plans](https://help.github.com/articles/github-s-billing-plans) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def updateProtectedBranchRequiredStatusChecks(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposUpdateProtectedBranchRequiredStatusChecksResponse
    ]
  ] = js.native
  def updateProtectedBranchRequiredStatusChecks(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateProtectedBranchRequiredStatusChecksParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.ReposUpdateProtectedBranchRequiredStatusChecksResponse
    ]
  ] = js.native
  /**
    * Users with push access to the repository can edit a release.
    */
  def updateRelease(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateReleaseResponse]
  ] = js.native
  def updateRelease(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateReleaseParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateReleaseResponse]
  ] = js.native
  /**
    * Users with push access to the repository can edit a release asset.
    */
  def updateReleaseAsset(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateReleaseAssetResponse]
  ] = js.native
  def updateReleaseAsset(params: atOctokitRestLib.atOctokitRestMod.ReposUpdateReleaseAssetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ReposUpdateReleaseAssetResponse]
  ] = js.native
  /**
    * This endpoint makes use of [a Hypermedia relation](https://developer.github.com/v3/#hypermedia) to determine which URL to access. This endpoint is provided by a URI template in [the release's API response](#get-a-single-release). You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.
    *
    * The asset data is expected in its raw binary form, rather than JSON. Everything else about the endpoint is the same as the rest of the API. For example, you'll still need to pass your authentication to be able to upload an asset.
    *
    * Send the raw binary content of the asset as the request body.
    *
    * This may leave an empty asset with a state of `"new"`. It can be safely deleted.
    */
  def uploadReleaseAsset(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def uploadReleaseAsset(params: atOctokitRestLib.atOctokitRestMod.ReposUploadReleaseAssetParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
}

