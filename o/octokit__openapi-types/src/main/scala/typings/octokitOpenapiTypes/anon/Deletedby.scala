package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deletedby extends StObject {
  
  /**
    * Format: date-time
    * @example 2022-04-28T12:00:00Z
    */
  var closed_at: String | Null
  
  /**
    * Format: date-time
    * @example 2022-04-28T12:00:00Z
    */
  var created_at: String
  
  var creator: Avatarurl
  
  /**
    * Format: date-time
    * @example 2022-04-28T12:00:00Z
    */
  var deleted_at: String | Null
  
  var deleted_by: Avatarurl | Null
  
  var description: String | Null
  
  var id: Double
  
  var node_id: String
  
  var number: Double
  
  var owner: Avatarurl
  
  var public: Boolean
  
  var short_description: String | Null
  
  var title: String
  
  /**
    * Format: date-time
    * @example 2022-04-28T12:00:00Z
    */
  var updated_at: String
}
object Deletedby {
  
  inline def apply(
    created_at: String,
    creator: Avatarurl,
    id: Double,
    node_id: String,
    number: Double,
    owner: Avatarurl,
    public: Boolean,
    title: String,
    updated_at: String
  ): Deletedby = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], closed_at = null, deleted_at = null, deleted_by = null, description = null, short_description = null)
    __obj.asInstanceOf[Deletedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deletedby] (val x: Self) extends AnyVal {
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDeleted_at(value: String): Self = StObject.set(x, "deleted_at", value.asInstanceOf[js.Any])
    
    inline def setDeleted_atNull: Self = StObject.set(x, "deleted_at", null)
    
    inline def setDeleted_by(value: Avatarurl): Self = StObject.set(x, "deleted_by", value.asInstanceOf[js.Any])
    
    inline def setDeleted_byNull: Self = StObject.set(x, "deleted_by", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setShort_description(value: String): Self = StObject.set(x, "short_description", value.asInstanceOf[js.Any])
    
    inline def setShort_descriptionNull: Self = StObject.set(x, "short_description", null)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
