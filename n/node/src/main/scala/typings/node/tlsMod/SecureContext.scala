package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureContext extends StObject {
  
  var context: js.Any = js.native
}
object SecureContext {
  
  @scala.inline
  def apply(context: js.Any): SecureContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureContext]
  }
  
  @scala.inline
  implicit class SecureContextMutableBuilder[Self <: SecureContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
