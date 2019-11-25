package typings.phonegapDashFacebookDashPlugin.PhonegapFacebookPlugin

import typings.phonegapDashFacebookDashPlugin.Anon_AccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Callback Results
/**
  * Result for the login() and getLoginStatus() success callbacks.
  */
trait LoginResult extends js.Object {
  var authResponse: Anon_AccessToken
  var status: String
}

object LoginResult {
  @scala.inline
  def apply(authResponse: Anon_AccessToken, status: String): LoginResult = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginResult]
  }
}

