package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveEmails extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var emails: js.UndefOr[js.Array[PrimaryTypeValue]] = js.undefined
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var groups: js.UndefOr[js.Array[`354`]] = js.undefined
  
  var id: String
  
  var meta: js.UndefOr[Created] = js.undefined
  
  var name: js.UndefOr[FamilyNameGivenName] = js.undefined
  
  var schemas: js.Array[String]
  
  var userName: js.UndefOr[String] = js.undefined
}
object ActiveEmails {
  
  inline def apply(id: String, schemas: js.Array[String]): ActiveEmails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveEmails]
  }
  
  extension [Self <: ActiveEmails](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEmails(value: js.Array[PrimaryTypeValue]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: PrimaryTypeValue*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setGroups(value: js.Array[`354`]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: `354`*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: FamilyNameGivenName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
