package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Closedat
import typings.octokitTypes.anon.Color
import typings.octokitTypes.anon.Commits
import typings.octokitTypes.anon.Label
import typings.octokitTypes.anon.Membersurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsCreateResponseData extends StObject {
  
  var _links: Commits = js.native
  
  var active_lock_reason: String = js.native
  
  var additions: Double = js.native
  
  var assignee: Avatarurl = js.native
  
  var assignees: js.Array[Avatarurl] = js.native
  
  var author_association: String = js.native
  
  var base: Label = js.native
  
  var body: String = js.native
  
  var changed_files: Double = js.native
  
  var closed_at: String = js.native
  
  var comments: Double = js.native
  
  var comments_url: String = js.native
  
  var commits: Double = js.native
  
  var commits_url: String = js.native
  
  var created_at: String = js.native
  
  var deletions: Double = js.native
  
  var diff_url: String = js.native
  
  var draft: Boolean = js.native
  
  var head: Label = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var issue_url: String = js.native
  
  var labels: js.Array[Color] = js.native
  
  var locked: Boolean = js.native
  
  var maintainer_can_modify: Boolean = js.native
  
  var merge_commit_sha: String = js.native
  
  var mergeable: Boolean = js.native
  
  var mergeable_state: String = js.native
  
  var merged: Boolean = js.native
  
  var merged_at: String = js.native
  
  var merged_by: Avatarurl = js.native
  
  var milestone: Closedat = js.native
  
  var node_id: String = js.native
  
  var number: Double = js.native
  
  var patch_url: String = js.native
  
  var rebaseable: Boolean = js.native
  
  var requested_reviewers: js.Array[Avatarurl] = js.native
  
  var requested_teams: js.Array[Membersurl] = js.native
  
  var review_comment_url: String = js.native
  
  var review_comments: Double = js.native
  
  var review_comments_url: String = js.native
  
  var state: String = js.native
  
  var statuses_url: String = js.native
  
  var title: String = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
  
  var user: Avatarurl = js.native
}
object PullsCreateResponseData {
  
  @scala.inline
  def apply(
    _links: Commits,
    active_lock_reason: String,
    additions: Double,
    assignee: Avatarurl,
    assignees: js.Array[Avatarurl],
    author_association: String,
    base: Label,
    body: String,
    changed_files: Double,
    closed_at: String,
    comments: Double,
    comments_url: String,
    commits: Double,
    commits_url: String,
    created_at: String,
    deletions: Double,
    diff_url: String,
    draft: Boolean,
    head: Label,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[Color],
    locked: Boolean,
    maintainer_can_modify: Boolean,
    merge_commit_sha: String,
    mergeable: Boolean,
    mergeable_state: String,
    merged: Boolean,
    merged_at: String,
    merged_by: Avatarurl,
    milestone: Closedat,
    node_id: String,
    number: Double,
    patch_url: String,
    rebaseable: Boolean,
    requested_reviewers: js.Array[Avatarurl],
    requested_teams: js.Array[Membersurl],
    review_comment_url: String,
    review_comments: Double,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String,
    user: Avatarurl
  ): PullsCreateResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], active_lock_reason = active_lock_reason.asInstanceOf[js.Any], additions = additions.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], changed_files = changed_files.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], merge_commit_sha = merge_commit_sha.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mergeable_state = mergeable_state.asInstanceOf[js.Any], merged = merged.asInstanceOf[js.Any], merged_at = merged_at.asInstanceOf[js.Any], merged_by = merged_by.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], rebaseable = rebaseable.asInstanceOf[js.Any], requested_reviewers = requested_reviewers.asInstanceOf[js.Any], requested_teams = requested_teams.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateResponseData]
  }
  
  @scala.inline
  implicit class PullsCreateResponseDataMutableBuilder[Self <: PullsCreateResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_lock_reason(value: String): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee(value: Avatarurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignees(value: js.Array[Avatarurl]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneesVarargs(value: Avatarurl*): Self = StObject.set(x, "assignees", js.Array(value :_*))
    
    @scala.inline
    def setAuthor_association(value: String): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Label): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanged_files(value: Double): Self = StObject.set(x, "changed_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits(value: Double): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead(value: Label): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[Color]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: Color*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainer_can_modify(value: Boolean): Self = StObject.set(x, "maintainer_can_modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge_commit_sha(value: String): Self = StObject.set(x, "merge_commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeable(value: Boolean): Self = StObject.set(x, "mergeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeable_state(value: String): Self = StObject.set(x, "mergeable_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerged(value: Boolean): Self = StObject.set(x, "merged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerged_at(value: String): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerged_by(value: Avatarurl): Self = StObject.set(x, "merged_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestone(value: Closedat): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebaseable(value: Boolean): Self = StObject.set(x, "rebaseable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_reviewers(value: js.Array[Avatarurl]): Self = StObject.set(x, "requested_reviewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_reviewersVarargs(value: Avatarurl*): Self = StObject.set(x, "requested_reviewers", js.Array(value :_*))
    
    @scala.inline
    def setRequested_teams(value: js.Array[Membersurl]): Self = StObject.set(x, "requested_teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_teamsVarargs(value: Membersurl*): Self = StObject.set(x, "requested_teams", js.Array(value :_*))
    
    @scala.inline
    def setReview_comment_url(value: String): Self = StObject.set(x, "review_comment_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_comments(value: Double): Self = StObject.set(x, "review_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_comments_url(value: String): Self = StObject.set(x, "review_comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: Commits): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
