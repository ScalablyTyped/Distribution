package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targeturl extends StObject {
  
  var avatar_url: String | Null
  
  var context: String
  
  var created_at: String
  
  var creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  var description: String | Null
  
  var id: Double
  
  var node_id: String
  
  var state: String
  
  var target_url: String | Null
  
  var updated_at: String
  
  var url: String
}
object Targeturl {
  
  inline def apply(
    context: String,
    created_at: String,
    creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    id: Double,
    node_id: String,
    state: String,
    updated_at: String,
    url: String
  ): Targeturl = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], avatar_url = null, description = null, target_url = null)
    __obj.asInstanceOf[Targeturl]
  }
  
  extension [Self <: Targeturl](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlNull: Self = StObject.set(x, "avatar_url", null)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    inline def setTarget_urlNull: Self = StObject.set(x, "target_url", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
