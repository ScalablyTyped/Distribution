package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeidPath extends StObject {
  
  /** Format: uri */
  var badge_url: String
  
  /** Format: date-time */
  var created_at: String
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var path: String
  
  var state: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object NodeidPath {
  
  inline def apply(
    badge_url: String,
    created_at: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    path: String,
    state: String,
    updated_at: String,
    url: String
  ): NodeidPath = {
    val __obj = js.Dynamic.literal(badge_url = badge_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeidPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeidPath] (val x: Self) extends AnyVal {
    
    inline def setBadge_url(value: String): Self = StObject.set(x, "badge_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
