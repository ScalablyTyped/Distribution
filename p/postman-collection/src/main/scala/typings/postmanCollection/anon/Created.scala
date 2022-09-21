package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  var created: js.Array[String]
  
  var deleted: js.Array[String]
  
  var updated: js.Array[String]
}
object Created {
  
  inline def apply(created: js.Array[String], deleted: js.Array[String], updated: js.Array[String]): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  extension [Self <: Created](x: Self) {
    
    inline def setCreated(value: js.Array[String]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedVarargs(value: String*): Self = StObject.set(x, "created", js.Array(value*))
    
    inline def setDeleted(value: js.Array[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedVarargs(value: String*): Self = StObject.set(x, "deleted", js.Array(value*))
    
    inline def setUpdated(value: js.Array[String]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedVarargs(value: String*): Self = StObject.set(x, "updated", js.Array(value*))
  }
}
