package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint extends StObject {
  
  /**
    * List of user emails.
    */
  var emails: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsEmails] = js.native
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
  
  /**
    * List of SCIM group IDs the user is a member of.
    */
  var groups: js.UndefOr[js.Array[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups]] = js.native
  
  var name: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName = js.native
  
  /**
    * The SCIM schema URIs.
    */
  var schemas: js.Array[String] = js.native
  
  /**
    * The username for the user.
    */
  var userName: String = js.native
}
object EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint {
  
  @scala.inline
  def apply(
    emails: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsEmails],
    enterprise: String,
    name: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName,
    schemas: js.Array[String],
    userName: String
  ): EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseUserEndpointMutableBuilder[Self <: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmails(value: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsEmails]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsEmails*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setName(value: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
