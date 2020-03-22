package typings.meteor.mod.Accounts

import typings.meteor.AnonProfile
import typings.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts.onCreateUser")
@js.native
object onCreateUser extends js.Object {
  def apply(func: js.Function2[/* options */ AnonProfile, /* user */ User_, Unit]): Unit = js.native
}

