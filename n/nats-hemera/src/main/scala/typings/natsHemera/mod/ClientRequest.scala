package typings.natsHemera.mod

import typings.natsHemera.anon.ExpectedMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequest extends StObject {
  
  var error: js.Error
  
  var pattern: ClientPattern
  
  var payload: HemeraMessagePayload
  
  var transport: ExpectedMessages
}
object ClientRequest {
  
  inline def apply(
    error: js.Error,
    pattern: ClientPattern,
    payload: HemeraMessagePayload,
    transport: ExpectedMessages
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
  
  extension [Self <: ClientRequest](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: ClientPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: HemeraMessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: ExpectedMessages): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}
