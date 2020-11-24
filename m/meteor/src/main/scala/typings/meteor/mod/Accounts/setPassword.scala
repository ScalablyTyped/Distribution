package typings.meteor.mod.Accounts

import typings.meteor.anon.Logout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/accounts-base", "Accounts.setPassword")
@js.native
object setPassword extends js.Object {
  
  def apply(userId: String, newPassword: String): Unit = js.native
  def apply(userId: String, newPassword: String, options: Logout): Unit = js.native
}
