package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityApiConnector
  extends StObject
     with Entity {
  
  /**
    * The object which describes the authentication configuration details for calling the API. Basic and PKCS 12 client
    * certificate are supported.
    */
  var authenticationConfiguration: js.UndefOr[NullableOption[ApiAuthenticationConfigurationBase]] = js.undefined
  
  // The name of the API connector.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL of the API endpoint to call.
  var targetUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object IdentityApiConnector {
  
  inline def apply(): IdentityApiConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityApiConnector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityApiConnector] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationConfiguration(value: NullableOption[ApiAuthenticationConfigurationBase]): Self = StObject.set(x, "authenticationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationConfigurationNull: Self = StObject.set(x, "authenticationConfiguration", null)
    
    inline def setAuthenticationConfigurationUndefined: Self = StObject.set(x, "authenticationConfiguration", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTargetUrl(value: NullableOption[String]): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
    
    inline def setTargetUrlNull: Self = StObject.set(x, "targetUrl", null)
    
    inline def setTargetUrlUndefined: Self = StObject.set(x, "targetUrl", js.undefined)
  }
}
