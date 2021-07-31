package typings.natsHemera.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HemeraMessagePayload extends StObject {
  
  var error: Error | Null
  
  var meta: js.Any
  
  var request: Request$
  
  var result: js.Any
  
  var trace: Trace
}
object HemeraMessagePayload {
  
  @scala.inline
  def apply(meta: js.Any, request: Request$, result: js.Any, trace: Trace): HemeraMessagePayload = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[HemeraMessagePayload]
  }
  
  @scala.inline
  implicit class HemeraMessagePayloadMutableBuilder[Self <: HemeraMessagePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Request$): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: Trace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
  }
}
