package typings.octokitOpenapiTypes.anon

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

trait EventsurlEventsurl extends StObject {
  
  /** @enum {string|null} */
  var active_lock_reason: resolved | `off-topic` | (`too heated`) | spam | _empty | Null
  
  /** User */
  var assignee: js.UndefOr[Deleted | Null] = js.undefined
  
  var assignees: js.Array[Deleted | Null]
  
  /**
    * AuthorAssociation
    * @description How the author is associated with the repository.
    * @enum {string}
    */
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /** @description Contents of the issue */
  var body: String | Null
  
  /** Format: date-time */
  var closed_at: String | Null
  
  var comments: Double
  
  /** Format: uri */
  var comments_url: String
  
  /** Format: date-time */
  var created_at: String
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri */
  var events_url: String
  
  /** Format: uri */
  var html_url: String
  
  /** Format: int64 */
  var id: Double
  
  var labels: js.UndefOr[js.Array[ColorDefaultDescription]] = js.undefined
  
  /** Format: uri-template */
  var labels_url: String
  
  /** @enum {boolean} */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Milestone
    * @description A collection of related issues and pull requests.
    */
  var milestone: ClosedatClosedissues | Null
  
  var node_id: String
  
  var number: Double
  
  /**
    * App
    * @description GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
    */
  var performed_via_github_app: js.UndefOr[SlugUpdatedat | Null] = js.undefined
  
  var pull_request: js.UndefOr[Mergedat] = js.undefined
  
  /** Reactions */
  var reactions: Eyes
  
  /** Format: uri */
  var repository_url: String
  
  /**
    * @description State of the issue; either 'open' or 'closed'
    * @enum {string}
    */
  var state: js.UndefOr[open | closed] = js.undefined
  
  var state_reason: js.UndefOr[String | Null] = js.undefined
  
  /** Format: uri */
  var timeline_url: js.UndefOr[String] = js.undefined
  
  /** @description Title of the issue */
  var title: String
  
  /** Format: date-time */
  var updated_at: String
  
  /**
    * Format: uri
    * @description URL for the issue
    */
  var url: String
  
  /** User */
  var user: Deleted | Null
}
object EventsurlEventsurl {
  
  inline def apply(
    assignees: js.Array[Deleted | Null],
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels_url: String,
    node_id: String,
    number: Double,
    reactions: Eyes,
    repository_url: String,
    title: String,
    updated_at: String,
    url: String
  ): EventsurlEventsurl = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], active_lock_reason = null, body = null, closed_at = null, milestone = null, user = null)
    __obj.asInstanceOf[EventsurlEventsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventsurlEventsurl] (val x: Self) extends AnyVal {
    
    inline def setActive_lock_reason(value: resolved | `off-topic` | (`too heated`) | spam | _empty): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    inline def setActive_lock_reasonNull: Self = StObject.set(x, "active_lock_reason", null)
    
    inline def setAssignee(value: Deleted): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setAssignees(value: js.Array[Deleted | Null]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesVarargs(value: (Deleted | Null)*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[ColorDefaultDescription]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: ColorDefaultDescription*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setMilestone(value: ClosedatClosedissues): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: SlugUpdatedat): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setPull_request(value: Mergedat): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setPull_requestUndefined: Self = StObject.set(x, "pull_request", js.undefined)
    
    inline def setReactions(value: Eyes): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setState_reason(value: String): Self = StObject.set(x, "state_reason", value.asInstanceOf[js.Any])
    
    inline def setState_reasonNull: Self = StObject.set(x, "state_reason", null)
    
    inline def setState_reasonUndefined: Self = StObject.set(x, "state_reason", js.undefined)
    
    inline def setTimeline_url(value: String): Self = StObject.set(x, "timeline_url", value.asInstanceOf[js.Any])
    
    inline def setTimeline_urlUndefined: Self = StObject.set(x, "timeline_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
