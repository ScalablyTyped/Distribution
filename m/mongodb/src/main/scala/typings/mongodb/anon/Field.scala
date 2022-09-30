package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /** The name of the truncated field. */
  var field: String
  
  /** The number of elements in the truncated array. */
  var newSize: Double
}
object Field {
  
  inline def apply(field: String, newSize: Double): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setNewSize(value: Double): Self = StObject.set(x, "newSize", value.asInstanceOf[js.Any])
  }
}
