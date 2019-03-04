package typings
package meteorDashTypingsLib.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidateLoginAttemptCbOpts extends js.Object {
  var allowed: scala.Boolean
  var connection: meteorDashTypingsLib.MeteorNs.Connection
  var error: meteorDashTypingsLib.MeteorNs.Error
  var methodArguments: js.Array[_]
  var methodName: java.lang.String
  var `type`: java.lang.String
  var user: meteorDashTypingsLib.MeteorNs.User
}

object IValidateLoginAttemptCbOpts {
  @scala.inline
  def apply(
    allowed: scala.Boolean,
    connection: meteorDashTypingsLib.MeteorNs.Connection,
    error: meteorDashTypingsLib.MeteorNs.Error,
    methodArguments: js.Array[_],
    methodName: java.lang.String,
    `type`: java.lang.String,
    user: meteorDashTypingsLib.MeteorNs.User
  ): IValidateLoginAttemptCbOpts = {
    val __obj = js.Dynamic.literal(allowed = allowed, connection = connection, error = error, methodArguments = methodArguments, methodName = methodName, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
  }
}

