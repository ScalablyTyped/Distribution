package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastused extends StObject {
  
  var added_by: js.UndefOr[String | Null] = js.undefined
  
  var created_at: String
  
  var id: Double
  
  var key: String
  
  var last_used: js.UndefOr[String | Null] = js.undefined
  
  var read_only: Boolean
  
  var title: String
  
  /** Format: uri */
  var url: String
  
  var verified: Boolean
}
object Lastused {
  
  inline def apply(
    created_at: String,
    id: Double,
    key: String,
    read_only: Boolean,
    title: String,
    url: String,
    verified: Boolean
  ): Lastused = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastused]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lastused] (val x: Self) extends AnyVal {
    
    inline def setAdded_by(value: String): Self = StObject.set(x, "added_by", value.asInstanceOf[js.Any])
    
    inline def setAdded_byNull: Self = StObject.set(x, "added_by", null)
    
    inline def setAdded_byUndefined: Self = StObject.set(x, "added_by", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLast_used(value: String): Self = StObject.set(x, "last_used", value.asInstanceOf[js.Any])
    
    inline def setLast_usedNull: Self = StObject.set(x, "last_used", null)
    
    inline def setLast_usedUndefined: Self = StObject.set(x, "last_used", js.undefined)
    
    inline def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
