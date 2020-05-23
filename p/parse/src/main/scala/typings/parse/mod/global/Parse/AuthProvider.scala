package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface declaration for Authentication Providers
  * https://parseplatform.org/Parse-SDK-JS/api/master/AuthProvider.html
  */
trait AuthProvider extends js.Object {
  /**
    * (Optional) Called when service is unlinked. Handle any cleanup here.
    */
  var deauthenticate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when _linkWith isn't passed authData. Handle your own authentication here.
    */
  def authenticate(): Unit
  /**
    * Unique identifier for this Auth Provider.
    */
  def getAuthType(): String
  /**
    * Called when auth data is syncronized. Can be used to determine if authData is still valid
    */
  def restoreAuthentication(): Boolean
}

object AuthProvider {
  @scala.inline
  def apply(
    authenticate: () => Unit,
    getAuthType: () => String,
    restoreAuthentication: () => Boolean,
    deauthenticate: () => Unit = null
  ): AuthProvider = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getAuthType = js.Any.fromFunction0(getAuthType), restoreAuthentication = js.Any.fromFunction0(restoreAuthentication))
    if (deauthenticate != null) __obj.updateDynamic("deauthenticate")(js.Any.fromFunction0(deauthenticate))
    __obj.asInstanceOf[AuthProvider]
  }
}

