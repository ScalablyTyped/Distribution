package typings.msRestAzure.mod

import typings.msRest.mod.ServiceClientCredentials
import typings.msRest.mod.WebResource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "UserTokenCredentials")
@js.native
class UserTokenCredentials protected () extends ServiceClientCredentials {
  def this(
    clientId: String,
    domain: String,
    username: String,
    password: String,
    options: AzureTokenCredentialsOptions
  ) = this()
  /**
    * Gets the token from the cache. If the token is expired or about to be expired then it gets the new access token.
    * @param  {function} callback  The callback in the form (err, result)
    * @return {function} callback
    *                       {Error} [err]  The error if any
    *                       {object} [tokenResponse] The tokenResponse (tokenType and accessToken are the two important properties). 
    */
  def getToken(callback: js.Function2[/* err */ Error, /* result */ TokenResponse, Unit]): Unit = js.native
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  /* CompleteClass */
  override def signRequest(webResource: WebResource, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

