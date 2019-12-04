package typings.msDashRestDashAzure.libSubscriptionManagementSubscriptionClientMod

import typings.msDashRest.msDashRestMod.ServiceClientCredentials
import typings.msDashRestDashAzure.libSubscriptionManagementOperationsMod.Subscriptions
import typings.msDashRestDashAzure.libSubscriptionManagementOperationsMod.Tenants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionClient extends js.Object {
  var acceptLanguage: String
  var apiVersion: String
  var credentials: ServiceClientCredentials
  var generateClientRequestId: Boolean
  var longRunningOperationRetryTimeout: Double
  // Operation groups
  var subscriptions: Subscriptions
  var tenants: Tenants
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
}

