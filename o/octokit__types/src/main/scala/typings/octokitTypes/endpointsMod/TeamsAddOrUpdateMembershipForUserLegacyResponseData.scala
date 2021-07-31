package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddOrUpdateMembershipForUserLegacyResponseData extends StObject {
  
  var role: String
  
  var state: String
  
  var url: String
}
object TeamsAddOrUpdateMembershipForUserLegacyResponseData {
  
  @scala.inline
  def apply(role: String, state: String, url: String): TeamsAddOrUpdateMembershipForUserLegacyResponseData = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserLegacyResponseData]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipForUserLegacyResponseDataMutableBuilder[Self <: TeamsAddOrUpdateMembershipForUserLegacyResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
