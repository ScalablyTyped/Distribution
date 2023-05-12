package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.advanced_security
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.code_scanning_default_setup
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
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
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

trait Actionscachegitreffull extends StObject {
  
  /** @description account_id parameter */
  var `account-id`: Double
  
  /** @description The full Git reference for narrowing down the cache. The `ref` for a branch should be formatted as `refs/heads/<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. */
  var `actions-cache-git-ref-full`: js.UndefOr[String] = js.undefined
  
  /** @description An explicit key or prefix for identifying the cache */
  var `actions-cache-key`: js.UndefOr[String] = js.undefined
  
  /** @description A key for identifying the cache. */
  var `actions-cache-key-required`: String
  
  /** @description The property to sort the results by. `created_at` means when the cache was created. `last_accessed_at` means when the cache was last accessed. `size_in_bytes` is the size of the cache in bytes. */
  var `actions-cache-list-sort`: js.UndefOr[created_at | last_accessed_at | size_in_bytes] = js.undefined
  
  /** @description Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. */
  var actor: js.UndefOr[String] = js.undefined
  
  /** @description The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation. */
  var `alert-number`: Double
  
  /** @description If `true`, show notifications marked as read. */
  var all: js.UndefOr[Boolean] = js.undefined
  
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
  var before: js.UndefOr[String] = js.undefined
  
  /** @description Only show repositories updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var `before-repo-date`: js.UndefOr[String] = js.undefined
  
  /** @description The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). */
  var branch: String
  
  /** @description The unique identifier of the branch policy. */
  var `branch-policy-id`: Double
  
  /** @description The unique identifier of the GitHub Actions cache. */
  var `cache-id`: Double
  
  /** @description The unique identifier of the card. */
  var `card-id`: Double
  
  /** @description Returns check runs with the specified `name`. */
  var `check-name`: js.UndefOr[String] = js.undefined
  
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
  var created: js.UndefOr[String] = js.undefined
  
  /** @description Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors. */
  var cursor: js.UndefOr[String] = js.undefined
  
  var `delivery-id`: Double
  
  /**
    * @description A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.
    *
    * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
    */
  var `dependabot-alert-comma-separated-ecosystems`: js.UndefOr[String] = js.undefined
  
  /** @description A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned. */
  var `dependabot-alert-comma-separated-manifests`: js.UndefOr[String] = js.undefined
  
  /** @description A comma-separated list of package names. If specified, only alerts for these packages will be returned. */
  var `dependabot-alert-comma-separated-packages`: js.UndefOr[String] = js.undefined
  
  /**
    * @description A comma-separated list of severities. If specified, only alerts with these severities will be returned.
    *
    * Can be: `low`, `medium`, `high`, `critical`
    */
  var `dependabot-alert-comma-separated-severities`: js.UndefOr[String] = js.undefined
  
  /**
    * @description A comma-separated list of states. If specified, only alerts with these states will be returned.
    *
    * Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
    */
  var `dependabot-alert-comma-separated-states`: js.UndefOr[String] = js.undefined
  
  /**
    * @description The number that identifies a Dependabot alert in its repository.
    * You can find this at the end of the URL for a Dependabot alert within GitHub,
    * or in `number` fields in the response from the
    * `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
    */
  var `dependabot-alert-number`: Double
  
  /** @description The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. */
  var `dependabot-alert-scope`: js.UndefOr[development | runtime] = js.undefined
  
  /**
    * @description The property by which to sort the results.
    * `created` means when the alert was created.
    * `updated` means when the alert's state last changed.
    */
  var `dependabot-alert-sort`: js.UndefOr[created_ | updated] = js.undefined
  
  /** @description deployment_id parameter */
  var `deployment-id`: Double
  
  /** @description The direction to sort the results by. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /** @description The number that identifies the discussion. */
  var `discussion-number`: Double
  
  /** @description The slug version of the enterprise name. You can also substitute this value with the enterprise id. */
  var enterprise: String
  
  /** @description The name of the environment. */
  var `environment-name`: String
  
  /** @description Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)." */
  var event: js.UndefOr[String] = js.undefined
  
  /** @description If `true` pull requests are omitted from the response (empty array). */
  var `exclude-pull-requests`: js.UndefOr[Boolean] = js.undefined
  
  /** @description The ID of the export operation, or `latest`. Currently only `latest` is currently supported. */
  var `export-id`: String
  
  /** @description The unique identifier of the fine-grained personal access token. */
  var `fine-grained-personal-access-token-id`: Double
  
  /** @description The GHSA (GitHub Security Advisory) identifier of the advisory. */
  var ghsa_id: String
  
  /** @description The unique identifier of the gist. */
  var `gist-id`: String
  
  /** @description The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. */
  var `git-ref`: js.UndefOr[String] = js.undefined
  
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
  var labels: js.UndefOr[String] = js.undefined
  
  /** @description The full path, relative to the repository root, of the dependency manifest file. */
  var `manifest-path`: js.UndefOr[String] = js.undefined
  
  /** @description The unique identifier of the migration. */
  var `migration-id`: Double
  
  /** @description The number that identifies the milestone. */
  var `milestone-number`: Double
  
  /** @description Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`. */
  var order: js.UndefOr[desc | asc] = js.undefined
  
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
  
  /**
    * @description The selected visibility of the packages.  This parameter is optional and only filters an existing result set.
    *
    * The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`.
    * For the list of GitHub Packages registries that support granular permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  var `package-visibility`: js.UndefOr[public | `private` | internal] = js.undefined
  
  /** @description Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. */
  var `pagination-after`: js.UndefOr[String] = js.undefined
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. */
  var `pagination-before`: js.UndefOr[String] = js.undefined
  
  /**
    * @description **Deprecated**. The number of results per page (max 100), starting from the first matching result.
    * This parameter must not be used in combination with `last`.
    * Instead, use `per_page` in combination with `after` to fetch the first page of results.
    */
  var `pagination-first`: js.UndefOr[Double] = js.undefined
  
  /**
    * @description **Deprecated**. The number of results per page (max 100), starting from the last matching result.
    * This parameter must not be used in combination with `first`.
    * Instead, use `per_page` in combination with `before` to fetch the last page of results.
    */
  var `pagination-last`: js.UndefOr[Double] = js.undefined
  
  /** @description If `true`, only shows notifications in which the user is directly participating or mentioned. */
  var participating: js.UndefOr[Boolean] = js.undefined
  
  /** @description The time frame to display results for. */
  var per: js.UndefOr[day | week] = js.undefined
  
  /** @description The number of results per page (max 100). */
  var `per-page`: js.UndefOr[Double] = js.undefined
  
  /** @description Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var `personal-access-token-after`: js.UndefOr[String] = js.undefined
  
  /** @description Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var `personal-access-token-before`: js.UndefOr[String] = js.undefined
  
  /** @description A list of owner usernames to use to filter the results. */
  var `personal-access-token-owner`: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description The permission to use to filter the results. */
  var `personal-access-token-permission`: js.UndefOr[String] = js.undefined
  
  /** @description The name of the repository to use to filter the results. */
  var `personal-access-token-repository`: js.UndefOr[String] = js.undefined
  
  /** @description The property by which to sort the results. */
  var `personal-access-token-sort`: js.UndefOr[created_at] = js.undefined
  
  /** @description The unique identifier of the plan. */
  var `plan-id`: Double
  
  /** @description The unique identifier of the project. */
  var `project-id`: Double
  
  /** @description The unique identifier of the protection rule. */
  var `protection-rule-id`: Double
  
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
  
  /** @description The ID of the required workflow that has run at least once in a repository. */
  var `repo-required-workflow-id`: Double
  
  /** @description The unique identifier of the repository. */
  var `repository-id`: Double
  
  /** @description ID of the Repository to filter on */
  var `repository-id-in-query`: js.UndefOr[Double] = js.undefined
  
  /** @description The unique identifier of the required workflow. */
  var `required-workflow-id`: Double
  
  /** @description The unique identifier of the review. */
  var `review-id`: Double
  
  /** @description The unique identifier of the workflow run. */
  var `run-id`: Double
  
  /** @description Unique identifier of the self-hosted runner. */
  var `runner-id`: Double
  
  /** @description The name of a self-hosted runner's custom label. */
  var `runner-label-name`: String
  
  /** @description The name of the secret. */
  var `secret-name`: String
  
  /** @description A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. */
  var `secret-scanning-alert-resolution`: js.UndefOr[String] = js.undefined
  
  /**
    * @description A comma-separated list of secret types to return. By default all secret types are returned.
    * See "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)"
    * for a complete list of secret types.
    */
  var `secret-scanning-alert-secret-type`: js.UndefOr[String] = js.undefined
  
  /** @description The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved. */
  var `secret-scanning-alert-sort`: js.UndefOr[created_ | updated] = js.undefined
  
  /** @description Set to `open` or `resolved` to only list secret scanning alerts in a specific state. */
  var `secret-scanning-alert-state`: js.UndefOr[open | resolved] = js.undefined
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty "after" query string. */
  var `secret-scanning-pagination-after-org-repo`: js.UndefOr[String] = js.undefined
  
  /** @description A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty "before" query string. */
  var `secret-scanning-pagination-before-org-repo`: js.UndefOr[String] = js.undefined
  
  /** @description The security feature to enable or disable. */
  var `security-product`: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | code_scanning_default_setup | secret_scanning | secret_scanning_push_protection
  
  /** @description Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var since: js.UndefOr[String] = js.undefined
  
  /** @description An organization ID. Only return organizations with an ID greater than this ID. */
  var `since-org`: js.UndefOr[Double] = js.undefined
  
  /** @description A repository ID. Only return repositories with an ID greater than this ID. */
  var `since-repo`: js.UndefOr[Double] = js.undefined
  
  /** @description Only show repositories updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
  var `since-repo-date`: js.UndefOr[String] = js.undefined
  
  /** @description A user ID. Only return users with an ID greater than this ID. */
  var `since-user`: js.UndefOr[Double] = js.undefined
  
  /** @description The property to sort the results by. */
  var sort: js.UndefOr[created_ | updated] = js.undefined
  
  /** @description The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. */
  var `sort-starred`: js.UndefOr[created_ | updated] = js.undefined
  
  /** @description The unique identifier of the SSH signing key. */
  var `ssh-signing-key-id`: Double
  
  /** @description Returns check runs with the specified `status`. */
  var status: js.UndefOr[queued_ | in_progress | completed] = js.undefined
  
  /** @description The unique identifier of the tag protection. */
  var `tag-protection-id`: Double
  
  /** @description The unique identifier of the team. */
  var `team-id`: Double
  
  /** @description The slug of the team name. */
  var `team-slug`: String
  
  /** @description The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user)). */
  var `thread-id`: Double
  
  /** @description The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. */
  var `tool-guid`: js.UndefOr[String | Null] = js.undefined
  
  /** @description The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. */
  var `tool-name`: js.UndefOr[String] = js.undefined
  
  /** @description The handle for the GitHub user account. */
  var username: String
  
  /** @description The name of the variable. */
  var `variable-name`: String
  
  /** @description The number of results per page (max 30). */
  var `variables-per-page`: js.UndefOr[Double] = js.undefined
  
  /** @description The ID of the workflow. You can also pass the workflow file name as a string. */
  var `workflow-id`: Double | String
  
  /** @description Returns workflow runs associated with a branch. Use the name of the branch of the `push`. */
  var `workflow-run-branch`: js.UndefOr[String] = js.undefined
  
  /** @description Returns workflow runs with the `check_suite_id` that you specify. */
  var `workflow-run-check-suite-id`: js.UndefOr[Double] = js.undefined
  
  /** @description Only returns workflow runs that are associated with the specified `head_sha`. */
  var `workflow-run-head-sha`: js.UndefOr[String] = js.undefined
  
  /** @description Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. */
  var `workflow-run-status`: js.UndefOr[
    completed | action_required | cancelled | failure | neutral | skipped | stale | success | timed_out | in_progress | queued_ | requested | waiting | pending
  ] = js.undefined
}
object Actionscachegitreffull {
  
  inline def apply(
    `account-id`: Double,
    `actions-cache-key-required`: String,
    `alert-number`: Double,
    `app-slug`: String,
    `artifact-id`: Double,
    `asset-id`: Double,
    `attempt-number`: Double,
    `autolink-id`: Double,
    branch: String,
    `branch-policy-id`: Double,
    `cache-id`: Double,
    `card-id`: Double,
    `check-run-id`: Double,
    `check-suite-id`: Double,
    `client-id`: String,
    `codespace-name`: String,
    `column-id`: Double,
    `comment-id`: Double,
    `comment-number`: Double,
    `commit-sha`: String,
    `delivery-id`: Double,
    `dependabot-alert-number`: Double,
    `deployment-id`: Double,
    `discussion-number`: Double,
    enterprise: String,
    `environment-name`: String,
    `export-id`: String,
    `fine-grained-personal-access-token-id`: Double,
    ghsa_id: String,
    `gist-id`: String,
    `gpg-key-id`: Double,
    `hook-id`: Double,
    `installation-id`: Double,
    `invitation-id`: Double,
    `issue-number`: Double,
    `job-id`: Double,
    `key-id`: Double,
    `migration-id`: Double,
    `milestone-number`: Double,
    `org-security-product-enablement`: enable_all | disable_all,
    org_ : String,
    owner: String,
    `package-name`: String,
    `package-type`: npm | maven | rubygems | docker | nuget | container,
    `package-version-id`: Double,
    `plan-id`: Double,
    `project-id`: Double,
    `protection-rule-id`: Double,
    `pull-number`: Double,
    `reaction-id`: Double,
    `release-id`: Double,
    repo: String,
    `repo-name`: String,
    `repo-required-workflow-id`: Double,
    `repository-id`: Double,
    `required-workflow-id`: Double,
    `review-id`: Double,
    `run-id`: Double,
    `runner-id`: Double,
    `runner-label-name`: String,
    `secret-name`: String,
    `security-product`: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | code_scanning_default_setup | secret_scanning | secret_scanning_push_protection,
    `ssh-signing-key-id`: Double,
    `tag-protection-id`: Double,
    `team-id`: Double,
    `team-slug`: String,
    `thread-id`: Double,
    username: String,
    `variable-name`: String,
    `workflow-id`: Double | String
  ): Actionscachegitreffull = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], ghsa_id = ghsa_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("account-id")(`account-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions-cache-key-required")(`actions-cache-key-required`.asInstanceOf[js.Any])
    __obj.updateDynamic("alert-number")(`alert-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("app-slug")(`app-slug`.asInstanceOf[js.Any])
    __obj.updateDynamic("artifact-id")(`artifact-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("asset-id")(`asset-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("attempt-number")(`attempt-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("autolink-id")(`autolink-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("branch-policy-id")(`branch-policy-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("cache-id")(`cache-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("card-id")(`card-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-run-id")(`check-run-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("check-suite-id")(`check-suite-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("client-id")(`client-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("codespace-name")(`codespace-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("column-id")(`column-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("comment-id")(`comment-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("comment-number")(`comment-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("commit-sha")(`commit-sha`.asInstanceOf[js.Any])
    __obj.updateDynamic("delivery-id")(`delivery-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("dependabot-alert-number")(`dependabot-alert-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("deployment-id")(`deployment-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("discussion-number")(`discussion-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("environment-name")(`environment-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("export-id")(`export-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("fine-grained-personal-access-token-id")(`fine-grained-personal-access-token-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("gist-id")(`gist-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("gpg-key-id")(`gpg-key-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("hook-id")(`hook-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("installation-id")(`installation-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("invitation-id")(`invitation-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("issue-number")(`issue-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-id")(`job-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("key-id")(`key-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("migration-id")(`migration-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("milestone-number")(`milestone-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("org-security-product-enablement")(`org-security-product-enablement`.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.updateDynamic("package-name")(`package-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("package-type")(`package-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("package-version-id")(`package-version-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("plan-id")(`plan-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-id")(`project-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("protection-rule-id")(`protection-rule-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("pull-number")(`pull-number`.asInstanceOf[js.Any])
    __obj.updateDynamic("reaction-id")(`reaction-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("release-id")(`release-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("repo-name")(`repo-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("repo-required-workflow-id")(`repo-required-workflow-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("repository-id")(`repository-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("required-workflow-id")(`required-workflow-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("review-id")(`review-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("run-id")(`run-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("runner-id")(`runner-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("runner-label-name")(`runner-label-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("secret-name")(`secret-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("security-product")(`security-product`.asInstanceOf[js.Any])
    __obj.updateDynamic("ssh-signing-key-id")(`ssh-signing-key-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("tag-protection-id")(`tag-protection-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("team-id")(`team-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("team-slug")(`team-slug`.asInstanceOf[js.Any])
    __obj.updateDynamic("thread-id")(`thread-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("variable-name")(`variable-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("workflow-id")(`workflow-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionscachegitreffull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actionscachegitreffull] (val x: Self) extends AnyVal {
    
    inline def `setAccount-id`(value: Double): Self = StObject.set(x, "account-id", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-git-ref-full`(value: String): Self = StObject.set(x, "actions-cache-git-ref-full", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-git-ref-fullUndefined`: Self = StObject.set(x, "actions-cache-git-ref-full", js.undefined)
    
    inline def `setActions-cache-key`(value: String): Self = StObject.set(x, "actions-cache-key", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-key-required`(value: String): Self = StObject.set(x, "actions-cache-key-required", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-keyUndefined`: Self = StObject.set(x, "actions-cache-key", js.undefined)
    
    inline def `setActions-cache-list-sort`(value: created_at | last_accessed_at | size_in_bytes): Self = StObject.set(x, "actions-cache-list-sort", value.asInstanceOf[js.Any])
    
    inline def `setActions-cache-list-sortUndefined`: Self = StObject.set(x, "actions-cache-list-sort", js.undefined)
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def `setAlert-number`(value: Double): Self = StObject.set(x, "alert-number", value.asInstanceOf[js.Any])
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def `setApp-slug`(value: String): Self = StObject.set(x, "app-slug", value.asInstanceOf[js.Any])
    
    inline def `setArtifact-id`(value: Double): Self = StObject.set(x, "artifact-id", value.asInstanceOf[js.Any])
    
    inline def `setAsset-id`(value: Double): Self = StObject.set(x, "asset-id", value.asInstanceOf[js.Any])
    
    inline def `setAttempt-number`(value: Double): Self = StObject.set(x, "attempt-number", value.asInstanceOf[js.Any])
    
    inline def `setAutolink-id`(value: Double): Self = StObject.set(x, "autolink-id", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def `setBefore-repo-date`(value: String): Self = StObject.set(x, "before-repo-date", value.asInstanceOf[js.Any])
    
    inline def `setBefore-repo-dateUndefined`: Self = StObject.set(x, "before-repo-date", js.undefined)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def `setBranch-policy-id`(value: Double): Self = StObject.set(x, "branch-policy-id", value.asInstanceOf[js.Any])
    
    inline def `setCache-id`(value: Double): Self = StObject.set(x, "cache-id", value.asInstanceOf[js.Any])
    
    inline def `setCard-id`(value: Double): Self = StObject.set(x, "card-id", value.asInstanceOf[js.Any])
    
    inline def `setCheck-name`(value: String): Self = StObject.set(x, "check-name", value.asInstanceOf[js.Any])
    
    inline def `setCheck-nameUndefined`: Self = StObject.set(x, "check-name", js.undefined)
    
    inline def `setCheck-run-id`(value: Double): Self = StObject.set(x, "check-run-id", value.asInstanceOf[js.Any])
    
    inline def `setCheck-suite-id`(value: Double): Self = StObject.set(x, "check-suite-id", value.asInstanceOf[js.Any])
    
    inline def `setClient-id`(value: String): Self = StObject.set(x, "client-id", value.asInstanceOf[js.Any])
    
    inline def `setCodespace-name`(value: String): Self = StObject.set(x, "codespace-name", value.asInstanceOf[js.Any])
    
    inline def `setColumn-id`(value: Double): Self = StObject.set(x, "column-id", value.asInstanceOf[js.Any])
    
    inline def `setComment-id`(value: Double): Self = StObject.set(x, "comment-id", value.asInstanceOf[js.Any])
    
    inline def `setComment-number`(value: Double): Self = StObject.set(x, "comment-number", value.asInstanceOf[js.Any])
    
    inline def `setCommit-sha`(value: String): Self = StObject.set(x, "commit-sha", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def `setDelivery-id`(value: Double): Self = StObject.set(x, "delivery-id", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-comma-separated-ecosystems`(value: String): Self = StObject.set(x, "dependabot-alert-comma-separated-ecosystems", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-comma-separated-ecosystemsUndefined`: Self = StObject.set(x, "dependabot-alert-comma-separated-ecosystems", js.undefined)
    
    inline def `setDependabot-alert-comma-separated-manifests`(value: String): Self = StObject.set(x, "dependabot-alert-comma-separated-manifests", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-comma-separated-manifestsUndefined`: Self = StObject.set(x, "dependabot-alert-comma-separated-manifests", js.undefined)
    
    inline def `setDependabot-alert-comma-separated-packages`(value: String): Self = StObject.set(x, "dependabot-alert-comma-separated-packages", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-comma-separated-packagesUndefined`: Self = StObject.set(x, "dependabot-alert-comma-separated-packages", js.undefined)
    
    inline def `setDependabot-alert-comma-separated-severities`(value: String): Self = StObject.set(x, "dependabot-alert-comma-separated-severities", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-comma-separated-severitiesUndefined`: Self = StObject.set(x, "dependabot-alert-comma-separated-severities", js.undefined)
    
    inline def `setDependabot-alert-comma-separated-states`(value: String): Self = StObject.set(x, "dependabot-alert-comma-separated-states", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-comma-separated-statesUndefined`: Self = StObject.set(x, "dependabot-alert-comma-separated-states", js.undefined)
    
    inline def `setDependabot-alert-number`(value: Double): Self = StObject.set(x, "dependabot-alert-number", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-scope`(value: development | runtime): Self = StObject.set(x, "dependabot-alert-scope", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-scopeUndefined`: Self = StObject.set(x, "dependabot-alert-scope", js.undefined)
    
    inline def `setDependabot-alert-sort`(value: created_ | updated): Self = StObject.set(x, "dependabot-alert-sort", value.asInstanceOf[js.Any])
    
    inline def `setDependabot-alert-sortUndefined`: Self = StObject.set(x, "dependabot-alert-sort", js.undefined)
    
    inline def `setDeployment-id`(value: Double): Self = StObject.set(x, "deployment-id", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def `setDiscussion-number`(value: Double): Self = StObject.set(x, "discussion-number", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def `setEnvironment-name`(value: String): Self = StObject.set(x, "environment-name", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def `setExclude-pull-requests`(value: Boolean): Self = StObject.set(x, "exclude-pull-requests", value.asInstanceOf[js.Any])
    
    inline def `setExclude-pull-requestsUndefined`: Self = StObject.set(x, "exclude-pull-requests", js.undefined)
    
    inline def `setExport-id`(value: String): Self = StObject.set(x, "export-id", value.asInstanceOf[js.Any])
    
    inline def `setFine-grained-personal-access-token-id`(value: Double): Self = StObject.set(x, "fine-grained-personal-access-token-id", value.asInstanceOf[js.Any])
    
    inline def setGhsa_id(value: String): Self = StObject.set(x, "ghsa_id", value.asInstanceOf[js.Any])
    
    inline def `setGist-id`(value: String): Self = StObject.set(x, "gist-id", value.asInstanceOf[js.Any])
    
    inline def `setGit-ref`(value: String): Self = StObject.set(x, "git-ref", value.asInstanceOf[js.Any])
    
    inline def `setGit-refUndefined`: Self = StObject.set(x, "git-ref", js.undefined)
    
    inline def `setGpg-key-id`(value: Double): Self = StObject.set(x, "gpg-key-id", value.asInstanceOf[js.Any])
    
    inline def `setHook-id`(value: Double): Self = StObject.set(x, "hook-id", value.asInstanceOf[js.Any])
    
    inline def `setInstallation-id`(value: Double): Self = StObject.set(x, "installation-id", value.asInstanceOf[js.Any])
    
    inline def `setInvitation-id`(value: Double): Self = StObject.set(x, "invitation-id", value.asInstanceOf[js.Any])
    
    inline def `setIssue-number`(value: Double): Self = StObject.set(x, "issue-number", value.asInstanceOf[js.Any])
    
    inline def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    inline def `setKey-id`(value: Double): Self = StObject.set(x, "key-id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def `setManifest-path`(value: String): Self = StObject.set(x, "manifest-path", value.asInstanceOf[js.Any])
    
    inline def `setManifest-pathUndefined`: Self = StObject.set(x, "manifest-path", js.undefined)
    
    inline def `setMigration-id`(value: Double): Self = StObject.set(x, "migration-id", value.asInstanceOf[js.Any])
    
    inline def `setMilestone-number`(value: Double): Self = StObject.set(x, "milestone-number", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: desc | asc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def `setOrg-security-product-enablement`(value: enable_all | disable_all): Self = StObject.set(x, "org-security-product-enablement", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def `setPackage-name`(value: String): Self = StObject.set(x, "package-name", value.asInstanceOf[js.Any])
    
    inline def `setPackage-type`(value: npm | maven | rubygems | docker | nuget | container): Self = StObject.set(x, "package-type", value.asInstanceOf[js.Any])
    
    inline def `setPackage-version-id`(value: Double): Self = StObject.set(x, "package-version-id", value.asInstanceOf[js.Any])
    
    inline def `setPackage-visibility`(value: public | `private` | internal): Self = StObject.set(x, "package-visibility", value.asInstanceOf[js.Any])
    
    inline def `setPackage-visibilityUndefined`: Self = StObject.set(x, "package-visibility", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def `setPagination-after`(value: String): Self = StObject.set(x, "pagination-after", value.asInstanceOf[js.Any])
    
    inline def `setPagination-afterUndefined`: Self = StObject.set(x, "pagination-after", js.undefined)
    
    inline def `setPagination-before`(value: String): Self = StObject.set(x, "pagination-before", value.asInstanceOf[js.Any])
    
    inline def `setPagination-beforeUndefined`: Self = StObject.set(x, "pagination-before", js.undefined)
    
    inline def `setPagination-first`(value: Double): Self = StObject.set(x, "pagination-first", value.asInstanceOf[js.Any])
    
    inline def `setPagination-firstUndefined`: Self = StObject.set(x, "pagination-first", js.undefined)
    
    inline def `setPagination-last`(value: Double): Self = StObject.set(x, "pagination-last", value.asInstanceOf[js.Any])
    
    inline def `setPagination-lastUndefined`: Self = StObject.set(x, "pagination-last", js.undefined)
    
    inline def setParticipating(value: Boolean): Self = StObject.set(x, "participating", value.asInstanceOf[js.Any])
    
    inline def setParticipatingUndefined: Self = StObject.set(x, "participating", js.undefined)
    
    inline def setPer(value: day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def `setPer-page`(value: Double): Self = StObject.set(x, "per-page", value.asInstanceOf[js.Any])
    
    inline def `setPer-pageUndefined`: Self = StObject.set(x, "per-page", js.undefined)
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
    
    inline def `setPersonal-access-token-after`(value: String): Self = StObject.set(x, "personal-access-token-after", value.asInstanceOf[js.Any])
    
    inline def `setPersonal-access-token-afterUndefined`: Self = StObject.set(x, "personal-access-token-after", js.undefined)
    
    inline def `setPersonal-access-token-before`(value: String): Self = StObject.set(x, "personal-access-token-before", value.asInstanceOf[js.Any])
    
    inline def `setPersonal-access-token-beforeUndefined`: Self = StObject.set(x, "personal-access-token-before", js.undefined)
    
    inline def `setPersonal-access-token-owner`(value: js.Array[String]): Self = StObject.set(x, "personal-access-token-owner", value.asInstanceOf[js.Any])
    
    inline def `setPersonal-access-token-ownerUndefined`: Self = StObject.set(x, "personal-access-token-owner", js.undefined)
    
    inline def `setPersonal-access-token-ownerVarargs`(value: String*): Self = StObject.set(x, "personal-access-token-owner", js.Array(value*))
    
    inline def `setPersonal-access-token-permission`(value: String): Self = StObject.set(x, "personal-access-token-permission", value.asInstanceOf[js.Any])
    
    inline def `setPersonal-access-token-permissionUndefined`: Self = StObject.set(x, "personal-access-token-permission", js.undefined)
    
    inline def `setPersonal-access-token-repository`(value: String): Self = StObject.set(x, "personal-access-token-repository", value.asInstanceOf[js.Any])
    
    inline def `setPersonal-access-token-repositoryUndefined`: Self = StObject.set(x, "personal-access-token-repository", js.undefined)
    
    inline def `setPersonal-access-token-sort`(value: created_at): Self = StObject.set(x, "personal-access-token-sort", value.asInstanceOf[js.Any])
    
    inline def `setPersonal-access-token-sortUndefined`: Self = StObject.set(x, "personal-access-token-sort", js.undefined)
    
    inline def `setPlan-id`(value: Double): Self = StObject.set(x, "plan-id", value.asInstanceOf[js.Any])
    
    inline def `setProject-id`(value: Double): Self = StObject.set(x, "project-id", value.asInstanceOf[js.Any])
    
    inline def `setProtection-rule-id`(value: Double): Self = StObject.set(x, "protection-rule-id", value.asInstanceOf[js.Any])
    
    inline def `setPull-number`(value: Double): Self = StObject.set(x, "pull-number", value.asInstanceOf[js.Any])
    
    inline def `setReaction-id`(value: Double): Self = StObject.set(x, "reaction-id", value.asInstanceOf[js.Any])
    
    inline def `setRelease-id`(value: Double): Self = StObject.set(x, "release-id", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def `setRepo-name`(value: String): Self = StObject.set(x, "repo-name", value.asInstanceOf[js.Any])
    
    inline def `setRepo-required-workflow-id`(value: Double): Self = StObject.set(x, "repo-required-workflow-id", value.asInstanceOf[js.Any])
    
    inline def `setRepository-id`(value: Double): Self = StObject.set(x, "repository-id", value.asInstanceOf[js.Any])
    
    inline def `setRepository-id-in-query`(value: Double): Self = StObject.set(x, "repository-id-in-query", value.asInstanceOf[js.Any])
    
    inline def `setRepository-id-in-queryUndefined`: Self = StObject.set(x, "repository-id-in-query", js.undefined)
    
    inline def `setRequired-workflow-id`(value: Double): Self = StObject.set(x, "required-workflow-id", value.asInstanceOf[js.Any])
    
    inline def `setReview-id`(value: Double): Self = StObject.set(x, "review-id", value.asInstanceOf[js.Any])
    
    inline def `setRun-id`(value: Double): Self = StObject.set(x, "run-id", value.asInstanceOf[js.Any])
    
    inline def `setRunner-id`(value: Double): Self = StObject.set(x, "runner-id", value.asInstanceOf[js.Any])
    
    inline def `setRunner-label-name`(value: String): Self = StObject.set(x, "runner-label-name", value.asInstanceOf[js.Any])
    
    inline def `setSecret-name`(value: String): Self = StObject.set(x, "secret-name", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-resolution`(value: String): Self = StObject.set(x, "secret-scanning-alert-resolution", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-resolutionUndefined`: Self = StObject.set(x, "secret-scanning-alert-resolution", js.undefined)
    
    inline def `setSecret-scanning-alert-secret-type`(value: String): Self = StObject.set(x, "secret-scanning-alert-secret-type", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-secret-typeUndefined`: Self = StObject.set(x, "secret-scanning-alert-secret-type", js.undefined)
    
    inline def `setSecret-scanning-alert-sort`(value: created_ | updated): Self = StObject.set(x, "secret-scanning-alert-sort", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-sortUndefined`: Self = StObject.set(x, "secret-scanning-alert-sort", js.undefined)
    
    inline def `setSecret-scanning-alert-state`(value: open | resolved): Self = StObject.set(x, "secret-scanning-alert-state", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-alert-stateUndefined`: Self = StObject.set(x, "secret-scanning-alert-state", js.undefined)
    
    inline def `setSecret-scanning-pagination-after-org-repo`(value: String): Self = StObject.set(x, "secret-scanning-pagination-after-org-repo", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-pagination-after-org-repoUndefined`: Self = StObject.set(x, "secret-scanning-pagination-after-org-repo", js.undefined)
    
    inline def `setSecret-scanning-pagination-before-org-repo`(value: String): Self = StObject.set(x, "secret-scanning-pagination-before-org-repo", value.asInstanceOf[js.Any])
    
    inline def `setSecret-scanning-pagination-before-org-repoUndefined`: Self = StObject.set(x, "secret-scanning-pagination-before-org-repo", js.undefined)
    
    inline def `setSecurity-product`(
      value: dependency_graph | dependabot_alerts | dependabot_security_updates | advanced_security | code_scanning_default_setup | secret_scanning | secret_scanning_push_protection
    ): Self = StObject.set(x, "security-product", value.asInstanceOf[js.Any])
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def `setSince-org`(value: Double): Self = StObject.set(x, "since-org", value.asInstanceOf[js.Any])
    
    inline def `setSince-orgUndefined`: Self = StObject.set(x, "since-org", js.undefined)
    
    inline def `setSince-repo`(value: Double): Self = StObject.set(x, "since-repo", value.asInstanceOf[js.Any])
    
    inline def `setSince-repo-date`(value: String): Self = StObject.set(x, "since-repo-date", value.asInstanceOf[js.Any])
    
    inline def `setSince-repo-dateUndefined`: Self = StObject.set(x, "since-repo-date", js.undefined)
    
    inline def `setSince-repoUndefined`: Self = StObject.set(x, "since-repo", js.undefined)
    
    inline def `setSince-user`(value: Double): Self = StObject.set(x, "since-user", value.asInstanceOf[js.Any])
    
    inline def `setSince-userUndefined`: Self = StObject.set(x, "since-user", js.undefined)
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setSort(value: created_ | updated): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def `setSort-starred`(value: created_ | updated): Self = StObject.set(x, "sort-starred", value.asInstanceOf[js.Any])
    
    inline def `setSort-starredUndefined`: Self = StObject.set(x, "sort-starred", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def `setSsh-signing-key-id`(value: Double): Self = StObject.set(x, "ssh-signing-key-id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def `setTag-protection-id`(value: Double): Self = StObject.set(x, "tag-protection-id", value.asInstanceOf[js.Any])
    
    inline def `setTeam-id`(value: Double): Self = StObject.set(x, "team-id", value.asInstanceOf[js.Any])
    
    inline def `setTeam-slug`(value: String): Self = StObject.set(x, "team-slug", value.asInstanceOf[js.Any])
    
    inline def `setThread-id`(value: Double): Self = StObject.set(x, "thread-id", value.asInstanceOf[js.Any])
    
    inline def `setTool-guid`(value: String): Self = StObject.set(x, "tool-guid", value.asInstanceOf[js.Any])
    
    inline def `setTool-guidNull`: Self = StObject.set(x, "tool-guid", null)
    
    inline def `setTool-guidUndefined`: Self = StObject.set(x, "tool-guid", js.undefined)
    
    inline def `setTool-name`(value: String): Self = StObject.set(x, "tool-name", value.asInstanceOf[js.Any])
    
    inline def `setTool-nameUndefined`: Self = StObject.set(x, "tool-name", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def `setVariable-name`(value: String): Self = StObject.set(x, "variable-name", value.asInstanceOf[js.Any])
    
    inline def `setVariables-per-page`(value: Double): Self = StObject.set(x, "variables-per-page", value.asInstanceOf[js.Any])
    
    inline def `setVariables-per-pageUndefined`: Self = StObject.set(x, "variables-per-page", js.undefined)
    
    inline def `setWorkflow-id`(value: Double | String): Self = StObject.set(x, "workflow-id", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-branch`(value: String): Self = StObject.set(x, "workflow-run-branch", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-branchUndefined`: Self = StObject.set(x, "workflow-run-branch", js.undefined)
    
    inline def `setWorkflow-run-check-suite-id`(value: Double): Self = StObject.set(x, "workflow-run-check-suite-id", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-check-suite-idUndefined`: Self = StObject.set(x, "workflow-run-check-suite-id", js.undefined)
    
    inline def `setWorkflow-run-head-sha`(value: String): Self = StObject.set(x, "workflow-run-head-sha", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-head-shaUndefined`: Self = StObject.set(x, "workflow-run-head-sha", js.undefined)
    
    inline def `setWorkflow-run-status`(
      value: completed | action_required | cancelled | failure | neutral | skipped | stale | success | timed_out | in_progress | queued_ | requested | waiting | pending
    ): Self = StObject.set(x, "workflow-run-status", value.asInstanceOf[js.Any])
    
    inline def `setWorkflow-run-statusUndefined`: Self = StObject.set(x, "workflow-run-status", js.undefined)
  }
}
