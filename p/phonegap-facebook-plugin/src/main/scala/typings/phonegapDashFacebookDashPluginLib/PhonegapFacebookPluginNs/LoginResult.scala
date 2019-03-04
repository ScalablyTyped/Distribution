package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Callback Results
/**
  * Result for the login() and getLoginStatus() success callbacks.
  */
trait LoginResult extends js.Object {
  var authResponse: phonegapDashFacebookDashPluginLib.Anon_AccessToken
  var status: java.lang.String
}

object LoginResult {
  @scala.inline
  def apply(authResponse: phonegapDashFacebookDashPluginLib.Anon_AccessToken, status: java.lang.String): LoginResult = {
    val __obj = js.Dynamic.literal(authResponse = authResponse, status = status)
  
    __obj.asInstanceOf[LoginResult]
  }
}

