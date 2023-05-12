package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ownerurl extends StObject {
  
  /** @description Body of the project */
  var body: String | Null
  
  /** Format: uri */
  var columns_url: String
  
  /** Format: date-time */
  var created_at: String
  
  /** User */
  var creator: Deleted | Null
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  /** @description Name of the project */
  var name: String
  
  var node_id: String
  
  var number: Double
  
  /** Format: uri */
  var owner_url: String
  
  /**
    * @description State of the project; either 'open' or 'closed'
    * @enum {string}
    */
  var state: open | closed
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object Ownerurl {
  
  inline def apply(
    columns_url: String,
    created_at: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    owner_url: String,
    state: open | closed,
    updated_at: String,
    url: String
  ): Ownerurl = {
    val __obj = js.Dynamic.literal(columns_url = columns_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner_url = owner_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], body = null, creator = null)
    __obj.asInstanceOf[Ownerurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ownerurl] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setColumns_url(value: String): Self = StObject.set(x, "columns_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Deleted): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOwner_url(value: String): Self = StObject.set(x, "owner_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
