package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryidHookid extends StObject {
  
  var delivery_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
  
  var hook_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['hook-id'] */ js.Any
  
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
}
object DeliveryidHookid {
  
  inline def apply(
    delivery_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any,
    hook_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['hook-id'] */ js.Any,
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  ): DeliveryidHookid = {
    val __obj = js.Dynamic.literal(delivery_id = delivery_id.asInstanceOf[js.Any], hook_id = hook_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryidHookid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryidHookid] (val x: Self) extends AnyVal {
    
    inline def setDelivery_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
    ): Self = StObject.set(x, "delivery_id", value.asInstanceOf[js.Any])
    
    inline def setHook_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['hook-id'] */ js.Any
    ): Self = StObject.set(x, "hook_id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
