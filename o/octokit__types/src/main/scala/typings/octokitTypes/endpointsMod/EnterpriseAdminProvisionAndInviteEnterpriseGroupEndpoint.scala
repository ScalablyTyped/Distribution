package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint extends StObject {
  
  /**
    * The name of the SCIM group. This must match the GitHub organization that the group maps to.
    */
  var displayName: String
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String
  
  var members: js.UndefOr[js.Array[EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers]] = js.undefined
  
  /**
    * The SCIM schema URIs.
    */
  var schemas: js.Array[String]
}
object EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint {
  
  @scala.inline
  def apply(displayName: String, enterprise: String, schemas: js.Array[String]): EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpointMutableBuilder[Self <: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
