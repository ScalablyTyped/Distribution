package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`off-topic`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`too heated`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.spam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedatCommentsurl extends StObject {
  
  var _links: Reviewcomments
  
  /** @enum {string|null} */
  var active_lock_reason: resolved | `off-topic` | (`too heated`) | spam | _empty | Null
  
  /** User */
  var assignee: Organizationsurl | Null
  
  var assignees: js.Array[Organizationsurl | Null]
  
  /**
    * AuthorAssociation
    * @description How the author is associated with the repository.
    * @enum {string}
    */
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /**
    * PullRequestAutoMerge
    * @description The status of auto merging a pull request.
    */
  var auto_merge: Mergemethod | Null
  
  var base: LabelRefRepoSha
  
  var body: String | Null
  
  var closed_at: String | Null
  
  /** Format: uri */
  var comments_url: String
  
  /** Format: uri */
  var commits_url: String
  
  var created_at: String
  
  /** Format: uri */
  var diff_url: String
  
  var draft: Boolean
  
  var head: RefRepoShaUser
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  /** Format: uri */
  var issue_url: String
  
  var labels: js.Array[ColorDefaultDescription]
  
  var locked: Boolean
  
  var merge_commit_sha: String | Null
  
  var merged_at: String | Null
  
  /**
    * Milestone
    * @description A collection of related issues and pull requests.
    */
  var milestone: Openissues | Null
  
  var node_id: String
  
  var number: Double
  
  /** Format: uri */
  var patch_url: String
  
  var requested_reviewers: js.Array[OneOf[js.Tuple2[Organizationsurl | Null, MembersurlName]]]
  
  var requested_teams: js.Array[NodeidParent]
  
  /** Format: uri-template */
  var review_comment_url: String
  
  /** Format: uri */
  var review_comments_url: String
  
  /** @enum {string} */
  var state: open | closed
  
  /** Format: uri */
  var statuses_url: String
  
  var title: String
  
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  /** User */
  var user: Organizationsurl | Null
}
object ClosedatCommentsurl {
  
  inline def apply(
    _links: Reviewcomments,
    assignees: js.Array[Organizationsurl | Null],
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    base: LabelRefRepoSha,
    comments_url: String,
    commits_url: String,
    created_at: String,
    diff_url: String,
    draft: Boolean,
    head: RefRepoShaUser,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[ColorDefaultDescription],
    locked: Boolean,
    node_id: String,
    number: Double,
    patch_url: String,
    requested_reviewers: js.Array[OneOf[js.Tuple2[Organizationsurl | Null, MembersurlName]]],
    requested_teams: js.Array[NodeidParent],
    review_comment_url: String,
    review_comments_url: String,
    state: open | closed,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String
  ): ClosedatCommentsurl = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], requested_reviewers = requested_reviewers.asInstanceOf[js.Any], requested_teams = requested_teams.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], active_lock_reason = null, assignee = null, auto_merge = null, body = null, closed_at = null, merge_commit_sha = null, merged_at = null, milestone = null, user = null)
    __obj.asInstanceOf[ClosedatCommentsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClosedatCommentsurl] (val x: Self) extends AnyVal {
    
    inline def setActive_lock_reason(value: resolved | `off-topic` | (`too heated`) | spam | _empty): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    inline def setActive_lock_reasonNull: Self = StObject.set(x, "active_lock_reason", null)
    
    inline def setAssignee(value: Organizationsurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssignees(value: js.Array[Organizationsurl | Null]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesVarargs(value: (Organizationsurl | Null)*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setAuto_merge(value: Mergemethod): Self = StObject.set(x, "auto_merge", value.asInstanceOf[js.Any])
    
    inline def setAuto_mergeNull: Self = StObject.set(x, "auto_merge", null)
    
    inline def setBase(value: LabelRefRepoSha): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setHead(value: RefRepoShaUser): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[ColorDefaultDescription]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: ColorDefaultDescription*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_sha(value: String): Self = StObject.set(x, "merge_commit_sha", value.asInstanceOf[js.Any])
    
    inline def setMerge_commit_shaNull: Self = StObject.set(x, "merge_commit_sha", null)
    
    inline def setMerged_at(value: String): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
    
    inline def setMerged_atNull: Self = StObject.set(x, "merged_at", null)
    
    inline def setMilestone(value: Openissues): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewers(value: js.Array[OneOf[js.Tuple2[Organizationsurl | Null, MembersurlName]]]): Self = StObject.set(x, "requested_reviewers", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewersVarargs(value: (OneOf[js.Tuple2[Organizationsurl | Null, MembersurlName]])*): Self = StObject.set(x, "requested_reviewers", js.Array(value*))
    
    inline def setRequested_teams(value: js.Array[NodeidParent]): Self = StObject.set(x, "requested_teams", value.asInstanceOf[js.Any])
    
    inline def setRequested_teamsVarargs(value: NodeidParent*): Self = StObject.set(x, "requested_teams", js.Array(value*))
    
    inline def setReview_comment_url(value: String): Self = StObject.set(x, "review_comment_url", value.asInstanceOf[js.Any])
    
    inline def setReview_comments_url(value: String): Self = StObject.set(x, "review_comments_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Organizationsurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def set_links(value: Reviewcomments): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
