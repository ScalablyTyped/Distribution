package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MtlsEndpointAliases extends StObject {
  
  var device_authorization_endpoint: js.UndefOr[String] = js.native
  
  var introspection_endpoint: js.UndefOr[String] = js.native
  
  var revocation_endpoint: js.UndefOr[String] = js.native
  
  var token_endpoint: js.UndefOr[String] = js.native
  
  var userinfo_endpoint: js.UndefOr[String] = js.native
}
object MtlsEndpointAliases {
  
  @scala.inline
  def apply(): MtlsEndpointAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MtlsEndpointAliases]
  }
  
  @scala.inline
  implicit class MtlsEndpointAliasesMutableBuilder[Self <: MtlsEndpointAliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice_authorization_endpoint(value: String): Self = StObject.set(x, "device_authorization_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_authorization_endpointUndefined: Self = StObject.set(x, "device_authorization_endpoint", js.undefined)
    
    @scala.inline
    def setIntrospection_endpoint(value: String): Self = StObject.set(x, "introspection_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntrospection_endpointUndefined: Self = StObject.set(x, "introspection_endpoint", js.undefined)
    
    @scala.inline
    def setRevocation_endpoint(value: String): Self = StObject.set(x, "revocation_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocation_endpointUndefined: Self = StObject.set(x, "revocation_endpoint", js.undefined)
    
    @scala.inline
    def setToken_endpoint(value: String): Self = StObject.set(x, "token_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_endpointUndefined: Self = StObject.set(x, "token_endpoint", js.undefined)
    
    @scala.inline
    def setUserinfo_endpoint(value: String): Self = StObject.set(x, "userinfo_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserinfo_endpointUndefined: Self = StObject.set(x, "userinfo_endpoint", js.undefined)
  }
}
