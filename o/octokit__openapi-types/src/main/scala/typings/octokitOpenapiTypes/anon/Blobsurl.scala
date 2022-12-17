package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blobsurl extends StObject {
  
  var allow_forking: js.UndefOr[Boolean] = js.undefined
  
  /** @example http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref} */
  var archive_url: String
  
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /** @example http://api.github.com/repos/octocat/Hello-World/assignees{/user} */
  var assignees_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha} */
  var blobs_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/branches{/branch} */
  var branches_url: String
  
  var clone_url: js.UndefOr[String] = js.undefined
  
  var code_of_conduct: js.UndefOr[BodyHtmlurl] = js.undefined
  
  /** @example http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator} */
  var collaborators_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/comments{/number} */
  var comments_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/commits{/sha} */
  var commits_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head} */
  var compare_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/contents/{+path} */
  var contents_url: String
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/contributors
    */
  var contributors_url: String
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:01:12Z
    */
  var created_at: js.UndefOr[String | Null] = js.undefined
  
  var default_branch: js.UndefOr[String] = js.undefined
  
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/deployments
    */
  var deployments_url: String
  
  /** @example This your first repo! */
  var description: String | Null
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/downloads
    */
  var downloads_url: String
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/events
    */
  var events_url: String
  
  var fork: Boolean
  
  /** @example 0 */
  var forks: js.UndefOr[Double] = js.undefined
  
  var forks_count: js.UndefOr[Double] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/forks
    */
  var forks_url: String
  
  /** @example octocat/Hello-World */
  var full_name: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/git/commits{/sha} */
  var git_commits_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/git/refs{/sha} */
  var git_refs_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/git/tags{/sha} */
  var git_tags_url: String
  
  var git_url: js.UndefOr[String] = js.undefined
  
  var has_downloads: js.UndefOr[Boolean] = js.undefined
  
  var has_issues: js.UndefOr[Boolean] = js.undefined
  
  var has_pages: js.UndefOr[Boolean] = js.undefined
  
  var has_projects: js.UndefOr[Boolean] = js.undefined
  
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  
  var homepage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/hooks
    */
  var hooks_url: String
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World
    */
  var html_url: String
  
  /** @example 1296269 */
  var id: Double
  
  var is_template: js.UndefOr[Boolean] = js.undefined
  
  /** @example http://api.github.com/repos/octocat/Hello-World/issues/comments{/number} */
  var issue_comment_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/issues/events{/number} */
  var issue_events_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/issues{/number} */
  var issues_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/keys{/key_id} */
  var keys_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/labels{/name} */
  var labels_url: String
  
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/languages
    */
  var languages_url: String
  
  var license: js.UndefOr[Spdxid | Null] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/merges
    */
  var merges_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/milestones{/number} */
  var milestones_url: String
  
  var mirror_url: js.UndefOr[String | Null] = js.undefined
  
  /** @example Hello-World */
  var name: String
  
  var network_count: js.UndefOr[Double] = js.undefined
  
  /** @example MDEwOlJlcG9zaXRvcnkxMjk2MjY5 */
  var node_id: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating} */
  var notifications_url: String
  
  /** @example 0 */
  var open_issues: js.UndefOr[Double] = js.undefined
  
  var open_issues_count: js.UndefOr[Double] = js.undefined
  
  var owner: Avatarurl
  
  var permissions: js.UndefOr[Maintain] = js.undefined
  
  var `private`: Boolean
  
  /** @example http://api.github.com/repos/octocat/Hello-World/pulls{/number} */
  var pulls_url: String
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:06:43Z
    */
  var pushed_at: js.UndefOr[String | Null] = js.undefined
  
  /** @example http://api.github.com/repos/octocat/Hello-World/releases{/id} */
  var releases_url: String
  
  /** @example admin */
  var role_name: js.UndefOr[String] = js.undefined
  
  /** @description The size of the repository. Size is calculated hourly. When a repository is initially created, the size is 0. */
  var size: js.UndefOr[Double] = js.undefined
  
  var ssh_url: js.UndefOr[String] = js.undefined
  
  var stargazers_count: js.UndefOr[Double] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/stargazers
    */
  var stargazers_url: String
  
  /** @example http://api.github.com/repos/octocat/Hello-World/statuses/{sha} */
  var statuses_url: String
  
  var subscribers_count: js.UndefOr[Double] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/subscribers
    */
  var subscribers_url: String
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/subscription
    */
  var subscription_url: String
  
  var svn_url: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/tags
    */
  var tags_url: String
  
  /**
    * Format: uri
    * @example http://api.github.com/repos/octocat/Hello-World/teams
    */
  var teams_url: String
  
  var temp_clone_token: js.UndefOr[String] = js.undefined
  
  var template_repository: js.UndefOr[Allowupdatebranch | Null] = js.undefined
  
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @example http://api.github.com/repos/octocat/Hello-World/git/trees{/sha} */
  var trees_url: String
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:14:43Z
    */
  var updated_at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World
    */
  var url: String
  
  var visibility: js.UndefOr[String] = js.undefined
  
  /** @example 0 */
  var watchers: js.UndefOr[Double] = js.undefined
  
  var watchers_count: js.UndefOr[Double] = js.undefined
  
  /** @example false */
  var web_commit_signoff_required: js.UndefOr[Boolean] = js.undefined
}
object Blobsurl {
  
  inline def apply(
    archive_url: String,
    assignees_url: String,
    blobs_url: String,
    branches_url: String,
    collaborators_url: String,
    comments_url: String,
    commits_url: String,
    compare_url: String,
    contents_url: String,
    contributors_url: String,
    deployments_url: String,
    downloads_url: String,
    events_url: String,
    fork: Boolean,
    forks_url: String,
    full_name: String,
    git_commits_url: String,
    git_refs_url: String,
    git_tags_url: String,
    hooks_url: String,
    html_url: String,
    id: Double,
    issue_comment_url: String,
    issue_events_url: String,
    issues_url: String,
    keys_url: String,
    labels_url: String,
    languages_url: String,
    merges_url: String,
    milestones_url: String,
    name: String,
    node_id: String,
    notifications_url: String,
    owner: Avatarurl,
    `private`: Boolean,
    pulls_url: String,
    releases_url: String,
    stargazers_url: String,
    statuses_url: String,
    subscribers_url: String,
    subscription_url: String,
    tags_url: String,
    teams_url: String,
    trees_url: String,
    url: String
  ): Blobsurl = {
    val __obj = js.Dynamic.literal(archive_url = archive_url.asInstanceOf[js.Any], assignees_url = assignees_url.asInstanceOf[js.Any], blobs_url = blobs_url.asInstanceOf[js.Any], branches_url = branches_url.asInstanceOf[js.Any], collaborators_url = collaborators_url.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], compare_url = compare_url.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], contributors_url = contributors_url.asInstanceOf[js.Any], deployments_url = deployments_url.asInstanceOf[js.Any], downloads_url = downloads_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], git_commits_url = git_commits_url.asInstanceOf[js.Any], git_refs_url = git_refs_url.asInstanceOf[js.Any], git_tags_url = git_tags_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_comment_url = issue_comment_url.asInstanceOf[js.Any], issue_events_url = issue_events_url.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], keys_url = keys_url.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], languages_url = languages_url.asInstanceOf[js.Any], merges_url = merges_url.asInstanceOf[js.Any], milestones_url = milestones_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notifications_url = notifications_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pulls_url = pulls_url.asInstanceOf[js.Any], releases_url = releases_url.asInstanceOf[js.Any], stargazers_url = stargazers_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], subscribers_url = subscribers_url.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], tags_url = tags_url.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], trees_url = trees_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blobsurl]
  }
  
  extension [Self <: Blobsurl](x: Self) {
    
    inline def setAllow_forking(value: Boolean): Self = StObject.set(x, "allow_forking", value.asInstanceOf[js.Any])
    
    inline def setAllow_forkingUndefined: Self = StObject.set(x, "allow_forking", js.undefined)
    
    inline def setArchive_url(value: String): Self = StObject.set(x, "archive_url", value.asInstanceOf[js.Any])
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setAssignees_url(value: String): Self = StObject.set(x, "assignees_url", value.asInstanceOf[js.Any])
    
    inline def setBlobs_url(value: String): Self = StObject.set(x, "blobs_url", value.asInstanceOf[js.Any])
    
    inline def setBranches_url(value: String): Self = StObject.set(x, "branches_url", value.asInstanceOf[js.Any])
    
    inline def setClone_url(value: String): Self = StObject.set(x, "clone_url", value.asInstanceOf[js.Any])
    
    inline def setClone_urlUndefined: Self = StObject.set(x, "clone_url", js.undefined)
    
    inline def setCode_of_conduct(value: BodyHtmlurl): Self = StObject.set(x, "code_of_conduct", value.asInstanceOf[js.Any])
    
    inline def setCode_of_conductUndefined: Self = StObject.set(x, "code_of_conduct", js.undefined)
    
    inline def setCollaborators_url(value: String): Self = StObject.set(x, "collaborators_url", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCompare_url(value: String): Self = StObject.set(x, "compare_url", value.asInstanceOf[js.Any])
    
    inline def setContents_url(value: String): Self = StObject.set(x, "contents_url", value.asInstanceOf[js.Any])
    
    inline def setContributors_url(value: String): Self = StObject.set(x, "contributors_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDefault_branch(value: String): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
    
    inline def setDefault_branchUndefined: Self = StObject.set(x, "default_branch", js.undefined)
    
    inline def setDelete_branch_on_merge(value: Boolean): Self = StObject.set(x, "delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    inline def setDelete_branch_on_mergeUndefined: Self = StObject.set(x, "delete_branch_on_merge", js.undefined)
    
    inline def setDeployments_url(value: String): Self = StObject.set(x, "deployments_url", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDownloads_url(value: String): Self = StObject.set(x, "downloads_url", value.asInstanceOf[js.Any])
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setFork(value: Boolean): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
    
    inline def setForks(value: Double): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
    
    inline def setForksUndefined: Self = StObject.set(x, "forks", js.undefined)
    
    inline def setForks_count(value: Double): Self = StObject.set(x, "forks_count", value.asInstanceOf[js.Any])
    
    inline def setForks_countUndefined: Self = StObject.set(x, "forks_count", js.undefined)
    
    inline def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setGit_commits_url(value: String): Self = StObject.set(x, "git_commits_url", value.asInstanceOf[js.Any])
    
    inline def setGit_refs_url(value: String): Self = StObject.set(x, "git_refs_url", value.asInstanceOf[js.Any])
    
    inline def setGit_tags_url(value: String): Self = StObject.set(x, "git_tags_url", value.asInstanceOf[js.Any])
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setGit_urlUndefined: Self = StObject.set(x, "git_url", js.undefined)
    
    inline def setHas_downloads(value: Boolean): Self = StObject.set(x, "has_downloads", value.asInstanceOf[js.Any])
    
    inline def setHas_downloadsUndefined: Self = StObject.set(x, "has_downloads", js.undefined)
    
    inline def setHas_issues(value: Boolean): Self = StObject.set(x, "has_issues", value.asInstanceOf[js.Any])
    
    inline def setHas_issuesUndefined: Self = StObject.set(x, "has_issues", js.undefined)
    
    inline def setHas_pages(value: Boolean): Self = StObject.set(x, "has_pages", value.asInstanceOf[js.Any])
    
    inline def setHas_pagesUndefined: Self = StObject.set(x, "has_pages", js.undefined)
    
    inline def setHas_projects(value: Boolean): Self = StObject.set(x, "has_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_projectsUndefined: Self = StObject.set(x, "has_projects", js.undefined)
    
    inline def setHas_wiki(value: Boolean): Self = StObject.set(x, "has_wiki", value.asInstanceOf[js.Any])
    
    inline def setHas_wikiUndefined: Self = StObject.set(x, "has_wiki", js.undefined)
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageNull: Self = StObject.set(x, "homepage", null)
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
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
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguages_url(value: String): Self = StObject.set(x, "languages_url", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: Spdxid): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseNull: Self = StObject.set(x, "license", null)
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMerges_url(value: String): Self = StObject.set(x, "merges_url", value.asInstanceOf[js.Any])
    
    inline def setMilestones_url(value: String): Self = StObject.set(x, "milestones_url", value.asInstanceOf[js.Any])
    
    inline def setMirror_url(value: String): Self = StObject.set(x, "mirror_url", value.asInstanceOf[js.Any])
    
    inline def setMirror_urlNull: Self = StObject.set(x, "mirror_url", null)
    
    inline def setMirror_urlUndefined: Self = StObject.set(x, "mirror_url", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetwork_count(value: Double): Self = StObject.set(x, "network_count", value.asInstanceOf[js.Any])
    
    inline def setNetwork_countUndefined: Self = StObject.set(x, "network_count", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNotifications_url(value: String): Self = StObject.set(x, "notifications_url", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues(value: Double): Self = StObject.set(x, "open_issues", value.asInstanceOf[js.Any])
    
    inline def setOpen_issuesUndefined: Self = StObject.set(x, "open_issues", js.undefined)
    
    inline def setOpen_issues_count(value: Double): Self = StObject.set(x, "open_issues_count", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues_countUndefined: Self = StObject.set(x, "open_issues_count", js.undefined)
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Maintain): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPulls_url(value: String): Self = StObject.set(x, "pulls_url", value.asInstanceOf[js.Any])
    
    inline def setPushed_at(value: String): Self = StObject.set(x, "pushed_at", value.asInstanceOf[js.Any])
    
    inline def setPushed_atNull: Self = StObject.set(x, "pushed_at", null)
    
    inline def setPushed_atUndefined: Self = StObject.set(x, "pushed_at", js.undefined)
    
    inline def setReleases_url(value: String): Self = StObject.set(x, "releases_url", value.asInstanceOf[js.Any])
    
    inline def setRole_name(value: String): Self = StObject.set(x, "role_name", value.asInstanceOf[js.Any])
    
    inline def setRole_nameUndefined: Self = StObject.set(x, "role_name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSsh_url(value: String): Self = StObject.set(x, "ssh_url", value.asInstanceOf[js.Any])
    
    inline def setSsh_urlUndefined: Self = StObject.set(x, "ssh_url", js.undefined)
    
    inline def setStargazers_count(value: Double): Self = StObject.set(x, "stargazers_count", value.asInstanceOf[js.Any])
    
    inline def setStargazers_countUndefined: Self = StObject.set(x, "stargazers_count", js.undefined)
    
    inline def setStargazers_url(value: String): Self = StObject.set(x, "stargazers_url", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setSubscribers_count(value: Double): Self = StObject.set(x, "subscribers_count", value.asInstanceOf[js.Any])
    
    inline def setSubscribers_countUndefined: Self = StObject.set(x, "subscribers_count", js.undefined)
    
    inline def setSubscribers_url(value: String): Self = StObject.set(x, "subscribers_url", value.asInstanceOf[js.Any])
    
    inline def setSubscription_url(value: String): Self = StObject.set(x, "subscription_url", value.asInstanceOf[js.Any])
    
    inline def setSvn_url(value: String): Self = StObject.set(x, "svn_url", value.asInstanceOf[js.Any])
    
    inline def setSvn_urlUndefined: Self = StObject.set(x, "svn_url", js.undefined)
    
    inline def setTags_url(value: String): Self = StObject.set(x, "tags_url", value.asInstanceOf[js.Any])
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setTemp_clone_token(value: String): Self = StObject.set(x, "temp_clone_token", value.asInstanceOf[js.Any])
    
    inline def setTemp_clone_tokenUndefined: Self = StObject.set(x, "temp_clone_token", js.undefined)
    
    inline def setTemplate_repository(value: Allowupdatebranch): Self = StObject.set(x, "template_repository", value.asInstanceOf[js.Any])
    
    inline def setTemplate_repositoryNull: Self = StObject.set(x, "template_repository", null)
    
    inline def setTemplate_repositoryUndefined: Self = StObject.set(x, "template_repository", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setTrees_url(value: String): Self = StObject.set(x, "trees_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWatchers(value: Double): Self = StObject.set(x, "watchers", value.asInstanceOf[js.Any])
    
    inline def setWatchersUndefined: Self = StObject.set(x, "watchers", js.undefined)
    
    inline def setWatchers_count(value: Double): Self = StObject.set(x, "watchers_count", value.asInstanceOf[js.Any])
    
    inline def setWatchers_countUndefined: Self = StObject.set(x, "watchers_count", js.undefined)
    
    inline def setWeb_commit_signoff_required(value: Boolean): Self = StObject.set(x, "web_commit_signoff_required", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_requiredUndefined: Self = StObject.set(x, "web_commit_signoff_required", js.undefined)
  }
}
