package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface declaration for Authentication Providers
  * https://parseplatform.org/Parse-SDK-JS/api/master/AuthProvider.html
  */
@js.native
trait AuthProvider extends StObject {
  
  /**
    * Called when _linkWith isn't passed authData. Handle your own authentication here.
    */
  def authenticate(): Unit = js.native
  
  /**
    * (Optional) Called when service is unlinked. Handle any cleanup here.
    */
  var deauthenticate: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  implicit class AuthProviderMutableBuilder[Self <: AuthProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticate(value: () => Unit): Self = StObject.set(x, "authenticate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeauthenticate(value: () => Unit): Self = StObject.set(x, "deauthenticate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeauthenticateUndefined: Self = StObject.set(x, "deauthenticate", js.undefined)
    
    @scala.inline
    def setGetAuthType(value: () => String): Self = StObject.set(x, "getAuthType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreAuthentication(value: () => Boolean): Self = StObject.set(x, "restoreAuthentication", js.Any.fromFunction0(value))
  }
}
