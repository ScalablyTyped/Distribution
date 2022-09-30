package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSessionId extends StObject {
  
  var id: typings.bson.mod.Binary
}
object ServerSessionId {
  
  inline def apply(id: typings.bson.mod.Binary): ServerSessionId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSessionId]
  }
  
  extension [Self <: ServerSessionId](x: Self) {
    
    inline def setId(value: typings.bson.mod.Binary): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
