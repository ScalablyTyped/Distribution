package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint extends js.Object {
  
  /**
    * The name of the SCIM group. This must match the GitHub organization that the group maps to.
    */
  var displayName: String = js.native
  
  /**
    * The slug version of the enterprise name. You can also substitute this value with the enterprise id.
    */
  var enterprise: String = js.native
  
  var members: js.UndefOr[js.Array[EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers]] = js.native
  
  /**
    * The SCIM schema URIs.
    */
  var schemas: js.Array[String] = js.native
}
object EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint {
  
  @scala.inline
  def apply(displayName: String, enterprise: String, schemas: js.Array[String]): EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint]
  }
  
  @scala.inline
  implicit class EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpointOps[Self <: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterprise(value: String): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[EnterpriseAdminProvisionAndInviteEnterpriseGroupParamsMembers]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
  }
}
