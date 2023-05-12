package typings.oojsUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Off extends StObject {
  
  var off: js.Array[String]
  
  var on: js.Array[String]
}
object Off {
  
  inline def apply(off: js.Array[String], on: js.Array[String]): Off = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[Off]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Off] (val x: Self) extends AnyVal {
    
    inline def setOff(value: js.Array[String]): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    inline def setOffVarargs(value: String*): Self = StObject.set(x, "off", js.Array(value*))
    
    inline def setOn(value: js.Array[String]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnVarargs(value: String*): Self = StObject.set(x, "on", js.Array(value*))
  }
}
