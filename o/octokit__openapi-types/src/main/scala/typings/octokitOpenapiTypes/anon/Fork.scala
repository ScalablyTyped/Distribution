package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.BLANK
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_MESSAGES
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_OR_PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MERGE_MESSAGE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_BODY
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.internal
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fork extends StObject {
  
  /**
    * @description Whether to allow auto-merge for pull requests.
    * @default false
    */
  var allow_auto_merge: js.UndefOr[Boolean] = js.undefined
  
  /** @description Whether to allow private forks */
  var allow_forking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to allow merge commits for pull requests.
    * @default true
    */
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to allow rebase merges for pull requests.
    * @default true
    */
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether to allow squash merges for pull requests.
    * @default true
    */
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  
  var allow_update_branch: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri-template */
  var archive_url: String
  
  /**
    * @description Whether the repository is archived.
    * @default false
    */
  var archived: Boolean
  
  /** Format: uri-template */
  var assignees_url: String
  
  /** Format: uri-template */
  var blobs_url: String
  
  /** Format: uri-template */
  var branches_url: String
  
  /** Format: uri */
  var clone_url: String
  
  /** Format: uri-template */
  var collaborators_url: String
  
  /** Format: uri-template */
  var comments_url: String
  
  /** Format: uri-template */
  var commits_url: String
  
  /** Format: uri-template */
  var compare_url: String
  
  /** Format: uri-template */
  var contents_url: String
  
  /** Format: uri */
  var contributors_url: String
  
  var created_at: Double | String
  
  /** @description The default branch of the repository. */
  var default_branch: String
  
  /**
    * @description Whether to delete head branches when pull requests are merged
    * @default false
    */
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri */
  var deployments_url: String
  
  var description: String | Null
  
  /** @description Returns whether or not this repository is disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
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
  
  /** Format: uri-template */
  var git_commits_url: String
  
  /** Format: uri-template */
  var git_refs_url: String
  
  /** Format: uri-template */
  var git_tags_url: String
  
  /** Format: uri */
  var git_url: String
  
  /**
    * @description Whether discussions are enabled.
    * @default false
    */
  var has_discussions: Boolean
  
  /**
    * @description Whether downloads are enabled.
    * @default true
    */
  var has_downloads: Boolean
  
  /**
    * @description Whether issues are enabled.
    * @default true
    */
  var has_issues: Boolean
  
  var has_pages: Boolean
  
  /**
    * @description Whether projects are enabled.
    * @default true
    */
  var has_projects: Boolean
  
  /**
    * @description Whether the wiki is enabled.
    * @default true
    */
  var has_wiki: Boolean
  
  var homepage: String | Null
  
  /** Format: uri */
  var hooks_url: String
  
  /** Format: uri */
  var html_url: String
  
  /** @description Unique identifier of the repository */
  var id: Double
  
  var is_template: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri-template */
  var issue_comment_url: String
  
  /** Format: uri-template */
  var issue_events_url: String
  
  /** Format: uri-template */
  var issues_url: String
  
  /** Format: uri-template */
  var keys_url: String
  
  /** Format: uri-template */
  var labels_url: String
  
  var language: String | Null
  
  /** Format: uri */
  var languages_url: String
  
  /** License */
  var license: NodeidSpdxid | Null
  
  var master_branch: js.UndefOr[String] = js.undefined
  
  /**
    * @description The default value for a merge commit message.
    *
    * - `PR_TITLE` - default to the pull request's title.
    * - `PR_BODY` - default to the pull request's body.
    * - `BLANK` - default to a blank commit message.
    * @enum {string}
    */
  var merge_commit_message: js.UndefOr[PR_BODY | PR_TITLE | BLANK] = js.undefined
  
  /**
    * @description The default value for a merge commit title.
    *
    * - `PR_TITLE` - default to the pull request's title.
    * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
    * @enum {string}
    */
  var merge_commit_title: js.UndefOr[PR_TITLE | MERGE_MESSAGE] = js.undefined
  
  /** Format: uri */
  var merges_url: String
  
  /** Format: uri-template */
  var milestones_url: String
  
  /** Format: uri */
  var mirror_url: String | Null
  
  /** @description The name of the repository. */
  var name: String
  
  var node_id: String
  
  /** Format: uri-template */
  var notifications_url: String
  
  var open_issues: Double
  
  var open_issues_count: Double
  
  var organization: js.UndefOr[String] = js.undefined
  
  /** User */
  var owner: Deleted | Null
  
  var permissions: js.UndefOr[AdminMaintain] = js.undefined
  
  /** @description Whether the repository is private or public. */
  var `private`: Boolean
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri-template */
  var pulls_url: String
  
  var pushed_at: Double | String
  
  /** Format: uri-template */
  var releases_url: String
  
  var role_name: js.UndefOr[String | Null] = js.undefined
  
  var size: Double
  
  /**
    * @description The default value for a squash merge commit message:
    *
    * - `PR_BODY` - default to the pull request's body.
    * - `COMMIT_MESSAGES` - default to the branch's commit messages.
    * - `BLANK` - default to a blank commit message.
    * @enum {string}
    */
  var squash_merge_commit_message: js.UndefOr[PR_BODY | COMMIT_MESSAGES | BLANK] = js.undefined
  
  /**
    * @description The default value for a squash merge commit title:
    *
    * - `PR_TITLE` - default to the pull request's title.
    * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
    * @enum {string}
    */
  var squash_merge_commit_title: js.UndefOr[PR_TITLE | COMMIT_OR_PR_TITLE] = js.undefined
  
  var ssh_url: String
  
  var stargazers: js.UndefOr[Double] = js.undefined
  
  var stargazers_count: Double
  
  /** Format: uri */
  var stargazers_url: String
  
  /** Format: uri-template */
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
  
  var topics: js.Array[String]
  
  /** Format: uri-template */
  var trees_url: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  /**
    * @description Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use `squash_merge_commit_title` instead.
    * @default false
    */
  var use_squash_pr_title_as_default: js.UndefOr[Boolean] = js.undefined
  
  /** @enum {string} */
  var visibility: public | `private` | internal
  
  var watchers: Double
  
  var watchers_count: Double
  
  /** @description Whether to require contributors to sign off on web-based commits */
  var web_commit_signoff_required: js.UndefOr[Boolean] = js.undefined
}
object Fork {
  
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
    created_at: Double | String,
    default_branch: String,
    deployments_url: String,
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
    has_discussions: Boolean,
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
    merges_url: String,
    milestones_url: String,
    name: String,
    node_id: String,
    notifications_url: String,
    open_issues: Double,
    open_issues_count: Double,
    `private`: Boolean,
    pulls_url: String,
    pushed_at: Double | String,
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
    topics: js.Array[String],
    trees_url: String,
    updated_at: String,
    url: String,
    visibility: public | `private` | internal,
    watchers: Double,
    watchers_count: Double
  ): Fork = {
    val __obj = js.Dynamic.literal(archive_url = archive_url.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], assignees_url = assignees_url.asInstanceOf[js.Any], blobs_url = blobs_url.asInstanceOf[js.Any], branches_url = branches_url.asInstanceOf[js.Any], clone_url = clone_url.asInstanceOf[js.Any], collaborators_url = collaborators_url.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], compare_url = compare_url.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], contributors_url = contributors_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], deployments_url = deployments_url.asInstanceOf[js.Any], downloads_url = downloads_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], git_commits_url = git_commits_url.asInstanceOf[js.Any], git_refs_url = git_refs_url.asInstanceOf[js.Any], git_tags_url = git_tags_url.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], has_discussions = has_discussions.asInstanceOf[js.Any], has_downloads = has_downloads.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_pages = has_pages.asInstanceOf[js.Any], has_projects = has_projects.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_comment_url = issue_comment_url.asInstanceOf[js.Any], issue_events_url = issue_events_url.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], keys_url = keys_url.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], languages_url = languages_url.asInstanceOf[js.Any], merges_url = merges_url.asInstanceOf[js.Any], milestones_url = milestones_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notifications_url = notifications_url.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], pulls_url = pulls_url.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], releases_url = releases_url.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], ssh_url = ssh_url.asInstanceOf[js.Any], stargazers_count = stargazers_count.asInstanceOf[js.Any], stargazers_url = stargazers_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], subscribers_url = subscribers_url.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], svn_url = svn_url.asInstanceOf[js.Any], tags_url = tags_url.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], trees_url = trees_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any], watchers_count = watchers_count.asInstanceOf[js.Any], description = null, homepage = null, language = null, license = null, mirror_url = null, owner = null)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fork] (val x: Self) extends AnyVal {
    
    inline def setAllow_auto_merge(value: Boolean): Self = StObject.set(x, "allow_auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_mergeUndefined: Self = StObject.set(x, "allow_auto_merge", js.undefined)
    
    inline def setAllow_forking(value: Boolean): Self = StObject.set(x, "allow_forking", value.asInstanceOf[js.Any])
    
    inline def setAllow_forkingUndefined: Self = StObject.set(x, "allow_forking", js.undefined)
    
    inline def setAllow_merge_commit(value: Boolean): Self = StObject.set(x, "allow_merge_commit", value.asInstanceOf[js.Any])
    
    inline def setAllow_merge_commitUndefined: Self = StObject.set(x, "allow_merge_commit", js.undefined)
    
    inline def setAllow_rebase_merge(value: Boolean): Self = StObject.set(x, "allow_rebase_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_rebase_mergeUndefined: Self = StObject.set(x, "allow_rebase_merge", js.undefined)
    
    inline def setAllow_squash_merge(value: Boolean): Self = StObject.set(x, "allow_squash_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_squash_mergeUndefined: Self = StObject.set(x, "allow_squash_merge", js.undefined)
    
    inline def setAllow_update_branch(value: Boolean): Self = StObject.set(x, "allow_update_branch", value.asInstanceOf[js.Any])
    
    inline def setAllow_update_branchUndefined: Self = StObject.set(x, "allow_update_branch", js.undefined)
    
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
    
    inline def setCreated_at(value: Double | String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDefault_branch(value: String): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
    
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
    
    inline def setForks_count(value: Double): Self = StObject.set(x, "forks_count", value.asInstanceOf[js.Any])
    
    inline def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setGit_commits_url(value: String): Self = StObject.set(x, "git_commits_url", value.asInstanceOf[js.Any])
    
    inline def setGit_refs_url(value: String): Self = StObject.set(x, "git_refs_url", value.asInstanceOf[js.Any])
    
    inline def setGit_tags_url(value: String): Self = StObject.set(x, "git_tags_url", value.asInstanceOf[js.Any])
    
    inline def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    inline def setHas_discussions(value: Boolean): Self = StObject.set(x, "has_discussions", value.asInstanceOf[js.Any])
    
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
    
    inline def setLicense(value: NodeidSpdxid): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseNull: Self = StObject.set(x, "license", null)
    
    inline def setMaster_branch(value: String): Self = StObject.set(x, "master_branch", value.asInstanceOf[js.Any])
    
    inline def setMaster_branchUndefined: Self = StObject.set(x, "master_branch", js.undefined)
    
    inline def setMerge_commit_message(value: PR_BODY | PR_TITLE | BLANK): Self = StObject.set(x, "merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_messageUndefined: Self = StObject.set(x, "merge_commit_message", js.undefined)
    
    inline def setMerge_commit_title(value: PR_TITLE | MERGE_MESSAGE): Self = StObject.set(x, "merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_titleUndefined: Self = StObject.set(x, "merge_commit_title", js.undefined)
    
    inline def setMerges_url(value: String): Self = StObject.set(x, "merges_url", value.asInstanceOf[js.Any])
    
    inline def setMilestones_url(value: String): Self = StObject.set(x, "milestones_url", value.asInstanceOf[js.Any])
    
    inline def setMirror_url(value: String): Self = StObject.set(x, "mirror_url", value.asInstanceOf[js.Any])
    
    inline def setMirror_urlNull: Self = StObject.set(x, "mirror_url", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNotifications_url(value: String): Self = StObject.set(x, "notifications_url", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues(value: Double): Self = StObject.set(x, "open_issues", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues_count(value: Double): Self = StObject.set(x, "open_issues_count", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOwner(value: Deleted): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setPermissions(value: AdminMaintain): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setPulls_url(value: String): Self = StObject.set(x, "pulls_url", value.asInstanceOf[js.Any])
    
    inline def setPushed_at(value: Double | String): Self = StObject.set(x, "pushed_at", value.asInstanceOf[js.Any])
    
    inline def setReleases_url(value: String): Self = StObject.set(x, "releases_url", value.asInstanceOf[js.Any])
    
    inline def setRole_name(value: String): Self = StObject.set(x, "role_name", value.asInstanceOf[js.Any])
    
    inline def setRole_nameNull: Self = StObject.set(x, "role_name", null)
    
    inline def setRole_nameUndefined: Self = StObject.set(x, "role_name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_message(value: PR_BODY | COMMIT_MESSAGES | BLANK): Self = StObject.set(x, "squash_merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_messageUndefined: Self = StObject.set(x, "squash_merge_commit_message", js.undefined)
    
    inline def setSquash_merge_commit_title(value: PR_TITLE | COMMIT_OR_PR_TITLE): Self = StObject.set(x, "squash_merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_titleUndefined: Self = StObject.set(x, "squash_merge_commit_title", js.undefined)
    
    inline def setSsh_url(value: String): Self = StObject.set(x, "ssh_url", value.asInstanceOf[js.Any])
    
    inline def setStargazers(value: Double): Self = StObject.set(x, "stargazers", value.asInstanceOf[js.Any])
    
    inline def setStargazersUndefined: Self = StObject.set(x, "stargazers", js.undefined)
    
    inline def setStargazers_count(value: Double): Self = StObject.set(x, "stargazers_count", value.asInstanceOf[js.Any])
    
    inline def setStargazers_url(value: String): Self = StObject.set(x, "stargazers_url", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setSubscribers_url(value: String): Self = StObject.set(x, "subscribers_url", value.asInstanceOf[js.Any])
    
    inline def setSubscription_url(value: String): Self = StObject.set(x, "subscription_url", value.asInstanceOf[js.Any])
    
    inline def setSvn_url(value: String): Self = StObject.set(x, "svn_url", value.asInstanceOf[js.Any])
    
    inline def setTags_url(value: String): Self = StObject.set(x, "tags_url", value.asInstanceOf[js.Any])
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setTrees_url(value: String): Self = StObject.set(x, "trees_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUse_squash_pr_title_as_default(value: Boolean): Self = StObject.set(x, "use_squash_pr_title_as_default", value.asInstanceOf[js.Any])
    
    inline def setUse_squash_pr_title_as_defaultUndefined: Self = StObject.set(x, "use_squash_pr_title_as_default", js.undefined)
    
    inline def setVisibility(value: public | `private` | internal): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setWatchers(value: Double): Self = StObject.set(x, "watchers", value.asInstanceOf[js.Any])
    
    inline def setWatchers_count(value: Double): Self = StObject.set(x, "watchers_count", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_required(value: Boolean): Self = StObject.set(x, "web_commit_signoff_required", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_requiredUndefined: Self = StObject.set(x, "web_commit_signoff_required", js.undefined)
  }
}
