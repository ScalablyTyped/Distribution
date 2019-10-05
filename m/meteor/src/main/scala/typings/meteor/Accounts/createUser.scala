package typings.meteor.Accounts

import typings.meteor.Anon_Email
import typings.meteor.Meteor.TypedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.createUser")
@js.native
object createUser extends js.Object {
  def apply(options: Anon_Email): String = js.native
  def apply(
    options: Anon_Email,
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): String = js.native
}

