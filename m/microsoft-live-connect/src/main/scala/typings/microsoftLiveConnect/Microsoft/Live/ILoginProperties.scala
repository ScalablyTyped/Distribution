package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.login method.
  */
trait ILoginProperties extends StObject {
  
  /**
    * This parameter only applies to web apps.
    * Contains the redirect URI to be used for OAuth authentication. This
    * value overrides the default redirect URI that is provided in the call
    * to WL.init.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the scopes to which the user who is signing in consents.
    *
    * For a single scope, use this format: scope: "wl.signin". For multiple
    * scopes, use this format: scope: ["wl.signin", "wl.basic"].
    *
    * If no scope is provided, the scope value of WL.init is used. If no
    * scope is provided in WL.init or WL.login, WL.login returns an error.
    *
    * Note  WL.login can request the "wl.offline_access" scope, but it
    * requires a server-side implementation, and the WL.init function must
    * set its response_type property to "code". For more info, see
    * Server-side scenarios.
    * http://msdn.microsoft.com/en-us/library/live/hh243649.aspx
    */
  var scope: Any
  
  /**
    * Windows Store apps using JavaScript: not applicable.
    * Web apps: Optional. If the WL.init function's response_type object is
    * set to "code" and the app uses server-flow authentication, the state
    * object here can be used to track the web app's calling state on the
    * web app server side. For more info, see the description of the state
    * query parameter in the Server-side scenarios topic's "Getting an
    * authorization code" section.
    * http://msdn.microsoft.com/en-us/library/live/hh243649.aspx
    */
  var state: js.UndefOr[String] = js.undefined
}
object ILoginProperties {
  
  inline def apply(scope: Any): ILoginProperties = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoginProperties] (val x: Self) extends AnyVal {
    
    inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
