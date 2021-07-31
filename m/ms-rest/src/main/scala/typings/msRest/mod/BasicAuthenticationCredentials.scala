package typings.msRest.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest", "BasicAuthenticationCredentials")
@js.native
class BasicAuthenticationCredentials protected ()
  extends StObject
     with ServiceClientCredentials {
  def this(userName: String, password: String) = this()
  def this(userName: String, password: String, authorizationScheme: String) = this()
  
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  /* CompleteClass */
  override def signRequest(webResource: WebResource, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
