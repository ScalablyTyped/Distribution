package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureContext extends StObject {
  
  var context: js.Any
}
object SecureContext {
  
  inline def apply(context: js.Any): SecureContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureContext]
  }
  
  extension [Self <: SecureContext](x: Self) {
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
