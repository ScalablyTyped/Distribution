package typings.msRestAzure.mod

import typings.msRest.mod.WebResource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "MSITokenCredentials")
@js.native
/**
  * Authenticates using the identity service.
  * 
  * @param {MSIOptions} [options] - Optional parameters.
  */
class MSITokenCredentials () extends js.Object {
  def this(options: MSIOptions) = this()
  
  /**
    * Prepares and sends a POST request to a service endpoint hosted on the Azure VM, which responds with the access token.
    * @param  {function} callback  The callback in the form (err, result)
    * @return {function} callback
    *                       {Error} [err]  The error if any
    *                       {object} [tokenResponse] The tokenResponse (tokenType and accessToken are the two important properties). 
    */
  def getToken(callback: js.Function2[/* error */ Error, /* result */ TokenResponse, Unit]): Unit = js.native
  
  /**
    * @property {string} resource - The resource uri or token audience for which the token is needed.
    * Default is: "https://management.azure.com/"
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * Signs a request with the Authentication header.
    *
    * @param {webResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    * @return {undefined}
    */
  def signRequest(webResource: WebResource, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
