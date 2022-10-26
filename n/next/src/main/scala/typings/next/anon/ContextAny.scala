package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextAny extends StObject {
  
  var context: Any
}
object ContextAny {
  
  inline def apply(context: Any): ContextAny = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextAny]
  }
  
  extension [Self <: ContextAny](x: Self) {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
