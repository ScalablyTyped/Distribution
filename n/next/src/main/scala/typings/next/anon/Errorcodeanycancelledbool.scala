package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  code :any,   cancelled :boolean} */
@js.native
trait Errorcodeanycancelledbool extends StObject {
  
  var cancelled: Boolean = js.native
  
  var code: js.Any = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object Errorcodeanycancelledbool {
  
  @scala.inline
  def apply(cancelled: Boolean, code: js.Any, message: String, name: String): Errorcodeanycancelledbool = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcodeanycancelledbool]
  }
  
  @scala.inline
  implicit class ErrorcodeanycancelledboolMutableBuilder[Self <: Errorcodeanycancelledbool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: js.Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
