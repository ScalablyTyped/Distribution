package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.Fn_CredentialsErrSubscriptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "loginWithServicePrincipalSecret")
@js.native
object loginWithServicePrincipalSecret extends js.Object {
  def apply(clientId: String, secret: String, domain: String): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(clientId: String, secret: String, domain: String, callback: Fn_CredentialsErrSubscriptions): Unit = js.native
  def apply(clientId: String, secret: String, domain: String, options: AzureTokenCredentialsOptions): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(
    clientId: String,
    secret: String,
    domain: String,
    options: AzureTokenCredentialsOptions,
    callback: Fn_CredentialsErrSubscriptions
  ): Unit = js.native
}

