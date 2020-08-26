package typings.meteor.mod.Accounts

import typings.meteor.Meteor.TypedError
import typings.meteor.anon.`0`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.forgotPassword")
@js.native
object forgotPassword extends js.Object {
  def apply(options: `0`): Unit = js.native
  def apply(
    options: `0`,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
}

