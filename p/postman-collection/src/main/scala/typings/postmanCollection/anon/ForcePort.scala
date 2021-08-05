package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForcePort extends StObject {
  
  var forcePort: Boolean
}
object ForcePort {
  
  inline def apply(forcePort: Boolean): ForcePort = {
    val __obj = js.Dynamic.literal(forcePort = forcePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePort]
  }
  
  extension [Self <: ForcePort](x: Self) {
    
    inline def setForcePort(value: Boolean): Self = StObject.set(x, "forcePort", value.asInstanceOf[js.Any])
  }
}
