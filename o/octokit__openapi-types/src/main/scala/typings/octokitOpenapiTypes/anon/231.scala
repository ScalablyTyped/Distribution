package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231` extends StObject {
  
  var delivery_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
}
object `231` {
  
  inline def apply(
    delivery_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
  ): `231` = {
    val __obj = js.Dynamic.literal(delivery_id = delivery_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`231`]
  }
  
  extension [Self <: `231`](x: Self) {
    
    inline def setDelivery_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['delivery-id'] */ js.Any
    ): Self = StObject.set(x, "delivery_id", value.asInstanceOf[js.Any])
  }
}
