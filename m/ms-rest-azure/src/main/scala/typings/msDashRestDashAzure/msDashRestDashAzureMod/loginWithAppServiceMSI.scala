package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.Fn_CredentialsErrErrorMSIAppServiceTokenCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "loginWithAppServiceMSI")
@js.native
object loginWithAppServiceMSI extends js.Object {
  def apply(): js.Promise[MSIAppServiceTokenCredentials] = js.native
  def apply(callback: Fn_CredentialsErrErrorMSIAppServiceTokenCredentials): Unit = js.native
  def apply(options: MSIAppServiceOptions): js.Promise[MSIAppServiceTokenCredentials] = js.native
  def apply(options: MSIAppServiceOptions, callback: Fn_CredentialsErrErrorMSIAppServiceTokenCredentials): Unit = js.native
}

