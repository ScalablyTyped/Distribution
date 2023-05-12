package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfteridCardsurl extends StObject {
  
  var after_id: js.UndefOr[Double | Null] = js.undefined
  
  /** Format: uri */
  var cards_url: String
  
  /** Format: date-time */
  var created_at: String
  
  /** @description The unique identifier of the project column */
  var id: Double
  
  /** @description Name of the project column */
  var name: String
  
  var node_id: String
  
  /** Format: uri */
  var project_url: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object AfteridCardsurl {
  
  inline def apply(
    cards_url: String,
    created_at: String,
    id: Double,
    name: String,
    node_id: String,
    project_url: String,
    updated_at: String,
    url: String
  ): AfteridCardsurl = {
    val __obj = js.Dynamic.literal(cards_url = cards_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfteridCardsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfteridCardsurl] (val x: Self) extends AnyVal {
    
    inline def setAfter_id(value: Double): Self = StObject.set(x, "after_id", value.asInstanceOf[js.Any])
    
    inline def setAfter_idNull: Self = StObject.set(x, "after_id", null)
    
    inline def setAfter_idUndefined: Self = StObject.set(x, "after_id", js.undefined)
    
    inline def setCards_url(value: String): Self = StObject.set(x, "cards_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setProject_url(value: String): Self = StObject.set(x, "project_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
