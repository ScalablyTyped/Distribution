package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deploymentsurl extends StObject {
  
  var allow_forking: js.UndefOr[Boolean] = js.undefined
  
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  
  var archive_url: String
  
  var archived: Boolean
  
  var assignees_url: String
  
  var blobs_url: String
  
  var branches_url: String
  
  var clone_url: String
  
  var collaborators_url: String
  
  var comments_url: String
  
  var commits_url: String
  
  var compare_url: String
  
  var contents_url: String
  
  /** Format: uri */
  var contributors_url: String
  
  /** Format: date-time */
  var created_at: String
  
  var default_branch: String
  
  /** Format: uri */
  var deployments_url: String
  
  var description: String | Null
  
  var disabled: Boolean
  
  /** Format: uri */
  var downloads_url: String
  
  /** Format: uri */
  var events_url: String
  
  var fork: Boolean
  
  var forks: Double
  
  var forks_count: Double
  
  /** Format: uri */
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
  
  /** Format: uri */
  var homepage: String | Null
  
  /** Format: uri */
  var hooks_url: String
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var is_template: js.UndefOr[Boolean] = js.undefined
  
  var issue_comment_url: String
  
  var issue_events_url: String
  
  var issues_url: String
  
  var keys_url: String
  
  var labels_url: String
  
  var language: String | Null
  
  /** Format: uri */
  var languages_url: String
  
  var license: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-license-simple'] */ js.Any
  
  var master_branch: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var merges_url: String
  
  var milestones_url: String
  
  /** Format: uri */
  var mirror_url: String | Null
  
  var name: String
  
  var node_id: String
  
  var notifications_url: String
  
  var open_issues: Double
  
  var open_issues_count: Double
  
  var owner: Gistsurl
  
  var permissions: js.UndefOr[Push] = js.undefined
  
  var `private`: Boolean
  
  var pulls_url: String
  
  /** Format: date-time */
  var pushed_at: String
  
  var releases_url: String
  
  var size: Double
  
  var ssh_url: String
  
  var stargazers_count: Double
  
  /** Format: uri */
  var stargazers_url: String
  
  var statuses_url: String
  
  /** Format: uri */
  var subscribers_url: String
  
  /** Format: uri */
  var subscription_url: String
  
  /** Format: uri */
  var svn_url: String
  
  /** Format: uri */
  var tags_url: String
  
  /** Format: uri */
  var teams_url: String
  
  var temp_clone_token: js.UndefOr[String] = js.undefined
  
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  
  var trees_url: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  /** @description The repository visibility: public, private, or internal. */
  var visibility: js.UndefOr[String] = js.undefined
  
  var watchers: Double
  
  var watchers_count: Double
  
  var web_commit_signoff_required: js.UndefOr[Boolean] = js.undefined
}
object Deploymentsurl {
  
  inline def apply(
    archive_url: String,
    archived: Boolean,
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
    disabled: Boolean,
    downloads_url: String,
    events_url: String,
    fork: Boolean,
    forks: Double,
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
    languages_url: String,
    license: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-license-simple'] */ js.Any,
    merges_url: String,
    milestones_url: String,
    name: String,
    node_id: String,
    notifications_url: String,
    open_issues: Double,
    open_issues_count: Double,
    owner: Gistsurl,
    `private`: Boolean,
    pulls_url: String,
    pushed_at: String,
    releases_url: String,
    size: Double,
    ssh_url: String,
    stargazers_count: Double,
    stargazers_url: String,
    statuses_url: String,
    subscribers_url: String,
    subscription_url: String,
    svn_url: String,
    tags_url: String,
    teams_url: String,
    trees_url: String,
    updated_at: String,
    url: String,
    watchers: Double,
    watchers_count: Double
  ): Deploymentsurl = {
    val __obj = js.Dynamic.literal(archive_url = archive_url.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], assignees_url = assignees_url.asInstanceOf[js.Any], blobs_url = blobs_url.asInstanceOf[js.Any], branches_url = branches_url.asInstanceOf[js.Any], clone_url = clone_url.asInstanceOf[js.Any], collaborators_url = collaborators_url.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], compare_url = compare_url.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], contributors_url = contributors_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], deployments_url = deployments_url.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], downloads_url = downloads_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], git_commits_url = git_commits_url.asInstanceOf[js.Any], git_refs_url = git_refs_url.asInstanceOf[js.Any], git_tags_url = git_tags_url.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], has_downloads = has_downloads.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_pages = has_pages.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_comment_url = issue_comment_url.asInstanceOf[js.Any], issue_events_url = issue_events_url.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], keys_url = keys_url.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], languages_url = languages_url.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], merges_url = merges_url.asInstanceOf[js.Any], milestones_url = milestones_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notifications_url = notifications_url.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pulls_url = pulls_url.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], releases_url = releases_url.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], ssh_url = ssh_url.asInstanceOf[js.Any], stargazers_count = stargazers_count.asInstanceOf[js.Any], stargazers_url = stargazers_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], subscribers_url = subscribers_url.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], svn_url = svn_url.asInstanceOf[js.Any], tags_url = tags_url.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], trees_url = trees_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any], watchers_count = watchers_count.asInstanceOf[js.Any], description = null, homepage = null, language = null, mirror_url = null)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deploymentsurl]
  }
  
  extension [Self <: Deploymentsurl](x: Self) {
    
    inline def setAllow_forking(value: Boolean): Self = StObject.set(x, "allow_forking", value.asInstanceOf[js.Any])
    
    inline def setAllow_forkingUndefined: Self = StObject.set(x, "allow_forking", js.undefined)
    
    inline def setAllow_merge_commit(value: Boolean): Self = StObject.set(x, "allow_merge_commit", value.asInstanceOf[js.Any])
    
    inline def setAllow_merge_commitUndefined: Self = StObject.set(x, "allow_merge_commit", js.undefined)
    
    inline def setAllow_rebase_merge(value: Boolean): Self = StObject.set(x, "allow_rebase_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_rebase_mergeUndefined: Self = StObject.set(x, "allow_rebase_merge", js.undefined)
    
    inline def setAllow_squash_merge(value: Boolean): Self = StObject.set(x, "allow_squash_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_squash_mergeUndefined: Self = StObject.set(x, "allow_squash_merge", js.undefined)
    
    inline def setArchive_url(value: String): Self = StObject.set(x, "archive_url", value.asInstanceOf[js.Any])
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setAssignees_url(value: String): Self = StObject.set(x, "assignees_url", value.asInstanceOf[js.Any])
    
    inline def setBlobs_url(value: String): Self = StObject.set(x, "blobs_url", value.asInstanceOf[js.Any])
    
    inline def setBranches_url(value: String): Self = StObject.set(x, "branches_url", value.asInstanceOf[js.Any])
    
    inline def setClone_url(value: String): Self = StObject.set(x, "clone_url", value.asInstanceOf[js.Any])
    
    inline def setCollaborators_url(value: String): Self = StObject.set(x, "collaborators_url", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCompare_url(value: String): Self = StObject.set(x, "compare_url", value.asInstanceOf[js.Any])
    
    inline def setContents_url(value: String): Self = StObject.set(x, "contents_url", value.asInstanceOf[js.Any])
    
    inline def setContributors_url(value: String): Self = StObject.set(x, "contributors_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDefault_branch(value: String): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
    
    inline def setDeployments_url(value: String): Self = StObject.set(x, "deployments_url", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDownloads_url(value: String): Self = StObject.set(x, "downloads_url", value.asInstanceOf[js.Any])
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setFork(value: Boolean): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
    
    inline def setForks(value: Double): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
    
    inline def setForks_count(value: Double): Self = StObject.set(x, "forks_count", value.asInstanceOf[js.Any])
    
    inline def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setGit_commits_url(value: String): Self = StObject.set(x, "git_commits_url", value.asInstanceOf[js.Any])
    
    inline def setGit_refs_url(value: String): Self = StObject.set(x, "git_refs_url", value.asInstanceOf[js.Any])
    
    inline def setGit_tags_url(value: String): Self = StObject.set(x, "git_tags_url", value.asInstanceOf[js.Any])
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setHas_downloads(value: Boolean): Self = StObject.set(x, "has_downloads", value.asInstanceOf[js.Any])
    
    inline def setHas_issues(value: Boolean): Self = StObject.set(x, "has_issues", value.asInstanceOf[js.Any])
    
    inline def setHas_pages(value: Boolean): Self = StObject.set(x, "has_pages", value.asInstanceOf[js.Any])
    
    inline def setHas_projects(value: Boolean): Self = StObject.set(x, "has_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_wiki(value: Boolean): Self = StObject.set(x, "has_wiki", value.asInstanceOf[js.Any])
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageNull: Self = StObject.set(x, "homepage", null)
    
    inline def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_template(value: Boolean): Self = StObject.set(x, "is_template", value.asInstanceOf[js.Any])
    
    inline def setIs_templateUndefined: Self = StObject.set(x, "is_template", js.undefined)
    
    inline def setIssue_comment_url(value: String): Self = StObject.set(x, "issue_comment_url", value.asInstanceOf[js.Any])
    
    inline def setIssue_events_url(value: String): Self = StObject.set(x, "issue_events_url", value.asInstanceOf[js.Any])
    
    inline def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
    
    inline def setKeys_url(value: String): Self = StObject.set(x, "keys_url", value.asInstanceOf[js.Any])
    
    inline def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguages_url(value: String): Self = StObject.set(x, "languages_url", value.asInstanceOf[js.Any])
    
    inline def setLicense(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-license-simple'] */ js.Any
    ): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setMaster_branch(value: String): Self = StObject.set(x, "master_branch", value.asInstanceOf[js.Any])
    
    inline def setMaster_branchUndefined: Self = StObject.set(x, "master_branch", js.undefined)
    
    inline def setMerges_url(value: String): Self = StObject.set(x, "merges_url", value.asInstanceOf[js.Any])
    
    inline def setMilestones_url(value: String): Self = StObject.set(x, "milestones_url", value.asInstanceOf[js.Any])
    
    inline def setMirror_url(value: String): Self = StObject.set(x, "mirror_url", value.asInstanceOf[js.Any])
    
    inline def setMirror_urlNull: Self = StObject.set(x, "mirror_url", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNotifications_url(value: String): Self = StObject.set(x, "notifications_url", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues(value: Double): Self = StObject.set(x, "open_issues", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues_count(value: Double): Self = StObject.set(x, "open_issues_count", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Gistsurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Push): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPulls_url(value: String): Self = StObject.set(x, "pulls_url", value.asInstanceOf[js.Any])
    
    inline def setPushed_at(value: String): Self = StObject.set(x, "pushed_at", value.asInstanceOf[js.Any])
    
    inline def setReleases_url(value: String): Self = StObject.set(x, "releases_url", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSsh_url(value: String): Self = StObject.set(x, "ssh_url", value.asInstanceOf[js.Any])
    
    inline def setStargazers_count(value: Double): Self = StObject.set(x, "stargazers_count", value.asInstanceOf[js.Any])
    
    inline def setStargazers_url(value: String): Self = StObject.set(x, "stargazers_url", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setSubscribers_url(value: String): Self = StObject.set(x, "subscribers_url", value.asInstanceOf[js.Any])
    
    inline def setSubscription_url(value: String): Self = StObject.set(x, "subscription_url", value.asInstanceOf[js.Any])
    
    inline def setSvn_url(value: String): Self = StObject.set(x, "svn_url", value.asInstanceOf[js.Any])
    
    inline def setTags_url(value: String): Self = StObject.set(x, "tags_url", value.asInstanceOf[js.Any])
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setTemp_clone_token(value: String): Self = StObject.set(x, "temp_clone_token", value.asInstanceOf[js.Any])
    
    inline def setTemp_clone_tokenUndefined: Self = StObject.set(x, "temp_clone_token", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setTrees_url(value: String): Self = StObject.set(x, "trees_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWatchers(value: Double): Self = StObject.set(x, "watchers", value.asInstanceOf[js.Any])
    
    inline def setWatchers_count(value: Double): Self = StObject.set(x, "watchers_count", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_required(value: Boolean): Self = StObject.set(x, "web_commit_signoff_required", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_requiredUndefined: Self = StObject.set(x, "web_commit_signoff_required", js.undefined)
  }
}
