package typings.naja.anon

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: typings.naja.najaMod.Options
  
  var payload: typings.naja.najaMod.Payload
  
  var request: typings.std.Request
  
  var response: Response
}
object Options {
  
  inline def apply(
    options: typings.naja.najaMod.Options,
    payload: typings.naja.najaMod.Payload,
    request: typings.std.Request,
    response: Response
  ): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: typings.naja.najaMod.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
