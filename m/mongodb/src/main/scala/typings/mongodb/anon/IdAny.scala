package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdAny extends StObject {
  
  var _id: js.Any
}
object IdAny {
  
  inline def apply(_id: js.Any): IdAny = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAny]
  }
  
  extension [Self <: IdAny](x: Self) {
    
    inline def set_id(value: js.Any): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
