package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServersChanged extends StObject {
  
  val added: js.Array[String]
  
  val deleted: js.Array[String]
}
object ServersChanged {
  
  inline def apply(added: js.Array[String], deleted: js.Array[String]): ServersChanged = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServersChanged]
  }
  
  extension [Self <: ServersChanged](x: Self) {
    
    inline def setAdded(value: js.Array[String]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: String*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setDeleted(value: js.Array[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedVarargs(value: String*): Self = StObject.set(x, "deleted", js.Array(value*))
  }
}
