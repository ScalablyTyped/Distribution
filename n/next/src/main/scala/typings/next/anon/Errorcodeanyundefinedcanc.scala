package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  code :any | undefined,   cancelled :boolean | undefined} */
trait Errorcodeanyundefinedcanc extends StObject {
  
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  /* standard es2022.error */
  var cause: js.UndefOr[Any] = js.undefined
  
  var code: js.UndefOr[Any] = js.undefined
  
  /* standard es5 */
  var message: String
  
  /* standard es5 */
  var name: String
  
  /* standard es5 */
  var stack: js.UndefOr[String] = js.undefined
}
object Errorcodeanyundefinedcanc {
  
  inline def apply(message: String, name: String): Errorcodeanyundefinedcanc = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcodeanyundefinedcanc]
  }
  
  extension [Self <: Errorcodeanyundefinedcanc](x: Self) {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
