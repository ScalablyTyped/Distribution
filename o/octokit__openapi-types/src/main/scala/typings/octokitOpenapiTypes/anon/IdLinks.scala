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

trait IdLinks extends StObject {
  
  var _links: Pullrequest
  
  /**
    * AuthorAssociation
    * @description How the author is associated with the repository.
    * @enum {string}
    */
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /** @description The text of the review. */
  var body: String | Null
  
  /** @description A commit SHA for the review. */
  var commit_id: String
  
  /** Format: uri */
  var html_url: String
  
  /** @description Unique identifier of the review */
  var id: Double
  
  var node_id: String
  
  /** Format: uri */
  var pull_request_url: String
  
  var state: String
  
  /** Format: date-time */
  var submitted_at: String | Null
  
  /** User */
  var user: Deleted | Null
}
object IdLinks {
  
  inline def apply(
    _links: Pullrequest,
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    commit_id: String,
    html_url: String,
    id: Double,
    node_id: String,
    pull_request_url: String,
    state: String
  ): IdLinks = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], body = null, submitted_at = null, user = null)
    __obj.asInstanceOf[IdLinks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdLinks] (val x: Self) extends AnyVal {
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSubmitted_at(value: String): Self = StObject.set(x, "submitted_at", value.asInstanceOf[js.Any])
    
    inline def setSubmitted_atNull: Self = StObject.set(x, "submitted_at", null)
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def set_links(value: Pullrequest): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
