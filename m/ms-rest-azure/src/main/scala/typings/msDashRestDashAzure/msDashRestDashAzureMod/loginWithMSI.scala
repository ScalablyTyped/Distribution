package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.Fn_CredentialsErrError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "loginWithMSI")
@js.native
object loginWithMSI extends js.Object {
  def apply(): js.Promise[MSIVmTokenCredentials] = js.native
  def apply(callback: Fn_CredentialsErrError): Unit = js.native
  def apply(options: MSIVmOptions): js.Promise[MSIVmTokenCredentials] = js.native
  def apply(options: MSIVmOptions, callback: Fn_CredentialsErrError): Unit = js.native
}

