package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposPingWebhookEndpoint extends StObject {
  
  var hook_id: Double
  
  var owner: String
  
  var repo: String
}
object ReposPingWebhookEndpoint {
  
  inline def apply(hook_id: Double, owner: String, repo: String): ReposPingWebhookEndpoint = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposPingWebhookEndpoint]
  }
  
  extension [Self <: ReposPingWebhookEndpoint](x: Self) {
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
