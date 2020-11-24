package typings.meteor.mod.Accounts

import typings.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/accounts-base", "Accounts.findUserByUsername")
@js.native
object findUserByUsername extends js.Object {
  
  def apply(username: String): js.UndefOr[User | Null] = js.native
}
