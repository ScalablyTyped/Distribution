package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackchannelLogout extends StObject {
  
  var backchannelLogout: js.UndefOr[Enabled] = js.undefined
  
  var ciba: js.UndefOr[DeliveryModes] = js.undefined
  
  var claimsParameter: js.UndefOr[Enabled] = js.undefined
  
  var clientCredentials: js.UndefOr[Enabled] = js.undefined
  
  var dPoP: js.UndefOr[Ack] = js.undefined
  
  var devInteractions: js.UndefOr[Enabled] = js.undefined
  
  var deviceFlow: js.UndefOr[Charset] = js.undefined
  
  var encryption: js.UndefOr[Enabled] = js.undefined
  
  var fapi: js.UndefOr[Profile] = js.undefined
  
  var introspection: js.UndefOr[AllowedPolicy] = js.undefined
  
  var jwtIntrospection: js.UndefOr[AckEnabled] = js.undefined
  
  var jwtResponseModes: js.UndefOr[AckEnabled] = js.undefined
  
  var jwtUserinfo: js.UndefOr[Enabled] = js.undefined
  
  var mTLS: js.UndefOr[CertificateAuthorized] = js.undefined
  
  var pushedAuthorizationRequests: js.UndefOr[RequirePushedAuthorizationRequests] = js.undefined
  
  var registration: js.UndefOr[IdFactory] = js.undefined
  
  var registrationManagement: js.UndefOr[IssueRegistrationAccessToken] = js.undefined
  
  var requestObjects: js.UndefOr[Mode] = js.undefined
  
  var resourceIndicators: js.UndefOr[DefaultResource] = js.undefined
  
  var revocation: js.UndefOr[Enabled] = js.undefined
  
  var rpInitiatedLogout: js.UndefOr[LogoutSource] = js.undefined
  
  var userinfo: js.UndefOr[Enabled] = js.undefined
  
  var webMessageResponseMode: js.UndefOr[AckEnabled] = js.undefined
}
object BackchannelLogout {
  
  inline def apply(): BackchannelLogout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackchannelLogout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackchannelLogout] (val x: Self) extends AnyVal {
    
    inline def setBackchannelLogout(value: Enabled): Self = StObject.set(x, "backchannelLogout", value.asInstanceOf[js.Any])
    
    inline def setBackchannelLogoutUndefined: Self = StObject.set(x, "backchannelLogout", js.undefined)
    
    inline def setCiba(value: DeliveryModes): Self = StObject.set(x, "ciba", value.asInstanceOf[js.Any])
    
    inline def setCibaUndefined: Self = StObject.set(x, "ciba", js.undefined)
    
    inline def setClaimsParameter(value: Enabled): Self = StObject.set(x, "claimsParameter", value.asInstanceOf[js.Any])
    
    inline def setClaimsParameterUndefined: Self = StObject.set(x, "claimsParameter", js.undefined)
    
    inline def setClientCredentials(value: Enabled): Self = StObject.set(x, "clientCredentials", value.asInstanceOf[js.Any])
    
    inline def setClientCredentialsUndefined: Self = StObject.set(x, "clientCredentials", js.undefined)
    
    inline def setDPoP(value: Ack): Self = StObject.set(x, "dPoP", value.asInstanceOf[js.Any])
    
    inline def setDPoPUndefined: Self = StObject.set(x, "dPoP", js.undefined)
    
    inline def setDevInteractions(value: Enabled): Self = StObject.set(x, "devInteractions", value.asInstanceOf[js.Any])
    
    inline def setDevInteractionsUndefined: Self = StObject.set(x, "devInteractions", js.undefined)
    
    inline def setDeviceFlow(value: Charset): Self = StObject.set(x, "deviceFlow", value.asInstanceOf[js.Any])
    
    inline def setDeviceFlowUndefined: Self = StObject.set(x, "deviceFlow", js.undefined)
    
    inline def setEncryption(value: Enabled): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setFapi(value: Profile): Self = StObject.set(x, "fapi", value.asInstanceOf[js.Any])
    
    inline def setFapiUndefined: Self = StObject.set(x, "fapi", js.undefined)
    
    inline def setIntrospection(value: AllowedPolicy): Self = StObject.set(x, "introspection", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionUndefined: Self = StObject.set(x, "introspection", js.undefined)
    
    inline def setJwtIntrospection(value: AckEnabled): Self = StObject.set(x, "jwtIntrospection", value.asInstanceOf[js.Any])
    
    inline def setJwtIntrospectionUndefined: Self = StObject.set(x, "jwtIntrospection", js.undefined)
    
    inline def setJwtResponseModes(value: AckEnabled): Self = StObject.set(x, "jwtResponseModes", value.asInstanceOf[js.Any])
    
    inline def setJwtResponseModesUndefined: Self = StObject.set(x, "jwtResponseModes", js.undefined)
    
    inline def setJwtUserinfo(value: Enabled): Self = StObject.set(x, "jwtUserinfo", value.asInstanceOf[js.Any])
    
    inline def setJwtUserinfoUndefined: Self = StObject.set(x, "jwtUserinfo", js.undefined)
    
    inline def setMTLS(value: CertificateAuthorized): Self = StObject.set(x, "mTLS", value.asInstanceOf[js.Any])
    
    inline def setMTLSUndefined: Self = StObject.set(x, "mTLS", js.undefined)
    
    inline def setPushedAuthorizationRequests(value: RequirePushedAuthorizationRequests): Self = StObject.set(x, "pushedAuthorizationRequests", value.asInstanceOf[js.Any])
    
    inline def setPushedAuthorizationRequestsUndefined: Self = StObject.set(x, "pushedAuthorizationRequests", js.undefined)
    
    inline def setRegistration(value: IdFactory): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationManagement(value: IssueRegistrationAccessToken): Self = StObject.set(x, "registrationManagement", value.asInstanceOf[js.Any])
    
    inline def setRegistrationManagementUndefined: Self = StObject.set(x, "registrationManagement", js.undefined)
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setRequestObjects(value: Mode): Self = StObject.set(x, "requestObjects", value.asInstanceOf[js.Any])
    
    inline def setRequestObjectsUndefined: Self = StObject.set(x, "requestObjects", js.undefined)
    
    inline def setResourceIndicators(value: DefaultResource): Self = StObject.set(x, "resourceIndicators", value.asInstanceOf[js.Any])
    
    inline def setResourceIndicatorsUndefined: Self = StObject.set(x, "resourceIndicators", js.undefined)
    
    inline def setRevocation(value: Enabled): Self = StObject.set(x, "revocation", value.asInstanceOf[js.Any])
    
    inline def setRevocationUndefined: Self = StObject.set(x, "revocation", js.undefined)
    
    inline def setRpInitiatedLogout(value: LogoutSource): Self = StObject.set(x, "rpInitiatedLogout", value.asInstanceOf[js.Any])
    
    inline def setRpInitiatedLogoutUndefined: Self = StObject.set(x, "rpInitiatedLogout", js.undefined)
    
    inline def setUserinfo(value: Enabled): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
    
    inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
    
    inline def setWebMessageResponseMode(value: AckEnabled): Self = StObject.set(x, "webMessageResponseMode", value.asInstanceOf[js.Any])
    
    inline def setWebMessageResponseModeUndefined: Self = StObject.set(x, "webMessageResponseMode", js.undefined)
  }
}
