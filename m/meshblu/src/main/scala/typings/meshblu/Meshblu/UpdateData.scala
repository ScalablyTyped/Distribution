package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateData extends StObject {
  
  var color: String
  
  var uuid: String
}
object UpdateData {
  
  inline def apply(color: String, uuid: String): UpdateData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateData] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
