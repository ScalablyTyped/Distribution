package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScimProvisionAndInviteUserEndpoint extends js.Object {
  
  /**
    * List of user emails.
    */
  var emails: js.Array[ScimProvisionAndInviteUserParamsEmails] = js.native
  
  var name: ScimProvisionAndInviteUserParamsName = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * The SCIM schema URIs.
    */
  var schemas: js.Array[String] = js.native
  
  /**
    * The username for the user.
    */
  var userName: String = js.native
}
object ScimProvisionAndInviteUserEndpoint {
  
  @scala.inline
  def apply(
    emails: js.Array[ScimProvisionAndInviteUserParamsEmails],
    name: ScimProvisionAndInviteUserParamsName,
    org_ : String,
    schemas: js.Array[String],
    userName: String
  ): ScimProvisionAndInviteUserEndpoint = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimProvisionAndInviteUserEndpoint]
  }
  
  @scala.inline
  implicit class ScimProvisionAndInviteUserEndpointOps[Self <: ScimProvisionAndInviteUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setEmailsVarargs(value: ScimProvisionAndInviteUserParamsEmails*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[ScimProvisionAndInviteUserParamsEmails]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ScimProvisionAndInviteUserParamsName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
}
