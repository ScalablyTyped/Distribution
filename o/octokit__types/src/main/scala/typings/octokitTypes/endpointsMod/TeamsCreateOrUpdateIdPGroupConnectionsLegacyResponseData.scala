package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Groupdescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData extends StObject {
  
  var groups: js.Array[Groupdescription] = js.native
}
object TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData {
  
  @scala.inline
  def apply(groups: js.Array[Groupdescription]): TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
  }
  
  @scala.inline
  implicit class TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseDataMutableBuilder[Self <: TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[Groupdescription]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Groupdescription*): Self = StObject.set(x, "groups", js.Array(value :_*))
  }
}
