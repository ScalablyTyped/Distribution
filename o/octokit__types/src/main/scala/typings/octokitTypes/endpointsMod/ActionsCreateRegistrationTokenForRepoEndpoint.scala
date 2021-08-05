package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateRegistrationTokenForRepoEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
}
object ActionsCreateRegistrationTokenForRepoEndpoint {
  
  inline def apply(owner: String, repo: String): ActionsCreateRegistrationTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRegistrationTokenForRepoEndpoint]
  }
  
  extension [Self <: ActionsCreateRegistrationTokenForRepoEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
