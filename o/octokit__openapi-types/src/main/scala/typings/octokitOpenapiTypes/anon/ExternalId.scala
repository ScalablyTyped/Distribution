package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalId extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The name of the user, suitable for display to end-users
    * @example Jon Doe
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * @description user emails
    * @example [
    *   {
    *     "value": "someone@example.com",
    *     "primary": true
    *   },
    *   {
    *     "value": "another@example.com",
    *     "primary": false
    *   }
    * ]
    */
  var emails: js.Array[PrimaryType]
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example {
    *   "givenName": "Jane",
    *   "familyName": "User"
    * }
    */
  var name: Formatted
  
  var schemas: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @description Configured by the admin. Could be an email, login, or username
    * @example someone@example.com
    */
  var userName: String
}
object ExternalId {
  
  inline def apply(emails: js.Array[PrimaryType], name: Formatted, userName: String): ExternalId = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalId]
  }
  
  extension [Self <: ExternalId](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmails(value: js.Array[PrimaryType]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: PrimaryType*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setName(value: Formatted): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
