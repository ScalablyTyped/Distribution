package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScimProvisionAndInviteUserEndpoint extends StObject {
  
  /**
    * List of user emails.
    */
  var emails: js.Array[ScimProvisionAndInviteUserParamsEmails]
  
  var name: ScimProvisionAndInviteUserParamsName
  
  @JSName("org")
  var org_ : String
  
  /**
    * The SCIM schema URIs.
    */
  var schemas: js.Array[String]
  
  /**
    * The username for the user.
    */
  var userName: String
}
object ScimProvisionAndInviteUserEndpoint {
  
  inline def apply(
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
  
  extension [Self <: ScimProvisionAndInviteUserEndpoint](x: Self) {
    
    inline def setEmails(value: js.Array[ScimProvisionAndInviteUserParamsEmails]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: ScimProvisionAndInviteUserParamsEmails*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    inline def setName(value: ScimProvisionAndInviteUserParamsName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
