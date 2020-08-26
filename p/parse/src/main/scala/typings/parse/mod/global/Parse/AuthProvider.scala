package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface declaration for Authentication Providers
  * https://parseplatform.org/Parse-SDK-JS/api/master/AuthProvider.html
  */
@js.native
trait AuthProvider extends js.Object {
  /**
    * (Optional) Called when service is unlinked. Handle any cleanup here.
    */
  var deauthenticate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when _linkWith isn't passed authData. Handle your own authentication here.
    */
  def authenticate(): Unit = js.native
  /**
    * Unique identifier for this Auth Provider.
    */
  def getAuthType(): String = js.native
  /**
    * Called when auth data is syncronized. Can be used to determine if authData is still valid
    */
  def restoreAuthentication(): Boolean = js.native
}

object AuthProvider {
  @scala.inline
  def apply(authenticate: () => Unit, getAuthType: () => String, restoreAuthentication: () => Boolean): AuthProvider = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getAuthType = js.Any.fromFunction0(getAuthType), restoreAuthentication = js.Any.fromFunction0(restoreAuthentication))
    __obj.asInstanceOf[AuthProvider]
  }
  @scala.inline
  implicit class AuthProviderOps[Self <: AuthProvider] (val x: Self) extends AnyVal {
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
    def setAuthenticate(value: () => Unit): Self = this.set("authenticate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAuthType(value: () => String): Self = this.set("getAuthType", js.Any.fromFunction0(value))
    @scala.inline
    def setRestoreAuthentication(value: () => Boolean): Self = this.set("restoreAuthentication", js.Any.fromFunction0(value))
    @scala.inline
    def setDeauthenticate(value: () => Unit): Self = this.set("deauthenticate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDeauthenticate: Self = this.set("deauthenticate", js.undefined)
  }
  
}

