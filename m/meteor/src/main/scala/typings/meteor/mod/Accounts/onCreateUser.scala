package typings.meteor.mod.Accounts

import typings.meteor.Meteor.User
import typings.meteor.anon.Profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/accounts-base", "Accounts.onCreateUser")
@js.native
object onCreateUser extends js.Object {
  
  def apply(func: js.Function2[/* options */ Profile, /* user */ User, Unit]): Unit = js.native
}
