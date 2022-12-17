package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.advanced_security
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.container
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_at
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.day
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dependabot_alerts
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dependabot_security_updates
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dependency_graph
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.development
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.disable_all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.docker
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.enable_all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.internal
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.last_accessed_at
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maven
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.npm
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.nuget
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.requested
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rubygems
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.runtime
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret_scanning
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret_scanning_push_protection
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.size_in_bytes
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actionscachekey extends StObject {
  
  /** @description account_id parameter */
  var `account-id`: Double
  
  /** @description An explicit key or prefix for identifying the cache */
  var `actions-cache-key`: String
  
  /** @description A key for identifying the cache. */
  var `actions-cache-key-required`: String
  
  /** @description The property to sort the results by. `created_at` means when the cache was created. `last_accessed_at` means when the cache was last accessed. `size_in_bytes` is the size of the cache in bytes. */
  var `actions-cache-list-sort`: created_at | last_accessed_at | size_in_bytes
  
  /** @description Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. */
  var actor: String
  
  /** @description The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation. */
  var `alert-number`: Double
  
  /** @description If `true`, show notifications marked as read. */
  var all: Boolean
  
  var `app-slug`: String
  
  /** @description The unique identifier of the artifact. */
  var `artifact-id`: Double
  
  /** @description The unique identifier of the asset. */
  var `asset-id`: Double
  
  /** @description The attempt number of the workflow run. */
  var `attempt-number`: Double
  
  /** @description The unique identifier of the autolink. */
  var `autolink-id`: Double
  
  /** @description Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var before: String
  
  /** @description The name of the branch. */
  var branch: String
  
  /** @description The unique identifier of the branch policy. */
  var `branch-policy-id`: Double
  
  /** @description The unique identifier of the GitHub Actions cache. */
  var `cache-id`: Double
  
  /** @description The unique identifier of the card. */
  var `card-id`: Double
  
  /** @description Returns check runs with the specified `name`. */
  var `check-name`: String
  
  /** @description The unique identifier of the check run. */
  var `check-run-id`: Double
  
  /** @description The unique identifier of the check suite. */
  var `check-suite-id`: Double
  
  /** @description The client ID of the GitHub app. */
  var `client-id`: String
  
  /** @description The name of the codespace. */
  var `codespace-name`: String
  
  /** @description The unique identifier of the column. */
  var `column-id`: Double
  
  /** @description The unique identifier of the comment. */
  var `comment-id`: Double
  
  /** @description The number that identifies the comment. */
  var `comment-number`: Double
  
  /** @description The SHA of the commit. */
  var `commit-sha`: String
  
  /** @description Returns workflow runs created within the given date-time range. For more information on the syntax, see "[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates)." */
  var created: String
  
  /** @description Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors. */
  var cursor: String
  
  var `delivery-id`: Double
  
  /**
    * @description A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.
    *
    * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `rubygems`, `rust`
    */
  var `dependabot-alert-ecosystem`: String
  
  /** @description A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned. */
  var `dependabot-alert-manifest`: String
  
  /** @description The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in `number` fields in the response from the `GET /repos/{owner}/{repo}/dependabot/alerts` operation. */
  var `dependabot-alert-number`: Double
  
  /** @description A comma-separated list of package names. If specified, only alerts for these packages will be returned. */
  var `dependabot-alert-package`: String
  
  /** @description Scope of the dependency on a Dependabot alert. */
  var `dependabot-alert-scope`: development | runtime | Null
  
  /**
    * @description A comma-separated list of severities. If specified, only alerts with these severities will be returned.
    *
    * Can be: `low`, `medium`, `high`, `critical`
    */
  var `dependabot-alert-severity`: String
  
  /**
    * @description The property by which to sort the results.
    * `created` means when the alert was created.
    * `updated` means when the alert's state last changed.
    */
  var `dependabot-alert-sort`: created_ | updated
  
  /**
    * @description A comma-separated list of states. If specified, only alerts with these states will be returned.
    *
    * Can be: `dismissed`, `fixed`, `open`
    */
  var `dependabot-alert-state`: String
  
  /** @description deployment_id parameter */
  var `deployment-id`: Double
  
  /** @description The direction to sort the results by. */
  var direction: asc | desc
  
  /** @description The number that identifies the discussion. */
  var `discussion-number`: Double
  
  /** @description The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** @description The slug version of the enterprise name or the login of an organization. */
  var `enterprise-or-org`: String
  
  /** @description The name of the environment. */
  var `environment-name`: String
  
  /** @description Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/en/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)." */
  var event: String
  
  /** @description If `true` pull requests are omitted from the response (empty array). */
  var `exclude-pull-requests`: Boolean
  
  /** @description The ID of the export operation, or `latest`. Currently only `latest` is currently supported. */
  var `export-id`: String
  
  /** @description The unique identifier of the gist. */
  var `gist-id`: String
  
  /** @description The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. */
  var `git-ref`: String
  
  /** @description The unique identifier of the GPG key. */
  var `gpg-key-id`: Double
  
  /** @description The unique identifier of the hook. */
  var `hook-id`: Double
  
  /** @description The unique identifier of the installation. */
  var `installation-id`: Double
  
  /** @description The unique identifier of the invitation. */
  var `invitation-id`: Double
  
  /** @description The number that identifies the issue. */
  var `issue-number`: Double
  
  /** @description The unique identifier of the job. */
  var `job-id`: Double
  
  /** @description The unique identifier of the key. */
  var `key-id`: Double
  
  /** @description A list of comma separated label names. Example: `bug,ui,@high` */
  var labels: String
  
  /** @description The full path, relative to the repository root, of the dependency manifest file. */
  var `manifest-path`: String
  
  /** @description The unique identifier of the migration. */
  var `migration-id`: Double
  
  /** @description The number that identifies the milestone. */
  var `milestone-number`: Double
  
  /** @description Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`. */
  var order: desc | asc
  
  /** @description The unique identifier of the organization. */
  var `org-id`: Double
  
  /**
    * @description The action to take.
    *
    * `enable_all` means to enable the specified security feature for all repositories in the organization.
    * `disable_all` means to disable the specified security feature for all repositories in the organization.
    */
  var `org-security-product-enablement`: enable_all | disable_all
  
  /** @description The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** @description The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** @description The name of the package. */
  var `package-name`: String
  
  /** @description The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. */
  var `package-type`: npm | maven | rubygems | docker | nuget | container
  
  /** @description Unique identifier of the package version. */
  var `package-version-id`: Double
  
  /** @description The selected visibility of the packages. Only `container` package_types currently support `internal` visibility properly. For other ecosystems `internal` is synonymous with `private`. This parameter is optional and only filters an existing result set. */
  var `package-visibility`: public | `private` | internal
  
  /** @description Page number of the results to fetch. */
  var page: Double
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. */
  var `pagination-after`: String
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. */
  var `pagination-before`: String
  
  /** @description If `true`, only shows notifications in which the user is directly participating or mentioned. */
  var participating: Boolean
  
  /** @description The time frame to display results for. */
  var per: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week
  
  /** @description The number of results per page (max 100). */
  var `per-page`: Double
  
  /** @description The unique identifier of the plan. */
  var `plan-id`: Double
  
  /** @description The unique identifier of the project. */
  var `project-id`: Double
  
  /** @description The number that identifies the pull request. */
  var `pull-number`: Double
  
  /** @description The unique identifier of the reaction. */
  var `reaction-id`: Double
  
  /** @description The unique identifier of the release. */
  var `release-id`: Double
  
  /** @description The name of the repository. The name is not case sensitive. */
  var repo: String
  
  /** @description repo_name parameter */
  var `repo-name`: String
  
  /** @description The unique identifier of the repository. */
  var `repository-id`: Double
  
  /** @description ID of the Repository to filter on */
  var `repository-id-in-query`: Double
  
  /** @description The unique identifier of the review. */
  var `review-id`: Double
  
  /** @description The unique identifier of the role. */
  var `role-id`: Double
  
  /** @description The unique identifier of the workflow run. */
  var `run-id`: Double
  
  /** @description Unique identifier of the self-hosted runner group. */
  var `runner-group-id`: Double
  
  /** @description Unique identifier of the self-hosted runner. */
  var `runner-id`: Double
  
  /** @description The name of a self-hosted runner's custom label. */
  var `runner-label-name`: String
  
  /** @description The name of the secret. */
  var `secret-name`: String
  
  /** @description A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. */
  var `secret-scanning-alert-resolution`: String
  
  /**
    * @description A comma-separated list of secret types to return. By default all secret types are returned.
    * See "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)"
    * for a complete list of secret types.
    */
  var `secret-scanning-alert-secret-type`: String
  
  /** @description The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved. */
  var `secret-scanning-alert-sort`: created_ | updated
  
  /** @description Set to `open` or `resolved` to only list secret scanning alerts in a specific state. */
  var `secret-scanning-alert-state`: open | resolved
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty "after" query string. */
  var `secret-scanning-pagination-after-org-repo`: String
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty "before" query string. */
  var `secret-scanning-pagination-before-org-repo`: String
  
  /** @description The security feature to enable or disable. */
  var `security-product`: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | secret_scanning | secret_scanning_push_protection
  
  /** @description Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var since: String
  
  /** @description An organization ID. Only return organizations with an ID greater than this ID. */
  var `since-org`: Double
  
  /** @description A repository ID. Only return repositories with an ID greater than this ID. */
  var `since-repo`: Double
  
  /** @description A user ID. Only return users with an ID greater than this ID. */
  var `since-user`: Double
  
  /** @description The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. */
  var sort: created_ | updated
  
  /** @description The unique identifier of the SSH signing key. */
  var `ssh-signing-key-id`: Double
  
  /** @description Returns check runs with the specified `status`. */
  var status: queued_ | in_progress | completed
  
  /** @description The unique identifier of the tag protection. */
  var `tag-protection-id`: Double
  
  /** @description The unique identifier of the team. */
  var `team-id`: Double
  
  /** @description The slug of the team name. */
  var `team-slug`: String
  
  /** @description The unique identifier of the pull request thread. */
  var `thread-id`: Double
  
  /** @description The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. */
  var `tool-guid`: String | Null
  
  /** @description The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. */
  var `tool-name`: String
  
  /** @description The handle for the GitHub user account. */
  var username: String
  
  /** @description Only return runner groups that are allowed to be used by this organization. */
  var `visible-to-organization`: String
  
  /** @description Only return runner groups that are allowed to be used by this repository. */
  var `visible-to-repository`: String
  
  /** @description The ID of the workflow. You can also pass the workflow file name as a string. */
  var `workflow-id`: Double | String
  
  /** @description Returns workflow runs associated with a branch. Use the name of the branch of the `push`. */
  var `workflow-run-branch`: String
  
  /** @description Returns workflow runs with the `check_suite_id` that you specify. */
  var `workflow-run-check-suite-id`: Double
  
  /** @description Only returns workflow runs that are associated with the specified `head_sha`. */
  var `workflow-run-head-sha`: String
  
  /** @description Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. */
  var `workflow-run-status`: completed | action_required | cancelled | failure | neutral | skipped | stale | success | timed_out | in_progress | queued_ | requested | waiting
}
object Actionscachekey {
  
  inline def apply(
    `account-id`: Double,
    `actions-cache-key`: String,
    `actions-cache-key-required`: String,
    `actions-cache-list-sort`: created_at | last_accessed_at | size_in_bytes,
    actor: String,
    `alert-number`: Double,
    all: Boolean,
    `app-slug`: String,
    `artifact-id`: Double,
    `asset-id`: Double,
    `attempt-number`: Double,
    `autolink-id`: Double,
    before: String,
    branch: String,
    `branch-policy-id`: Double,
    `cache-id`: Double,
    `card-id`: Double,
    `check-name`: String,
    `check-run-id`: Double,
    `check-suite-id`: Double,
    `client-id`: String,
    `codespace-name`: String,
    `column-id`: Double,
    `comment-id`: Double,
    `comment-number`: Double,
    `commit-sha`: String,
    created: String,
    cursor: String,
    `delivery-id`: Double,
    `dependabot-alert-ecosystem`: String,
    `dependabot-alert-manifest`: String,
    `dependabot-alert-number`: Double,
    `dependabot-alert-package`: String,
    `dependabot-alert-severity`: String,
    `dependabot-alert-sort`: created_ | updated,
    `dependabot-alert-state`: String,
    `deployment-id`: Double,
    direction: asc | desc,
    `discussion-number`: Double,
    enterprise: String,
    `enterprise-or-org`: String,
    `environment-name`: String,
    event: String,
    `exclude-pull-requests`: Boolean,
    `export-id`: String,
    `gist-id`: String,
    `git-ref`: String,
    `gpg-key-id`: Double,
    `hook-id`: Double,
    `installation-id`: Double,
    `invitation-id`: Double,
    `issue-number`: Double,
    `job-id`: Double,
    `key-id`: Double,
    labels: String,
    `manifest-path`: String,
    `migration-id`: Double,
    `milestone-number`: Double,
    order: desc | asc,
    `org-id`: Double,
    `org-security-product-enablement`: enable_all | disable_all,
    org_ : String,
    owner: String,
    `package-name`: String,
    `package-type`: npm | maven | rubygems | docker | nuget | container,
    `package-version-id`: Double,
    `package-visibility`: public | `private` | internal,
    page: Double,
    `pagination-after`: String,
    `pagination-before`: String,
    participating: Boolean,
    per: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week,
    `per-page`: Double,
    `plan-id`: Double,
    `project-id`: Double,
    `pull-number`: Double,
    `reaction-id`: Double,
    `release-id`: Double,
    repo: String,
    `repo-name`: String,
    `repository-id`: Double,
    `repository-id-in-query`: Double,
    `review-id`: Double,
    `role-id`: Double,
    `run-id`: Double,
    `runner-group-id`: Double,
    `runner-id`: Double,
    `runner-label-name`: String,
    `secret-name`: String,
    `secret-scanning-alert-resolution`: String,
    `secret-scanning-alert-secret-type`: String,
    `secret-scanning-alert-sort`: created_ | updated,
    `secret-scanning-alert-state`: open | resolved,
    `secret-scanning-pagination-after-org-repo`: String,
    `secret-scanning-pagination-before-org-repo`: String,
    `security-product`: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | secret_scanning | secret_scanning_push_protection,
    since: String,
    `since-org`: Double,
    `since-repo`: Double,
    `since-user`: Double,
    sort: created_ | updated,
    `ssh-signing-key-id`: Double,
    status: queued_ | in_progress | completed,
    `tag-protection-id`: Double,
    `team-id`: Double,
    `team-slug`: String,
    `thread-id`: Double,
    `tool-name`: String,
    username: String,
    `visible-to-organization`: String,
    `visible-to-repository`: String,
    `workflow-id`: Double | String,
    `workflow-run-branch`: String,
    `workflow-run-check-suite-id`: Double,
    `workflow-run-head-sha`: String,
    `workflow-run-status`: completed | action_required | cancelled | failure | neutral | skipped | stale | success | timed_out | in_progress | queued_ | requested | waiting
  ): Actionscachekey = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], participating = participating.asInstanceOf[js.Any], per = per.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("account-id")(`account-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-cache-key")(`actions-cache-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-cache-key-required")(`actions-cache-key-required`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-cache-list-sort")(`actions-cache-list-sort`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-number")(`alert-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("app-slug")(`app-slug`.asInstanceOf[js.Any])
    __obj.updateDynamic("artifact-id")(`artifact-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("asset-id")(`asset-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("attempt-number")(`attempt-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("autolink-id")(`autolink-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("branch-policy-id")(`branch-policy-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("cache-id")(`cache-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("card-id")(`card-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-name")(`check-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-run-id")(`check-run-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-suite-id")(`check-suite-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("client-id")(`client-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespace-name")(`codespace-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("column-id")(`column-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("comment-id")(`comment-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("comment-number")(`comment-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("commit-sha")(`commit-sha`.asInstanceOf[js.Any])
    __obj.updateDynamic("delivery-id")(`delivery-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-ecosystem")(`dependabot-alert-ecosystem`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-manifest")(`dependabot-alert-manifest`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-number")(`dependabot-alert-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-package")(`dependabot-alert-package`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-severity")(`dependabot-alert-severity`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-sort")(`dependabot-alert-sort`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-state")(`dependabot-alert-state`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-id")(`deployment-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("discussion-number")(`discussion-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("enterprise-or-org")(`enterprise-or-org`.asInstanceOf[js.Any])
    __obj.updateDynamic("environment-name")(`environment-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("exclude-pull-requests")(`exclude-pull-requests`.asInstanceOf[js.Any])
    __obj.updateDynamic("export-id")(`export-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("gist-id")(`gist-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("git-ref")(`git-ref`.asInstanceOf[js.Any])
    __obj.updateDynamic("gpg-key-id")(`gpg-key-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("hook-id")(`hook-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("installation-id")(`installation-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("invitation-id")(`invitation-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-number")(`issue-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-id")(`job-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("key-id")(`key-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("manifest-path")(`manifest-path`.asInstanceOf[js.Any])
    __obj.updateDynamic("migration-id")(`migration-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("milestone-number")(`milestone-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("org-id")(`org-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("org-security-product-enablement")(`org-security-product-enablement`.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.updateDynamic("package-name")(`package-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("package-type")(`package-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("package-version-id")(`package-version-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("package-visibility")(`package-visibility`.asInstanceOf[js.Any])
    __obj.updateDynamic("pagination-after")(`pagination-after`.asInstanceOf[js.Any])
    __obj.updateDynamic("pagination-before")(`pagination-before`.asInstanceOf[js.Any])
    __obj.updateDynamic("per-page")(`per-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("plan-id")(`plan-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-id")(`project-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-number")(`pull-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("reaction-id")(`reaction-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("release-id")(`release-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("repo-name")(`repo-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("repository-id")(`repository-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("repository-id-in-query")(`repository-id-in-query`.asInstanceOf[js.Any])
    __obj.updateDynamic("review-id")(`review-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("role-id")(`role-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("run-id")(`run-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("runner-group-id")(`runner-group-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("runner-id")(`runner-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("runner-label-name")(`runner-label-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-name")(`secret-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-scanning-alert-resolution")(`secret-scanning-alert-resolution`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-scanning-alert-secret-type")(`secret-scanning-alert-secret-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-scanning-alert-sort")(`secret-scanning-alert-sort`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-scanning-alert-state")(`secret-scanning-alert-state`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-scanning-pagination-after-org-repo")(`secret-scanning-pagination-after-org-repo`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-scanning-pagination-before-org-repo")(`secret-scanning-pagination-before-org-repo`.asInstanceOf[js.Any])
    __obj.updateDynamic("security-product")(`security-product`.asInstanceOf[js.Any])
    __obj.updateDynamic("since-org")(`since-org`.asInstanceOf[js.Any])
    __obj.updateDynamic("since-repo")(`since-repo`.asInstanceOf[js.Any])
    __obj.updateDynamic("since-user")(`since-user`.asInstanceOf[js.Any])
    __obj.updateDynamic("ssh-signing-key-id")(`ssh-signing-key-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("tag-protection-id")(`tag-protection-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("team-id")(`team-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("team-slug")(`team-slug`.asInstanceOf[js.Any])
    __obj.updateDynamic("thread-id")(`thread-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("tool-name")(`tool-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("visible-to-organization")(`visible-to-organization`.asInstanceOf[js.Any])
    __obj.updateDynamic("visible-to-repository")(`visible-to-repository`.asInstanceOf[js.Any])
    __obj.updateDynamic("workflow-id")(`workflow-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("workflow-run-branch")(`workflow-run-branch`.asInstanceOf[js.Any])
    __obj.updateDynamic("workflow-run-check-suite-id")(`workflow-run-check-suite-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("workflow-run-head-sha")(`workflow-run-head-sha`.asInstanceOf[js.Any])
    __obj.updateDynamic("workflow-run-status")(`workflow-run-status`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-scope")(null)
    __obj.updateDynamic("tool-guid")(null)
    __obj.asInstanceOf[Actionscachekey]
  }
  
  extension [Self <: Actionscachekey](x: Self) {
    
    inline def `setAccount-id`(value: Double): Self = StObject.set(x, "account-id", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-key`(value: String): Self = StObject.set(x, "actions-cache-key", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-key-required`(value: String): Self = StObject.set(x, "actions-cache-key-required", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-list-sort`(value: created_at | last_accessed_at | size_in_bytes): Self = StObject.set(x, "actions-cache-list-sort", value.asInstanceOf[js.Any])
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def `setAlert-number`(value: Double): Self = StObject.set(x, "alert-number", value.asInstanceOf[js.Any])
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def `setApp-slug`(value: String): Self = StObject.set(x, "app-slug", value.asInstanceOf[js.Any])
    
    inline def `setArtifact-id`(value: Double): Self = StObject.set(x, "artifact-id", value.asInstanceOf[js.Any])
    
    inline def `setAsset-id`(value: Double): Self = StObject.set(x, "asset-id", value.asInstanceOf[js.Any])
    
    inline def `setAttempt-number`(value: Double): Self = StObject.set(x, "attempt-number", value.asInstanceOf[js.Any])
    
    inline def `setAutolink-id`(value: Double): Self = StObject.set(x, "autolink-id", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def `setBranch-policy-id`(value: Double): Self = StObject.set(x, "branch-policy-id", value.asInstanceOf[js.Any])
    
    inline def `setCache-id`(value: Double): Self = StObject.set(x, "cache-id", value.asInstanceOf[js.Any])
    
    inline def `setCard-id`(value: Double): Self = StObject.set(x, "card-id", value.asInstanceOf[js.Any])
    
    inline def `setCheck-name`(value: String): Self = StObject.set(x, "check-name", value.asInstanceOf[js.Any])
    
    inline def `setCheck-run-id`(value: Double): Self = StObject.set(x, "check-run-id", value.asInstanceOf[js.Any])
    
    inline def `setCheck-suite-id`(value: Double): Self = StObject.set(x, "check-suite-id", value.asInstanceOf[js.Any])
    
    inline def `setClient-id`(value: String): Self = StObject.set(x, "client-id", value.asInstanceOf[js.Any])
    
    inline def `setCodespace-name`(value: String): Self = StObject.set(x, "codespace-name", value.asInstanceOf[js.Any])
    
    inline def `setColumn-id`(value: Double): Self = StObject.set(x, "column-id", value.asInstanceOf[js.Any])
    
    inline def `setComment-id`(value: Double): Self = StObject.set(x, "comment-id", value.asInstanceOf[js.Any])
    
    inline def `setComment-number`(value: Double): Self = StObject.set(x, "comment-number", value.asInstanceOf[js.Any])
    
    inline def `setCommit-sha`(value: String): Self = StObject.set(x, "commit-sha", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def `setDelivery-id`(value: Double): Self = StObject.set(x, "delivery-id", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-ecosystem`(value: String): Self = StObject.set(x, "dependabot-alert-ecosystem", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-manifest`(value: String): Self = StObject.set(x, "dependabot-alert-manifest", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-number`(value: Double): Self = StObject.set(x, "dependabot-alert-number", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-package`(value: String): Self = StObject.set(x, "dependabot-alert-package", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-scope`(value: development | runtime): Self = StObject.set(x, "dependabot-alert-scope", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-scopeNull`: Self = StObject.set(x, "dependabot-alert-scope", null)
    
    inline def `setDependabot-alert-severity`(value: String): Self = StObject.set(x, "dependabot-alert-severity", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-sort`(value: created_ | updated): Self = StObject.set(x, "dependabot-alert-sort", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-state`(value: String): Self = StObject.set(x, "dependabot-alert-state", value.asInstanceOf[js.Any])
    
    inline def `setDeployment-id`(value: Double): Self = StObject.set(x, "deployment-id", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def `setDiscussion-number`(value: Double): Self = StObject.set(x, "discussion-number", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def `setEnterprise-or-org`(value: String): Self = StObject.set(x, "enterprise-or-org", value.asInstanceOf[js.Any])
    
    inline def `setEnvironment-name`(value: String): Self = StObject.set(x, "environment-name", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def `setExclude-pull-requests`(value: Boolean): Self = StObject.set(x, "exclude-pull-requests", value.asInstanceOf[js.Any])
    
    inline def `setExport-id`(value: String): Self = StObject.set(x, "export-id", value.asInstanceOf[js.Any])
    
    inline def `setGist-id`(value: String): Self = StObject.set(x, "gist-id", value.asInstanceOf[js.Any])
    
    inline def `setGit-ref`(value: String): Self = StObject.set(x, "git-ref", value.asInstanceOf[js.Any])
    
    inline def `setGpg-key-id`(value: Double): Self = StObject.set(x, "gpg-key-id", value.asInstanceOf[js.Any])
    
    inline def `setHook-id`(value: Double): Self = StObject.set(x, "hook-id", value.asInstanceOf[js.Any])
    
    inline def `setInstallation-id`(value: Double): Self = StObject.set(x, "installation-id", value.asInstanceOf[js.Any])
    
    inline def `setInvitation-id`(value: Double): Self = StObject.set(x, "invitation-id", value.asInstanceOf[js.Any])
    
    inline def `setIssue-number`(value: Double): Self = StObject.set(x, "issue-number", value.asInstanceOf[js.Any])
    
    inline def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    inline def `setKey-id`(value: Double): Self = StObject.set(x, "key-id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def `setManifest-path`(value: String): Self = StObject.set(x, "manifest-path", value.asInstanceOf[js.Any])
    
    inline def `setMigration-id`(value: Double): Self = StObject.set(x, "migration-id", value.asInstanceOf[js.Any])
    
    inline def `setMilestone-number`(value: Double): Self = StObject.set(x, "milestone-number", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: desc | asc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def `setOrg-id`(value: Double): Self = StObject.set(x, "org-id", value.asInstanceOf[js.Any])
    
    inline def `setOrg-security-product-enablement`(value: enable_all | disable_all): Self = StObject.set(x, "org-security-product-enablement", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def `setPackage-name`(value: String): Self = StObject.set(x, "package-name", value.asInstanceOf[js.Any])
    
    inline def `setPackage-type`(value: npm | maven | rubygems | docker | nuget | container): Self = StObject.set(x, "package-type", value.asInstanceOf[js.Any])
    
    inline def `setPackage-version-id`(value: Double): Self = StObject.set(x, "package-version-id", value.asInstanceOf[js.Any])
    
    inline def `setPackage-visibility`(value: public | `private` | internal): Self = StObject.set(x, "package-visibility", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def `setPagination-after`(value: String): Self = StObject.set(x, "pagination-after", value.asInstanceOf[js.Any])
    
    inline def `setPagination-before`(value: String): Self = StObject.set(x, "pagination-before", value.asInstanceOf[js.Any])
    
    inline def setParticipating(value: Boolean): Self = StObject.set(x, "participating", value.asInstanceOf[js.Any])
    
    inline def setPer(value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def `setPer-page`(value: Double): Self = StObject.set(x, "per-page", value.asInstanceOf[js.Any])
    
    inline def `setPlan-id`(value: Double): Self = StObject.set(x, "plan-id", value.asInstanceOf[js.Any])
    
    inline def `setProject-id`(value: Double): Self = StObject.set(x, "project-id", value.asInstanceOf[js.Any])
    
    inline def `setPull-number`(value: Double): Self = StObject.set(x, "pull-number", value.asInstanceOf[js.Any])
    
    inline def `setReaction-id`(value: Double): Self = StObject.set(x, "reaction-id", value.asInstanceOf[js.Any])
    
    inline def `setRelease-id`(value: Double): Self = StObject.set(x, "release-id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def `setRepo-name`(value: String): Self = StObject.set(x, "repo-name", value.asInstanceOf[js.Any])
    
    inline def `setRepository-id`(value: Double): Self = StObject.set(x, "repository-id", value.asInstanceOf[js.Any])
    
    inline def `setRepository-id-in-query`(value: Double): Self = StObject.set(x, "repository-id-in-query", value.asInstanceOf[js.Any])
    
    inline def `setReview-id`(value: Double): Self = StObject.set(x, "review-id", value.asInstanceOf[js.Any])
    
    inline def `setRole-id`(value: Double): Self = StObject.set(x, "role-id", value.asInstanceOf[js.Any])
    
    inline def `setRun-id`(value: Double): Self = StObject.set(x, "run-id", value.asInstanceOf[js.Any])
    
    inline def `setRunner-group-id`(value: Double): Self = StObject.set(x, "runner-group-id", value.asInstanceOf[js.Any])
    
    inline def `setRunner-id`(value: Double): Self = StObject.set(x, "runner-id", value.asInstanceOf[js.Any])
    
    inline def `setRunner-label-name`(value: String): Self = StObject.set(x, "runner-label-name", value.asInstanceOf[js.Any])
    
    inline def `setSecret-name`(value: String): Self = StObject.set(x, "secret-name", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-resolution`(value: String): Self = StObject.set(x, "secret-scanning-alert-resolution", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-secret-type`(value: String): Self = StObject.set(x, "secret-scanning-alert-secret-type", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-sort`(value: created_ | updated): Self = StObject.set(x, "secret-scanning-alert-sort", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-state`(value: open | resolved): Self = StObject.set(x, "secret-scanning-alert-state", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-pagination-after-org-repo`(value: String): Self = StObject.set(x, "secret-scanning-pagination-after-org-repo", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-pagination-before-org-repo`(value: String): Self = StObject.set(x, "secret-scanning-pagination-before-org-repo", value.asInstanceOf[js.Any])
    
    inline def `setSecurity-product`(
      value: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | secret_scanning | secret_scanning_push_protection
    ): Self = StObject.set(x, "security-product", value.asInstanceOf[js.Any])
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def `setSince-org`(value: Double): Self = StObject.set(x, "since-org", value.asInstanceOf[js.Any])
    
    inline def `setSince-repo`(value: Double): Self = StObject.set(x, "since-repo", value.asInstanceOf[js.Any])
    
    inline def `setSince-user`(value: Double): Self = StObject.set(x, "since-user", value.asInstanceOf[js.Any])
    
    inline def setSort(value: created_ | updated): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def `setSsh-signing-key-id`(value: Double): Self = StObject.set(x, "ssh-signing-key-id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def `setTag-protection-id`(value: Double): Self = StObject.set(x, "tag-protection-id", value.asInstanceOf[js.Any])
    
    inline def `setTeam-id`(value: Double): Self = StObject.set(x, "team-id", value.asInstanceOf[js.Any])
    
    inline def `setTeam-slug`(value: String): Self = StObject.set(x, "team-slug", value.asInstanceOf[js.Any])
    
    inline def `setThread-id`(value: Double): Self = StObject.set(x, "thread-id", value.asInstanceOf[js.Any])
    
    inline def `setTool-guid`(value: String): Self = StObject.set(x, "tool-guid", value.asInstanceOf[js.Any])
    
    inline def `setTool-guidNull`: Self = StObject.set(x, "tool-guid", null)
    
    inline def `setTool-name`(value: String): Self = StObject.set(x, "tool-name", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def `setVisible-to-organization`(value: String): Self = StObject.set(x, "visible-to-organization", value.asInstanceOf[js.Any])
    
    inline def `setVisible-to-repository`(value: String): Self = StObject.set(x, "visible-to-repository", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-id`(value: Double | String): Self = StObject.set(x, "workflow-id", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-branch`(value: String): Self = StObject.set(x, "workflow-run-branch", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-check-suite-id`(value: Double): Self = StObject.set(x, "workflow-run-check-suite-id", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-head-sha`(value: String): Self = StObject.set(x, "workflow-run-head-sha", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-status`(
      value: completed | action_required | cancelled | failure | neutral | skipped | stale | success | timed_out | in_progress | queued_ | requested | waiting
    ): Self = StObject.set(x, "workflow-run-status", value.asInstanceOf[js.Any])
  }
}
