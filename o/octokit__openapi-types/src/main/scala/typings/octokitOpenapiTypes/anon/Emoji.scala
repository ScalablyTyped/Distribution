package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emoji extends StObject {
  
  /** Format: date-time */
  var created_at: String
  
  var description: String
  
  var emoji: String
  
  var id: Double
  
  var is_answerable: Boolean
  
  var name: String
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var repository_id: Double
  
  var slug: String
  
  var updated_at: String
}
object Emoji {
  
  inline def apply(
    created_at: String,
    description: String,
    emoji: String,
    id: Double,
    is_answerable: Boolean,
    name: String,
    repository_id: Double,
    slug: String,
    updated_at: String
  ): Emoji = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_answerable = is_answerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emoji]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Emoji] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_answerable(value: Boolean): Self = StObject.set(x, "is_answerable", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
