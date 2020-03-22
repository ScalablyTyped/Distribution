package typings.meteor.mod.Accounts

import typings.meteor.AnonEmailString
import typings.meteor.Meteor.TypedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: AnonEmailString): Unit = js.native
  def apply(
    options: AnonEmailString,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
}

