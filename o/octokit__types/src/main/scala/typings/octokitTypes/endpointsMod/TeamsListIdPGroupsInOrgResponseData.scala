package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsListIdPGroupsInOrgResponseData extends StObject {
  
  var groups: js.Array[Groupdescription]
}
object TeamsListIdPGroupsInOrgResponseData {
  
  inline def apply(groups: js.Array[Groupdescription]): TeamsListIdPGroupsInOrgResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsInOrgResponseData]
  }
  
  extension [Self <: TeamsListIdPGroupsInOrgResponseData](x: Self) {
    
    inline def setGroups(value: js.Array[Groupdescription]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Groupdescription*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
