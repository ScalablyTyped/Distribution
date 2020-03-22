package typings.meteor.Accounts

import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts.onLogout")
@js.native
object onLogout extends js.Object {
  def apply(func: js.Function): Unit = js.native
  def apply(func: js.Function2[/* user */ User_, /* connection */ Connection, Unit]): Unit = js.native
}

