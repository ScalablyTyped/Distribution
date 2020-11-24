package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blobsurl extends js.Object {
  
  var archive_url: String = js.native
  
  var assignees_url: String = js.native
  
  var blobs_url: String = js.native
  
  var branches_url: String = js.native
  
  var collaborators_url: String = js.native
  
  var comments_url: String = js.native
  
  var commits_url: String = js.native
  
  var compare_url: String = js.native
  
  var contents_url: String = js.native
  
  var contributors_url: String = js.native
  
  var description: String = js.native
  
  var downloads_url: String = js.native
  
  var events_url: String = js.native
  
  var fork: Boolean = js.native
  
  var forks_url: String = js.native
  
  var full_name: String = js.native
  
  var git_commits_url: String = js.native
  
  var git_refs_url: String = js.native
  
  var git_tags_url: String = js.native
  
  var hooks_url: String = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var issue_comment_url: String = js.native
  
  var issue_events_url: String = js.native
  
  var issues_url: String = js.native
  
  var keys_url: String = js.native
  
  var labels_url: String = js.native
  
  var languages_url: String = js.native
  
  var merges_url: String = js.native
  
  var milestones_url: String = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var notifications_url: String = js.native
  
  var owner: Avatarurl = js.native
  
  var `private`: Boolean = js.native
  
  var pulls_url: String = js.native
  
  var stargazers_url: String = js.native
  
  var statuses_url: String = js.native
  
  var subscribers_url: String = js.native
  
  var subscription_url: String = js.native
  
  var tags_url: String = js.native
  
  var teams_url: String = js.native
  
  var trees_url: String = js.native
  
  var url: String = js.native
}
object Blobsurl {
  
  @scala.inline
  def apply(
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
    description: String,
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
    stargazers_url: String,
    statuses_url: String,
    subscribers_url: String,
    subscription_url: String,
    tags_url: String,
    teams_url: String,
    trees_url: String,
    url: String
  ): Blobsurl = {
    val __obj = js.Dynamic.literal(archive_url = archive_url.asInstanceOf[js.Any], assignees_url = assignees_url.asInstanceOf[js.Any], blobs_url = blobs_url.asInstanceOf[js.Any], branches_url = branches_url.asInstanceOf[js.Any], collaborators_url = collaborators_url.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], compare_url = compare_url.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], contributors_url = contributors_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downloads_url = downloads_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], git_commits_url = git_commits_url.asInstanceOf[js.Any], git_refs_url = git_refs_url.asInstanceOf[js.Any], git_tags_url = git_tags_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_comment_url = issue_comment_url.asInstanceOf[js.Any], issue_events_url = issue_events_url.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], keys_url = keys_url.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], languages_url = languages_url.asInstanceOf[js.Any], merges_url = merges_url.asInstanceOf[js.Any], milestones_url = milestones_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notifications_url = notifications_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pulls_url = pulls_url.asInstanceOf[js.Any], stargazers_url = stargazers_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], subscribers_url = subscribers_url.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], tags_url = tags_url.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], trees_url = trees_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blobsurl]
  }
  
  @scala.inline
  implicit class BlobsurlOps[Self <: Blobsurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchive_url(value: String): Self = this.set("archive_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignees_url(value: String): Self = this.set("assignees_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobs_url(value: String): Self = this.set("blobs_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranches_url(value: String): Self = this.set("branches_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaborators_url(value: String): Self = this.set("collaborators_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = this.set("comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits_url(value: String): Self = this.set("commits_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompare_url(value: String): Self = this.set("compare_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents_url(value: String): Self = this.set("contents_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributors_url(value: String): Self = this.set("contributors_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloads_url(value: String): Self = this.set("downloads_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents_url(value: String): Self = this.set("events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFork(value: Boolean): Self = this.set("fork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForks_url(value: String): Self = this.set("forks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_commits_url(value: String): Self = this.set("git_commits_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_refs_url(value: String): Self = this.set("git_refs_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_tags_url(value: String): Self = this.set("git_tags_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks_url(value: String): Self = this.set("hooks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue_comment_url(value: String): Self = this.set("issue_comment_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue_events_url(value: String): Self = this.set("issue_events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues_url(value: String): Self = this.set("issues_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys_url(value: String): Self = this.set("keys_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels_url(value: String): Self = this.set("labels_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages_url(value: String): Self = this.set("languages_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerges_url(value: String): Self = this.set("merges_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestones_url(value: String): Self = this.set("milestones_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications_url(value: String): Self = this.set("notifications_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Avatarurl): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPulls_url(value: String): Self = this.set("pulls_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStargazers_url(value: String): Self = this.set("stargazers_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses_url(value: String): Self = this.set("statuses_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribers_url(value: String): Self = this.set("subscribers_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription_url(value: String): Self = this.set("subscription_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags_url(value: String): Self = this.set("tags_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams_url(value: String): Self = this.set("teams_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrees_url(value: String): Self = this.set("trees_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
