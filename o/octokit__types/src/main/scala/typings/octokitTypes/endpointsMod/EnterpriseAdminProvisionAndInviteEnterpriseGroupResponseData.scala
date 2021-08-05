package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Created
import typings.octokitTypes.anon.Display
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData extends StObject {
  
  var displayName: String
  
  var externalId: String
  
  var id: String
  
  var members: js.Array[Display]
  
  var meta: Created
  
  var schemas: js.Array[String]
}
object EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData {
  
  inline def apply(
    displayName: String,
    externalId: String,
    id: String,
    members: js.Array[Display],
    meta: Created,
    schemas: js.Array[String]
  ): EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]
  }
  
  extension [Self <: EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[Display]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: Display*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: js.Array[String]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: String*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
