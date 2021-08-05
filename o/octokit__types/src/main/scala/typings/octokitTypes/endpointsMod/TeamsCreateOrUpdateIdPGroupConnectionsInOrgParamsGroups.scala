package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups extends StObject {
  
  var group_description: String
  
  var group_id: String
  
  var group_name: String
}
object TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups {
  
  inline def apply(group_description: String, group_id: String, group_name: String): TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups = {
    val __obj = js.Dynamic.literal(group_description = group_description.asInstanceOf[js.Any], group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups]
  }
  
  extension [Self <: TeamsCreateOrUpdateIdPGroupConnectionsInOrgParamsGroups](x: Self) {
    
    inline def setGroup_description(value: String): Self = StObject.set(x, "group_description", value.asInstanceOf[js.Any])
    
    inline def setGroup_id(value: String): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
  }
}
