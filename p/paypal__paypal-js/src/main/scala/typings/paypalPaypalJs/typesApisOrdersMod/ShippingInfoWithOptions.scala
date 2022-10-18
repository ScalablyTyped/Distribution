package typings.paypalPaypalJs.typesApisOrdersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingInfoWithOptions
  extends StObject
     with ShippingInfoBase
     with ShippingInfo {
  
  var options: js.Array[ShippingInfoOption]
  
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}
object ShippingInfoWithOptions {
  
  inline def apply(options: js.Array[ShippingInfoOption]): ShippingInfoWithOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingInfoWithOptions]
  }
  
  extension [Self <: ShippingInfoWithOptions](x: Self) {
    
    inline def setOptions(value: js.Array[ShippingInfoOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: ShippingInfoOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
