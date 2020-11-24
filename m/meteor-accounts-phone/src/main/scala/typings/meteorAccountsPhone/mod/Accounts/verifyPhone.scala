package typings.meteorAccountsPhone.mod.Accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/accounts-base", "Accounts.verifyPhone")
@js.native
object verifyPhone extends js.Object {
  
  def apply(phone: String, code: String): Unit = js.native
  def apply(phone: String, code: String, newPassword: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def apply(phone: String, code: String, newPassword: String): Unit = js.native
  def apply(phone: String, code: String, newPassword: String, callback: js.Function): Unit = js.native
  def apply(phone: String, code: String, newPassword: js.Function): Unit = js.native
  def apply(phone: String, code: String, newPassword: js.Function, callback: js.Function): Unit = js.native
}
