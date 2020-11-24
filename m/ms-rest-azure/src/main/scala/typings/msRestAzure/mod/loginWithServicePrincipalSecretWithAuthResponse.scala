package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "loginWithServicePrincipalSecretWithAuthResponse")
@js.native
object loginWithServicePrincipalSecretWithAuthResponse extends js.Object {
  
  def apply(clientId: String, secret: String, domain: String): js.Promise[AuthResponse] = js.native
  def apply(clientId: String, secret: String, domain: String, options: AzureTokenCredentialsOptions): js.Promise[AuthResponse] = js.native
}
