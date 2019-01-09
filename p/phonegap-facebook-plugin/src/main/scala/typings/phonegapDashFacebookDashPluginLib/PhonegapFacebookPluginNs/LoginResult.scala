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

