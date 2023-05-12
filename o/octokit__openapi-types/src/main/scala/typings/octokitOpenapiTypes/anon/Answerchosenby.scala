package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.converting
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.locked
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.transferring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Answerchosenby extends StObject {
  
  var active_lock_reason: String | Null
  
  var answer_chosen_at: String | Null
  
  /** User */
  var answer_chosen_by: Deleted | Null
  
  var answer_html_url: String | Null
  
  /**
    * AuthorAssociation
    * @description How the author is associated with the repository.
    * @enum {string}
    */
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  var body: String | Null
  
  var category: Emoji
  
  var comments: Double
  
  /** Format: date-time */
  var created_at: String
  
  var html_url: String
  
  var id: Double
  
  /** @enum {boolean} */
  var locked: Boolean
  
  var node_id: String
  
  var number: Double
  
  /** Reactions */
  var reactions: js.UndefOr[Eyes] = js.undefined
  
  var repository_url: String
  
  /** @enum {string} */
  var state: open | locked | converting | transferring
  
  var timeline_url: js.UndefOr[String] = js.undefined
  
  var title: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** User */
  var user: Deleted | Null
}
object Answerchosenby {
  
  inline def apply(
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    category: Emoji,
    comments: Double,
    created_at: String,
    html_url: String,
    id: Double,
    locked: Boolean,
    node_id: String,
    number: Double,
    repository_url: String,
    state: open | locked | converting | transferring,
    title: String,
    updated_at: String
  ): Answerchosenby = {
    val __obj = js.Dynamic.literal(author_association = author_association.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], active_lock_reason = null, answer_chosen_at = null, answer_chosen_by = null, answer_html_url = null, body = null, user = null)
    __obj.asInstanceOf[Answerchosenby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Answerchosenby] (val x: Self) extends AnyVal {
    
    inline def setActive_lock_reason(value: String): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    inline def setActive_lock_reasonNull: Self = StObject.set(x, "active_lock_reason", null)
    
    inline def setAnswer_chosen_at(value: String): Self = StObject.set(x, "answer_chosen_at", value.asInstanceOf[js.Any])
    
    inline def setAnswer_chosen_atNull: Self = StObject.set(x, "answer_chosen_at", null)
    
    inline def setAnswer_chosen_by(value: Deleted): Self = StObject.set(x, "answer_chosen_by", value.asInstanceOf[js.Any])
    
    inline def setAnswer_chosen_byNull: Self = StObject.set(x, "answer_chosen_by", null)
    
    inline def setAnswer_html_url(value: String): Self = StObject.set(x, "answer_html_url", value.asInstanceOf[js.Any])
    
    inline def setAnswer_html_urlNull: Self = StObject.set(x, "answer_html_url", null)
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setCategory(value: Emoji): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setReactions(value: Eyes): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | locked | converting | transferring): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTimeline_url(value: String): Self = StObject.set(x, "timeline_url", value.asInstanceOf[js.Any])
    
    inline def setTimeline_urlUndefined: Self = StObject.set(x, "timeline_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
