package typings.meteor.Accounts

import typings.meteor.Meteor.Connection
import typings.meteor.Meteor.Error
import typings.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidateLoginAttemptCbOpts extends js.Object {
  var allowed: Boolean = js.native
  var connection: Connection = js.native
  var error: Error = js.native
  var methodArguments: js.Array[_] = js.native
  var methodName: String = js.native
  var `type`: String = js.native
  var user: User = js.native
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
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], methodArguments = methodArguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidateLoginAttemptCbOpts]
  }
  @scala.inline
  implicit class IValidateLoginAttemptCbOptsOps[Self <: IValidateLoginAttemptCbOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowed(value: Boolean): Self = this.set("allowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodArgumentsVarargs(value: js.Any*): Self = this.set("methodArguments", js.Array(value :_*))
    @scala.inline
    def setMethodArguments(value: js.Array[_]): Self = this.set("methodArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

