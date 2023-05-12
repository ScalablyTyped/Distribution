package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issueurl extends StObject {
  
  var _links: Commits
  
  /** @example too heated */
  var active_lock_reason: js.UndefOr[String | Null] = js.undefined
  
  var assignee: Avatarurl | Null
  
  var assignees: js.UndefOr[js.Array[Avatarurl] | Null] = js.undefined
  
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  var auto_merge: Enabledby | Null
  
  var base: LabelRef
  
  /** @example Please pull these awesome changes */
  var body: String | Null
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:01:12Z
    */
  var closed_at: String | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/issues/1347/comments
    */
  var comments_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/pulls/1347/commits
    */
  var commits_url: String
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:01:12Z
    */
  var created_at: String
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/pull/1347.diff
    */
  var diff_url: String
  
  /**
    * @description Indicates whether or not the pull request is a draft.
    * @example false
    */
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var head: LabelRef
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/pull/1347
    */
  var html_url: String
  
  /** @example 1 */
  var id: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/issues/1347
    */
  var issue_url: String
  
  var labels: js.Array[ColorDefault]
  
  /** @example true */
  var locked: Boolean
  
  /** @example e5bd3914e2e596debea16f433f57875b5b90bcd6 */
  var merge_commit_sha: String | Null
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:01:12Z
    */
  var merged_at: String | Null
  
  var milestone: Closedissues | Null
  
  /** @example MDExOlB1bGxSZXF1ZXN0MQ== */
  var node_id: String
  
  /** @example 1347 */
  var number: Double
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/pull/1347.patch
    */
  var patch_url: String
  
  var requested_reviewers: js.UndefOr[js.Array[Avatarurl] | Null] = js.undefined
  
  var requested_teams: js.UndefOr[js.Array[Parent] | Null] = js.undefined
  
  /** @example https://api.github.com/repos/octocat/Hello-World/pulls/comments{/number} */
  var review_comment_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/pulls/1347/comments
    */
  var review_comments_url: String
  
  /** @example open */
  var state: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e
    */
  var statuses_url: String
  
  /** @example new-feature */
  var title: String
  
  /**
    * Format: date-time
    * @example 2011-01-26T19:01:12Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/pulls/1347
    */
  var url: String
  
  var user: Avatarurl | Null
}
object Issueurl {
  
  inline def apply(
    _links: Commits,
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    base: LabelRef,
    comments_url: String,
    commits_url: String,
    created_at: String,
    diff_url: String,
    head: LabelRef,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[ColorDefault],
    locked: Boolean,
    node_id: String,
    number: Double,
    patch_url: String,
    review_comment_url: String,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String
  ): Issueurl = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], assignee = null, auto_merge = null, body = null, closed_at = null, merge_commit_sha = null, merged_at = null, milestone = null, user = null)
    __obj.asInstanceOf[Issueurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Issueurl] (val x: Self) extends AnyVal {
    
    inline def setActive_lock_reason(value: String): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    inline def setActive_lock_reasonNull: Self = StObject.set(x, "active_lock_reason", null)
    
    inline def setActive_lock_reasonUndefined: Self = StObject.set(x, "active_lock_reason", js.undefined)
    
    inline def setAssignee(value: Avatarurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssignees(value: js.Array[Avatarurl]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesNull: Self = StObject.set(x, "assignees", null)
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: Avatarurl*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setAuto_merge(value: Enabledby): Self = StObject.set(x, "auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAuto_mergeNull: Self = StObject.set(x, "auto_merge", null)
    
    inline def setBase(value: LabelRef): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setHead(value: LabelRef): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[ColorDefault]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: ColorDefault*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_sha(value: String): Self = StObject.set(x, "merge_commit_sha", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_shaNull: Self = StObject.set(x, "merge_commit_sha", null)
    
    inline def setMerged_at(value: String): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
    
    inline def setMerged_atNull: Self = StObject.set(x, "merged_at", null)
    
    inline def setMilestone(value: Closedissues): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewers(value: js.Array[Avatarurl]): Self = StObject.set(x, "requested_reviewers", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewersNull: Self = StObject.set(x, "requested_reviewers", null)
    
    inline def setRequested_reviewersUndefined: Self = StObject.set(x, "requested_reviewers", js.undefined)
    
    inline def setRequested_reviewersVarargs(value: Avatarurl*): Self = StObject.set(x, "requested_reviewers", js.Array(value*))
    
    inline def setRequested_teams(value: js.Array[Parent]): Self = StObject.set(x, "requested_teams", value.asInstanceOf[js.Any])
    
    inline def setRequested_teamsNull: Self = StObject.set(x, "requested_teams", null)
    
    inline def setRequested_teamsUndefined: Self = StObject.set(x, "requested_teams", js.undefined)
    
    inline def setRequested_teamsVarargs(value: Parent*): Self = StObject.set(x, "requested_teams", js.Array(value*))
    
    inline def setReview_comment_url(value: String): Self = StObject.set(x, "review_comment_url", value.asInstanceOf[js.Any])
    
    inline def setReview_comments_url(value: String): Self = StObject.set(x, "review_comments_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def set_links(value: Commits): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
