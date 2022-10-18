package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevBoolean extends StObject {
  
  var dev: Boolean
}
object DevBoolean {
  
  inline def apply(dev: Boolean): DevBoolean = {
    val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevBoolean]
  }
  
  extension [Self <: DevBoolean](x: Self) {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
  }
}
