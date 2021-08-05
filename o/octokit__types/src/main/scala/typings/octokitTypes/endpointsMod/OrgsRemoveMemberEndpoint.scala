package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsRemoveMemberEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var username: String
}
object OrgsRemoveMemberEndpoint {
  
  inline def apply(org_ : String, username: String): OrgsRemoveMemberEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveMemberEndpoint]
  }
  
  extension [Self <: OrgsRemoveMemberEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
