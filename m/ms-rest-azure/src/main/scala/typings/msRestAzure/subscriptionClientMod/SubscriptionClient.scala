package typings.msRestAzure.subscriptionClientMod

import typings.msRest.mod.ServiceClientCredentials
import typings.msRestAzure.operationsMod.Subscriptions
import typings.msRestAzure.operationsMod.Tenants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionClient extends js.Object {
  var acceptLanguage: String = js.native
  var apiVersion: String = js.native
  var credentials: ServiceClientCredentials = js.native
  var generateClientRequestId: Boolean = js.native
  var longRunningOperationRetryTimeout: Double = js.native
  // Operation groups
  var subscriptions: Subscriptions = js.native
  var tenants: Tenants = js.native
}

object SubscriptionClient {
  @scala.inline
  def apply(
    acceptLanguage: String,
    apiVersion: String,
    credentials: ServiceClientCredentials,
    generateClientRequestId: Boolean,
    longRunningOperationRetryTimeout: Double,
    subscriptions: Subscriptions,
    tenants: Tenants
  ): SubscriptionClient = {
    val __obj = js.Dynamic.literal(acceptLanguage = acceptLanguage.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], generateClientRequestId = generateClientRequestId.asInstanceOf[js.Any], longRunningOperationRetryTimeout = longRunningOperationRetryTimeout.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionClient]
  }
  @scala.inline
  implicit class SubscriptionClientOps[Self <: SubscriptionClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptLanguage(value: String): Self = this.set("acceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: ServiceClientCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateClientRequestId(value: Boolean): Self = this.set("generateClientRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongRunningOperationRetryTimeout(value: Double): Self = this.set("longRunningOperationRetryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptions(value: Subscriptions): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenants(value: Tenants): Self = this.set("tenants", value.asInstanceOf[js.Any])
  }
  
}

