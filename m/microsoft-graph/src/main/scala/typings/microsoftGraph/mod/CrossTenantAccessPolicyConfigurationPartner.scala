package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicyConfigurationPartner extends StObject {
  
  var automaticUserConsentSettings: js.UndefOr[NullableOption[InboundOutboundPolicyConfiguration]] = js.undefined
  
  /**
    * Defines your partner-specific configuration for users from other organizations accessing your resources via Azure AD
    * B2B collaboration.
    */
  var b2bCollaborationInbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  /**
    * Defines your partner-specific configuration for users in your organization going outbound to access resources in
    * another organization via Azure AD B2B collaboration.
    */
  var b2bCollaborationOutbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  /**
    * Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B
    * direct connect.
    */
  var b2bDirectConnectInbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  /**
    * Defines your partner-specific configuration for users in your organization going outbound to access resources in
    * another organization via Azure AD B2B direct connect.
    */
  var b2bDirectConnectOutbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  var identitySynchronization: js.UndefOr[NullableOption[CrossTenantIdentitySyncPolicyPartner]] = js.undefined
  
  /**
    * Determines the partner-specific configuration for trusting other Conditional Access claims from external Azure AD
    * organizations.
    */
  var inboundTrust: js.UndefOr[NullableOption[CrossTenantAccessPolicyInboundTrust]] = js.undefined
  
  // Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization.
  var isServiceProvider: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The tenant identifier for the partner Azure AD organization. Read-only. Key.
  var tenantId: js.UndefOr[String] = js.undefined
}
object CrossTenantAccessPolicyConfigurationPartner {
  
  inline def apply(): CrossTenantAccessPolicyConfigurationPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicyConfigurationPartner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossTenantAccessPolicyConfigurationPartner] (val x: Self) extends AnyVal {
    
    inline def setAutomaticUserConsentSettings(value: NullableOption[InboundOutboundPolicyConfiguration]): Self = StObject.set(x, "automaticUserConsentSettings", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUserConsentSettingsNull: Self = StObject.set(x, "automaticUserConsentSettings", null)
    
    inline def setAutomaticUserConsentSettingsUndefined: Self = StObject.set(x, "automaticUserConsentSettings", js.undefined)
    
    inline def setB2bCollaborationInbound(value: NullableOption[CrossTenantAccessPolicyB2BSetting]): Self = StObject.set(x, "b2bCollaborationInbound", value.asInstanceOf[js.Any])
    
    inline def setB2bCollaborationInboundNull: Self = StObject.set(x, "b2bCollaborationInbound", null)
    
    inline def setB2bCollaborationInboundUndefined: Self = StObject.set(x, "b2bCollaborationInbound", js.undefined)
    
    inline def setB2bCollaborationOutbound(value: NullableOption[CrossTenantAccessPolicyB2BSetting]): Self = StObject.set(x, "b2bCollaborationOutbound", value.asInstanceOf[js.Any])
    
    inline def setB2bCollaborationOutboundNull: Self = StObject.set(x, "b2bCollaborationOutbound", null)
    
    inline def setB2bCollaborationOutboundUndefined: Self = StObject.set(x, "b2bCollaborationOutbound", js.undefined)
    
    inline def setB2bDirectConnectInbound(value: NullableOption[CrossTenantAccessPolicyB2BSetting]): Self = StObject.set(x, "b2bDirectConnectInbound", value.asInstanceOf[js.Any])
    
    inline def setB2bDirectConnectInboundNull: Self = StObject.set(x, "b2bDirectConnectInbound", null)
    
    inline def setB2bDirectConnectInboundUndefined: Self = StObject.set(x, "b2bDirectConnectInbound", js.undefined)
    
    inline def setB2bDirectConnectOutbound(value: NullableOption[CrossTenantAccessPolicyB2BSetting]): Self = StObject.set(x, "b2bDirectConnectOutbound", value.asInstanceOf[js.Any])
    
    inline def setB2bDirectConnectOutboundNull: Self = StObject.set(x, "b2bDirectConnectOutbound", null)
    
    inline def setB2bDirectConnectOutboundUndefined: Self = StObject.set(x, "b2bDirectConnectOutbound", js.undefined)
    
    inline def setIdentitySynchronization(value: NullableOption[CrossTenantIdentitySyncPolicyPartner]): Self = StObject.set(x, "identitySynchronization", value.asInstanceOf[js.Any])
    
    inline def setIdentitySynchronizationNull: Self = StObject.set(x, "identitySynchronization", null)
    
    inline def setIdentitySynchronizationUndefined: Self = StObject.set(x, "identitySynchronization", js.undefined)
    
    inline def setInboundTrust(value: NullableOption[CrossTenantAccessPolicyInboundTrust]): Self = StObject.set(x, "inboundTrust", value.asInstanceOf[js.Any])
    
    inline def setInboundTrustNull: Self = StObject.set(x, "inboundTrust", null)
    
    inline def setInboundTrustUndefined: Self = StObject.set(x, "inboundTrust", js.undefined)
    
    inline def setIsServiceProvider(value: NullableOption[Boolean]): Self = StObject.set(x, "isServiceProvider", value.asInstanceOf[js.Any])
    
    inline def setIsServiceProviderNull: Self = StObject.set(x, "isServiceProvider", null)
    
    inline def setIsServiceProviderUndefined: Self = StObject.set(x, "isServiceProvider", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
