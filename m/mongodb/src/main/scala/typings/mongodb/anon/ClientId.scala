package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientId extends StObject {
  
  /** The client ID to authenticate a registered application */
  var clientId: String
  
  /** The client secret to authenticate a registered application */
  var clientSecret: String
  
  /**
    * If present, a host with optional port. E.g. "example.com" or "example.com:443".
    * This is optional, and only needed if customer is using a non-commercial Azure instance
    * (e.g. a government or China account, which use different URLs).
    * Defaults to "login.microsoftonline.com"
    */
  var identityPlatformEndpoint: js.UndefOr[String] = js.undefined
  
  /** The tenant ID identifies the organization for the account */
  var tenantId: String
}
object ClientId {
  
  inline def apply(clientId: String, clientSecret: String, tenantId: String): ClientId = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientId] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setIdentityPlatformEndpoint(value: String): Self = StObject.set(x, "identityPlatformEndpoint", value.asInstanceOf[js.Any])
    
    inline def setIdentityPlatformEndpointUndefined: Self = StObject.set(x, "identityPlatformEndpoint", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
  }
}
