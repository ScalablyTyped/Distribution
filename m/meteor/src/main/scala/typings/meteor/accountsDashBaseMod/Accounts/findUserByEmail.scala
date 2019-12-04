package typings.meteor.accountsDashBaseMod.Accounts

import typings.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.findUserByEmail")
@js.native
object findUserByEmail extends js.Object {
  def apply(email: String): js.UndefOr[User | Null] = js.native
}

