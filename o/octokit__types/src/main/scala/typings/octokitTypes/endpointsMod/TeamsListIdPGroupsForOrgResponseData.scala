package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsListIdPGroupsForOrgResponseData extends StObject {
  
  var groups: js.Array[Groupdescription]
}
object TeamsListIdPGroupsForOrgResponseData {
  
  inline def apply(groups: js.Array[Groupdescription]): TeamsListIdPGroupsForOrgResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsForOrgResponseData]
  }
  
  extension [Self <: TeamsListIdPGroupsForOrgResponseData](x: Self) {
    
    inline def setGroups(value: js.Array[Groupdescription]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Groupdescription*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
