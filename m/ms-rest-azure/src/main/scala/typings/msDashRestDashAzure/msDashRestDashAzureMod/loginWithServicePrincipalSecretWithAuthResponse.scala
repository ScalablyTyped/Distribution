package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "loginWithServicePrincipalSecretWithAuthResponse")
@js.native
object loginWithServicePrincipalSecretWithAuthResponse extends js.Object {
  def apply(clientId: String, secret: String, domain: String): js.Promise[AuthResponse] = js.native
  def apply(clientId: String, secret: String, domain: String, options: AzureTokenCredentialsOptions): js.Promise[AuthResponse] = js.native
}

