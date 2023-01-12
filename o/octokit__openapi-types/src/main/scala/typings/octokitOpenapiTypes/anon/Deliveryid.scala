package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deliveryid extends StObject {
  
  var delivery_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
}
object Deliveryid {
  
  inline def apply(
    delivery_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
  ): Deliveryid = {
    val __obj = js.Dynamic.literal(delivery_id = delivery_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deliveryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deliveryid] (val x: Self) extends AnyVal {
    
    inline def setDelivery_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
    ): Self = StObject.set(x, "delivery_id", value.asInstanceOf[js.Any])
  }
}
