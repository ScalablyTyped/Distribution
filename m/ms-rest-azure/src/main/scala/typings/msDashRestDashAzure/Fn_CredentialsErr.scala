package typings.msDashRestDashAzure

import typings.msDashRestDashAzure.msDashRestDashAzureMod.LinkedSubscription
import typings.msDashRestDashAzure.msDashRestDashAzureMod.UserTokenCredentials
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CredentialsErr extends js.Object {
  def apply(err: Error, credentials: UserTokenCredentials, subscriptions: js.Array[LinkedSubscription]): Unit = js.native
}

