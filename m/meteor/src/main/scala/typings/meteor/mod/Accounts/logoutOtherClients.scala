package typings.meteor.mod.Accounts

import typings.meteor.Meteor.TypedError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.logoutOtherClients")
@js.native
object logoutOtherClients extends js.Object {
  def apply(): Unit = js.native
  def apply(
    callback: js.Function1[/* error */ js.UndefOr[Error | typings.meteor.Meteor.Error | TypedError], Unit]
  ): Unit = js.native
}

