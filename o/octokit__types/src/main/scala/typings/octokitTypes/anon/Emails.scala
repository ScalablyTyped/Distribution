package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emails extends StObject {
  
  var active: Boolean
  
  var emails: js.Array[Type]
  
  var externalId: String
  
  var id: String
  
  var meta: Created
  
  var name: FamilyName
  
  var schemas: js.Array[String]
  
  var userName: String
}
object Emails {
  
  @scala.inline
  def apply(
    active: Boolean,
    emails: js.Array[Type],
    externalId: String,
    id: String,
    meta: Created,
    name: FamilyName,
    schemas: js.Array[String],
    userName: String
  ): Emails = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emails]
  }
  
  @scala.inline
  implicit class EmailsMutableBuilder[Self <: Emails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmails(value: js.Array[Type]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: Type*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FamilyName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
