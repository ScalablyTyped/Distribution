package typings.parse.mod.global.Parse

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAttributes extends StObject {
  
  var createdAt: Date
  
  var objectId: String
  
  var updatedAt: Date
}
object BaseAttributes {
  
  inline def apply(createdAt: Date, objectId: String, updatedAt: Date): BaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAttributes]
  }
  
  extension [Self <: BaseAttributes](x: Self) {
    
    inline def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
