package typings.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HemeraMessagePayload extends StObject {
  
  var error: js.Error | Null
  
  var meta: Any
  
  var request: Request$
  
  var result: Any
  
  var trace: Trace
}
object HemeraMessagePayload {
  
  inline def apply(meta: Any, request: Request$, result: Any, trace: Trace): HemeraMessagePayload = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[HemeraMessagePayload]
  }
  
  extension [Self <: HemeraMessagePayload](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request$): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTrace(value: Trace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
  }
}
