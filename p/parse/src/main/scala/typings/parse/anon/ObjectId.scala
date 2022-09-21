package typings.parse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectId extends StObject {
  
  var objectId: js.UndefOr[String] = js.undefined
}
object ObjectId {
  
  inline def apply(): ObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectId]
  }
  
  extension [Self <: ObjectId](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
