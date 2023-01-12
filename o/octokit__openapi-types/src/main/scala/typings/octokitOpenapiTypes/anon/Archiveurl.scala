package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Archiveurl extends StObject {
  
  /**
    * @description A template for the API URL to download the repository as an archive.
    * @example https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}
    */
  var archive_url: String
  
  /**
    * @description A template for the API URL to list the available assignees for issues in the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/assignees{/user}
    */
  var assignees_url: String
  
  /**
    * @description A template for the API URL to create or retrieve a raw Git blob in the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}
    */
  var blobs_url: String
  
  /**
    * @description A template for the API URL to get information about branches in the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/branches{/branch}
    */
  var branches_url: String
  
  /**
    * @description A template for the API URL to get information about collaborators of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}
    */
  var collaborators_url: String
  
  /**
    * @description A template for the API URL to get information about comments on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/comments{/number}
    */
  var comments_url: String
  
  /**
    * @description A template for the API URL to get information about commits on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/commits{/sha}
    */
  var commits_url: String
  
  /**
    * @description A template for the API URL to compare two commits or refs.
    * @example https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}
    */
  var compare_url: String
  
  /**
    * @description A template for the API URL to get the contents of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/contents/{+path}
    */
  var contents_url: String
  
  /**
    * Format: uri
    * @description A template for the API URL to list the contributors to the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/contributors
    */
  var contributors_url: String
  
  /**
    * Format: uri
    * @description The API URL to list the deployments of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/deployments
    */
  var deployments_url: String
  
  /**
    * @description The repository description.
    * @example This your first repo!
    */
  var description: String | Null
  
  /**
    * Format: uri
    * @description The API URL to list the downloads on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/downloads
    */
  var downloads_url: String
  
  /**
    * Format: uri
    * @description The API URL to list the events of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/events
    */
  var events_url: String
  
  /** @description Whether the repository is a fork. */
  var fork: Boolean
  
  /**
    * Format: uri
    * @description The API URL to list the forks of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/forks
    */
  var forks_url: String
  
  /**
    * @description The full, globally unique, name of the repository.
    * @example octocat/Hello-World
    */
  var full_name: String
  
  /**
    * @description A template for the API URL to get information about Git commits of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}
    */
  var git_commits_url: String
  
  /**
    * @description A template for the API URL to get information about Git refs of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}
    */
  var git_refs_url: String
  
  /**
    * @description A template for the API URL to get information about Git tags of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}
    */
  var git_tags_url: String
  
  /**
    * Format: uri
    * @description The API URL to list the hooks on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/hooks
    */
  var hooks_url: String
  
  /**
    * Format: uri
    * @description The URL to view the repository on GitHub.com.
    * @example https://github.com/octocat/Hello-World
    */
  var html_url: String
  
  /**
    * @description A unique identifier of the repository.
    * @example 1296269
    */
  var id: Double
  
  /**
    * @description A template for the API URL to get information about issue comments on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}
    */
  var issue_comment_url: String
  
  /**
    * @description A template for the API URL to get information about issue events on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/issues/events{/number}
    */
  var issue_events_url: String
  
  /**
    * @description A template for the API URL to get information about issues on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/issues{/number}
    */
  var issues_url: String
  
  /**
    * @description A template for the API URL to get information about deploy keys on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/keys{/key_id}
    */
  var keys_url: String
  
  /**
    * @description A template for the API URL to get information about labels of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/labels{/name}
    */
  var labels_url: String
  
  /**
    * Format: uri
    * @description The API URL to get information about the languages of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/languages
    */
  var languages_url: String
  
  /**
    * Format: uri
    * @description The API URL to merge branches in the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/merges
    */
  var merges_url: String
  
  /**
    * @description A template for the API URL to get information about milestones of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/milestones{/number}
    */
  var milestones_url: String
  
  /**
    * @description The name of the repository.
    * @example Hello-World
    */
  var name: String
  
  /**
    * @description The GraphQL identifier of the repository.
    * @example MDEwOlJlcG9zaXRvcnkxMjk2MjY5
    */
  var node_id: String
  
  /**
    * @description A template for the API URL to get information about notifications on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}
    */
  var notifications_url: String
  
  var owner: Avatarurl
  
  /** @description Whether the repository is private. */
  var `private`: Boolean
  
  /**
    * @description A template for the API URL to get information about pull requests on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/pulls{/number}
    */
  var pulls_url: String
  
  /**
    * @description A template for the API URL to get information about releases on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/releases{/id}
    */
  var releases_url: String
  
  /**
    * Format: uri
    * @description The API URL to list the stargazers on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/stargazers
    */
  var stargazers_url: String
  
  /**
    * @description A template for the API URL to get information about statuses of a commit.
    * @example https://api.github.com/repos/octocat/Hello-World/statuses/{sha}
    */
  var statuses_url: String
  
  /**
    * Format: uri
    * @description The API URL to list the subscribers on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/subscribers
    */
  var subscribers_url: String
  
  /**
    * Format: uri
    * @description The API URL to subscribe to notifications for this repository.
    * @example https://api.github.com/repos/octocat/Hello-World/subscription
    */
  var subscription_url: String
  
  /**
    * Format: uri
    * @description The API URL to get information about tags on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/tags
    */
  var tags_url: String
  
  /**
    * Format: uri
    * @description The API URL to list the teams on the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/teams
    */
  var teams_url: String
  
  /**
    * @description A template for the API URL to create or retrieve a raw Git tree of the repository.
    * @example https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}
    */
  var trees_url: String
  
  /**
    * Format: uri
    * @description The URL to get more information about the repository from the GitHub API.
    * @example https://api.github.com/repos/octocat/Hello-World
    */
  var url: String
}
object Archiveurl {
  
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
  ): Archiveurl = {
    val __obj = js.Dynamic.literal(archive_url = archive_url.asInstanceOf[js.Any], assignees_url = assignees_url.asInstanceOf[js.Any], blobs_url = blobs_url.asInstanceOf[js.Any], branches_url = branches_url.asInstanceOf[js.Any], collaborators_url = collaborators_url.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], compare_url = compare_url.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], contributors_url = contributors_url.asInstanceOf[js.Any], deployments_url = deployments_url.asInstanceOf[js.Any], downloads_url = downloads_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], git_commits_url = git_commits_url.asInstanceOf[js.Any], git_refs_url = git_refs_url.asInstanceOf[js.Any], git_tags_url = git_tags_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_comment_url = issue_comment_url.asInstanceOf[js.Any], issue_events_url = issue_events_url.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], keys_url = keys_url.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], languages_url = languages_url.asInstanceOf[js.Any], merges_url = merges_url.asInstanceOf[js.Any], milestones_url = milestones_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notifications_url = notifications_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pulls_url = pulls_url.asInstanceOf[js.Any], releases_url = releases_url.asInstanceOf[js.Any], stargazers_url = stargazers_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], subscribers_url = subscribers_url.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], tags_url = tags_url.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], trees_url = trees_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archiveurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Archiveurl] (val x: Self) extends AnyVal {
    
    inline def setArchive_url(value: String): Self = StObject.set(x, "archive_url", value.asInstanceOf[js.Any])
    
    inline def setAssignees_url(value: String): Self = StObject.set(x, "assignees_url", value.asInstanceOf[js.Any])
    
    inline def setBlobs_url(value: String): Self = StObject.set(x, "blobs_url", value.asInstanceOf[js.Any])
    
    inline def setBranches_url(value: String): Self = StObject.set(x, "branches_url", value.asInstanceOf[js.Any])
    
    inline def setCollaborators_url(value: String): Self = StObject.set(x, "collaborators_url", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCompare_url(value: String): Self = StObject.set(x, "compare_url", value.asInstanceOf[js.Any])
    
    inline def setContents_url(value: String): Self = StObject.set(x, "contents_url", value.asInstanceOf[js.Any])
    
    inline def setContributors_url(value: String): Self = StObject.set(x, "contributors_url", value.asInstanceOf[js.Any])
    
    inline def setDeployments_url(value: String): Self = StObject.set(x, "deployments_url", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDownloads_url(value: String): Self = StObject.set(x, "downloads_url", value.asInstanceOf[js.Any])
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setFork(value: Boolean): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
    
    inline def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setGit_commits_url(value: String): Self = StObject.set(x, "git_commits_url", value.asInstanceOf[js.Any])
    
    inline def setGit_refs_url(value: String): Self = StObject.set(x, "git_refs_url", value.asInstanceOf[js.Any])
    
    inline def setGit_tags_url(value: String): Self = StObject.set(x, "git_tags_url", value.asInstanceOf[js.Any])
    
    inline def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssue_comment_url(value: String): Self = StObject.set(x, "issue_comment_url", value.asInstanceOf[js.Any])
    
    inline def setIssue_events_url(value: String): Self = StObject.set(x, "issue_events_url", value.asInstanceOf[js.Any])
    
    inline def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
    
    inline def setKeys_url(value: String): Self = StObject.set(x, "keys_url", value.asInstanceOf[js.Any])
    
    inline def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    inline def setLanguages_url(value: String): Self = StObject.set(x, "languages_url", value.asInstanceOf[js.Any])
    
    inline def setMerges_url(value: String): Self = StObject.set(x, "merges_url", value.asInstanceOf[js.Any])
    
    inline def setMilestones_url(value: String): Self = StObject.set(x, "milestones_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNotifications_url(value: String): Self = StObject.set(x, "notifications_url", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPulls_url(value: String): Self = StObject.set(x, "pulls_url", value.asInstanceOf[js.Any])
    
    inline def setReleases_url(value: String): Self = StObject.set(x, "releases_url", value.asInstanceOf[js.Any])
    
    inline def setStargazers_url(value: String): Self = StObject.set(x, "stargazers_url", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setSubscribers_url(value: String): Self = StObject.set(x, "subscribers_url", value.asInstanceOf[js.Any])
    
    inline def setSubscription_url(value: String): Self = StObject.set(x, "subscription_url", value.asInstanceOf[js.Any])
    
    inline def setTags_url(value: String): Self = StObject.set(x, "tags_url", value.asInstanceOf[js.Any])
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setTrees_url(value: String): Self = StObject.set(x, "trees_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
