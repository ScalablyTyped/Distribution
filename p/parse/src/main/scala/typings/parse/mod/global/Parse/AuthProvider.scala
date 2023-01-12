package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface declaration for Authentication Providers
  * https://parseplatform.org/Parse-SDK-JS/api/master/AuthProvider.html
  */
trait AuthProvider extends StObject {
  
  /**
    * Called when _linkWith isn't passed authData. Handle your own authentication here.
    */
  def authenticate(): Unit
  
  /**
    * (Optional) Called when service is unlinked. Handle any cleanup here.
    */
  var deauthenticate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
  
  inline def apply(authenticate: () => Unit, getAuthType: () => String, restoreAuthentication: () => Boolean): AuthProvider = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getAuthType = js.Any.fromFunction0(getAuthType), restoreAuthentication = js.Any.fromFunction0(restoreAuthentication))
    __obj.asInstanceOf[AuthProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthProvider] (val x: Self) extends AnyVal {
    
    inline def setAuthenticate(value: () => Unit): Self = StObject.set(x, "authenticate", js.Any.fromFunction0(value))
    
    inline def setDeauthenticate(value: () => Unit): Self = StObject.set(x, "deauthenticate", js.Any.fromFunction0(value))
    
    inline def setDeauthenticateUndefined: Self = StObject.set(x, "deauthenticate", js.undefined)
    
    inline def setGetAuthType(value: () => String): Self = StObject.set(x, "getAuthType", js.Any.fromFunction0(value))
    
    inline def setRestoreAuthentication(value: () => Boolean): Self = StObject.set(x, "restoreAuthentication", js.Any.fromFunction0(value))
  }
}
