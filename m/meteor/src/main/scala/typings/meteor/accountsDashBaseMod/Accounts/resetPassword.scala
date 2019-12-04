package typings.meteor.accountsDashBaseMod.Accounts

import typings.meteor.Meteor.TypedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.resetPassword")
@js.native
object resetPassword extends js.Object {
  def apply(token: String, newPassword: String): Unit = js.native
  def apply(
    token: String,
    newPassword: String,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
}

