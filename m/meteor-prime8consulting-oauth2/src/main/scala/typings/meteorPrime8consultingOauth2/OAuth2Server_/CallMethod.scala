package typings.meteorPrime8consultingOauth2.OAuth2Server_

import typings.meteor.Meteor.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ): Unit
}

object CallMethod {
  @scala.inline
  def apply(
    authCodeGrant: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Unit
  ): CallMethod = {
    val __obj = js.Dynamic.literal(authCodeGrant = js.Any.fromFunction6(authCodeGrant))
  
    __obj.asInstanceOf[CallMethod]
  }
}

