package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Created
import typings.octokitTypes.anon.FamilyName
import typings.octokitTypes.anon.Primary
import typings.octokitTypes.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData extends StObject {
  
  var active: Boolean = js.native
  
  var emails: js.Array[Primary] = js.native
  
  var externalId: String = js.native
  
  var groups: js.Array[Value] = js.native
  
  var id: String = js.native
  
  var meta: Created = js.native
  
  var name: FamilyName = js.native
  
  var schemas: js.Array[String] = js.native
  
  var userName: String = js.native
}
object EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData {
  
  @scala.inline
  def apply(
    active: Boolean,
    emails: js.Array[Primary],
    externalId: String,
    groups: js.Array[Value],
    id: String,
    meta: Created,
    name: FamilyName,
    schemas: js.Array[String],
    userName: String
  ): EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseDataMutableBuilder[Self <: EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmails(value: js.Array[Primary]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: Primary*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[Value]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Value*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
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
