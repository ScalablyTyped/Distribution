package typings.meteor.mod.Accounts

import typings.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.findUserByUsername")
@js.native
object findUserByUsername extends js.Object {
  def apply(username: String): js.UndefOr[User_ | Null] = js.native
}

