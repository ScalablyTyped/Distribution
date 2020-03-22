package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetResponse extends js.Object {
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  var archive_url: String
  var archived: js.UndefOr[Boolean] = js.undefined
  var assignees_url: String
  var blobs_url: String
  var branches_url: String
  var clone_url: String
  var code_of_conduct: js.UndefOr[ReposGetResponseCodeOfConduct] = js.undefined
  var collaborators_url: String
  var comments_url: String
  var commits_url: String
  var compare_url: String
  var contents_url: String
  var contributors_url: String
  var created_at: String
  var default_branch: String
  var deployments_url: String
  var description: String | Null
  var disabled: js.UndefOr[Boolean] = js.undefined
  var downloads_url: String
  var events_url: String
  var fork: Boolean
  var forks: js.UndefOr[Double] = js.undefined
  var forks_count: Double
  var forks_url: String
  var full_name: String
  var git_commits_url: String
  var git_refs_url: String
  var git_tags_url: String
  var git_url: String
  var has_downloads: Boolean
  var has_issues: Boolean
  var has_pages: Boolean
  var has_projects: Boolean
  var has_wiki: Boolean
  var homepage: String | Null
  var hooks_url: String
  var html_url: String
  var id: Double
  var is_template: js.UndefOr[Boolean] = js.undefined
  var issue_comment_url: String
  var issue_events_url: String
  var issues_url: String
  var keys_url: String
  var labels_url: String
  var language: Null
  var languages_url: String
  var license: js.UndefOr[ReposGetResponseLicense] = js.undefined
  var merges_url: String
  var milestones_url: String
  var mirror_url: String | Null
  var name: String
  var network_count: Double
  var node_id: String
  var notifications_url: String
  var open_issues: js.UndefOr[Double] = js.undefined
  var open_issues_count: Double
  var organization: js.UndefOr[ReposGetResponseOrganization] = js.undefined
  var owner: ReposGetResponseOwner
  var parent: js.UndefOr[ReposGetResponseParent] = js.undefined
  var permissions: js.UndefOr[ReposGetResponsePermissions] = js.undefined
  var `private`: Boolean
  var pulls_url: String
  var pushed_at: String
  var releases_url: String
  var size: Double
  var source: js.UndefOr[ReposGetResponseSource] = js.undefined
  var ssh_url: String
  var stargazers_count: Double
  var stargazers_url: String
  var statuses_url: String
  var subscribers_count: Double
  var subscribers_url: String
  var subscription_url: String
  var svn_url: String
  var tags_url: String
  var teams_url: String
  var temp_clone_token: js.UndefOr[String] = js.undefined
  var template_repository: js.UndefOr[Null] = js.undefined
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  var trees_url: String
  var updated_at: String
  var url: String
  var visibility: js.UndefOr[String] = js.undefined
  var watchers: js.UndefOr[Double] = js.undefined
  var watchers_count: Double
}

object ReposGetResponse {
  @scala.inline
  def apply(
    archive_url: String,
    assignees_url: String,
    blobs_url: String,
    branches_url: String,
    clone_url: String,
    collaborators_url: String,
    comments_url: String,
    commits_url: String,
    compare_url: String,
    contents_url: String,
    contributors_url: String,
    created_at: String,
    default_branch: String,
    deployments_url: String,
    downloads_url: String,
    events_url: String,
    fork: Boolean,
    forks_count: Double,
    forks_url: String,
    full_name: String,
    git_commits_url: String,
    git_refs_url: String,
    git_tags_url: String,
    git_url: String,
    has_downloads: Boolean,
    has_issues: Boolean,
    has_pages: Boolean,
    has_projects: Boolean,
    has_wiki: Boolean,
    hooks_url: String,
    html_url: String,
    id: Double,
    issue_comment_url: String,
    issue_events_url: String,
    issues_url: String,
    keys_url: String,
    labels_url: String,
    language: Null,
    languages_url: String,
    merges_url: String,
    milestones_url: String,
    name: String,
    network_count: Double,
    node_id: String,
    notifications_url: String,
    open_issues_count: Double,
    owner: ReposGetResponseOwner,
    `private`: Boolean,
    pulls_url: String,
    pushed_at: String,
    releases_url: String,
    size: Double,
    ssh_url: String,
    stargazers_count: Double,
    stargazers_url: String,
    statuses_url: String,
    subscribers_count: Double,
    subscribers_url: String,
    subscription_url: String,
    svn_url: String,
    tags_url: String,
    teams_url: String,
    trees_url: String,
    updated_at: String,
    url: String,
    watchers_count: Double,
    allow_merge_commit: js.UndefOr[Boolean] = js.undefined,
    allow_rebase_merge: js.UndefOr[Boolean] = js.undefined,
    allow_squash_merge: js.UndefOr[Boolean] = js.undefined,
    archived: js.UndefOr[Boolean] = js.undefined,
    code_of_conduct: ReposGetResponseCodeOfConduct = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forks: Int | Double = null,
    homepage: String = null,
    is_template: js.UndefOr[Boolean] = js.undefined,
    license: ReposGetResponseLicense = null,
    mirror_url: String = null,
    open_issues: Int | Double = null,
    organization: ReposGetResponseOrganization = null,
    parent: ReposGetResponseParent = null,
    permissions: ReposGetResponsePermissions = null,
    source: ReposGetResponseSource = null,
    temp_clone_token: String = null,
    template_repository: js.UndefOr[scala.Nothing] = js.undefined,
    topics: js.Array[String] = null,
    visibility: String = null,
    watchers: Int | Double = null
  ): ReposGetResponse = {
    val __obj = js.Dynamic.literal(archive_url = archive_url.asInstanceOf[js.Any], assignees_url = assignees_url.asInstanceOf[js.Any], blobs_url = blobs_url.asInstanceOf[js.Any], branches_url = branches_url.asInstanceOf[js.Any], clone_url = clone_url.asInstanceOf[js.Any], collaborators_url = collaborators_url.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], compare_url = compare_url.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], contributors_url = contributors_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], deployments_url = deployments_url.asInstanceOf[js.Any], downloads_url = downloads_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], git_commits_url = git_commits_url.asInstanceOf[js.Any], git_refs_url = git_refs_url.asInstanceOf[js.Any], git_tags_url = git_tags_url.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], has_downloads = has_downloads.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_pages = has_pages.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_comment_url = issue_comment_url.asInstanceOf[js.Any], issue_events_url = issue_events_url.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], keys_url = keys_url.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages_url = languages_url.asInstanceOf[js.Any], merges_url = merges_url.asInstanceOf[js.Any], milestones_url = milestones_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network_count = network_count.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notifications_url = notifications_url.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pulls_url = pulls_url.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], releases_url = releases_url.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], ssh_url = ssh_url.asInstanceOf[js.Any], stargazers_count = stargazers_count.asInstanceOf[js.Any], stargazers_url = stargazers_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], subscribers_count = subscribers_count.asInstanceOf[js.Any], subscribers_url = subscribers_url.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], svn_url = svn_url.asInstanceOf[js.Any], tags_url = tags_url.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], trees_url = trees_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], watchers_count = watchers_count.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_merge_commit)) __obj.updateDynamic("allow_merge_commit")(allow_merge_commit.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_rebase_merge)) __obj.updateDynamic("allow_rebase_merge")(allow_rebase_merge.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_squash_merge)) __obj.updateDynamic("allow_squash_merge")(allow_squash_merge.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (code_of_conduct != null) __obj.updateDynamic("code_of_conduct")(code_of_conduct.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (forks != null) __obj.updateDynamic("forks")(forks.asInstanceOf[js.Any])
    if (homepage != null) __obj.updateDynamic("homepage")(homepage.asInstanceOf[js.Any])
    if (!js.isUndefined(is_template)) __obj.updateDynamic("is_template")(is_template.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (mirror_url != null) __obj.updateDynamic("mirror_url")(mirror_url.asInstanceOf[js.Any])
    if (open_issues != null) __obj.updateDynamic("open_issues")(open_issues.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (temp_clone_token != null) __obj.updateDynamic("temp_clone_token")(temp_clone_token.asInstanceOf[js.Any])
    if (!js.isUndefined(template_repository)) __obj.updateDynamic("template_repository")(template_repository.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (watchers != null) __obj.updateDynamic("watchers")(watchers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetResponse]
  }
}

