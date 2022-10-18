package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Createdat extends StObject {
  
  var created_at: String
  
  var id: Double
  
  var identifier: String
  
  var name: String
  
  var updated_at: String | Null
}
object Createdat {
  
  inline def apply(created_at: String, id: Double, identifier: String, name: String): Createdat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = null)
    __obj.asInstanceOf[Createdat]
  }
  
  extension [Self <: Createdat](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
