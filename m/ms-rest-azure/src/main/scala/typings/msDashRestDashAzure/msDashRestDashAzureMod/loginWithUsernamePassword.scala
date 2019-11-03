package typings.msDashRestDashAzure.msDashRestDashAzureMod

import typings.msDashRestDashAzure.Fn_CredentialsErr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "loginWithUsernamePassword")
@js.native
object loginWithUsernamePassword extends js.Object {
  def apply(username: String, password: String): js.Promise[UserTokenCredentials] = js.native
  def apply(username: String, password: String, callback: Fn_CredentialsErr): Unit = js.native
  def apply(username: String, password: String, options: LoginWithUsernamePasswordOptions): js.Promise[UserTokenCredentials] = js.native
  def apply(
    username: String,
    password: String,
    options: LoginWithUsernamePasswordOptions,
    callback: Fn_CredentialsErr
  ): Unit = js.native
}

