package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryidHookidOwnerRepo extends StObject {
  
  var delivery_id: Double
  
  var hook_id: Double
  
  var owner: String
  
  var repo: String
}
object DeliveryidHookidOwnerRepo {
  
  inline def apply(delivery_id: Double, hook_id: Double, owner: String, repo: String): DeliveryidHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(delivery_id = delivery_id.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryidHookidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryidHookidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setDelivery_id(value: Double): Self = StObject.set(x, "delivery_id", value.asInstanceOf[js.Any])
    
    inline def setHook_id(value: Double): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
