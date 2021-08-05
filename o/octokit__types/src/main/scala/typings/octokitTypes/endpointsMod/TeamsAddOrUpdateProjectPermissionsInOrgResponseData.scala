package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddOrUpdateProjectPermissionsInOrgResponseData extends StObject {
  
  var documentation_url: String
  
  var message: String
}
object TeamsAddOrUpdateProjectPermissionsInOrgResponseData {
  
  inline def apply(documentation_url: String, message: String): TeamsAddOrUpdateProjectPermissionsInOrgResponseData = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
  }
  
  extension [Self <: TeamsAddOrUpdateProjectPermissionsInOrgResponseData](x: Self) {
    
    inline def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
