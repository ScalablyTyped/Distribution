package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaApplication extends StObject {
  
  /**
    * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and
    * access tokens are sent.
    */
  var redirectUris: js.UndefOr[js.Array[String]] = js.undefined
}
object SpaApplication {
  
  inline def apply(): SpaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaApplication]
  }
  
  extension [Self <: SpaApplication](x: Self) {
    
    inline def setRedirectUris(value: js.Array[String]): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrisUndefined: Self = StObject.set(x, "redirectUris", js.undefined)
    
    inline def setRedirectUrisVarargs(value: String*): Self = StObject.set(x, "redirectUris", js.Array(value*))
  }
}
