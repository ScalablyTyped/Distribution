package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDisplayName extends StObject {
  
  /**
    * @description The active status of the User.
    * @example true
    */
  var active: Boolean
  
  /**
    * @description The name of the user, suitable for display to end-users
    * @example Jon Doe
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
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
  var emails: js.Array[ValueString]
  
  /**
    * @description The ID of the User.
    * @example a7b0f98395
    */
  var externalId: String | Null
  
  /** @description associated groups */
  var groups: js.UndefOr[js.Array[DisplayValue]] = js.undefined
  
  /**
    * @description Unique identifier of an external identity
    * @example 1b78eada-9baa-11e6-9eb6-a431576d590e
    */
  var id: String
  
  var meta: Created
  
  /**
    * @example {
    *   "givenName": "Jane",
    *   "familyName": "User"
    * }
    */
  var name: FamilyNameFormatted
  
  /**
    * @description Set of operations to be performed
    * @example [
    *   {
    *     "op": "replace",
    *     "value": {
    *       "active": false
    *     }
    *   }
    * ]
    */
  var operations: js.UndefOr[js.Array[PathValue]] = js.undefined
  
  /** @description The ID of the organization. */
  var organization_id: js.UndefOr[Double] = js.undefined
  
  /** @description SCIM schema used. */
  var schemas: js.Array[String]
  
  /**
    * @description Configured by the admin. Could be an email, login, or username
    * @example someone@example.com
    */
  var userName: String | Null
}
object ActiveDisplayName {
  
  inline def apply(
    active: Boolean,
    emails: js.Array[ValueString],
    id: String,
    meta: Created,
    name: FamilyNameFormatted,
    schemas: js.Array[String]
  ): ActiveDisplayName = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], externalId = null, userName = null)
    __obj.asInstanceOf[ActiveDisplayName]
  }
  
  extension [Self <: ActiveDisplayName](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmails(value: js.Array[ValueString]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: ValueString*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setGroups(value: js.Array[DisplayValue]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: DisplayValue*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setName(value: FamilyNameFormatted): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: js.Array[PathValue]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: PathValue*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setOrganization_idUndefined: Self = StObject.set(x, "organization_id", js.undefined)
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameNull: Self = StObject.set(x, "userName", null)
  }
}
