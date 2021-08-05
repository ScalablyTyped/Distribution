package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorassociation extends StObject {
  
  var _links: Html
  
  var author_association: String
  
  var body: String
  
  var commit_id: String
  
  var created_at: String
  
  var diff_hunk: String
  
  var html_url: String
  
  var id: Double
  
  var in_reply_to_id: Double
  
  var node_id: String
  
  var original_commit_id: String
  
  var original_position: Double
  
  var path: String
  
  var position: Double
  
  var pull_request_review_id: Double
  
  var pull_request_url: String
  
  var updated_at: String
  
  var url: String
  
  var user: Avatarurl
}
object Authorassociation {
  
  inline def apply(
    _links: Html,
    author_association: String,
    body: String,
    commit_id: String,
    created_at: String,
    diff_hunk: String,
    html_url: String,
    id: Double,
    in_reply_to_id: Double,
    node_id: String,
    original_commit_id: String,
    original_position: Double,
    path: String,
    position: Double,
    pull_request_review_id: Double,
    pull_request_url: String,
    updated_at: String,
    url: String,
    user: Avatarurl
  ): Authorassociation = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], in_reply_to_id = in_reply_to_id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_request_review_id = pull_request_review_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorassociation]
  }
  
  extension [Self <: Authorassociation](x: Self) {
    
    inline def setAuthor_association(value: String): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiff_hunk(value: String): Self = StObject.set(x, "diff_hunk", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_id(value: Double): Self = StObject.set(x, "in_reply_to_id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_commit_id(value: String): Self = StObject.set(x, "original_commit_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_position(value: Double): Self = StObject.set(x, "original_position", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPull_request_review_id(value: Double): Self = StObject.set(x, "pull_request_review_id", value.asInstanceOf[js.Any])
    
    inline def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Html): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
