package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion API Properties Interfaces
/**
  * Represents the user's session.
  */
@js.native
trait ISession extends StObject {
  
  /**
    * The user's access token.
    */
  var access_token: String = js.native
  
  /**
    * The authentication token.
    */
  var authentication_token: String = js.native
  
  /**
    * The exact time when the session will expire. This time is expressed
    * in the number of seconds since 1 January, 1970.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var expires: js.UndefOr[Double] = js.native
  
  /**
    * The amount of time remaining, in seconds, until the user's access
    * token expires.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var expires_in: js.UndefOr[Double] = js.native
  
  /**
    * A list of scopes that the app has requested and that the user has
    * consented to.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var scope: js.UndefOr[js.Array[String]] = js.native
}
object ISession {
  
  @scala.inline
  def apply(access_token: String, authentication_token: String): ISession = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], authentication_token = authentication_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
  
  @scala.inline
  implicit class ISessionMutableBuilder[Self <: ISession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthentication_token(value: String): Self = StObject.set(x, "authentication_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
