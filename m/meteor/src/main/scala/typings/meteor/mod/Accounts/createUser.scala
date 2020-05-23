package typings.meteor.mod.Accounts

import typings.meteor.Meteor.TypedError
import typings.meteor.anon.Email
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.createUser")
@js.native
object createUser extends js.Object {
  def apply(options: Email): String = js.native
  def apply(
    options: Email,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): String = js.native
}

