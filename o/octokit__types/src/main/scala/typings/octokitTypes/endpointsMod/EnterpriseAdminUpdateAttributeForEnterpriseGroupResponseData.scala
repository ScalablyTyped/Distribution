package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Created
import typings.octokitTypes.anon.Display
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData extends StObject {
  
  var displayName: String = js.native
  
  var externalId: String = js.native
  
  var id: String = js.native
  
  var members: js.Array[Display] = js.native
  
  var meta: Created = js.native
  
  var schemas: js.Array[String] = js.native
}
object EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData {
  
  @scala.inline
  def apply(
    displayName: String,
    externalId: String,
    id: String,
    members: js.Array[Display],
    meta: Created,
    schemas: js.Array[String]
  ): EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseDataMutableBuilder[Self <: EnterpriseAdminUpdateAttributeForEnterpriseGroupResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[Display]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: Display*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
