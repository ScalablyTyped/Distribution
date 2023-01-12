package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataInput extends StObject {
  
  var online: Boolean
  
  var uuid: String
  
  var x: Double
  
  var y: Double
}
object DataInput {
  
  inline def apply(online: Boolean, uuid: String, x: Double, y: Double): DataInput = {
    val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataInput] (val x: Self) extends AnyVal {
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
