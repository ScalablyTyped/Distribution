package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicyConfigurationDefault
  extends StObject
     with Entity {
  
  /**
    * Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B
    * collaboration.
    */
  var b2bCollaborationInbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  /**
    * Defines your default configuration for users in your organization going outbound to access resources in another
    * organization via Azure AD B2B collaboration.
    */
  var b2bCollaborationOutbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  /**
    * Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct
    * connect.
    */
  var b2bDirectConnectInbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  /**
    * Defines your default configuration for users in your organization going outbound to access resources in another
    * organization via Azure AD B2B direct connect.
    */
  var b2bDirectConnectOutbound: js.UndefOr[NullableOption[CrossTenantAccessPolicyB2BSetting]] = js.undefined
  
  // Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations.
  var inboundTrust: js.UndefOr[NullableOption[CrossTenantAccessPolicyInboundTrust]] = js.undefined
  
  /**
    * If true, the default configuration is set to the system default configuration. If false, the default settings have been
    * customized.
    */
  var isServiceDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object CrossTenantAccessPolicyConfigurationDefault {
  
  inline def apply(): CrossTenantAccessPolicyConfigurationDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicyConfigurationDefault]
  }
  
  extension [Self <: CrossTenantAccessPolicyConfigurationDefault](x: Self) {
    
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
    
    inline def setInboundTrust(value: NullableOption[CrossTenantAccessPolicyInboundTrust]): Self = StObject.set(x, "inboundTrust", value.asInstanceOf[js.Any])
    
    inline def setInboundTrustNull: Self = StObject.set(x, "inboundTrust", null)
    
    inline def setInboundTrustUndefined: Self = StObject.set(x, "inboundTrust", js.undefined)
    
    inline def setIsServiceDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isServiceDefault", value.asInstanceOf[js.Any])
    
    inline def setIsServiceDefaultNull: Self = StObject.set(x, "isServiceDefault", null)
    
    inline def setIsServiceDefaultUndefined: Self = StObject.set(x, "isServiceDefault", js.undefined)
  }
}
