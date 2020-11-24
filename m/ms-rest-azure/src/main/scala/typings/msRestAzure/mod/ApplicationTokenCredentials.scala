package typings.msRestAzure.mod

import typings.msRest.mod.ServiceClientCredentials
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "ApplicationTokenCredentials")
@js.native
class ApplicationTokenCredentials protected () extends ServiceClientCredentials {
  def this(clientId: String, domain: String, secret: String) = this()
  def this(clientId: String, domain: String, secret: String, options: AzureTokenCredentialsOptions) = this()
  
  /**
    * Gets the token.
    * @param  {function} callback  The callback in the form (err, result)
    * @return {function} callback
    *                       {Error} [err]  The error if any
    *                       {object} [tokenResponse] The tokenResponse (tokenType and accessToken are the two important properties). 
    */
  def getToken(callback: js.Function2[/* err */ Error, /* result */ TokenResponse, Unit]): Unit = js.native
}
