package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.BLANK
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_MESSAGES
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMIT_OR_PR_TITLE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MERGE_MESSAGE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_BODY
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PR_TITLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowautomerge extends StObject {
  
  var allow_auto_merge: js.UndefOr[Boolean] = js.undefined
  
  var allow_merge_commit: js.UndefOr[Boolean] = js.undefined
  
  var allow_rebase_merge: js.UndefOr[Boolean] = js.undefined
  
  var allow_squash_merge: js.UndefOr[Boolean] = js.undefined
  
  var allow_update_branch: js.UndefOr[Boolean] = js.undefined
  
  var archive_url: js.UndefOr[String] = js.undefined
  
  var archived: js.UndefOr[Boolean] = js.undefined
  
  var assignees_url: js.UndefOr[String] = js.undefined
  
  var blobs_url: js.UndefOr[String] = js.undefined
  
  var branches_url: js.UndefOr[String] = js.undefined
  
  var clone_url: js.UndefOr[String] = js.undefined
  
  var collaborators_url: js.UndefOr[String] = js.undefined
  
  var comments_url: js.UndefOr[String] = js.undefined
  
  var commits_url: js.UndefOr[String] = js.undefined
  
  var compare_url: js.UndefOr[String] = js.undefined
  
  var contents_url: js.UndefOr[String] = js.undefined
  
  var contributors_url: js.UndefOr[String] = js.undefined
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var default_branch: js.UndefOr[String] = js.undefined
  
  var delete_branch_on_merge: js.UndefOr[Boolean] = js.undefined
  
  var deployments_url: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var downloads_url: js.UndefOr[String] = js.undefined
  
  var events_url: js.UndefOr[String] = js.undefined
  
  var fork: js.UndefOr[Boolean] = js.undefined
  
  var forks_count: js.UndefOr[Double] = js.undefined
  
  var forks_url: js.UndefOr[String] = js.undefined
  
  var full_name: js.UndefOr[String] = js.undefined
  
  var git_commits_url: js.UndefOr[String] = js.undefined
  
  var git_refs_url: js.UndefOr[String] = js.undefined
  
  var git_tags_url: js.UndefOr[String] = js.undefined
  
  var git_url: js.UndefOr[String] = js.undefined
  
  var has_downloads: js.UndefOr[Boolean] = js.undefined
  
  var has_issues: js.UndefOr[Boolean] = js.undefined
  
  var has_pages: js.UndefOr[Boolean] = js.undefined
  
  var has_projects: js.UndefOr[Boolean] = js.undefined
  
  var has_wiki: js.UndefOr[Boolean] = js.undefined
  
  var homepage: js.UndefOr[String] = js.undefined
  
  var hooks_url: js.UndefOr[String] = js.undefined
  
  var html_url: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var is_template: js.UndefOr[Boolean] = js.undefined
  
  var issue_comment_url: js.UndefOr[String] = js.undefined
  
  var issue_events_url: js.UndefOr[String] = js.undefined
  
  var issues_url: js.UndefOr[String] = js.undefined
  
  var keys_url: js.UndefOr[String] = js.undefined
  
  var labels_url: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var languages_url: js.UndefOr[String] = js.undefined
  
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
  
  var merges_url: js.UndefOr[String] = js.undefined
  
  var milestones_url: js.UndefOr[String] = js.undefined
  
  var mirror_url: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var network_count: js.UndefOr[Double] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var notifications_url: js.UndefOr[String] = js.undefined
  
  var open_issues_count: js.UndefOr[Double] = js.undefined
  
  var owner: js.UndefOr[Eventsurl] = js.undefined
  
  var permissions: js.UndefOr[Maintain] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var pulls_url: js.UndefOr[String] = js.undefined
  
  var pushed_at: js.UndefOr[String] = js.undefined
  
  var releases_url: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
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
  
  var ssh_url: js.UndefOr[String] = js.undefined
  
  var stargazers_count: js.UndefOr[Double] = js.undefined
  
  var stargazers_url: js.UndefOr[String] = js.undefined
  
  var statuses_url: js.UndefOr[String] = js.undefined
  
  var subscribers_count: js.UndefOr[Double] = js.undefined
  
  var subscribers_url: js.UndefOr[String] = js.undefined
  
  var subscription_url: js.UndefOr[String] = js.undefined
  
  var svn_url: js.UndefOr[String] = js.undefined
  
  var tags_url: js.UndefOr[String] = js.undefined
  
  var teams_url: js.UndefOr[String] = js.undefined
  
  var temp_clone_token: js.UndefOr[String] = js.undefined
  
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  
  var trees_url: js.UndefOr[String] = js.undefined
  
  var updated_at: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var use_squash_pr_title_as_default: js.UndefOr[Boolean] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
  
  var watchers_count: js.UndefOr[Double] = js.undefined
}
object Allowautomerge {
  
  inline def apply(): Allowautomerge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowautomerge]
  }
  
  extension [Self <: Allowautomerge](x: Self) {
    
    inline def setAllow_auto_merge(value: Boolean): Self = StObject.set(x, "allow_auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_mergeUndefined: Self = StObject.set(x, "allow_auto_merge", js.undefined)
    
    inline def setAllow_merge_commit(value: Boolean): Self = StObject.set(x, "allow_merge_commit", value.asInstanceOf[js.Any])
    
    inline def setAllow_merge_commitUndefined: Self = StObject.set(x, "allow_merge_commit", js.undefined)
    
    inline def setAllow_rebase_merge(value: Boolean): Self = StObject.set(x, "allow_rebase_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_rebase_mergeUndefined: Self = StObject.set(x, "allow_rebase_merge", js.undefined)
    
    inline def setAllow_squash_merge(value: Boolean): Self = StObject.set(x, "allow_squash_merge", value.asInstanceOf[js.Any])
    
    inline def setAllow_squash_mergeUndefined: Self = StObject.set(x, "allow_squash_merge", js.undefined)
    
    inline def setAllow_update_branch(value: Boolean): Self = StObject.set(x, "allow_update_branch", value.asInstanceOf[js.Any])
    
    inline def setAllow_update_branchUndefined: Self = StObject.set(x, "allow_update_branch", js.undefined)
    
    inline def setArchive_url(value: String): Self = StObject.set(x, "archive_url", value.asInstanceOf[js.Any])
    
    inline def setArchive_urlUndefined: Self = StObject.set(x, "archive_url", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setAssignees_url(value: String): Self = StObject.set(x, "assignees_url", value.asInstanceOf[js.Any])
    
    inline def setAssignees_urlUndefined: Self = StObject.set(x, "assignees_url", js.undefined)
    
    inline def setBlobs_url(value: String): Self = StObject.set(x, "blobs_url", value.asInstanceOf[js.Any])
    
    inline def setBlobs_urlUndefined: Self = StObject.set(x, "blobs_url", js.undefined)
    
    inline def setBranches_url(value: String): Self = StObject.set(x, "branches_url", value.asInstanceOf[js.Any])
    
    inline def setBranches_urlUndefined: Self = StObject.set(x, "branches_url", js.undefined)
    
    inline def setClone_url(value: String): Self = StObject.set(x, "clone_url", value.asInstanceOf[js.Any])
    
    inline def setClone_urlUndefined: Self = StObject.set(x, "clone_url", js.undefined)
    
    inline def setCollaborators_url(value: String): Self = StObject.set(x, "collaborators_url", value.asInstanceOf[js.Any])
    
    inline def setCollaborators_urlUndefined: Self = StObject.set(x, "collaborators_url", js.undefined)
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setComments_urlUndefined: Self = StObject.set(x, "comments_url", js.undefined)
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_urlUndefined: Self = StObject.set(x, "commits_url", js.undefined)
    
    inline def setCompare_url(value: String): Self = StObject.set(x, "compare_url", value.asInstanceOf[js.Any])
    
    inline def setCompare_urlUndefined: Self = StObject.set(x, "compare_url", js.undefined)
    
    inline def setContents_url(value: String): Self = StObject.set(x, "contents_url", value.asInstanceOf[js.Any])
    
    inline def setContents_urlUndefined: Self = StObject.set(x, "contents_url", js.undefined)
    
    inline def setContributors_url(value: String): Self = StObject.set(x, "contributors_url", value.asInstanceOf[js.Any])
    
    inline def setContributors_urlUndefined: Self = StObject.set(x, "contributors_url", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDefault_branch(value: String): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
    
    inline def setDefault_branchUndefined: Self = StObject.set(x, "default_branch", js.undefined)
    
    inline def setDelete_branch_on_merge(value: Boolean): Self = StObject.set(x, "delete_branch_on_merge", value.asInstanceOf[js.Any])
    
    inline def setDelete_branch_on_mergeUndefined: Self = StObject.set(x, "delete_branch_on_merge", js.undefined)
    
    inline def setDeployments_url(value: String): Self = StObject.set(x, "deployments_url", value.asInstanceOf[js.Any])
    
    inline def setDeployments_urlUndefined: Self = StObject.set(x, "deployments_url", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDownloads_url(value: String): Self = StObject.set(x, "downloads_url", value.asInstanceOf[js.Any])
    
    inline def setDownloads_urlUndefined: Self = StObject.set(x, "downloads_url", js.undefined)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setEvents_urlUndefined: Self = StObject.set(x, "events_url", js.undefined)
    
    inline def setFork(value: Boolean): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
    
    inline def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
    
    inline def setForks_count(value: Double): Self = StObject.set(x, "forks_count", value.asInstanceOf[js.Any])
    
    inline def setForks_countUndefined: Self = StObject.set(x, "forks_count", js.undefined)
    
    inline def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    inline def setForks_urlUndefined: Self = StObject.set(x, "forks_url", js.undefined)
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setGit_commits_url(value: String): Self = StObject.set(x, "git_commits_url", value.asInstanceOf[js.Any])
    
    inline def setGit_commits_urlUndefined: Self = StObject.set(x, "git_commits_url", js.undefined)
    
    inline def setGit_refs_url(value: String): Self = StObject.set(x, "git_refs_url", value.asInstanceOf[js.Any])
    
    inline def setGit_refs_urlUndefined: Self = StObject.set(x, "git_refs_url", js.undefined)
    
    inline def setGit_tags_url(value: String): Self = StObject.set(x, "git_tags_url", value.asInstanceOf[js.Any])
    
    inline def setGit_tags_urlUndefined: Self = StObject.set(x, "git_tags_url", js.undefined)
    
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
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
    
    inline def setHooks_urlUndefined: Self = StObject.set(x, "hooks_url", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_template(value: Boolean): Self = StObject.set(x, "is_template", value.asInstanceOf[js.Any])
    
    inline def setIs_templateUndefined: Self = StObject.set(x, "is_template", js.undefined)
    
    inline def setIssue_comment_url(value: String): Self = StObject.set(x, "issue_comment_url", value.asInstanceOf[js.Any])
    
    inline def setIssue_comment_urlUndefined: Self = StObject.set(x, "issue_comment_url", js.undefined)
    
    inline def setIssue_events_url(value: String): Self = StObject.set(x, "issue_events_url", value.asInstanceOf[js.Any])
    
    inline def setIssue_events_urlUndefined: Self = StObject.set(x, "issue_events_url", js.undefined)
    
    inline def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
    
    inline def setIssues_urlUndefined: Self = StObject.set(x, "issues_url", js.undefined)
    
    inline def setKeys_url(value: String): Self = StObject.set(x, "keys_url", value.asInstanceOf[js.Any])
    
    inline def setKeys_urlUndefined: Self = StObject.set(x, "keys_url", js.undefined)
    
    inline def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    inline def setLabels_urlUndefined: Self = StObject.set(x, "labels_url", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguages_url(value: String): Self = StObject.set(x, "languages_url", value.asInstanceOf[js.Any])
    
    inline def setLanguages_urlUndefined: Self = StObject.set(x, "languages_url", js.undefined)
    
    inline def setMerge_commit_message(value: PR_BODY | PR_TITLE | BLANK): Self = StObject.set(x, "merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_messageUndefined: Self = StObject.set(x, "merge_commit_message", js.undefined)
    
    inline def setMerge_commit_title(value: PR_TITLE | MERGE_MESSAGE): Self = StObject.set(x, "merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_titleUndefined: Self = StObject.set(x, "merge_commit_title", js.undefined)
    
    inline def setMerges_url(value: String): Self = StObject.set(x, "merges_url", value.asInstanceOf[js.Any])
    
    inline def setMerges_urlUndefined: Self = StObject.set(x, "merges_url", js.undefined)
    
    inline def setMilestones_url(value: String): Self = StObject.set(x, "milestones_url", value.asInstanceOf[js.Any])
    
    inline def setMilestones_urlUndefined: Self = StObject.set(x, "milestones_url", js.undefined)
    
    inline def setMirror_url(value: String): Self = StObject.set(x, "mirror_url", value.asInstanceOf[js.Any])
    
    inline def setMirror_urlUndefined: Self = StObject.set(x, "mirror_url", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork_count(value: Double): Self = StObject.set(x, "network_count", value.asInstanceOf[js.Any])
    
    inline def setNetwork_countUndefined: Self = StObject.set(x, "network_count", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setNotifications_url(value: String): Self = StObject.set(x, "notifications_url", value.asInstanceOf[js.Any])
    
    inline def setNotifications_urlUndefined: Self = StObject.set(x, "notifications_url", js.undefined)
    
    inline def setOpen_issues_count(value: Double): Self = StObject.set(x, "open_issues_count", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues_countUndefined: Self = StObject.set(x, "open_issues_count", js.undefined)
    
    inline def setOwner(value: Eventsurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPermissions(value: Maintain): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setPulls_url(value: String): Self = StObject.set(x, "pulls_url", value.asInstanceOf[js.Any])
    
    inline def setPulls_urlUndefined: Self = StObject.set(x, "pulls_url", js.undefined)
    
    inline def setPushed_at(value: String): Self = StObject.set(x, "pushed_at", value.asInstanceOf[js.Any])
    
    inline def setPushed_atUndefined: Self = StObject.set(x, "pushed_at", js.undefined)
    
    inline def setReleases_url(value: String): Self = StObject.set(x, "releases_url", value.asInstanceOf[js.Any])
    
    inline def setReleases_urlUndefined: Self = StObject.set(x, "releases_url", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSquash_merge_commit_message(value: PR_BODY | COMMIT_MESSAGES | BLANK): Self = StObject.set(x, "squash_merge_commit_message", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_messageUndefined: Self = StObject.set(x, "squash_merge_commit_message", js.undefined)
    
    inline def setSquash_merge_commit_title(value: PR_TITLE | COMMIT_OR_PR_TITLE): Self = StObject.set(x, "squash_merge_commit_title", value.asInstanceOf[js.Any])
    
    inline def setSquash_merge_commit_titleUndefined: Self = StObject.set(x, "squash_merge_commit_title", js.undefined)
    
    inline def setSsh_url(value: String): Self = StObject.set(x, "ssh_url", value.asInstanceOf[js.Any])
    
    inline def setSsh_urlUndefined: Self = StObject.set(x, "ssh_url", js.undefined)
    
    inline def setStargazers_count(value: Double): Self = StObject.set(x, "stargazers_count", value.asInstanceOf[js.Any])
    
    inline def setStargazers_countUndefined: Self = StObject.set(x, "stargazers_count", js.undefined)
    
    inline def setStargazers_url(value: String): Self = StObject.set(x, "stargazers_url", value.asInstanceOf[js.Any])
    
    inline def setStargazers_urlUndefined: Self = StObject.set(x, "stargazers_url", js.undefined)
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setStatuses_urlUndefined: Self = StObject.set(x, "statuses_url", js.undefined)
    
    inline def setSubscribers_count(value: Double): Self = StObject.set(x, "subscribers_count", value.asInstanceOf[js.Any])
    
    inline def setSubscribers_countUndefined: Self = StObject.set(x, "subscribers_count", js.undefined)
    
    inline def setSubscribers_url(value: String): Self = StObject.set(x, "subscribers_url", value.asInstanceOf[js.Any])
    
    inline def setSubscribers_urlUndefined: Self = StObject.set(x, "subscribers_url", js.undefined)
    
    inline def setSubscription_url(value: String): Self = StObject.set(x, "subscription_url", value.asInstanceOf[js.Any])
    
    inline def setSubscription_urlUndefined: Self = StObject.set(x, "subscription_url", js.undefined)
    
    inline def setSvn_url(value: String): Self = StObject.set(x, "svn_url", value.asInstanceOf[js.Any])
    
    inline def setSvn_urlUndefined: Self = StObject.set(x, "svn_url", js.undefined)
    
    inline def setTags_url(value: String): Self = StObject.set(x, "tags_url", value.asInstanceOf[js.Any])
    
    inline def setTags_urlUndefined: Self = StObject.set(x, "tags_url", js.undefined)
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setTeams_urlUndefined: Self = StObject.set(x, "teams_url", js.undefined)
    
    inline def setTemp_clone_token(value: String): Self = StObject.set(x, "temp_clone_token", value.asInstanceOf[js.Any])
    
    inline def setTemp_clone_tokenUndefined: Self = StObject.set(x, "temp_clone_token", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setTrees_url(value: String): Self = StObject.set(x, "trees_url", value.asInstanceOf[js.Any])
    
    inline def setTrees_urlUndefined: Self = StObject.set(x, "trees_url", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUse_squash_pr_title_as_default(value: Boolean): Self = StObject.set(x, "use_squash_pr_title_as_default", value.asInstanceOf[js.Any])
    
    inline def setUse_squash_pr_title_as_defaultUndefined: Self = StObject.set(x, "use_squash_pr_title_as_default", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWatchers_count(value: Double): Self = StObject.set(x, "watchers_count", value.asInstanceOf[js.Any])
    
    inline def setWatchers_countUndefined: Self = StObject.set(x, "watchers_count", js.undefined)
  }
}
