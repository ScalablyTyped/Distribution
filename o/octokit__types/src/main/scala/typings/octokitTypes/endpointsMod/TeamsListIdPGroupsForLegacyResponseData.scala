package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsListIdPGroupsForLegacyResponseData extends StObject {
  
  var groups: js.Array[Groupdescription] = js.native
}
object TeamsListIdPGroupsForLegacyResponseData {
  
  @scala.inline
  def apply(groups: js.Array[Groupdescription]): TeamsListIdPGroupsForLegacyResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListIdPGroupsForLegacyResponseData]
  }
  
  @scala.inline
  implicit class TeamsListIdPGroupsForLegacyResponseDataMutableBuilder[Self <: TeamsListIdPGroupsForLegacyResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[Groupdescription]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Groupdescription*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
