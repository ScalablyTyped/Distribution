package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsGetMembershipForUserInOrgResponseData extends StObject {
  
  var role: String
  
  var state: String
  
  var url: String
}
object TeamsGetMembershipForUserInOrgResponseData {
  
  @scala.inline
  def apply(role: String, state: String, url: String): TeamsGetMembershipForUserInOrgResponseData = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMembershipForUserInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsGetMembershipForUserInOrgResponseDataMutableBuilder[Self <: TeamsGetMembershipForUserInOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
