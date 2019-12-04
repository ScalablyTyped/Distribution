package typings.meteor.accountsDashBaseMod.Accounts

import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.onLogout")
@js.native
object onLogout extends js.Object {
  def apply(func: js.Function): Unit = js.native
  def apply(func: js.Function2[/* user */ User, /* connection */ Connection, Unit]): Unit = js.native
}

