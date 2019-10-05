package typings.meteor.Accounts

import typings.meteor.Anon_Error
import typings.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Accounts._checkPassword")
@js.native
object _checkPassword extends js.Object {
  /**
    *
    * Check whether the provided password matches the bcrypt'ed password in
    * the database user record. `password` can be a string (in which case
    * it will be run through SHA256 before bcrypt) or an object with
    * properties `digest` and `algorithm` (in which case we bcrypt
    * `password.digest`).
    */
  def apply(user: User, password: Password): Anon_Error = js.native
}

