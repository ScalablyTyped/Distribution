package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  code :any,   cancelled :boolean} */
trait Errorcodeanycancelledbool extends StObject {
  
  var cancelled: Boolean
  
  var code: js.Any
  
  var message: String
  
  var name: String
  
  var stack: js.UndefOr[String] = js.undefined
}
object Errorcodeanycancelledbool {
  
  inline def apply(cancelled: Boolean, code: js.Any, message: String, name: String): Errorcodeanycancelledbool = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcodeanycancelledbool]
  }
  
  extension [Self <: Errorcodeanycancelledbool](x: Self) {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCode(value: js.Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
