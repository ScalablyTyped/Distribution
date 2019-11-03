package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.Fn_CredentialsErrSubscriptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "loginWithAuthFile")
@js.native
object loginWithAuthFile extends js.Object {
  def apply(): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(callback: Fn_CredentialsErrSubscriptions): Unit = js.native
  def apply(options: AuthFileOptions): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(options: AuthFileOptions, callback: Fn_CredentialsErrSubscriptions): Unit = js.native
}

