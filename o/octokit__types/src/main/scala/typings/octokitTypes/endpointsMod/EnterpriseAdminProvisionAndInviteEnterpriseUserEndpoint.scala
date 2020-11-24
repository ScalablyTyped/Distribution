package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint extends js.Object {
  
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
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseUserEndpointOps[Self <: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmailsVarargs(value: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsEmails*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsEmails]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterprise(value: String): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseUserParamsGroups]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
  }
}
