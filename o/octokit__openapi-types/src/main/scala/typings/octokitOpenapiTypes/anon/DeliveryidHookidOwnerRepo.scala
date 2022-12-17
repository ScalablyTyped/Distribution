package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryidHookidOwnerRepo extends StObject {
  
  var delivery_id: Double
  
  /** The unique identifier of the hook. */
  var hook_id: Double
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object DeliveryidHookidOwnerRepo {
  
  inline def apply(delivery_id: Double, hook_id: Double, owner: String, repo: String): DeliveryidHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(delivery_id = delivery_id.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryidHookidOwnerRepo]
  }
  
  extension [Self <: DeliveryidHookidOwnerRepo](x: Self) {
    
    inline def setDelivery_id(value: Double): Self = StObject.set(x, "delivery_id", value.asInstanceOf[js.Any])
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
