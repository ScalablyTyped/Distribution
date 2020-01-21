package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import typings.phonegapFacebookPlugin.AnonAccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Callback Results
/**
  * Result for the login() and getLoginStatus() success callbacks.
  */
trait LoginResult extends js.Object {
  var authResponse: AnonAccessToken
  var status: String
}

object LoginResult {
  @scala.inline
  def apply(authResponse: AnonAccessToken, status: String): LoginResult = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginResult]
  }
}

