package typings.meteor.mod.Accounts

import typings.meteor.AnonEmail
import typings.meteor.Meteor.TypedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.createUser")
@js.native
object createUser extends js.Object {
  def apply(options: AnonEmail): String = js.native
  def apply(
    options: AnonEmail,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): String = js.native
}

