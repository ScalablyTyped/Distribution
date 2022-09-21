package typings.paypalPaypalJs.ordersMod

import typings.paypalPaypalJs.paypalPaypalJsStrings.PICKUP_IN_PERSON
import typings.paypalPaypalJs.paypalPaypalJsStrings.SHIPPING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.paypalPaypalJs.ordersMod.ShippingInfoWithType
  - typings.paypalPaypalJs.ordersMod.ShippingInfoWithOptions
*/
trait ShippingInfo extends StObject
object ShippingInfo {
  
  inline def ShippingInfoWithOptions(options: js.Array[ShippingInfoOption]): typings.paypalPaypalJs.ordersMod.ShippingInfoWithOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.paypalPaypalJs.ordersMod.ShippingInfoWithOptions]
  }
  
  inline def ShippingInfoWithType(`type`: SHIPPING | PICKUP_IN_PERSON): typings.paypalPaypalJs.ordersMod.ShippingInfoWithType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.paypalPaypalJs.ordersMod.ShippingInfoWithType]
  }
}
