package typings.next.anon

import typings.next.nextStrings.`edge-server`
import typings.next.nextStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  statusCode :number | undefined,   source :'server' | 'edge-server' | undefined} */
trait ErrorstatusCodenumberunde extends StObject {
  
  /* standard es2022.error */
  var cause: js.UndefOr[Any] = js.undefined
  
  /* standard es5 */
  var message: String
  
  /* standard es5 */
  var name: String
  
  var source: js.UndefOr[server | `edge-server`] = js.undefined
  
  /* standard es5 */
  var stack: js.UndefOr[String] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
}
object ErrorstatusCodenumberunde {
  
  inline def apply(message: String, name: String): ErrorstatusCodenumberunde = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorstatusCodenumberunde]
  }
  
  extension [Self <: ErrorstatusCodenumberunde](x: Self) {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: server | `edge-server`): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
