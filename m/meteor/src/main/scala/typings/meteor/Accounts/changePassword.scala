package typings.meteor.Accounts

import typings.meteor.Meteor.TypedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.changePassword")
@js.native
object changePassword extends js.Object {
  def apply(oldPassword: String, newPassword: String): Unit = js.native
  def apply(
    oldPassword: String,
    newPassword: String,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
}

