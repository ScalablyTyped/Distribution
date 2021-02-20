package typings.msRestAzure.mod

import typings.msRestAzure.msRestAzureStrings.`2017-09-01`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "MSIAppServiceTokenCredentials")
@js.native
/**
  * Authenticates using the identity service running on an Azure virtual machine.
  * This method makes a request to the authentication service hosted on the VM
  * and gets back an access token.
  * 
  * @param {MSIAppServiceOptions} [options] - Optional parameters.
  */
class MSIAppServiceTokenCredentials () extends MSITokenCredentials {
  def this(options: MSIAppServiceOptions) = this()
  
  /**
    * @property {string} [msiApiVersion] The api-version of the local MSI agent. Default value is "2017-09-01".
    */
  var msiApiVersion: js.UndefOr[`2017-09-01`] = js.native
  
  /**
    * @property {string} msiEndpoint - The local URL from which your app can request tokens.
    * Either provide this parameter or set the environment varaible `MSI_ENDPOINT`.
    * For example: `MSI_ENDPOINT="http://127.0.0.1:41741/MSI/token/"`
    */
  var msiEndpoint: js.UndefOr[String] = js.native
  
  /**
    * @property {string} msiSecret - The secret used in communication between your code and the local MSI agent.
    * Either provide this parameter or set the environment varaible `MSI_SECRET`.
    * For example: `MSI_SECRET="69418689F1E342DD946CB82994CDA3CB"`
    */
  var msiSecret: js.UndefOr[String] = js.native
}
