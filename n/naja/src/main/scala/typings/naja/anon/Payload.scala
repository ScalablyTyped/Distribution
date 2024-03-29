package typings.naja.anon

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var options: typings.naja.distNajaMod.Options
  
  var payload: js.UndefOr[typings.naja.distNajaMod.Payload] = js.undefined
  
  var request: typings.std.Request
  
  var response: js.UndefOr[Response] = js.undefined
}
object Payload {
  
  inline def apply(options: typings.naja.distNajaMod.Options, request: typings.std.Request): Payload = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOptions(value: typings.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: typings.naja.distNajaMod.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
