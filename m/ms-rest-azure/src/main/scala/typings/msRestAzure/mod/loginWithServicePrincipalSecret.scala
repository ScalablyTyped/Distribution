package typings.msRestAzure.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "loginWithServicePrincipalSecret")
@js.native
object loginWithServicePrincipalSecret extends js.Object {
  
  def apply(clientId: String, secret: String, domain: String): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(
    clientId: String,
    secret: String,
    domain: String,
    callback: js.Function3[
      /* err */ Error, 
      /* credentials */ ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
  def apply(clientId: String, secret: String, domain: String, options: AzureTokenCredentialsOptions): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(
    clientId: String,
    secret: String,
    domain: String,
    options: AzureTokenCredentialsOptions,
    callback: js.Function3[
      /* err */ Error, 
      /* credentials */ ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
}
