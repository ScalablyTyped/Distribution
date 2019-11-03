package typings.msDashRestDashAzure

import typings.msDashRestDashAzure.msDashRestDashAzureMod.DeviceTokenCredentials
import typings.msDashRestDashAzure.msDashRestDashAzureMod.LinkedSubscription
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Credentials extends js.Object {
  def apply(err: Error, credentials: DeviceTokenCredentials, subscriptions: js.Array[LinkedSubscription]): Unit = js.native
}

