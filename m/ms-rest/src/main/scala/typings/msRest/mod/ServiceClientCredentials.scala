package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceClientCredentials extends StObject {
  
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit
}
object ServiceClientCredentials {
  
  inline def apply(signRequest: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Unit): ServiceClientCredentials = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
    __obj.asInstanceOf[ServiceClientCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceClientCredentials] (val x: Self) extends AnyVal {
    
    inline def setSignRequest(value: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Unit): Self = StObject.set(x, "signRequest", js.Any.fromFunction2(value))
  }
}
