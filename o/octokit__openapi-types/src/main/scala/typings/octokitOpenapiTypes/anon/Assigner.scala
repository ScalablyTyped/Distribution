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

trait Assigner extends StObject {
  
  var actor: Avatarurl | Null
  
  var assignee: js.UndefOr[Avatarurl | Null] = js.undefined
  
  var assigner: js.UndefOr[Avatarurl | Null] = js.undefined
  
  var author_association: js.UndefOr[
    COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  ] = js.undefined
  
  /** @example 6dcb09b5b57875f334f61aebed695e2e4193db5e */
  var commit_id: String | Null
  
  /** @example https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e */
  var commit_url: String | Null
  
  /**
    * Format: date-time
    * @example 2011-04-14T16:00:49Z
    */
  var created_at: String
  
  var dismissed_review: js.UndefOr[Dismissalcommitid] = js.undefined
  
  /** @example closed */
  var event: String
  
  /** @example 1 */
  var id: Double
  
  var issue: js.UndefOr[Bodyhtml | Null] = js.undefined
  
  var label: js.UndefOr[ColorName] = js.undefined
  
  var lock_reason: js.UndefOr[String | Null] = js.undefined
  
  var milestone: js.UndefOr[TitleString] = js.undefined
  
  /** @example MDEwOklzc3VlRXZlbnQx */
  var node_id: String
  
  var performed_via_github_app: js.UndefOr[Externalurl | Null] = js.undefined
  
  var project_card: js.UndefOr[Previouscolumnname] = js.undefined
  
  var rename: js.UndefOr[From] = js.undefined
  
  var requested_reviewer: js.UndefOr[Avatarurl | Null] = js.undefined
  
  var requested_team: js.UndefOr[Parent] = js.undefined
  
  var review_requester: js.UndefOr[Avatarurl | Null] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/issues/events/1
    */
  var url: String
}
object Assigner {
  
  inline def apply(created_at: String, event: String, id: Double, node_id: String, url: String): Assigner = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], actor = null, commit_id = null, commit_url = null)
    __obj.asInstanceOf[Assigner]
  }
  
  extension [Self <: Assigner](x: Self) {
    
    inline def setActor(value: Avatarurl): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorNull: Self = StObject.set(x, "actor", null)
    
    inline def setAssignee(value: Avatarurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setAssigner(value: Avatarurl): Self = StObject.set(x, "assigner", value.asInstanceOf[js.Any])
    
    inline def setAssignerNull: Self = StObject.set(x, "assigner", null)
    
    inline def setAssignerUndefined: Self = StObject.set(x, "assigner", js.undefined)
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setAuthor_associationUndefined: Self = StObject.set(x, "author_association", js.undefined)
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCommit_idNull: Self = StObject.set(x, "commit_id", null)
    
    inline def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    inline def setCommit_urlNull: Self = StObject.set(x, "commit_url", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_review(value: Dismissalcommitid): Self = StObject.set(x, "dismissed_review", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reviewUndefined: Self = StObject.set(x, "dismissed_review", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: Bodyhtml): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueNull: Self = StObject.set(x, "issue", null)
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setLabel(value: ColorName): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLock_reason(value: String): Self = StObject.set(x, "lock_reason", value.asInstanceOf[js.Any])
    
    inline def setLock_reasonNull: Self = StObject.set(x, "lock_reason", null)
    
    inline def setLock_reasonUndefined: Self = StObject.set(x, "lock_reason", js.undefined)
    
    inline def setMilestone(value: TitleString): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: Externalurl): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setProject_card(value: Previouscolumnname): Self = StObject.set(x, "project_card", value.asInstanceOf[js.Any])
    
    inline def setProject_cardUndefined: Self = StObject.set(x, "project_card", js.undefined)
    
    inline def setRename(value: From): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setRequested_reviewer(value: Avatarurl): Self = StObject.set(x, "requested_reviewer", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewerNull: Self = StObject.set(x, "requested_reviewer", null)
    
    inline def setRequested_reviewerUndefined: Self = StObject.set(x, "requested_reviewer", js.undefined)
    
    inline def setRequested_team(value: Parent): Self = StObject.set(x, "requested_team", value.asInstanceOf[js.Any])
    
    inline def setRequested_teamUndefined: Self = StObject.set(x, "requested_team", js.undefined)
    
    inline def setReview_requester(value: Avatarurl): Self = StObject.set(x, "review_requester", value.asInstanceOf[js.Any])
    
    inline def setReview_requesterNull: Self = StObject.set(x, "review_requester", null)
    
    inline def setReview_requesterUndefined: Self = StObject.set(x, "review_requester", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
