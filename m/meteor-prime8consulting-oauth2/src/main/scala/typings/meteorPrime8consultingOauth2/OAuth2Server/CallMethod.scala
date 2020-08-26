package typings.meteorPrime8consultingOauth2.OAuth2Server

import typings.meteor.Meteor.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallMethod extends js.Object {
  /**
    * Wrapper for Meteor.method to create an authorization code. This is an async function and a callback must be provided to be of any use.
    */
  def authCodeGrant(
    client_id: String,
    redirect_uri: String,
    response_type: String,
    scope: js.Array[String],
    state: String,
    callback: js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]
  ): Unit = js.native
}

object CallMethod {
  @scala.inline
  def apply(
    authCodeGrant: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Unit
  ): CallMethod = {
    val __obj = js.Dynamic.literal(authCodeGrant = js.Any.fromFunction6(authCodeGrant))
    __obj.asInstanceOf[CallMethod]
  }
  @scala.inline
  implicit class CallMethodOps[Self <: CallMethod] (val x: Self) extends AnyVal {
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
    def setAuthCodeGrant(
      value: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Unit
    ): Self = this.set("authCodeGrant", js.Any.fromFunction6(value))
  }
  
}

