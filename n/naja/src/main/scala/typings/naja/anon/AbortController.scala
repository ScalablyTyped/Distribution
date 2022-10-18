package typings.naja.anon

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortController extends StObject {
  
  var abortController: typings.std.AbortController
  
  var options: typings.naja.distNajaMod.Options
  
  var promise: js.Promise[Response]
  
  var request: typings.std.Request
}
object AbortController {
  
  inline def apply(
    abortController: typings.std.AbortController,
    options: typings.naja.distNajaMod.Options,
    promise: js.Promise[Response],
    request: typings.std.Request
  ): AbortController = {
    val __obj = js.Dynamic.literal(abortController = abortController.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
  
  extension [Self <: AbortController](x: Self) {
    
    inline def setAbortController(value: typings.std.AbortController): Self = StObject.set(x, "abortController", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: js.Promise[Response]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
