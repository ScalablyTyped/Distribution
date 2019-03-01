package typings
package meteorLib.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidateLoginAttemptCbOpts extends js.Object {
  var allowed: scala.Boolean
  var connection: meteorLib.MeteorNs.Connection
  var error: meteorLib.MeteorNs.Error
  var methodArguments: js.Array[_]
  var methodName: java.lang.String
  var `type`: java.lang.String
  var user: meteorLib.MeteorNs.User
}

object IValidateLoginAttemptCbOpts {
  @scala.inline
  def apply(
    allowed: scala.Boolean,
    connection: meteorLib.MeteorNs.Connection,
    error: meteorLib.MeteorNs.Error,
    methodArguments: js.Array[_],
    methodName: java.lang.String,
    `type`: java.lang.String,
    user: meteorLib.MeteorNs.User
  ): IValidateLoginAttemptCbOpts = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("allowed")(allowed)
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("methodArguments")(methodArguments)
    __obj.updateDynamic("methodName")(methodName)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
  }
}

