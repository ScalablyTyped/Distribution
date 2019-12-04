package typings.meteor.accountsDashBaseMod.Accounts

import typings.meteor.Anon_Logout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.setPassword")
@js.native
object setPassword extends js.Object {
  def apply(userId: String, newPassword: String): Unit = js.native
  def apply(userId: String, newPassword: String, options: Anon_Logout): Unit = js.native
}

