package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columnurl extends StObject {
  
  var after_id: js.UndefOr[Double | Null] = js.undefined
  
  /** @description Whether or not the card is archived */
  var archived: Boolean
  
  var column_id: Double | Null
  
  /** Format: uri */
  var column_url: String
  
  /** Format: uri */
  var content_url: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var created_at: String
  
  /** User */
  var creator: Organizationsurl | Null
  
  /** @description The project card's ID */
  var id: Double
  
  var node_id: String
  
  var note: String | Null
  
  /** Format: uri */
  var project_url: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object Columnurl {
  
  inline def apply(
    archived: Boolean,
    column_url: String,
    created_at: String,
    id: Double,
    node_id: String,
    project_url: String,
    updated_at: String,
    url: String
  ): Columnurl = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], column_url = column_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], column_id = null, creator = null, note = null)
    __obj.asInstanceOf[Columnurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Columnurl] (val x: Self) extends AnyVal {
    
    inline def setAfter_id(value: Double): Self = StObject.set(x, "after_id", value.asInstanceOf[js.Any])
    
    inline def setAfter_idNull: Self = StObject.set(x, "after_id", null)
    
    inline def setAfter_idUndefined: Self = StObject.set(x, "after_id", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    inline def setColumn_idNull: Self = StObject.set(x, "column_id", null)
    
    inline def setColumn_url(value: String): Self = StObject.set(x, "column_url", value.asInstanceOf[js.Any])
    
    inline def setContent_url(value: String): Self = StObject.set(x, "content_url", value.asInstanceOf[js.Any])
    
    inline def setContent_urlUndefined: Self = StObject.set(x, "content_url", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Organizationsurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteNull: Self = StObject.set(x, "note", null)
    
    inline def setProject_url(value: String): Self = StObject.set(x, "project_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
