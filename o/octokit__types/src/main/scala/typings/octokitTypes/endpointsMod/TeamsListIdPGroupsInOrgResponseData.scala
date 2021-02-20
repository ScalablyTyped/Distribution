package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsListIdPGroupsInOrgResponseData extends StObject {
  
  var groups: js.Array[Groupdescription] = js.native
}
object TeamsListIdPGroupsInOrgResponseData {
  
  @scala.inline
  def apply(groups: js.Array[Groupdescription]): TeamsListIdPGroupsInOrgResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsListIdPGroupsInOrgResponseDataMutableBuilder[Self <: TeamsListIdPGroupsInOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[Groupdescription]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Groupdescription*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
