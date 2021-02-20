package typings.msRestAzure.mod

import typings.msRestAzure.msRestAzureNumbers.`50342`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "MSIVmTokenCredentials")
@js.native
/**
  * Authenticates using the identity service running on an Azure virtual machine.
  * This method makes a request to the authentication service hosted on the VM
  * and gets back an access token.
  * 
  * @param {MSIVmOptions} [options] - Optional parameters.
  */
class MSIVmTokenCredentials () extends MSITokenCredentials {
  def this(options: MSIOptions) = this()
  
  /**
    * @property {number} [port] port on which the MSI service is running on the host VM. Default port is 50342 
    */
  var port: js.UndefOr[`50342`] = js.native
}
