package typings.msRestAzure.mod

import typings.msRest.mod.ServiceCallback
import typings.msRest.mod.ServiceClientCredentials
import typings.msRest.mod.WebResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "KeyVaultCredentials")
@js.native
open class KeyVaultCredentials protected ()
  extends StObject
     with ServiceClientCredentials {
  def this(
    authenticator: js.Function2[/* challenge */ js.Object, /* callback */ Any, Any],
    credentials: js.Object
  ) = this()
  
  def addChallengeToCache(webResource: WebResource, challenge: js.Object): Unit = js.native
  
  def createSigningFilter(): js.Function3[
    /* resource */ WebResource, 
    /* next */ js.Function, 
    /* callback */ ServiceCallback[Any], 
    Any
  ] = js.native
  
  def getCachedChallenge(webResource: WebResource): js.Object = js.native
  
  def handleUnauthorized(
    webResource: WebResource,
    next: js.Function,
    err: js.Error,
    response: js.Object,
    body: Any,
    callback: ServiceCallback[Any]
  ): Any = js.native
  
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  /* CompleteClass */
  override def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
