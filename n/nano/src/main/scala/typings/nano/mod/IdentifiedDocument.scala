package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifiedDocument extends StObject {
  
  var _id: String
}
object IdentifiedDocument {
  
  inline def apply(_id: String): IdentifiedDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiedDocument]
  }
  
  extension [Self <: IdentifiedDocument](x: Self) {
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
