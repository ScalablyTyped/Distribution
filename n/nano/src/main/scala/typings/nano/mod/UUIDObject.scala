package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UUIDObject extends StObject {
  
  var uuids: js.Array[String]
}
object UUIDObject {
  
  inline def apply(uuids: js.Array[String]): UUIDObject = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UUIDObject] (val x: Self) extends AnyVal {
    
    inline def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value*))
  }
}
