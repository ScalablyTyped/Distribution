package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cardsurl extends StObject {
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/columns/367/cards
    */
  var cards_url: String
  
  /**
    * Format: date-time
    * @example 2016-09-05T14:18:44Z
    */
  var created_at: String
  
  /**
    * @description The unique identifier of the project column
    * @example 42
    */
  var id: Double
  
  /**
    * @description Name of the project column
    * @example Remaining tasks
    */
  var name: String
  
  /** @example MDEzOlByb2plY3RDb2x1bW4zNjc= */
  var node_id: String
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/120
    */
  var project_url: String
  
  /**
    * Format: date-time
    * @example 2016-09-05T14:22:28Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/columns/367
    */
  var url: String
}
object Cardsurl {
  
  inline def apply(
    cards_url: String,
    created_at: String,
    id: Double,
    name: String,
    node_id: String,
    project_url: String,
    updated_at: String,
    url: String
  ): Cardsurl = {
    val __obj = js.Dynamic.literal(cards_url = cards_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardsurl]
  }
  
  extension [Self <: Cardsurl](x: Self) {
    
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
