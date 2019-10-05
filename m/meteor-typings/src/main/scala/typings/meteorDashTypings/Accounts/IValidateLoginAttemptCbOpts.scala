package typings.meteorDashTypings.Accounts

import typings.meteorDashTypings.Meteor.Connection
import typings.meteorDashTypings.Meteor.Error
import typings.meteorDashTypings.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidateLoginAttemptCbOpts extends js.Object {
  var allowed: Boolean
  var connection: Connection
  var error: Error
  var methodArguments: js.Array[_]
  var methodName: String
  var `type`: String
  var user: User
}

object IValidateLoginAttemptCbOpts {
  @scala.inline
  def apply(
    allowed: Boolean,
    connection: Connection,
    error: Error,
    methodArguments: js.Array[_],
    methodName: String,
    `type`: String,
    user: User
  ): IValidateLoginAttemptCbOpts = {
    val __obj = js.Dynamic.literal(allowed = allowed, connection = connection, error = error, methodArguments = methodArguments, methodName = methodName, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
  }
}

