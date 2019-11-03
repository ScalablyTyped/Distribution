package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthResponse extends js.Object {
  var credentials: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials
  var subscriptions: js.Array[LinkedSubscription]
}

object AuthResponse {
  @scala.inline
  def apply(
    credentials: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials,
    subscriptions: js.Array[LinkedSubscription]
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], subscriptions = subscriptions)
  
    __obj.asInstanceOf[AuthResponse]
  }
}

