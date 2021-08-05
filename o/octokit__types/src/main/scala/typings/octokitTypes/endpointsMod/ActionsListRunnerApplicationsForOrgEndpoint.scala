package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListRunnerApplicationsForOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object ActionsListRunnerApplicationsForOrgEndpoint {
  
  inline def apply(org_ : String): ActionsListRunnerApplicationsForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRunnerApplicationsForOrgEndpoint]
  }
  
  extension [Self <: ActionsListRunnerApplicationsForOrgEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
