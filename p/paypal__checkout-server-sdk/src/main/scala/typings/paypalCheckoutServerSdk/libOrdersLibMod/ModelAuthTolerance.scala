package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.Money
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelAuthTolerance extends StObject {
  
  var absolute: Money
  
  var percent: String
}
object ModelAuthTolerance {
  
  inline def apply(absolute: Money, percent: String): ModelAuthTolerance = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelAuthTolerance]
  }
  
  extension [Self <: ModelAuthTolerance](x: Self) {
    
    inline def setAbsolute(value: Money): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
