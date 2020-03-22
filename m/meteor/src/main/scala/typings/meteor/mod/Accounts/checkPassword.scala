package typings.meteor.mod.Accounts

import typings.meteor.AnonError
import typings.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts._checkPassword")
@js.native
object checkPassword extends js.Object {
  /**
    *
    * Check whether the provided password matches the bcrypt'ed password in
    * the database user record. `password` can be a string (in which case
    * it will be run through SHA256 before bcrypt) or an object with
    * properties `digest` and `algorithm` (in which case we bcrypt
    * `password.digest`).
    */
  def apply(user: User_, password: Password): AnonError = js.native
}

