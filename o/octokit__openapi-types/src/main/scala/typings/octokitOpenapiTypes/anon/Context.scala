package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  /** Format: uri */
  var avatar_url: String | Null
  
  var context: String
  
  /** Format: date-time */
  var created_at: String
  
  var description: String | Null
  
  var id: Double
  
  var node_id: String
  
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  var state: String
  
  /** Format: uri */
  var target_url: String | Null
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object Context {
  
  inline def apply(
    context: String,
    created_at: String,
    id: Double,
    node_id: String,
    state: String,
    updated_at: String,
    url: String
  ): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], avatar_url = null, description = null, target_url = null)
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlNull: Self = StObject.set(x, "avatar_url", null)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    inline def setTarget_urlNull: Self = StObject.set(x, "target_url", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
