package typings.meteor.mod.Accounts

import typings.meteor.Meteor.TypedError
import typings.meteor.anon.EmailString
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: EmailString): Unit = js.native
  def apply(
    options: EmailString,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
}

