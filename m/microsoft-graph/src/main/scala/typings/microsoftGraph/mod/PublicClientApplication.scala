package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicClientApplication extends StObject {
  
  /**
    * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and
    * access tokens are sent.
    */
  var redirectUris: js.UndefOr[js.Array[String]] = js.undefined
}
object PublicClientApplication {
  
  @scala.inline
  def apply(): PublicClientApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicClientApplication]
  }
  
  @scala.inline
  implicit class PublicClientApplicationMutableBuilder[Self <: PublicClientApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirectUris(value: js.Array[String]): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrisUndefined: Self = StObject.set(x, "redirectUris", js.undefined)
    
    @scala.inline
    def setRedirectUrisVarargs(value: String*): Self = StObject.set(x, "redirectUris", js.Array(value :_*))
  }
}
