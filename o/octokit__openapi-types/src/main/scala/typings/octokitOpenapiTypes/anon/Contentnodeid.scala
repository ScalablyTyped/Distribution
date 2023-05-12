package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contentnodeid extends StObject {
  
  /**
    * Format: date-time
    * @example 2022-04-28T12:00:00Z
    */
  var archived_at: String | Null
  
  var content_node_id: String
  
  var content_type: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['projects-v2-item-content-type'] */ js.Any
  
  /**
    * Format: date-time
    * @example 2022-04-28T12:00:00Z
    */
  var created_at: String
  
  var creator: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  ] = js.undefined
  
  var id: Double
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var project_node_id: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2022-04-28T12:00:00Z
    */
  var updated_at: String
}
object Contentnodeid {
  
  inline def apply(
    content_node_id: String,
    content_type: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['projects-v2-item-content-type'] */ js.Any,
    created_at: String,
    id: Double,
    updated_at: String
  ): Contentnodeid = {
    val __obj = js.Dynamic.literal(content_node_id = content_node_id.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], archived_at = null)
    __obj.asInstanceOf[Contentnodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contentnodeid] (val x: Self) extends AnyVal {
    
    inline def setArchived_at(value: String): Self = StObject.set(x, "archived_at", value.asInstanceOf[js.Any])
    
    inline def setArchived_atNull: Self = StObject.set(x, "archived_at", null)
    
    inline def setContent_node_id(value: String): Self = StObject.set(x, "content_node_id", value.asInstanceOf[js.Any])
    
    inline def setContent_type(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['projects-v2-item-content-type'] */ js.Any
    ): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setProject_node_id(value: String): Self = StObject.set(x, "project_node_id", value.asInstanceOf[js.Any])
    
    inline def setProject_node_idUndefined: Self = StObject.set(x, "project_node_id", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
