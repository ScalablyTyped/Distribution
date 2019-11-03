package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.Fn_Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "interactiveLogin")
@js.native
object interactiveLogin extends js.Object {
  def apply(): js.Promise[DeviceTokenCredentials] = js.native
  def apply(optionalCallback: Fn_Credentials): Unit = js.native
  def apply(options: InteractiveLoginOptions): js.Promise[DeviceTokenCredentials] = js.native
  def apply(options: InteractiveLoginOptions, optionalCallback: Fn_Credentials): Unit = js.native
}

