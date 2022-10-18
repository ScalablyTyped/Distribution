package typings.paypalPaypalJs.typesApisOrdersMod

import typings.paypalPaypalJs.paypalPaypalJsStrings.PICKUP_IN_PERSON
import typings.paypalPaypalJs.paypalPaypalJsStrings.SHIPPING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.paypalPaypalJs.typesApisOrdersMod.ShippingInfoWithType
  - typings.paypalPaypalJs.typesApisOrdersMod.ShippingInfoWithOptions
*/
trait ShippingInfo extends StObject
object ShippingInfo {
  
  inline def ShippingInfoWithOptions(options: js.Array[ShippingInfoOption]): typings.paypalPaypalJs.typesApisOrdersMod.ShippingInfoWithOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.paypalPaypalJs.typesApisOrdersMod.ShippingInfoWithOptions]
  }
  
  inline def ShippingInfoWithType(`type`: SHIPPING | PICKUP_IN_PERSON): typings.paypalPaypalJs.typesApisOrdersMod.ShippingInfoWithType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.paypalPaypalJs.typesApisOrdersMod.ShippingInfoWithType]
  }
}
