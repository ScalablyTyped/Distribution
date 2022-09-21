package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emails extends StObject {
  
  /** @description List of user emails. */
  var emails: js.Array[Primary]
  
  /** @description List of SCIM group IDs the user is a member of. */
  var groups: js.UndefOr[js.Array[`354`]] = js.undefined
  
  var name: FamilyName
  
  /** @description The SCIM schema URIs. */
  var schemas: js.Array[String]
  
  /** @description The username for the user. */
  var userName: String
}
object Emails {
  
  inline def apply(emails: js.Array[Primary], name: FamilyName, schemas: js.Array[String], userName: String): Emails = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emails]
  }
  
  extension [Self <: Emails](x: Self) {
    
    inline def setEmails(value: js.Array[Primary]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: Primary*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setGroups(value: js.Array[`354`]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: `354`*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
