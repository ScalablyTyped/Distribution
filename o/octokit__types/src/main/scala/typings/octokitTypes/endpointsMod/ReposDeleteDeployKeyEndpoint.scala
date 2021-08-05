package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteDeployKeyEndpoint extends StObject {
  
  var key_id: Double
  
  var owner: String
  
  var repo: String
}
object ReposDeleteDeployKeyEndpoint {
  
  inline def apply(key_id: Double, owner: String, repo: String): ReposDeleteDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteDeployKeyEndpoint]
  }
  
  extension [Self <: ReposDeleteDeployKeyEndpoint](x: Self) {
    
    inline def setKey_id(value: Double): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
