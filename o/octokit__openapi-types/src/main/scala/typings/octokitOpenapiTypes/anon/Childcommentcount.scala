package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Childcommentcount extends StObject {
  
  /**
    * AuthorAssociation
    * @description How the author is associated with the repository.
    * @enum {string}
    */
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  var body: String
  
  var child_comment_count: Double
  
  /** Format: date-time */
  var created_at: String
  
  var discussion_id: Double
  
  var html_url: String
  
  var id: Double
  
  var node_id: String
  
  var parent_id: (Record[String, Any]) | Null
  
  /** Reactions */
  var reactions: js.UndefOr[Eyes] = js.undefined
  
  var repository_url: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** User */
  var user: Deleted | Null
}
object Childcommentcount {
  
  inline def apply(
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    body: String,
    child_comment_count: Double,
    created_at: String,
    discussion_id: Double,
    html_url: String,
    id: Double,
    node_id: String,
    repository_url: String,
    updated_at: String
  ): Childcommentcount = {
    val __obj = js.Dynamic.literal(author_association = author_association.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], child_comment_count = child_comment_count.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], discussion_id = discussion_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], parent_id = null, user = null)
    __obj.asInstanceOf[Childcommentcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Childcommentcount] (val x: Self) extends AnyVal {
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setChild_comment_count(value: Double): Self = StObject.set(x, "child_comment_count", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_id(value: Double): Self = StObject.set(x, "discussion_id", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParent_id(value: Record[String, Any]): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    inline def setParent_idNull: Self = StObject.set(x, "parent_id", null)
    
    inline def setReactions(value: Eyes): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
