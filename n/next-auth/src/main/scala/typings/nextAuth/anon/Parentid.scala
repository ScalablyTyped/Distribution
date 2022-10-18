package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parentid extends StObject {
  
  var id: Double
  
  var name: String
  
  var parent_id: Double | Null
  
  var slug: String
}
object Parentid {
  
  inline def apply(id: Double, name: String, slug: String): Parentid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], parent_id = null)
    __obj.asInstanceOf[Parentid]
  }
  
  extension [Self <: Parentid](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent_id(value: Double): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    inline def setParent_idNull: Self = StObject.set(x, "parent_id", null)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
  }
}
