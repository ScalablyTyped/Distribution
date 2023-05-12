package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchivedColumnname extends StObject {
  
  /**
    * @description Whether or not the card is archived
    * @example false
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  var column_name: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/columns/367
    */
  var column_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/api-playground/projects-test/issues/3
    */
  var content_url: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2016-09-05T14:21:06Z
    */
  var created_at: String
  
  var creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /**
    * @description The project card's ID
    * @example 42
    */
  var id: Double
  
  /** @example MDExOlByb2plY3RDYXJkMTQ3OA== */
  var node_id: String
  
  /** @example Add payload for delete Project column */
  var note: String | Null
  
  var project_id: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/120
    */
  var project_url: String
  
  /**
    * Format: date-time
    * @example 2016-09-05T14:20:22Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/columns/cards/1478
    */
  var url: String
}
object ArchivedColumnname {
  
  inline def apply(
    column_url: String,
    created_at: String,
    creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    id: Double,
    node_id: String,
    project_url: String,
    updated_at: String,
    url: String
  ): ArchivedColumnname = {
    val __obj = js.Dynamic.literal(column_url = column_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], note = null)
    __obj.asInstanceOf[ArchivedColumnname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchivedColumnname] (val x: Self) extends AnyVal {
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setColumn_name(value: String): Self = StObject.set(x, "column_name", value.asInstanceOf[js.Any])
    
    inline def setColumn_nameUndefined: Self = StObject.set(x, "column_name", js.undefined)
    
    inline def setColumn_url(value: String): Self = StObject.set(x, "column_url", value.asInstanceOf[js.Any])
    
    inline def setContent_url(value: String): Self = StObject.set(x, "content_url", value.asInstanceOf[js.Any])
    
    inline def setContent_urlUndefined: Self = StObject.set(x, "content_url", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setProject_id(value: String): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setProject_idUndefined: Self = StObject.set(x, "project_id", js.undefined)
    
    inline def setProject_url(value: String): Self = StObject.set(x, "project_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
